package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import a31.w;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderInstitutionPaymentInfoUiModel;
import com.revolut.kompot.common.ModalDestination;
import eh3.s;
import eif.j;
import io3.n;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe6.k;
import oki.h;
import we6.o;
import we6.p;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements em6.b {
    public final CrossBorderEasyBankTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f72851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oe6.a f72852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i90.b f72853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.a f72854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fm6.a f72855t;
    public final le6.a u;
    public final fm6.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final im6.a f72856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f72857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f72858y;

    public e(CrossBorderEasyBankTransferFlowContract$InputData inputData, k mandateProposalInteractor, oe6.a externalInstitutionsInteractor, i90.b uuidUtils, r10.a ibanScreenDataLoader, fm6.a crossBorderTransferSuggestionsDialogProvider, le6.a institutionAvailabilityDialogProvider, fm6.b transferInstitutionNotListedDialogProvider, im6.a crossBorderInstitutionUiModelMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateProposalInteractor, "mandateProposalInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(ibanScreenDataLoader, "ibanScreenDataLoader");
        Intrinsics.checkNotNullParameter(crossBorderTransferSuggestionsDialogProvider, "crossBorderTransferSuggestionsDialogProvider");
        Intrinsics.checkNotNullParameter(institutionAvailabilityDialogProvider, "institutionAvailabilityDialogProvider");
        Intrinsics.checkNotNullParameter(transferInstitutionNotListedDialogProvider, "transferInstitutionNotListedDialogProvider");
        Intrinsics.checkNotNullParameter(crossBorderInstitutionUiModelMapper, "crossBorderInstitutionUiModelMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f72851p = mandateProposalInteractor;
        this.f72852q = externalInstitutionsInteractor;
        this.f72853r = uuidUtils;
        this.f72854s = ibanScreenDataLoader;
        this.f72855t = crossBorderTransferSuggestionsDialogProvider;
        this.u = institutionAvailabilityDialogProvider;
        this.v = transferInstitutionNotListedDialogProvider;
        this.f72856w = crossBorderInstitutionUiModelMapper;
        this.f72857x = featureToggleInteractor;
        this.f72858y = d8l.d.a(this, new s(this, 13));
    }

    public static final void I2(e eVar, String str, String str2, boolean z, String str3, String str4) {
        if (z) {
            eVar.n2(new w((Object) eVar, str, str4, (Object) str3, (Serializable) str2, (Continuation) null, 26), new whi.b(6));
        } else {
            eVar.M2(str, str4, null);
        }
    }

    public final void J2(p pVar) {
        C2(pVar);
        if (this.o.e) {
            return;
        }
        h.D2(this.f72858y);
    }

    public final void K2(CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) {
        if (Intrinsics.f(this.o.f72814a.f115083b, crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.getD())) {
            J2(new o(crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData));
            return;
        }
        h.w2(this.f72858y, new CrossBorderEasyBankTransferFlowContract$Step.DifferentCurrencyBottomSheet(crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void L2(CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModel, String str, io3.b bVar) {
        CrossBorderCountryDepartmentUiModel.Outage outage = crossBorderCountryDepartmentUiModel.f72905h;
        i iVar = this.f72858y;
        if (outage != null) {
            h.w2(iVar, new CrossBorderEasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog(outage.f72906a, outage.f72907b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        String str2 = crossBorderCountryDepartmentUiModel.f72901a;
        String str3 = crossBorderCountryDepartmentUiModel.f72902b;
        String str4 = crossBorderCountryDepartmentUiModel.f72903c;
        StringBuilder sbM = v0.a.m("id=", str2, ", countryCode=", str3, ", name=");
        sbM.append(str4);
        String string = sbM.toString();
        CrossBorderInstitutionPaymentInfoUiModel paymentInfoUiModel = crossBorderCountryDepartmentUiModel.f72904g;
        if (paymentInfoUiModel == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Payment info should present for country department ", string));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        xi0.b bVar2 = paymentInfoUiModel.e;
        if (crossBorderCountryDepartmentUiModel.d) {
            String str5 = crossBorderCountryDepartmentUiModel.f72901a;
            boolean z = paymentInfoUiModel.f72911c;
            String str6 = crossBorderCountryDepartmentUiModel.f72902b;
            if (bVar2 != null) {
                h.t2(this, iVar, new CrossBorderEasyBankTransferFlowContract$Step.Branches(str5, str, z, bVar2, str6), true, null, false, 12);
                return;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Supported currency should present for country department ", string));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return;
        }
        String str7 = crossBorderCountryDepartmentUiModel.f72901a;
        this.f72856w.getClass();
        Intrinsics.checkNotNullParameter(paymentInfoUiModel, "paymentInfoUiModel");
        boolean z3 = paymentInfoUiModel.f72909a;
        n topUpSystem = paymentInfoUiModel.f72910b;
        boolean z4 = paymentInfoUiModel.f72911c;
        boolean z6 = paymentInfoUiModel.d;
        Intrinsics.checkNotNullParameter(topUpSystem, "topUpSystem");
        String str8 = crossBorderCountryDepartmentUiModel.f72902b;
        if (bVar2 != null) {
            K2(new CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution(str7, str, bVar, bVar2, new CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution.PaymentInfo(z3, topUpSystem, z4, z6), str8));
            return;
        }
        IllegalStateException illegalStateException3 = new IllegalStateException("Currency info should present during currency check for easy bank transfer");
        h0 h0Var3 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
    }

    @Override // yki.j
    public final void M0() {
        CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = this.o.f72816c;
        if (crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData == null) {
            h.t2(this, this.f72858y, CrossBorderEasyBankTransferFlowContract$Step.Institutions.f72835a, true, null, false, 12);
        } else {
            l2(new j(this, crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData, null, 14), new yi5.b(26));
        }
    }

    public final void M2(String str, String str2, String str3) {
        n2(new dp4.p(17, this, str, str2, str3, null), new whi.b(6));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.f72858y;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72858y;
    }
}
