package d0j;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110401c;
    public final n d;
    public final String e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f110402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f110403h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f110404j;
    public final boolean k;

    public h(String id10, String campaignId, String title, n state, String asset, Instant instant, Instant instant2, Integer num, g gVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f110399a = id10;
        this.f110400b = campaignId;
        this.f110401c = title;
        this.d = state;
        this.e = asset;
        this.f = instant;
        this.f110402g = instant2;
        this.f110403h = num;
        this.i = gVar;
        this.f110404j = z;
        this.k = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f110399a, hVar.f110399a) && Intrinsics.f(this.f110400b, hVar.f110400b) && Intrinsics.f(this.f110401c, hVar.f110401c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f110402g, hVar.f110402g) && Intrinsics.f(this.f110403h, hVar.f110403h) && Intrinsics.f(this.i, hVar.i) && this.f110404j == hVar.f110404j && this.k == hVar.k;
    }

    public final int hashCode() {
        int iC = p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f110399a.hashCode() * 31, 31, this.f110400b), 31, this.f110401c)) * 31, 31, this.e);
        Instant instant = this.f;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f110402g;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Integer num = this.f110403h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        g gVar = this.i;
        return Boolean.hashCode(this.k) + j6.a.c((iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.f110404j);
    }
}
