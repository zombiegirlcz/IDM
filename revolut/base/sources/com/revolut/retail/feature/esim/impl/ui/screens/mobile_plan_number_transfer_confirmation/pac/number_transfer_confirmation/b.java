package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation;

import aw0.o9;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingCredentialIssuer;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep;
import dej.w0;
import dfj.q1;
import eh3.s;
import elj.g;
import elj.j;
import elj.m;
import hx7.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd.k;
import oki.h;
import rd0.c;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements j {
    public final EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f101318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f101319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q1 f101320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.a f101321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final skj.a f101322t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(n stateMapper, EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData inputData, s70.a intentProvider, k phoneNumberPortingAttributesValidator, q1 phoneNumberPortingInteractor, f01.a uiKitResources, skj.a portingStatusDialogConfig) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(phoneNumberPortingAttributesValidator, "phoneNumberPortingAttributesValidator");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(portingStatusDialogConfig, "portingStatusDialogConfig");
        this.o = inputData;
        this.f101318p = intentProvider;
        this.f101319q = phoneNumberPortingAttributesValidator;
        this.f101320r = phoneNumberPortingInteractor;
        this.f101321s = uiKitResources;
        this.f101322t = portingStatusDialogConfig;
        this.u = d.b(this, new g(null, null, null), stateMapper, null, false, 12);
        this.v = e.a(this, new s(this, 12));
    }

    public static void J2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, "EsimMobilePlanPacNumberTransferConfirmationScreenModel", null, illegalStateException, h0Var);
    }

    public final void I2(String str, EsimDescriptorValue esimDescriptorValue) {
        String str2;
        if (!(esimDescriptorValue instanceof EsimDescriptorValue.Action)) {
            if (!(esimDescriptorValue instanceof EsimDescriptorValue.Link)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Enum r132 = ((EsimDescriptorValue.Action) esimDescriptorValue).f100252a;
        if (!(r132 instanceof w0)) {
            r132 = null;
        }
        w0 w0Var = (w0) r132;
        int i = w0Var == null ? -1 : m.f127508a[w0Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                K2(str, null);
                return;
            }
            EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = this.o;
            if (i == 2) {
                EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuer = esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.e.f;
                if (esimPhoneNumberPortingCredentialIssuer == null || (str2 = esimPhoneNumberPortingCredentialIssuer.f100348a) == null) {
                    J2("Terms action REQUEST_PAC clicked, pac credential issuer is null");
                    return;
                } else {
                    K2(str2, esimPhoneNumberPortingCredentialIssuer.f100349b);
                    return;
                }
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            EsimCheckoutPortingSteps esimCheckoutPortingSteps = esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.d;
            if (esimCheckoutPortingSteps == null) {
                J2("Porting progress is null");
                return;
            }
            TextClause textClause = new TextClause(esimCheckoutPortingSteps.f100193a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = esimCheckoutPortingSteps.f100194b;
            h.v2(this.v, new EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus(textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, esimCheckoutPortingSteps.f100195c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(String str, String str2) {
        if (str2 == null) {
            str2 = this.f101321s.b(new TextLocalisedClause(R$string.esim_mobile_plans_transfer_details_pac, null, null, 14)).toString();
        }
        C1(new ExternalDestination.ByIntent(((s70.b) this.f101318p).e(str, str2), null));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
