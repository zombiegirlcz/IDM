package com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.PayWithAnyFlowContract$Step;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import w8c.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final PayWithAnyControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r8c.a f84478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u8c.b f84479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f84480r;

    public a(PayWithAnyControllerDescriptor$InputData inputData, r8c.a moveMoneyNavigationProvider, u8c.b topUpFlowWrapperExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moveMoneyNavigationProvider, "moveMoneyNavigationProvider");
        Intrinsics.checkNotNullParameter(topUpFlowWrapperExtension, "topUpFlowWrapperExtension");
        this.o = inputData;
        this.f84478p = moveMoneyNavigationProvider;
        this.f84479q = topUpFlowWrapperExtension;
        s sVar = new s(this, 19);
        this.f84480r = d.a(this, PayWithAnyFlowContract$Step.PayWithAny.f84477a, f0.f322471a, sVar);
    }

    public final void I2() {
        w6c.h hVar;
        PaymentMethod paymentMethod = this.o.d;
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) paymentMethod;
            hVar = new w6c.h(pocket.i, pocket.f84377b, pocket.f84376a);
        } else {
            if (!(paymentMethod instanceof PaymentMethod.BankAccount) && !(paymentMethod instanceof PaymentMethod.Card) && !(paymentMethod instanceof PaymentMethod.RevolutAccount) && paymentMethod != null) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = null;
        }
        C2(new w6c.d(hVar));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84480r;
    }
}
