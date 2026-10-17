package t6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268348b;

    public d(List pagerItems, String str) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f268347a = pagerItems;
        this.f268348b = str;
    }

    @Override // oki.a
    public final List W() {
        return this.f268347a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f268347a, dVar.f268347a) && Intrinsics.f(this.f268348b, dVar.f268348b);
    }

    public final int hashCode() {
        int iHashCode = this.f268347a.hashCode() * 31;
        String str = this.f268348b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f268348b;
    }
}
