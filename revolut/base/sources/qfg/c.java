package qfg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245305c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f245306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f245307h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f245308j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f245309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f245310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f245311n;

    public c(String ref2, String name, String programmeName, String description, String logoUrl, String learnMoreUrl, String str, boolean z, String backgroundUrl, f provider, List redeemTypes, List redeemOptions, List extraRedeemOptions, String str2) {
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
        this.f245303a = ref2;
        this.f245304b = name;
        this.f245305c = programmeName;
        this.d = description;
        this.e = logoUrl;
        this.f = learnMoreUrl;
        this.f245306g = str;
        this.f245307h = z;
        this.i = backgroundUrl;
        this.f245308j = provider;
        this.k = redeemTypes;
        this.f245309l = redeemOptions;
        this.f245310m = extraRedeemOptions;
        this.f245311n = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f245303a, cVar.f245303a) && Intrinsics.f(this.f245304b, cVar.f245304b) && Intrinsics.f(this.f245305c, cVar.f245305c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f245306g, cVar.f245306g) && this.f245307h == cVar.f245307h && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f245308j, cVar.f245308j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f245309l, cVar.f245309l) && Intrinsics.f(this.f245310m, cVar.f245310m) && Intrinsics.f(this.f245311n, cVar.f245311n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f245303a.hashCode() * 31, 31, this.f245304b), 31, this.f245305c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f245306g;
        int iD = p.a.d(p.a.d(p.a.d((this.f245308j.hashCode() + p.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f245307h), 31, this.i)) * 31, 31, this.k), 31, this.f245309l), 31, this.f245310m);
        String str2 = this.f245311n;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
