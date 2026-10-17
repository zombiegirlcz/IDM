package sg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262579c;

    public a(String lastFour, String tokenUniqueReference, String str) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        this.f262577a = lastFour;
        this.f262578b = tokenUniqueReference;
        this.f262579c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f262577a, aVar.f262577a) && Intrinsics.f(this.f262578b, aVar.f262578b) && Intrinsics.f(this.f262579c, aVar.f262579c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f262577a.hashCode() * 31, 31, this.f262578b);
        String str = this.f262579c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
