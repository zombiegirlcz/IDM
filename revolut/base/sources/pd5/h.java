package pd5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235108b;

    public h(String addressUrl, String transactionUrl) {
        Intrinsics.checkNotNullParameter(addressUrl, "addressUrl");
        Intrinsics.checkNotNullParameter(transactionUrl, "transactionUrl");
        this.f235107a = addressUrl;
        this.f235108b = transactionUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f235107a, hVar.f235107a) && Intrinsics.f(this.f235108b, hVar.f235108b);
    }

    public final int hashCode() {
        return this.f235108b.hashCode() + (this.f235107a.hashCode() * 31);
    }
}
