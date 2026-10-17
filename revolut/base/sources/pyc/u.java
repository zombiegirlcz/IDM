package pyc;

import androidx.appcompat.app.AlertDialog;
import aw0.k7;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceResource;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.core.ui_kit_resources.R$raw;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oe0.a;
import tof.a3;
import tof.v6;
import tx0.j0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f240804b;

    public /* synthetic */ u(c0 c0Var, int i) {
        this.f240803a = i;
        this.f240804b = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v56, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        TextLocalisedClause textLocalisedClause;
        CdnImage cdnImage;
        efm.b hVar;
        efm.b bVar;
        efm.r rVarD0;
        DocumentType documentType;
        switch (this.f240803a) {
            case 0:
                kpi.a it8 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f240804b.f240760n).m();
            case 1:
                b flowReviewState = (b) obj2;
                Intrinsics.checkNotNullParameter(flowReviewState, "flowReviewState");
                int i2 = w.f240805a[flowReviewState.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = R$string.transaction_verification_items_header_information_is_being_reviewed;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.transaction_verification_items_header_verification_completed;
                    }
                    textLocalisedClause = null;
                    cdnImage = null;
                } else {
                    boolean zR3 = ((t) this.f240804b.f240757j).r3();
                    int i3 = R$string.transaction_verification_items_header_verify_payments;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.flows_home_screen_description_initial_sot_active, null, null, 14);
                    if (zR3) {
                        textLocalisedClause2 = null;
                    }
                    CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30);
                    if (zR3) {
                        cdnImageC = null;
                    }
                    i = i3;
                    textLocalisedClause = textLocalisedClause2;
                    cdnImage = cdnImageC;
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i, null, null, 14);
                m70.a.c(t0.f186434a);
                return new d(textLocalisedClause3, textLocalisedClause4, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, textLocalisedClause, cdnImage, null, 192);
            case 2:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                n nVar = (n) this.f240804b.k;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                String strA = thf.m.a(nVar.f240790a, transaction, r0.g(), r0.g(), r0.g(), null, null, null, 240);
                return new d(new MoneyClause(transaction.k, new MoneyClause.Format.Headers(k71.k.h(transaction) ? k7.NEVER : k7.ALWAYS, null, null, false, false, 30), new Custom(Integer.valueOf((transaction.f != v6.PENDING || k71.k.l(transaction)) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50), k71.k.h(transaction), null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8), new TextClause(strA, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), new TextClause(strA, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), true, new TimeClause(transaction.f272593h.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), thf.d.a(nVar.f240791b, transaction, r0.g(), r0.g(), null, null, null, null, null, null, null, null, 2040), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark, Integer.valueOf(R$attr.uikit_colorOrange), R$attr.uikit_colorBackground, 2.0f, null, null, 48), 128);
            case 3:
                rp0.y yVar = (rp0.y) obj2;
                opi.d dVar = this.f240804b.f240763r;
                Intrinsics.h(yVar);
                ((opi.b) dVar).Z(yVar);
                return Unit.f186387a;
            case 4:
                c0 c0Var = this.f240804b;
                t70.g localization = c0Var.f240765t;
                bqi.d dVar2 = c0Var.f240761p;
                oe0.a state = (oe0.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof oe0.c) {
                    bqi.d.H(dVar2, ((oe0.c) state).f224502a, uc0.b.g(R$string.sot_upload_dialog_in_progress, localization));
                } else if (state instanceof oe0.b) {
                    LottieImage lottieImage = new LottieImage(new SourceResource(R$raw.uikit_lottie_error), (List) null, 122);
                    String strG = uc0.b.g(R$string.sot_upload_dialog_failed, localization);
                    Intrinsics.checkNotNullParameter(localization, "localization");
                    bqi.d.w(dVar2, lottieImage, strG, localization.getString(R.string.error_generic));
                } else {
                    if (!(state instanceof a.C1250a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AlertDialog alertDialog = ((bqi.c) dVar2).f17842j;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    ((g0) c0Var.f240760n).f240777g.D(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(R.string.common_action_complete, null, null, 14), null, null, SuccessType.Simple.f104398a, 1916));
                }
                return Unit.f186387a;
            case 5:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                g0 g0Var = (g0) this.f240804b.f240760n;
                g0Var.getClass();
                pfm.h hVar2 = new pfm.h(new oma.r(g0Var, 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 6:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                c0 c0Var2 = this.f240804b;
                f fVar = c0Var2.f240757j;
                j jVar = (j) ((t) fVar).getStep();
                int i5 = jVar == null ? -1 : w.f240806b[jVar.ordinal()];
                if (i5 == 7) {
                    hVar = new pfm.h(new oma.r(c0Var2, 11), 2);
                } else {
                    if (i5 != 10) {
                        bVar = pfm.m.f235744a;
                        pfm.a aVarE = bVar.e(new pfm.h(new nc0.a(c0Var2, 14), 1));
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    }
                    t tVar = (t) fVar;
                    efm.d0 d0VarC = te0.w.C(((h0) tVar.f240799b).F0());
                    pva.c cVar = new pva.c(24, new px0.a(29));
                    d0VarC.getClass();
                    hVar = new pfm.a(new rfm.j(d0VarC, cVar, 0), new pva.c(25, new o(tVar, 0)), 3);
                    Intrinsics.checkNotNullExpressionValue(hVar, "flatMapCompletable(...)");
                }
                bVar = hVar;
                pfm.a aVarE2 = bVar.e(new pfm.h(new nc0.a(c0Var2, 14), 1));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 7:
                return ((g0) this.f240804b.f240760n).l();
            case 8:
                c0 c0Var3 = this.f240804b;
                xpi.g gVar = c0Var3.f240758l;
                if (((j) obj2) == j.STATUS && ((t) c0Var3.f240757j).r3()) {
                    ((xpi.c) gVar).d0(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "NAV_BAR_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
                } else {
                    ((xpi.c) gVar).d0(zhm.f0.f322471a);
                }
                return Unit.f186387a;
            case 9:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                c0 c0Var4 = this.f240804b;
                NavBarWithToolbar navBarWithToolbar = ((xpi.c) c0Var4.f240758l).f307974j;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("navBarWithToolbarView");
                    throw null;
                }
                navBarWithToolbar.setExpanded(true, true);
                c0Var4.o.c(command);
                t tVar2 = (t) c0Var4.f240757j;
                IncomeSource incomeSource = tVar2.m3();
                if (tVar2.getStep() == j.EVIDENCE_LIST && incomeSource != null && tVar2.l3() == null) {
                    DocumentType documentType2 = tVar2.n3();
                    Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
                    Intrinsics.checkNotNullParameter(documentType2, "documentType");
                    efm.d0 d0VarFirstOrError = m70.a.h(zi0.c.u(tVar2.e.d(new kxc.c(kxc.a.SOT, incomeSource.f85873a, documentType2.f85859a)), new p(4)), new p40.n(c0Var4, 20), null, null, 6).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    ufm.n nVarI = o70.a.i(d0VarFirstOrError);
                    u uVar = new u(c0Var4, 3);
                    akl.s sVar = c0Var4.i;
                    ufm.i iVar = new ufm.i(nVarI, new o9h.d(11, new pjg.k(new BreadcrumbException(), 28)), 2);
                    Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                    ofm.i iVar2 = new ofm.i(new nw8.d(6, uVar), new nw8.d(6, sVar), 0);
                    iVar.q(iVar2);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
                    te0.w.j0(c0Var4.f239031a, iVar2);
                }
                return Unit.f186387a;
            case 10:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                opi.d.c(this.f240804b.f240763r);
                return Unit.f186387a;
            case 11:
                c0 c0Var5 = this.f240804b;
                c cVar2 = c0Var5.k;
                f fVar2 = c0Var5.f240757j;
                j it12 = (j) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                switch (w.f240806b[it12.ordinal()]) {
                    case 1:
                    case 2:
                        t0 t0Var = t0.f186434a;
                        m70.a.c(t0Var);
                        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        Intrinsics.checkNotNullParameter(t0Var, "<this>");
                        TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        Intrinsics.checkNotNullParameter(t0Var, "<this>");
                        return te0.w.h(new d(textClause, textClause2, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, 112));
                    case 3:
                        h0 h0Var = (h0) ((t) fVar2).f240799b;
                        return h0Var.f240783j.getValue(h0Var, h0.f240778q[8]).c(te0.s.f270018a).map(new r(4, new u(c0Var5, 1)));
                    case 4:
                        return te0.w.h(new d(new TextLocalisedClause(R$string.sot_source_title, null, null, 14), new TextLocalisedClause(R$string.sot_source_title, null, null, 14), new TextLocalisedClause(R$string.sot_source_caption, null, null, 14), true, null, null, null, 240));
                    case 5:
                        t tVar3 = (t) fVar2;
                        EvidenceDocument evidenceDocumentO3 = tVar3.o3();
                        if (evidenceDocumentO3 == null || (documentType = evidenceDocumentO3.f85866b) == null || (rVarD0 = te0.w.h(documentType)) == null) {
                            rVarD0 = te0.w.d0(((h0) tVar3.f240799b).E0());
                        }
                        efm.r map = rVarD0.map(new r(6, new pth.l(evidenceDocumentO3, 17)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    case 6:
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.sot_source_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.sot_source_title, null, null, 14);
                        m70.a.c(t0.f186434a);
                        return te0.w.h(new d(textLocalisedClause5, textLocalisedClause6, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, 240));
                    case 7:
                        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.sot_note_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.sot_note_title, null, null, 14);
                        m70.a.c(t0.f186434a);
                        return te0.w.h(new d(textLocalisedClause7, textLocalisedClause8, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, 240));
                    case 8:
                        return m70.a.g(((t) fVar2).s3(), null, new pyb.g(2), 1).map(new r(5, new u(c0Var5, 2)));
                    case 9:
                        ((n) cVar2).getClass();
                        return te0.w.h(new d(new TextLocalisedClause(R$string.document_selection_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_caption, null, null, 14), true, null, null, null, 240));
                    case 10:
                        ((n) cVar2).getClass();
                        return te0.w.h(new d(new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_other_header_caption, null, null, 14), true, null, null, null, 240));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 12:
                d dVar3 = (d) obj2;
                Intrinsics.h(dVar3);
                xpi.c cVar3 = (xpi.c) this.f240804b.f240758l;
                cVar3.n0(dVar3.f240766a);
                cVar3.p0(dVar3.f240767b);
                cVar3.c0(j0.MULTILINE);
                cVar3.Z(dVar3.d);
                cVar3.Y(dVar3.f240768c);
                Clause clause = dVar3.e;
                cVar3.l0(clause != null);
                if (clause != null) {
                    cVar3.f0(clause);
                }
                cVar3.a0(dVar3.f);
                cVar3.b0(dVar3.f240769g);
                cVar3.setVisible(dVar3.f240770h);
                return Unit.f186387a;
            case 13:
                f fVar3 = this.f240804b.f240757j;
                j it13 = (j) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                int i6 = w.f240806b[it13.ordinal()];
                if (i6 == 1) {
                    return te0.w.h(new e());
                }
                if (i6 == 10) {
                    return te0.w.h(new e(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), true));
                }
                switch (i6) {
                    case 4:
                        return te0.w.h(new e(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), ((t) fVar3).m3() != null));
                    case 5:
                        EvidenceDocument evidenceDocumentO32 = ((t) fVar3).o3();
                        return te0.w.h(new e(new TextLocalisedClause(evidenceDocumentO32 == null ? com.revolut.retail.common.ui.R$string.common_action_confirm : R$string.sow_review_income_source_resubmit_button_title, null, null, 14), evidenceDocumentO32 != null ? evidenceDocumentO32.f85868g : true));
                    case 6:
                        return te0.w.h(new e(new TextLocalisedClause(R$string.sot_description_add_description, null, null, 14), true));
                    case 7:
                        return te0.w.h(new e(new TextLocalisedClause(R$string.sot_note_add_note, null, null, 14), true));
                    case 8:
                        return te0.w.h(new e(new TextLocalisedClause(R$string.sow_home_submit_button_title, null, null, 14), ((t) fVar3).l3() == null));
                    default:
                        return te0.w.h(new e());
                }
            case 14:
                e eVar = (e) obj2;
                Intrinsics.h(eVar);
                ypi.i iVar3 = this.f240804b.f240759m;
                iVar3.setVisible(eVar.f240773a);
                iVar3.f(eVar.f240774b);
                return Unit.f186387a;
            case 15:
                f fVar4 = this.f240804b.f240757j;
                j it14 = (j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                int i21 = w.f240806b[it14.ordinal()];
                if (i21 != 5) {
                    te0.s sVar2 = te0.s.f270018a;
                    if (i21 == 6) {
                        return ((h0) ((t) fVar4).f240799b).y0().c(sVar2).map(new r(12, new p(6)));
                    }
                    if (i21 == 7) {
                        return ((h0) ((t) fVar4).f240799b).A0().c(sVar2).map(new r(13, new p(7)));
                    }
                    if (i21 != 8) {
                        if (i21 != 10) {
                            return te0.w.h(Boolean.TRUE);
                        }
                        efm.r map2 = ((h0) ((t) fVar4).f240799b).H0().c(sVar2).map(new r(1, new p(2)));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        return map2.map(new r(14, new p(8)));
                    }
                }
                return ((t) fVar4).t3().map(new r(11, new p(5)));
            default:
                Boolean bool = (Boolean) obj2;
                ypi.i iVar4 = this.f240804b.f240759m;
                Intrinsics.h(bool);
                iVar4.setEnabled(bool.booleanValue());
                return Unit.f186387a;
        }
    }
}
