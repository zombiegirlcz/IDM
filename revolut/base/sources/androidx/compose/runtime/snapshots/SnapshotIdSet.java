package androidx.compose.runtime.snapshots;

import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nkm.o;
import nkm.p;
import org.jetbrains.annotations.NotNull;
import pim.a;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 #2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001#B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "id", "", "get", "(J)Z", "set", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "ids", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "bits", "or", "", "iterator", "()Ljava/util/Iterator;", "default", "lowest", "(J)J", "", "toString", "()Ljava/lang/String;", "J", "[J", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Long>, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    @d(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {Constants.TAG_FC_SPEED_MODE, 256, 263}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnkm/o;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "", "<anonymous>", "(Lnkm/o;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends h implements Function2<o, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (r15.b(r9, r18) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.b(r9, r18) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f3 -> B:42:0x00f4). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o oVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(oVar, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    private SnapshotIdSet(long j2, long j3, long j5, long[] jArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = j5;
        this.belowBound = jArr;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (ids == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j2 = ids.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j3, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j5 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j5);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (ids.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((ids.lowerSet & (1 << i)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + ((long) i));
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((ids.upperSet & (1 << i2)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + ((long) i2) + ((long) 64));
                }
            }
        }
        return snapshotIdSetClear;
    }

    @NotNull
    public final SnapshotIdSet clear(long id10) {
        long[] jArr;
        int iBinarySearch;
        long j2 = id10 - this.lowerBound;
        long j3 = 0;
        if (Intrinsics.l(j2, j3) >= 0 && Intrinsics.l(j2, 64) < 0) {
            long j5 = 1 << ((int) j2);
            long j16 = this.lowerSet;
            if ((j16 & j5) != 0) {
                return new SnapshotIdSet(this.upperSet, j16 & (~j5), this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.l(j2, 64) >= 0 && Intrinsics.l(j2, 128) < 0) {
            long j22 = 1 << (((int) j2) - 64);
            long j42 = this.upperSet;
            if ((j42 & j22) != 0) {
                return new SnapshotIdSet(j42 & (~j22), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.l(j2, j3) < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id10)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final boolean get(long id10) {
        long[] jArr;
        long j2 = id10 - this.lowerBound;
        long j3 = 0;
        return (Intrinsics.l(j2, j3) < 0 || Intrinsics.l(j2, (long) 64) >= 0) ? (Intrinsics.l(j2, (long) 64) < 0 || Intrinsics.l(j2, (long) 128) >= 0) ? Intrinsics.l(j2, j3) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id10) >= 0 : ((1 << (((int) j2) - 64)) & this.upperSet) != 0 : ((1 << ((int) j2)) & this.lowerSet) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gim.h, kotlin.jvm.functions.Function2] */
    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Long> iterator() {
        return p.a((h) p.b(new AnonymousClass1(null)).f195577b);
    }

    public final long lowest(long j2) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        long j3 = this.lowerSet;
        if (j3 != 0) {
            return this.lowerBound + ((long) Long.numberOfTrailingZeros(j3));
        }
        long j5 = this.upperSet;
        return j5 != 0 ? this.lowerBound + ((long) 64) + ((long) Long.numberOfTrailingZeros(j5)) : j2;
    }

    @NotNull
    public final SnapshotIdSet or(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j2 = bits.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j3, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j5 : jArr3) {
                    bits = bits.set(j5);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        bits = bits.set(this.lowerBound + ((long) i2));
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        bits = bits.set(this.lowerBound + ((long) i) + ((long) 64));
                    }
                    i++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j16 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j16);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((bits.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + ((long) i3));
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i < 64) {
                if ((bits.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + ((long) i) + ((long) 64));
                }
                i++;
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet set(long id10) {
        long j2;
        long j3;
        long[] array;
        long j5 = id10 - this.lowerBound;
        long j16 = 0;
        if (Intrinsics.l(j5, j16) < 0 || Intrinsics.l(j5, 64) >= 0) {
            long j22 = 64;
            if (Intrinsics.l(j5, j22) < 0 || Intrinsics.l(j5, 128) >= 0) {
                long j42 = 128;
                if (Intrinsics.l(j5, j42) < 0) {
                    long[] jArr = this.belowBound;
                    if (jArr == null) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id10});
                    }
                    int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id10);
                    if (iBinarySearch < 0) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), id10));
                    }
                } else if (!get(id10)) {
                    long j46 = this.upperSet;
                    long j47 = this.lowerSet;
                    long j57 = this.lowerBound;
                    long j58 = 1;
                    long j65 = ((id10 + j58) / j22) * j22;
                    if (Intrinsics.l(j65, j16) < 0) {
                        j65 = (Long.MAX_VALUE - j42) + j58;
                    }
                    SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                    long j69 = j46;
                    while (true) {
                        if (Intrinsics.l(j57, j65) >= 0) {
                            j2 = j47;
                            j3 = j57;
                            break;
                        }
                        if (j47 != 0) {
                            if (snapshotIdArrayBuilder == null) {
                                snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                            }
                            int i = 0;
                            while (i < 64) {
                                long j76 = j47;
                                if ((j47 & (1 << i)) != 0) {
                                    snapshotIdArrayBuilder.add(((long) i) + j57);
                                }
                                i++;
                                j47 = j76;
                            }
                        }
                        if (j69 == 0) {
                            j3 = j65;
                            j2 = 0;
                            break;
                        }
                        j57 += j22;
                        j47 = j69;
                        j69 = 0;
                    }
                    if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                        array = this.belowBound;
                    }
                    return new SnapshotIdSet(j69, j2, j3, array).set(id10);
                }
            } else {
                long j85 = 1 << (((int) j5) - 64);
                long j100 = this.upperSet;
                if ((j100 & j85) == 0) {
                    return new SnapshotIdSet(j100 | j85, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j101 = 1 << ((int) j5);
            long j102 = this.lowerSet;
            if ((j102 & j101) == 0) {
                return new SnapshotIdSet(this.upperSet, j102 | j101, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.toString());
        sb6.append(" [");
        ArrayList arrayList = new ArrayList(w.t(this, 10));
        Iterator<Long> it8 = iterator();
        while (it8.hasNext()) {
            arrayList.add(String.valueOf(it8.next().longValue()));
        }
        return j6.a.u(sb6, ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }
}
