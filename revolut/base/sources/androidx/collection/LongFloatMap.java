package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001c\u0010!\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b!\u0010\u001f\u0012\u0004\b\"\u0010\u0003R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\t\u0082\u0001\u0001'¨\u0006("}, d2 = {"Landroidx/collection/LongFloatMap;", "", "<init>", "()V", "", "isEmpty", "()Z", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "key", "findKeyIndex", "(J)I", "", "metadata", "[J", "getMetadata$annotations", "keys", "getKeys$annotations", "", "values", "[F", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongFloatMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LongFloatMap {
    public int _capacity;
    public int _size;

    @NotNull
    public long[] keys;

    @NotNull
    public long[] metadata;

    @NotNull
    public float[] values;

    public /* synthetic */ LongFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.LongFloatMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.LongFloatMap r1 = (androidx.collection.LongFloatMap) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            long[] r3 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L81
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L76
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            int r2 = r1.findKeyIndex(r2)
            if (r2 < 0) goto L65
            float[] r3 = r1.values
            r2 = r3[r2]
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L65
            goto L69
        L65:
            return r4
        L66:
            r15 = r2
            r16 = r3
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L41
        L70:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L82
            goto L79
        L76:
            r15 = r2
            r16 = r3
        L79:
            if (r8 == r7) goto L82
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L27
        L81:
            r15 = r2
        L82:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & CertificateBody.profileType;
        int i3 = this._capacity;
        int i5 = (i >>> 7) & i3;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i21 = i5 >> 3;
            int i22 = (i5 & 7) << 3;
            long j2 = ((jArr[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr[i21] >>> i22);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i3;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i3;
        }
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr2[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i << 3) + i3;
                        long j3 = jArr[i5];
                        iHashCode += Float.hashCode(fArr[i5]) ^ Long.hashCode(j3);
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb6 = new StringBuilder("{");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i5 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i6) {
                        if ((255 & j2) < 128) {
                            int i22 = (i3 << 3) + i21;
                            i2 = i3;
                            long j3 = jArr[i22];
                            float f = fArr[i22];
                            sb6.append(j3);
                            sb6.append("=");
                            sb6.append(f);
                            i5++;
                            if (i5 < this._size) {
                                sb6.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j2 >>= 8;
                        i21++;
                        i3 = i2;
                    }
                    int i32 = i3;
                    if (i6 != 8) {
                        break;
                    }
                    i = i32;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private LongFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }
}
