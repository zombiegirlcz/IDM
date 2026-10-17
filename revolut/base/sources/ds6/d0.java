package ds6;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f117232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f117233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117234c;
    public final int d;
    public final int e;
    public final aim.f f;

    public d0(Map categories, Map currencies, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f117232a = categories;
        this.f117233b = currencies;
        this.f117234c = i;
        this.d = i2;
        this.e = i3;
        aim.f builder = new aim.f();
        for (Map.Entry entry : currencies.entrySet()) {
            builder.put((xi0.b) entry.getKey(), ((c0) entry.getValue()).f117230a);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f = builder.b();
    }

    public static d0 a(d0 d0Var, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            map = d0Var.f117232a;
        }
        Map categories = map;
        if ((i & 2) != 0) {
            map2 = d0Var.f117233b;
        }
        Map currencies = map2;
        int i2 = d0Var.f117234c;
        int i3 = d0Var.d;
        int i5 = d0Var.e;
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new d0(categories, currencies, i2, i3, i5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f117232a, d0Var.f117232a) && Intrinsics.f(this.f117233b, d0Var.f117233b) && this.f117234c == d0Var.f117234c && this.d == d0Var.d && this.e == d0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f117234c, p.a.e(this.f117232a.hashCode() * 31, 31, this.f117233b), 31), 31);
    }
}
