package il2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162043b;

    public a(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f162042a = title;
        this.f162043b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162042a, aVar.f162042a) && Intrinsics.f(this.f162043b, aVar.f162043b);
    }

    public final int hashCode() {
        return this.f162043b.hashCode() + (this.f162042a.hashCode() * 31);
    }
}
