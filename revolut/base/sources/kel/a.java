package kel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f183147c;
    public final l d;
    public final String e;
    public final String f;

    public a(String id10, String portfolioId, Long l2, l state, String currency, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f183145a = id10;
        this.f183146b = portfolioId;
        this.f183147c = l2;
        this.d = state;
        this.e = currency;
        this.f = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f183145a, aVar.f183145a) && Intrinsics.f(this.f183146b, aVar.f183146b) && Intrinsics.f(this.f183147c, aVar.f183147c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    @Override // kel.g
    public final String g() {
        return this.f183146b;
    }

    @Override // kel.g
    public final String getCurrency() {
        return this.e;
    }

    @Override // kel.g
    public final String getId() {
        return this.f183145a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f183145a.hashCode() * 31, 31, this.f183146b);
        Long l2 = this.f183147c;
        return this.f.hashCode() + p.a.c((this.d.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.e);
    }
}
