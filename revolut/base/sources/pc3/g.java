package pc3;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreenContract$InputData;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import p2i.l;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nb3.b f234816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CashTopUpSearchLocationScreenContract$InputData f234817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f234818r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h mapper, nb3.b cashTopUpInteractor, CashTopUpSearchLocationScreenContract$InputData inputData) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f234816p = cashTopUpInteractor;
        this.f234817q = inputData;
        this.f234818r = new d(0);
    }

    public static ArrayList y2(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            CashTopUpLocationInfo cashTopUpLocationInfo = (CashTopUpLocationInfo) obj2;
            if (d0.J(cashTopUpLocationInfo.f65591b, str, true) || d0.J(cashTopUpLocationInfo.f65594h, str, true) || d0.J(cashTopUpLocationInfo.i, str, true) || d0.J(cashTopUpLocationInfo.f65593g, str, true) || d0.J(cashTopUpLocationInfo.f65590a, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // yji.l
    public final void T1(long j2) {
        CashTopUpSearchLocationScreenContract$InputData cashTopUpSearchLocationScreenContract$InputData = this.f234817q;
        co3.a aVar = cashTopUpSearchLocationScreenContract$InputData.f65682b;
        r rVarOnErrorResumeNext = m70.a.g(this.f234816p.c(cashTopUpSearchLocationScreenContract$InputData.f65681a, aVar, cashTopUpSearchLocationScreenContract$InputData.f65683c), null, new p4a.g(29), 1).onErrorResumeNext(new p56.a(new l(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        yji.l.b1(this, rd0.e.b(rd0.e.p(ue0.e.q(rVarOnErrorResumeNext, h0.f322473a), 0L, 0L, 31)), null, new ox5.r(this, null, 21), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f234818r;
    }
}
