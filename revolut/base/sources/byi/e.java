package byi;

import kotlin.jvm.internal.Intrinsics;
import svi.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svi.k f19828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f19830c;

    public e(svi.k pass, String termsAndConditionsUrl, w wVar) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        this.f19828a = pass;
        this.f19829b = termsAndConditionsUrl;
        this.f19830c = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f19828a, eVar.f19828a) && Intrinsics.f(this.f19829b, eVar.f19829b) && Intrinsics.f(this.f19830c, eVar.f19830c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f19828a.hashCode() * 31, 31, this.f19829b);
        w wVar = this.f19830c;
        return iC + (wVar == null ? 0 : wVar.f266012a.hashCode());
    }
}
