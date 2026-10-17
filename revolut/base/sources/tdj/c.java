package tdj;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pcj.d;
import pfm.h;
import qij.s;
import td1.f;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends pcj.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f270001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pcj.b f270002n;

    public c(d presentationModel, i overrideInitialChartType) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(overrideInitialChartType, "overrideInitialChartType");
        this.f270001m = presentationModel;
        ncj.d dVar = (ncj.d) overrideInitialChartType.g();
        this.f270002n = new pcj.b(dVar == null ? ncj.d.ABSOLUTE_VALUES : dVar);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f270002n;
    }

    @Override // pcj.a
    public final h e3(xi0.b currency, xi0.b baseCurrency, ncj.d chartType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        h hVar = new h(new aed.d(this, currency, baseCurrency, chartType, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // pcj.a
    public final l f3(xi0.b currency, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return q.Q(q.q(new s(c3(), 26)), new mki.d((Continuation) null, this, currency, baseCurrency, 15));
    }

    @Override // pcj.a
    public final void g3(ncj.d currentChartType) {
        ncj.d dVar;
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        int i = a.f269999a[currentChartType.ordinal()];
        if (i == 1) {
            dVar = ncj.d.PERCENTAGE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = ncj.d.ABSOLUTE_VALUES;
        }
        d3(new f(dVar, 4));
    }
}
