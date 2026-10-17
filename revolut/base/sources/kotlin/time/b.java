package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/time/b;", "", "Companion", "a", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f187922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f187923c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187924a;

    /* JADX INFO: renamed from: kotlin.time.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/b$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = pkm.d.f237215a;
        f187922b = c.b(4611686018427387903L);
        f187923c = c.b(-4611686018427387903L);
    }

    public static final long a(long j2, long j3) {
        long j5 = 1000000;
        long j16 = j3 / j5;
        long j22 = j2 + j16;
        if (-4611686018426L > j22 || j22 >= 4611686018427L) {
            return c.b(kotlin.ranges.f.i(j22, -4611686018427387903L, 4611686018427387903L));
        }
        return c.d((j22 * j5) + (j3 - (j16 * j5)));
    }

    public static final void b(StringBuilder sb6, int i, int i2, int i3, String str, boolean z) {
        sb6.append(i);
        if (i2 != 0) {
            sb6.append(CoreConstants.DOT);
            String strB0 = d0.b0(String.valueOf(i2), i3, '0');
            int i5 = -1;
            int length = strB0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strB0.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i21 = i5 + 1;
            if (z || i21 >= 3) {
                sb6.append((CharSequence) strB0, 0, ((i5 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
            } else {
                sb6.append((CharSequence) strB0, 0, i21);
                Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
            }
        }
        sb6.append(str);
    }

    public static int c(long j2, long j3) {
        long j5 = j2 ^ j3;
        if (j5 < 0 || (((int) j5) & 1) == 0) {
            return Intrinsics.l(j2, j3);
        }
        int i = (((int) j2) & 1) - (((int) j3) & 1);
        return j2 < 0 ? -i : i;
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public static final int e(long j2) {
        if (k(j2)) {
            return 0;
        }
        return (int) (n(j2, pkm.e.HOURS) % ((long) 24));
    }

    public static final long f(long j2) {
        return ((((int) j2) & 1) != 1 || k(j2)) ? n(j2, pkm.e.MILLISECONDS) : j2 >> 1;
    }

    public static final long g(long j2) {
        long j3 = j2 >> 1;
        if ((((int) j2) & 1) == 0) {
            return j3;
        }
        if (j3 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j3 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j3 * ((long) 1000000);
    }

    public static final int h(long j2) {
        if (k(j2)) {
            return 0;
        }
        return (int) (n(j2, pkm.e.MINUTES) % ((long) 60));
    }

    public static final int i(long j2) {
        if (k(j2)) {
            return 0;
        }
        return (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % ((long) 1000)) * ((long) 1000000) : (j2 >> 1) % ((long) 1000000000));
    }

    public static final int j(long j2) {
        if (k(j2)) {
            return 0;
        }
        return (int) (n(j2, pkm.e.SECONDS) % ((long) 60));
    }

    public static final boolean k(long j2) {
        return j2 == f187922b || j2 == f187923c;
    }

    public static final long l(long j2, long j3) {
        if (k(j2)) {
            if (!k(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (k(j3)) {
            return j3;
        }
        int i = ((int) j2) & 1;
        if (i != (((int) j3) & 1)) {
            return i == 1 ? a(j2 >> 1, j3 >> 1) : a(j3 >> 1, j2 >> 1);
        }
        long j5 = (j2 >> 1) + (j3 >> 1);
        return i == 0 ? (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) ? c.b(j5 / ((long) 1000000)) : c.d(j5) : c.c(j5);
    }

    public static final double m(long j2, pkm.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == f187922b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == f187923c) {
            return Double.NEGATIVE_INFINITY;
        }
        return pkm.f.a(j2 >> 1, (((int) j2) & 1) == 0 ? pkm.e.NANOSECONDS : pkm.e.MILLISECONDS, unit);
    }

    public static final long n(long j2, pkm.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == f187922b) {
            return Long.MAX_VALUE;
        }
        if (j2 == f187923c) {
            return Long.MIN_VALUE;
        }
        return pkm.f.b(j2 >> 1, (((int) j2) & 1) == 0 ? pkm.e.NANOSECONDS : pkm.e.MILLISECONDS, unit);
    }

    public static String o(long j2) {
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f187922b) {
            return "Infinity";
        }
        if (j2 == f187923c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j2 < 0;
        StringBuilder sb6 = new StringBuilder();
        if (z) {
            sb6.append(CoreConstants.DASH_CHAR);
        }
        if (j2 < 0) {
            j2 = p(j2);
        }
        long jN = n(j2, pkm.e.DAYS);
        int iE = e(j2);
        int iH = h(j2);
        int iJ = j(j2);
        int i2 = i(j2);
        boolean z3 = jN != 0;
        boolean z4 = iE != 0;
        boolean z6 = iH != 0;
        boolean z11 = (iJ == 0 && i2 == 0) ? false : true;
        if (z3) {
            sb6.append(jN);
            sb6.append('d');
            i = 1;
        }
        if (z4 || (z3 && (z6 || z11))) {
            int i3 = i + 1;
            if (i > 0) {
                sb6.append(p.SPACE_CHAR);
            }
            sb6.append(iE);
            sb6.append('h');
            i = i3;
        }
        if (z6 || (z11 && (z4 || z3))) {
            int i5 = i + 1;
            if (i > 0) {
                sb6.append(p.SPACE_CHAR);
            }
            sb6.append(iH);
            sb6.append('m');
            i = i5;
        }
        if (z11) {
            int i6 = i + 1;
            if (i > 0) {
                sb6.append(p.SPACE_CHAR);
            }
            if (iJ != 0 || z3 || z4 || z6) {
                b(sb6, iJ, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                b(sb6, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else if (i2 >= 1000) {
                b(sb6, i2 / 1000, i2 % 1000, 3, "us", false);
            } else {
                sb6.append(i2);
                sb6.append("ns");
            }
            i = i6;
        }
        if (z && i > 1) {
            sb6.insert(1, CoreConstants.LEFT_PARENTHESIS_CHAR).append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb6.toString();
    }

    public static final long p(long j2) {
        long j3 = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
        int i = pkm.d.f237215a;
        return j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return c(this.f187924a, bVar.f187924a);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return this.f187924a == ((b) obj2).f187924a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f187924a);
    }

    public final String toString() {
        return o(this.f187924a);
    }
}
