package up9;

import aw0.f4;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f281934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f281935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l2j.a f281936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ldd.b f281937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f281938t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fk3.a configurationInteractor, w80.b amountFormatter, l2j.a currencyChooserFlowFactory, ldd.b focusRequesterDelegate, CustomBillInputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f281934p = configurationInteractor;
        this.f281935q = amountFormatter;
        this.f281936r = currencyChooserFlowFactory;
        this.f281937s = focusRequesterDelegate;
        this.f281938t = new b(inputData.f79189a, inputData.f79190b, inputData.f79191c, inputData.d, inputData.e, 0, inputData.f);
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.f281937s;
        bVar.f194072c = false;
        bVar.b(new f4("ID_AMOUNT_EDIT", true));
        x2(new j(this, 0));
    }

    @Override // yji.l
    public final void P1() {
        x2(new j(this, 1));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f281938t;
    }
}
