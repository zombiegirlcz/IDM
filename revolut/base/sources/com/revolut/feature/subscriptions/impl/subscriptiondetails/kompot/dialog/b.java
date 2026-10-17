package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog;

import cli.j;
import cli.n;
import cli.y;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$InputData;
import fce.f;
import fce.g;
import fce.i;
import fce.k;
import fce.l;
import fce.m;
import fce.o;
import fce.p;
import fce.q;
import fce.r;
import fce.s;
import fce.t;
import fce.u;
import fce.v;
import fce.w;
import fce.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements f {
    public final y o;

    public b(n stateMapper, SubscriptionDetailsDialogControllerContract$InputData inputData) {
        j jVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.UnblockSubscription) {
            jVar = new x(((SubscriptionDetailsDialogControllerContract$InputData.UnblockSubscription) inputData).f89295a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.BlockFuturePayments) {
            jVar = new fce.h(((SubscriptionDetailsDialogControllerContract$InputData.BlockFuturePayments) inputData).f89274a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.UnblockFuturePayments) {
            jVar = new v(((SubscriptionDetailsDialogControllerContract$InputData.UnblockFuturePayments) inputData).f89292a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.CancelSubscription) {
            jVar = new k(((SubscriptionDetailsDialogControllerContract$InputData.CancelSubscription) inputData).f89278a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.CancelNzDirectDebit) {
            SubscriptionDetailsDialogControllerContract$InputData.CancelNzDirectDebit cancelNzDirectDebit = (SubscriptionDetailsDialogControllerContract$InputData.CancelNzDirectDebit) inputData;
            jVar = new i(cancelNzDirectDebit.f89275a, cancelNzDirectDebit.f89276b);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.UnblockNzDirectDebit) {
            SubscriptionDetailsDialogControllerContract$InputData.UnblockNzDirectDebit unblockNzDirectDebit = (SubscriptionDetailsDialogControllerContract$InputData.UnblockNzDirectDebit) inputData;
            jVar = new w(unblockNzDirectDebit.f89293a, unblockNzDirectDebit.f89294b);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeactivateSubscription) {
            jVar = new m(((SubscriptionDetailsDialogControllerContract$InputData.DeactivateSubscription) inputData).f89280a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DisableSubscription) {
            SubscriptionDetailsDialogControllerContract$InputData.DisableSubscription disableSubscription = (SubscriptionDetailsDialogControllerContract$InputData.DisableSubscription) inputData;
            jVar = new s(disableSubscription.f89286a, disableSubscription.f89287b);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeleteSubscription) {
            jVar = new r(((SubscriptionDetailsDialogControllerContract$InputData.DeleteSubscription) inputData).f89285a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeleteScheduledPayment) {
            jVar = new q(((SubscriptionDetailsDialogControllerContract$InputData.DeleteScheduledPayment) inputData).f89284a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeleteJuniorAllowance) {
            jVar = new o(((SubscriptionDetailsDialogControllerContract$InputData.DeleteJuniorAllowance) inputData).f89282a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeleteDirectDebit) {
            jVar = new fce.n(((SubscriptionDetailsDialogControllerContract$InputData.DeleteDirectDebit) inputData).f89281a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.DeleteRecurringPayment) {
            jVar = new p(((SubscriptionDetailsDialogControllerContract$InputData.DeleteRecurringPayment) inputData).f89283a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.NextPayment) {
            jVar = new u(((SubscriptionDetailsDialogControllerContract$InputData.NextPayment) inputData).f89291a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.ApmMandateCancelSubscription) {
            jVar = new g(((SubscriptionDetailsDialogControllerContract$InputData.ApmMandateCancelSubscription) inputData).f89273a);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.EditFrequency) {
            SubscriptionDetailsDialogControllerContract$InputData.EditFrequency editFrequency = (SubscriptionDetailsDialogControllerContract$InputData.EditFrequency) inputData;
            jVar = new t(editFrequency.f89288a, editFrequency.f89289b, editFrequency.f89290c);
        } else if (inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.ConfirmSubaccountSource) {
            jVar = new l(((SubscriptionDetailsDialogControllerContract$InputData.ConfirmSubaccountSource) inputData).f89279a);
        } else {
            if (!(inputData instanceof SubscriptionDetailsDialogControllerContract$InputData.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = new fce.j(((SubscriptionDetailsDialogControllerContract$InputData.CancelSplit) inputData).f89277a);
        }
        this.o = d.b(this, jVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
