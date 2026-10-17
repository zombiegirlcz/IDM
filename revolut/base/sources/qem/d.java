package qem;

import aem.v;
import ch.qos.logback.core.CoreConstants;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes23.dex */
@mlm.g
public final class d implements Comparable<d> {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f245195j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f245197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245198c;
    public final h d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f245199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f245200h;
    public final long i;

    static {
        k kVar = k.PUBLICATION;
        f245195j = new Lazy[]{null, null, null, j.c(kVar, new v(28)), null, null, j.c(kVar, new v(29)), null, null};
        a.a(0L);
    }

    public /* synthetic */ d(int i, int i2, int i3, int i5, h hVar, int i6, int i21, f fVar, int i22, long j2) {
        if (511 != (i & 511)) {
            j1.f(b.f245194a.getDescriptor(), i, 511);
            throw null;
        }
        this.f245196a = i2;
        this.f245197b = i3;
        this.f245198c = i5;
        this.d = hVar;
        this.e = i6;
        this.f = i21;
        this.f245199g = fVar;
        this.f245200h = i22;
        this.i = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d other = dVar;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.l(this.i, other.i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f245196a == dVar.f245196a && this.f245197b == dVar.f245197b && this.f245198c == dVar.f245198c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.f245199g == dVar.f245199g && this.f245200h == dVar.f245200h && this.i == dVar.i;
    }

    public final int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f245196a) * 31) + Integer.hashCode(this.f245197b)) * 31) + Integer.hashCode(this.f245198c)) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31) + this.f245199g.hashCode()) * 31) + Integer.hashCode(this.f245200h)) * 31) + Long.hashCode(this.i);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f245196a + ", minutes=" + this.f245197b + ", hours=" + this.f245198c + ", dayOfWeek=" + this.d + ", dayOfMonth=" + this.e + ", dayOfYear=" + this.f + ", month=" + this.f245199g + ", year=" + this.f245200h + ", timestamp=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public d(int i, int i2, int i3, h dayOfWeek, int i5, int i6, f month, int i21, long j2) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f245196a = i;
        this.f245197b = i2;
        this.f245198c = i3;
        this.d = dayOfWeek;
        this.e = i5;
        this.f = i6;
        this.f245199g = month;
        this.f245200h = i21;
        this.i = j2;
    }
}
