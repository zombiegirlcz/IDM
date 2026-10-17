package lg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195078c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f195079g;

    public b(String id10, String transactionId, String compoundId, String state, String topupMethod, String upiDeepLinkUrl, String androidPackage) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(topupMethod, "topupMethod");
        Intrinsics.checkNotNullParameter(upiDeepLinkUrl, "upiDeepLinkUrl");
        Intrinsics.checkNotNullParameter(androidPackage, "androidPackage");
        this.f195076a = id10;
        this.f195077b = transactionId;
        this.f195078c = compoundId;
        this.d = state;
        this.e = topupMethod;
        this.f = upiDeepLinkUrl;
        this.f195079g = androidPackage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f195076a, bVar.f195076a) && Intrinsics.f(this.f195077b, bVar.f195077b) && Intrinsics.f(this.f195078c, bVar.f195078c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f195079g, bVar.f195079g);
    }

    public final int hashCode() {
        return this.f195079g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f195076a.hashCode() * 31, 31, this.f195077b), 31, this.f195078c), 31, this.d), 31, this.e), 31, this.f);
    }
}
