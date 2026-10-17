package u2f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f276618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276619c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f276621h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f276622j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f276623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f276624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f276625n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f276626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f276627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f276628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f276629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TradeRevPointsAccountTransferLimit f276630t;

    public d(String id10, j product, String name, String programmeName, String str, String subtitle, String description, String logoUrl, String learnMoreUrl, String str2, boolean z, String backgroundUrl, h loyaltyProgramme, ArrayList redeemTypes, String str3, String str4, List redeemOptions, List extraRedeemOptions, e eVar, TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(loyaltyProgramme, "loyaltyProgramme");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(redeemOptions, "redeemOptions");
        Intrinsics.checkNotNullParameter(extraRedeemOptions, "extraRedeemOptions");
        this.f276617a = id10;
        this.f276618b = product;
        this.f276619c = name;
        this.d = programmeName;
        this.e = str;
        this.f = subtitle;
        this.f276620g = description;
        this.f276621h = logoUrl;
        this.i = learnMoreUrl;
        this.f276622j = str2;
        this.k = z;
        this.f276623l = backgroundUrl;
        this.f276624m = loyaltyProgramme;
        this.f276625n = redeemTypes;
        this.o = str3;
        this.f276626p = str4;
        this.f276627q = redeemOptions;
        this.f276628r = extraRedeemOptions;
        this.f276629s = eVar;
        this.f276630t = tradeRevPointsAccountTransferLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f276617a, dVar.f276617a) && this.f276618b == dVar.f276618b && Intrinsics.f(this.f276619c, dVar.f276619c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f276620g, dVar.f276620g) && Intrinsics.f(this.f276621h, dVar.f276621h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f276622j, dVar.f276622j) && this.k == dVar.k && Intrinsics.f(this.f276623l, dVar.f276623l) && this.f276624m.equals(dVar.f276624m) && this.f276625n.equals(dVar.f276625n) && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f276626p, dVar.f276626p) && Intrinsics.f(this.f276627q, dVar.f276627q) && Intrinsics.f(this.f276628r, dVar.f276628r) && Intrinsics.f(this.f276629s, dVar.f276629s) && Intrinsics.f(this.f276630t, dVar.f276630t);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f276618b.hashCode() + (this.f276617a.hashCode() * 31)) * 31, 31, this.f276619c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f276620g), 31, this.f276621h), 31, this.i);
        String str2 = this.f276622j;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f276625n, (this.f276624m.hashCode() + p.a.c(j6.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k), 31, this.f276623l)) * 31, 31);
        String str3 = this.o;
        int iHashCode = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f276626p;
        int iD = p.a.d(p.a.d((iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f276627q), 31, this.f276628r);
        e eVar = this.f276629s;
        int iHashCode2 = (iD + (eVar == null ? 0 : eVar.hashCode())) * 31;
        TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit = this.f276630t;
        return iHashCode2 + (tradeRevPointsAccountTransferLimit != null ? tradeRevPointsAccountTransferLimit.hashCode() : 0);
    }
}
