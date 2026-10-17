package o54;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.model.AutoPayDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import efm.r;
import hw3.c0;
import kotlin.jvm.internal.Intrinsics;
import o4a.e;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ck4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f222312a;

    public b(c0 autoPayInteractor) {
        Intrinsics.checkNotNullParameter(autoPayInteractor, "autoPayInteractor");
        this.f222312a = autoPayInteractor;
    }

    @Override // ck4.a
    public final r a(AutoPayRepaymentDataRequest autoPayRepaymentDataRequest) {
        if (autoPayRepaymentDataRequest == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        r map = w.i(autoPayRepaymentDataRequest).cast(AutoPayDataRequest.class).flatMapSingle(new e(5, new a(this, autoPayRepaymentDataRequest, 0))).map(new e(6, new o5.b(10)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarStartWith = ue0.e.H(map, h0.f322473a, new o5.b(11)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }
}
