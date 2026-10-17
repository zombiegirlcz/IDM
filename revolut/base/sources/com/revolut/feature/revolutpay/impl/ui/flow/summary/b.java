package com.revolut.feature.revolutpay.impl.ui.flow.summary;

import aii.r;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import cdc.f;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$OutputData;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$PaymentResult;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FinishCommand;
import cp5.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oki.h;
import q7c.q;
import u6c.k;
import u7c.c;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements z8c.b {
    public final RevolutPayOrderSummaryContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f84492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cdc.b f84493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f84494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f84495s;

    public b(RevolutPayOrderSummaryContract$InputData inputData, q revolutPayInteractor, cdc.b redirectDestinationFactory, f oAuthReturnUrlFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutPayInteractor, "revolutPayInteractor");
        Intrinsics.checkNotNullParameter(redirectDestinationFactory, "redirectDestinationFactory");
        Intrinsics.checkNotNullParameter(oAuthReturnUrlFactory, "oAuthReturnUrlFactory");
        this.o = inputData;
        this.f84492p = revolutPayInteractor;
        this.f84493q = redirectDestinationFactory;
        this.f84494r = oAuthReturnUrlFactory;
        boolean z = inputData instanceof RevolutPayOrderSummaryContract$InputData.Standard;
        FlowStep flowStepI2 = SummaryFlowContract$Step.Idle.f84490a;
        if (z) {
            RevolutPayOrderSummaryContract$InputData.Standard standard = (RevolutPayOrderSummaryContract$InputData.Standard) inputData;
            if (standard.f84310m) {
                flowStepI2 = SummaryFlowContract$Step.Authentication.f84489a;
            } else if (Intrinsics.f(standard.f84306g, "IN_APP") || standard.f84309l) {
                flowStepI2 = I2();
            }
        } else if (!(inputData instanceof RevolutPayOrderSummaryContract$InputData.OAuthAuthorization)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f84495s = d.a(this, flowStepI2, f0.f322471a, new yz4.b(this, 19));
    }

    public final SummaryFlowContract$Step.Summary I2() {
        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = this.o;
        if (revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.Standard) {
            return new SummaryFlowContract$Step.Summary((((RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData).f84305c == null && ((RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData).d == null) ? false : true);
        }
        if (revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.OAuthAuthorization) {
            return new SummaryFlowContract$Step.Summary(false);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void J2(SummaryFlowContract$PaymentResult summaryFlowContract$PaymentResult) {
        r failure;
        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = this.o;
        boolean z = revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.Standard;
        ExternalDestination.ByIntent byIntentB = null;
        yki.a aVar = this.f84495s;
        if (!z) {
            if (!(revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.OAuthAuthorization)) {
                throw new NoWhenBranchMatchedException();
            }
            RevolutPayOrderSummaryContract$InputData.OAuthAuthorization oAuthAuthorization = (RevolutPayOrderSummaryContract$InputData.OAuthAuthorization) revolutPayOrderSummaryContract$InputData;
            String state = oAuthAuthorization.d;
            String redirectUri = oAuthAuthorization.f84301b;
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSuccessful) {
                String authorizationCode = ((SummaryFlowContract$PaymentResult.OAuthSuccessful) summaryFlowContract$PaymentResult).f84485a;
                f fVar = this.f84494r;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
                Intrinsics.checkNotNullParameter(state, "state");
                Uri uriBuild = ((f80.b) fVar.f23230a).f(redirectUri).buildUpon().appendQueryParameter("code", authorizationCode).appendQueryParameter("state", state).build();
                Intrinsics.h(uriBuild);
                Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
                intent.addFlags(268435456);
                K2(new ExternalDestination.ByIntent(intent, null));
                h.D2(aVar);
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSetupFailed) {
                L2(redirectUri, ((SummaryFlowContract$PaymentResult.OAuthSetupFailed) summaryFlowContract$PaymentResult).f84484a.a(), state);
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Failure) {
                L2(redirectUri, c.ACCESS_DENIED.a(), state);
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.DropOff) {
                L2(redirectUri, c.ACCESS_DENIED.a(), state);
                return;
            } else {
                if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.TerminalPayment) {
                    throw new IllegalStateException("TerminalPayment result cannot be handled when OAuth input");
                }
                if (!(summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Successful)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Regular Successful result cannot be handled when OAuth input");
            }
        }
        RevolutPayOrderSummaryContract$InputData.Standard standard = (RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData;
        boolean z3 = standard.f84310m;
        String str = standard.e;
        boolean z4 = standard.i;
        String orderToken = standard.f84304b;
        String str2 = standard.f84305c;
        String str3 = standard.d;
        if (z3) {
            h.D2(aVar);
            return;
        }
        if (standard.f84309l) {
            K2(u0.b(new FinishCommand(-1, q0.c(new Pair("PAYMENT_RESULT_EXTRA_KEY", summaryFlowContract$PaymentResult)), null, 4)));
            h.D2(aVar);
            return;
        }
        String str4 = standard.f84306g;
        if (str4 != null && a0.H(str4, "IN_APP", false)) {
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Successful) {
                failure = RevolutPayOrderSummaryContract$OutputData.Completed.f84314a;
            } else if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.DropOff) {
                failure = RevolutPayOrderSummaryContract$OutputData.Cancelled.f84313a;
            } else {
                if (!(summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Failure)) {
                    if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.TerminalPayment) {
                        throw new IllegalStateException("TerminalPayment result cannot be handled when IN_APP source");
                    }
                    if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSuccessful) {
                        throw new IllegalStateException("OAuthSuccessful result cannot be handled when Standard input");
                    }
                    if (!(summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSetupFailed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("OAuthSetupFailed result cannot be handled when Standard input");
                }
                failure = new RevolutPayOrderSummaryContract$OutputData.Failure(((SummaryFlowContract$PaymentResult.Failure) summaryFlowContract$PaymentResult).f84483a);
            }
            C2(failure);
            return;
        }
        boolean z6 = summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Successful;
        cdc.b bVar = this.f84493q;
        if (z6) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            if (str3 != null && str3.length() != 0) {
                byIntentB = bVar.d(str3, orderToken, str, z4);
            } else if (str2 != null && str2.length() != 0) {
                byIntentB = bVar.d(str2, orderToken, null, z4);
            }
        } else if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Failure) {
            String orderToken2 = standard.f84304b;
            String str5 = standard.e;
            boolean z11 = standard.i;
            k kVar = ((SummaryFlowContract$PaymentResult.Failure) summaryFlowContract$PaymentResult).f84483a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(orderToken2, "orderToken");
            if (str3 != null && str3.length() != 0) {
                byIntentB = bVar.c(str3, orderToken2, str5, z11, kVar);
            } else if (str2 != null && str2.length() != 0) {
                byIntentB = bVar.c(str2, orderToken2, null, z11, kVar);
            }
        } else if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.DropOff) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            if (str3 != null && str3.length() != 0) {
                byIntentB = bVar.b(str3, orderToken, str, z4);
            } else if (str2 != null && str2.length() != 0) {
                byIntentB = bVar.b(str2, orderToken, null, z4);
            }
        } else if (!(summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.TerminalPayment)) {
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSuccessful) {
                throw new IllegalStateException("OAuthSuccessful result cannot be handled when Standard input");
            }
            if (!(summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSetupFailed)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("OAuthSetupFailed result cannot be handled when Standard input");
        }
        if (byIntentB != null) {
            K2(byIntentB);
        }
        h.D2(aVar);
    }

    public final void K2(ParcelableDestination parcelableDestination) {
        try {
            C1(parcelableDestination);
        } catch (ActivityNotFoundException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    public final void L2(String redirectUri, String errorCode, String str) {
        f fVar = this.f84494r;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intent intent = new Intent("android.intent.action.VIEW", fVar.a(redirectUri, errorCode, str));
        intent.addFlags(268435456);
        K2(new ExternalDestination.ByIntent(intent, null));
        h.D2(this.f84495s);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f84495s.d() instanceof SummaryFlowContract$Step.Idle) {
            l2(new yzb.c(this, null, 6), new z8c.c(this, 0));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84495s;
    }
}
