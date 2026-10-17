package iga;

import au0.u0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f161102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.k f161103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161104c;

    public f(u0 page, aw0.k kVar, String str) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f161102a = page;
        this.f161103b = kVar;
        this.f161104c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f161102a, fVar.f161102a) && Intrinsics.f(this.f161103b, fVar.f161103b) && Intrinsics.f(this.f161104c, fVar.f161104c);
    }

    public final int hashCode() {
        int iHashCode = this.f161102a.hashCode() * 31;
        aw0.k kVar = this.f161103b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f161104c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
