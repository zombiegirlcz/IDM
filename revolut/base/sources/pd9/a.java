package pd9;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f235125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f235126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f235127c;

    public a(List companies, Set directOnboarding, Set retailAppOnboarding) {
        Intrinsics.checkNotNullParameter(directOnboarding, "directOnboarding");
        Intrinsics.checkNotNullParameter(retailAppOnboarding, "retailAppOnboarding");
        Intrinsics.checkNotNullParameter(companies, "companies");
        this.f235125a = directOnboarding;
        this.f235126b = retailAppOnboarding;
        this.f235127c = companies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f235125a, aVar.f235125a) && Intrinsics.f(this.f235126b, aVar.f235126b) && Intrinsics.f(this.f235127c, aVar.f235127c);
    }

    public final int hashCode() {
        return this.f235127c.hashCode() + p.a.f(this.f235125a.hashCode() * 31, 31, this.f235126b);
    }
}
