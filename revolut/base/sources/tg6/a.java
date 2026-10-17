package tg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271098c;
    public final String d;
    public final String e;
    public final String f;

    public a(String id10, String compoundId, String state, String transactionId, String topupMethodType, String pseURL) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(topupMethodType, "topupMethodType");
        Intrinsics.checkNotNullParameter(pseURL, "pseURL");
        this.f271096a = id10;
        this.f271097b = compoundId;
        this.f271098c = state;
        this.d = transactionId;
        this.e = topupMethodType;
        this.f = pseURL;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271096a, aVar.f271096a) && Intrinsics.f(this.f271097b, aVar.f271097b) && Intrinsics.f(this.f271098c, aVar.f271098c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f271096a.hashCode() * 31, 31, this.f271097b), 31, this.f271098c), 31, this.d), 31, this.e);
    }
}
