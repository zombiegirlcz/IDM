package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.f0;
import zhm.p;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0002º\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004\u008e\u0003\u008f\u0003BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ!\u0010!\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0017¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010%\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010(\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010*\u001a\u00020\u0016H\u0000¢\u0006\u0004\b)\u0010\u001aJ\u000f\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010,\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010\u001aJ#\u00100\u001a\u00020\u0016\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u0010\u001aJ\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u001aJ!\u00104\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b4\u0010\"J\u000f\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b5\u0010\u001aJ\r\u00106\u001a\u00020\u0016¢\u0006\u0004\b6\u0010\u001aJ\r\u00107\u001a\u00020\u0016¢\u0006\u0004\b7\u0010\u001aJ=\u0010<\u001a\u00020\u0016\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u0010-2\u0006\u00109\u001a\u00028\u00002\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160:H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b@\u0010?J\u0019\u0010B\u001a\u00020A2\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020A2\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bD\u0010CJ\u0017\u0010B\u001a\u00020A2\u0006\u00109\u001a\u00020AH\u0017¢\u0006\u0004\bB\u0010EJ\u0017\u0010B\u001a\u00020A2\u0006\u00109\u001a\u00020FH\u0017¢\u0006\u0004\bB\u0010GJ\u0017\u0010B\u001a\u00020A2\u0006\u00109\u001a\u00020HH\u0017¢\u0006\u0004\bB\u0010IJ\u0017\u0010B\u001a\u00020A2\u0006\u00109\u001a\u00020\u0014H\u0017¢\u0006\u0004\bB\u0010JJ\u0019\u0010K\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\bM\u0010LJ\u001d\u0010O\u001a\u00020\u00162\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00160.H\u0016¢\u0006\u0004\bO\u00101J\u001b\u0010Q\u001a\u00020\u00162\n\u00109\u001a\u0006\u0012\u0002\b\u00030PH\u0017¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0016H\u0017¢\u0006\u0004\bS\u0010\u001aJ#\u0010V\u001a\u00020\u00162\u0012\u0010U\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030P0TH\u0017¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0016H\u0017¢\u0006\u0004\bX\u0010\u001aJ#\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010-2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000YH\u0017¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010]J!\u0010c\u001a\u00020A2\u0006\u0010_\u001a\u00020^2\b\u0010`\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020\u0016H\u0017¢\u0006\u0004\bd\u0010\u001aJ\u001f\u0010g\u001a\u00020A2\u0006\u0010e\u001a\u00020A2\u0006\u0010f\u001a\u00020\u0014H\u0017¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0016H\u0017¢\u0006\u0004\bi\u0010\u001aJ\u0017\u0010j\u001a\u00020\u00162\u0006\u0010B\u001a\u00020AH\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\bl\u0010mJ\u0011\u0010o\u001a\u0004\u0018\u00010nH\u0017¢\u0006\u0004\bo\u0010pJ+\u0010u\u001a\u00020\u00162\u001a\u0010t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020s\u0012\u0006\u0012\u0004\u0018\u00010s0r0qH\u0017¢\u0006\u0004\bu\u0010vJ\u0019\u0010z\u001a\u00020w2\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bx\u0010yJ\u0013\u0010|\u001a\b\u0012\u0004\u0012\u00020{0q¢\u0006\u0004\b|\u0010}JA\u0010\u0085\u0001\u001a\u00020\u00162\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001f0~2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160.2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001f\u0010\u0087\u0001\u001a\u00020\u00162\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00160.H\u0000¢\u0006\u0005\b\u0086\u0001\u00101J2\u0010\u008a\u0001\u001a\u00020A2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001f0~2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J$\u0010\u008d\u0001\u001a\u00020\u00162\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001f0~¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0013\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\b\u008e\u0001\u0010?J\u001b\u0010\u008f\u0001\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\b\u008f\u0001\u0010LJ\u001b\u0010\u0091\u0001\u001a\u00020\u00162\u0007\u0010_\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u001aJ\u0011\u0010\u0094\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u001aJ\u0011\u0010\u0095\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u001aJ\u0019\u0010\u0096\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0018J#\u0010\u0096\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\"J\u0011\u0010\u0097\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u001aJ\u0011\u0010\u0098\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u001aJ\u001b\u0010\u0099\u0001\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0005\b\u0099\u0001\u0010LJ\u0012\u0010\u009a\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0013\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010\u009d\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u009d\u0001\u0010 \u0001J'\u0010£\u0001\u001a\u00030\u009c\u00012\b\u0010¡\u0001\u001a\u00030\u009c\u00012\b\u0010¢\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010¦\u0001\u001a\u00020\u00162\b\u0010¥\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b¨\u0001\u0010\u001aJ\u0011\u0010©\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b©\u0001\u0010\u001aJ\u0011\u0010ª\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bª\u0001\u0010\u001aJ&\u0010\u00ad\u0001\u001a\u00020\u00162\u0007\u0010«\u0001\u001a\u00020A2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J:\u0010´\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u001f2\b\u0010±\u0001\u001a\u00030°\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J'\u0010·\u0001\u001a\u00020\u00162\u0007\u0010«\u0001\u001a\u00020A2\n\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J$\u0010»\u0001\u001a\u00020\u00162\u0007\u0010¹\u0001\u001a\u00020\u00142\u0007\u0010º\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010½\u0001\u001a\u00020\u00162\u0007\u0010«\u0001\u001a\u00020AH\u0002¢\u0006\u0005\b½\u0001\u0010kJ\u0011\u0010¾\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b¾\u0001\u0010\u001aJ\u001b\u0010À\u0001\u001a\u00020\u00142\u0007\u0010¿\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J$\u0010Ã\u0001\u001a\u00020\u00162\u0007\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J6\u0010È\u0001\u001a\u00020\u00142\u0007\u0010Å\u0001\u001a\u00020\u00142\u0007\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020\u00142\u0007\u0010Ç\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001b\u0010Ê\u0001\u001a\u00020\u00142\u0007\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÊ\u0001\u0010Á\u0001J\u001b\u0010Ë\u0001\u001a\u00020\u00142\u0007\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bË\u0001\u0010Á\u0001J$\u0010Í\u0001\u001a\u00020\u00162\u0007\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010Ì\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÍ\u0001\u0010Ä\u0001J\u0011\u0010Î\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bÎ\u0001\u0010\u001aJ-\u0010Ò\u0001\u001a\u00020\u00162\u0007\u0010Ï\u0001\u001a\u00020\u00142\u0007\u0010Ð\u0001\u001a\u00020\u00142\u0007\u0010Ñ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J$\u0010Õ\u0001\u001a\u00020\u00162\u0007\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010Ô\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÕ\u0001\u0010Ä\u0001J7\u0010Ø\u0001\u001a\u00070Hj\u0003`Ö\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020\u00142\f\u0010×\u0001\u001a\u00070Hj\u0003`Ö\u0001H\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J \u0010Û\u0001\u001a\u00020\u0014*\u00030Ú\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0011\u0010Ý\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bÝ\u0001\u0010\u001aJ\u0011\u0010Þ\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bÞ\u0001\u0010\u001aJ\u001a\u0010ß\u0001\u001a\u00020\u00162\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0006\bß\u0001\u0010à\u0001J*\u0010ã\u0001\u001a\u0012\u0012\u0005\u0012\u00030â\u0001\u0012\u0004\u0012\u00020\u0016\u0018\u00010á\u00012\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0006\bã\u0001\u0010ä\u0001JB\u0010é\u0001\u001a\u00020\u00162\u0010\u0010\u0080\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001f0å\u00012\b\u0010æ\u0001\u001a\u00030\u009c\u00012\t\u0010ç\u0001\u001a\u0004\u0018\u00010\u001f2\u0007\u0010è\u0001\u001a\u00020AH\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J-\u0010ë\u0001\u001a\u00020\u00162\u001a\u0010t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020s\u0012\u0006\u0012\u0004\u0018\u00010s0r0qH\u0002¢\u0006\u0005\bë\u0001\u0010vJo\u0010ñ\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010ì\u00012\f\b\u0002\u0010î\u0001\u001a\u0005\u0018\u00010í\u00012\f\b\u0002\u0010ï\u0001\u001a\u0005\u0018\u00010í\u00012\u000b\b\u0002\u0010¿\u0001\u001a\u0004\u0018\u00010\u00142\u001d\b\u0002\u0010ð\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010\u001f0r0q2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0002¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u0014\u0010ó\u0001\u001a\u0004\u0018\u00010wH\u0002¢\u0006\u0006\bó\u0001\u0010ô\u0001J,\u0010ö\u0001\u001a\b\u0012\u0004\u0012\u00020{0q2\u0007\u0010\u009f\u0001\u001a\u00020\u00142\t\u0010õ\u0001\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0006\bö\u0001\u0010÷\u0001J7\u0010ú\u0001\u001a\u00020\u00162\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001f0~2\u000f\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010.H\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J\"\u0010û\u0001\u001a\u0004\u0018\u00010\u001f*\u00030Ú\u00012\u0007\u0010¿\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u0011\u0010ý\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bý\u0001\u0010\u001aJ\u0011\u0010þ\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bþ\u0001\u0010\u001aJ\u001c\u0010\u0081\u0002\u001a\u00020\u00162\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0002¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u0011\u0010\u0083\u0002\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0083\u0002\u0010\u001aJ\u001a\u0010\u0085\u0002\u001a\u00020\u00162\u0007\u0010\u0084\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0085\u0002\u0010\u0018J\u0011\u0010\u0086\u0002\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0086\u0002\u0010\u001aJ\u0011\u0010\u0087\u0002\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0087\u0002\u0010\u001aJ\u0011\u0010\u0088\u0002\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0088\u0002\u0010\u001aR!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008c\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008d\u0002R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008e\u0002R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u008f\u0002R\u0017\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u008f\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0090\u0002R\u001d\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0011\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R!\u0010\u0095\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010µ\u00010\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001c\u0010\u0097\u0002\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0019\u0010\u0099\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009b\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009a\u0002R\u0019\u0010\u009c\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009a\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u001c\u0010¤\u0002\u001a\u0005\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0019\u0010¦\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0019\u0010¨\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010§\u0002R\u0019\u0010©\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010§\u0002R\u001f\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00020ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010¬\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010\u009f\u0002R\u001a\u0010®\u0002\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R#\u0010±\u0002\u001a\f\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010°\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u0019\u0010³\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010§\u0002R\u0018\u0010´\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010\u009f\u0002R\u0019\u0010µ\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010§\u0002R\u0019\u0010¶\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010\u009a\u0002R\u0019\u0010·\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010\u009a\u0002R\u0019\u0010¸\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010\u009a\u0002R\u0019\u0010¹\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010§\u0002R\u0018\u0010»\u0002\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u001e\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020^0\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010\u0096\u0002R)\u0010¾\u0002\u001a\u00020A2\u0006\u00109\u001a\u00020A8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¾\u0002\u0010§\u0002\u001a\u0006\b¿\u0002\u0010À\u0002R)\u0010Á\u0002\u001a\u00020A2\u0006\u00109\u001a\u00020A8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÁ\u0002\u0010§\u0002\u001a\u0006\bÂ\u0002\u0010À\u0002R*\u0010Ã\u0002\u001a\u00030Ú\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002\"\u0006\bÇ\u0002\u0010È\u0002R)\u0010É\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0002\u0010\u008d\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R\u001a\u0010Ï\u0002\u001a\u00030Î\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u0019\u0010Ñ\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010§\u0002R\u001c\u0010Ò\u0002\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010¯\u0002R+\u0010Ó\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0002\u0010\u008f\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ù\u0002\u001a\u00030Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u001a\u0010Û\u0002\u001a\u00030ÿ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u001a\u0010Þ\u0002\u001a\u00030Ý\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u001c\u0010à\u0002\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\"\u0010ã\u0002\u001a\u0005\u0018\u00010â\u00028@X\u0080\u0004¢\u0006\u0010\n\u0006\bã\u0002\u0010ä\u0002\u001a\u0006\bå\u0002\u0010æ\u0002R \u0010è\u0002\u001a\u00030ç\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0002\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002R0\u0010º\u0001\u001a\u00020A2\u0006\u00109\u001a\u00020A8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bº\u0001\u0010§\u0002\u0012\u0005\bí\u0002\u0010\u001a\u001a\u0006\bì\u0002\u0010À\u0002R:\u0010î\u0002\u001a\u00070Hj\u0003`Ö\u00012\u000b\u00109\u001a\u00070Hj\u0003`Ö\u00018\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bî\u0002\u0010ï\u0002\u0012\u0005\bò\u0002\u0010\u001a\u001a\u0006\bð\u0002\u0010ñ\u0002R\u001c\u0010ô\u0002\u001a\u0005\u0018\u00010ó\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010õ\u0002R\u0017\u0010÷\u0002\u001a\u00020A8@X\u0080\u0004¢\u0006\b\u001a\u0006\bö\u0002\u0010À\u0002R\u001e\u0010ú\u0002\u001a\u00020A8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bù\u0002\u0010\u001a\u001a\u0006\bø\u0002\u0010À\u0002R\u001e\u0010ý\u0002\u001a\u00020A8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bü\u0002\u0010\u001a\u001a\u0006\bû\u0002\u0010À\u0002R\u0018\u0010\u0080\u0003\u001a\u00030ó\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u0018\u0010\u0084\u0003\u001a\u00030\u0081\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003R\u0019\u0010\u0087\u0003\u001a\u0004\u0018\u00010^8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003R\u001a\u0010\u008a\u0003\u001a\u0005\u0018\u00010\u0090\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003R\u001e\u0010\u008d\u0003\u001a\u0004\u0018\u00010\u001f*\u00030Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003¨\u0006\u0090\u0003"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "lateChanges", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionImpl;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/CompositionObserverHolder;Landroidx/compose/runtime/CompositionImpl;)V", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "changesApplied$runtime", "changesApplied", "collectParameterInformation", "dispose$runtime", "dispose", "deactivate$runtime", "deactivate", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "startReuseFromRoot", "endReuseFromRoot", "V", "value", "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nextSlot", "()Ljava/lang/Object;", "nextSlotForCache", "", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "(Z)Z", "", "(F)Z", "", "(J)Z", "(I)Z", "updateValue", "(Ljava/lang/Object;)V", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "skipCurrentGroup", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "skipToGroupEnd", "deactivateToEndGroup", "(Z)V", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "stackTraceForValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/ComposeStackTrace;", "stackTraceForValue", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "parentStackTrace", "()Ljava/util/List;", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "content", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "composeContent--ZbOJvo$runtime", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "composeContent", "prepareCompose$runtime", "prepareCompose", "recompose-aFTiNEg$runtime", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "recompose", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "updateComposerInvalidations", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "startRoot", "endRoot", "abortRoot", "startGroup", "endGroup", "skipGroup", "updateSlot", "rememberObserverGroupIndex", "()I", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "currentCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "group", "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentScope", "currentProviders", "updateProviderMapGroup", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "providers", "recordProviderUpdate", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "ensureWriter", "createFreshInsertTable", "forceFreshInsertTable", "isNode", "data", "startReaderGroup", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "exitGroup", "(IZ)V", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "(I)I", "newCount", "updateNodeCountOverrides", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "(IIII)I", "rGroupIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "(III)V", "nearestCommonRoot", "doRecordDownsFor", "Landroidx/compose/runtime/CompositeKeyHashCode;", "recomposeKey", "compositeKeyOf", "(IIJ)J", "Landroidx/compose/runtime/SlotReader;", "groupCompositeKeyPart", "(Landroidx/compose/runtime/SlotReader;I)I", "skipReaderToGroupEnd", "addRecomposeScope", "enterRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "exitRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/MovableContent;", "locals", "parameter", "force", "invokeMovableContentLambda", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "insertMovableContentGuarded", "R", "Landroidx/compose/runtime/ControlledComposition;", "from", "to", "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "currentStackTrace", "()Landroidx/compose/runtime/tooling/ComposeStackTrace;", "dataOffset", "stackTraceForGroup", "(ILjava/lang/Integer;)Ljava/util/List;", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "doCompose", "nodeAt", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "validateNodeExpected", "validateNodeNotExpected", "Landroidx/compose/runtime/Anchor;", "anchor", "recordInsert", "(Landroidx/compose/runtime/Anchor;)V", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Ljava/util/ArrayList;", "pending", "Landroidx/compose/runtime/Pending;", "nodeIndex", "I", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/IntStack;", "parentStateStack", "Landroidx/compose/runtime/IntStack;", "", "nodeCountOverrides", "[I", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "forceRecomposeScopes", "Z", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "Ljava/util/List;", "entersStack", "rootProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/collection/MutableIntObjectMap;", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "derivedStateObserver", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "isComposing", "isComposing$runtime", "()Z", "isDisposed", "isDisposed$runtime", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "errorContext", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "getErrorContext$runtime", "()Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getInserting", "getInserting$annotations", "compositeKeyHashCode", "J", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "Landroidx/compose/runtime/tooling/CompositionData;", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getAreChildrenComposing$runtime", "areChildrenComposing", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getCurrentRecomposeScope$runtime", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "CompositionContextHolder", "CompositionContextImpl", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerImpl implements Composer {
    private CompositionData _compositionData;

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final CoroutineContext applyCoroutineContext;

    @NotNull
    private final ComposerChangeListWriter changeListWriter;

    @NotNull
    private ChangeList changes;
    private int childrenComposing;
    private long compositeKeyHashCode;

    @NotNull
    private final CompositionImpl composition;
    private int compositionToken;
    private ChangeList deferredChanges;

    @NotNull
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;

    @NotNull
    private Anchor insertAnchor;

    @NotNull
    private FixupList insertFixups;

    @NotNull
    private SlotTable insertTable;
    private boolean inserting;

    @NotNull
    private final ArrayList<RecomposeScopeImpl> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;

    @NotNull
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @NotNull
    private final CompositionObserverHolder observerHolder;

    @NotNull
    private final CompositionContext parentContext;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;

    @NotNull
    private SlotReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;

    @NotNull
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;

    @NotNull
    private SlotWriter writer;
    private boolean writerHasAProvider;

    @NotNull
    private final ArrayList<Pending> pendingStack = Stack.m1653constructorimpl$default(null, 1, null);

    @NotNull
    private final IntStack parentStateStack = new IntStack();

    @NotNull
    private final List<Invalidation> invalidations = new ArrayList();

    @NotNull
    private final IntStack entersStack = new IntStack();

    @NotNull
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

    @NotNull
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onRemembered", "", "onAbandoned", "onForgotten", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CompositionContextHolder implements RememberObserver {

        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010$\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0010¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0'2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0010¢\u0006\u0004\b(\u0010)J3\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0'2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0'H\u0010¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b/\u0010\u0019J\u000f\u00104\u001a\u000201H\u0010¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\f2\u0006\u0010\u001c\u001a\u000201¢\u0006\u0004\b5\u00106J\u001d\u0010<\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020\fH\u0010¢\u0006\u0004\b=\u0010\u000eJ\u000f\u0010@\u001a\u00020\fH\u0010¢\u0006\u0004\b?\u0010\u000eJ\u0017\u0010E\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0010¢\u0006\u0004\bC\u0010DJ\u0019\u0010I\u001a\u0004\u0018\u00010F2\u0006\u0010B\u001a\u00020AH\u0010¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\bJ\u0010\u0019J\u001d\u0010N\u001a\u00020M2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0016¢\u0006\u0004\bN\u0010OR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\bV\u0010UR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bX\u0010YR0\u0010Z\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020807\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010;R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020_078\u0006¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]R+\u0010f\u001a\u0002012\u0006\u0010b\u001a\u0002018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\b4\u00103\"\u0004\be\u00106R\u0014\u0010h\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bg\u0010UR\u0014\u0010j\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bi\u0010UR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010\u0017\u001a\u00020o8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006r"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;JZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "", "dispose", "()V", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "unregisterComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "unregisterComposition", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "Lkotlin/Function0;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "invalidate$runtime", "invalidate", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime", "startComposing", "doneComposing$runtime", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "reportRemovedComposition$runtime", "reportRemovedComposition", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "J", "getCompositeKeyHashCode$runtime", "()J", "Z", "getCollectingParameterInformation$runtime", "()Z", "getCollectingSourceInformation$runtime", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "compositionLocalScope", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getStackTraceEnabled$runtime", "stackTraceEnabled", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;

        @NotNull
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState compositionLocalScope = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public CompositionContextImpl(long j2, boolean z, boolean z3, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j2;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z3;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            ComposerImpl.this.parentContext.composeInitial$runtime(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            return ComposerImpl.this.parentContext.composeInitialPaused$runtime(composition, shouldPause, content);
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it8 = set.iterator();
                    while (it8.hasNext()) {
                        it8.next().remove(composerImpl.getCompositionData());
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime() {
            ComposerImpl.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingSourceInformation$runtime, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompositeKeyHashCode$runtime, reason: from getter */
        public long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public Composition getComposition$runtime() {
            return ComposerImpl.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getObserverHolder$runtime, reason: from getter */
        public CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getStackTraceEnabled$runtime() {
            return ComposerImpl.this.parentContext.getStackTraceEnabled$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime(@NotNull MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.invalidate$runtime(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes) {
            return ComposerImpl.this.parentContext.recomposePaused$runtime(composition, shouldPause, invalidScopes);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime(@NotNull Set<CompositionData> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime(@NotNull Composer composer) {
            Intrinsics.i(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime(@NotNull RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.reportPausedScope$runtime(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CancellationHandle scheduleFrameEndCallback(@NotNull Function0<Unit> action) {
            return ComposerImpl.this.parentContext.scheduleFrameEndCallback(action);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime(@NotNull Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it8 = set.iterator();
                while (it8.hasNext()) {
                    Set set2 = (Set) it8.next();
                    Intrinsics.i(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).getCompositionData());
                }
            }
            u0.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentCompositionLocalMap scope) {
            setCompositionLocalScope(scope);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> set, @NotNull ChangeList changeList, @NotNull ChangeList changeList2, @NotNull CompositionObserverHolder compositionObserverHolder, @NotNull CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                this.this$0.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m1653constructorimpl$default(null, 1, null);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            CoroutineContext effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            CoroutineContext errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? kotlin.coroutines.g.f186406a : errorContext$runtime);
        } catch (Throwable th10) {
            slotReaderOpenReader2.close();
            throw th10;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m1651clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compositeKeyHashCode = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L21
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r2 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            r0.<init>(r2)
            java.util.ArrayList<androidx.compose.runtime.RecomposeScopeImpl> r1 = r4.invalidateStack
            androidx.compose.runtime.Stack.m1660pushimpl(r1, r0)
            r4.updateValue(r0)
            r4.enterRecomposeScope(r0)
            return
        L21:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r4.invalidations
            androidx.compose.runtime.SlotReader r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerImplKt.access$removeLocation(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.reader
            java.lang.Object r2 = r2.next()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r3 == 0) goto L4f
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r3 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.i(r3, r1)
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L57
        L4f:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L57:
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L69
            boolean r0 = r2.getForcedRecompose()
            if (r0 == 0) goto L64
            r2.setForcedRecompose(r1)
        L64:
            if (r0 == 0) goto L67
            goto L69
        L67:
            r0 = r1
            goto L6a
        L69:
            r0 = r3
        L6a:
            r2.setRequiresRecompose(r0)
            java.util.ArrayList<androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.invalidateStack
            androidx.compose.runtime.Stack.m1660pushimpl(r0, r2)
            r4.enterRecomposeScope(r2)
            boolean r0 = r2.getPaused()
            if (r0 == 0) goto L95
            r2.setPaused(r1)
            r2.setResuming(r3)
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r4.changeListWriter
            r0.startResumingScope(r2)
            boolean r0 = r4.reusing
            if (r0 != 0) goto L95
            boolean r0 = r2.getReusing()
            if (r0 == 0) goto L95
            r4.reusing = r3
            r2.setResetReusing(r3)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m1651clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final long compositeKeyOf(int group, int recomposeGroup, long recomposeKey) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i = 3;
        int i2 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                jRotateLeft = Long.rotateLeft(recomposeKey, i2);
            } else {
                int iGroupCompositeKeyPart = groupCompositeKeyPart(this.reader, group);
                if (iGroupCompositeKeyPart == 126665345) {
                    jRotateLeft = Long.rotateLeft(iGroupCompositeKeyPart, i2);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iGroupCompositeKeyPart, i)) ^ Long.rotateLeft(this.reader.hasObjectKey(group) ? 0 : rGroupIndexOf(group), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    group = this.reader.parent(group);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeStackTrace currentStackTrace() {
        if (!this.parentContext.getStackTraceEnabled$runtime()) {
            return null;
        }
        aim.e eVarB = u.b();
        eVarB.addAll(ComposeStackTraceBuilderKt.buildTrace$default(this.writer, null, 0, null, 7, null));
        eVarB.addAll(ComposeStackTraceBuilderKt.buildTrace(this.reader));
        eVarB.addAll(parentStackTrace());
        return new ComposeStackTrace(u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m1632doComposeaFTiNEg(MutableScatterMap<Object, Object> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        this.observerHolder.current();
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m1636updateComposerInvalidationsRY85e9Y(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != content && content != null) {
                    Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    updateValue(content);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (content != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, content);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objNextSlot == null || objNextSlot.equals(Composer.INSTANCE.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, ComposerKt.getInvocation());
                        u0.f(2, objNextSlot);
                        Expect_jvmKt.invokeComposable(this, (Function2) objNextSlot);
                        endGroup();
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    endRoot();
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    Unit unit = Unit.f186387a;
                    trace.endSection(objBeginSection);
                } catch (Throwable th10) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th10;
                }
            } finally {
            }
        } catch (Throwable th11) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th11;
        }
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, group));
        }
    }

    private final void end(boolean isNode) {
        long jRotateRight;
        long j2;
        int remainingSlots;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        long jRotateRight2;
        long j3;
        int iPeek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objGroupAux = this.writer.groupAux(parent);
            if (objGroupObjectKey != null) {
                int iOrdinal = objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j3 = iOrdinal;
            } else if (objGroupAux == null || iGroupKey != 207 || objGroupAux.equals(Composer.INSTANCE.getEmpty())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3);
                j3 = iGroupKey;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objGroupAux.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j3, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iGroupKey2 = this.reader.groupKey(parent2);
            Object objGroupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object objGroupAux2 = this.reader.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                int iOrdinal2 = objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j2 = iOrdinal2;
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || objGroupAux2.equals(Composer.INSTANCE.getEmpty())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3);
                j2 = iGroupKey2;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objGroupAux2.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j2, 3);
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = keyInfos.get(i2);
                if (setFastToSet.contains(keyInfo)) {
                    list = keyInfos;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            KeyInfo keyInfo2 = used.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list2 = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list2 = used;
                                }
                            } else {
                                list2 = used;
                                i2++;
                            }
                            i3++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            keyInfos = list;
                            used = list2;
                        }
                    }
                    keyInfos = list;
                } else {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    list = keyInfos;
                    ComposerImplKt.removeRange(this.invalidations, keyInfo.getLocation(), this.reader.groupSize(keyInfo.getLocation()) + keyInfo.getLocation());
                }
                i2++;
                keyInfos = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            ComposerImplKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerImplKt.asBool(this.providersInvalidStack.pop());
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        Stack.m1660pushimpl(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void enterRecomposeScope(RecomposeScopeImpl scope) {
        scope.start(this.compositionToken);
        this.observerHolder.current();
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pending = (Pending) Stack.m1659popimpl(this.pendingStack);
        if (pending != null && !inserting) {
            pending.setGroupIndex(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.pop() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + expectedNodeCount;
    }

    private final Function1<Composition, Unit> exitRecomposeScope(RecomposeScopeImpl scope) {
        this.observerHolder.current();
        return scope.end(this.compositionToken);
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m1655isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompositeKeyPart(SlotReader slotReader, int i) {
        Object objGroupAux;
        if (!slotReader.hasObjectKey(i)) {
            int iGroupKey = slotReader.groupKey(i);
            return (iGroupKey != 207 || (objGroupAux = slotReader.groupAux(i)) == null || objGroupAux.equals(Composer.INSTANCE.getEmpty())) ? iGroupKey : objGroupAux.hashCode();
        }
        Object objGroupObjectKey = slotReader.groupObjectKey(i);
        if (objGroupObjectKey != null) {
            return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode();
        }
        return 0;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) throws Throwable {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotReader slotReader;
        int[] iArr;
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList3;
        ControlledComposition composition$runtime;
        ControlledComposition composition$runtime2;
        Integer numValueOf;
        List<Pair<RecomposeScopeImpl, Object>> invalidations$runtime;
        int i;
        int i2;
        SlotReader slotReader2;
        ComposerImpl composerImpl = this;
        List<Pair<MovableContentStateReference, MovableContentStateReference>> list = references;
        ComposerChangeListWriter composerChangeListWriter4 = composerImpl.changeListWriter;
        ChangeList changeList4 = composerImpl.lateChanges;
        ChangeList changeList5 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList4);
            composerImpl.changeListWriter.resetSlots();
            int size = list.size();
            int i3 = 0;
            int i5 = 0;
            while (i5 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i5);
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.f186385a;
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.f186386b;
                    Anchor anchor$runtime = movableContentStateReference.getAnchor();
                    int iAnchorIndex = movableContentStateReference.getSlotTable().anchorIndex(anchor$runtime);
                    IntRef intRef = new IntRef(i3, 1, null);
                    composerImpl.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime);
                    if (movableContentStateReference2 == null) {
                        if (Intrinsics.f(movableContentStateReference.getSlotTable(), composerImpl.insertTable)) {
                            composerImpl.createFreshInsertTable();
                        }
                        SlotReader slotReaderOpenReader = movableContentStateReference.getSlotTable().openReader();
                        try {
                            slotReaderOpenReader.reposition(iAnchorIndex);
                            composerImpl.changeListWriter.moveReaderToAbsolute(iAnchorIndex);
                            try {
                                ChangeList changeList6 = new ChangeList();
                                r5.c cVar = new r5.c(composerImpl, changeList6, slotReaderOpenReader, movableContentStateReference, 13);
                                slotReader2 = slotReaderOpenReader;
                                composerImpl = this;
                                try {
                                    recomposeMovableContent$default(composerImpl, null, null, null, null, cVar, 15, null);
                                    composerImpl.changeListWriter.includeOperationsIn(changeList6, intRef);
                                    Unit unit = Unit.f186387a;
                                    slotReader2.close();
                                    composerChangeListWriter2 = composerChangeListWriter4;
                                    changeList2 = changeList5;
                                    i = size;
                                    i2 = i5;
                                } catch (Throwable th10) {
                                    th = th10;
                                    slotReader2.close();
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                slotReader2 = slotReaderOpenReader;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            slotReader2 = slotReaderOpenReader;
                        }
                    } else {
                        MovableContentState movableContentStateMovableContentStateResolve$runtime = composerImpl.parentContext.movableContentStateResolve$runtime(movableContentStateReference2);
                        SlotTable slotTable$runtime = movableContentStateReference2.getSlotTable();
                        Anchor anchor$runtime2 = movableContentStateReference2.getAnchor();
                        List<? extends Object> listCollectNodesFrom = ComposerImplKt.collectNodesFrom(slotTable$runtime, anchor$runtime2);
                        if (!listCollectNodesFrom.isEmpty()) {
                            composerImpl.changeListWriter.copyNodesToNewAnchorLocation(listCollectNodesFrom, intRef);
                            if (Intrinsics.f(movableContentStateReference.getSlotTable(), composerImpl.slotTable)) {
                                int iAnchorIndex2 = composerImpl.slotTable.anchorIndex(anchor$runtime);
                                composerImpl.updateNodeCount(iAnchorIndex2, composerImpl.updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        composerImpl.changeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime, composerImpl.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader slotReaderOpenReader2 = slotTable$runtime.openReader();
                        try {
                            SlotReader slotReader3 = composerImpl.reader;
                            int[] iArr2 = composerImpl.nodeCountOverrides;
                            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap2 = composerImpl.providerUpdates;
                            composerImpl.nodeCountOverrides = null;
                            composerImpl.providerUpdates = null;
                            try {
                                composerImpl.reader = slotReaderOpenReader2;
                                int iAnchorIndex3 = slotTable$runtime.anchorIndex(anchor$runtime2);
                                slotReaderOpenReader2.reposition(iAnchorIndex3);
                                composerImpl.changeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = composerImpl.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    slotReader = slotReaderOpenReader2;
                                    try {
                                        ComposerChangeListWriter composerChangeListWriter6 = composerImpl.changeListWriter;
                                        boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(false);
                                            try {
                                                composition$runtime = movableContentStateReference2.getComposition();
                                                try {
                                                    composition$runtime2 = movableContentStateReference.getComposition();
                                                    numValueOf = Integer.valueOf(slotReader.getCurrentGroup());
                                                    invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    iArr = iArr2;
                                                    mutableIntObjectMap = mutableIntObjectMap2;
                                                    composerChangeListWriter3 = composerChangeListWriter5;
                                                    changeList3 = changeList8;
                                                    composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                iArr = iArr2;
                                                changeList3 = changeList8;
                                            }
                                            try {
                                                i = size;
                                                iArr = iArr2;
                                                composerChangeListWriter2 = composerChangeListWriter4;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                                i2 = i5;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList2 = changeList5;
                                                changeList3 = changeList8;
                                                try {
                                                    composerImpl.recomposeMovableContent(composition$runtime, composition$runtime2, numValueOf, invalidations$runtime, new ywi.b(composerImpl, movableContentStateReference, 8));
                                                    try {
                                                        composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                        try {
                                                            composerChangeListWriter3.setChangeList(changeList3);
                                                            composerImpl.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                            Unit unit2 = Unit.f186387a;
                                                            try {
                                                                composerImpl.reader = slotReader3;
                                                                composerImpl.nodeCountOverrides = iArr;
                                                                composerImpl.providerUpdates = mutableIntObjectMap;
                                                                try {
                                                                    slotReader.close();
                                                                } catch (Throwable th15) {
                                                                    th = th15;
                                                                    composerChangeListWriter = composerChangeListWriter2;
                                                                    changeList = changeList2;
                                                                    composerChangeListWriter.setChangeList(changeList);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                                slotReader.close();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            composerImpl.reader = slotReader3;
                                                            composerImpl.nodeCountOverrides = iArr;
                                                            composerImpl.providerUpdates = mutableIntObjectMap;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        composerChangeListWriter3.setChangeList(changeList3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                iArr = iArr2;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList3 = changeList8;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                            iArr = iArr2;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        iArr = iArr2;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                        changeList3 = changeList8;
                                        composerChangeListWriter3.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    iArr = iArr2;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    slotReader = slotReaderOpenReader2;
                                }
                            } catch (Throwable th24) {
                                th = th24;
                                iArr = iArr2;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = slotReaderOpenReader2;
                            }
                        } catch (Throwable th25) {
                            th = th25;
                            slotReader = slotReaderOpenReader2;
                        }
                    }
                    composerImpl.changeListWriter.skipToEndOfCurrentGroup();
                    i5 = i2 + 1;
                    list = references;
                    size = i;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    changeList5 = changeList2;
                    i3 = 0;
                } catch (Throwable th26) {
                    th = th26;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList5;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList9 = changeList5;
            composerImpl.changeListWriter.endMovableContentPlacement();
            composerImpl.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (Throwable th27) {
            th = th27;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$0$0$0$0(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        ComposerChangeListWriter composerChangeListWriter = composerImpl.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader slotReader2 = composerImpl.reader;
            int[] iArr = composerImpl.nodeCountOverrides;
            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = composerImpl.providerUpdates;
            composerImpl.nodeCountOverrides = null;
            composerImpl.providerUpdates = null;
            try {
                composerImpl.reader = slotReader;
                ComposerChangeListWriter composerChangeListWriter2 = composerImpl.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    movableContentStateReference.getContent$runtime();
                    composerImpl.invokeMovableContentLambda(null, movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    Unit unit = Unit.f186387a;
                    composerChangeListWriter.setChangeList(changeList2);
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th10;
                }
            } finally {
                composerImpl.reader = slotReader2;
                composerImpl.nodeCountOverrides = iArr;
                composerImpl.providerUpdates = mutableIntObjectMap;
            }
        } catch (Throwable th11) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$0$0$1$0$0$0$0(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        movableContentStateReference.getContent$runtime();
        composerImpl.invokeMovableContentLambda(null, movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
        return Unit.f186387a;
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    private final void invokeMovableContentLambda(MovableContent<Object> content, PersistentCompositionLocalMap locals, Object parameter, boolean force) {
        startMovableGroup(126665345, content);
        updateSlot(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            boolean z = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.f(this.reader.getGroupAux(), locals)) {
                z = true;
            }
            if (z) {
                recordProviderUpdate(locals);
            }
            m1633startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1639getGroupULZAiWs(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                this.providersInvalid = z;
                throw null;
            }
            if (ComposeRuntimeFlags.isMovableContentUsageTrackingEnabled) {
                throw null;
            }
            this.writerHasAProvider = true;
            SlotWriter slotWriter = this.writer;
            this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), f0.f322471a, currentCompositionLocalScope(), null));
        } catch (Throwable th10) {
            try {
                throw ComposeStackTraceKt.attachComposeStackTrace(th10, new z1.a(this, 1));
            } finally {
                endGroup();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += this.reader.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int rGroupIndexOf(int group) {
        int iParent = this.reader.parent(group) + 1;
        int i = 0;
        while (iParent < group) {
            if (!this.reader.hasObjectKey(iParent)) {
                i++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0021, B:11:0x002b, B:10:0x0027, B:14:0x0032, B:16:0x0038, B:18:0x003e), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> r10, kotlin.jvm.functions.Function0<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L25
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L25
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
        L11:
            if (r2 >= r3) goto L2e
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L25
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r4.f186385a     // Catch: java.lang.Throwable -> L25
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.f186386b     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L25
            goto L2b
        L25:
            r7 = move-exception
            goto L47
        L27:
            r4 = 0
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L25
        L2b:
            int r2 = r2 + 1
            goto L11
        L2e:
            if (r7 == 0) goto L3e
            if (r9 == 0) goto L37
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L25
            goto L38
        L37:
            r9 = -1
        L38:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto L42
        L3e:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L25
        L42:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L47:
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            controlledComposition = null;
        }
        if ((i & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        return composerImpl.recomposeMovableContent(controlledComposition, controlledComposition2, num, list, function0);
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        Invalidation invalidationFirstInRange = ComposerImplKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z3 = false;
        int i5 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            RecomposeScopeImpl scope = invalidationFirstInRange.getScope();
            ComposerImplKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i5, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compositeKeyHashCode = compositeKeyOf(this.reader.parent(currentGroup), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                z3 = true;
                i5 = currentGroup;
            } else {
                Stack.m1660pushimpl(this.invalidateStack, scope);
                this.observerHolder.current();
                scope.rereadTrackedInstances();
                Stack.m1659popimpl(this.invalidateStack);
            }
            invalidationFirstInRange = ComposerImplKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z3) {
            recordUpsAndDowns(i5, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + iUpdatedNodeCount;
            this.groupNodeCount = i2 + iUpdatedNodeCount;
            this.rGroupIndex = i3;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = z;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap providers) {
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), providers);
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerImplKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iNearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                this.changeListWriter.moveUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, iNearestCommonRootOf);
    }

    private final int rememberObserverGroupIndex() {
        return this.rGroupIndex - 1;
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th10;
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        boolean zIsNode = this.reader.isNode(groupBeingRemoved);
        if (zIsNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(groupBeingRemoved));
        }
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, groupBeingRemoved, zIsNode, 0);
        this.changeListWriter.endNodeMovement();
        if (zIsNode) {
            this.changeListWriter.moveUp();
        }
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i2)) {
            int iGroupKey = slotReader.groupKey(i2);
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (iGroupKey != 206 || !Intrinsics.f(objGroupObjectKey, ComposerKt.getReference())) {
                if (slotReader.isNode(i2)) {
                    return 1;
                }
                return slotReader.nodeCount(i2);
            }
            Object objGroupGet = slotReader.groupGet(i2, 0);
            RememberObserverHolder rememberObserverHolder = objGroupGet instanceof RememberObserverHolder ? (RememberObserverHolder) objGroupGet : null;
            RememberObserver wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
            CompositionContextHolder compositionContextHolder = wrapped instanceof CompositionContextHolder ? (CompositionContextHolder) wrapped : null;
            if (compositionContextHolder != null) {
                for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                    composerImpl2.reportAllMovableContent();
                    composerImpl.parentContext.reportRemovedComposition$runtime(composerImpl2.getComposition());
                }
            }
            return slotReader.nodeCount(i2);
        }
        if (!slotReader.containsMark(i2)) {
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        int iGroupSize = slotReader.groupSize(i2) + i2;
        int iReportFreeMovableContent$reportGroup = 0;
        for (int iGroupSize2 = i2 + 1; iGroupSize2 < iGroupSize; iGroupSize2 += slotReader.groupSize(iGroupSize2)) {
            boolean zIsNode = slotReader.isNode(iGroupSize2);
            if (zIsNode) {
                composerImpl.changeListWriter.endNodeMovement();
                composerImpl.changeListWriter.moveDown(slotReader.node(iGroupSize2));
            }
            iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, i, iGroupSize2, zIsNode || z, zIsNode ? 0 : i3 + iReportFreeMovableContent$reportGroup);
            if (zIsNode) {
                composerImpl.changeListWriter.endNodeMovement();
                composerImpl.changeListWriter.moveUp();
            }
        }
        if (slotReader.isNode(i2)) {
            return 1;
        }
        return iReportFreeMovableContent$reportGroup;
    }

    private final void skipGroup() {
        this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final List<ComposeStackTraceFrame> stackTraceForGroup(int group, Integer dataOffset) {
        SlotReader slotReaderOpenReader = this.slotTable.openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, group, dataOffset);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stackTraceForValue$lambda$0(Object obj2, Object obj3) {
        if (obj3 == obj2) {
            return true;
        }
        RememberObserverHolder rememberObserverHolder = obj3 instanceof RememberObserverHolder ? (RememberObserverHolder) obj3 : null;
        return (rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) == obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m1633startBaiHCIY(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1633startBaiHCIY(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void startGroup(int key) {
        m1633startBaiHCIY(key, null, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean isNode, Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            this.changeListWriter.updateAuxData(data);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        this.providersInvalidStack.push(ComposerImplKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        if (this.sourceMarkersEnabled) {
            CompositionLocal<CompositionErrorContext> localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            Intrinsics.i(localCompositionErrorContext, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(compositionLocalScope$runtime, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime(set);
        }
        startGroup(Long.hashCode(this.parentContext.getCompositeKeyHashCode()));
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                p.q(-1, iArr);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int iUpdatedNodeCount = updatedNodeCount(group);
        if (iUpdatedNodeCount != newCount) {
            int i = newCount - iUpdatedNodeCount;
            int iM1654getSizeimpl = Stack.m1654getSizeimpl(this.pendingStack) - 1;
            while (group != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, iUpdatedNodeCount2);
                int i2 = iM1654getSizeimpl;
                while (true) {
                    if (-1 < i2) {
                        Pending pending = (Pending) Stack.m1658peekimpl(this.pendingStack, i2);
                        if (pending != null && pending.updateNodeCount(group, iUpdatedNodeCount2)) {
                            iM1654getSizeimpl = i2 - 1;
                            break;
                        }
                        i2--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder = parentScope.builder2();
        builder.putAll(currentProviders);
        ?? Build = builder.build2();
        startGroup(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, ComposerKt.getProviderMaps());
        updateSlot(Build);
        updateSlot(currentProviders);
        endGroup();
        return Build;
    }

    private final void updateSlot(Object value) {
        nextSlot();
        updateValue(value);
    }

    private final int updatedNodeCount(int group) {
        int i;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(group)) {
            return 0;
        }
        return mutableIntIntMap.get(group);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        if (getInserting()) {
            this.insertFixups.updateNode(value, block);
        } else {
            this.changeListWriter.updateNode(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        RememberObserverHolder reusableRememberObserverHolder = objNextSlot instanceof RememberObserverHolder ? (RememberObserverHolder) objNextSlot : null;
        if (reusableRememberObserverHolder == null) {
            reusableRememberObserverHolder = new ReusableRememberObserverHolder(new CompositionContextHolder(new CompositionContextImpl(getCompositeKeyHashCode(), this.forceRecomposeScopes, this.sourceMarkersEnabled, getComposition().getObserverHolder())), -1);
            updateValue(reusableRememberObserverHolder);
        }
        RememberObserver wrapped = reusableRememberObserverHolder.getWrapped();
        Intrinsics.i(wrapped, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        CompositionContextHolder compositionContextHolder = (CompositionContextHolder) wrapped;
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(Object value) {
        if (Intrinsics.f(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changedInstance(Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    /* JADX INFO: renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public final void m1634composeContentZbOJvo$runtime(@NotNull MutableScatterMap<Object, Object> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content, ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m1632doComposeaFTiNEg(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull Function0<? extends T> factory) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(factory, iPeek, anchor);
    }

    public final void deactivate$runtime() {
        Stack.m1651clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void deactivateToEndGroup(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerImplKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    public final void dispose$runtime() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.f186387a;
            trace.endSection(objBeginSection);
        } catch (Throwable th10) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th10;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerImplKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerImplKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m1656isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m1659popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            Function1<Composition, Unit> function1ExitRecomposeScope = exitRecomposeScope(recomposeScopeImpl2);
            if (function1ExitRecomposeScope != null) {
                this.changeListWriter.endCompositionScope(function1ExitRecomposeScope, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    this.reusing = false;
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    public final boolean getAreChildrenComposing$runtime() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.Composer
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @NotNull
    public CompositionImpl getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        ArrayList<RecomposeScopeImpl> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m1656isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m1657peekimpl(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return !getSkipping() || this.providersInvalid || ((currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && currentRecomposeScope$runtime.getDefaultsInvalid());
    }

    /* JADX INFO: renamed from: getDeferredChanges$runtime, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.parentContext.getStackTraceEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @NotNull
    /* JADX INFO: renamed from: getReader$runtime, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th10) {
            abortRoot();
            throw th10;
        }
    }

    /* JADX INFO: renamed from: isComposing$runtime, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next : Composer.INSTANCE.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.INSTANCE.getEmpty();
    }

    @NotNull
    public final List<ComposeStackTraceFrame> parentStackTrace() {
        Integer numFindSubcompositionContextGroup;
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl != null && (numFindSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(compositionImpl.getSlotTable(), this.parentContext)) != null) {
            SlotReader slotReaderOpenReader = compositionImpl.getSlotTable().openReader();
            try {
                List<ComposeStackTraceFrame> listTraceForGroup = ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, numFindSubcompositionContextGroup.intValue(), 0);
                slotReaderOpenReader.close();
                return d0.E0(compositionImpl.getComposer().parentStackTrace(), listTraceForGroup);
            } catch (Throwable th10) {
                slotReaderOpenReader.close();
                throw th10;
            }
        }
        return f0.f322471a;
    }

    public final void prepareCompose$runtime(@NotNull Function0<Unit> block) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* JADX INFO: renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public final boolean m1635recomposeaFTiNEg$runtime(@NotNull MutableScatterMap<Object, Object> invalidationsRequested, ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m1693getSizeimpl(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m1632doComposeaFTiNEg(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
        } catch (Throwable th10) {
            this.shouldPauseCallback = null;
            throw th10;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull Function0<Unit> effect) {
        this.changeListWriter.sideEffect(effect);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean shouldExecute(boolean parametersChanged, int flags) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((flags & 1) == 0 && (getInserting() || this.reusing)) {
            ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
            if (shouldPauseCallback != null && (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && shouldPauseCallback.shouldPause() && !currentRecomposeScope$runtime.getResuming()) {
                currentRecomposeScope$runtime.setUsed(true);
                currentRecomposeScope$runtime.setReusing(this.reusing);
                currentRecomposeScope$runtime.setPaused(true);
                this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime);
                this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
                return false;
            }
        } else if (!parametersChanged && getSkipping()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void skipCurrentGroup() {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.skipCurrentGroup():void");
    }

    @Override // androidx.compose.runtime.Composer
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @NotNull
    public final ComposeStackTrace stackTraceForValue$runtime(Object value) {
        List listE0;
        ObjectLocation objectLocationFindLocation = ComposeStackTraceBuilderKt.findLocation(this.slotTable, new sx4.b(value, 20));
        if (objectLocationFindLocation != null) {
            listE0 = d0.E0(parentStackTrace(), stackTraceForGroup(objectLocationFindLocation.getGroup(), objectLocationFindLocation.getDataOffset()));
        } else {
            listE0 = f0.f322471a;
        }
        return new ComposeStackTrace(listE0);
    }

    @Override // androidx.compose.runtime.Composer
    public void startDefaults() {
        m1633startBaiHCIY(RangingPosition.RSSI_MIN, null, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startMovableGroup(int key, Object dataKey) {
        m1633startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m1633startBaiHCIY(ISO781611.SMT_TAG, null, GroupKind.INSTANCE.m1640getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(@NotNull ProvidedValue<?> value) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (Intrinsics.f(objRememberedValue, Composer.INSTANCE.getEmpty())) {
            valueHolder = null;
        } else {
            Intrinsics.i(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = value.getCompositionLocal();
        Intrinsics.i(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(value, valueHolder);
        boolean zF = Intrinsics.f(valueHolderUpdatedStateOf$runtime, valueHolder);
        if (!zF) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime);
        }
        boolean z = true;
        boolean z3 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal)) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            Intrinsics.i(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            if (!(getSkipping() && zF) && (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal))) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            } else if ((zF && !this.providersInvalid) || !this.providersInvalid) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (!this.reusing && persistentCompositionLocalMap == persistentCompositionLocalMapCurrentCompositionLocalScope) {
                z = false;
            }
            z3 = z;
        }
        if (z3 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapCurrentCompositionLocalScope);
        }
        this.providersInvalidStack.push(ComposerImplKt.asInt(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapCurrentCompositionLocalScope;
        m1633startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1639getGroupULZAiWs(), persistentCompositionLocalMapCurrentCompositionLocalScope);
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(@NotNull ProvidedValue<?>[] values) {
        PersistentCompositionLocalMap persistentCompositionLocalMapUpdateProviderMapGroup;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z = true;
        boolean z3 = false;
        if (getInserting()) {
            persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(values, persistentCompositionLocalMapCurrentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.i(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.i(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(values, persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && persistentCompositionLocalMap2.equals(persistentCompositionLocalMapUpdateCompositionMap)) {
                skipGroup();
                persistentCompositionLocalMapUpdateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMapUpdateCompositionMap);
                if (!this.reusing && Intrinsics.f(persistentCompositionLocalMapUpdateProviderMapGroup, persistentCompositionLocalMap)) {
                    z = false;
                }
                z3 = z;
            }
        }
        if (z3 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerImplKt.asInt(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
        m1633startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1639getGroupULZAiWs(), persistentCompositionLocalMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceGroup(int key) {
        if (this.pending != null) {
            m1633startBaiHCIY(key, null, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(key, Composer.INSTANCE.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == key && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i, slotReader.skipGroup());
            ComposerImplKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(key, Composer.INSTANCE.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceableGroup(int key) {
        m1633startBaiHCIY(key, null, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !Intrinsics.f(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m1633startBaiHCIY(key, null, GroupKind.INSTANCE.m1639getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m1633startBaiHCIY(ISO781611.SMT_TAG, null, GroupKind.INSTANCE.m1641getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final boolean tryImminentInvalidation$runtime(@NotNull RecomposeScopeImpl scope, Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerImplKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    public final void updateCachedValue(Object value) {
        boolean z = value instanceof RememberObserver;
        Object obj2 = value;
        if (z) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) value, rememberObserverGroupIndex());
            if (getInserting()) {
                this.changeListWriter.remember(rememberObserverHolder);
            }
            this.abandonSet.add(value);
            obj2 = rememberObserverHolder;
        }
        updateValue(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX INFO: renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1636updateComposerInvalidationsRY85e9Y(@org.jetbrains.annotations.NotNull androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.List<androidx.compose.runtime.Invalidation> r2 = r0.invalidations
            int r2 = zhm.v.j(r2)
        La:
            r3 = -1
            if (r3 >= r2) goto L3f
            java.util.List<androidx.compose.runtime.Invalidation> r3 = r0.invalidations
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.runtime.Invalidation r3 = (androidx.compose.runtime.Invalidation) r3
            androidx.compose.runtime.RecomposeScopeImpl r4 = r3.getScope()
            androidx.compose.runtime.Anchor r4 = r4.getAnchor()
            if (r4 == 0) goto L37
            boolean r5 = r4.getValid()
            if (r5 == 0) goto L37
            int r5 = r3.getLocation()
            int r6 = r4.getLocation()
            if (r5 == r6) goto L3c
            int r4 = r4.getLocation()
            r3.setLocation(r4)
            goto L3c
        L37:
            java.util.List<androidx.compose.runtime.Invalidation> r3 = r0.invalidations
            r3.remove(r2)
        L3c:
            int r2 = r2 + (-1)
            goto La
        L3f:
            java.lang.Object[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La3
            r6 = 0
        L4b:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9e
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L65:
            if (r11 >= r9) goto L9c
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L98
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.i(r13, r14)
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            androidx.compose.runtime.Anchor r14 = r13.getAnchor()
            if (r14 == 0) goto L98
            int r14 = r14.getLocation()
            java.util.List<androidx.compose.runtime.Invalidation> r15 = r0.invalidations
            androidx.compose.runtime.ScopeInvalidated r5 = androidx.compose.runtime.ScopeInvalidated.INSTANCE
            if (r12 != r5) goto L90
            r12 = 0
        L90:
            androidx.compose.runtime.Invalidation r5 = new androidx.compose.runtime.Invalidation
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L98:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L65
        L9c:
            if (r9 != r10) goto La3
        L9e:
            if (r6 == r4) goto La3
            int r6 = r6 + 1
            goto L4b
        La3:
            java.util.List<androidx.compose.runtime.Invalidation> r1 = r0.invalidations
            java.util.Comparator r2 = androidx.compose.runtime.ComposerImplKt.access$getInvalidationLocationAscending$p()
            zhm.z.w(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1636updateComposerInvalidationsRY85e9Y(androidx.collection.MutableScatterMap):void");
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object value) {
        updateCachedValue(value);
    }

    public final void updateValue(Object value) {
        if (getInserting()) {
            this.writer.update(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), value);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (!this.changeListWriter.getPastParent()) {
            this.changeListWriter.updateValue(value, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.updateAnchoredValue(value, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    private final void startGroup(int key, Object dataKey) {
        m1633startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1639getGroupULZAiWs(), null);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int group) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.f(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Intrinsics.i(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && Intrinsics.f(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(group)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(group);
                        Intrinsics.i(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && value == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
