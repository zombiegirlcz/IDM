package gp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f145282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f145283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f145284r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, PaymentBreakdownScreenContract$InputData inputData, j60.a bottomExpandableDialogExtension, h paymentPopupFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(paymentPopupFactory, "paymentPopupFactory");
        this.f145282p = bottomExpandableDialogExtension;
        this.f145283q = paymentPopupFactory;
        this.f145284r = new d(inputData.f75594a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f145284r;
    }
}
