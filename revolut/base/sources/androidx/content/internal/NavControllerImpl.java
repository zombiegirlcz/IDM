package androidx.content.internal;

import ael.s;
import android.os.Bundle;
import androidx.content.FloatingWindow;
import androidx.content.NavArgument;
import androidx.content.NavBackStackEntry;
import androidx.content.NavBackStackEntryState;
import androidx.content.NavController;
import androidx.content.NavControllerViewModel;
import androidx.content.NavDeepLinkRequest;
import androidx.content.NavDestination;
import androidx.content.NavGraph;
import androidx.content.NavOptions;
import androidx.content.NavOptionsBuilder;
import androidx.content.NavOptionsBuilderKt;
import androidx.content.NavUriKt;
import androidx.content.Navigator;
import androidx.content.NavigatorProvider;
import androidx.content.internal.NavControllerImpl;
import androidx.content.serialization.RouteSerializerKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.a;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import jh.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KClass;
import kotlin.text.m;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import nkm.g;
import nkm.t;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import q2k.b;
import rvc.k;
import s4b.e;
import ukm.f;
import vkm.j2;
import vkm.q;
import zhm.a0;
import zhm.b0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.w0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00ad\u00022\u00020\u0001:\u0002\u00ad\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u001f\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010%\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u001bH\u0000¢\u0006\u0004\b#\u0010$J#\u0010+\u001a\u00020\u00052\n\u0010'\u001a\u00060&R\u00020\u00022\u0006\u0010(\u001a\u00020\tH\u0000¢\u0006\u0004\b)\u0010*J'\u00102\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0000¢\u0006\u0004\b0\u00101J9\u00106\u001a\u00020\u00052\n\u0010'\u001a\u00060&R\u00020\u00022\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b4\u00105J1\u0010:\u001a\u00020\u00052\n\u0010'\u001a\u00060&R\u00020\u00022\u0006\u00107\u001a\u00020\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tH\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010B\u001a\u00020\u00052\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010E\u001a\u00020!H\u0000¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020!2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020!H\u0000¢\u0006\u0004\bC\u0010IJ'\u0010E\u001a\u00020!2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bC\u0010JJ'\u0010E\u001a\u00020!2\u0006\u0010L\u001a\u00020K2\u0006\u0010H\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bC\u0010MJ)\u0010%\u001a\u00020!2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010JJ3\u0010%\u001a\u00020!\"\b\b\u0000\u0010N*\u00020\u00012\u0006\u0010L\u001a\u00028\u00002\u0006\u0010H\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010OJ'\u0010%\u001a\u00020!2\u0006\u0010L\u001a\u00020K2\u0006\u0010H\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010MJ9\u0010T\u001a\u00020!2\u0010\u0010P\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00152\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010H\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bR\u0010SJ%\u0010X\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\t2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bV\u0010WJ1\u0010^\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0YH\u0000¢\u0006\u0004\b\\\u0010]J\u0017\u0010a\u001a\u00020!2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010c\u001a\u00020!H\u0000¢\u0006\u0004\bb\u0010DJ\u000f\u0010f\u001a\u00020\u0005H\u0000¢\u0006\u0004\bd\u0010eJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0000¢\u0006\u0004\bg\u0010hJ'\u0010o\u001a\u00020\u00052\u0006\u0010k\u001a\u00020j2\u000e\u0010l\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0000¢\u0006\u0004\bm\u0010nJ\u001f\u0010r\u001a\u00020\u00052\u000e\u0010l\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0000¢\u0006\u0004\bp\u0010qJ\u0019\u0010w\u001a\u0004\u0018\u00010K2\u0006\u0010t\u001a\u00020sH\u0000¢\u0006\u0004\bu\u0010vJ%\u0010{\u001a\u0004\u0018\u00010\u00132\u0006\u0010G\u001a\u00020F2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\by\u0010zJ5\u0010\u007f\u001a\u0004\u0018\u00010\u00132\u0006\u0010,\u001a\u00020\u00132\u0006\u0010G\u001a\u00020F2\u0006\u0010|\u001a\u00020!2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b}\u0010~J\u0012\u0010\u0082\u0001\u001a\u00020jH\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J$\u0010\u0085\u0001\u001a\u00020K\"\b\b\u0000\u0010N*\u00020\u00012\u0006\u0010L\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J@\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u00132\u000f\u0010\u0087\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J0\u0010\u008a\u0001\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0014\u0010\u008c\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\u00050\u001bH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u008d\u0001J0\u0010\u008a\u0001\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u008e\u0001J\u0019\u0010\"\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\"\u0010\u0093\u0001\u001a\u00020\u00052\u000f\u0010\u0091\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0000¢\u0006\u0005\b\u0092\u0001\u0010qJ\u001c\u0010\u0098\u0001\u001a\u00020\u00052\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u00052\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001a\u0010 \u0001\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J,\u0010¡\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020\u00132\u000f\u0010\u0087\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J@\u0010¤\u0001\u001a\u00020!2\u0007\u0010£\u0001\u001a\u00020F2\u000f\u0010\u0087\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001JE\u0010¦\u0001\u001a\u00020!2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u000f\u0010\u0087\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J)\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u000f\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YH\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001JE\u0010\u00ad\u0001\u001a\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u00132\u000f\u0010«\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\u0006\u0010(\u001a\u00020\t2\u000f\b\u0002\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0006\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R+\u0010·\u0001\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010\u0081\u0001\"\u0006\bº\u0001\u0010»\u0001R0\u0010¼\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010\u0090\u0001\"\u0005\b¿\u0001\u0010qR6\u0010Á\u0001\u001a\u000f\u0012\b\u0012\u00060-j\u0002`.\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R%\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\t0Y8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R,\u0010Ì\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150Ë\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R,\u0010Ñ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150Ð\u00018AX\u0080\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R,\u0010Õ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150Ë\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Í\u0001\u001a\u0006\bÖ\u0001\u0010Ï\u0001R,\u0010×\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150Ð\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b×\u0001\u0010Ò\u0001\u001a\u0006\bØ\u0001\u0010Ô\u0001R,\u0010Ú\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R-\u0010ß\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030Þ\u00010Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bß\u0001\u0010Û\u0001\u001a\u0006\bà\u0001\u0010Ý\u0001R.\u0010á\u0001\u001a\u0011\u0012\u0004\u0012\u00020F\u0012\u0006\u0012\u0004\u0018\u00010K0Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010Û\u0001\u001a\u0006\bâ\u0001\u0010Ý\u0001R2\u0010ã\u0001\u001a\u0015\u0012\u0004\u0012\u00020K\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010Û\u0001\u001a\u0006\bä\u0001\u0010Ý\u0001R0\u0010æ\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010å\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R,\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R%\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020>0ñ\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0005\bô\u0001\u0010hR*\u0010ö\u0001\u001a\u00030õ\u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R \u0010ý\u0001\u001a\u00030ü\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R*\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R8\u0010\u0088\u0002\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\u0012\b\u0012\u00060&R\u00020\u00020Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010Û\u0001\u001a\u0006\b\u0089\u0002\u0010Ý\u0001R7\u0010\u008a\u0002\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R7\u0010\u0090\u0002\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u008b\u0002\u001a\u0006\b\u0091\u0002\u0010\u008d\u0002\"\u0006\b\u0092\u0002\u0010\u008f\u0002R,\u0010\u0093\u0002\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0Ù\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010Û\u0001\u001a\u0006\b\u0094\u0002\u0010Ý\u0001R\u0019\u0010\u0095\u0002\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001e\u0010\u0097\u0002\u001a\t\u0012\u0004\u0012\u00020\t0ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010ó\u0001R&\u0010\u0099\u0002\u001a\t\u0012\u0004\u0012\u00020\t0\u0098\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0015\u0010 \u0002\u001a\u00030\u009d\u00028F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R'\u0010k\u001a\u00020j2\u0006\u0010k\u001a\u00020j8A@AX\u0080\u000e¢\u0006\u000f\u001a\u0006\b¡\u0002\u0010\u0081\u0001\"\u0005\bm\u0010»\u0001R,\u0010¢\u0002\u001a\u00030\u0081\u00022\b\u0010¢\u0002\u001a\u00030\u0081\u00028@@AX\u0080\u000e¢\u0006\u0010\u001a\u0006\b£\u0002\u0010\u0085\u0002\"\u0006\b¤\u0002\u0010\u0087\u0002R\u0019\u0010§\u0002\u001a\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010ª\u0002\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u0019\u0010¬\u0002\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010©\u0002¨\u0006®\u0002"}, d2 = {"Landroidx/navigation/internal/NavControllerImpl;", "", "Landroidx/navigation/NavController;", "navController", "Lkotlin/Function0;", "", "updateOnBackPressedCallbackEnabledCallback", "<init>", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "linkChildToParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "linkChildToParent", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "handler", "navigateInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lkotlin/jvm/functions/Function1;)V", "navigateInternal", "popUpTo", "", "saveState", "popBackStackInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function1;)V", "popBackStackInternal", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "state", "backStackEntry", "push$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;)V", "push", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "createBackStackEntry$navigation_runtime_release", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "createBackStackEntry", "superCallback", "pop$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function0;)V", "pop", "entry", "markTransitionComplete$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "markTransitionComplete", "prepareForTransition$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)V", "prepareForTransition", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "addOnDestinationChangedListener$navigation_runtime_release", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "addOnDestinationChangedListener", "popBackStack$navigation_runtime_release", "()Z", "popBackStack", "", "destinationId", "inclusive", "(IZ)Z", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", "T", "(Ljava/lang/Object;ZZ)Z", "popOperations", "foundDestination", "executePopOperations$navigation_runtime_release", "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "executePopOperations", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "popBackStackFromNavigator", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/ArrayDeque;)V", "popEntryFromBackStack", "clearBackStackInternal$navigation_runtime_release", "(I)Z", "clearBackStackInternal", "dispatchOnDestinationChanged$navigation_runtime_release", "dispatchOnDestinationChanged", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "Landroidx/navigation/NavGraph;", "graph", "startDestinationArgs", "setGraph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "setGraph", "onGraphCreated$navigation_runtime_release", "(Landroid/os/Bundle;)V", "onGraphCreated", "", "deepLink", "findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release", "([I)Ljava/lang/String;", "findInvalidDestinationDisplayNameInDeepLink", "matchingDest", "findDestination$navigation_runtime_release", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestination", "searchChildren", "findDestinationComprehensive$navigation_runtime_release", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestinationComprehensive", "getTopGraph$navigation_runtime_release", "()Landroidx/navigation/NavGraph;", "getTopGraph", "generateRouteFilled$navigation_runtime_release", "(Ljava/lang/Object;)Ljava/lang/String;", "generateRouteFilled", "node", "args", "navigate$navigation_runtime_release", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "navigate", "Landroidx/navigation/NavOptionsBuilder;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "saveState$navigation_runtime_release", "()Landroid/os/Bundle;", "navState", "restoreState$navigation_runtime_release", "restoreState", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner$navigation_runtime_release", "(Landroidx/lifecycle/LifecycleOwner;)V", "setLifecycleOwner", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore$navigation_runtime_release", "(Landroidx/lifecycle/ViewModelStore;)V", "setViewModelStore", "getBackStackEntry$navigation_runtime_release", "(I)Landroidx/navigation/NavBackStackEntry;", "getBackStackEntry", "launchSingleTopInternal", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "id", "restoreStateInternal", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "executeRestoreState", "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "backStackState", "instantiateBackStack", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", "addEntryToBackStack", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "Lkotlin/jvm/functions/Function0;", "getUpdateOnBackPressedCallbackEnabledCallback", "()Lkotlin/jvm/functions/Function0;", "setUpdateOnBackPressedCallbackEnabledCallback", "(Lkotlin/jvm/functions/Function0;)V", "_graph", "Landroidx/navigation/NavGraph;", "get_graph$navigation_runtime_release", "set_graph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;)V", "navigatorStateToRestore", "Landroid/os/Bundle;", "getNavigatorStateToRestore$navigation_runtime_release", "setNavigatorStateToRestore$navigation_runtime_release", "", "backStackToRestore", "[Landroid/os/Bundle;", "getBackStackToRestore$navigation_runtime_release", "()[Landroid/os/Bundle;", "setBackStackToRestore$navigation_runtime_release", "([Landroid/os/Bundle;)V", "backQueue", "Lkotlin/collections/ArrayDeque;", "getBackQueue$navigation_runtime_release", "()Lkotlin/collections/ArrayDeque;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentBackStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_currentBackStack$navigation_runtime_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "currentBackStack", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentBackStack$navigation_runtime_release", "()Lkotlinx/coroutines/flow/StateFlow;", "_visibleEntries", "get_visibleEntries$navigation_runtime_release", "visibleEntries", "getVisibleEntries$navigation_runtime_release", "", "childToParentEntries", "Ljava/util/Map;", "getChildToParentEntries$navigation_runtime_release", "()Ljava/util/Map;", "Landroidx/navigation/internal/AtomicInt;", "parentToChildCount", "getParentToChildCount$navigation_runtime_release", "backStackMap", "getBackStackMap$navigation_runtime_release", "backStackStates", "getBackStackStates$navigation_runtime_release", "value", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "getViewModel$navigation_runtime_release", "()Landroidx/navigation/NavControllerViewModel;", "setViewModel$navigation_runtime_release", "(Landroidx/navigation/NavControllerViewModel;)V", "", "onDestinationChangedListeners", "Ljava/util/List;", "getOnDestinationChangedListeners$navigation_runtime_release", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getLifecycleObserver$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleObserver;", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "get_navigatorProvider$navigation_runtime_release", "()Landroidx/navigation/NavigatorProvider;", "set_navigatorProvider$navigation_runtime_release", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorState", "getNavigatorState$navigation_runtime_release", "addToBackStackHandler", "Lkotlin/jvm/functions/Function1;", "getAddToBackStackHandler$navigation_runtime_release", "()Lkotlin/jvm/functions/Function1;", "setAddToBackStackHandler$navigation_runtime_release", "(Lkotlin/jvm/functions/Function1;)V", "popFromBackStackHandler", "getPopFromBackStackHandler$navigation_runtime_release", "setPopFromBackStackHandler$navigation_runtime_release", "entrySavedState", "getEntrySavedState$navigation_runtime_release", "dispatchReentrantCount", "I", "backStackEntriesToDispatch", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "get_currentBackStackEntryFlow$navigation_runtime_release", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/navigation/internal/NavContext;", "getNavContext", "()Landroidx/navigation/internal/NavContext;", "navContext", "getGraph$navigation_runtime_release", "navigatorProvider", "getNavigatorProvider$navigation_runtime_release", "setNavigatorProvider$navigation_runtime_release", "getCurrentDestination$navigation_runtime_release", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry$navigation_runtime_release", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry$navigation_runtime_release", "previousBackStackEntry", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavControllerImpl {

    @NotNull
    private final MutableStateFlow _currentBackStack;

    @NotNull
    private final MutableSharedFlow _currentBackStackEntryFlow;
    private NavGraph _graph;

    @NotNull
    private NavigatorProvider _navigatorProvider;

    @NotNull
    private final MutableStateFlow _visibleEntries;
    private Function1<? super NavBackStackEntry, Unit> addToBackStackHandler;

    @NotNull
    private final ArrayDeque<NavBackStackEntry> backQueue;

    @NotNull
    private final List<NavBackStackEntry> backStackEntriesToDispatch;

    @NotNull
    private final Map<Integer, String> backStackMap;

    @NotNull
    private final Map<String, ArrayDeque<NavBackStackEntryState>> backStackStates;
    private Bundle[] backStackToRestore;

    @NotNull
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;

    @NotNull
    private final StateFlow currentBackStack;
    private int dispatchReentrantCount;

    @NotNull
    private final Map<NavBackStackEntry, Boolean> entrySavedState;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @NotNull
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;

    @NotNull
    private final NavController navController;

    @NotNull
    private final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;

    @NotNull
    private final List<NavController.OnDestinationChangedListener> onDestinationChangedListeners;

    @NotNull
    private final Map<NavBackStackEntry, AtomicInt> parentToChildCount;
    private Function1<? super NavBackStackEntry, Unit> popFromBackStackHandler;

    @NotNull
    private Function0<Unit> updateOnBackPressedCallbackEnabledCallback;
    private NavControllerViewModel viewModel;

    @NotNull
    private final StateFlow visibleEntries;

    public NavControllerImpl(@NotNull NavController navController, @NotNull Function0<Unit> updateOnBackPressedCallbackEnabledCallback) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.navController = navController;
        this.updateOnBackPressedCallbackEnabledCallback = updateOnBackPressedCallbackEnabledCallback;
        this.backQueue = new ArrayDeque<>();
        f0 f0Var = f0.f322471a;
        j2 j2VarC = q.c(f0Var);
        this._currentBackStack = j2VarC;
        this.currentBackStack = q.h(j2VarC);
        j2 j2VarC2 = q.c(f0Var);
        this._visibleEntries = j2VarC2;
        this.visibleEntries = q.h(j2VarC2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new a(this, 5);
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = q.b(0, 2, f.DROP_OLDEST);
    }

    private final void addEntryToBackStack(NavDestination node, Bundle finalArgs, NavBackStackEntry backStackEntry, List<NavBackStackEntry> restoredEntries) {
        Bundle bundle;
        ArrayDeque<NavBackStackEntry> arrayDeque;
        NavDestination destination;
        List<NavBackStackEntry> list;
        NavBackStackEntry navBackStackEntry;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        List<NavBackStackEntry> list2 = restoredEntries;
        NavDestination destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof FloatingWindow) && popBackStackInternal$navigation_runtime_release$default(this, ((NavBackStackEntry) this.backQueue.last()).getDestination().getId(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        NavBackStackEntry navBackStackEntry2 = null;
        if (node instanceof NavGraph) {
            NavDestination navDestination = destination2;
            while (true) {
                Intrinsics.h(navDestination);
                NavGraph parent = navDestination.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = listIterator.previous();
                            if (Intrinsics.f(navBackStackEntryPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    arrayDeque2.addFirst(navBackStackEntryCreate$default);
                    if (this.backQueue.isEmpty() || ((NavBackStackEntry) this.backQueue.last()).getDestination() != parent) {
                        navBackStackEntry = backStackEntry;
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                    } else {
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                        navBackStackEntry = backStackEntry;
                        popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    arrayDeque = arrayDeque2;
                    destination = destination2;
                    list = list2;
                    navBackStackEntry = backStackEntry;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                navDestination = parent;
                arrayDeque2 = arrayDeque;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            arrayDeque = arrayDeque2;
            destination = destination2;
            list = list2;
            navBackStackEntry = backStackEntry;
        }
        NavDestination destination3 = arrayDeque.isEmpty() ? destination : ((NavBackStackEntry) arrayDeque.first()).getDestination();
        while (destination3 != null && findDestination$navigation_runtime_release(destination3.getId(), destination3) != destination3) {
            NavGraph parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !SavedStateReader.m3611isEmptyimpl(SavedStateReader.m3590constructorimpl(bundle))) ? bundle : null;
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = listIterator2.previous();
                        if (Intrinsics.f(navBackStackEntryPrevious.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navGraph = parent2;
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), navGraph, parent2.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                arrayDeque.addFirst(navBackStackEntryCreate$default2);
            } else {
                navGraph = parent2;
            }
            destination3 = navGraph;
        }
        if (!arrayDeque.isEmpty()) {
            destination = ((NavBackStackEntry) arrayDeque.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            NavDestination destination4 = ((NavBackStackEntry) this.backQueue.last()).getDestination();
            Intrinsics.i(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination4).getNodes().get(destination.getId()) != null) {
                break;
            } else {
                popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) this.backQueue.c();
        if (navBackStackEntry3 == null) {
            navBackStackEntry3 = (NavBackStackEntry) arrayDeque.c();
        }
        if (!Intrinsics.f(navBackStackEntry3 != null ? navBackStackEntry3.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination5 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = this._graph;
                Intrinsics.h(navGraph2);
                if (Intrinsics.f(destination5, navGraph2)) {
                    navBackStackEntry2 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry2;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                NavContext navContext = getNavContext();
                NavGraph navGraph3 = this._graph;
                Intrinsics.h(navGraph3);
                NavGraph navGraph4 = this._graph;
                Intrinsics.h(navGraph4);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, navContext, navGraph3, navGraph4.addInDefaultArgs(bundle), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            arrayDeque.addFirst(navBackStackEntryCreate$default3);
        }
        for (NavBackStackEntry navBackStackEntry4 : arrayDeque) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry4.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry4);
        }
        this.backQueue.addAll(arrayDeque);
        this.backQueue.addLast(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry5 : d0.F0(navBackStackEntry, arrayDeque)) {
            NavGraph parent3 = navBackStackEntry5.getDestination().getParent();
            if (parent3 != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry5, getBackStackEntry$navigation_runtime_release(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addEntryToBackStack$default(NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj2) {
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        navControllerImpl.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearBackStackInternal$lambda$19(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.setRestoreState(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executePopOperations$lambda$10(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, NavControllerImpl navControllerImpl, boolean z, ArrayDeque arrayDeque, NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        ref$BooleanRef.f186407a = true;
        ref$BooleanRef2.f186407a = true;
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(entry, z, arrayDeque);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$11(NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$12(NavControllerImpl navControllerImpl, NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$14(NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$15(NavControllerImpl navControllerImpl, NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    private final boolean executeRestoreState(List<NavBackStackEntry> entries, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj2 : entries) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj2);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) d0.o0(arrayList);
            if (Intrinsics.f((list == null || (navBackStackEntry = (NavBackStackEntry) d0.m0(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(v.n(navBackStackEntry2));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList) {
            navigateInternal$navigation_runtime_release(this._navigatorProvider.getNavigator(((NavBackStackEntry) d0.b0(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new ryd.f(ref$BooleanRef, entries, new Ref$IntRef(), this, args, 4));
        }
        return ref$BooleanRef.f186407a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeRestoreState$lambda$57(Ref$BooleanRef ref$BooleanRef, List list, Ref$IntRef ref$IntRef, NavControllerImpl navControllerImpl, Bundle bundle, NavBackStackEntry entry) {
        List<NavBackStackEntry> listSubList;
        Intrinsics.checkNotNullParameter(entry, "entry");
        ref$BooleanRef.f186407a = true;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            listSubList = list.subList(ref$IntRef.f186408a, i);
            ref$IntRef.f186408a = i;
        } else {
            listSubList = f0.f322471a;
        }
        navControllerImpl.addEntryToBackStack(entry.getDestination(), bundle, entry, listSubList);
        return Unit.f186387a;
    }

    public static /* synthetic */ NavDestination findDestination$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, NavDestination navDestination, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            navDestination = null;
        }
        return navControllerImpl.findDestination$navigation_runtime_release(i, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavDestination navDestination, int i, boolean z, NavDestination navDestination2, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navControllerImpl.findDestinationComprehensive$navigation_runtime_release(navDestination, i, z, navDestination2);
    }

    private final List<NavBackStackEntry> instantiateBackStack(ArrayDeque<NavBackStackEntryState> backStackState) {
        NavDestination graph$navigation_runtime_release;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.e();
        if (navBackStackEntry == null || (graph$navigation_runtime_release = navBackStackEntry.getDestination()) == null) {
            graph$navigation_runtime_release = getGraph$navigation_runtime_release();
        }
        if (backStackState != null) {
            NavDestination navDestination = graph$navigation_runtime_release;
            for (NavBackStackEntryState navBackStackEntryState : backStackState) {
                NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 8, null);
                if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + navDestination).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestinationComprehensive$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                navDestination = navDestinationFindDestinationComprehensive$navigation_runtime_release$default;
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination node, Bundle args) {
        int iNextIndex;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getDestination() == node) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof NavGraph) {
            List listJ = y.J(y.x(NavGraph.INSTANCE.childHierarchy((NavGraph) node), new e(12)));
            if (this.backQueue.size() - iNextIndex != listJ.size()) {
                return false;
            }
            ArrayDeque<NavBackStackEntry> arrayDeque2 = this.backQueue;
            List<NavBackStackEntry> listSubList = arrayDeque2.subList(iNextIndex, arrayDeque2.size());
            ArrayList arrayList = new ArrayList(w.t(listSubList, 10));
            Iterator<T> it8 = listSubList.iterator();
            while (it8.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it8.next()).getDestination().getId()));
            }
            if (!arrayList.equals(listJ)) {
                return false;
            }
        } else if (currentBackStackEntry$navigation_runtime_release == null || (destination = currentBackStackEntry$navigation_runtime_release.getDestination()) == null || node.getId() != destination.getId()) {
            return false;
        }
        ArrayDeque<NavBackStackEntry> arrayDeque3 = new ArrayDeque();
        while (v.j(this.backQueue) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) a0.H(this.backQueue);
            unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            arrayDeque3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(args)));
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque3) {
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry2, getBackStackEntry$navigation_runtime_release(parent.getId()));
            }
            this.backQueue.addLast(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque3) {
            this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int launchSingleTopInternal$lambda$47(NavDestination it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(NavControllerImpl navControllerImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        navControllerImpl.hostLifecycleState = event.getTargetState();
        if (navControllerImpl._graph != null) {
            Iterator it8 = d0.f1(navControllerImpl.backQueue).iterator();
            while (it8.hasNext()) {
                ((NavBackStackEntry) it8.next()).handleLifecycleEvent(event);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$44(Ref$BooleanRef ref$BooleanRef, NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        ref$BooleanRef.f186407a = true;
        addEntryToBackStack$default(navControllerImpl, navDestination, bundle, it8, null, 8, null);
        return Unit.f186387a;
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if ((i & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release(str, navOptions, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pop$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, boolean z, boolean z3, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(i, z, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z, arrayDeque);
    }

    private final boolean restoreStateInternal(int id10, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id10))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id10));
        a0.D(this.backStackMap.values(), new k(str, 11));
        return executeRestoreState(instantiateBackStack((ArrayDeque) u0.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$51(String str, String str2) {
        return Intrinsics.f(str2, str);
    }

    public final void addOnDestinationChangedListener$navigation_runtime_release(@NotNull NavController.OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        listener.onDestinationChanged(this.navController, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(int destinationId) {
        Iterator<T> it8 = this.navigatorState.values().iterator();
        while (it8.hasNext()) {
            ((NavController.NavControllerNavigatorState) it8.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(destinationId, null, NavOptionsBuilderKt.navOptions(new e(13)), null);
        Iterator<T> it9 = this.navigatorState.values().iterator();
        while (it9.hasNext()) {
            ((NavController.NavControllerNavigatorState) it9.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(destinationId, true, false);
    }

    @NotNull
    public final NavBackStackEntry createBackStackEntry$navigation_runtime_release(@NotNull NavDestination destination, Bundle arguments) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), destination, arguments, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
    }

    public final boolean dispatchOnDestinationChanged$navigation_runtime_release() {
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.e();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            ArrayList<NavBackStackEntry> arrayListF1 = d0.f1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry2 : arrayListF1) {
                Iterator it8 = d0.d1(this.onDestinationChangedListeners).iterator();
                while (it8.hasNext()) {
                    ((NavController.OnDestinationChangedListener) it8.next()).onDestinationChanged(this.navController, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this._currentBackStackEntryFlow.k(navBackStackEntry2);
            }
            this._currentBackStack.k(d0.f1(this.backQueue));
            this._visibleEntries.k(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntry != null;
    }

    public final boolean executePopOperations$navigation_runtime_release(@NotNull List<? extends Navigator<?>> popOperations, @NotNull NavDestination foundDestination, boolean inclusive, boolean saveState) {
        NavControllerImpl navControllerImpl;
        boolean z;
        Intrinsics.checkNotNullParameter(popOperations, "popOperations");
        Intrinsics.checkNotNullParameter(foundDestination, "foundDestination");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        Iterator<? extends Navigator<?>> it8 = popOperations.iterator();
        while (true) {
            if (!it8.hasNext()) {
                navControllerImpl = this;
                z = saveState;
                break;
            }
            Navigator<? extends NavDestination> navigator = (Navigator) it8.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            navControllerImpl = this;
            z = saveState;
            popBackStackInternal$navigation_runtime_release(navigator, (NavBackStackEntry) this.backQueue.last(), z, new s(10, ref$BooleanRef, ref$BooleanRef2, navControllerImpl, arrayDeque, z));
            if (!ref$BooleanRef2.f186407a) {
                break;
            }
            saveState = z;
        }
        if (z) {
            if (!inclusive) {
                final int i = 0;
                g gVar = new g(y.I(t.g(foundDestination, new e(14)), new Function1(this) { // from class: s5.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NavControllerImpl f259900b;

                    {
                        this.f259900b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean zExecutePopOperations$lambda$12;
                        switch (i) {
                            case 0:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$12(this.f259900b, (NavDestination) obj2);
                                break;
                            default:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$15(this.f259900b, (NavDestination) obj2);
                                break;
                        }
                        return Boolean.valueOf(zExecutePopOperations$lambda$12);
                    }
                }));
                while (gVar.hasNext()) {
                    NavDestination navDestination = (NavDestination) gVar.next();
                    Map<Integer, String> map = navControllerImpl.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.c();
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) arrayDeque.first();
                final int i2 = 1;
                g gVar2 = new g(y.I(t.g(findDestination$navigation_runtime_release$default(this, navBackStackEntryState2.getDestinationId(), null, 2, null), new e(15)), new Function1(this) { // from class: s5.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NavControllerImpl f259900b;

                    {
                        this.f259900b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean zExecutePopOperations$lambda$12;
                        switch (i2) {
                            case 0:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$12(this.f259900b, (NavDestination) obj2);
                                break;
                            default:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$15(this.f259900b, (NavDestination) obj2);
                                break;
                        }
                        return Boolean.valueOf(zExecutePopOperations$lambda$12);
                    }
                }));
                while (gVar2.hasNext()) {
                    navControllerImpl.backStackMap.put(Integer.valueOf(((NavDestination) gVar2.next()).getId()), navBackStackEntryState2.getId());
                }
                if (navControllerImpl.backStackMap.values().contains(navBackStackEntryState2.getId())) {
                    navControllerImpl.backStackStates.put(navBackStackEntryState2.getId(), arrayDeque);
                }
            }
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        return ref$BooleanRef.f186407a;
    }

    public final NavDestination findDestination$navigation_runtime_release(int destinationId, NavDestination matchingDest) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.h(navGraph);
        if (navGraph.getId() == destinationId) {
            if (matchingDest == null) {
                return this._graph;
            }
            if (Intrinsics.f(this._graph, matchingDest) && matchingDest.getParent() == null) {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.h(destination);
        }
        return findDestinationComprehensive$navigation_runtime_release(destination, destinationId, false, matchingDest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.navigation.NavGraph, java.lang.Object] */
    public final NavDestination findDestinationComprehensive$navigation_runtime_release(@NotNull NavDestination destination, int destinationId, boolean searchChildren, NavDestination matchingDest) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.getId() == destinationId && (matchingDest == null || (destination.equals(matchingDest) && Intrinsics.f(destination.getParent(), matchingDest.getParent())))) {
            return destination;
        }
        ?? parent = destination instanceof NavGraph ? (NavGraph) destination : 0;
        if (parent == 0) {
            parent = destination.getParent();
            Intrinsics.h(parent);
        }
        return parent.findNodeComprehensive(destinationId, parent, searchChildren, matchingDest);
    }

    public final String findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release(@NotNull int[] deepLink) {
        NavGraph navGraph;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i >= length) {
                return null;
            }
            int i2 = deepLink[i];
            if (i == 0) {
                NavGraph navGraph3 = this._graph;
                Intrinsics.h(navGraph3);
                if (navGraph3.getId() == i2) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                Intrinsics.h(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i2);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.INSTANCE.getDisplayName(getNavContext(), i2);
            }
            if (i != deepLink.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    Intrinsics.h(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    @NotNull
    public final <T> String generateRouteFilled$navigation_runtime_release(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Class<?> cls = route.getClass();
        p0 p0Var = o0.f186429a;
        NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), RouteSerializerKt.generateHashCode(d.u(p0Var.b(cls))), true, null, 8, null);
        if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
            throw new IllegalArgumentException(("Destination with route " + p0Var.b(route.getClass()).m() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, NavArgument> arguments = navDestinationFindDestinationComprehensive$navigation_runtime_release$default.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(arguments.size()));
        Iterator<T> it8 = arguments.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(route, linkedHashMap);
    }

    @NotNull
    public final ArrayDeque<NavBackStackEntry> getBackQueue$navigation_runtime_release() {
        return this.backQueue;
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(int destinationId) {
        NavBackStackEntry navBackStackEntryPrevious;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (navBackStackEntryPrevious.getDestination().getId() == destinationId) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbW = a0.d.w(destinationId, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbW.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentBackStack$navigation_runtime_release, reason: from getter */
    public final StateFlow getCurrentBackStack() {
        return this.currentBackStack;
    }

    public final NavBackStackEntry getCurrentBackStackEntry$navigation_runtime_release() {
        return (NavBackStackEntry) this.backQueue.e();
    }

    public final NavDestination getCurrentDestination$navigation_runtime_release() {
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        if (currentBackStackEntry$navigation_runtime_release != null) {
            return currentBackStackEntry$navigation_runtime_release.getDestination();
        }
        return null;
    }

    @NotNull
    public final NavGraph getGraph$navigation_runtime_release() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.i(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    @NotNull
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    @NotNull
    public final NavContext getNavContext() {
        return this.navController.getNavContext();
    }

    @NotNull
    /* JADX INFO: renamed from: getNavigatorProvider$navigation_runtime_release, reason: from getter */
    public final NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public final NavBackStackEntry getPreviousBackStackEntry$navigation_runtime_release() {
        Object next;
        Iterator it8 = d0.I0(this.backQueue).iterator();
        if (it8.hasNext()) {
            it8.next();
        }
        Iterator it9 = t.c(it8).iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    @NotNull
    public final NavGraph getTopGraph$navigation_runtime_release() {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.h(destination);
        }
        NavGraph navGraph = destination instanceof NavGraph ? (NavGraph) destination : null;
        if (navGraph != null) {
            return navGraph;
        }
        NavGraph parent = destination.getParent();
        Intrinsics.h(parent);
        return parent;
    }

    @NotNull
    /* JADX INFO: renamed from: getVisibleEntries$navigation_runtime_release, reason: from getter */
    public final StateFlow getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX INFO: renamed from: get_graph$navigation_runtime_release, reason: from getter */
    public final NavGraph get_graph() {
        return this._graph;
    }

    @NotNull
    public final NavigatorProvider get_navigatorProvider$navigation_runtime_release() {
        return this._navigatorProvider;
    }

    public final void linkChildToParent$navigation_runtime_release(@NotNull NavBackStackEntry child, @NotNull NavBackStackEntry parent) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInt(0));
        }
        AtomicInt atomicInt = this.parentToChildCount.get(parent);
        Intrinsics.h(atomicInt);
        atomicInt.incrementAndGet$navigation_runtime_release();
    }

    public final void markTransitionComplete$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry entry, @NotNull Function0<Unit> superCallback) {
        NavControllerViewModel navControllerViewModel;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        boolean zF = Intrinsics.f(this.entrySavedState.get(entry), Boolean.TRUE);
        superCallback.invoke();
        this.entrySavedState.remove(entry);
        if (this.backQueue.contains(entry)) {
            if (state.getIsNavigating()) {
                return;
            }
            updateBackStackLifecycle$navigation_runtime_release();
            this._currentBackStack.k(d0.f1(this.backQueue));
            this._visibleEntries.k(populateVisibleEntries$navigation_runtime_release());
            return;
        }
        unlinkChildFromParent$navigation_runtime_release(entry);
        if (entry.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<NavBackStackEntry> it8 = arrayDeque.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(it8.next().getId(), entry.getId())) {
                    break;
                }
            }
            if (!zF && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(entry.getId());
            }
        } else if (!zF) {
            navControllerViewModel.clear(entry.getId());
        }
        updateBackStackLifecycle$navigation_runtime_release();
        this._visibleEntries.k(populateVisibleEntries$navigation_runtime_release());
    }

    public final void navigate$navigation_runtime_release(@NotNull NavDestination node, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        boolean z;
        Ref$BooleanRef ref$BooleanRef;
        boolean z3;
        boolean zPopBackStackInternal$navigation_runtime_release;
        NavControllerImpl navControllerImpl = this;
        Intrinsics.checkNotNullParameter(node, "node");
        Iterator<T> it8 = navControllerImpl.navigatorState.values().iterator();
        while (it8.hasNext()) {
            ((NavController.NavControllerNavigatorState) it8.next()).setNavigating(true);
        }
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        boolean z4 = false;
        if (navOptions == null) {
            z = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                Intrinsics.h(popUpToRoute);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteClass() != null) {
                KClass popUpToRouteClass = navOptions.getPopUpToRouteClass();
                Intrinsics.h(popUpToRouteClass);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(RouteSerializerKt.generateHashCode(d.u(popUpToRouteClass)), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                Intrinsics.h(popUpToRouteObject);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(popUpToRouteObject, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
                }
                z = false;
            }
            z = zPopBackStackInternal$navigation_runtime_release;
        }
        Bundle bundleAddInDefaultArgs = node.addInDefaultArgs(args);
        if (navOptions != null && navOptions.getRestoreState() && navControllerImpl.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            ref$BooleanRef2.f186407a = navControllerImpl.restoreStateInternal(node.getId(), bundleAddInDefaultArgs, navOptions, navigatorExtras);
            ref$BooleanRef = ref$BooleanRef2;
            z3 = false;
        } else {
            boolean z6 = navOptions != null && navOptions.getSingleTop() && launchSingleTopInternal(node, args);
            if (z6) {
                ref$BooleanRef = ref$BooleanRef2;
                z3 = false;
            } else {
                NavBackStackEntry navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, navControllerImpl.getNavContext(), node, bundleAddInDefaultArgs, navControllerImpl.getHostLifecycleState$navigation_runtime_release(), navControllerImpl.viewModel, null, null, 96, null);
                z3 = false;
                navControllerImpl = this;
                ref$BooleanRef = ref$BooleanRef2;
                navControllerImpl.navigateInternal$navigation_runtime_release(navControllerImpl._navigatorProvider.getNavigator(node.getNavigatorName()), u.c(navBackStackEntryCreate$default), navOptions, navigatorExtras, new b(ref$BooleanRef2, this, node, bundleAddInDefaultArgs, 25));
            }
            z4 = z6;
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        Iterator<T> it9 = navControllerImpl.navigatorState.values().iterator();
        while (it9.hasNext()) {
            ((NavController.NavControllerNavigatorState) it9.next()).setNavigating(z3);
        }
        if (z || ref$BooleanRef.f186407a || z4) {
            navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
        } else {
            navControllerImpl.updateBackStackLifecycle$navigation_runtime_release();
        }
    }

    public final void navigateInternal$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator, @NotNull List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras, @NotNull Function1<? super NavBackStackEntry, Unit> handler) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.addToBackStackHandler = handler;
        navigator.navigate(entries, navOptions, navigatorExtras);
        this.addToBackStackHandler = null;
    }

    public final void onGraphCreated$navigation_runtime_release(Bundle startDestinationArgs) {
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null) {
            Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(bundle);
            if (SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:navigatorState:names")) {
                for (String str : SavedStateReader.m3609getStringListimpl(bundleM3590constructorimpl, "android-support-nav:controller:navigatorState:names")) {
                    Navigator navigator = this._navigatorProvider.getNavigator(str);
                    if (SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, str)) {
                        navigator.onRestoreState(SavedStateReader.m3604getSavedStateimpl(bundleM3590constructorimpl, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        if (bundleArr != null) {
            for (Bundle bundle2 : bundleArr) {
                NavBackStackEntryState navBackStackEntryState = new NavBackStackEntryState(bundle2);
                NavDestination navDestinationFindDestination$navigation_runtime_release$default = findDestination$navigation_runtime_release$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (navDestinationFindDestination$navigation_runtime_release$default == null) {
                    StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Restoring the Navigation back stack failed: destination ", NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ");
                    sbX.append(getCurrentDestination$navigation_runtime_release());
                    throw new IllegalStateException(sbX.toString());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestination$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination$navigation_runtime_release$default.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map = this.navigatorState;
                NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = map.get(navigator2);
                if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release == null) {
                    navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator2);
                    map.put(navigator2, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release);
                }
                this.backQueue.addLast(navBackStackEntryInstantiate);
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent$navigation_runtime_release(navBackStackEntryInstantiate, getBackStackEntry$navigation_runtime_release(parent.getId()));
                }
            }
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((Navigator) obj2).getIsAttached()) {
                arrayList.add(obj2);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map2 = this.navigatorState;
            NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = map2.get(navigator3);
            if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 == null) {
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator3);
                map2.put(navigator3, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
            }
            navigator3.onAttach(navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            dispatchOnDestinationChanged$navigation_runtime_release();
        } else {
            if (this.navController.checkDeepLinkHandled$navigation_runtime_release()) {
                return;
            }
            NavGraph navGraph = this._graph;
            Intrinsics.h(navGraph);
            navigate$navigation_runtime_release(navGraph, startDestinationArgs, null, null);
        }
    }

    public final void pop$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull Function0<Unit> superCallback) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        Navigator navigator = this._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
        this.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        if (!Intrinsics.f(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            Intrinsics.h(navControllerNavigatorState);
            navControllerNavigatorState.pop(popUpTo, saveState);
        } else {
            Function1<? super NavBackStackEntry, Unit> function1 = this.popFromBackStackHandler;
            if (function1 == null) {
                popBackStackFromNavigator$navigation_runtime_release(popUpTo, new a3l.b(11, superCallback));
            } else {
                function1.invoke(popUpTo);
                superCallback.invoke();
            }
        }
    }

    public final boolean popBackStack$navigation_runtime_release() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination$navigation_runtime_release = getCurrentDestination$navigation_runtime_release();
        Intrinsics.h(currentDestination$navigation_runtime_release);
        return popBackStack$navigation_runtime_release(currentDestination$navigation_runtime_release.getId(), true);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.INSTANCE.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != this.backQueue.size()) {
            popBackStackInternal$navigation_runtime_release(((NavBackStackEntry) this.backQueue.get(i)).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$navigation_runtime_release$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void popBackStackInternal$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator, @NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull Function1<? super NavBackStackEntry, Unit> handler) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.popFromBackStackHandler = handler;
        navigator.popBackStack(popUpTo, saveState);
        this.popFromBackStackHandler = null;
    }

    public final void popEntryFromBackStack$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull ArrayDeque<NavBackStackEntryState> savedState) {
        NavControllerViewModel navControllerViewModel;
        StateFlow transitionsInProgress;
        Set set;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        if (!Intrinsics.f(navBackStackEntry, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry.getDestination() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        a0.H(this.backQueue);
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
        boolean z = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(navBackStackEntry)) && !this.parentToChildCount.containsKey(navBackStackEntry)) {
            z = false;
        }
        Lifecycle.State state = navBackStackEntry.getLifecycle().getState();
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.isAtLeast(state2)) {
            if (saveState) {
                navBackStackEntry.setMaxLifecycle(state2);
                savedState.addFirst(new NavBackStackEntryState(navBackStackEntry));
            }
            if (z) {
                navBackStackEntry.setMaxLifecycle(state2);
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            }
        }
        if (saveState || z || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntry.getId());
    }

    @NotNull
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = this.navigatorState.values().iterator();
        while (it8.hasNext()) {
            Iterable iterable = (Iterable) ((NavController.NavControllerNavigatorState) it8.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj2);
                }
            }
            a0.x(arrayList2, arrayList);
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        a0.x(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((NavBackStackEntry) obj3).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void prepareForTransition$navigation_runtime_release(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.backQueue.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.setMaxLifecycle(Lifecycle.State.STARTED);
    }

    public final void push$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Navigator navigator = this._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
        if (!Intrinsics.f(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
        Function1<? super NavBackStackEntry, Unit> function1 = this.addToBackStackHandler;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            state.addInternal(backStackEntry);
            return;
        }
        Log.INSTANCE.i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
    }

    public final void restoreState$navigation_runtime_release(Bundle navState) {
        if (navState == null) {
            return;
        }
        Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(navState);
        this.navigatorStateToRestore = SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:navigatorState") ? SavedStateReader.m3604getSavedStateimpl(bundleM3590constructorimpl, "android-support-nav:controller:navigatorState") : null;
        int i = 0;
        this.backStackToRestore = SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStack") ? (Bundle[]) SavedStateReader.m3605getSavedStateListimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
        this.backStackStates.clear();
        if (SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackDestIds") && SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackIds")) {
            int[] iArrM3600getIntArrayimpl = SavedStateReader.m3600getIntArrayimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackDestIds");
            List<String> listM3609getStringListimpl = SavedStateReader.m3609getStringListimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackIds");
            int length = iArrM3600getIntArrayimpl.length;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                this.backStackMap.put(Integer.valueOf(iArrM3600getIntArrayimpl[i]), !Intrinsics.f(listM3609getStringListimpl.get(i2), "") ? listM3609getStringListimpl.get(i2) : null);
                i++;
                i2 = i3;
            }
        }
        if (SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackStates")) {
            for (String str : SavedStateReader.m3609getStringListimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackStates")) {
                if (SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackStates:" + str)) {
                    List<Bundle> listM3605getSavedStateListimpl = SavedStateReader.m3605getSavedStateListimpl(bundleM3590constructorimpl, "android-support-nav:controller:backStackStates:" + str);
                    Map<String, ArrayDeque<NavBackStackEntryState>> map = this.backStackStates;
                    ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(listM3605getSavedStateListimpl.size());
                    Iterator<Bundle> it8 = listM3605getSavedStateListimpl.iterator();
                    while (it8.hasNext()) {
                        arrayDeque.addLast(new NavBackStackEntryState(it8.next()));
                    }
                    map.put(str, arrayDeque);
                }
            }
        }
    }

    public final Bundle saveState$navigation_runtime_release() {
        Bundle bundleBundleOf;
        ArrayList arrayList = new ArrayList();
        r0.g();
        Pair[] pairArr = new Pair[0];
        Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf2);
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle bundleOnSaveState = entry.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                SavedStateWriter.m3628putSavedStateimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf2), key, bundleOnSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundleBundleOf = null;
        } else {
            r0.g();
            Pair[] pairArr2 = new Pair[0];
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundleBundleOf);
            SavedStateWriter.m3632putStringListimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf2), "android-support-nav:controller:navigatorState:names", arrayList);
            SavedStateWriter.m3628putSavedStateimpl(bundleM3615constructorimpl, "android-support-nav:controller:navigatorState", bundleBundleOf2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundleBundleOf == null) {
                r0.g();
                Pair[] pairArr3 = new Pair[0];
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                SavedStateWriter.m3615constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<NavBackStackEntry> it8 = this.backQueue.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new NavBackStackEntryState(it8.next()).writeToState());
            }
            SavedStateWriter.m3629putSavedStateListimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf), "android-support-nav:controller:backStack", arrayList2);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundleBundleOf == null) {
                r0.g();
                Pair[] pairArr4 = new Pair[0];
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length));
                SavedStateWriter.m3615constructorimpl(bundleBundleOf);
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                int i2 = i + 1;
                iArr[i] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList3.add(value);
                i = i2;
            }
            Bundle bundleM3615constructorimpl2 = SavedStateWriter.m3615constructorimpl(bundleBundleOf);
            SavedStateWriter.m3622putIntArrayimpl(bundleM3615constructorimpl2, "android-support-nav:controller:backStackDestIds", iArr);
            SavedStateWriter.m3632putStringListimpl(bundleM3615constructorimpl2, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundleBundleOf == null) {
                r0.g();
                Pair[] pairArr5 = new Pair[0];
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length));
                SavedStateWriter.m3615constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry<String, ArrayDeque<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList4.add(key2);
                ArrayList arrayList5 = new ArrayList();
                Iterator<NavBackStackEntryState> it9 = value2.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(it9.next().writeToState());
                }
                SavedStateWriter.m3629putSavedStateListimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf), "android-support-nav:controller:backStackStates:" + key2, arrayList5);
            }
            SavedStateWriter.m3632putStringListimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf), "android-support-nav:controller:backStackStates", arrayList4);
        }
        return bundleBundleOf;
    }

    public final void setGraph$navigation_runtime_release(@NotNull NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        setGraph$navigation_runtime_release(graph, null);
    }

    public final void setLifecycleOwner$navigation_runtime_release(@NotNull LifecycleOwner owner) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.f(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    public final void setViewModelStore$navigation_runtime_release(@NotNull ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (Intrinsics.f(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@NotNull NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInt atomicInt = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInt != null ? Integer.valueOf(atomicInt.decrementAndGet$navigation_runtime_release()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInt atomicInt;
        StateFlow transitionsInProgress;
        Set set;
        ArrayList<NavBackStackEntry> arrayListF1 = d0.f1(this.backQueue);
        if (arrayListF1.isEmpty()) {
            return;
        }
        ArrayList arrayListN = v.n(((NavBackStackEntry) d0.m0(arrayListF1)).getDestination());
        ArrayList arrayList = new ArrayList();
        if (d0.m0(arrayListN) instanceof FloatingWindow) {
            Iterator it8 = d0.I0(arrayListF1).iterator();
            while (it8.hasNext()) {
                NavDestination destination = ((NavBackStackEntry) it8.next()).getDestination();
                arrayList.add(destination);
                if (!(destination instanceof FloatingWindow) && !(destination instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : d0.I0(arrayListF1)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination2 = navBackStackEntry.getDestination();
            NavDestination navDestination = (NavDestination) d0.d0(arrayListN);
            if (navDestination != null && navDestination.getId() == destination2.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (Intrinsics.f((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInt = this.parentToChildCount.get(navBackStackEntry)) != null && atomicInt.get$navigation_runtime_release() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        map.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination2 = (NavDestination) d0.d0(arrayList);
                if (navDestination2 != null && navDestination2.getId() == destination2.getId()) {
                    a0.F(arrayList);
                }
                a0.F(arrayListN);
                NavGraph parent = destination2.getParent();
                if (parent != null) {
                    arrayListN.add(parent);
                }
            } else if (arrayList.isEmpty() || destination2.getId() != ((NavDestination) d0.b0(arrayList)).getId()) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                NavDestination navDestination3 = (NavDestination) a0.F(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent2 = navDestination3.getParent();
                if (parent2 != null && !arrayList.contains(parent2)) {
                    arrayList.add(parent2);
                }
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayListF1) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public final void setGraph$navigation_runtime_release(@NotNull NavGraph graph, Bundle startDestinationArgs) {
        NavControllerImpl navControllerImpl;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!Intrinsics.f(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer num : new ArrayList(this.backStackMap.keySet())) {
                    Intrinsics.h(num);
                    clearBackStackInternal$navigation_runtime_release(num.intValue());
                }
                navControllerImpl = this;
                popBackStackInternal$navigation_runtime_release$default(navControllerImpl, navGraph.getId(), true, false, 4, null);
            } else {
                navControllerImpl = this;
            }
            navControllerImpl._graph = graph;
            onGraphCreated$navigation_runtime_release(startDestinationArgs);
            return;
        }
        int size = graph.getNodes().size();
        for (int i = 0; i < size; i++) {
            NavDestination navDestinationValueAt = graph.getNodes().valueAt(i);
            NavGraph navGraph2 = this._graph;
            Intrinsics.h(navGraph2);
            int iKeyAt = navGraph2.getNodes().keyAt(i);
            NavGraph navGraph3 = this._graph;
            Intrinsics.h(navGraph3);
            navGraph3.getNodes().replace(iKeyAt, navDestinationValueAt);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            m mVarL = b0.L(y.J(NavDestination.INSTANCE.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestinationFindNode = this._graph;
            Intrinsics.h(navDestinationFindNode);
            Iterator it8 = mVarL.iterator();
            while (true) {
                ListIterator listIterator = ((w0) it8).f322483a;
                if (listIterator.hasPrevious()) {
                    NavDestination navDestination = (NavDestination) listIterator.previous();
                    if (!Intrinsics.f(navDestination, this._graph) || !Intrinsics.f(navDestinationFindNode, graph)) {
                        if (navDestinationFindNode instanceof NavGraph) {
                            navDestinationFindNode = ((NavGraph) navDestinationFindNode).findNode(navDestination.getId());
                            Intrinsics.h(navDestinationFindNode);
                        }
                    }
                }
            }
            navBackStackEntry.setDestination(navDestinationFindNode);
        }
    }

    public final boolean popBackStack$navigation_runtime_release(int destinationId, boolean inclusive) {
        return popBackStack$navigation_runtime_release(destinationId, inclusive, false);
    }

    public final boolean popBackStack$navigation_runtime_release(int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal$navigation_runtime_release(destinationId, inclusive, saveState) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean popBackStackInternal$navigation_runtime_release(int destinationId, boolean inclusive, boolean saveState) {
        NavDestination destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = d0.I0(this.backQueue).iterator();
        while (true) {
            if (!it8.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it8.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(navigator);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination == null) {
            String displayName = NavDestination.INSTANCE.getDisplayName(getNavContext(), destinationId);
            Log.INSTANCE.i("NavController", "Ignoring popBackStack to destination " + displayName + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, inclusive, saveState);
    }

    public final boolean popBackStack$navigation_runtime_release(@NotNull String route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStackInternal$navigation_runtime_release(route, inclusive, saveState) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final <T> boolean popBackStackInternal$navigation_runtime_release(@NotNull T route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route), inclusive, saveState);
    }

    public final boolean popBackStackInternal$navigation_runtime_release(@NotNull String route, boolean inclusive, boolean saveState) {
        NavBackStackEntry navBackStackEntryPrevious;
        Intrinsics.checkNotNullParameter(route, "route");
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
            boolean zHasRoute = navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments());
            if (inclusive || !zHasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            }
            if (zHasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination == null) {
            Log.INSTANCE.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, inclusive, saveState);
    }

    public final void navigate$navigation_runtime_release(@NotNull String route, @NotNull Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        navigate$navigation_runtime_release$default(this, route, NavOptionsBuilderKt.navOptions(builder), null, 4, null);
    }

    public final void navigate$navigation_runtime_release(@NotNull String route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (this._graph != null) {
            NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
            NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = topGraph$navigation_runtime_release.matchRouteComprehensive(route, true, true, topGraph$navigation_runtime_release);
            if (deepLinkMatchMatchRouteComprehensive != null) {
                NavDestination destination = deepLinkMatchMatchRouteComprehensive.getDestination();
                Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchRouteComprehensive.getMatchingArgs());
                if (bundleAddInDefaultArgs == null) {
                    r0.g();
                    Pair[] pairArr = new Pair[0];
                    bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m3615constructorimpl(bundleAddInDefaultArgs);
                }
                NavDestination destination2 = deepLinkMatchMatchRouteComprehensive.getDestination();
                this.navController.writeIntent$navigation_runtime_release(NavDeepLinkRequest.Builder.INSTANCE.fromUri(NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(destination.getRoute()))).build(), bundleAddInDefaultArgs);
                navigate$navigation_runtime_release(destination2, bundleAddInDefaultArgs, navOptions, navigatorExtras);
                return;
            }
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbX.append(this._graph);
            throw new IllegalArgumentException(sbX.toString());
        }
        throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + CoreConstants.DOT).toString());
    }
}
