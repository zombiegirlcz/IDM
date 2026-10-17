package hoe;

import com.revolut.feature.tax_residency.impl.services.TaxResidencyService;
import ioe.d0;
import ioe.n;
import java.util.ArrayList;
import java.util.List;
import joe.b;
import joe.o;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import zhm.f0;
import zhm.w;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements yme.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f154277a;

    public a(b taxResidencyRepository) {
        Intrinsics.checkNotNullParameter(taxResidencyRepository, "taxResidencyRepository");
        this.f154277a = taxResidencyRepository;
    }

    public final efm.b a(List residencies, List taxForms, Boolean bool) {
        Intrinsics.checkNotNullParameter(residencies, "residencies");
        Intrinsics.checkNotNullParameter(taxForms, "taxForms");
        o oVar = (o) this.f154277a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(residencies, "residencies");
        Intrinsics.checkNotNullParameter(taxForms, "taxForms");
        TaxResidencyService taxResidencyService = oVar.f176939a;
        List<f> list = residencies;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f fVar : list) {
            Object obj2 = joe.a.f176928a;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            wi0.b bVar = fVar.f323482a;
            arrayList.add(new n(bVar.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
        }
        t tVarL = taxResidencyService.submitTaxResidencies(new d0(arrayList, f0.f322471a, bool)).l(new hc7.a(oVar, residencies, 12));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return te0.w.g0(tVarL);
    }

    @Override // od0.e
    public final void clear() {
        ((o) this.f154277a).clear();
    }
}
