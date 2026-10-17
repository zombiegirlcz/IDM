package jh9;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174157a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FormAmountScreen f174158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FormAmountScreenContract$InputData f174159c;

    public /* synthetic */ b(FormAmountScreen formAmountScreen, FormAmountScreenContract$InputData formAmountScreenContract$InputData) {
        this.f174158b = formAmountScreen;
        this.f174159c = formAmountScreenContract$InputData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f174157a;
        FormAmountScreenContract$InputData formAmountScreenContract$InputData = this.f174159c;
        FormAmountScreen formAmountScreen = this.f174158b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = FormAmountScreen.S;
                return new CenteredAmountDelegate(new fb.c(formAmountScreenContract$InputData, formAmountScreen, 22));
            default:
                KProperty[] kPropertyArr2 = FormAmountScreen.S;
                qji.b bVarU2 = formAmountScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.di.FormAmountScreenInjector");
                lf9.j jVar = (lf9.j) bVarU2;
                lf9.m mVar = jVar.f194723b;
                lf9.j jVar2 = jVar.f194724c;
                formAmountScreenContract$InputData.getClass();
                return new lf9.e(mVar, jVar2, formAmountScreenContract$InputData);
        }
    }

    public /* synthetic */ b(FormAmountScreenContract$InputData formAmountScreenContract$InputData, FormAmountScreen formAmountScreen) {
        this.f174159c = formAmountScreenContract$InputData;
        this.f174158b = formAmountScreen;
    }
}
