package androidx.camera.camera2.impl;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.config.UseCaseCameraComponent;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.camera2.internal.DynamicRangeResolver;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import phm.a;
import rsl.p;
import ryd.i;
import skm.e0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002»\u0001B©\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b+\u0010,J\u0011\u00101\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b/\u00100J\u001b\u00105\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0004\b7\u00106J\u0015\u00109\u001a\u00020*2\u0006\u00108\u001a\u000203¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020*2\u0006\u00108\u001a\u000203¢\u0006\u0004\b;\u0010:J\u0015\u0010<\u001a\u00020*2\u0006\u00108\u001a\u000203¢\u0006\u0004\b<\u0010:J\u0015\u0010=\u001a\u00020*2\u0006\u00108\u001a\u000203¢\u0006\u0004\b=\u0010:J\u0015\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020(¢\u0006\u0004\b?\u0010,J\u0017\u0010A\u001a\u0004\u0018\u00010*2\u0006\u0010@\u001a\u00020(¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020*H\u0086@¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ)\u0010P\u001a\u00020M2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020(H\u0001¢\u0006\u0004\bN\u0010OJ\u0017\u0010U\u001a\u00020*2\u0006\u0010R\u001a\u00020QH\u0000¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020*H\u0003¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\u00020*2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002030XH\u0002¢\u0006\u0004\bZ\u0010[J\u001d\u0010]\u001a\u00020*2\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\b]\u0010[J\u000f\u0010^\u001a\u00020*H\u0003¢\u0006\u0004\b^\u0010WJ\u0017\u0010`\u001a\u00020*2\u0006\u0010_\u001a\u00020MH\u0003¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020*2\u0006\u0010_\u001a\u00020MH\u0003¢\u0006\u0004\bb\u0010aJ\u0015\u0010c\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020(2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\be\u0010fJ\u001d\u0010g\u001a\u00020(2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\bg\u0010fJ\u0019\u0010i\u001a\u00020(*\b\u0012\u0004\u0012\u0002030hH\u0002¢\u0006\u0004\bi\u0010jJ\u001d\u0010k\u001a\u00020(2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\bk\u0010fJ\u001d\u0010l\u001a\u00020(2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002030XH\u0003¢\u0006\u0004\bl\u0010fJ\u000f\u0010m\u001a\u00020*H\u0003¢\u0006\u0004\bm\u0010WJ\u000f\u0010n\u001a\u00020*H\u0003¢\u0006\u0004\bn\u0010WJ\u0019\u0010o\u001a\u00020(*\b\u0012\u0004\u0012\u0002030hH\u0002¢\u0006\u0004\bo\u0010jJ\u000f\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\bq\u0010rJ\u001d\u0010u\u001a\u00020p2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020s02H\u0002¢\u0006\u0004\bu\u0010vJ\u001f\u0010w\u001a\b\u0012\u0004\u0012\u00020s02*\b\u0012\u0004\u0012\u0002030hH\u0002¢\u0006\u0004\bw\u0010xJ!\u0010{\u001a\u0010\u0012\f\u0012\n z*\u0004\u0018\u00010y0y02*\u000203H\u0002¢\u0006\u0004\b{\u0010|J\u0019\u0010}\u001a\u00020(*\b\u0012\u0004\u0012\u0002030hH\u0002¢\u0006\u0004\b}\u0010jJ\u001f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~02*\b\u0012\u0004\u0012\u0002030hH\u0002¢\u0006\u0004\b\u007f\u0010xJ\u0012\u0010\u0080\u0001\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u0082\u0001\u0010WR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0083\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0084\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0085\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0086\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0087\u0001R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0088\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0089\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u008a\u0001R\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u008b\u0001R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008b\u0001R\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u008b\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u008c\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u008d\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u008e\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u008f\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0088\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0088\u0001R\u0019\u0010\u0095\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0097\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010>\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b>\u0010\u0096\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0088\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R$\u0010¥\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020Q0¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R&\u0010®\u0001\u001a\u0011\u0012\f\u0012\n z*\u0004\u0018\u00010\r0\r0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0088\u0001R8\u0010±\u0001\u001a\u0005\u0018\u00010¯\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\u0017\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001¨\u0006¼\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseManager;", "", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/core/concurrent/CameraCoordinator;", "cameraCoordinator", "Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "builder", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "Ljava/util/Set;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "controls", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "camera2CameraControl", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "Lphm/a;", "Landroidx/camera/core/impl/CameraInternal;", "cameraInternal", "Landroidx/camera/camera2/impl/UseCaseThreads;", "useCaseThreads", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "encoderProfilesProvider", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "cameraGraphConfigProvider", "Landroid/content/Context;", "context", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "displayInfoManager", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/core/concurrent/CameraCoordinator;Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/impl/LowLightBoostControl;Ljava/util/Set;Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/camera/camera2/adapter/CameraStateAdapter;Lphm/a;Lphm/a;Lphm/a;Landroidx/camera/core/impl/EncoderProfilesProvider;Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/core/CameraXConfig;Landroidx/camera/camera2/impl/CameraGraphConfigProvider;Landroid/content/Context;Landroidx/camera/camera2/impl/DisplayInfoManager;)V", "", "createImmediately", "", "setCameraGraphCreationMode$camera_camera2", "(Z)V", "setCameraGraphCreationMode", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig$camera_camera2", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig", "", "Landroidx/camera/core/UseCase;", "useCases", "attach", "(Ljava/util/List;)V", "detach", "useCase", "activate", "(Landroidx/camera/core/UseCase;)V", "deactivate", "update", "reset", "isPrimary", "setPrimary", "enabled", "setActiveResumeMode", "(Z)Lkotlin/Unit;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "graphStateToCameraStateAdapter", "isExtensions", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "createUseCaseCameraConfig$camera_camera2", "(Landroidx/camera/camera2/adapter/SessionConfigAdapter;Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Z)Landroidx/camera/camera2/config/UseCaseCameraConfig;", "createUseCaseCameraConfig", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "resumeDeferredComponentCreation$camera_camera2", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "resumeDeferredComponentCreation", "refreshRunningUseCases", "()V", "", "runningUseCases", "updateRunningUseCases", "(Ljava/util/Set;)V", "newUseCases", "refreshAttachedUseCases", "closeCurrentUseCases", "useCaseCameraConfig", "tryResumeUseCaseManager", "(Landroidx/camera/camera2/config/UseCaseCameraConfig;)V", "beginComponentCreation", "getRunningUseCases", "()Ljava/util/Set;", "addOrRemoveRepeatingUseCase", "(Ljava/util/Set;)Z", "isMeteringRepeatingRequired", "", "shouldForceRepeatingStream", "(Ljava/util/Collection;)Z", "shouldAddRepeatingUseCase", "shouldRemoveRepeatingUseCase", "addRepeatingUseCase", "removeRepeatingUseCase", "isMeteringCombinationSupported", "", "getCameraMode", "()I", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "attachedSurfaceInfoList", "getRequiredMaxBitDepth", "(Ljava/util/List;)I", "getAttachedSurfaceInfoList", "(Ljava/util/Collection;)Ljava/util/List;", "Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "kotlin.jvm.PlatformType", "getCaptureTypes", "(Landroidx/camera/core/UseCase;)Ljava/util/List;", "isUltraHdrOn", "Landroidx/camera/core/impl/SurfaceConfig;", "getSessionSurfacesConfigs", "createMeteringRepeatingSurfaceConfig", "()Landroidx/camera/core/impl/SurfaceConfig;", "updateZslDisabledByUseCaseConfigStatus", "Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/core/concurrent/CameraCoordinator;", "Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "Landroidx/camera/camera2/adapter/ZslControl;", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "Ljava/util/Set;", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Lphm/a;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "lock", "Ljava/lang/Object;", "", "attachedUseCases", "activeUseCases", "activeResumeEnabled", "Z", "shouldCreateCameraGraphImmediately", "deferredUseCaseCameraConfig", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "pendingUseCasesToNotifyCameraControlReady", "Landroidx/camera/camera2/impl/MeteringRepeating;", "meteringRepeating", "Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", "supportedSurfaceCombination", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "dynamicRangeResolver", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "Lkotlin/Function1;", "defaultCameraGraphFactory", "Lkotlin/jvm/functions/Function1;", "Landroidx/camera/camera2/config/UseCaseCameraComponent;", "_activeComponent", "Landroidx/camera/camera2/config/UseCaseCameraComponent;", "", "Lkotlinx/coroutines/Job;", "closingCameraJobs", "Ljava/util/List;", "allControls", "Landroidx/camera/core/impl/SessionProcessor;", "value", "sessionProcessor", "Landroidx/camera/core/impl/SessionProcessor;", "getSessionProcessor$camera_camera2", "()Landroidx/camera/core/impl/SessionProcessor;", "setSessionProcessor$camera_camera2", "(Landroidx/camera/core/impl/SessionProcessor;)V", "Landroidx/camera/camera2/impl/UseCaseCamera;", "getCamera", "()Landroidx/camera/camera2/impl/UseCaseCamera;", "camera", "RunningUseCasesChangeListener", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseManager {
    private volatile UseCaseCameraComponent _activeComponent;
    private boolean activeResumeEnabled;

    @NotNull
    private final Set<UseCase> activeUseCases;

    @NotNull
    private final Set<UseCaseCameraControl> allControls;

    @NotNull
    private final Set<UseCase> attachedUseCases;

    @NotNull
    private final UseCaseCameraComponent.Builder builder;

    @NotNull
    private final Camera2CameraControl camera2CameraControl;

    @NotNull
    private final CameraCoordinator cameraCoordinator;

    @NotNull
    private final CameraGraphConfigProvider cameraGraphConfigProvider;

    @NotNull
    private final a cameraInfoInternal;

    @NotNull
    private final a cameraInternal;

    @NotNull
    private final CameraPipe cameraPipe;

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final CameraStateAdapter cameraStateAdapter;

    @NotNull
    private final CameraXConfig cameraXConfig;

    @NotNull
    private final List<Job> closingCameraJobs;

    @NotNull
    private final Set<UseCaseCameraControl> controls;

    @NotNull
    private final Function1<CameraGraph.Config, CameraGraph> defaultCameraGraphFactory;
    private UseCaseCameraConfig deferredUseCaseCameraConfig;

    @NotNull
    private final DynamicRangeResolver dynamicRangeResolver;

    @NotNull
    private final EncoderProfilesProvider encoderProfilesProvider;
    private boolean isPrimary;

    @NotNull
    private final Object lock;

    @NotNull
    private final LowLightBoostControl lowLightBoostControl;

    @NotNull
    private final MeteringRepeating meteringRepeating;

    @NotNull
    private final Set<UseCase> pendingUseCasesToNotifyCameraControlReady;
    private boolean shouldCreateCameraGraphImmediately;

    @NotNull
    private final SupportedSurfaceCombination supportedSurfaceCombination;

    @NotNull
    private final a useCaseThreads;

    @NotNull
    private final ZslControl zslControl;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "", "onRunningUseCasesChanged", "", "runningUseCases", "", "Landroidx/camera/core/UseCase;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RunningUseCasesChangeListener {
        void onRunningUseCasesChanged(@NotNull Set<? extends UseCase> runningUseCases);
    }

    public UseCaseManager(@NotNull CameraPipe cameraPipe, @NotNull CameraCoordinator cameraCoordinator, @NotNull UseCaseCameraComponent.Builder builder, @NotNull ZslControl zslControl, @NotNull LowLightBoostControl lowLightBoostControl, @NotNull Set<UseCaseCameraControl> controls, @NotNull Camera2CameraControl camera2CameraControl, @NotNull CameraStateAdapter cameraStateAdapter, @NotNull a cameraInternal, @NotNull a useCaseThreads, @NotNull a cameraInfoInternal, @NotNull EncoderProfilesProvider encoderProfilesProvider, @NotNull CameraProperties cameraProperties, @NotNull CameraXConfig cameraXConfig, @NotNull CameraGraphConfigProvider cameraGraphConfigProvider, @NotNull Context context, @NotNull DisplayInfoManager displayInfoManager) {
        Intrinsics.checkNotNullParameter(cameraPipe, "cameraPipe");
        Intrinsics.checkNotNullParameter(cameraCoordinator, "cameraCoordinator");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(zslControl, "zslControl");
        Intrinsics.checkNotNullParameter(lowLightBoostControl, "lowLightBoostControl");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(camera2CameraControl, "camera2CameraControl");
        Intrinsics.checkNotNullParameter(cameraStateAdapter, "cameraStateAdapter");
        Intrinsics.checkNotNullParameter(cameraInternal, "cameraInternal");
        Intrinsics.checkNotNullParameter(useCaseThreads, "useCaseThreads");
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(encoderProfilesProvider, "encoderProfilesProvider");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        Intrinsics.checkNotNullParameter(cameraGraphConfigProvider, "cameraGraphConfigProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayInfoManager, "displayInfoManager");
        this.cameraPipe = cameraPipe;
        this.cameraCoordinator = cameraCoordinator;
        this.builder = builder;
        this.zslControl = zslControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.controls = controls;
        this.camera2CameraControl = camera2CameraControl;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraInternal = cameraInternal;
        this.useCaseThreads = useCaseThreads;
        this.cameraInfoInternal = cameraInfoInternal;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.cameraProperties = cameraProperties;
        this.cameraXConfig = cameraXConfig;
        this.cameraGraphConfigProvider = cameraGraphConfigProvider;
        this.lock = new Object();
        this.attachedUseCases = new LinkedHashSet();
        this.activeUseCases = new LinkedHashSet();
        this.shouldCreateCameraGraphImmediately = true;
        this.isPrimary = true;
        this.pendingUseCasesToNotifyCameraControlReady = new LinkedHashSet();
        this.meteringRepeating = new MeteringRepeating.Builder(cameraProperties, displayInfoManager).build();
        this.supportedSurfaceCombination = new SupportedSurfaceCombination(context, cameraProperties.getMetadata(), encoderProfilesProvider, FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY);
        this.dynamicRangeResolver = new DynamicRangeResolver(cameraProperties.getMetadata());
        this.defaultCameraGraphFactory = new i(this, 6);
        this.closingCameraJobs = new ArrayList();
        Set<UseCaseCameraControl> setH1 = d0.h1(controls);
        setH1.add(camera2CameraControl);
        this.allControls = setH1;
    }

    private final boolean addOrRemoveRepeatingUseCase(Set<? extends UseCase> runningUseCases) {
        if (shouldAddRepeatingUseCase(runningUseCases)) {
            addRepeatingUseCase();
            return true;
        }
        if (!shouldRemoveRepeatingUseCase(runningUseCases)) {
            return false;
        }
        removeRepeatingUseCase();
        return true;
    }

    private final void addRepeatingUseCase() {
        this.meteringRepeating.bindToCamera((CameraInternal) this.cameraInternal.get(), null, null, null);
        this.meteringRepeating.setupSession();
        attach(u.c(this.meteringRepeating));
        activate(this.meteringRepeating);
    }

    private final void beginComponentCreation(UseCaseCameraConfig useCaseCameraConfig) {
        this._activeComponent = this.builder.config(useCaseCameraConfig).build();
        UseCaseCamera camera = getCamera();
        if (camera == null) {
            throw new IllegalStateException("Required value was null.");
        }
        camera.start();
        Iterator<UseCaseCameraControl> it8 = this.allControls.iterator();
        while (it8.hasNext()) {
            it8.next().setRequestControl(camera.getRequestControl());
        }
        camera.setActiveResumeMode(this.activeResumeEnabled);
        updateRunningUseCases(getRunningUseCases());
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Notifying " + this.pendingUseCasesToNotifyCameraControlReady + " camera control ready";
        }
        Iterator<UseCase> it9 = this.pendingUseCasesToNotifyCameraControlReady.iterator();
        while (it9.hasNext()) {
            it9.next().onCameraControlReady();
        }
        this.pendingUseCasesToNotifyCameraControlReady.clear();
    }

    private final void closeCurrentUseCases() {
        Job jobClose;
        UseCaseCamera camera = getCamera();
        this._activeComponent = null;
        this.cameraCoordinator.removePendingCameraInfo((CameraInfo) this.cameraInfoInternal.get());
        if (camera != null && (jobClose = camera.close()) != null) {
            this.closingCameraJobs.add(jobClose);
            jobClose.k(new p(this, jobClose, 22));
        }
        getSessionProcessor$camera_camera2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeCurrentUseCases$lambda$0$0$0(UseCaseManager useCaseManager, Job job2, Throwable th10) {
        synchronized (useCaseManager.lock) {
            useCaseManager.closingCameraJobs.remove(job2);
        }
        return Unit.f186387a;
    }

    private final SurfaceConfig createMeteringRepeatingSurfaceConfig() {
        SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
        int cameraMode = getCameraMode();
        int imageFormat = this.meteringRepeating.getImageFormat();
        Size attachedSurfaceResolution = this.meteringRepeating.getAttachedSurfaceResolution();
        Intrinsics.h(attachedSurfaceResolution);
        StreamUseCase streamUseCase = this.meteringRepeating.getCurrentConfig().getStreamUseCase();
        Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
        return supportedSurfaceCombination.transformSurfaceConfig(cameraMode, imageFormat, attachedSurfaceResolution, streamUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraGraph defaultCameraGraphFactory$lambda$0(UseCaseManager useCaseManager, CameraGraph.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return useCaseManager.cameraPipe.createCameraGraph(config);
    }

    private final List<AttachedSurfaceInfo> getAttachedSurfaceInfoList(Collection<? extends UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase useCase : collection) {
            Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
            StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
            if (attachedSurfaceResolution == null || attachedStreamSpec == null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                arrayList.clear();
                return arrayList;
            }
            SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
            int cameraMode = getCameraMode();
            int inputFormat = useCase.getCurrentConfig().getInputFormat();
            StreamUseCase streamUseCase = useCase.getCurrentConfig().getStreamUseCase();
            Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
            SurfaceConfig surfaceConfigTransformSurfaceConfig = supportedSurfaceCombination.transformSurfaceConfig(cameraMode, inputFormat, attachedSurfaceResolution, streamUseCase);
            int inputFormat2 = useCase.getCurrentConfig().getInputFormat();
            DynamicRange dynamicRange = attachedStreamSpec.getDynamicRange();
            List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
            Config implementationOptions = attachedStreamSpec.getImplementationOptions();
            if (implementationOptions == null) {
                implementationOptions = MutableOptionsBundle.create();
                Intrinsics.checkNotNullExpressionValue(implementationOptions, "create(...)");
            }
            AttachedSurfaceInfo attachedSurfaceInfoCreate = AttachedSurfaceInfo.create(surfaceConfigTransformSurfaceConfig, inputFormat2, attachedSurfaceResolution, dynamicRange, captureTypes, implementationOptions, attachedStreamSpec.getSessionType(), attachedStreamSpec.getExpectedFrameRateRange(), useCase.getCurrentConfig().isStrictFrameRateRequired(), useCase.getCurrentConfig().getCustomMaxFrameRate(attachedSurfaceResolution));
            Intrinsics.checkNotNullExpressionValue(attachedSurfaceInfoCreate, "create(...)");
            arrayList.add(attachedSurfaceInfoCreate);
        }
        return arrayList;
    }

    private final int getCameraMode() {
        synchronized (this.lock) {
            if (this.cameraCoordinator.getCameraOperatingMode() == 2) {
                return 1;
            }
            Unit unit = Unit.f186387a;
            return 0;
        }
    }

    private final List<UseCaseConfigFactory.CaptureType> getCaptureTypes(UseCase useCase) {
        if (!(useCase instanceof StreamSharing)) {
            return u.c(useCase.getCurrentConfig().getCaptureType());
        }
        UseCaseConfig<?> currentConfig = ((StreamSharing) useCase).getCurrentConfig();
        Intrinsics.i(currentConfig, "null cannot be cast to non-null type androidx.camera.core.streamsharing.StreamSharingConfig");
        List<UseCaseConfigFactory.CaptureType> captureTypes = ((StreamSharingConfig) currentConfig).getCaptureTypes();
        Intrinsics.h(captureTypes);
        return captureTypes;
    }

    private final int getRequiredMaxBitDepth(List<? extends AttachedSurfaceInfo> attachedSurfaceInfoList) {
        Iterator<Map.Entry<UseCaseConfig<?>, DynamicRange>> it8 = this.dynamicRangeResolver.resolveAndValidateDynamicRanges(attachedSurfaceInfoList, u.c(this.meteringRepeating.getCurrentConfig()), u.c(0)).entrySet().iterator();
        while (it8.hasNext()) {
            if (it8.next().getValue().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final Set<UseCase> getRunningUseCases() {
        return d0.h0(this.attachedUseCases, this.activeUseCases);
    }

    private final List<SurfaceConfig> getSessionSurfacesConfigs(Collection<? extends UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase useCase : collection) {
            List<DeferrableSurface> surfaces = useCase.getSessionConfig().getSurfaces();
            Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
            for (DeferrableSurface deferrableSurface : surfaces) {
                SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
                int cameraMode = getCameraMode();
                int inputFormat = useCase.getCurrentConfig().getInputFormat();
                Size prescribedSize = deferrableSurface.getPrescribedSize();
                Intrinsics.checkNotNullExpressionValue(prescribedSize, "getPrescribedSize(...)");
                StreamUseCase streamUseCase = useCase.getCurrentConfig().getStreamUseCase();
                Intrinsics.checkNotNullExpressionValue(streamUseCase, "getStreamUseCase(...)");
                arrayList.add(supportedSurfaceCombination.transformSurfaceConfig(cameraMode, inputFormat, prescribedSize, streamUseCase));
            }
        }
        return arrayList;
    }

    private final boolean isMeteringCombinationSupported(Collection<? extends UseCase> collection) {
        if (this.meteringRepeating.getAttachedSurfaceResolution() == null) {
            this.meteringRepeating.setupSession();
        }
        List<AttachedSurfaceInfo> attachedSurfaceInfoList = getAttachedSurfaceInfoList(collection);
        if (attachedSurfaceInfoList.isEmpty()) {
            return false;
        }
        List<SurfaceConfig> sessionSurfacesConfigs = getSessionSurfacesConfigs(collection);
        SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
        SupportedSurfaceCombination.FeatureSettings featureSettings = new SupportedSurfaceCombination.FeatureSettings(getCameraMode(), getRequiredMaxBitDepth(attachedSurfaceInfoList), UseCaseUtil.containsVideoCapture(collection), UseCaseUtil.getVideoStabilization$default(collection, null, 1, null), isUltraHdrOn(collection), false, false, false, null, false, 992, null);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sessionSurfacesConfigs);
        arrayList.add(createMeteringRepeatingSurfaceConfig());
        Unit unit = Unit.f186387a;
        boolean zCheckSupported$default = SupportedSurfaceCombination.checkSupported$default(supportedSurfaceCombination, featureSettings, arrayList, null, null, null, 28, null);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Combination of " + sessionSurfacesConfigs + " + " + this.meteringRepeating + " is supported: " + zCheckSupported$default;
        }
        return zCheckSupported$default;
    }

    private final boolean isMeteringRepeatingRequired(Set<? extends UseCase> runningUseCases) {
        if (!this.cameraXConfig.isRepeatingStreamForced()) {
            return false;
        }
        Set<? extends UseCase> set = runningUseCases;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                UseCase useCase = (UseCase) it8.next();
                if (!Intrinsics.f(useCase, this.meteringRepeating)) {
                    List<DeferrableSurface> surfaces = useCase.getSessionConfig().getSurfaces();
                    Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
                    if (!surfaces.isEmpty()) {
                        Set<UseCase> set2 = this.attachedUseCases;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (!Intrinsics.f((UseCase) obj2, this.meteringRepeating)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty() && shouldForceRepeatingStream(arrayList) && isMeteringCombinationSupported(arrayList)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isUltraHdrOn(Collection<? extends UseCase> collection) {
        UseCaseConfig<?> currentConfig;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (obj2 instanceof ImageCapture) {
                arrayList.add(obj2);
            }
        }
        ImageCapture imageCapture = (ImageCapture) d0.d0(arrayList);
        return (imageCapture == null || (currentConfig = imageCapture.getCurrentConfig()) == null || currentConfig.getInputFormat() != 4101) ? false : true;
    }

    private final void refreshAttachedUseCases(Set<? extends UseCase> newUseCases) {
        closeCurrentUseCases();
        List listD1 = d0.d1(newUseCases);
        if (listD1.isEmpty()) {
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                useCaseCameraControl.setRequestControl(null);
                useCaseCameraControl.reset();
            }
            return;
        }
        if (!this.shouldCreateCameraGraphImmediately) {
            Iterator<UseCaseCameraControl> it8 = this.allControls.iterator();
            while (it8.hasNext()) {
                it8.next().setRequestControl(null);
            }
        }
        GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = new GraphStateToCameraStateAdapter(this.cameraStateAdapter);
        getSessionProcessor$camera_camera2();
        tryResumeUseCaseManager(createUseCaseCameraConfig$camera_camera2(new SessionConfigAdapter(listD1, this.isPrimary), graphStateToCameraStateAdapter, false));
    }

    private final void refreshRunningUseCases() {
        if (this.attachedUseCases.isEmpty()) {
            return;
        }
        Set<UseCase> runningUseCases = getRunningUseCases();
        if (shouldAddRepeatingUseCase(runningUseCases)) {
            addRepeatingUseCase();
        } else if (shouldRemoveRepeatingUseCase(runningUseCases)) {
            removeRepeatingUseCase();
        } else {
            updateRunningUseCases(runningUseCases);
        }
    }

    private final void removeRepeatingUseCase() {
        deactivate(this.meteringRepeating);
        detach(u.c(this.meteringRepeating));
        this.meteringRepeating.unbindFromCamera((CameraInternal) this.cameraInternal.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraGraph resumeDeferredComponentCreation$lambda$0$0(CameraGraph cameraGraph, CameraGraph.Config config) {
        Intrinsics.checkNotNullParameter(config, "<unused var>");
        return cameraGraph;
    }

    private final boolean shouldAddRepeatingUseCase(Set<? extends UseCase> runningUseCases) {
        return this.cameraXConfig.isRepeatingStreamForced() && !this.attachedUseCases.contains(this.meteringRepeating) && isMeteringRepeatingRequired(runningUseCases);
    }

    private final boolean shouldForceRepeatingStream(Collection<? extends UseCase> collection) {
        boolean z;
        if (collection.isEmpty()) {
            return false;
        }
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator<T> it8 = collection.iterator();
        while (it8.hasNext()) {
            validatingBuilder.add(((UseCase) it8.next()).getSessionConfig());
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        Intrinsics.checkNotNullExpressionValue(sessionConfigBuild, "build(...)");
        List<DeferrableSurface> surfaces = sessionConfigBuild.getRepeatingCaptureConfig().getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        List<DeferrableSurface> surfaces2 = sessionConfigBuild.getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces2, "getSurfaces(...)");
        if (surfaces2.isEmpty()) {
            return false;
        }
        List<DeferrableSurface> list = surfaces2;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it9 = list.iterator();
            while (it9.hasNext()) {
                if (!Intrinsics.f(((DeferrableSurface) it9.next()).getContainerClass(), MediaCodec.class)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z || surfaces.isEmpty();
    }

    private final boolean shouldRemoveRepeatingUseCase(Set<? extends UseCase> runningUseCases) {
        return runningUseCases.contains(this.meteringRepeating) && !isMeteringRepeatingRequired(runningUseCases);
    }

    private final void tryResumeUseCaseManager(UseCaseCameraConfig useCaseCameraConfig) {
        if (this.shouldCreateCameraGraphImmediately) {
            beginComponentCreation(useCaseCameraConfig);
        } else {
            this.deferredUseCaseCameraConfig = useCaseCameraConfig;
            this.cameraCoordinator.addPendingCameraInfo((CameraInfo) this.cameraInfoInternal.get());
        }
    }

    private final void updateRunningUseCases(Set<? extends UseCase> runningUseCases) {
        UseCaseCamera camera = getCamera();
        if (camera != null) {
            camera.updateRepeatingRequestAsync(this.isPrimary, runningUseCases);
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                if (useCaseCameraControl instanceof RunningUseCasesChangeListener) {
                    ((RunningUseCasesChangeListener) useCaseCameraControl).onRunningUseCasesChanged(runningUseCases);
                }
            }
        }
    }

    private final void updateZslDisabledByUseCaseConfigStatus() {
        Set<UseCase> set = this.attachedUseCases;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (((UseCase) it8.next()).getCurrentConfig().isZslDisabled(false)) {
                    z = true;
                    break;
                }
            }
        }
        this.zslControl.setZslDisabledByUserCaseConfig(z);
    }

    public final void activate(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        synchronized (this.lock) {
            try {
                if (this.activeUseCases.add(useCase)) {
                    refreshRunningUseCases();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void attach(@NotNull List<? extends UseCase> useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        synchronized (this.lock) {
            if (useCases.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Attach [] from " + this + " (Ignored)";
                }
                return;
            }
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "Attaching " + useCases + " from " + this;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : useCases) {
                if (!this.attachedUseCases.contains((UseCase) obj2)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((UseCase) it8.next()).onSessionStart();
            }
            if (this.attachedUseCases.addAll(useCases) && !addOrRemoveRepeatingUseCase(getRunningUseCases())) {
                updateZslDisabledByUseCaseConfigStatus();
                this.lowLightBoostControl.onSessionConfigChanged(d0.d1(this.attachedUseCases));
                refreshAttachedUseCases(this.attachedUseCases);
            }
            if (this.shouldCreateCameraGraphImmediately) {
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    ((UseCase) it9.next()).onCameraControlReady();
                }
            } else {
                this.pendingUseCasesToNotifyCameraControlReady.addAll(arrayList);
            }
            Unit unit = Unit.f186387a;
        }
    }

    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        List listD1;
        synchronized (this.lock) {
            closeCurrentUseCases();
            this.meteringRepeating.onUnbind();
            listD1 = d0.d1(this.closingCameraJobs);
        }
        Object objZ = e0.z(listD1, continuation);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    @NotNull
    public final UseCaseCameraConfig createUseCaseCameraConfig$camera_camera2(@NotNull SessionConfigAdapter sessionConfigAdapter, @NotNull GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, boolean isExtensions) {
        Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
        Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        UseCaseCameraConfig.Companion companion = UseCaseCameraConfig.INSTANCE;
        CameraGraphConfigProvider cameraGraphConfigProvider = this.cameraGraphConfigProvider;
        Function1<CameraGraph.Config, CameraGraph> function1 = this.defaultCameraGraphFactory;
        getSessionProcessor$camera_camera2();
        return companion.create(sessionConfigAdapter, cameraGraphConfigProvider, function1, graphStateToCameraStateAdapter, null, isExtensions);
    }

    public final void deactivate(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        synchronized (this.lock) {
            try {
                if (this.activeUseCases.remove(useCase)) {
                    refreshRunningUseCases();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void detach(@NotNull List<? extends UseCase> useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        synchronized (this.lock) {
            if (useCases.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Detaching [] from " + this + " (Ignored)";
                }
                return;
            }
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "Detaching " + useCases + " from " + this;
            }
            this.activeUseCases.removeAll(useCases);
            for (UseCase useCase : useCases) {
                if (this.attachedUseCases.contains(useCase)) {
                    useCase.onSessionStop();
                }
            }
            if (this.attachedUseCases.removeAll(useCases)) {
                if (addOrRemoveRepeatingUseCase(getRunningUseCases())) {
                    return;
                }
                if (this.attachedUseCases.isEmpty()) {
                    this.zslControl.setZslDisabledByUserCaseConfig(false);
                    this.lowLightBoostControl.onSessionConfigChanged(f0.f322471a);
                } else {
                    updateZslDisabledByUseCaseConfigStatus();
                    this.lowLightBoostControl.onSessionConfigChanged(d0.d1(this.attachedUseCases));
                }
                refreshAttachedUseCases(this.attachedUseCases);
            }
            this.pendingUseCasesToNotifyCameraControlReady.removeAll(useCases);
            Unit unit = Unit.f186387a;
        }
    }

    public final UseCaseCamera getCamera() {
        UseCaseCameraComponent useCaseCameraComponent = this._activeComponent;
        if (useCaseCameraComponent != null) {
            return useCaseCameraComponent.getUseCaseCamera();
        }
        return null;
    }

    public final CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        CameraGraph.Config cameraGraphConfig;
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            cameraGraphConfig = useCaseCameraConfig != null ? useCaseCameraConfig.getCameraGraphConfig() : null;
        }
        return cameraGraphConfig;
    }

    public final SessionProcessor getSessionProcessor$camera_camera2() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final void reset(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        synchronized (this.lock) {
            try {
                if (this.attachedUseCases.contains(useCase)) {
                    refreshAttachedUseCases(this.attachedUseCases);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void resumeDeferredComponentCreation$camera_camera2(@NotNull CameraGraph cameraGraph) {
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            if (useCaseCameraConfig == null) {
                throw new IllegalStateException("Required value was null.");
            }
            beginComponentCreation(UseCaseCameraConfig.copy$default(useCaseCameraConfig, new i(cameraGraph, 5), null, null, null, null, 30, null));
            Unit unit = Unit.f186387a;
        }
    }

    public final Unit setActiveResumeMode(boolean enabled) {
        Unit unit;
        synchronized (this.lock) {
            this.activeResumeEnabled = enabled;
            UseCaseCamera camera = getCamera();
            if (camera != null) {
                camera.setActiveResumeMode(enabled);
                unit = Unit.f186387a;
            } else {
                unit = null;
            }
        }
        return unit;
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean createImmediately) {
        synchronized (this.lock) {
            try {
                this.shouldCreateCameraGraphImmediately = createImmediately;
                if (createImmediately) {
                    this.deferredUseCaseCameraConfig = null;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void setPrimary(boolean isPrimary) {
        synchronized (this.lock) {
            this.isPrimary = isPrimary;
            Unit unit = Unit.f186387a;
        }
    }

    public final void setSessionProcessor$camera_camera2(SessionProcessor sessionProcessor) {
        synchronized (this.lock) {
            Unit unit = Unit.f186387a;
        }
    }

    @NotNull
    public String toString() {
        return "UseCaseManager<" + this.cameraGraphConfigProvider + '>';
    }

    public final void update(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        synchronized (this.lock) {
            try {
                if (this.attachedUseCases.contains(useCase)) {
                    refreshRunningUseCases();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
