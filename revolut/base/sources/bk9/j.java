package bk9;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleControllerContract$InputData;
import ej9.e0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements g {
    public final PreferredScheduleControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f16291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f16292q;

    public j(PreferredScheduleControllerContract$InputData inputData, n stateMapper, xh9.a payLaterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        this.o = inputData;
        this.f16291p = payLaterInteractor;
        PayLaterPaymentOption payLaterPaymentOption = inputData.f78891a;
        this.f16292q = mra.d.b(this, new f(payLaterPaymentOption, inputData.f78892b, payLaterPaymentOption.f78817b, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f16291p;
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) gVar.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(e0Var.f126807n.a(Unit.f186387a, loadingStrategy), h0.f322473a), null, null, new bi2.n(this, null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f16292q;
    }
}
