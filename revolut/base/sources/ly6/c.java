package ly6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import et6.p1;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lr.l;
import lu5.o;
import ly6.d;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f200707l;

    public c(p1 freelancerInvoiceInteractor) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        this.f200707l = freelancerInvoiceInteractor;
    }

    @Override // ly6.f
    public final Unit X1(jy6.h hVar) {
        FreelancerInvoiceSettings freelancerInvoiceSettings = ((jy6.g) zi0.c.I(hVar.d)).f179333b;
        boolean z = hVar.f179336c;
        Collection collection = freelancerInvoiceSettings.f;
        if (collection == null) {
            collection = f0.f322471a;
        }
        if (z == (!collection.isEmpty())) {
            r2().M0(d.a.f200708b);
            return Unit.f186387a;
        }
        V2(new l(this, freelancerInvoiceSettings, hVar, (Continuation) null, 4), new yi5.b(29));
        return Unit.f186387a;
    }

    @Override // ly6.f
    public final akg.n a() {
        return nim.a.v(rd0.e.b(this.f200707l.e(false)), new o(this, 14));
    }
}
