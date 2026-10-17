package yp3;

import ft3.a1;
import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f315767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f315768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wp3.a f315769c;
    public final d d;
    public final f e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f315770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f315771h;

    public a(j1 productType, a1 entryPointPayload, wp3.a activeApplicationStrategy, d productArticleStrategy) {
        f productIntroStrategy = f.SHOW_ALL;
        c planSelectionStrategy = c.DEFAULT;
        e eligibilityStrategy = e.SKIP_ON_TOGGLE_DISABLED;
        b kycStrategy = b.DEFAULT;
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
        Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
        Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
        Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
        Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
        Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
        this.f315767a = productType;
        this.f315768b = entryPointPayload;
        this.f315769c = activeApplicationStrategy;
        this.d = productArticleStrategy;
        this.e = productIntroStrategy;
        this.f = planSelectionStrategy;
        this.f315770g = eligibilityStrategy;
        this.f315771h = kycStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f315767a == aVar.f315767a && Intrinsics.f(this.f315768b, aVar.f315768b) && this.f315769c == aVar.f315769c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f315770g == aVar.f315770g && this.f315771h == aVar.f315771h;
    }

    public final int hashCode() {
        return (this.f315771h.hashCode() + ((this.f315770g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f315769c.hashCode() + ((this.f315768b.hashCode() + (this.f315767a.hashCode() * 961)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 29791;
    }
}
