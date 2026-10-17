package com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.Exemption;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.models.Popup;
import com.revolut.feature.tax_residency.impl.v2.models.TinInputFormat;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import jpe.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import plb.g;
import ppe.b;
import rpe.f;
import yki.i;
import ype.k;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final TaxResidencyDeclarationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f90232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lpe.d f90233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a61.a f90234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lal.a f90235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CountryRule f90236t;
    public final UserSpecificRule u;
    public final i v;

    public a(TaxResidencyDeclarationFlowContract$InputData inputData, d taxResidencyInteractor, lpe.d dialogProvider, a61.a errorParser, lal.a idempotencyKeyManager) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(idempotencyKeyManager, "idempotencyKeyManager");
        this.o = inputData;
        this.f90232p = taxResidencyInteractor;
        this.f90233q = dialogProvider;
        this.f90234r = errorParser;
        this.f90235s = idempotencyKeyManager;
        this.f90236t = inputData.f90217b;
        this.u = inputData.f90218c;
        this.v = d8l.d.a(this, new g(this, 13));
    }

    public static void L2(a aVar, Boolean bool, String str, ExemptionReason exemptionReason, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        ExemptionReason exemptionReason2 = (i & 4) != 0 ? null : exemptionReason;
        if (aVar.o.i) {
            lal.a aVar2 = aVar.f90235s;
            if (!Intrinsics.f(bool, (Boolean) aVar2.f193427c) || !Intrinsics.f(str2, (String) aVar2.d) || exemptionReason2 != ((ExemptionReason) aVar2.e)) {
                aVar2.f193427c = bool;
                aVar2.d = str2;
                aVar2.e = exemptionReason2;
                ((wj0.a) aVar2.f193426b).a("tax_residency_submit");
            }
        }
        aVar.l2(new of6.d(aVar, bool, str2, exemptionReason2, (Continuation) null), new plc.i(1, aVar, a.class, "handleSubmissionError", "handleSubmissionError(Ljava/lang/Throwable;)Z", 0, 15));
    }

    public final ype.i I2() {
        List list = this.u.f90187b;
        if (list == null) {
            list = f0.f322471a;
        }
        Exemption exemption = (Exemption) d0.M0(list);
        if ((exemption != null ? exemption.f90164a : null) == ExemptionReason.TIN_PENDING) {
            return ype.i.NOT_NOW;
        }
        if (list.isEmpty()) {
            return null;
        }
        return ype.i.CANT_PROVIDE;
    }

    public final void J2(f fVar, BackNavigationType backNavigationType) {
        h.u2(this, this.v, new TaxResidencyDeclarationFlowContract$Step.Exemption(fVar, backNavigationType), null, 6);
    }

    public final void K2(k kVar, ype.i iVar, String str) {
        TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = this.o;
        TinInputFormat tinInputFormat = taxResidencyDeclarationFlowContract$InputData.f90217b.d;
        if (tinInputFormat == null) {
            C2(new ppe.d(j6.a.q("Format must not be null for tin issuing country ", taxResidencyDeclarationFlowContract$InputData.f90216a.f297794a)));
            return;
        }
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        h.u2(this, this.v, new TaxResidencyDeclarationFlowContract$Step.TinInput(kVar, iVar, str, tinInputFormat), null, 6);
    }

    @Override // yki.j
    public final void M0() {
        TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = this.o;
        TaxResidencyDeclarationFlowContract$UseCase taxResidencyDeclarationFlowContract$UseCase = taxResidencyDeclarationFlowContract$InputData.d;
        boolean z = taxResidencyDeclarationFlowContract$UseCase instanceof TaxResidencyDeclarationFlowContract$UseCase.Add;
        UserSpecificRule userSpecificRule = this.u;
        if (z) {
            if (this.f90236t.f90154a && userSpecificRule.f90186a) {
                K2(k.DEFAULT, I2(), ((TaxResidencyDeclarationFlowContract$UseCase.Add) taxResidencyDeclarationFlowContract$InputData.d).f90226a);
                return;
            } else {
                L2(this, Boolean.TRUE, null, null, 6);
                return;
            }
        }
        if (taxResidencyDeclarationFlowContract$UseCase instanceof TaxResidencyDeclarationFlowContract$UseCase.Edit) {
            TaxResidencyDeclarationFlowContract$UseCase.Edit edit = (TaxResidencyDeclarationFlowContract$UseCase.Edit) taxResidencyDeclarationFlowContract$UseCase;
            K2(k.DEFAULT, edit.f90228b ? ype.i.DELETE : null, edit.f90227a);
        } else if (Intrinsics.f(taxResidencyDeclarationFlowContract$UseCase, TaxResidencyDeclarationFlowContract$UseCase.Remove.f90229a)) {
            M2(userSpecificRule.f, new ppe.g(this, 1));
        } else if (Intrinsics.f(taxResidencyDeclarationFlowContract$UseCase, TaxResidencyDeclarationFlowContract$UseCase.RequestMissingResidency.f90230a)) {
            J2(f.MISSING_RESIDENCY, taxResidencyDeclarationFlowContract$InputData.f90220h);
        } else {
            if (!Intrinsics.f(taxResidencyDeclarationFlowContract$UseCase, TaxResidencyDeclarationFlowContract$UseCase.RequestMissingTin.f90231a)) {
                throw new NoWhenBranchMatchedException();
            }
            K2(k.MISSING_TIN_REQUEST, I2(), null);
        }
    }

    public final void M2(Popup popup, Function0 function0) {
        if (popup == null) {
            function0.invoke();
            return;
        }
        AnalyticsProduct analyticsProduct = this.o.e;
        this.f90233q.getClass();
        Intrinsics.checkNotNullParameter(popup, "popup");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        TextClause textClause = new TextClause(popup.f90166a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlClause htmlClause = new HtmlClause(1, 28, (Integer) null, (Object) null, popup.f90167b);
        TextClause textClause2 = new TextClause(popup.f90168c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = popup.d;
        f2(lpe.d.a(textClause, htmlClause, textClause2, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, analyticsProduct), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new pj3.b(function0, this, 15));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
