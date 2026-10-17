package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.ObservableComposition;
import d9.e1;
import fim.h;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import nkm.n;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g1;
import skm.h1;
import skm.l;
import skm.r1;
import skm.s;
import vkm.q;
import yhm.m;
import yhm.o;
import yuc.p;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 Ý\u00012\u00020\u0001:\bÞ\u0001ß\u0001à\u0001Ý\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001bH\u0010¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\nJ\u001d\u0010.\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0010¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b2\u00100J\u0017\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u000204H\u0010¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b9\u00100J\u0019\u0010>\u001a\u0004\u0018\u00010;2\u0006\u00105\u001a\u000204H\u0010¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\nJ\u000f\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ-\u0010N\u001a\u00020\u00062\u0006\u0010K\u001a\u00020J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010M\u001a\u00020CH\u0002¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120PH\u0002¢\u0006\u0004\bS\u0010RJ\u000f\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010\nJ\u0017\u0010U\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u00100J\u0017\u0010V\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bV\u00100J\u0017\u0010W\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bW\u00100J\u0017\u0010X\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bX\u00100J\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bY\u00100J\u0010\u0010Z\u001a\u00020\u0006H\u0082@¢\u0006\u0004\bZ\u0010\bJ:\u0010a\u001a\u00020\u00062(\u0010`\u001a$\b\u0001\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060^\u0012\u0006\u0012\u0004\u0018\u00010_0[H\u0082@¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bc\u00100J)\u0010f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010dH\u0002¢\u0006\u0004\bf\u0010gJ3\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00120P2\f\u0010h\u001a\b\u0012\u0004\u0012\u0002040P2\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010dH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0006H\u0002¢\u0006\u0004\bk\u0010\nJ#\u0010m\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00060l2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bm\u0010nJ3\u0010o\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00060l2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010dH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00062\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tR$\u0010w\u001a\u00020u2\u0006\u0010v\u001a\u00020u8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u00070_j\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001f\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020_0d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008a\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u0002040\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008a\u0001R-\u0010\u0095\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010_0\u0094\u0001\u0012\u0004\u0012\u0002040\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R$\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020;0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0096\u0001R$\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0096\u0001R\"\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008a\u0001R!\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010£\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¦\u0001R\u001f\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R&\u0010°\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010d0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R)\u0010¹\u0001\u001a\u000b\u0012\u0004\u0012\u00020_\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b¹\u0001\u0010º\u0001\u0012\u0005\b»\u0001\u0010\nR\u001c\u0010½\u0001\u001a\u00070¼\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010¿\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Å\u0001\u001a\u00070uj\u0003`Ã\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010zR\u0016\u0010Ç\u0001\u001a\u00020C8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010ER\u0016\u0010É\u0001\u001a\u00020C8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010ER\u0016\u0010Ë\u0001\u001a\u00020C8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010ER\u0016\u0010Í\u0001\u001a\u00020C8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010ER\u0019\u0010\u0013\u001a\u0005\u0018\u00010Î\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010Ò\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010ER\u0016\u0010Ô\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010ER\u0016\u0010Ö\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010ER\u0016\u0010Ø\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010ER\u0016\u0010Ú\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010ER\u0016\u0010Ü\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010E¨\u0006á\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Lkotlin/Function0;", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "Landroidx/compose/runtime/ControlledComposition;", "composition", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "unregisterComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "unregisterComposition", "invalidate$runtime", "invalidate", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "reportRemovedComposition$runtime", "reportRemovedComposition", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "Lkotlinx/coroutines/CancellableContinuation;", "deriveStateLocked", "()Lkotlinx/coroutines/CancellableContinuation;", "onNewFrameAwaiter", "", "recordComposerModifications", "()Z", "Lkotlinx/coroutines/Job;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/Job;)V", "", "e", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "", "knownCompositions", "()Ljava/util/List;", "knownCompositionsLocked", "clearKnownCompositionsLocked", "removeKnownCompositionLocked", "addKnownCompositionLocked", "registerCompositionLocked", "unregisterCompositionLocked", "recordFailedCompositionLocked", "awaitWorkAvailable", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/Continuation;", "", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "references", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "Lkotlin/Function1;", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "", "value", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/NextFrameEndCallbackQueue;", "nextFrameEndCallbackQueue", "Landroidx/compose/runtime/NextFrameEndCallbackQueue;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/Job;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Lskm/s;", "effectJob", "Lskm/s;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/MutableObjectList;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "compositeKeyHashCode", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getCollectingParameterInformation$runtime", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "getStackTraceEnabled$runtime", "stackTraceEnabled", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasNextFrameEndAwaitersLocked", "hasNextFrameEndAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "Companion", "State", "RecomposerInfoImpl", "RecomposerErrorState", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recomposer extends CompositionContext {

    @NotNull
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;

    @NotNull
    private final MutableStateFlow _state;

    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;

    @NotNull
    private final MutableVector<ControlledComposition> compositionInvalidations;

    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;

    @NotNull
    private final CoroutineContext effectCoroutineContext;

    @NotNull
    private final s effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;

    @NotNull
    private final List<MovableContentStateReference> movableContentAwaitingInsert;

    @NotNull
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;

    @NotNull
    private final NestedContentMap movableContentNestedStatesAvailable;

    @NotNull
    private final MutableScatterMap<Object, Object> movableContentRemoved;

    @NotNull
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;

    @NotNull
    private final NextFrameEndCallbackQueue nextFrameEndCallbackQueue;

    @NotNull
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;

    @NotNull
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<Object> registrationObservers;
    private Job runnerJob;

    @NotNull
    private MutableScatterSet<Object> snapshotInvalidations;

    @NotNull
    private final Object stateLock;
    private CancellableContinuation workContinuation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final MutableStateFlow _runningRecomposers = q.c(ExtensionsKt.persistentSetOf());

    @NotNull
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add(info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.h(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove(info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.h(persistentSet, persistentSetRemove));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "Z", "getRecoverable", "()Z", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecomposerErrorState {

        @NotNull
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, @NotNull Throwable th10) {
            this.recoverable = z;
            this.cause = th10;
        }

        @NotNull
        public Throwable getCause() {
            return this.cause;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RecomposerInfoImpl {
        public RecomposerInfoImpl() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = vc.s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name */
    @gim.d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return Boolean.valueOf(((State) this.L$0) == State.ShutDown);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1173}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18952 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3 $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name and collision with other inner class name */
        @gim.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1173}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C00532 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3 $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00532(Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C00532> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                C00532 c00532 = new C00532(this.$block, this.$parentFrameClock, continuation);
                c00532.L$0 = obj2;
                return c00532;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3 function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00532) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18952(Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C18952> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final kotlin.Unit invokeSuspend$lambda$0(androidx.compose.runtime.Recomposer r17, java.util.Set r18, androidx.compose.runtime.snapshots.Snapshot r19) {
            /*
                r0 = r18
                java.lang.Object r1 = androidx.compose.runtime.Recomposer.access$getStateLock$p(r17)
                monitor-enter(r1)
                kotlinx.coroutines.flow.MutableStateFlow r2 = androidx.compose.runtime.Recomposer.access$get_state$p(r17)     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L6f
                androidx.compose.runtime.Recomposer$State r2 = (androidx.compose.runtime.Recomposer.State) r2     // Catch: java.lang.Throwable -> L6f
                androidx.compose.runtime.Recomposer$State r3 = androidx.compose.runtime.Recomposer.State.Idle     // Catch: java.lang.Throwable -> L6f
                int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L6f
                if (r2 < 0) goto Laa
                androidx.collection.MutableScatterSet r2 = androidx.compose.runtime.Recomposer.access$getSnapshotInvalidations$p(r17)     // Catch: java.lang.Throwable -> L6f
                boolean r3 = r0 instanceof androidx.compose.runtime.collection.ScatterSetWrapper     // Catch: java.lang.Throwable -> L6f
                r4 = 1
                if (r3 == 0) goto L7f
                androidx.compose.runtime.collection.ScatterSetWrapper r0 = (androidx.compose.runtime.collection.ScatterSetWrapper) r0     // Catch: java.lang.Throwable -> L6f
                androidx.collection.ScatterSet r0 = r0.getSet$runtime()     // Catch: java.lang.Throwable -> L6f
                java.lang.Object[] r3 = r0.elements     // Catch: java.lang.Throwable -> L6f
                long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L6f
                int r5 = r0.length     // Catch: java.lang.Throwable -> L6f
                int r5 = r5 + (-2)
                if (r5 < 0) goto La5
                r6 = 0
                r7 = r6
            L33:
                r8 = r0[r7]     // Catch: java.lang.Throwable -> L6f
                long r10 = ~r8     // Catch: java.lang.Throwable -> L6f
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L7a
                int r10 = r7 - r5
                int r10 = ~r10     // Catch: java.lang.Throwable -> L6f
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L4d:
                if (r12 >= r10) goto L78
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L74
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r13 instanceof androidx.compose.runtime.snapshots.StateObjectImpl     // Catch: java.lang.Throwable -> L6f
                if (r14 == 0) goto L71
                r14 = r13
                androidx.compose.runtime.snapshots.StateObjectImpl r14 = (androidx.compose.runtime.snapshots.StateObjectImpl) r14     // Catch: java.lang.Throwable -> L6f
                int r15 = androidx.compose.runtime.snapshots.ReaderKind.m1714constructorimpl(r4)     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r14.m1715isReadInh_f27i8$runtime(r15)     // Catch: java.lang.Throwable -> L6f
                if (r14 != 0) goto L71
                goto L74
            L6f:
                r0 = move-exception
                goto Lb8
            L71:
                r2.add(r13)     // Catch: java.lang.Throwable -> L6f
            L74:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L4d
            L78:
                if (r10 != r11) goto La5
            L7a:
                if (r7 == r5) goto La5
                int r7 = r7 + 1
                goto L33
            L7f:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L6f
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            L85:
                boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L6f
                if (r3 == 0) goto La5
                java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r3 instanceof androidx.compose.runtime.snapshots.StateObjectImpl     // Catch: java.lang.Throwable -> L6f
                if (r5 == 0) goto La1
                r5 = r3
                androidx.compose.runtime.snapshots.StateObjectImpl r5 = (androidx.compose.runtime.snapshots.StateObjectImpl) r5     // Catch: java.lang.Throwable -> L6f
                int r6 = androidx.compose.runtime.snapshots.ReaderKind.m1714constructorimpl(r4)     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r5.m1715isReadInh_f27i8$runtime(r6)     // Catch: java.lang.Throwable -> L6f
                if (r5 != 0) goto La1
                goto L85
            La1:
                r2.add(r3)     // Catch: java.lang.Throwable -> L6f
                goto L85
            La5:
                kotlinx.coroutines.CancellableContinuation r0 = androidx.compose.runtime.Recomposer.access$deriveStateLocked(r17)     // Catch: java.lang.Throwable -> L6f
                goto Lab
            Laa:
                r0 = 0
            Lab:
                monitor-exit(r1)
                if (r0 == 0) goto Lb5
                yhm.m$a r1 = yhm.m.INSTANCE
                kotlin.Unit r1 = kotlin.Unit.f186387a
                r0.resumeWith(r1)
            Lb5:
                kotlin.Unit r0 = kotlin.Unit.f186387a
                return r0
            Lb8:
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C18952.invokeSuspend$lambda$0(androidx.compose.runtime.Recomposer, java.util.Set, androidx.compose.runtime.snapshots.Snapshot):kotlin.Unit");
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            C18952 c18952 = Recomposer.this.new C18952(this.$block, this.$parentFrameClock, continuation);
            c18952.L$0 = obj2;
            return c18952;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C18952.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18952) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {598, 609}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18962 extends i implements Function3 {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        public C18962(Continuation<? super C18962> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.ControlledComposition> r23, java.util.List<androidx.compose.runtime.MovableContentStateReference> r24, java.util.List<androidx.compose.runtime.ControlledComposition> r25, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r26, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r27, androidx.collection.MutableScatterSet<java.lang.Object> r28, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r29) {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C18962.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
        }

        private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((MovableContentStateReference) list2.get(i));
                    }
                    recomposer.movableContentAwaitingInsert.clear();
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Type inference failed for: r0v60 */
        /* JADX WARN: Type inference failed for: r0v63 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20, types: [int] */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22, types: [int] */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v8, types: [T[], java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final kotlin.Unit invokeSuspend$lambda$2(androidx.compose.runtime.Recomposer r24, androidx.collection.MutableScatterSet r25, androidx.collection.MutableScatterSet r26, java.util.List r27, java.util.List r28, androidx.collection.MutableScatterSet r29, java.util.List r30, androidx.collection.MutableScatterSet r31, java.util.Set r32, long r33) {
            /*
                Method dump skipped, instruction units count: 944
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C18962.invokeSuspend$lambda$2(androidx.compose.runtime.Recomposer, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, java.util.List, java.util.List, androidx.collection.MutableScatterSet, java.util.List, androidx.collection.MutableScatterSet, java.util.Set, long):kotlin.Unit");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ff -> B:24:0x0107). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0116 -> B:12:0x00aa). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C18962.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C18962 c18962 = Recomposer.this.new C18962(continuation);
            c18962.L$0 = monotonicFrameClock;
            return c18962.invokeSuspend(Unit.f186387a);
        }
    }

    public Recomposer(@NotNull CoroutineContext coroutineContext) {
        final int i = 0;
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0(this) { // from class: z1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Recomposer f318701b;

            {
                this.f318701b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Recomposer.broadcastFrameClock$lambda$0(this.f318701b);
                    default:
                        return Recomposer.nextFrameEndCallbackQueue$lambda$0(this.f318701b);
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        final int i2 = 1;
        this.nextFrameEndCallbackQueue = new NextFrameEndCallbackQueue(new Function0(this) { // from class: z1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Recomposer f318701b;

            {
                this.f318701b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Recomposer.broadcastFrameClock$lambda$0(this.f318701b);
                    default:
                        return Recomposer.nextFrameEndCallbackQueue$lambda$0(this.f318701b);
                }
            }
        });
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, i2, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m1677constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m1677constructorimpl$default(null, 1, null);
        this._state = q.c(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        h1 h1Var = new h1((Job) coroutineContext.get(g1.f263979a));
        h1Var.k(new p(this, 28));
        this.effectJob = h1Var;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(h1Var);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> frame) {
        l lVar;
        if (getHasSchedulingWork()) {
            return Unit.f186387a;
        }
        l lVar2 = new l(1, h.b(frame));
        lVar2.u();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                lVar = lVar2;
            } else {
                this.workContinuation = lVar2;
                lVar = null;
            }
        }
        if (lVar != null) {
            m.Companion aVar = m.INSTANCE;
            lVar.resumeWith(Unit.f186387a);
        }
        Object objT = lVar2.t();
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar2 ? objT : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcastFrameClock$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return Unit.f186387a;
    }

    private final void clearKnownCompositionsLocked() {
        List<ControlledComposition> listKnownCompositionsLocked = knownCompositionsLocked();
        int size = listKnownCompositionsLocked.size();
        for (int i = 0; i < size; i++) {
            unregisterCompositionLocked(listKnownCompositionsLocked.get(i));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = f0.f322471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation deriveStateLocked() {
        State state;
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                cancellableContinuation.a(null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            state = (getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked()) ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked() && !MultiValueMap.m1682isNotEmptyimpl(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        ObjectList objectListEmptyObjectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m1682isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList objectListM1686valuesimpl = MultiValueMap.m1686valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m1675clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m1675clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(objectListM1686valuesimpl.get_size());
                    Object[] objArr = objectListM1686valuesimpl.content;
                    int i2 = objectListM1686valuesimpl._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                        mutableObjectList.add(new Pair(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectListEmptyObjectList = mutableObjectList;
                } else {
                    objectListEmptyObjectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Object[] objArr2 = objectListEmptyObjectList.content;
        int i5 = objectListEmptyObjectList._size;
        for (i = 0; i < i5; i++) {
            Pair pair = (Pair) objArr2[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$0$0(Recomposer recomposer, Throwable th10) {
        CancellableContinuation cancellableContinuation;
        CancellableContinuation cancellableContinuation2;
        CancellationException cancellationExceptionA = e1.a("Recomposer effect job completed", th10);
        synchronized (recomposer.stateLock) {
            try {
                Job job2 = recomposer.runnerJob;
                cancellableContinuation = null;
                if (job2 != null) {
                    recomposer._state.setValue(State.ShuttingDown);
                    if (recomposer.isClosed) {
                        cancellableContinuation2 = recomposer.workContinuation;
                        if (cancellableContinuation2 != null) {
                        }
                        recomposer.workContinuation = null;
                        job2.k(new z1.c(recomposer, th10, 1));
                        cancellableContinuation = cancellableContinuation2;
                    } else {
                        job2.f(cancellationExceptionA);
                    }
                    cancellableContinuation2 = null;
                    recomposer.workContinuation = null;
                    job2.k(new z1.c(recomposer, th10, 1));
                    cancellableContinuation = cancellableContinuation2;
                } else {
                    recomposer.closeCause = cancellationExceptionA;
                    recomposer._state.setValue(State.ShutDown);
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        if (cancellableContinuation != null) {
            m.Companion aVar = m.INSTANCE;
            cancellableContinuation.resumeWith(Unit.f186387a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$0$0$0$0(Recomposer recomposer, Throwable th10, Throwable th11) {
        synchronized (recomposer.stateLock) {
            if (th10 == null) {
                th10 = null;
            } else if (th11 != null) {
                try {
                    if (th11 instanceof CancellationException) {
                        th11 = null;
                    }
                    if (th11 != null) {
                        yhm.f.a(th10, th11);
                    }
                } catch (Throwable th12) {
                    throw th12;
                }
            }
            recomposer.closeCause = th10;
            recomposer._state.setValue(State.ShutDown);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || MultiValueMap.m1682isNotEmptyimpl(this.movableContentRemoved);
    }

    private final boolean getHasNextFrameEndAwaitersLocked() {
        return !this.frameClockPaused && this.nextFrameEndCallbackQueue.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            androidx.collection.MutableScatterSet<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L23
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L25
        L14:
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            boolean r1 = r2.getHasNextFrameEndAwaitersLocked()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            goto L25
        L21:
            r1 = 0
            goto L26
        L23:
            r1 = move-exception
            goto L28
        L25:
            r1 = 1
        L26:
            monitor-exit(r0)
            return r1
        L28:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v7, types: [gim.h, kotlin.jvm.functions.Function2] */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        n nVarA = nkm.p.a((gim.h) ((lim.q) ((r1) this.effectJob).getChildren()).f195577b);
        while (nVarA.hasNext()) {
            if (((Job) nVarA.next()).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions() {
        List<ControlledComposition> listKnownCompositionsLocked;
        synchronized (this.stateLock) {
            listKnownCompositionsLocked = knownCompositionsLocked();
        }
        return listKnownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<ControlledComposition> list2 = this._knownCompositions;
        List<ControlledComposition> arrayList = list2.isEmpty() ? f0.f322471a : new ArrayList(list2);
        this._knownCompositionsCache = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nextFrameEndCallbackQueue$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return Unit.f186387a;
    }

    private final void onNewFrameAwaiter() {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw e1.a("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            m.Companion aVar = m.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Unit.f186387a);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.f(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.f186387a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it8 = recomposer.movableContentAwaitingInsert.iterator();
                while (it8.hasNext()) {
                    MovableContentStateReference next = it8.next();
                    if (Intrinsics.f(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it8.remove();
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0125, code lost:
    
        if (r4 >= r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).f186386b == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        if (r9 >= r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        if (r11.f186386b != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.f186385a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        if (r11 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        zhm.a0.x(r3, r16.movableContentAwaitingInsert);
        r3 = kotlin.Unit.f186387a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0179, code lost:
    
        if (r9 >= r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0184, code lost:
    
        if (((kotlin.Pair) r11).f186386b == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018c, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r17, androidx.collection.MutableScatterSet<java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(ControlledComposition composition, MutableScatterSet<Object> modifiedValues) {
        if (composition.isComposing() || composition.isDisposed()) {
            return null;
        }
        Set<ControlledComposition> set = this.compositionsRemoved;
        if (set != null && set.contains(composition)) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new ywi.b(modifiedValues, composition, 10));
                    }
                } catch (Throwable th10) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th10;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit performRecompose$lambda$0$0(androidx.collection.MutableScatterSet r13, androidx.compose.runtime.ControlledComposition r14) {
        /*
            java.lang.Object[] r0 = r13.elements
            long[] r13 = r13.metadata
            int r1 = r13.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L43
            r2 = 0
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L3e
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L3c
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L38
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.recordWriteOf(r9)
        L38:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L3c:
            if (r6 != r7) goto L43
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto Lb
        L43:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performRecompose$lambda$0$0(androidx.collection.MutableScatterSet, androidx.compose.runtime.ControlledComposition):kotlin.Unit");
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) throws Throwable {
        int i = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                Utils_androidKt.logError("Error was captured in composition.", e);
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e);
                Unit unit = Unit.f186387a;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m1675clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th10, ControlledComposition controlledComposition, boolean z, int i, Object obj2) throws Throwable {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th10, controlledComposition, z);
    }

    private final Function1<Object, Unit> readObserverOf(ControlledComposition composition) {
        return new p(composition, 27);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserverOf$lambda$0(ControlledComposition controlledComposition, Object obj2) {
        controlledComposition.recordReadOf(obj2);
        return Unit.f186387a;
    }

    private final Object recompositionRunner(Function3 function3, Continuation<? super Unit> continuation) throws Throwable {
        Object objJ = e0.J(this.broadcastFrameClock, new C18952(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List<ControlledComposition> listKnownCompositionsLocked = knownCompositionsLocked();
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            int i = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
            try {
                int size = listKnownCompositionsLocked.size();
                while (i < size) {
                    listKnownCompositionsLocked.get(i).recordModificationsOf(setWrapIntoSet);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                    i++;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th10) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    private final void registerCompositionLocked(ControlledComposition composition) {
        MutableObjectList<Object> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    throw new ClassCastException();
                }
                if (composition instanceof ObservableComposition) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th10 = this.closeCause;
            if (th10 != null) {
                throw th10;
            }
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(composition);
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition composition) {
        MutableObjectList<Object> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    throw new ClassCastException();
                }
                if (composition instanceof ObservableComposition) {
                    throw null;
                }
            }
        }
    }

    private final Function1<Object, Unit> writeObserverOf(ControlledComposition composition, MutableScatterSet<Object> modifiedValues) {
        return new z1.c(composition, modifiedValues, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeObserverOf$lambda$0(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj2) {
        controlledComposition.recordWriteOf(obj2);
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj2);
        }
        return Unit.f186387a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        ((r1) this.effectJob).f(null);
    }

    public final void close() {
        h1 h1Var = (h1) this.effectJob;
        h1Var.getClass();
        if (h1Var.U(Unit.f186387a)) {
            synchronized (this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Throwable {
        Throwable th10;
        boolean z;
        Recomposer recomposer;
        Throwable th11;
        boolean zIsComposing = composition.isComposing();
        synchronized (this.stateLock) {
            try {
                State state = (State) this._state.getValue();
                State state2 = State.ShuttingDown;
                if (state.compareTo(state2) > 0) {
                    try {
                        boolean zContains = knownCompositionsLocked().contains(composition);
                        z = !zContains;
                        if (!zContains) {
                            registerCompositionLocked(composition);
                        }
                    } catch (Throwable th12) {
                        th10 = th12;
                        throw th10;
                    }
                } else {
                    z = true;
                }
                try {
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
                    try {
                        Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                        try {
                            composition.composeContent(content);
                            Unit unit = Unit.f186387a;
                            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            synchronized (this.stateLock) {
                                try {
                                    if (((State) this._state.getValue()).compareTo(state2) > 0) {
                                        try {
                                            if (!knownCompositionsLocked().contains(composition)) {
                                                addKnownCompositionLocked(composition);
                                            }
                                        } catch (Throwable th13) {
                                            th11 = th13;
                                            throw th11;
                                        }
                                    } else {
                                        unregisterCompositionLocked(composition);
                                    }
                                    if (!zIsComposing) {
                                        companion.notifyObjectsInitialized();
                                    }
                                    try {
                                        performInitialMovableContentInserts(composition);
                                        try {
                                            composition.applyChanges();
                                            composition.applyLateChanges();
                                            if (zIsComposing) {
                                                return;
                                            }
                                            companion.notifyObjectsInitialized();
                                        } catch (Throwable th14) {
                                            processCompositionError$default(this, th14, null, false, 6, null);
                                        }
                                    } catch (Throwable th15) {
                                        processCompositionError(th15, composition, true);
                                    }
                                } catch (Throwable th16) {
                                    th11 = th16;
                                }
                            }
                        } catch (Throwable th17) {
                            recomposer = this;
                            try {
                                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                                throw th17;
                            } catch (Throwable th18) {
                                th = th18;
                                Throwable th19 = th;
                                try {
                                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                                    throw th19;
                                } catch (Throwable th20) {
                                    th = th20;
                                    Throwable th21 = th;
                                    if (z) {
                                        synchronized (recomposer.stateLock) {
                                            unregisterCompositionLocked(composition);
                                            Unit unit2 = Unit.f186387a;
                                        }
                                    }
                                    processCompositionError(th21, composition, true);
                                }
                            }
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        recomposer = this;
                    }
                } catch (Throwable th23) {
                    th = th23;
                    recomposer = this;
                }
            } catch (Throwable th24) {
                th10 = th24;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                composeInitial$runtime(composition, content);
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCollectingParameterInformation$runtime */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCollectingSourceInformation$runtime */
    public boolean getCollectingSourceInformation() {
        return ComposeStackTraceMode.m1718equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.INSTANCE.m1720getSourceInformationMD5MrJc());
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCompositeKeyHashCode$runtime */
    public long getCompositeKeyHashCode() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime() {
        return null;
    }

    @NotNull
    public final StateFlow getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getStackTraceEnabled$runtime() {
        return !ComposeStackTraceMode.m1718equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.INSTANCE.m1719getNoneMD5MrJc());
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime(@NotNull MovableContentStateReference reference) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            m.Companion aVar = m.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Unit.f186387a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime(@NotNull ControlledComposition composition) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            m.Companion aVar = m.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Unit.f186387a);
        }
    }

    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        Object objY = q.y(getCurrentState(), new AnonymousClass2(null), continuation);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes) {
        try {
            recordComposerModifications();
            composition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(invalidScopes));
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                ControlledComposition controlledCompositionPerformRecompose = performRecompose(composition, null);
                if (controlledCompositionPerformRecompose != null) {
                    performInitialMovableContentInserts(composition);
                    controlledCompositionPerformRecompose.applyChanges();
                    controlledCompositionPerformRecompose.applyLateChanges();
                }
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime(@NotNull Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime(@NotNull RecomposeScopeImpl scope) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSetMutableScatterSetOf = this.pausedScopes.get();
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSetMutableScatterSetOf);
        }
        mutableScatterSetMutableScatterSetOf.add(scope);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            } else {
                cancellableContinuationDeriveStateLocked = null;
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            m.Companion aVar = m.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Unit.f186387a);
        }
    }

    public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C18962(null), continuation);
        return objRecompositionRunner == fim.a.COROUTINE_SUSPENDED ? objRecompositionRunner : Unit.f186387a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CancellationHandle scheduleFrameEndCallback(@NotNull Function0<Unit> action) {
        return this.nextFrameEndCallbackQueue.scheduleFrameEndCallback(action);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.f186387a;
        }
    }
}
