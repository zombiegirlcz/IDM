package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import pkm.g;
import pkm.i;
import pkm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Comparable, Serializable {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f187925c = new d(-31557014167219200L, 0);
    public static final d d = new d(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187927b;

    public d(long j2, int i) {
        this.f187926a = j2;
        this.f187927b = i;
        if (-31557014167219200L > j2 || j2 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        d other = (d) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        int iL = Intrinsics.l(this.f187926a, other.f187926a);
        return iL != 0 ? iL : Intrinsics.k(this.f187927b, other.f187927b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f187926a == dVar.f187926a && this.f187927b == dVar.f187927b;
    }

    public final int hashCode() {
        return (this.f187927b * 51) + Long.hashCode(this.f187926a);
    }

    public final String toString() {
        long j2;
        int[] iArr;
        StringBuilder sb6 = new StringBuilder();
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "instant");
        long j3 = this.f187926a;
        long j5 = j3 / 86400;
        long j16 = 0;
        if ((j3 ^ 86400) < 0 && j5 * 86400 != j3) {
            j5--;
        }
        long j22 = j3 % 86400;
        int i = (int) (j22 + (86400 & (((j22 ^ 86400) & ((-j22) | j22)) >> 63)));
        long j42 = (j5 + ((long) 719528)) - ((long) 60);
        if (j42 < 0) {
            long j46 = 146097;
            long j47 = ((j42 + 1) / j46) - 1;
            j2 = 0;
            j16 = ((long) 400) * j47;
            j42 += (-j47) * j46;
        } else {
            j2 = 0;
        }
        long j57 = 400;
        long j58 = ((j57 * j42) + ((long) 591)) / ((long) 146097);
        long j65 = 365;
        long j69 = 4;
        long j76 = 100;
        long j85 = j42 - ((j58 / j57) + (((j58 / j69) + (j65 * j58)) - (j58 / j76)));
        if (j85 < j2) {
            j58--;
            j85 = j42 - ((j58 / j57) + (((j58 / j69) + (j65 * j58)) - (j58 / j76)));
        }
        int i2 = (int) j85;
        int i3 = ((i2 * 5) + 2) / 153;
        int i5 = ((i3 + 2) % 12) + 1;
        int i6 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i21 = (int) (j58 + j16 + ((long) (i3 / 10)));
        int i22 = i / DateTimeConstants.SECONDS_PER_HOUR;
        int i32 = i - (i22 * DateTimeConstants.SECONDS_PER_HOUR);
        int i33 = i32 / 60;
        int i43 = i32 - (i33 * 60);
        int i59 = 0;
        if (Math.abs(i21) < 1000) {
            StringBuilder sb9 = new StringBuilder();
            if (i21 >= 0) {
                sb9.append(i21 + 10000);
                Intrinsics.checkNotNullExpressionValue(sb9.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb9.append(i21 - 10000);
                Intrinsics.checkNotNullExpressionValue(sb9.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb6.append((CharSequence) sb9);
        } else {
            if (i21 >= 10000) {
                sb6.append('+');
            }
            sb6.append(i21);
        }
        sb6.append(CoreConstants.DASH_CHAR);
        i.a(sb6, sb6, i5);
        sb6.append(CoreConstants.DASH_CHAR);
        i.a(sb6, sb6, i6);
        sb6.append('T');
        i.a(sb6, sb6, i22);
        sb6.append(CoreConstants.COLON_CHAR);
        i.a(sb6, sb6, i33);
        sb6.append(CoreConstants.COLON_CHAR);
        i.a(sb6, sb6, i43);
        int i66 = this.f187927b;
        if (i66 != 0) {
            sb6.append(CoreConstants.DOT);
            while (true) {
                int i74 = i59 + 1;
                iArr = i.f237217a;
                if (i66 % iArr[i74] != 0) {
                    break;
                }
                i59 = i74;
            }
            int i92 = i59 - (i59 % 3);
            String strValueOf = String.valueOf((i66 / iArr[i92]) + iArr[9 - i92]);
            Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb6.append(strSubstring);
        }
        sb6.append('Z');
        return sb6.toString();
    }
}
