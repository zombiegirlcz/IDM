package lm3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f196864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vm3.b f196865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vm3.c f196866c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f196867g;

    public a(Set allowedTabs, vm3.b tab2, vm3.c cVar, String phone, String email, String name, boolean z) {
        Intrinsics.checkNotNullParameter(allowedTabs, "allowedTabs");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f196864a = allowedTabs;
        this.f196865b = tab2;
        this.f196866c = cVar;
        this.d = phone;
        this.e = email;
        this.f = name;
        this.f196867g = z;
    }

    public static a a(a aVar, vm3.b bVar, vm3.c cVar, String phone, String email, String name, boolean z, int i) {
        vm3.b tab2 = bVar;
        Set allowedTabs = aVar.f196864a;
        if ((i & 2) != 0) {
            tab2 = aVar.f196865b;
        }
        if ((i & 4) != 0) {
            cVar = aVar.f196866c;
        }
        if ((i & 8) != 0) {
            phone = aVar.d;
        }
        if ((i & 16) != 0) {
            email = aVar.e;
        }
        if ((i & 32) != 0) {
            name = aVar.f;
        }
        if ((i & 64) != 0) {
            z = aVar.f196867g;
        }
        boolean z3 = z;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(allowedTabs, "allowedTabs");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = name;
        String str2 = email;
        String str3 = phone;
        return new a(allowedTabs, tab2, cVar, str3, str2, str, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f196864a, aVar.f196864a) && this.f196865b == aVar.f196865b && Intrinsics.f(this.f196866c, aVar.f196866c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f196867g == aVar.f196867g;
    }

    public final int hashCode() {
        int iHashCode = (this.f196865b.hashCode() + (this.f196864a.hashCode() * 31)) * 31;
        vm3.c cVar = this.f196866c;
        return Boolean.hashCode(this.f196867g) + p.a.c(p.a.c(p.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
