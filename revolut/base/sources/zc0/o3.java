package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321099b;

    public o3(String itemId, String url2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f321098a = itemId;
        this.f321099b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f321098a, o3Var.f321098a) && Intrinsics.f(this.f321099b, o3Var.f321099b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321098a;
    }

    public final int hashCode() {
        return this.f321099b.hashCode() + (this.f321098a.hashCode() * 31);
    }
}
