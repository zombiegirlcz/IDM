package r7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252203b;

    public a(String str, String searchToken) {
        Intrinsics.checkNotNullParameter(searchToken, "searchToken");
        this.f252202a = str;
        this.f252203b = searchToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f252202a, aVar.f252202a) && Intrinsics.f(this.f252203b, aVar.f252203b);
    }

    public final int hashCode() {
        String str = this.f252202a;
        return this.f252203b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
