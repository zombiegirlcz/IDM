package d0j;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110412c;
    public final String d;
    public final n e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f110413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f110414h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f110415j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f110416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f110417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f110418n;

    public k(String id10, String campaignId, String title, String subtitle, n state, String asset, Instant instant, Instant instant2, Integer num, ArrayList challengeSteps, boolean z, i iVar, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(challengeSteps, "challengeSteps");
        this.f110410a = id10;
        this.f110411b = campaignId;
        this.f110412c = title;
        this.d = subtitle;
        this.e = state;
        this.f = asset;
        this.f110413g = instant;
        this.f110414h = instant2;
        this.i = num;
        this.f110415j = challengeSteps;
        this.k = z;
        this.f110416l = iVar;
        this.f110417m = z3;
        this.f110418n = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f110410a, kVar.f110410a) && Intrinsics.f(this.f110411b, kVar.f110411b) && Intrinsics.f(this.f110412c, kVar.f110412c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f110413g, kVar.f110413g) && Intrinsics.f(this.f110414h, kVar.f110414h) && Intrinsics.f(this.i, kVar.i) && this.f110415j.equals(kVar.f110415j) && this.k == kVar.k && Intrinsics.f(this.f110416l, kVar.f110416l) && this.f110417m == kVar.f110417m && this.f110418n == kVar.f110418n;
    }

    public final int hashCode() {
        int iC = p.a.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f110410a.hashCode() * 31, 31, this.f110411b), 31, this.f110412c), 31, this.d)) * 31, 31, this.f);
        Instant instant = this.f110413g;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f110414h;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Integer num = this.i;
        int iC2 = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f110415j, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.k);
        i iVar = this.f110416l;
        return Boolean.hashCode(this.f110418n) + j6.a.c((iC2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31, this.f110417m);
    }
}
