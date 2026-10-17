package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.internal.DynamicRangeResolver;
import androidx.camera.camera2.internal.HighSpeedResolver;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mzb.e;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.p;
import zhm.r0;
import zhm.v;
import zhm.z;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Ñ\u00012\u00020\u0001:\bÎ\u0001Ï\u0001Ð\u0001Ñ\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJV\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001a2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020A0@2\u0012\b\u0002\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bJR\u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020\u001a2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020A0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0002JV\u0010H\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0006\u0010<\u001a\u00020\u001a2\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010\u001b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010<\u001a\u00020\u001aH\u0002J&\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SJ^\u0010T\u001a\u00020U2\u0006\u0010N\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020\u001fJ\u0084\u0001\u0010]\u001a\u00020U2\u0006\u0010^\u001a\u00020_2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010`\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010\\\u001a\u00020\u001fH\u0002J|\u0010b\u001a\u00020U2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010`\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010\\\u001a\u00020\u001fH\u0002J>\u0010c\u001a\u00020_2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020A0e2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010g2\u0006\u0010X\u001a\u00020Y2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001fH\u0002Jn\u0010i\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001f2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010X\u001a\u00020Y2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010j\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\u001f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0006\u0010m\u001a\u00020\u001fH\u0002J\f\u0010n\u001a\u00020\u001a*\u00020\u001aH\u0002J<\u0010o\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@H\u0002J\u0086\u0001\u0010p\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0012\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010<\u001a\u00020\u001a2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002J\u0086\u0001\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020x0\u00192\u0016\u0010y\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020x0\u00192\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002JR\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0002JD\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010m\u001a\u00020\u001fH\u0002J(\u0010m\u001a\u00020\u001f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001bH\u0002J\u001e\u0010|\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0006\u0010j\u001a\u00020\u001fH\u0002JS\u0010}\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0006\u0010<\u001a\u00020\u001a2\b\b\u0002\u0010~\u001a\u00020\u001fH\u0001¢\u0006\u0002\b\u007fJf\u0010\u0080\u0001\u001a\u00020s2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020Q2\u0006\u0010O\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020S2\u0006\u0010~\u001a\u00020\u001f2\u001b\u0010\u0082\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000f0\u0084\u00010\u00192\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u0011H\u0002J\u008f\u0001\u0010\u0086\u0001\u001a\u0004\u0018\u00010u2\u0012\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010<\u001a\u00020\u001a2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0007\u0010\u0088\u0001\u001a\u00020\u001fH\u0002J)\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0007\u0010\u008a\u0001\u001a\u00020\u000fH\u0002Ja\u0010\u008b\u0001\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020x0\u00192\u0006\u0010t\u001a\u00020u2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010<\u001a\u00020\u001aH\u0002J!\u0010\u008c\u0001\u001a\u00020\u000f2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@H\u0002J\u008d\u0001\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0006\u0010N\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0014\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J\u0018\u00010\u00192\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001fH\u0002JI\u0010\u0090\u0001\u001a\u00020\u000f2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u001fH\u0002J*\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010j\u001a\u00020\u001f2\u0007\u0010\u0081\u0001\u001a\u00020\u000fH\u0002J\u0019\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010\u0092\u0001\u001a\u00020\u000f2\r\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002J'\u0010\u0094\u0001\u001a\u00020\u000f2\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002J<\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002JG\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0018\u0010\u009e\u0001\u001a\u0013\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0g\u0018\u00010\u009f\u0001H\u0002¢\u0006\u0003\u0010 \u0001J5\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0006\u0010m\u001a\u00020\u001fH\u0002J#\u0010¤\u0001\u001a\u00020\u001f2\u0007\u0010¥\u0001\u001a\u00020\u001f2\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0003\u0010§\u0001J3\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010j\u001a\u00020\u001f2\u0007\u0010\u0081\u0001\u001a\u00020\u000fH\u0002J&\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0006\u0010O\u001a\u00020\u000fH\u0007J\t\u0010¬\u0001\u001a\u00020sH\u0002J\t\u0010\u00ad\u0001\u001a\u00020sH\u0002J\t\u0010®\u0001\u001a\u00020sH\u0002J\t\u0010¯\u0001\u001a\u00020sH\u0002J\t\u0010°\u0001\u001a\u00020sH\u0002J\t\u0010±\u0001\u001a\u00020sH\u0002J\t\u0010²\u0001\u001a\u00020sH\u0002J\t\u0010³\u0001\u001a\u00020sH\u0002J\t\u0010´\u0001\u001a\u00020sH\u0002J\t\u0010µ\u0001\u001a\u00020sH\u0002J\t\u0010¶\u0001\u001a\u00020sH\u0002J\u0012\u0010·\u0001\u001a\u00020'2\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0007J0\u0010¹\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010»\u0001\u001a\u00020Q2\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0002J5\u0010¼\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010¸\u0001\u001a\u00020\u000f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0002J'\u0010¿\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0002J\t\u0010À\u0001\u001a\u00020QH\u0002J\t\u0010Á\u0001\u001a\u00020.H\u0002J\u000b\u0010Â\u0001\u001a\u0004\u0018\u00010QH\u0002J\u000b\u0010Ã\u0001\u001a\u0004\u0018\u00010QH\u0002J!\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001bH\u0002J<\u0010Å\u0001\u001a\u0004\u0018\u00010Q2\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00012\u0006\u0010O\u001a\u00020\u000f2\u0007\u0010È\u0001\u001a\u00020\u001f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0000¢\u0006\u0003\bÉ\u0001J:\u0010Ê\u0001\u001a\u000b\u0012\u0004\u0012\u00020Q\u0018\u00010\u009f\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00012\u0006\u0010O\u001a\u00020\u000f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0002¢\u0006\u0003\u0010Ë\u0001J*\u0010Ì\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00110\u001b2\u0013\u0010Í\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ò\u0001²\u0006\u000b\u0010Ó\u0001\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", "", "context", "Landroid/content/Context;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "encoderProfilesProvider", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "featureCombinationQuery", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/core/impl/EncoderProfilesProvider;Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;)V", "cameraId", "", "hardwareLevel", "", "concurrentSurfaceCombinations", "", "Landroidx/camera/core/impl/SurfaceCombination;", "surfaceCombinations", "surfaceCombinationsStreamUseCase", "ultraHighSurfaceCombinations", "previewStabilizationSurfaceCombinations", "highSpeedSurfaceCombinations", "featureSettingsToSupportedCombinationsMap", "", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "", "surfaceCombinations10Bit", "surfaceCombinationsUltraHdr", "isRawSupported", "", "isBurstCaptureSupported", "isConcurrentCameraModeSupported", "isStreamUseCaseSupported", "isUltraHighResolutionSensorSupported", "isPreviewStabilizationSupported", "isManualSensorSupported", "surfaceSizeDefinition", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "getSurfaceSizeDefinition$camera_camera2", "()Landroidx/camera/core/impl/SurfaceSizeDefinition;", "setSurfaceSizeDefinition$camera_camera2", "(Landroidx/camera/core/impl/SurfaceSizeDefinition;)V", "surfaceSizeDefinitionFormats", "streamConfigurationMapCompat", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "extraSupportedSurfaceCombinationsContainer", "Landroidx/camera/camera2/compat/workaround/ExtraSupportedSurfaceCombinationsContainer;", "displayInfoManager", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "resolutionCorrector", "Landroidx/camera/camera2/compat/workaround/ResolutionCorrector;", "targetAspectRatio", "Landroidx/camera/camera2/compat/workaround/TargetAspectRatio;", "dynamicRangeResolver", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "highSpeedResolver", "Landroidx/camera/camera2/internal/HighSpeedResolver;", "checkSupported", "featureSettings", "surfaceConfigList", "Landroidx/camera/core/impl/SurfaceConfig;", "dynamicRangesBySurfaceConfig", "", "Landroidx/camera/core/DynamicRange;", "newUseCaseConfigs", "Landroidx/camera/core/impl/UseCaseConfig;", "useCasesPriorityOrder", "createFeatureComboSessionConfig", "Landroidx/camera/core/impl/SessionConfig;", "useCasePriorityOrder", "getOrderedSupportedStreamUseCaseSurfaceConfigList", "surfaceConfigIndexAttachedSurfaceInfoMap", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "surfaceConfigIndexUseCaseConfigMap", "getSurfaceCombinationsByFeatureSettings", "transformSurfaceConfig", "cameraMode", "imageFormat", "size", "Landroid/util/Size;", "streamUseCase", "Landroidx/camera/core/impl/StreamUseCase;", "getSuggestedStreamSpecifications", "Landroidx/camera/core/impl/SurfaceStreamSpecQueryResult;", "attachedSurfaces", "newUseCaseConfigsSupportedSizeMap", "videoStabilization", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "hasVideoCapture", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "resolveSpecsByCheckingMethod", "checkingMethod", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$CheckingMethod;", "filteredNewUseCaseConfigsSupportedSizeMap", "resolvedDynamicRanges", "resolveSpecsBySettings", "getCheckingMethod", "dynamicRanges", "", "fps", "Landroid/util/Range;", "isUltraHdrOn", "createFeatureSettings", "isHighSpeedOn", "requiresFeatureComboQuery", "targetFpsRange", "isStrictFpsRequired", "validateSelf", "isUseCasesCombinationSupported", "getOrderedSurfaceConfigListForStreamUseCase", "allPossibleSizeArrangements", "populateStreamUseCaseIfSameSavedSizes", "", "bestSizesAndMaxFps", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs;", "orderedSurfaceConfigListForStreamUseCase", "attachedSurfaceStreamSpecMap", "Landroidx/camera/core/impl/StreamSpec;", "suggestedStreamSpecMap", "getSupportedOutputSizesList", "getTargetFpsRange", "getMaxSupportedFpsFromAttachedSurfaces", "filterSupportedSizes", "forceUniqueMaxFpsFiltering", "filterSupportedSizes$camera_camera2", "populateReducedSizeListAndUniqueMaxFpsMap", "customMaxFps", "configSizeUniqueMaxFpsMap", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "", "reducedSizeList", "findBestSizesAndFps", "existingSurfaceFrameRateCeiling", "findMaxFpsForAllSizes", "isConfigFrameRateAcceptable", "currentConfigFrameRateCeiling", "generateSuggestedStreamSpecMap", "getRequiredMaxBitDepth", "getSurfaceConfigList", "possibleSizeList", "checkViaFeatureComboQuery", "getCurrentConfigFrameRateCeiling", "getMaxFrameRate", "getRangeLength", "range", "getRangeDistance", "firstRange", "secondRange", "compareIntersectingRanges", "targetFps", "storedRange", "newRange", "getClosestSupportedDeviceFrameRate", "targetFrameRate", "maxFps", "availableFpsRanges", "", "(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;", "getUpdatedTargetFrameRate", "newTargetFrameRate", "storedTargetFrameRate", "getAndValidateIsStrictFpsRequired", "newIsStrictFpsRequired", "storedIsStrictFpsRequired", "(ZLjava/lang/Boolean;)Z", "getCombinedMaximumFps", "combinedMaxFps", "applyResolutionSelectionOrderRelatedWorkarounds", "sizeList", "refreshPreviewSize", "checkCapabilities", "generateSupportedCombinationList", "generateUltraHighResolutionSupportedCombinationList", "generateConcurrentSupportedCombinationList", "generatePreviewStabilizationSupportedCombinationList", "generateHighSpeedSupportedCombinationList", "generate10BitSupportedCombinationList", "generateUltraHdrSupportedCombinationList", "generateStreamUseCaseSupportedCombinationList", "generateSurfaceSizeDefinition", "getUpdatedSurfaceSizeDefinitionByFormat", "format", "updateS720pOrS1440pSizeByFormat", "sizeMap", "targetSize", "updateMaximumSizeByFormat", "aspectRatio", "Landroid/util/Rational;", "updateUltraMaximumSizeByFormat", "getRecordSize", "getStreamConfigurationMapCompat", "getRecordSizeFromStreamConfigurationMapCompat", "getRecordSizeFromCamcorderProfile", "getUseCasesPriorityOrder", "getMaxOutputSizeByFormat", "map", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "highResolutionIncluded", "getMaxOutputSizeByFormat$camera_camera2", "getOutputSizes", "(Landroid/hardware/camera2/params/StreamConfigurationMap;ILandroid/util/Rational;)[Landroid/util/Size;", "getAllPossibleSizeArrangements", "supportedOutputSizesList", "FeatureSettings", "BestSizesAndMaxFpsForConfigs", "CheckingMethod", "Companion", "camera-camera2", "isSupported"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportedSurfaceCombination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cameraId;

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final List<SurfaceCombination> concurrentSurfaceCombinations;

    @NotNull
    private final DisplayInfoManager displayInfoManager;

    @NotNull
    private final DynamicRangeResolver dynamicRangeResolver;

    @NotNull
    private final EncoderProfilesProvider encoderProfilesProvider;

    @NotNull
    private final ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer;

    @NotNull
    private final FeatureCombinationQuery featureCombinationQuery;

    @NotNull
    private final Map<FeatureSettings, List<SurfaceCombination>> featureSettingsToSupportedCombinationsMap;
    private final int hardwareLevel;

    @NotNull
    private final HighSpeedResolver highSpeedResolver;

    @NotNull
    private final List<SurfaceCombination> highSpeedSurfaceCombinations;
    private boolean isBurstCaptureSupported;
    private final boolean isConcurrentCameraModeSupported;
    private boolean isManualSensorSupported;
    private boolean isPreviewStabilizationSupported;
    private boolean isRawSupported;
    private final boolean isStreamUseCaseSupported;
    private boolean isUltraHighResolutionSensorSupported;

    @NotNull
    private final List<SurfaceCombination> previewStabilizationSurfaceCombinations;

    @NotNull
    private final ResolutionCorrector resolutionCorrector;

    @NotNull
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;

    @NotNull
    private final List<SurfaceCombination> surfaceCombinations;

    @NotNull
    private final List<SurfaceCombination> surfaceCombinations10Bit;

    @NotNull
    private final List<SurfaceCombination> surfaceCombinationsStreamUseCase;

    @NotNull
    private final List<SurfaceCombination> surfaceCombinationsUltraHdr;
    public SurfaceSizeDefinition surfaceSizeDefinition;

    @NotNull
    private final List<Integer> surfaceSizeDefinitionFormats;

    @NotNull
    private final TargetAspectRatio targetAspectRatio;

    @NotNull
    private final List<SurfaceCombination> ultraHighSurfaceCombinations;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs;", "", "", "Landroid/util/Size;", "bestSizes", "bestSizesForStreamUseCase", "", "maxFpsForBestSizes", "maxFpsForStreamUseCase", "maxFpsForAllSizes", "<init>", "(Ljava/util/List;Ljava/util/List;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBestSizes", "()Ljava/util/List;", "getBestSizesForStreamUseCase", "I", "getMaxFpsForBestSizes", "getMaxFpsForStreamUseCase", "getMaxFpsForAllSizes", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BestSizesAndMaxFpsForConfigs {

        @NotNull
        private final List<Size> bestSizes;
        private final List<Size> bestSizesForStreamUseCase;
        private final int maxFpsForAllSizes;
        private final int maxFpsForBestSizes;
        private final int maxFpsForStreamUseCase;

        public BestSizesAndMaxFpsForConfigs(@NotNull List<Size> bestSizes, List<Size> list, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(bestSizes, "bestSizes");
            this.bestSizes = bestSizes;
            this.bestSizesForStreamUseCase = list;
            this.maxFpsForBestSizes = i;
            this.maxFpsForStreamUseCase = i2;
            this.maxFpsForAllSizes = i3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BestSizesAndMaxFpsForConfigs)) {
                return false;
            }
            BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (BestSizesAndMaxFpsForConfigs) other;
            return Intrinsics.f(this.bestSizes, bestSizesAndMaxFpsForConfigs.bestSizes) && Intrinsics.f(this.bestSizesForStreamUseCase, bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase) && this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
        }

        @NotNull
        public final List<Size> getBestSizes() {
            return this.bestSizes;
        }

        public final List<Size> getBestSizesForStreamUseCase() {
            return this.bestSizesForStreamUseCase;
        }

        public final int getMaxFpsForAllSizes() {
            return this.maxFpsForAllSizes;
        }

        public final int getMaxFpsForBestSizes() {
            return this.maxFpsForBestSizes;
        }

        public final int getMaxFpsForStreamUseCase() {
            return this.maxFpsForStreamUseCase;
        }

        public int hashCode() {
            int iHashCode = this.bestSizes.hashCode() * 31;
            List<Size> list = this.bestSizesForStreamUseCase;
            return Integer.hashCode(this.maxFpsForAllSizes) + a.b(this.maxFpsForStreamUseCase, a.b(this.maxFpsForBestSizes, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
            sb6.append(this.bestSizes);
            sb6.append(", bestSizesForStreamUseCase=");
            sb6.append(this.bestSizesForStreamUseCase);
            sb6.append(", maxFpsForBestSizes=");
            sb6.append(this.maxFpsForBestSizes);
            sb6.append(", maxFpsForStreamUseCase=");
            sb6.append(this.maxFpsForStreamUseCase);
            sb6.append(", maxFpsForAllSizes=");
            return a.t(sb6, this.maxFpsForAllSizes, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$CheckingMethod;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT_FEATURE_COMBO", "WITH_FEATURE_COMBO", "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckingMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckingMethod[] $VALUES;
        public static final CheckingMethod WITHOUT_FEATURE_COMBO = new CheckingMethod("WITHOUT_FEATURE_COMBO", 0);
        public static final CheckingMethod WITH_FEATURE_COMBO = new CheckingMethod("WITH_FEATURE_COMBO", 1);
        public static final CheckingMethod WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = new CheckingMethod("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);

        private static final /* synthetic */ CheckingMethod[] $values() {
            return new CheckingMethod[]{WITHOUT_FEATURE_COMBO, WITH_FEATURE_COMBO, WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT};
        }

        static {
            CheckingMethod[] checkingMethodArr$values = $values();
            $VALUES = checkingMethodArr$values;
            $ENTRIES = s.n(checkingMethodArr$values);
        }

        private CheckingMethod(String str, int i) {
        }

        public static CheckingMethod valueOf(String str) {
            return (CheckingMethod) Enum.valueOf(CheckingMethod.class, str);
        }

        public static CheckingMethod[] values() {
            return (CheckingMethod[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001c\u0010\t\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\nH\u0002¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$Companion;", "", "<init>", "()V", "isUltraHdrOn", "", "attachedSurfaces", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "newUseCaseConfigsSupportedSizeMap", "", "Landroidx/camera/core/impl/UseCaseConfig;", "Landroid/util/Size;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isUltraHdrOn(List<? extends AttachedSurfaceInfo> attachedSurfaces, Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap) {
            Iterator<? extends AttachedSurfaceInfo> it8 = attachedSurfaces.iterator();
            while (it8.hasNext()) {
                if (it8.next().getImageFormat() == 4101) {
                    return true;
                }
            }
            Iterator<UseCaseConfig<?>> it9 = newUseCaseConfigsSupportedSizeMap.keySet().iterator();
            while (it9.hasNext()) {
                if (it9.next().getInputFormat() == 4101) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckingMethod.values().length];
            try {
                iArr[CheckingMethod.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckingMethod.WITH_FEATURE_COMBO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportedSurfaceCombination(@NotNull Context context, @NotNull CameraMetadata cameraMetadata, @NotNull EncoderProfilesProvider encoderProfilesProvider, @NotNull FeatureCombinationQuery featureCombinationQuery) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(encoderProfilesProvider, "encoderProfilesProvider");
        Intrinsics.checkNotNullParameter(featureCombinationQuery, "featureCombinationQuery");
        this.cameraMetadata = cameraMetadata;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.featureCombinationQuery = featureCombinationQuery;
        this.cameraId = cameraMetadata.getCamera();
        CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num = (Integer) cameraMetadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
        this.hardwareLevel = num != null ? num.intValue() : 2;
        this.concurrentSurfaceCombinations = new ArrayList();
        this.surfaceCombinations = new ArrayList();
        this.surfaceCombinationsStreamUseCase = new ArrayList();
        this.ultraHighSurfaceCombinations = new ArrayList();
        this.previewStabilizationSurfaceCombinations = new ArrayList();
        this.highSpeedSurfaceCombinations = new ArrayList();
        this.featureSettingsToSupportedCombinationsMap = new LinkedHashMap();
        this.surfaceCombinations10Bit = new ArrayList();
        this.surfaceCombinationsUltraHdr = new ArrayList();
        this.isPreviewStabilizationSupported = CameraMetadata.INSTANCE.getSupportsPreviewStabilization(cameraMetadata);
        this.surfaceSizeDefinitionFormats = new ArrayList();
        this.streamConfigurationMapCompat = getStreamConfigurationMapCompat();
        this.extraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.displayInfoManager = DisplayInfoManager.INSTANCE.getInstance(context);
        this.resolutionCorrector = new ResolutionCorrector();
        this.targetAspectRatio = new TargetAspectRatio();
        DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(cameraMetadata);
        this.dynamicRangeResolver = dynamicRangeResolver;
        this.highSpeedResolver = new HighSpeedResolver(cameraMetadata);
        checkCapabilities();
        generateSupportedCombinationList();
        if (this.isUltraHighResolutionSensorSupported) {
            generateUltraHighResolutionSupportedCombinationList();
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.isConcurrentCameraModeSupported = zHasSystemFeature;
        if (zHasSystemFeature) {
            generateConcurrentSupportedCombinationList();
        }
        if (dynamicRangeResolver.getIs10BitSupported()) {
            generate10BitSupportedCombinationList();
        }
        if (this.isPreviewStabilizationSupported) {
            generatePreviewStabilizationSupportedCombinationList();
        }
        boolean zIsStreamUseCaseSupported = StreamUseCaseUtil.INSTANCE.isStreamUseCaseSupported(cameraMetadata);
        this.isStreamUseCaseSupported = zIsStreamUseCaseSupported;
        if (zIsStreamUseCaseSupported) {
            generateStreamUseCaseSupportedCombinationList();
        }
        generateSurfaceSizeDefinition();
    }

    private final void checkCapabilities() {
        CameraMetadata cameraMetadata = this.cameraMetadata;
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            this.isRawSupported = d.G(iArr, 3);
            this.isBurstCaptureSupported = d.G(iArr, 6);
            this.isUltraHighResolutionSensorSupported = d.G(iArr, 16);
            this.isManualSensorSupported = d.G(iArr, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean checkSupported$default(SupportedSurfaceCombination supportedSurfaceCombination, FeatureSettings featureSettings, List list, Map map, List list2, List list3, int i, Object obj2) {
        if ((i & 4) != 0) {
            map = r0.g();
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            list2 = f0.f322471a;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            list3 = f0.f322471a;
        }
        return supportedSurfaceCombination.checkSupported(featureSettings, list, map2, list4, list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Range<java.lang.Integer> compareIntersectingRanges(android.util.Range<java.lang.Integer> r11, android.util.Range<java.lang.Integer> r12, android.util.Range<java.lang.Integer> r13) {
        /*
            r10 = this;
            android.util.Range r0 = r12.intersect(r11)
            java.lang.String r1 = "intersect(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r10.getRangeLength(r0)
            double r2 = (double) r0
            android.util.Range r11 = r13.intersect(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            int r11 = r10.getRangeLength(r11)
            double r0 = (double) r11
            int r11 = r10.getRangeLength(r13)
            double r4 = (double) r11
            double r4 = r0 / r4
            int r11 = r10.getRangeLength(r12)
            double r6 = (double) r11
            double r6 = r2 / r6
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r11 <= 0) goto L37
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 >= 0) goto L64
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 < 0) goto L65
            goto L64
        L37:
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L5c
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L40
            goto L64
        L40:
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L5b
            java.lang.Comparable r11 = r13.getLower()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.Comparable r0 = r12.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r11 <= r0) goto L65
            goto L64
        L5b:
            return r12
        L5c:
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L65
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L65
        L64:
            return r13
        L65:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.compareIntersectingRanges(android.util.Range, android.util.Range, android.util.Range):android.util.Range");
    }

    private final SessionConfig createFeatureComboSessionConfig(FeatureSettings featureSettings, List<SurfaceConfig> surfaceConfigList, Map<SurfaceConfig, DynamicRange> dynamicRangesBySurfaceConfig, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasePriorityOrder) {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        int i = 0;
        for (Object obj2 : surfaceConfigList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            SurfaceConfig surfaceConfig = (SurfaceConfig) obj2;
            Size resolution = surfaceConfig.getResolution(getUpdatedSurfaceSizeDefinitionByFormat(surfaceConfig.getImageFormat()));
            UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(useCasePriorityOrder.get(i).intValue());
            FeatureCombinationQuery.Companion companion = FeatureCombinationQuery.INSTANCE;
            DynamicRange dynamicRange = dynamicRangesBySurfaceConfig.get(surfaceConfig);
            if (dynamicRange == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            SessionConfig.Builder builderCreateSessionConfigBuilder = companion.createSessionConfigBuilder(useCaseConfig, resolution, dynamicRange);
            Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
            Range<Integer> range = Intrinsics.f(targetFpsRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) ? null : targetFpsRange;
            if (range == null) {
                range = FpsRangeFeature.DEFAULT_FPS_RANGE;
            }
            builderCreateSessionConfigBuilder.setExpectedFrameRateRange(range);
            if (featureSettings.getVideoStabilization() == VideoStabilization.PREVIEW) {
                builderCreateSessionConfigBuilder.setPreviewStabilization(2);
            } else if (featureSettings.getVideoStabilization() == VideoStabilization.ON) {
                builderCreateSessionConfigBuilder.setVideoStabilization(2);
            }
            validatingBuilder.add(builderCreateSessionConfigBuilder.build());
            Preconditions.checkState(validatingBuilder.isValid(), "Cannot create a combined SessionConfig for feature combo after adding " + useCaseConfig + " with " + surfaceConfig + " due to [" + validatingBuilder.getInvalidReason() + "]; surfaceConfigList = " + surfaceConfigList + ", featureSettings = " + featureSettings + ", newUseCaseConfigs = " + newUseCaseConfigs);
            i = i2;
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        Intrinsics.checkNotNullExpressionValue(sessionConfigBuild, "build(...)");
        return sessionConfigBuild;
    }

    private final FeatureSettings createFeatureSettings(int cameraMode, boolean hasVideoCapture, Map<UseCaseConfig<?>, DynamicRange> resolvedDynamicRanges, VideoStabilization videoStabilization, boolean isUltraHdrOn, boolean isHighSpeedOn, boolean isFeatureComboInvocation, boolean requiresFeatureComboQuery, Range<Integer> targetFpsRange, boolean isStrictFpsRequired) {
        return validateSelf(new FeatureSettings(cameraMode, getRequiredMaxBitDepth(resolvedDynamicRanges), hasVideoCapture, videoStabilization, isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, requiresFeatureComboQuery, targetFpsRange, isStrictFpsRequired));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010e A[PHI: r14 r15 r17
      0x010e: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v5 int), (r14v6 int) binds: [B:34:0x00eb, B:36:0x00f1, B:42:0x00fe, B:46:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010e: PHI (r15v2 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v3 boolean) binds: [B:34:0x00eb, B:36:0x00f1, B:42:0x00fe, B:46:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010e: PHI (r17v3 java.util.List<android.util.Size>) = 
      (r17v1 java.util.List<android.util.Size>)
      (r17v1 java.util.List<android.util.Size>)
      (r17v5 java.util.List<android.util.Size>)
      (r17v6 java.util.List<android.util.Size>)
     binds: [B:34:0x00eb, B:36:0x00f1, B:42:0x00fe, B:46:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs findBestSizesAndFps(java.util.List<? extends java.util.List<android.util.Size>> r25, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> r26, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> r27, int r28, java.util.List<java.lang.Integer> r29, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings r30, java.util.List<androidx.camera.core.impl.SurfaceConfig> r31, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.findBestSizesAndFps(java.util.List, java.util.List, java.util.List, int, java.util.List, androidx.camera.camera2.adapter.SupportedSurfaceCombination$FeatureSettings, java.util.List, java.util.Map, boolean):androidx.camera.camera2.adapter.SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs");
    }

    private static final boolean findBestSizesAndFps$lambda$2(Lazy lazy) {
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    private final void generate10BitSupportedCombinationList() {
        this.surfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private final void generateConcurrentSupportedCombinationList() {
        this.concurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private final void generateHighSpeedSupportedCombinationList() {
        if (this.highSpeedResolver.isHighSpeedSupported()) {
            this.highSpeedSurfaceCombinations.clear();
            Size maxSize = this.highSpeedResolver.getMaxSize();
            if (maxSize != null) {
                this.highSpeedSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateHighSpeedSupportedCombinationList(maxSize, getUpdatedSurfaceSizeDefinitionByFormat(34)));
            }
        }
    }

    private final void generatePreviewStabilizationSupportedCombinationList() {
        this.previewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
    }

    private final void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.surfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.INSTANCE.getStreamUseCaseSupportedCombinationList());
        }
    }

    private final Map<UseCaseConfig<?>, StreamSpec> generateSuggestedStreamSpecMap(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFps, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<UseCaseConfig<?>, DynamicRange> resolvedDynamicRanges, FeatureSettings featureSettings) {
        Range<Integer>[] frameRateRangesFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Range<Integer> closestSupportedDeviceFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!Intrinsics.f(featureSettings.getTargetFpsRange(), closestSupportedDeviceFrameRate)) {
            if (featureSettings.getIsHighSpeedOn()) {
                frameRateRangesFor = this.highSpeedResolver.getFrameRateRangesFor(bestSizesAndMaxFps.getBestSizes());
            } else {
                CameraMetadata cameraMetadata = this.cameraMetadata;
                CameraCharacteristics.Key CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
                frameRateRangesFor = (Range[]) cameraMetadata.get(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            }
            Range<Integer> closestSupportedDeviceFrameRate2 = getClosestSupportedDeviceFrameRate(featureSettings.getTargetFpsRange(), bestSizesAndMaxFps.getMaxFpsForBestSizes(), frameRateRangesFor);
            if ((featureSettings.getIsFeatureComboInvocation() || featureSettings.getIsStrictFpsRequired()) && !Intrinsics.f(closestSupportedDeviceFrameRate2, featureSettings.getTargetFpsRange())) {
                StringBuilder sb6 = new StringBuilder("Target FPS range ");
                sb6.append(featureSettings.getTargetFpsRange());
                sb6.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb6.append(bestSizesAndMaxFps.getMaxFpsForBestSizes());
                sb6.append(". Calculated best FPS range for device: ");
                sb6.append(closestSupportedDeviceFrameRate2);
                sb6.append(". Device supported FPS ranges: ");
                String string = Arrays.toString(frameRateRangesFor);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb6.append(string);
                sb6.append(CoreConstants.DOT);
                throw new IllegalArgumentException(sb6.toString().toString());
            }
            closestSupportedDeviceFrameRate = closestSupportedDeviceFrameRate2;
        } else if (featureSettings.getIsHighSpeedOn()) {
            closestSupportedDeviceFrameRate = getClosestSupportedDeviceFrameRate(HighSpeedResolver.INSTANCE.getDEFAULT_FPS(), bestSizesAndMaxFps.getMaxFpsForBestSizes(), this.highSpeedResolver.getFrameRateRangesFor(bestSizesAndMaxFps.getBestSizes()));
        }
        int i = 0;
        for (UseCaseConfig<?> useCaseConfig : newUseCaseConfigs) {
            int i2 = i + 1;
            StreamSpec.Builder sessionType = StreamSpec.builder(bestSizesAndMaxFps.getBestSizes().get(useCasesPriorityOrder.indexOf(Integer.valueOf(i)))).setSessionType(featureSettings.getIsHighSpeedOn() ? 1 : 0);
            DynamicRange dynamicRange = resolvedDynamicRanges.get(useCaseConfig);
            if (dynamicRange == null) {
                throw new IllegalStateException("Required value was null.");
            }
            StreamSpec.Builder zslDisabled = sessionType.setDynamicRange(dynamicRange).setImplementationOptions(StreamUseCaseUtil.INSTANCE.getStreamSpecImplementationOptions(useCaseConfig)).setZslDisabled(featureSettings.getHasVideoCapture());
            Intrinsics.checkNotNullExpressionValue(zslDisabled, "setZslDisabled(...)");
            if (!Intrinsics.f(closestSupportedDeviceFrameRate, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            linkedHashMap.put(useCaseConfig, zslDisabled.build());
            i = i2;
        }
        return linkedHashMap;
    }

    private final void generateSupportedCombinationList() {
        this.surfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.hardwareLevel, this.isRawSupported, this.isBurstCaptureSupported));
        this.surfaceCombinations.addAll(this.extraSupportedSurfaceCombinationsContainer.get(this.cameraId));
    }

    private final void generateSurfaceSizeDefinition() {
        SurfaceSizeDefinition surfaceSizeDefinitionCreate = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new LinkedHashMap(), this.displayInfoManager.getPreviewSize(), new LinkedHashMap(), getRecordSize(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(surfaceSizeDefinitionCreate, "create(...)");
        setSurfaceSizeDefinition$camera_camera2(surfaceSizeDefinitionCreate);
    }

    private final void generateUltraHdrSupportedCombinationList() {
        this.surfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private final void generateUltraHighResolutionSupportedCombinationList() {
        this.ultraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private final List<List<Size>> getAllPossibleSizeArrangements(List<? extends List<Size>> supportedOutputSizesList) {
        Iterator<? extends List<Size>> it8 = supportedOutputSizesList.iterator();
        int size = 1;
        while (it8.hasNext()) {
            size *= it8.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / supportedOutputSizesList.get(0).size();
        int size3 = supportedOutputSizesList.size();
        int i2 = size;
        for (int i3 = 0; i3 < size3; i3++) {
            List<Size> list = supportedOutputSizesList.get(i3);
            for (int i5 = 0; i5 < size; i5++) {
                ((List) arrayList.get(i5)).add(list.get((i5 % i2) / size2));
            }
            if (i3 < supportedOutputSizesList.size() - 1) {
                i2 = size2;
                size2 /= supportedOutputSizesList.get(i3 + 1).size();
            }
        }
        return arrayList;
    }

    private final boolean getAndValidateIsStrictFpsRequired(boolean newIsStrictFpsRequired, Boolean storedIsStrictFpsRequired) {
        if (storedIsStrictFpsRequired == null || storedIsStrictFpsRequired.equals(Boolean.valueOf(newIsStrictFpsRequired))) {
            return newIsStrictFpsRequired;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod getCheckingMethod(java.util.Collection<androidx.camera.core.DynamicRange> r1, android.util.Range<java.lang.Integer> r2, androidx.camera.core.impl.stabilization.VideoStabilization r3, boolean r4, boolean r5) {
        /*
            r0 = this;
            if (r5 != 0) goto L5
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r1 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO
            return r1
        L5:
            androidx.camera.core.DynamicRange r5 = androidx.camera.core.DynamicRange.HLG_10_BIT
            boolean r1 = r1.contains(r5)
            if (r2 == 0) goto L20
            java.lang.Comparable r2 = r2.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L16
            goto L20
        L16:
            int r2 = r2.intValue()
            r5 = 60
            if (r2 != r5) goto L20
            int r1 = r1 + 1
        L20:
            androidx.camera.core.impl.stabilization.VideoStabilization r2 = androidx.camera.core.impl.stabilization.VideoStabilization.ON
            if (r3 == r2) goto L28
            androidx.camera.core.impl.stabilization.VideoStabilization r2 = androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW
            if (r3 != r2) goto L2a
        L28:
            int r1 = r1 + 1
        L2a:
            if (r4 == 0) goto L2e
            int r1 = r1 + 1
        L2e:
            r2 = 1
            if (r1 <= r2) goto L34
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r1 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITH_FEATURE_COMBO
            return r1
        L34:
            if (r1 != r2) goto L39
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r1 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
            return r1
        L39:
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r1 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.getCheckingMethod(java.util.Collection, android.util.Range, androidx.camera.core.impl.stabilization.VideoStabilization, boolean, boolean):androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Range<Integer> getClosestSupportedDeviceFrameRate(Range<Integer> targetFrameRate, int maxFps, Range<Integer>[] availableFpsRanges) {
        Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.f(targetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED)) {
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            return FRAME_RATE_RANGE_UNSPECIFIED;
        }
        if (availableFpsRanges == null) {
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            return FRAME_RATE_RANGE_UNSPECIFIED;
        }
        Object lower = targetFrameRate.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
        Integer numValueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), maxFps));
        Object upper = targetFrameRate.getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        Range<T> range = new Range<>(numValueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), maxFps)));
        int length = availableFpsRanges.length;
        int i = 0;
        int rangeLength = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Range<Integer> range2 = availableFpsRanges[i];
            if (maxFps >= ((Number) range2.getLower()).intValue()) {
                if (Intrinsics.f(FRAME_RATE_RANGE_UNSPECIFIED, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    FRAME_RATE_RANGE_UNSPECIFIED = range2;
                }
                if (range2.equals(range)) {
                    FRAME_RATE_RANGE_UNSPECIFIED = range2;
                    break;
                }
                try {
                    Range<T> rangeIntersect = range2.intersect(range);
                    Intrinsics.h(rangeIntersect);
                    int rangeLength2 = getRangeLength(rangeIntersect);
                    if (rangeLength == 0) {
                        FRAME_RATE_RANGE_UNSPECIFIED = range2;
                        rangeLength = rangeLength2;
                    } else if (rangeLength2 >= rangeLength) {
                        Intrinsics.h(FRAME_RATE_RANGE_UNSPECIFIED);
                        FRAME_RATE_RANGE_UNSPECIFIED = compareIntersectingRanges(range, FRAME_RATE_RANGE_UNSPECIFIED, range2);
                        Range rangeIntersect2 = range.intersect(FRAME_RATE_RANGE_UNSPECIFIED);
                        Intrinsics.checkNotNullExpressionValue(rangeIntersect2, "intersect(...)");
                        rangeLength = getRangeLength(rangeIntersect2);
                    }
                } catch (IllegalArgumentException unused) {
                    if (rangeLength == 0) {
                        int rangeDistance = getRangeDistance(range2, range);
                        Intrinsics.h(FRAME_RATE_RANGE_UNSPECIFIED);
                        if (rangeDistance < getRangeDistance(FRAME_RATE_RANGE_UNSPECIFIED, range) || (getRangeDistance(range2, range) == getRangeDistance(FRAME_RATE_RANGE_UNSPECIFIED, range) && (((Number) range2.getLower()).intValue() > ((Number) FRAME_RATE_RANGE_UNSPECIFIED.getUpper()).intValue() || getRangeLength(range2) < getRangeLength(FRAME_RATE_RANGE_UNSPECIFIED)))) {
                            FRAME_RATE_RANGE_UNSPECIFIED = range2;
                        }
                    }
                }
            }
            i++;
        }
        Intrinsics.h(FRAME_RATE_RANGE_UNSPECIFIED);
        return FRAME_RATE_RANGE_UNSPECIFIED;
    }

    private final int getCombinedMaximumFps(int combinedMaxFps, int imageFormat, Size size, boolean isHighSpeedOn, int customMaxFps) {
        return Math.min(combinedMaxFps, getMaxFrameRate(imageFormat, size, isHighSpeedOn, customMaxFps));
    }

    private final int getCurrentConfigFrameRateCeiling(List<Size> possibleSizeList, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, int currentConfigFrameRateCeiling, boolean isHighSpeedOn) {
        int i = 0;
        int combinedMaximumFps = currentConfigFrameRateCeiling;
        for (Size size : possibleSizeList) {
            int i2 = i + 1;
            UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(useCasesPriorityOrder.get(i).intValue());
            combinedMaximumFps = getCombinedMaximumFps(combinedMaximumFps, useCaseConfig.getInputFormat(), size, isHighSpeedOn, useCaseConfig.getCustomMaxFrameRate(size));
            i = i2;
        }
        return combinedMaximumFps;
    }

    private final int getMaxFrameRate(int imageFormat, Size size, boolean isHighSpeedOn, int customMaxFps) {
        int maxFrameRate;
        if (!isHighSpeedOn) {
            maxFrameRate = getMaxFrameRate(imageFormat, size);
        } else {
            if (imageFormat != 34) {
                throw new IllegalStateException("Check failed.");
            }
            maxFrameRate = this.highSpeedResolver.getMaxFrameRate(size);
        }
        return Math.min(customMaxFps, maxFrameRate);
    }

    public static /* synthetic */ Size getMaxOutputSizeByFormat$camera_camera2$default(SupportedSurfaceCombination supportedSurfaceCombination, StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            rational = null;
        }
        return supportedSurfaceCombination.getMaxOutputSizeByFormat$camera_camera2(streamConfigurationMap, i, z, rational);
    }

    private final int getMaxSupportedFpsFromAttachedSurfaces(List<? extends AttachedSurfaceInfo> attachedSurfaces, boolean isHighSpeedOn) {
        int combinedMaximumFps = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : attachedSurfaces) {
            int imageFormat = attachedSurfaceInfo.getImageFormat();
            Size size = attachedSurfaceInfo.getSize();
            Intrinsics.checkNotNullExpressionValue(size, "getSize(...)");
            combinedMaximumFps = getCombinedMaximumFps(combinedMaximumFps, imageFormat, size, isHighSpeedOn, attachedSurfaceInfo.getCustomMaxFrameRate());
        }
        return combinedMaximumFps;
    }

    private final List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, List<SurfaceConfig> surfaceConfigList, Map<Integer, AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap) {
        if (!StreamUseCaseUtil.INSTANCE.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        for (SurfaceCombination surfaceCombination : this.surfaceCombinationsStreamUseCase) {
            Intrinsics.h(surfaceConfigList);
            List<SurfaceConfig> orderedSupportedSurfaceConfigList = surfaceCombination.getOrderedSupportedSurfaceConfigList(surfaceConfigList);
            if (orderedSupportedSurfaceConfigList != null) {
                boolean zAreCaptureTypesEligible = StreamUseCaseUtil.INSTANCE.areCaptureTypesEligible(surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, orderedSupportedSurfaceConfigList);
                Lazy lazyB = j.b(new e(this, orderedSupportedSurfaceConfigList, 1));
                if (zAreCaptureTypesEligible && ((Boolean) lazyB.getValue()).booleanValue()) {
                    return orderedSupportedSurfaceConfigList;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOrderedSupportedStreamUseCaseSurfaceConfigList$lambda$0(SupportedSurfaceCombination supportedSurfaceCombination, List list) {
        return StreamUseCaseUtil.INSTANCE.areStreamUseCasesAvailableForSurfaceConfigs(supportedSurfaceCombination.cameraMetadata, list);
    }

    private final List<SurfaceConfig> getOrderedSurfaceConfigListForStreamUseCase(List<? extends List<Size>> allPossibleSizeArrangements, List<? extends AttachedSurfaceInfo> attachedSurfaces, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, FeatureSettings featureSettings, Map<Integer, AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap) {
        Iterator<? extends List<Size>> it8 = allPossibleSizeArrangements.iterator();
        List<SurfaceConfig> orderedSupportedStreamUseCaseSurfaceConfigList = null;
        while (it8.hasNext()) {
            orderedSupportedStreamUseCaseSurfaceConfigList = getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings, getSurfaceConfigList(featureSettings.getCameraMode(), attachedSurfaces, it8.next(), newUseCaseConfigs, useCasesPriorityOrder, surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, false), surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap);
            if (orderedSupportedStreamUseCaseSurfaceConfigList != null) {
                return orderedSupportedStreamUseCaseSurfaceConfigList;
            }
            surfaceConfigIndexAttachedSurfaceInfoMap.clear();
            surfaceConfigIndexUseCaseConfigMap.clear();
        }
        return orderedSupportedStreamUseCaseSurfaceConfigList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Size[] getOutputSizes(android.hardware.camera2.params.StreamConfigurationMap r6, int r7, android.util.Rational r8) {
        /*
            r5 = this;
            r0 = 0
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L10
            r1 = 34
            if (r7 != r1) goto L14
            if (r6 == 0) goto L12
            java.lang.Class<android.graphics.SurfaceTexture> r7 = android.graphics.SurfaceTexture.class
            android.util.Size[] r6 = r6.getOutputSizes(r7)     // Catch: java.lang.Throwable -> L10
            goto L21
        L10:
            r6 = move-exception
            goto L1b
        L12:
            r6 = r0
            goto L21
        L14:
            if (r6 == 0) goto L12
            android.util.Size[] r6 = r6.getOutputSizes(r7)     // Catch: java.lang.Throwable -> L10
            goto L21
        L1b:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L21:
            boolean r7 = r6 instanceof yhm.n
            if (r7 == 0) goto L26
            r6 = r0
        L26:
            android.util.Size[] r6 = (android.util.Size[]) r6
            if (r6 == 0) goto L4d
            if (r8 == 0) goto L4c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L34:
            if (r2 >= r0) goto L44
            r3 = r6[r2]
            boolean r4 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r3, r8)
            if (r4 == 0) goto L41
            r7.add(r3)
        L41:
            int r2 = r2 + 1
            goto L34
        L44:
            android.util.Size[] r6 = new android.util.Size[r1]
            java.lang.Object[] r6 = r7.toArray(r6)
            android.util.Size[] r6 = (android.util.Size[]) r6
        L4c:
            r0 = r6
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.getOutputSizes(android.hardware.camera2.params.StreamConfigurationMap, int, android.util.Rational):android.util.Size[]");
    }

    private final int getRangeDistance(Range<Integer> firstRange, Range<Integer> secondRange) {
        if (firstRange.contains(secondRange.getUpper()) || firstRange.contains(secondRange.getLower())) {
            throw new IllegalArgumentException("Ranges must not intersect");
        }
        if (((Number) firstRange.getLower()).intValue() > ((Number) secondRange.getUpper()).intValue()) {
            int iIntValue = ((Number) firstRange.getLower()).intValue();
            Object upper = secondRange.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            return iIntValue - ((Number) upper).intValue();
        }
        int iIntValue2 = ((Number) secondRange.getLower()).intValue();
        Object upper2 = firstRange.getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        return iIntValue2 - ((Number) upper2).intValue();
    }

    private final int getRangeLength(Range<Integer> range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    private final Size getRecordSize() {
        try {
            Integer.parseInt(this.cameraId);
            Size recordSizeFromCamcorderProfile = getRecordSizeFromCamcorderProfile();
            if (recordSizeFromCamcorderProfile != null) {
                return recordSizeFromCamcorderProfile;
            }
        } catch (NumberFormatException unused) {
        }
        Size recordSizeFromStreamConfigurationMapCompat = getRecordSizeFromStreamConfigurationMapCompat();
        if (recordSizeFromStreamConfigurationMapCompat != null) {
            return recordSizeFromStreamConfigurationMapCompat;
        }
        Size RESOLUTION_480P = SizeUtil.RESOLUTION_480P;
        Intrinsics.checkNotNullExpressionValue(RESOLUTION_480P, "RESOLUTION_480P");
        return RESOLUTION_480P;
    }

    private final Size getRecordSizeFromCamcorderProfile() {
        EncoderProfilesProxy all2;
        Iterator it8 = v.k(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            if (this.encoderProfilesProvider.hasProfile(iIntValue) && (all2 = this.encoderProfilesProvider.getAll(iIntValue)) != null) {
                List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = all2.getVideoProfiles();
                Intrinsics.checkNotNullExpressionValue(videoProfiles, "getVideoProfiles(...)");
                if (!videoProfiles.isEmpty()) {
                    EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = all2.getVideoProfiles().get(0);
                    Intrinsics.h(videoProfileProxy);
                    return videoProfileProxy.getResolution();
                }
            }
        }
        return null;
    }

    private final Size getRecordSizeFromStreamConfigurationMapCompat() {
        Object objA;
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMapCompat.toStreamConfigurationMap();
        try {
            m.Companion companion = m.INSTANCE;
            objA = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(MediaRecorder.class) : null;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Size[] sizeArr = (Size[]) objA;
        if (sizeArr != null) {
            Arrays.sort(sizeArr, new CompareSizesByArea(true));
            for (Size size : sizeArr) {
                int width = size.getWidth();
                Size size2 = SizeUtil.RESOLUTION_1080P;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
        }
        return null;
    }

    private final int getRequiredMaxBitDepth(Map<UseCaseConfig<?>, DynamicRange> resolvedDynamicRanges) {
        Iterator<DynamicRange> it8 = resolvedDynamicRanges.values().iterator();
        while (it8.hasNext()) {
            if (it8.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        CameraMetadata cameraMetadata = this.cameraMetadata;
        CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private final List<List<Size>> getSupportedOutputSizesList(Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it8 = useCasesPriorityOrder.iterator();
        while (it8.hasNext()) {
            int iIntValue = it8.next().intValue();
            List<Size> list = newUseCaseConfigsSupportedSizeMap.get(newUseCaseConfigs.get(iIntValue));
            Intrinsics.h(list);
            arrayList.add(applyResolutionSelectionOrderRelatedWorkarounds(list, newUseCaseConfigs.get(iIntValue).getInputFormat()));
        }
        return arrayList;
    }

    private final List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(FeatureSettings featureSettings) {
        if (this.featureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            List<SurfaceCombination> list = this.featureSettingsToSupportedCombinationsMap.get(featureSettings);
            Intrinsics.h(list);
            return list;
        }
        List<SurfaceCombination> arrayList = new ArrayList<>();
        if (featureSettings.getRequiresFeatureComboQuery()) {
            arrayList.addAll(GuaranteedConfigurationsUtil.INSTANCE.getQueryableFcqCombinations$camera_camera2(this.cameraMetadata, featureSettings.getVideoStabilization()));
        } else if (featureSettings.getIsUltraHdrOn()) {
            if (this.surfaceCombinationsUltraHdr.isEmpty()) {
                generateUltraHdrSupportedCombinationList();
            }
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.surfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.getIsHighSpeedOn()) {
            if (this.highSpeedSurfaceCombinations.isEmpty()) {
                generateHighSpeedSupportedCombinationList();
            }
            arrayList.addAll(this.highSpeedSurfaceCombinations);
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.concurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.getVideoStabilization() == VideoStabilization.PREVIEW ? this.previewStabilizationSurfaceCombinations : this.surfaceCombinations);
            } else {
                arrayList.addAll(this.ultraHighSurfaceCombinations);
                arrayList.addAll(this.surfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.surfaceCombinations10Bit);
        }
        this.featureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    private final List<SurfaceConfig> getSurfaceConfigList(int cameraMode, List<? extends AttachedSurfaceInfo> attachedSurfaces, List<Size> possibleSizeList, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<Integer, AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap, boolean checkViaFeatureComboQuery) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : attachedSurfaces) {
            SurfaceConfig surfaceConfig = attachedSurfaceInfo.getSurfaceConfig();
            Intrinsics.checkNotNullExpressionValue(surfaceConfig, "getSurfaceConfig(...)");
            arrayList.add(surfaceConfig);
            if (surfaceConfigIndexAttachedSurfaceInfoMap != null) {
                surfaceConfigIndexAttachedSurfaceInfoMap.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        int i = 0;
        for (Size size : possibleSizeList) {
            int i2 = i + 1;
            UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(useCasesPriorityOrder.get(i).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
            arrayList.add(SurfaceConfig.INSTANCE.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), cameraMode, checkViaFeatureComboQuery ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
            if (surfaceConfigIndexUseCaseConfigMap != null) {
                surfaceConfigIndexUseCaseConfigMap.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i = i2;
        }
        return arrayList;
    }

    private final Range<Integer> getTargetFpsRange(List<? extends AttachedSurfaceInfo> attachedSurfaces, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, boolean isStrictFpsRequired) {
        Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
        Iterator<? extends AttachedSurfaceInfo> it8 = attachedSurfaces.iterator();
        while (it8.hasNext()) {
            Range<Integer> targetFrameRate = it8.next().getTargetFrameRate();
            Intrinsics.checkNotNullExpressionValue(targetFrameRate, "getTargetFrameRate(...)");
            FRAME_RATE_RANGE_UNSPECIFIED = getUpdatedTargetFrameRate(targetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED, isStrictFpsRequired);
        }
        Iterator<Integer> it9 = useCasesPriorityOrder.iterator();
        while (it9.hasNext()) {
            Range<Integer> targetFrameRate2 = newUseCaseConfigs.get(it9.next().intValue()).getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            Intrinsics.h(targetFrameRate2);
            FRAME_RATE_RANGE_UNSPECIFIED = getUpdatedTargetFrameRate(targetFrameRate2, FRAME_RATE_RANGE_UNSPECIFIED, isStrictFpsRequired);
        }
        return FRAME_RATE_RANGE_UNSPECIFIED;
    }

    private final Range<Integer> getUpdatedTargetFrameRate(Range<Integer> newTargetFrameRate, Range<Integer> storedTargetFrameRate, boolean isStrictFpsRequired) {
        Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.f(storedTargetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED) && Intrinsics.f(newTargetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED)) {
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            return FRAME_RATE_RANGE_UNSPECIFIED;
        }
        if (Intrinsics.f(storedTargetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED)) {
            return newTargetFrameRate;
        }
        if (!Intrinsics.f(newTargetFrameRate, FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (isStrictFpsRequired) {
                Preconditions.checkState(Intrinsics.f(newTargetFrameRate, storedTargetFrameRate), "All targetFrameRate should be the same if strict fps is required");
                return newTargetFrameRate;
            }
            try {
                Range rangeIntersect = storedTargetFrameRate.intersect(newTargetFrameRate);
                Intrinsics.h(rangeIntersect);
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return storedTargetFrameRate;
    }

    private final List<Integer> getUseCasesPriorityOrder(List<? extends UseCaseConfig<?>> newUseCaseConfigs) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends UseCaseConfig<?>> it8 = newUseCaseConfigs.iterator();
        while (it8.hasNext()) {
            int surfaceOccupancyPriority = it8.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        z.v(arrayList2);
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Collections.reverse(arrayList2);
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            int iIntValue = ((Number) it9.next()).intValue();
            for (UseCaseConfig<?> useCaseConfig : newUseCaseConfigs) {
                if (iIntValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(newUseCaseConfigs.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private final boolean isConfigFrameRateAcceptable(int existingSurfaceFrameRateCeiling, Range<Integer> targetFpsRange, int currentConfigFrameRateCeiling) {
        return Intrinsics.f(targetFpsRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || currentConfigFrameRateCeiling >= existingSurfaceFrameRateCeiling || currentConfigFrameRateCeiling >= ((Number) targetFpsRange.getUpper()).intValue();
    }

    private final boolean isStrictFpsRequired(List<? extends AttachedSurfaceInfo> attachedSurfaces, List<? extends UseCaseConfig<?>> newUseCaseConfigs) {
        Iterator<? extends AttachedSurfaceInfo> it8 = attachedSurfaces.iterator();
        Boolean boolValueOf = null;
        while (it8.hasNext()) {
            boolValueOf = Boolean.valueOf(getAndValidateIsStrictFpsRequired(it8.next().isStrictFrameRateRequired(), boolValueOf));
        }
        Iterator<? extends UseCaseConfig<?>> it9 = newUseCaseConfigs.iterator();
        while (it9.hasNext()) {
            boolValueOf = Boolean.valueOf(getAndValidateIsStrictFpsRequired(it9.next().isStrictFrameRateRequired(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final boolean isUseCasesCombinationSupported(FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> attachedSurfaces, Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends AttachedSurfaceInfo> it8 = attachedSurfaces.iterator();
        while (it8.hasNext()) {
            SurfaceConfig surfaceConfig = it8.next().getSurfaceConfig();
            Intrinsics.checkNotNullExpressionValue(surfaceConfig, "getSurfaceConfig(...)");
            arrayList.add(surfaceConfig);
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : newUseCaseConfigsSupportedSizeMap.keySet()) {
            List<Size> list = newUseCaseConfigsSupportedSizeMap.get(useCaseConfig);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(("No available output size is found for " + useCaseConfig + CoreConstants.DOT).toString());
            }
            Size size = (Size) Collections.min(list, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
            SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
            Intrinsics.h(size);
            arrayList.add(companion.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings.getCameraMode(), SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
        }
        return checkSupported$default(this, featureSettings, arrayList, null, null, null, 28, null);
    }

    private final void populateReducedSizeListAndUniqueMaxFpsMap(FeatureSettings featureSettings, Size size, int imageFormat, int customMaxFps, StreamUseCase streamUseCase, boolean forceUniqueMaxFpsFiltering, Map<SurfaceConfig.ConfigSize, Set<Integer>> configSizeUniqueMaxFpsMap, List<Size> reducedSizeList) {
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.INSTANCE.transformSurfaceConfig(imageFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(imageFormat), featureSettings.getCameraMode(), featureSettings.getRequiresFeatureComboQuery() ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase).getConfigSize();
        Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
        Range<Integer> range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        int maxFrameRate = (!Intrinsics.f(targetFpsRange, range) || forceUniqueMaxFpsFiltering) ? getMaxFrameRate(imageFormat, size, featureSettings.getIsHighSpeedOn(), customMaxFps) : Integer.MAX_VALUE;
        if (featureSettings.getIsFeatureComboInvocation()) {
            if (configSize == SurfaceConfig.ConfigSize.NOT_SUPPORT) {
                return;
            }
            if (!Intrinsics.f(featureSettings.getTargetFpsRange(), range) && maxFrameRate < ((Number) featureSettings.getTargetFpsRange().getUpper()).intValue()) {
                return;
            }
        }
        Set<Integer> linkedHashSet = configSizeUniqueMaxFpsMap.get(configSize);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            configSizeUniqueMaxFpsMap.put(configSize, linkedHashSet);
        }
        if (linkedHashSet.contains(Integer.valueOf(maxFrameRate))) {
            return;
        }
        reducedSizeList.add(size);
        linkedHashSet.add(Integer.valueOf(maxFrameRate));
    }

    private final void populateStreamUseCaseIfSameSavedSizes(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFps, List<SurfaceConfig> orderedSurfaceConfigListForStreamUseCase, List<? extends AttachedSurfaceInfo> attachedSurfaces, Map<AttachedSurfaceInfo, StreamSpec> attachedSurfaceStreamSpecMap, Map<UseCaseConfig<?>, StreamSpec> suggestedStreamSpecMap, Map<Integer, AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap) {
        if (orderedSurfaceConfigListForStreamUseCase == null || bestSizesAndMaxFps.getMaxFpsForBestSizes() != bestSizesAndMaxFps.getMaxFpsForStreamUseCase()) {
            return;
        }
        int size = bestSizesAndMaxFps.getBestSizes().size();
        List<Size> bestSizesForStreamUseCase = bestSizesAndMaxFps.getBestSizesForStreamUseCase();
        Intrinsics.h(bestSizesForStreamUseCase);
        if (size == bestSizesForStreamUseCase.size()) {
            ArrayList<Pair> arrayListL1 = d0.l1(bestSizesAndMaxFps.getBestSizes(), bestSizesAndMaxFps.getBestSizesForStreamUseCase());
            if (!arrayListL1.isEmpty()) {
                for (Pair pair : arrayListL1) {
                    if (!Intrinsics.f(pair.f186385a, pair.f186386b)) {
                        return;
                    }
                }
            }
            StreamUseCaseUtil streamUseCaseUtil = StreamUseCaseUtil.INSTANCE;
            if (streamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.cameraMetadata, attachedSurfaces, suggestedStreamSpecMap, attachedSurfaceStreamSpecMap)) {
                return;
            }
            streamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(suggestedStreamSpecMap, attachedSurfaceStreamSpecMap, surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, orderedSurfaceConfigListForStreamUseCase);
        }
    }

    private final void refreshPreviewSize() {
        this.displayInfoManager.refreshPreviewSize();
        if (this.surfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
            return;
        }
        SurfaceSizeDefinition surfaceSizeDefinitionCreate = SurfaceSizeDefinition.create(getSurfaceSizeDefinition$camera_camera2().getAnalysisSize(), getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap(), this.displayInfoManager.getPreviewSize(), getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap(), getSurfaceSizeDefinition$camera_camera2().getRecordSize(), getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap(), getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap());
        Intrinsics.checkNotNullExpressionValue(surfaceSizeDefinitionCreate, "create(...)");
        setSurfaceSizeDefinition$camera_camera2(surfaceSizeDefinitionCreate);
    }

    private final SurfaceStreamSpecQueryResult resolveSpecsByCheckingMethod(CheckingMethod checkingMethod, FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> attachedSurfaces, Map<UseCaseConfig<?>, ? extends List<Size>> filteredNewUseCaseConfigsSupportedSizeMap, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<UseCaseConfig<?>, DynamicRange> resolvedDynamicRanges, boolean findMaxSupportedFrameRate) {
        CheckingMethod checkingMethod2;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            StringBuilder sb6 = new StringBuilder("resolveSpecsByCheckingMethod: checkingMethod = ");
            checkingMethod2 = checkingMethod;
            sb6.append(checkingMethod2);
            sb6.toString();
        } else {
            checkingMethod2 = checkingMethod;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[checkingMethod2.ordinal()];
        if (i == 1) {
            return resolveSpecsBySettings(validateSelf(FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
        if (i == 2) {
            Range<Integer> targetFpsRange = (featureSettings.getIsFeatureComboInvocation() && featureSettings.getTargetFpsRange() == StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED && featureSettings.getRequiresFeatureComboQuery()) ? FpsRangeFeature.DEFAULT_FPS_RANGE : featureSettings.getTargetFpsRange();
            return resolveSpecsBySettings(validateSelf(FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, targetFpsRange, false, 639, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            return resolveSpecsBySettings(validateSelf(FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        } catch (IllegalArgumentException e) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
            return resolveSpecsBySettings(validateSelf(FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
    }

    private final SurfaceStreamSpecQueryResult resolveSpecsBySettings(FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> attachedSurfaces, Map<UseCaseConfig<?>, ? extends List<Size>> filteredNewUseCaseConfigsSupportedSizeMap, List<? extends UseCaseConfig<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<UseCaseConfig<?>, DynamicRange> resolvedDynamicRanges, boolean findMaxSupportedFrameRate) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List<SurfaceConfig> orderedSurfaceConfigListForStreamUseCase;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "resolveSpecsBySettings: featureSettings = " + featureSettings;
        }
        if (!featureSettings.getIsFeatureComboInvocation() && !isUseCasesCombinationSupported(featureSettings, attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap)) {
            throw new IllegalArgumentException(("No supported surface combination is found for camera device - Id : " + this.cameraId + ". May be attempting to bind too many use cases. Existing surfaces: " + attachedSurfaces + ". New configs: " + newUseCaseConfigs + ". GroupableFeature settings: " + featureSettings + CoreConstants.DOT).toString());
        }
        List<List<Size>> supportedOutputSizesList = getSupportedOutputSizesList(filterSupportedSizes$camera_camera2(filteredNewUseCaseConfigsSupportedSizeMap, featureSettings, findMaxSupportedFrameRate), newUseCaseConfigs, useCasesPriorityOrder);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        List<List<Size>> sizeArrangements = featureSettings.getIsHighSpeedOn() ? this.highSpeedResolver.getSizeArrangements(supportedOutputSizesList) : getAllPossibleSizeArrangements(supportedOutputSizesList);
        boolean zContainsZslUseCase = StreamUseCaseUtil.INSTANCE.containsZslUseCase(attachedSurfaces, newUseCaseConfigs);
        if (!this.isStreamUseCaseSupported || zContainsZslUseCase) {
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
            orderedSurfaceConfigListForStreamUseCase = null;
        } else {
            orderedSurfaceConfigListForStreamUseCase = getOrderedSurfaceConfigListForStreamUseCase(sizeArrangements, attachedSurfaces, newUseCaseConfigs, useCasesPriorityOrder, featureSettings, linkedHashMap3, linkedHashMap4);
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "orderedSurfaceConfigListForStreamUseCase = " + orderedSurfaceConfigListForStreamUseCase;
            }
        }
        List<SurfaceConfig> list = orderedSurfaceConfigListForStreamUseCase;
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigsFindBestSizesAndFps = findBestSizesAndFps(sizeArrangements, attachedSurfaces, newUseCaseConfigs, getMaxSupportedFpsFromAttachedSurfaces(attachedSurfaces, featureSettings.getIsHighSpeedOn()), useCasesPriorityOrder, featureSettings, list, resolvedDynamicRanges, findMaxSupportedFrameRate);
        if (bestSizesAndMaxFpsForConfigsFindBestSizesAndFps == null) {
            StringBuilder sb6 = new StringBuilder("No supported surface combination is found for camera device - Id : ");
            sb6.append(this.cameraId);
            sb6.append(" and Hardware level: ");
            sb6.append(this.hardwareLevel);
            sb6.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sb6.append(attachedSurfaces);
            sb6.append(". New configs: ");
            throw new IllegalArgumentException(b.p(CoreConstants.DOT, newUseCaseConfigs, sb6).toString());
        }
        if (Logger.isDebugEnabled("CXCP")) {
            String unused3 = Camera2Logger.TRUNCATED_TAG;
            String str3 = "resolveSpecsBySettings: bestSizesAndFps = " + bestSizesAndMaxFpsForConfigsFindBestSizesAndFps;
        }
        Map<UseCaseConfig<?>, StreamSpec> mapGenerateSuggestedStreamSpecMap = generateSuggestedStreamSpecMap(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, featureSettings);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        populateStreamUseCaseIfSameSavedSizes(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps, list, attachedSurfaces, linkedHashMap5, mapGenerateSuggestedStreamSpecMap, linkedHashMap, linkedHashMap2);
        return new SurfaceStreamSpecQueryResult(mapGenerateSuggestedStreamSpecMap, linkedHashMap5, bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getMaxFpsForAllSizes());
    }

    private final void updateMaximumSizeByFormat(Map<Integer, Size> sizeMap, int format, Rational aspectRatio) {
        Size maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2(this.streamConfigurationMapCompat.toStreamConfigurationMap(), format, true, aspectRatio);
        if (maxOutputSizeByFormat$camera_camera2 != null) {
            sizeMap.put(Integer.valueOf(format), maxOutputSizeByFormat$camera_camera2);
        }
    }

    public static /* synthetic */ void updateMaximumSizeByFormat$default(SupportedSurfaceCombination supportedSurfaceCombination, Map map, int i, Rational rational, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            rational = null;
        }
        supportedSurfaceCombination.updateMaximumSizeByFormat(map, i, rational);
    }

    private final void updateS720pOrS1440pSizeByFormat(Map<Integer, Size> sizeMap, Size targetSize, int format) {
        if (this.isConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, this.streamConfigurationMapCompat.toStreamConfigurationMap(), format, false, null, 8, null);
            Integer numValueOf = Integer.valueOf(format);
            if (maxOutputSizeByFormat$camera_camera2$default != null) {
                targetSize = (Size) Collections.min(v.k(targetSize, maxOutputSizeByFormat$camera_camera2$default), new CompareSizesByArea());
            }
            sizeMap.put(numValueOf, targetSize);
        }
    }

    private final void updateUltraMaximumSizeByFormat(Map<Integer, Size> sizeMap, int format) {
        Size maxOutputSizeByFormat$camera_camera2$default;
        if (Build.VERSION.SDK_INT < 31 || !this.isUltraHighResolutionSensorSupported) {
            return;
        }
        CameraMetadata cameraMetadata = this.cameraMetadata;
        CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION, "SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
        if (streamConfigurationMap == null || (maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, streamConfigurationMap, format, true, null, 8, null)) == null) {
            return;
        }
        sizeMap.put(Integer.valueOf(format), maxOutputSizeByFormat$camera_camera2$default);
    }

    private final FeatureSettings validateSelf(FeatureSettings featureSettings) {
        if (featureSettings.getCameraMode() != 0 && featureSettings.getIsUltraHdrOn()) {
            throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". Ultra HDR is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.").toString());
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.getRequiredMaxBitDepth() == 10) {
            throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". 10 bit dynamic range is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.").toString());
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.getIsFeatureComboInvocation()) {
            throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". feature combination is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.").toString());
        }
        if (featureSettings.getIsHighSpeedOn() && featureSettings.getIsFeatureComboInvocation()) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (!featureSettings.getIsHighSpeedOn() || this.highSpeedResolver.isHighSpeedSupported()) {
            return featureSettings;
        }
        throw new IllegalArgumentException("High-speed session is not supported on this device.");
    }

    @NotNull
    public final List<Size> applyResolutionSelectionOrderRelatedWorkarounds(@NotNull List<Size> sizeList, int imageFormat) {
        Rational rational;
        ArrayList arrayListF1;
        Intrinsics.checkNotNullParameter(sizeList, "sizeList");
        int i = this.targetAspectRatio.get(this.cameraMetadata, this.streamConfigurationMapCompat);
        if (i == 0) {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i != 1) {
            rational = null;
            if (i == 2) {
                Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
                if (maximumSize != null) {
                    rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
                }
            } else if (i != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + this.targetAspectRatio);
            }
        } else {
            rational = AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational == null) {
            arrayListF1 = d0.f1(sizeList);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : sizeList) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            arrayListF1 = arrayList2;
        }
        return this.resolutionCorrector.insertOrPrioritize(SurfaceConfig.INSTANCE.getConfigType(imageFormat), arrayListF1);
    }

    public final boolean checkSupported(@NotNull FeatureSettings featureSettings, @NotNull List<SurfaceConfig> surfaceConfigList, @NotNull Map<SurfaceConfig, DynamicRange> dynamicRangesBySurfaceConfig, @NotNull List<? extends UseCaseConfig<?>> newUseCaseConfigs, @NotNull List<Integer> useCasesPriorityOrder) {
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        Intrinsics.checkNotNullParameter(surfaceConfigList, "surfaceConfigList");
        Intrinsics.checkNotNullParameter(dynamicRangesBySurfaceConfig, "dynamicRangesBySurfaceConfig");
        Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
        Intrinsics.checkNotNullParameter(useCasesPriorityOrder, "useCasesPriorityOrder");
        List<SurfaceCombination> surfaceCombinationsByFeatureSettings = getSurfaceCombinationsByFeatureSettings(featureSettings);
        boolean z = false;
        if (!(surfaceCombinationsByFeatureSettings instanceof Collection) || !surfaceCombinationsByFeatureSettings.isEmpty()) {
            Iterator<T> it8 = surfaceCombinationsByFeatureSettings.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((SurfaceCombination) it8.next()).getOrderedSupportedSurfaceConfigList(surfaceConfigList) != null) {
                    z = true;
                    break;
                }
            }
        }
        if (!z || !featureSettings.getRequiresFeatureComboQuery()) {
            return z;
        }
        SessionConfig sessionConfigCreateFeatureComboSessionConfig = createFeatureComboSessionConfig(featureSettings, surfaceConfigList, dynamicRangesBySurfaceConfig, newUseCaseConfigs, useCasesPriorityOrder);
        boolean zIsSupported = this.featureCombinationQuery.isSupported(sessionConfigCreateFeatureComboSessionConfig);
        List<DeferrableSurface> surfaces = sessionConfigCreateFeatureComboSessionConfig.getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        Iterator<T> it9 = surfaces.iterator();
        while (it9.hasNext()) {
            ((DeferrableSurface) it9.next()).close();
        }
        return zIsSupported;
    }

    @NotNull
    public final Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes$camera_camera2(@NotNull Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, @NotNull FeatureSettings featureSettings, boolean forceUniqueMaxFpsFiltering) {
        Intrinsics.checkNotNullParameter(newUseCaseConfigsSupportedSizeMap, "newUseCaseConfigsSupportedSizeMap");
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UseCaseConfig<?> useCaseConfig : newUseCaseConfigsSupportedSizeMap.keySet()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<Size> list = newUseCaseConfigsSupportedSizeMap.get(useCaseConfig);
            Intrinsics.h(list);
            for (Size size : list) {
                int inputFormat = useCaseConfig.getInputFormat();
                int customMaxFrameRate = useCaseConfig.getCustomMaxFrameRate(size);
                StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
                Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
                populateReducedSizeListAndUniqueMaxFpsMap(featureSettings, size, inputFormat, customMaxFrameRate, streamUseCase, forceUniqueMaxFpsFiltering, linkedHashMap2, arrayList);
            }
            linkedHashMap.put(useCaseConfig, arrayList);
        }
        return linkedHashMap;
    }

    public final Size getMaxOutputSizeByFormat$camera_camera2(StreamConfigurationMap map, int imageFormat, boolean highResolutionIncluded, Rational aspectRatio) {
        Size[] outputSizes = getOutputSizes(map, imageFormat, aspectRatio);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        Size size = (Size) Collections.max(p.c(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        if (highResolutionIncluded) {
            Size[] highResolutionOutputSizes = map != null ? map.getHighResolutionOutputSizes(imageFormat) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size2 = (Size) Collections.max(p.c(highResolutionOutputSizes), compareSizesByArea);
            }
        }
        return (Size) Collections.max(v.k(size, size2), compareSizesByArea);
    }

    @NotNull
    public final SurfaceStreamSpecQueryResult getSuggestedStreamSpecifications(int cameraMode, @NotNull List<? extends AttachedSurfaceInfo> attachedSurfaces, @NotNull Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, @NotNull VideoStabilization videoStabilization, boolean hasVideoCapture, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        Pair pair;
        Map<UseCaseConfig<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap2 = newUseCaseConfigsSupportedSizeMap;
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(newUseCaseConfigsSupportedSizeMap2, "newUseCaseConfigsSupportedSizeMap");
        Intrinsics.checkNotNullParameter(videoStabilization, "videoStabilization");
        refreshPreviewSize();
        boolean zIsHighSpeedOn = HighSpeedResolver.INSTANCE.isHighSpeedOn(attachedSurfaces, newUseCaseConfigsSupportedSizeMap2.keySet());
        if (zIsHighSpeedOn) {
            newUseCaseConfigsSupportedSizeMap2 = this.highSpeedResolver.filterCommonSupportedSizes(newUseCaseConfigsSupportedSizeMap2);
        }
        Map<UseCaseConfig<?>, ? extends List<Size>> map = newUseCaseConfigsSupportedSizeMap2;
        List<? extends UseCaseConfig<?>> listD1 = d0.d1(map.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(listD1);
        Map<UseCaseConfig<?>, DynamicRange> mapResolveAndValidateDynamicRanges = this.dynamicRangeResolver.resolveAndValidateDynamicRanges(attachedSurfaces, listD1, useCasesPriorityOrder);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "resolvedDynamicRanges = " + mapResolveAndValidateDynamicRanges;
        }
        boolean zIsUltraHdrOn = INSTANCE.isUltraHdrOn(attachedSurfaces, map);
        if (findMaxSupportedFrameRate) {
            pair = new Pair(Boolean.FALSE, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        } else {
            boolean zIsStrictFpsRequired = isStrictFpsRequired(attachedSurfaces, listD1);
            pair = new Pair(Boolean.valueOf(zIsStrictFpsRequired), getTargetFpsRange(attachedSurfaces, listD1, useCasesPriorityOrder, zIsStrictFpsRequired));
        }
        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
        Range<Integer> range = (Range) pair.f186386b;
        boolean z = videoStabilization == VideoStabilization.PREVIEW;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused2 = Camera2Logger.TRUNCATED_TAG;
            String str2 = "getSuggestedStreamSpecifications: isPreviewStabilizationSupported = " + this.isPreviewStabilizationSupported + ", isFeatureComboInvocation = " + isFeatureComboInvocation;
        }
        if (z && !this.isPreviewStabilizationSupported && isFeatureComboInvocation) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        Intrinsics.h(range);
        return resolveSpecsByCheckingMethod(getCheckingMethod(mapResolveAndValidateDynamicRanges.values(), range, videoStabilization, zIsUltraHdrOn, isFeatureComboInvocation), createFeatureSettings(cameraMode, hasVideoCapture, mapResolveAndValidateDynamicRanges, videoStabilization, zIsUltraHdrOn, zIsHighSpeedOn, isFeatureComboInvocation, false, range, zBooleanValue), attachedSurfaces, map, listD1, useCasesPriorityOrder, mapResolveAndValidateDynamicRanges, findMaxSupportedFrameRate);
    }

    @NotNull
    public final SurfaceSizeDefinition getSurfaceSizeDefinition$camera_camera2() {
        SurfaceSizeDefinition surfaceSizeDefinition = this.surfaceSizeDefinition;
        if (surfaceSizeDefinition != null) {
            return surfaceSizeDefinition;
        }
        Intrinsics.r("surfaceSizeDefinition");
        throw null;
    }

    @NotNull
    public final SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int format) {
        if (!this.surfaceSizeDefinitionFormats.contains(Integer.valueOf(format))) {
            Map<Integer, Size> s720pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap();
            Intrinsics.checkNotNullExpressionValue(s720pSizeMap, "getS720pSizeMap(...)");
            Size RESOLUTION_720P = SizeUtil.RESOLUTION_720P;
            Intrinsics.checkNotNullExpressionValue(RESOLUTION_720P, "RESOLUTION_720P");
            updateS720pOrS1440pSizeByFormat(s720pSizeMap, RESOLUTION_720P, format);
            Map<Integer, Size> s1440pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap();
            Intrinsics.checkNotNullExpressionValue(s1440pSizeMap, "getS1440pSizeMap(...)");
            Size RESOLUTION_1440P = SizeUtil.RESOLUTION_1440P;
            Intrinsics.checkNotNullExpressionValue(RESOLUTION_1440P, "RESOLUTION_1440P");
            updateS720pOrS1440pSizeByFormat(s1440pSizeMap, RESOLUTION_1440P, format);
            Map<Integer, Size> maximumSizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap();
            Intrinsics.checkNotNullExpressionValue(maximumSizeMap, "getMaximumSizeMap(...)");
            updateMaximumSizeByFormat$default(this, maximumSizeMap, format, null, 4, null);
            Map<Integer, Size> maximum4x3SizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap();
            Intrinsics.checkNotNullExpressionValue(maximum4x3SizeMap, "getMaximum4x3SizeMap(...)");
            updateMaximumSizeByFormat(maximum4x3SizeMap, format, AspectRatioUtil.ASPECT_RATIO_4_3);
            Map<Integer, Size> maximum16x9SizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap();
            Intrinsics.checkNotNullExpressionValue(maximum16x9SizeMap, "getMaximum16x9SizeMap(...)");
            updateMaximumSizeByFormat(maximum16x9SizeMap, format, AspectRatioUtil.ASPECT_RATIO_16_9);
            Map<Integer, Size> ultraMaximumSizeMap = getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap();
            Intrinsics.checkNotNullExpressionValue(ultraMaximumSizeMap, "getUltraMaximumSizeMap(...)");
            updateUltraMaximumSizeByFormat(ultraMaximumSizeMap, format);
            this.surfaceSizeDefinitionFormats.add(Integer.valueOf(format));
        }
        return getSurfaceSizeDefinition$camera_camera2();
    }

    public final void setSurfaceSizeDefinition$camera_camera2(@NotNull SurfaceSizeDefinition surfaceSizeDefinition) {
        Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "<set-?>");
        this.surfaceSizeDefinition = surfaceSizeDefinition;
    }

    @NotNull
    public final SurfaceConfig transformSurfaceConfig(int cameraMode, int imageFormat, @NotNull Size size, @NotNull StreamUseCase streamUseCase) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        return SurfaceConfig.INSTANCE.transformSurfaceConfig(imageFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(imageFormat), cameraMode, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    private final int getMaxFrameRate(int imageFormat, Size size) {
        long outputMinFrameDuration = getStreamConfigurationMapCompat().getOutputMinFrameDuration(imageFormat, size);
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.isManualSensorSupported) {
            return Integer.MAX_VALUE;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled("CXCP")) {
            return 0;
        }
        String unused = Camera2Logger.TRUNCATED_TAG;
        String str = "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + imageFormat + ", size = " + size;
        return 0;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011Jz\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010!R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010!R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010!R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000f\u0010!¨\u0006)"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "", "", "cameraMode", "requiredMaxBitDepth", "", "hasVideoCapture", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "videoStabilization", "isUltraHdrOn", "isHighSpeedOn", "isFeatureComboInvocation", "requiresFeatureComboQuery", "Landroid/util/Range;", "targetFpsRange", "isStrictFpsRequired", "<init>", "(IIZLandroidx/camera/core/impl/stabilization/VideoStabilization;ZZZZLandroid/util/Range;Z)V", "copy", "(IIZLandroidx/camera/core/impl/stabilization/VideoStabilization;ZZZZLandroid/util/Range;Z)Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCameraMode", "getRequiredMaxBitDepth", "Z", "getHasVideoCapture", "()Z", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getVideoStabilization", "()Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getRequiresFeatureComboQuery", "Landroid/util/Range;", "getTargetFpsRange", "()Landroid/util/Range;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeatureSettings {
        private final int cameraMode;
        private final boolean hasVideoCapture;
        private final boolean isFeatureComboInvocation;
        private final boolean isHighSpeedOn;
        private final boolean isStrictFpsRequired;
        private final boolean isUltraHdrOn;
        private final int requiredMaxBitDepth;
        private final boolean requiresFeatureComboQuery;

        @NotNull
        private final Range<Integer> targetFpsRange;

        @NotNull
        private final VideoStabilization videoStabilization;

        public FeatureSettings(int i, int i2, boolean z, @NotNull VideoStabilization videoStabilization, boolean z3, boolean z4, boolean z6, boolean z11, @NotNull Range<Integer> targetFpsRange, boolean z12) {
            Intrinsics.checkNotNullParameter(videoStabilization, "videoStabilization");
            Intrinsics.checkNotNullParameter(targetFpsRange, "targetFpsRange");
            this.cameraMode = i;
            this.requiredMaxBitDepth = i2;
            this.hasVideoCapture = z;
            this.videoStabilization = videoStabilization;
            this.isUltraHdrOn = z3;
            this.isHighSpeedOn = z4;
            this.isFeatureComboInvocation = z6;
            this.requiresFeatureComboQuery = z11;
            this.targetFpsRange = targetFpsRange;
            this.isStrictFpsRequired = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeatureSettings copy$default(FeatureSettings featureSettings, int i, int i2, boolean z, VideoStabilization videoStabilization, boolean z3, boolean z4, boolean z6, boolean z11, Range range, boolean z12, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = featureSettings.cameraMode;
            }
            if ((i3 & 2) != 0) {
                i2 = featureSettings.requiredMaxBitDepth;
            }
            if ((i3 & 4) != 0) {
                z = featureSettings.hasVideoCapture;
            }
            if ((i3 & 8) != 0) {
                videoStabilization = featureSettings.videoStabilization;
            }
            if ((i3 & 16) != 0) {
                z3 = featureSettings.isUltraHdrOn;
            }
            if ((i3 & 32) != 0) {
                z4 = featureSettings.isHighSpeedOn;
            }
            if ((i3 & 64) != 0) {
                z6 = featureSettings.isFeatureComboInvocation;
            }
            if ((i3 & 128) != 0) {
                z11 = featureSettings.requiresFeatureComboQuery;
            }
            if ((i3 & 256) != 0) {
                range = featureSettings.targetFpsRange;
            }
            if ((i3 & 512) != 0) {
                z12 = featureSettings.isStrictFpsRequired;
            }
            Range range2 = range;
            boolean z29 = z12;
            boolean z31 = z6;
            boolean z41 = z11;
            boolean z49 = z3;
            boolean z54 = z4;
            return featureSettings.copy(i, i2, z, videoStabilization, z49, z54, z31, z41, range2, z29);
        }

        @NotNull
        public final FeatureSettings copy(int cameraMode, int requiredMaxBitDepth, boolean hasVideoCapture, @NotNull VideoStabilization videoStabilization, boolean isUltraHdrOn, boolean isHighSpeedOn, boolean isFeatureComboInvocation, boolean requiresFeatureComboQuery, @NotNull Range<Integer> targetFpsRange, boolean isStrictFpsRequired) {
            Intrinsics.checkNotNullParameter(videoStabilization, "videoStabilization");
            Intrinsics.checkNotNullParameter(targetFpsRange, "targetFpsRange");
            return new FeatureSettings(cameraMode, requiredMaxBitDepth, hasVideoCapture, videoStabilization, isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, requiresFeatureComboQuery, targetFpsRange, isStrictFpsRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureSettings)) {
                return false;
            }
            FeatureSettings featureSettings = (FeatureSettings) other;
            return this.cameraMode == featureSettings.cameraMode && this.requiredMaxBitDepth == featureSettings.requiredMaxBitDepth && this.hasVideoCapture == featureSettings.hasVideoCapture && this.videoStabilization == featureSettings.videoStabilization && this.isUltraHdrOn == featureSettings.isUltraHdrOn && this.isHighSpeedOn == featureSettings.isHighSpeedOn && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery && Intrinsics.f(this.targetFpsRange, featureSettings.targetFpsRange) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired;
        }

        public final int getCameraMode() {
            return this.cameraMode;
        }

        public final boolean getHasVideoCapture() {
            return this.hasVideoCapture;
        }

        public final int getRequiredMaxBitDepth() {
            return this.requiredMaxBitDepth;
        }

        public final boolean getRequiresFeatureComboQuery() {
            return this.requiresFeatureComboQuery;
        }

        @NotNull
        public final Range<Integer> getTargetFpsRange() {
            return this.targetFpsRange;
        }

        @NotNull
        public final VideoStabilization getVideoStabilization() {
            return this.videoStabilization;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStrictFpsRequired) + ((this.targetFpsRange.hashCode() + a.c(a.c(a.c(a.c((this.videoStabilization.hashCode() + a.c(a.b(this.requiredMaxBitDepth, Integer.hashCode(this.cameraMode) * 31, 31), 31, this.hasVideoCapture)) * 31, 31, this.isUltraHdrOn), 31, this.isHighSpeedOn), 31, this.isFeatureComboInvocation), 31, this.requiresFeatureComboQuery)) * 31);
        }

        /* JADX INFO: renamed from: isFeatureComboInvocation, reason: from getter */
        public final boolean getIsFeatureComboInvocation() {
            return this.isFeatureComboInvocation;
        }

        /* JADX INFO: renamed from: isHighSpeedOn, reason: from getter */
        public final boolean getIsHighSpeedOn() {
            return this.isHighSpeedOn;
        }

        /* JADX INFO: renamed from: isStrictFpsRequired, reason: from getter */
        public final boolean getIsStrictFpsRequired() {
            return this.isStrictFpsRequired;
        }

        /* JADX INFO: renamed from: isUltraHdrOn, reason: from getter */
        public final boolean getIsUltraHdrOn() {
            return this.isUltraHdrOn;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("FeatureSettings(cameraMode=");
            sb6.append(this.cameraMode);
            sb6.append(", requiredMaxBitDepth=");
            sb6.append(this.requiredMaxBitDepth);
            sb6.append(", hasVideoCapture=");
            sb6.append(this.hasVideoCapture);
            sb6.append(", videoStabilization=");
            sb6.append(this.videoStabilization);
            sb6.append(", isUltraHdrOn=");
            sb6.append(this.isUltraHdrOn);
            sb6.append(", isHighSpeedOn=");
            sb6.append(this.isHighSpeedOn);
            sb6.append(", isFeatureComboInvocation=");
            sb6.append(this.isFeatureComboInvocation);
            sb6.append(", requiresFeatureComboQuery=");
            sb6.append(this.requiresFeatureComboQuery);
            sb6.append(", targetFpsRange=");
            sb6.append(this.targetFpsRange);
            sb6.append(", isStrictFpsRequired=");
            return a.x(sb6, this.isStrictFpsRequired, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FeatureSettings(int i, int i2, boolean z, VideoStabilization videoStabilization, boolean z3, boolean z4, boolean z6, boolean z11, Range FRAME_RATE_RANGE_UNSPECIFIED, boolean z12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            z = (i3 & 4) != 0 ? false : z;
            videoStabilization = (i3 & 8) != 0 ? VideoStabilization.UNSPECIFIED : videoStabilization;
            z3 = (i3 & 16) != 0 ? false : z3;
            z4 = (i3 & 32) != 0 ? false : z4;
            z6 = (i3 & 64) != 0 ? false : z6;
            z11 = (i3 & 128) != 0 ? false : z11;
            if ((i3 & 256) != 0) {
                FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            }
            this(i, i2, z, videoStabilization, z3, z4, z6, z11, FRAME_RATE_RANGE_UNSPECIFIED, (i3 & 512) != 0 ? false : z12);
        }
    }
}
