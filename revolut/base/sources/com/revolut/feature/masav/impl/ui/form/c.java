package com.revolut.feature.masav.impl.ui.form;

import a15.l;
import a31.k;
import c69.i;
import c69.j;
import c69.m;
import c69.n;
import c69.o;
import c69.p;
import c69.q;
import c69.r;
import c69.s;
import c69.u;
import c69.v;
import c69.x;
import cli.g;
import cli.y;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Creditor;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.z;
import l80.e;
import l80.f;
import mra.d;
import oki.h;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements m {
    public final MasavDirectDebitFormScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f78118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f78119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c69.a f78120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f78121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78122t;

    public c(MasavDirectDebitFormScreenContract$InputData inputData, e dateProvider, ugc.a masavDirectDebitInteractor, c69.a masavDialogProvider, u stateMapper) {
        i iVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(masavDirectDebitInteractor, "masavDirectDebitInteractor");
        Intrinsics.checkNotNullParameter(masavDialogProvider, "masavDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f78118p = dateProvider;
        this.f78119q = masavDirectDebitInteractor;
        this.f78120r = masavDialogProvider;
        if (inputData instanceof MasavDirectDebitFormScreenContract$InputData.CreateByCreditor) {
            iVar = new i(c69.h.CREATE, new DirectDebitData(((MasavDirectDebitFormScreenContract$InputData.CreateByCreditor) inputData).f78111a, "", ((f) dateProvider).e(), null, null));
        } else if (inputData instanceof MasavDirectDebitFormScreenContract$InputData.Edit) {
            iVar = new i(c69.h.EDIT, I2(((MasavDirectDebitFormScreenContract$InputData.Edit) inputData).f78112a));
        } else {
            if (!(inputData instanceof MasavDirectDebitFormScreenContract$InputData.AdjustLimits)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = new i(c69.h.ADJUST_LIMITS, I2(((MasavDirectDebitFormScreenContract$InputData.AdjustLimits) inputData).f78110a));
        }
        this.f78121s = d.b(this, iVar, stateMapper, null, false, 12);
        this.f78122t = hx7.e.a(this, new bwd.a(this, 24));
    }

    public final DirectDebitData I2(ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary) {
        String str;
        String str2;
        String str3;
        LocalDate localDate;
        LocalDate localDate2;
        Creditor.Details details;
        String str4;
        Creditor.Details details2;
        String str5;
        String str6;
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        Creditor creditor = apmPaymentAuthorisationSummary.d;
        if (!(paymentMethodDetails instanceof PaymentMethodDetails.Masav)) {
            throw new IllegalArgumentException("Expected Payment Authorisation with Masav Payment details");
        }
        if (creditor == null || (str6 = creditor.f62010a) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = str6;
        }
        String str7 = creditor != null ? creditor.f62011b : null;
        String str8 = str7 == null ? "" : str7;
        if (creditor == null || (details2 = creditor.f62012c) == null || (str5 = details2.f62013a) == null) {
            m70.a.c(t0.f186434a);
            str2 = "";
        } else {
            str2 = str5;
        }
        if (creditor == null || (details = creditor.f62012c) == null || (str4 = details.f62014b) == null) {
            m70.a.c(t0.f186434a);
            str3 = "";
        } else {
            str3 = str4;
        }
        Biller biller = new Biller(str, str8, null, null, null, null, null, false, true, false, new Biller.Details(str2, str3, null, null, false));
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.k;
        if (localDateTime == null || (localDate2 = localDateTime.toLocalDate()) == null) {
            LocalDate localDateE = ((f) this.f78118p).e();
            DayOfWeek dayOfWeek = localDateE.getDayOfWeek();
            int i = dayOfWeek == null ? -1 : x.f21743a[dayOfWeek.ordinal()];
            if (i == 1) {
                localDateE = localDateE.plusDays(2L);
                Intrinsics.checkNotNullExpressionValue(localDateE, "plusDays(...)");
            } else if (i == 2) {
                localDateE = localDateE.plusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDateE, "plusDays(...)");
            }
            localDate = localDateE;
        } else {
            localDate = localDate2;
        }
        LocalDateTime localDateTime2 = apmPaymentAuthorisationSummary.f61998l;
        LocalDate localDate3 = localDateTime2 != null ? localDateTime2.toLocalDate() : null;
        dj0.d dVar = apmPaymentAuthorisationSummary.f62001p;
        String str9 = ((PaymentMethodDetails.Masav) paymentMethodDetails).f62039a;
        return new DirectDebitData(biller, str9 == null ? "" : str9, localDate, localDate3, dVar);
    }

    public final void J2(s uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent.equals(n.f21732a)) {
            B2();
            return;
        }
        boolean zEquals = uiEvent.equals(o.f21733a);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f78122t;
        y yVar = this.f78121s;
        if (zEquals) {
            i iVar = (i) ((j2) yVar.f22677a).getValue();
            int i = x.f21744b[iVar.f21728a.ordinal()];
            if (i == 1) {
                C2(new j(iVar.f21729b));
                return;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h.v2(aVar, MasavDirectDebitFormScreenContract$ModalStep.EditDebit.f78113a, bottom_dialog);
                return;
            }
        }
        boolean z = uiEvent instanceof q;
        MasavDirectDebitFormScreenContract$ModalStep.SelectDate selectDate = MasavDirectDebitFormScreenContract$ModalStep.SelectDate.f78115a;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        MasavDirectDebitFormScreenContract$ModalStep.InstitutionsList institutionsList = MasavDirectDebitFormScreenContract$ModalStep.InstitutionsList.f78114a;
        if (z) {
            String str = ((q) uiEvent).f21736a;
            if (Intrinsics.f(str, "LIST_ID_INSTITUTE")) {
                h.v2(aVar, institutionsList, popup);
                return;
            } else {
                if (Intrinsics.f(str, "LIST_ID_END_DATE")) {
                    h.v2(aVar, selectDate, bottom_dialog);
                    return;
                }
                return;
            }
        }
        if (uiEvent instanceof r) {
            String str2 = ((r) uiEvent).f21737a;
            if (Intrinsics.f(str2, "LIST_ID_INSTITUTE")) {
                h.v2(aVar, institutionsList, popup);
                return;
            }
            if (Intrinsics.f(str2, "LIST_ID_END_DATE")) {
                if (((i) ((j2) yVar.f22677a).getValue()).f21729b.d == null) {
                    h.v2(aVar, selectDate, bottom_dialog);
                    return;
                } else {
                    H2(yVar, new k(9, new l(4, null)));
                    return;
                }
            }
            return;
        }
        if (!(uiEvent instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) uiEvent;
        String str3 = pVar.f21734a;
        if (Intrinsics.f(str3, "LIST_ID_REFERENCE")) {
            H2(yVar, new k(9, new v(pVar, 0)));
        } else if (Intrinsics.f(str3, "LIST_ID_SINGLE_TXN_LIMIT")) {
            H2(yVar, new k(9, new blj.s(z.n(pVar.f21735b.toString()), 1)));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78122t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f78121s;
    }
}
