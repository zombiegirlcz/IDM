package m87;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203441b;

    public c(List pagerItems, String str) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f203440a = pagerItems;
        this.f203441b = str;
    }

    @Override // oki.a
    public final List W() {
        return this.f203440a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f203440a, cVar.f203440a) && Intrinsics.f(this.f203441b, cVar.f203441b);
    }

    public final int hashCode() {
        int iHashCode = this.f203440a.hashCode() * 31;
        String str = this.f203441b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f203441b;
    }
}
