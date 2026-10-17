package jrd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f177990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f177992c;
    public final List d;
    public final List e;

    public b(a mode, int i, int i2, List supportedYears, List supportedMonths) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(supportedYears, "supportedYears");
        Intrinsics.checkNotNullParameter(supportedMonths, "supportedMonths");
        this.f177990a = mode;
        this.f177991b = i;
        this.f177992c = i2;
        this.d = supportedYears;
        this.e = supportedMonths;
    }

    public static b a(b bVar, int i, int i2, List list, int i3) {
        a mode = bVar.f177990a;
        if ((i3 & 2) != 0) {
            i = bVar.f177991b;
        }
        int i5 = i;
        List supportedYears = bVar.d;
        if ((i3 & 16) != 0) {
            list = bVar.e;
        }
        List supportedMonths = list;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(supportedYears, "supportedYears");
        Intrinsics.checkNotNullParameter(supportedMonths, "supportedMonths");
        return new b(mode, i5, i2, supportedYears, supportedMonths);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f177990a == bVar.f177990a && this.f177991b == bVar.f177991b && this.f177992c == bVar.f177992c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(j6.a.b(this.f177992c, j6.a.b(this.f177991b, this.f177990a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
