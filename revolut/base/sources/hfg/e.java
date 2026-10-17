package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151824c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f151826h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TravelMilesProvider f151827j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f151828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f151829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f151830n;

    public e(String ref2, String name, String programmeName, String description, String logoUrl, String learnMoreUrl, String str, boolean z, String backgroundUrl, TravelMilesProvider provider, List redeemTypes, ArrayList redeemOptions, ArrayList extraRedeemOptions, String str2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(redeemOptions, "redeemOptions");
        Intrinsics.checkNotNullParameter(extraRedeemOptions, "extraRedeemOptions");
        this.f151822a = ref2;
        this.f151823b = name;
        this.f151824c = programmeName;
        this.d = description;
        this.e = logoUrl;
        this.f = learnMoreUrl;
        this.f151825g = str;
        this.f151826h = z;
        this.i = backgroundUrl;
        this.f151827j = provider;
        this.k = redeemTypes;
        this.f151828l = redeemOptions;
        this.f151829m = extraRedeemOptions;
        this.f151830n = str2;
    }

    public static e a(e eVar, TravelMilesProvider travelMilesProvider, ArrayList arrayList, int i) {
        String ref2 = eVar.f151822a;
        String name = eVar.f151823b;
        String programmeName = eVar.f151824c;
        String description = eVar.d;
        String logoUrl = eVar.e;
        String learnMoreUrl = eVar.f;
        String str = eVar.f151825g;
        boolean z = eVar.f151826h;
        String backgroundUrl = eVar.i;
        TravelMilesProvider provider = (i & 512) != 0 ? eVar.f151827j : travelMilesProvider;
        List redeemTypes = (i & 1024) != 0 ? eVar.k : arrayList;
        ArrayList redeemOptions = eVar.f151828l;
        ArrayList extraRedeemOptions = eVar.f151829m;
        String str2 = eVar.f151830n;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(redeemOptions, "redeemOptions");
        Intrinsics.checkNotNullParameter(extraRedeemOptions, "extraRedeemOptions");
        return new e(ref2, name, programmeName, description, logoUrl, learnMoreUrl, str, z, backgroundUrl, provider, redeemTypes, redeemOptions, extraRedeemOptions, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f151822a, eVar.f151822a) && Intrinsics.f(this.f151823b, eVar.f151823b) && Intrinsics.f(this.f151824c, eVar.f151824c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f151825g, eVar.f151825g) && this.f151826h == eVar.f151826h && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f151827j, eVar.f151827j) && Intrinsics.f(this.k, eVar.k) && this.f151828l.equals(eVar.f151828l) && this.f151829m.equals(eVar.f151829m) && Intrinsics.f(this.f151830n, eVar.f151830n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f151822a.hashCode() * 31, 31, this.f151823b), 31, this.f151824c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f151825g;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f151829m, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f151828l, p.a.d((this.f151827j.hashCode() + p.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f151826h), 31, this.i)) * 31, 31, this.k), 31), 31);
        String str2 = this.f151830n;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }
}
