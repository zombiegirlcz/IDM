package yx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import et6.p1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wx6.h;
import y65.l;
import yji.n;
import yuc.p;
import yx6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f317575l;

    public b(p1 freelancerInvoiceInteractor) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        this.f317575l = freelancerInvoiceInteractor;
    }

    @Override // yx6.e
    public final Unit S1(h hVar) {
        FreelancerInvoiceSettings freelancerInvoiceSettings = ((wx6.g) zi0.c.I(hVar.f300760a)).f300759b;
        if (Intrinsics.f(freelancerInvoiceSettings.f73410m, hVar.f300762c)) {
            r2().M0(c.a.f317576b);
            return Unit.f186387a;
        }
        V2(new l(this, freelancerInvoiceSettings, hVar, null, 19), new yi5.b(29));
        return Unit.f186387a;
    }

    @Override // yx6.e
    public final akg.n a() {
        return nim.a.v(rd0.e.b(this.f317575l.e(false)), new p(this, 14));
    }
}
