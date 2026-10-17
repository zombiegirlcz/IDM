package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import g1k.k;
import g2.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010&\u001a-\u0010'\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010+\u001a/\u0010-\u001a\u00020\u00132\n\u0010\r\u001a\u00060\u0000j\u0002`\u00012\n\u0010,\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.\u001a+\u0010-\u001a\u00020\u00132\u0006\u00100\u001a\u00020/2\n\u0010)\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u00101\u001a7\u00104\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u00002\n\u00103\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b4\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010/2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010>\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010&\u001a\u0017\u0010A\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bA\u0010B\u001a-\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0001¢\u0006\u0004\bC\u0010D\u001a5\u0010F\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\f2\u0006\u0010E\u001a\u00028\u0000H\u0000¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0004\bH\u0010D\u001a-\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010D\u001a%\u0010J\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\bJ\u00108\u001a\u001f\u0010K\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\bK\u0010L\u001a9\u0010R\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010Q2\n\u0010M\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u0003H\u0002¢\u0006\u0004\bR\u0010S\u001a\u000f\u0010T\u001a\u000209H\u0002¢\u0006\u0004\bT\u0010;\u001a)\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\fH\u0001¢\u0006\u0004\bU\u0010V\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bU\u0010W\u001a+\u0010Z\u001a\u00020\u0003*\u00020\u00032\n\u0010X\u001a\u00060\u0000j\u0002`\u00012\n\u0010Y\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\bZ\u0010[\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\"\u0018\u0010^\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\"$\u0010d\u001a\u00060\u0011j\u0002`c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bd\u0010e\u0012\u0004\bh\u0010&\u001a\u0004\bf\u0010g\"\u0016\u0010i\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j\"\u001a\u0010k\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010_\"\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u0002060o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q\"4\u0010u\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0s0r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v\"(\u0010w\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010v\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010x\" \u0010y\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\by\u0010z\u0012\u0004\b|\u0010&\u001a\u0004\b{\u0010\u000e\"\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", "trackPinning", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", "mergedReadObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "mergedWriteObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalSnapshot", "block", "resetGlobalSnapshotLocked", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "()V", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "candidateSnapshot", "valid", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "()Ljava/lang/Void;", "usedLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "overwriteUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Z", "checkAndOverwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "writableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "(JLandroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "from", "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "emptyLambda", "Lkotlin/jvm/functions/Function1;", "INVALID_SNAPSHOT", "J", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "Landroidx/compose/runtime/internal/AtomicInt;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;

    @NotNull
    private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers;

    @NotNull
    private static final SnapshotWeakSet<StateObject> extraStateObjects;

    @NotNull
    private static final GlobalSnapshot globalSnapshot;

    @NotNull
    private static List<? extends Function1<Object, Unit>> globalWriteObservers;
    private static long nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static AtomicInt pendingApplyObserverCount;

    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new k(3);

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        long j2 = 1;
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + j2;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        f0 f0Var = f0.f322471a;
        applyObservers = f0Var;
        globalWriteObservers = f0Var;
        long j3 = nextSnapshotId;
        nextSnapshotId = j2 + j3;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j3, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (Intrinsics.l(j2, j3) < 0) {
            snapshotIdSet = snapshotIdSet.set(j2);
            j2 += (long) 1;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T advanceGlobalSnapshot(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotIdSet, ? extends T> r15) {
        /*
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.globalSnapshot
            java.lang.Object r1 = getLock()
            monitor-enter(r1)
            androidx.collection.MutableScatterSet r2 = r0.getModified$runtime()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto La1
        L17:
            java.lang.Object r15 = resetGlobalSnapshotLocked(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L4a
            r3 = -1
            java.util.List<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>> r4 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch: java.lang.Throwable -> L3c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L3c
            r6 = r1
        L2a:
            if (r6 >= r5) goto L3e
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L3c
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L3c
            java.util.Set r8 = androidx.compose.runtime.collection.ScatterSetWrapperKt.wrapIntoSet(r2)     // Catch: java.lang.Throwable -> L3c
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 + 1
            goto L2a
        L3c:
            r15 = move-exception
            goto L44
        L3e:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            goto L4a
        L44:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            throw r15
        L4a:
            java.lang.Object r0 = getLock()
            monitor-enter(r0)
            checkAndOverwriteUnusedRecordsLocked()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L9d
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L8e
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L8e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 + (-2)
            if (r4 < 0) goto L9b
            r5 = r1
        L5e:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8e
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8e
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L96
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L78:
            if (r10 >= r8) goto L94
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L90
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8e
            androidx.compose.runtime.snapshots.StateObject r11 = (androidx.compose.runtime.snapshots.StateObject) r11     // Catch: java.lang.Throwable -> L8e
            processForUnusedRecordsLocked(r11)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r15 = move-exception
            goto L9f
        L90:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L78
        L94:
            if (r8 != r9) goto L9b
        L96:
            if (r5 == r4) goto L9b
            int r5 = r5 + 1
            goto L5e
        L9b:
            kotlin.Unit r1 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L8e
        L9d:
            monitor-exit(r0)
            return r15
        L9f:
            monitor-exit(r0)
            throw r15
        La1:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime = snapshotWeakSet.getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size$runtime) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime()[i];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i2 != i) {
                    snapshotWeakSet.getValues$runtime()[i2] = weakReference;
                    snapshotWeakSet.getHashes()[i2] = snapshotWeakSet.getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime; i3++) {
            snapshotWeakSet.getValues$runtime()[i3] = null;
            snapshotWeakSet.getHashes()[i3] = 0;
        }
        if (i2 != size$runtime) {
            snapshotWeakSet.setSize$runtime(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z) {
        boolean z3 = snapshot instanceof MutableSnapshot;
        if (z3 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z3 ? (MutableSnapshot) snapshot : null, function1, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z);
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t2, @NotNull Snapshot snapshot) {
        T t3;
        T t5 = (T) readable(t2, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (t5 != null) {
            return t5;
        }
        synchronized (getLock()) {
            t3 = (T) readable(t2, snapshot.getSnapshotId(), snapshot.getInvalid());
        }
        if (t3 != null) {
            return t3;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emptyLambda$lambda$0(SnapshotIdSet snapshotIdSet) {
        return Unit.f186387a;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    public static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new b(function1, function12, 0);
    }

    public static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(function1, function12, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergedReadObserver$lambda$0(Function1 function1, Function1 function12, Object obj2) {
        function1.invoke(obj2);
        function12.invoke(obj2);
        return Unit.f186387a;
    }

    public static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new b(function1, function12, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergedWriteObserver$lambda$0(Function1 function1, Function1 function12, Object obj2) {
        function1.invoke(obj2);
        function12.invoke(obj2);
        return Unit.f186387a;
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t2, @NotNull StateObject stateObject) {
        T t3 = (T) usedLocked(stateObject);
        if (t3 != null) {
            t3.setSnapshotId$runtime(Long.MAX_VALUE);
            return t3;
        }
        T t5 = (T) t2.create(Long.MAX_VALUE);
        t5.setNext$runtime(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t5);
        return t5;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t2, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t3;
        synchronized (getLock()) {
            t3 = (T) newWritableRecordLocked(t2, stateObject, snapshot);
        }
        return t3;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t2, StateObject stateObject, Snapshot snapshot) {
        T t3 = (T) newOverwritableRecordLocked(t2, stateObject);
        t3.assign(t2);
        t3.setSnapshotId$runtime(snapshot.getSnapshotId());
        return t3;
    }

    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1);
        Function1<Object, Unit> writeObserver$runtime = snapshot.getWriteObserver$runtime();
        if (writeObserver$runtime != null) {
            writeObserver$runtime.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j2, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        int i;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        int i2;
        int i3;
        MutableScatterSet<StateObject> modified$runtime = mutableSnapshot.getModified$runtime();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime == null) {
            return null;
        }
        long snapshotId = mutableSnapshot.getSnapshotId();
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot.getInvalid().set(snapshotId).or(mutableSnapshot.getPreviousIds$runtime());
        Object[] objArr3 = modified$runtime.elements;
        long[] jArr3 = modified$runtime.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i5 = 0;
        while (true) {
            long j3 = jArr3[i5];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i21 = 8 - ((~(i5 - length)) >>> 31);
                int i22 = 0;
                while (i22 < i21) {
                    if ((255 & j3) < 128) {
                        StateObject stateObject = (StateObject) objArr3[(i5 << 3) + i22];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        jArr2 = jArr3;
                        i2 = i5;
                        i3 = i6;
                        StateRecord stateRecord = readable(firstStateRecord, j2, snapshotIdSet);
                        if (stateRecord == null) {
                            objArr2 = objArr3;
                        } else {
                            objArr2 = objArr3;
                            StateRecord stateRecord2 = readable(firstStateRecord, snapshotId, snapshotIdSetOr);
                            if (stateRecord2 != null && !stateRecord.equals(stateRecord2)) {
                                snapshotIdSet3 = snapshotIdSetOr;
                                StateRecord stateRecord3 = readable(firstStateRecord, snapshotId, mutableSnapshot.getInvalid());
                                if (stateRecord3 == null) {
                                    readError();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                if (stateRecordMergeRecords == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(stateRecord, stateRecordMergeRecords);
                                map4 = map4;
                            }
                        }
                        snapshotIdSet3 = snapshotIdSetOr;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = snapshotIdSetOr;
                        objArr2 = objArr3;
                        i2 = i5;
                        i3 = i6;
                    }
                    j3 >>= i3;
                    i22++;
                    map3 = map2;
                    i5 = i2;
                    i6 = i3;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    snapshotIdSetOr = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetOr;
                objArr = objArr3;
                i = i5;
                if (i21 != i6) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetOr;
                objArr = objArr3;
                i = i5;
            }
            int i32 = i;
            if (i32 == length) {
                return map4;
            }
            i5 = i32 + 1;
            map3 = map;
            jArr3 = jArr;
            objArr3 = objArr;
            snapshotIdSetOr = snapshotIdSet2;
        }
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t2, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t3) {
        T t5;
        if (snapshot.getReadOnly()) {
            snapshot.mo1713recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t3.getSnapshotId() == snapshotId) {
            return t3;
        }
        synchronized (getLock()) {
            t5 = (T) newOverwritableRecordLocked(t2, stateObject);
        }
        t5.setSnapshotId$runtime(snapshotId);
        if (t3.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo1713recordModified$runtime(stateObject);
        }
        return t5;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext()) {
            long snapshotId$runtime = firstStateRecord2.getSnapshotId();
            if (snapshotId$runtime != INVALID_SNAPSHOT) {
                if (Intrinsics.l(snapshotId$runtime, jLowestOrDefault) >= 0) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (Intrinsics.l(firstStateRecord2.getSnapshotId(), stateRecord2.getSnapshotId()) < 0) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (Intrinsics.l(firstStateRecord.getSnapshotId(), jLowestOrDefault) >= 0) {
                                break;
                            }
                            if (Intrinsics.l(stateRecord3.getSnapshotId(), firstStateRecord.getSnapshotId()) < 0) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime(INVALID_SNAPSHOT);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t2, long j2, SnapshotIdSet snapshotIdSet) {
        T t3 = null;
        while (t2 != null) {
            if (valid(t2, j2, snapshotIdSet) && (t3 == null || Intrinsics.l(t3.getSnapshotId(), t2.getSnapshotId()) < 0)) {
                t3 = t2;
            }
            t2 = (T) t2.getNext();
        }
        if (t3 != null) {
            return t3;
        }
        return null;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1<? super SnapshotIdSet, ? extends T> function1) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T t2 = (T) function1.invoke(openSnapshots.clear(snapshotId));
        long j2 = nextSnapshotId;
        nextSnapshotId = ((long) 1) + j2;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime(j2);
        globalSnapshot2.setInvalid$runtime(openSnapshots);
        globalSnapshot2.setWriteCount$runtime(0);
        globalSnapshot2.setModified$runtime(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime();
        openSnapshots = openSnapshots.set(j2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new a31.k(15, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot takeNewSnapshot$lambda$0(Function1 function1, SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
        synchronized (getLock()) {
            openSnapshots = openSnapshots.set(snapshot.getSnapshotId());
            Unit unit = Unit.f186387a;
        }
        return snapshot;
    }

    public static final int trackPinning(long j2, @NotNull SnapshotIdSet snapshotIdSet) {
        int iAdd;
        long jLowest = snapshotIdSet.lowest(j2);
        synchronized (getLock()) {
            iAdd = pinningTable.add(jLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - ((long) 1);
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, jLowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (Intrinsics.l(firstStateRecord.getSnapshotId(), stateRecord.getSnapshotId()) >= 0) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j2, long j3, SnapshotIdSet snapshotIdSet) {
        return (j3 == INVALID_SNAPSHOT || Intrinsics.l(j3, j2) > 0 || snapshotIdSet.get(j3)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long jLowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb6.append(snapshot.getSnapshotId());
        sb6.append(", disposed=");
        sb6.append(snapshot.getDisposed());
        sb6.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb6.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime()) : "read-only");
        sb6.append(", lowestPin=");
        synchronized (getLock()) {
            jLowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb6.append(jLowestOrDefault);
        throw new IllegalStateException(sb6.toString().toString());
    }

    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t2, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo1713recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t5 = (T) readable(t2, snapshotId, snapshot.getInvalid());
        if (t5 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t5.getSnapshotId() == snapshot.getSnapshotId()) {
            return t5;
        }
        synchronized (getLock()) {
            t3 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid());
            if (t3 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t3.getSnapshotId() != snapshotId) {
                t3 = (T) newWritableRecordLocked(t3, stateObject, snapshot);
            }
        }
        Intrinsics.i(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t5.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo1713recordModified$runtime(stateObject);
        }
        return t3;
    }

    private static final boolean valid(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        return valid(j2, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t2, @NotNull StateObject stateObject) {
        T t3;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t5 = (T) readable(t2, current.getSnapshotId(), current.getInvalid());
        if (t5 != null) {
            return t5;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.i(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t3 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid());
            if (t3 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t2) {
        T t3;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t5 = (T) readable(t2, current.getSnapshotId(), current.getInvalid());
        if (t5 != null) {
            return t5;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t3 = (T) readable(t2, current2.getSnapshotId(), current2.getInvalid());
        }
        if (t3 != null) {
            return t3;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
