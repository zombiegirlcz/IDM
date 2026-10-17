package qfg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245314c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f245315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f245316h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f245317j;
    public final f k;

    public d(String ref2, String name, String programmeName, String description, String logoUrl, String learnMoreUrl, boolean z, int i, List redeemTypes, String str, f provider) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f245312a = ref2;
        this.f245313b = name;
        this.f245314c = programmeName;
        this.d = description;
        this.e = logoUrl;
        this.f = learnMoreUrl;
        this.f245315g = z;
        this.f245316h = i;
        this.i = redeemTypes;
        this.f245317j = str;
        this.k = provider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f245312a, dVar.f245312a) && Intrinsics.f(this.f245313b, dVar.f245313b) && Intrinsics.f(this.f245314c, dVar.f245314c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f245315g == dVar.f245315g && this.f245316h == dVar.f245316h && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f245317j, dVar.f245317j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.b(this.f245316h, j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f245312a.hashCode() * 31, 31, this.f245313b), 31, this.f245314c), 31, this.d), 31, this.e), 31, this.f), 31, this.f245315g), 31), 31, this.i);
        String str = this.f245317j;
        return this.k.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
