package com.youTransactor.uCube.payment;

import androidx.annotation.NonNull;
import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.api.UCubePaymentRequest;
import defpackage.b;
import defpackage.h0;
import java.util.Date;

/* JADX INFO: loaded from: classes17.dex */
public class PaymentService {
    public static final PaymentService INSTANCE = new PaymentService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f107603a;

    public void cancel(ITaskCancelListener iTaskCancelListener) {
        h0 h0Var = this.f107603a;
        if (h0Var != null) {
            h0Var.cancel(iTaskCancelListener);
        } else {
            iTaskCancelListener.onCancelFinish(false);
        }
    }

    public boolean isRunning() {
        h0 h0Var = this.f107603a;
        if (h0Var != null) {
            return h0Var.isRunning();
        }
        return false;
    }

    public void pay(@NonNull UCubePaymentRequest uCubePaymentRequest, @NonNull ITaskMonitor iTaskMonitor) {
        try {
            b.a(uCubePaymentRequest.toString());
        } catch (Exception unused) {
        }
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.forceDebug = uCubePaymentRequest.isForceDebug();
        paymentContext.getSystemFailureInfoL2 = uCubePaymentRequest.isSystemFailureInfo2();
        paymentContext.amount = uCubePaymentRequest.getAmount();
        paymentContext.currency = uCubePaymentRequest.getCurrency();
        paymentContext.transactionType = uCubePaymentRequest.getTransactionType();
        if (uCubePaymentRequest.getTransactionDate() != null) {
            paymentContext.transactionDate = uCubePaymentRequest.getTransactionDate();
        } else {
            paymentContext.transactionDate = new Date();
        }
        paymentContext.cardWaitTimeout = uCubePaymentRequest.getCardWaitTimeout();
        paymentContext.cardWaitMessage = uCubePaymentRequest.getCardWaitMessage();
        paymentContext.preferredLanguageList = uCubePaymentRequest.getPreferredLanguageList();
        paymentContext.setForceAuthorization(uCubePaymentRequest.isForceAuthorisation());
        paymentContext.forceOnlinePIN = uCubePaymentRequest.isForceOnlinePin();
        paymentContext.applicationVersion = uCubePaymentRequest.getApplicationVersion();
        paymentContext.onlinePinBlockFormat = uCubePaymentRequest.getOnlinePinBlockFormat();
        paymentContext.inputProprietaryTLVStream = uCubePaymentRequest.getStartNFCTransactionInputProprietaryTLVStream();
        paymentContext.skipCardRemoval = uCubePaymentRequest.isSkipCardRemoval();
        paymentContext.skipStartingSteps = uCubePaymentRequest.isSkipStartingSteps();
        paymentContext.retrieveF5Tag = uCubePaymentRequest.isRetrieveF5Tag();
        paymentContext.tip = uCubePaymentRequest.isTipRequired();
        paymentContext.pinRequestLabel = uCubePaymentRequest.getPinRequestLabel();
        paymentContext.waitLabel = uCubePaymentRequest.getPinWaitLabel();
        paymentContext.pinRequestLabelFont = uCubePaymentRequest.getPinRequestLabelFont();
        paymentContext.waitLabelFont = uCubePaymentRequest.getPinWaitLabelFont();
        paymentContext.pinRequestLabelXPosition = uCubePaymentRequest.getPinRequestLabelXPosition();
        paymentContext.pinRequestLabelYPosition = uCubePaymentRequest.getPinRequestLabelYPosition();
        paymentContext.waitLabelXPosition = uCubePaymentRequest.getPinWaitLabelXPosition();
        paymentContext.waitLabelYPosition = uCubePaymentRequest.getPinWaitLabelYPosition();
        paymentContext.readerList = uCubePaymentRequest.getReaderList();
        paymentContext.authorizationPlainTags = uCubePaymentRequest.getAuthorizationPlainTags();
        paymentContext.authorizationSecuredTags = uCubePaymentRequest.getAuthorizationSecuredTags();
        paymentContext.finalizationSecuredTags = uCubePaymentRequest.getFinalizationSecuredTags();
        paymentContext.finalizationPlainTags = uCubePaymentRequest.getFinalizationPlainTags();
        h0 h0Var = new h0(paymentContext, uCubePaymentRequest.getAuthorizationTask());
        this.f107603a = h0Var;
        h0Var.J = uCubePaymentRequest.getApplicationSelectionTask();
        this.f107603a.K = uCubePaymentRequest.getRiskManagementTask();
        this.f107603a.execute(iTaskMonitor);
    }
}
