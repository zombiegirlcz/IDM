package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import yhm.w;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\nJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u001b\u0010\u0015\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u0006J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010\u0006J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u000204H\u0002¢\u0006\u0004\b2\u00105R\u0016\u00106\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "(Ljava/lang/Iterable;)Z", "(Ljava/lang/Iterable;)V", "remove", "minusAssign", "removeAll", "", "retainAll", "(Ljava/util/Collection;)Z", "index", "removeElementAt", "clear", "()V", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableSet", "()Ljava/util/Set;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public /* synthetic */ MutableOrderedScatterSet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final int findAbsoluteInsertIndex(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & CertificateBody.profileType;
        int i5 = this._capacity;
        int i6 = i2 & i5;
        int i21 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i22 = i6 >> 3;
            int i32 = (i6 & 7) << 3;
            long j2 = ((jArr[i22 + 1] << (64 - i32)) & ((-i32) >> 63)) | (jArr[i22] >>> i32);
            long j3 = i3;
            int i33 = i3;
            long j5 = j2 ^ (j3 * 72340172838076673L);
            for (long j16 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j16) >> 3)) & i5;
                if (Intrinsics.f(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i43 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i59 = iFindFirstAvailableSlot >> 3;
                long j22 = jArr2[i59];
                int i66 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i43 - (((j22 >> i66) & 255) == 128 ? 1 : 0);
                int i74 = this._capacity;
                long j42 = ((~(255 << i66)) & j22) | (j3 << i66);
                jArr2[i59] = j42;
                jArr2[(((iFindFirstAvailableSlot - 7) & i74) + (i74 & 7)) >> 3] = j42;
                return iFindFirstAvailableSlot;
            }
            i21 += 8;
            i6 = (i6 + i21) & i5;
            i3 = i33;
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i2 >> 3;
            int i6 = (i2 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j3) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j2 = jArr[i];
            int i3 = (int) ((j2 >> 31) & 2147483647L);
            int i5 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & (-4611686018427387904L)) | ((long) (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i3] & BodyPartID.bodyIdMax)))) << 31;
            if (i5 != Integer.MAX_VALUE) {
                i2 = (int) (BodyPartID.bodyIdMax & mapping[i5]);
            }
            jArr[i] = ((long) i2) | j3;
            i++;
        }
        int i6 = this.head;
        if (i6 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i6] & BodyPartID.bodyIdMax);
        }
        int i21 = this.tail;
        if (i21 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i21] & BodyPartID.bodyIdMax);
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            p.t(jArr, -9187201950435737472L);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j2 = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j2)) | j2;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            p.t(emptyNodes, 4611686018427387903L);
        }
        this.nodes = emptyNodes;
    }

    public final boolean add(E element) {
        int size = get_size();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) iFindAbsoluteInsertIndex) & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
        return get_size() != size;
    }

    public final boolean addAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = get_size();
        plusAssign((Iterable) elements);
        return size != get_size();
    }

    public final void adjustStorage$collection() {
        int i = this._capacity;
        if (i > 8) {
            long j2 = this._size;
            w.Companion companion = w.INSTANCE;
            if (Long.compareUnsigned(j2 * 32, ((long) i) * 25) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    @NotNull
    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            p.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j2 = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j2)) | j2;
        }
        p.p(this.elements, 0, this._capacity, null);
        p.t(this.nodes, 4611686018427387903L);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i];
        Intrinsics.checkNotNullParameter(jArr3, "<this>");
        int i2 = 0;
        long j2 = 9223372034707292159L;
        Arrays.fill(jArr3, 0, i, 9223372034707292159L);
        int i3 = (i + 7) >> 3;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i6 = length - 1;
        int i21 = length - 2;
        jArr[i21] = (jArr[i21] & 72057594037927935L) | (-72057594037927936L);
        jArr[i6] = jArr[0];
        int i22 = 0;
        while (i22 != i) {
            int i32 = i22 >> 3;
            int i33 = (i22 & 7) << 3;
            long j5 = (jArr[i32] >> i33) & 255;
            if (j5 != 128 && j5 == 254) {
                Object obj2 = objArr[i22];
                int iHashCode = (obj2 != null ? obj2.hashCode() : i2) * (-862048943);
                int i43 = iHashCode ^ (iHashCode << 16);
                int i59 = i43 >>> 7;
                int i66 = i2;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i59);
                int i74 = i59 & i;
                long j16 = j2;
                if (((iFindFirstAvailableSlot - i74) & i) / 8 == ((i22 - i74) & i) / 8) {
                    jArr[i32] = (((long) (i43 & CertificateBody.profileType)) << i33) | (jArr[i32] & (~(255 << i33)));
                    if (jArr3[i22] == j16) {
                        long j22 = i22;
                        jArr3[i22] = j22 | (j22 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i66];
                } else {
                    int i92 = iFindFirstAvailableSlot >> 3;
                    long j42 = jArr[i92];
                    int i96 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j42 >> i96) & 255) == 128) {
                        jArr[i92] = (j42 & (~(255 << i96))) | (((long) (i43 & CertificateBody.profileType)) << i96);
                        jArr[i32] = (jArr[i32] & (~(255 << i33))) | (128 << i33);
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i22];
                        jArr2[i22] = 4611686018427387903L;
                        int i99 = (int) ((jArr3[i22] >> 32) & BodyPartID.bodyIdMax);
                        if (i99 != Integer.MAX_VALUE) {
                            jArr3[i99] = (jArr3[i99] & (-4294967296L)) | ((long) iFindFirstAvailableSlot);
                            jArr3[i22] = (jArr3[i22] & BodyPartID.bodyIdMax) | (-4294967296L);
                        } else {
                            jArr3[i22] = (((long) Integer.MAX_VALUE) << 32) | ((long) iFindFirstAvailableSlot);
                        }
                        jArr3[iFindFirstAvailableSlot] = ((long) Integer.MAX_VALUE) | (((long) i22) << 32);
                    } else {
                        jArr[i92] = (((long) (i43 & CertificateBody.profileType)) << i96) | (j42 & (~(255 << i96)));
                        Object obj3 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = obj3;
                        long j46 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i22];
                        jArr2[i22] = j46;
                        int i100 = (int) ((jArr3[i22] >> 32) & BodyPartID.bodyIdMax);
                        if (i100 != Integer.MAX_VALUE) {
                            long j47 = iFindFirstAvailableSlot;
                            jArr3[i100] = (jArr3[i100] & (-4294967296L)) | j47;
                            jArr3[i22] = (jArr3[i22] & BodyPartID.bodyIdMax) | (j47 << 32);
                        } else {
                            long j57 = iFindFirstAvailableSlot;
                            jArr3[i22] = j57 | (j57 << 32);
                            i100 = i22;
                        }
                        jArr3[iFindFirstAvailableSlot] = (((long) i100) << 32) | ((long) i22);
                        i22--;
                    }
                    jArr[jArr.length - 1] = jArr[i66];
                }
                i22++;
                i2 = i66;
                j2 = j16;
            } else {
                i22++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L6b:
            if (r10 < 0) goto L70
            r13.removeElementAt(r10)
        L70:
            return
        L71:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E element) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) iFindAbsoluteInsertIndex) & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.f(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L79
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            r2 = r12
        L73:
            if (r2 == 0) goto L78
            r0.removeElementAt(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = get_size();
        minusAssign((Iterable) elements);
        return size != get_size();
    }

    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j2 = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j2;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j2;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j3 = jArr2[index];
        int i5 = (int) ((j3 >> 31) & 2147483647L);
        int i6 = (int) (j3 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.head = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.tail = i5;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj2 = objArr2[i3];
                int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j2 = i5 & CertificateBody.profileType;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j3 = (jArr4[i6] & (~(255 << i21))) | (j2 << i21);
                jArr4[i6] = j3;
                jArr4[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j3;
                objArr3[iFindFirstAvailableSlot] = obj2;
                jArr5[iFindFirstAvailableSlot] = jArr3[i3];
                iArr[i3] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i3++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = zhm.d0.T(r14, r15)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0._size
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(java.util.Collection):boolean");
    }

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void minusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it8 = elements.iterator();
        while (it8.hasNext()) {
            minusAssign(it8.next());
        }
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j2 = jArr[i];
            int i3 = (int) ((j2 >> 31) & 2147483647L);
            int i5 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & (-4611686018427387904L)) | ((long) (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i3]))) << 31;
            if (i5 != Integer.MAX_VALUE) {
                i2 = mapping[i5];
            }
            jArr[i] = j3 | ((long) i2);
            i++;
        }
        int i6 = this.head;
        if (i6 != Integer.MAX_VALUE) {
            this.head = mapping[i6];
        }
        int i21 = this.tail;
        if (i21 != Integer.MAX_VALUE) {
            this.tail = mapping[i21];
        }
    }

    public final void plusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it8 = elements.iterator();
        while (it8.hasNext()) {
            plusAssign(it8.next());
        }
    }
}
