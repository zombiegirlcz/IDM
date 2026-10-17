package q22;

import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmNewContactNavigation$Tab f241483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f241484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241485c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f241486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f241487h;
    public final boolean i;

    public a(ApmNewContactNavigation$Tab tab2, wi0.b country, String prefix, String phone, String email, String tax, String name, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(tax, "tax");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f241483a = tab2;
        this.f241484b = country;
        this.f241485c = prefix;
        this.d = phone;
        this.e = email;
        this.f = tax;
        this.f241486g = name;
        this.f241487h = z;
        this.i = z3;
    }

    public static a a(a aVar, ApmNewContactNavigation$Tab apmNewContactNavigation$Tab, wi0.b bVar, String str, String str2, String str3, String str4, String str5, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            apmNewContactNavigation$Tab = aVar.f241483a;
        }
        ApmNewContactNavigation$Tab tab2 = apmNewContactNavigation$Tab;
        if ((i & 2) != 0) {
            bVar = aVar.f241484b;
        }
        wi0.b country = bVar;
        if ((i & 4) != 0) {
            str = aVar.f241485c;
        }
        String prefix = str;
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        String phone = str2;
        if ((i & 16) != 0) {
            str3 = aVar.e;
        }
        String email = str3;
        String tax = (i & 32) != 0 ? aVar.f : str4;
        String name = (i & 64) != 0 ? aVar.f241486g : str5;
        boolean z4 = (i & 128) != 0 ? aVar.f241487h : z;
        boolean z6 = (i & 256) != 0 ? aVar.i : z3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(tax, "tax");
        Intrinsics.checkNotNullParameter(name, "name");
        return new a(tab2, country, prefix, phone, email, tax, name, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f241483a, aVar.f241483a) && Intrinsics.f(this.f241484b, aVar.f241484b) && Intrinsics.f(this.f241485c, aVar.f241485c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f241486g, aVar.f241486g) && this.f241487h == aVar.f241487h && this.i == aVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f241483a.hashCode() * 31, 31, this.f241484b.f297794a), 31, this.f241485c), 31, this.d), 31, this.e), 31, this.f), 31, this.f241486g), 31, this.f241487h);
    }
}
