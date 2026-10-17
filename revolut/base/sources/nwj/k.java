package nwj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f219950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219951c;

    public k(String individualId, q token, String str) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f219949a = individualId;
        this.f219950b = token;
        this.f219951c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f219949a, kVar.f219949a) && Intrinsics.f(this.f219950b, kVar.f219950b) && Intrinsics.f(this.f219951c, kVar.f219951c);
    }

    @Override // nwj.n
    public final q getToken() {
        return this.f219950b;
    }

    public final int hashCode() {
        int iHashCode = (this.f219950b.hashCode() + (this.f219949a.hashCode() * 31)) * 31;
        String str = this.f219951c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
