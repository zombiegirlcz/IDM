package ozc;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import aw0.db;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceResource;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.core.ui_kit_resources.R$raw;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe0.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f231338b;

    public /* synthetic */ u(g0 g0Var, int i) {
        this.f231337a = i;
        this.f231338b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v51, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        b bVar;
        Clause textClause;
        b bVar2;
        b bVar3;
        b bVar4;
        switch (this.f231337a) {
            case 0:
                rp0.y yVar = (rp0.y) obj2;
                opi.d dVar = this.f231338b.u;
                Intrinsics.h(yVar);
                ((opi.b) dVar).Z(yVar);
                return Unit.f186387a;
            case 1:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new pfm.h(new m1i.t(command, this.f231338b, 22), 1).D(command);
            case 2:
                g0 g0Var = this.f231338b;
                t tVar = (t) g0Var.f231270j;
                efm.k kVarFirstElement = ((s0) tVar.f231329b).D0().c(te0.s.f270018a).firstElement();
                p pVar = new p(3, new m(tVar, 22));
                kVarFirstElement.getClass();
                pfm.a aVar = new pfm.a(new rfm.f(kVarFirstElement, pVar, 2), new oy9.b(new m(tVar, 0), 21), 3);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                pfm.a aVarE = aVar.e(((qri.b) g0Var.k).l());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 3:
                f fVar = this.f231338b.k;
                kpi.a it8 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i2 = it8.f188247b;
                if (i2 == 10002) {
                    r0 r0Var = (r0) fVar;
                    r0Var.getClass();
                    rfm.o oVar = new rfm.o(new m0(r0Var, 0));
                    j0 j0Var = new j0(9, new n0(r0Var, 4));
                    dfm.c cVar = mfm.f.d;
                    pfm.a aVar2 = new pfm.a(new rfm.s(new rfm.y(oVar, cVar, j0Var, cVar, mfm.f.f205043c)), mfm.f.f205044g, 1);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorComplete(...)");
                    return aVar2;
                }
                if (i2 == 10004) {
                    r0 r0Var2 = (r0) fVar;
                    r0Var2.getClass();
                    return r0Var2.r(h.EVIDENCE_TYPES);
                }
                if (i2 != 10005) {
                    return pfm.m.f235744a;
                }
                r0 r0Var3 = (r0) fVar;
                r0Var3.getClass();
                return r0Var3.r(h.STATE);
            case 4:
                Intrinsics.checkNotNullParameter((k3l.j) obj2, "it");
                final r0 r0Var4 = (r0) this.f231338b.k;
                r0Var4.getClass();
                final int i3 = 0;
                pfm.h hVar = new pfm.h(new kfm.a() { // from class: ozc.o0
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                r0Var4.d(new FinishCommand(null, null, null, 7));
                                break;
                            default:
                                r0Var4.f248734a.onNext(zh9.u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true)));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                ((k) this.f231338b.f231272m).getClass();
                return new StatusViewConfiguration.Pending("STATUS_VIEW_ID", new TextLocalisedClause(R$string.sow_home_status_submission_review_title, null, null, 14), new TextLocalisedClause(R$string.sof_submission_success_subtitle, null, null, 14), null, null, null, false, 8184);
            case 6:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                k kVar = (k) this.f231338b.f231272m;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA = kVar.f231289c.a(error);
                v60.d dVarB = ((ao0.a) kVar.d).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                return new StatusViewConfiguration.Error("STATUS_VIEW_ID", ofm.q.O(dVarB), null, null, null, null, null, 8188);
            case 7:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                StatusViewConfiguration statusViewConfiguration = (StatusViewConfiguration) data.getContent();
                if (statusViewConfiguration != null) {
                    ((k3l.d) this.f231338b.f231276r).O(statusViewConfiguration);
                }
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((LargeActionButtonDelegate.Model) obj2, "it");
                opi.d.c(this.f231338b.u);
                return Unit.f186387a;
            case 9:
                g0 g0Var2 = this.f231338b;
                d dVar2 = g0Var2.f231270j;
                a aVar3 = g0Var2.f231272m;
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                h hVar3 = (h) hVar2.f288433a;
                od0.i iVar = (od0.i) hVar2.f288434b;
                od0.i iVar2 = (od0.i) hVar2.f288435c;
                od0.i iVar3 = (od0.i) hVar2.d;
                switch (w.f231340a[hVar3.ordinal()]) {
                    case 1:
                        gzc.x xVar = (gzc.x) iVar2.g();
                        ((k) aVar3).getClass();
                        int i5 = xVar == null ? -1 : j.f231284a[xVar.ordinal()];
                        int i6 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? R$string.sow_home_header_title_verify_income : R$string.sow_home_header_title_action_required : R$string.sow_home_header_title_approved : R$string.sow_home_header_title_under_review : R$string.sow_home_header_title_submitted;
                        i = xVar != null ? j.f231284a[xVar.ordinal()] : -1;
                        bVar = new b(new TextLocalisedClause(i6, null, null, 14), new TextLocalisedClause(i6, null, null, 14), new TextLocalisedClause(i != 1 ? i != 2 ? i != 3 ? i != 4 ? R$string.sow_home_header_caption_initial : R$string.sow_home_header_caption_update_requested : R$string.sow_home_header_caption_verified : R$string.sow_home_header_caption_under_review : R$string.sow_home_header_caption_submitted, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar;
                    case 2:
                        gzc.x xVar2 = (gzc.x) iVar2.g();
                        ((k) aVar3).getClass();
                        i = xVar2 != null ? j.f231284a[xVar2.ordinal()] : -1;
                        Integer numValueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : Integer.valueOf(R$string.sow_home_info_section_v2_action_required_active_text) : Integer.valueOf(R$string.sow_home_header_caption_verified) : Integer.valueOf(R$string.sow_home_info_section_v2_in_review_active_text) : Integer.valueOf(R$string.sow_home_info_section_v2_submitted_active_text);
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sow_review_income_source_header_under_review_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.sow_review_income_source_header_under_review_title, null, null, 14);
                        if (numValueOf != null) {
                            textClause = new TextLocalisedClause(numValueOf.intValue(), null, null, 14);
                        } else {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                        bVar = new b(textLocalisedClause, textLocalisedClause2, textClause, true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar;
                    case 3:
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.sof_periods_picker_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.sof_periods_picker_title, null, null, 14);
                        String str = (String) iVar.g();
                        return new b(textLocalisedClause3, textLocalisedClause4, new TextClause(str == null ? "" : str, (Style) new Custom(null, false, db.EMPHASIS2, false, null, Constants.TAG_FB_CHARGING_STATUS), Integer.valueOf(R$attr.uikit_colorBlack), false, (o9) null, (List) null, SyslogConstants.LOG_CLOCK), true, new TextLocalisedClause(R$string.sof_periods_picker_subtitle, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_back), 352);
                    case 4:
                        bVar2 = new b(new TextLocalisedClause(R$string.sow_info_header, null, null, 14), new TextLocalisedClause(R$string.sow_info_header, null, null, 14), new TextLocalisedClause(R$string.sow_info_header, null, null, 14), false, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar2;
                    case 5:
                        return new b(new TextLocalisedClause(R$string.sow_add_income_sources_header_title, null, null, 14), new TextLocalisedClause(R$string.sow_add_income_sources_header_title, null, null, 14), new TextLocalisedClause(R$string.sow_add_income_sources_header_subtitle, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    case 6:
                        return new b(new TextLocalisedClause(R$string.sow_note_title, null, null, 14), new TextLocalisedClause(R$string.sow_note_title, null, null, 14), new TextLocalisedClause(R$string.sow_note_description, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    case 7:
                        return new b(new TextLocalisedClause(R$string.document_selection_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_caption, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    case 8:
                        return new b(new TextLocalisedClause(R$string.sow_review_income_source_info_section_source_of_income, null, null, 14), new TextLocalisedClause(R$string.sow_review_income_source_info_section_source_of_income, null, null, 14), new TextLocalisedClause(R$string.sot_source_caption, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    case 9:
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.sow_review_income_source_info_section_amount, null, null, 14);
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.sow_review_income_source_info_section_amount, null, null, 14);
                        String str2 = (String) iVar.g();
                        bVar3 = new b(textLocalisedClause5, textLocalisedClause6, new TextClause(str2 == null ? "" : str2, (Style) new Custom(null, false, db.EMPHASIS2, false, null, Constants.TAG_FB_CHARGING_STATUS), Integer.valueOf(R$attr.uikit_colorBlack), false, (o9) null, (List) null, SyslogConstants.LOG_CLOCK), true, new TextLocalisedClause(R$string.sow_money_input_header_subtitle, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_back), 352);
                        return bVar3;
                    case 10:
                    case 11:
                        gzc.i iVarO3 = ((t) dVar2).o3();
                        String str3 = iVarO3.e;
                        if (str3 == null) {
                            str3 = iVarO3.f148004b;
                        }
                        String str4 = str3;
                        bVar4 = new b(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(iVarO3.f148005c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar4;
                    case 12:
                        gzc.i iVarA = ((h0d.j) ((od0.i) ((s0) ((t) dVar2).f231329b).J0().get()).c()).a();
                        bVar2 = new b(new TextClause(iVarA.f148004b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(iVarA.f148004b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(iVarA.f148005c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar2;
                    case 13:
                        bVar3 = new b(new TextLocalisedClause(R$string.sow_transfer_direction_title, null, null, 14), new TextLocalisedClause(R$string.sow_transfer_direction_title, null, null, 14), new TextLocalisedClause(R$string.sow_transfer_direction_subtitle, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar3;
                    case 14:
                        bVar4 = new b(new TextLocalisedClause(R$string.sow_review_income_source_header_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.sow_review_income_source_header_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.sow_review_income_source_header_confirmation_caption, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                        return bVar4;
                    case 15:
                        return new b(new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14), new TextLocalisedClause(R$string.document_selection_other_header_caption, null, null, 14), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    case 16:
                        f0d.d dVar3 = (f0d.d) iVar3.g();
                        gzc.r rVar = dVar3 != null ? dVar3.f131084a : null;
                        ((k) aVar3).getClass();
                        String str5 = rVar != null ? rVar.d : null;
                        TextClause textClause2 = new TextClause(str5 == null ? "" : str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str6 = rVar != null ? rVar.d : null;
                        TextClause textClause3 = new TextClause(str6 == null ? "" : str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str7 = rVar != null ? rVar.f148033c : null;
                        return new b(textClause2, textClause3, new TextClause(str7 == null ? "" : str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, Integer.valueOf(R$drawable.uikit_icn_24_back), 368);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 10:
                b bVar5 = (b) obj2;
                Intrinsics.h(bVar5);
                xpi.c cVar2 = (xpi.c) this.f231338b.f231273n;
                cVar2.n0(bVar5.f231259a);
                cVar2.p0(bVar5.f231260b);
                cVar2.Z(bVar5.d);
                cVar2.Y(bVar5.f231261c);
                Clause clause = bVar5.e;
                cVar2.l0(clause != null);
                cVar2.a0(null);
                cVar2.b0(null);
                cVar2.c0(tx0.j0.MULTILINE);
                if (clause != null) {
                    cVar2.f0(clause);
                }
                cVar2.e0(bVar5.f);
                cVar2.setVisible(true);
                return Unit.f186387a;
            case 11:
                f fVar2 = this.f231338b.k;
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (Intrinsics.f(it9, "MENU_HELP_ID")) {
                    r0 r0Var5 = (r0) fVar2;
                    r0Var5.getClass();
                    return r0Var5.r(h.HELP);
                }
                if (!Intrinsics.f(it9, "MENU_CHAT_ID")) {
                    throw new UnsupportedOperationException(j6.a.q("No click handler found for the menu item with id ", it9));
                }
                final r0 r0Var6 = (r0) fVar2;
                r0Var6.getClass();
                final int i21 = 1;
                pfm.h hVar4 = new pfm.h(new kfm.a() { // from class: ozc.o0
                    @Override // kfm.a
                    public final void run() {
                        switch (i21) {
                            case 0:
                                r0Var6.d(new FinishCommand(null, null, null, 7));
                                break;
                            default:
                                r0Var6.f248734a.onNext(zh9.u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true)));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            case 12:
                g0 g0Var3 = this.f231338b;
                xpi.g gVar = g0Var3.f231273n;
                if (((h) obj2) == h.STATE) {
                    IconNavBarMenuItem.Companion companion = IconNavBarMenuItem.INSTANCE;
                    IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(companion, "MENU_HELP_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
                    IconNavBarMenuItem iconNavBarMenuItemA2 = IconNavBarMenuItem.Companion.a(companion, "MENU_CHAT_ID", new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
                    if (!((Boolean) ((s0) ((t) g0Var3.f231270j).f231329b).Q0().get()).booleanValue()) {
                        iconNavBarMenuItemA2 = null;
                    }
                    IconNavBarMenuItem[] elements = {iconNavBarMenuItemA, iconNavBarMenuItemA2};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    ((xpi.c) gVar).d0(kotlin.collections.d.L(elements));
                } else {
                    ((xpi.c) gVar).d0(zhm.f0.f322471a);
                }
                return Unit.f186387a;
            case 13:
                NaviCommand naviCommand = (NaviCommand) obj2;
                g0 g0Var4 = this.f231338b;
                NavBarWithToolbar navBarWithToolbar = ((xpi.c) g0Var4.f231273n).f307974j;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("navBarWithToolbarView");
                    throw null;
                }
                navBarWithToolbar.setExpanded(true, true);
                sri.m mVar = g0Var4.f231271l;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                t tVar2 = (t) g0Var4.f231270j;
                gzc.n incomeSource = (gzc.n) tVar2.r3().f224257a;
                if ((tVar2.getStep() == h.EVIDENCE_LIST || tVar2.getStep() == h.BANK_STATEMENT_EVIDENCE_LIST) && incomeSource != null) {
                    gzc.i evidenceDocument = tVar2.o3();
                    Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
                    Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
                    efm.d0 d0VarFirstOrError = m70.a.h(zi0.c.u(tVar2.f.d(new kxc.c(kxc.a.SOW, incomeSource.f148015b, evidenceDocument.f148003a)), new n(11)), new nrd.i(g0Var4, 27), null, null, 6).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    ufm.n nVarI = o70.a.i(d0VarFirstOrError);
                    u uVar = new u(g0Var4, 0);
                    akl.s sVar = g0Var4.i;
                    ufm.i iVar4 = new ufm.i(nVarI, new nii.o0(5, new oma.n(new BreadcrumbException(), 21)), 2);
                    Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                    ofm.i iVar5 = new ofm.i(new lhi.b(17, uVar), new lhi.b(17, sVar), 0);
                    iVar4.q(iVar5);
                    Intrinsics.checkNotNullExpressionValue(iVar5, "subscribe(...)");
                    te0.w.j0(g0Var4.f239031a, iVar5);
                }
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((kpi.a) obj2, "it");
                return ((qri.b) this.f231338b.k).m();
            case 15:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                t tVar3 = (t) this.f231338b.f231270j;
                tVar3.getClass();
                pfm.h hVar5 = new pfm.h(new l(tVar3, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                return hVar5;
            case 16:
                g0 g0Var5 = this.f231338b;
                bqi.d dVar4 = g0Var5.f231275q;
                oe0.a progressStatus = (oe0.a) obj2;
                Intrinsics.checkNotNullParameter(progressStatus, "progressStatus");
                a aVar4 = g0Var5.f231272m;
                if (progressStatus instanceof oe0.c) {
                    k kVar2 = (k) aVar4;
                    bqi.d.H(dVar4, ((oe0.c) progressStatus).f224502a, ty0.c.a(kVar2.e, new TextLocalisedClause(R$string.sot_upload_dialog_in_progress, null, null, 14), kVar2.f231287a, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
                } else if (progressStatus instanceof a.C1250a) {
                    AlertDialog alertDialog = ((bqi.c) dVar4).f17842j;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                } else {
                    if (!(progressStatus instanceof oe0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k kVar3 = (k) aVar4;
                    ty0.c cVar3 = kVar3.e;
                    Context context = kVar3.f231287a;
                    String title = ty0.c.a(cVar3, new TextLocalisedClause(R$string.sot_upload_dialog_failed, null, null, 14), context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
                    String subtitle = ty0.c.a(kVar3.e, new TextLocalisedClause(R.string.error_generic, null, null, 14), context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
                    LottieImage image = new LottieImage(new SourceResource(R$raw.uikit_lottie_error), (List) null, 122);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    Intrinsics.checkNotNullParameter(image, "image");
                    bqi.d.w(dVar4, image, title, subtitle);
                }
                return Unit.f186387a;
            case 17:
                g0 g0Var6 = this.f231338b;
                d dVar5 = g0Var6.f231270j;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                h hVar6 = (h) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                int i22 = w.f231340a[hVar6.ordinal()];
                te0.s sVar2 = te0.s.f270018a;
                switch (i22) {
                    case 1:
                        return te0.w.h(new c(zBooleanValue, new TextLocalisedClause(R$string.sow_home_submit_button_title, null, null, 14), 2));
                    case 2:
                        return te0.w.h(new c(zBooleanValue, new TextLocalisedClause(R$string.sow_review_income_source_resubmit_button_title, null, null, 14), 2));
                    case 3:
                        return te0.w.h(new c(false, (TextLocalisedClause) null, 6));
                    case 4:
                        return te0.w.h(new c(true, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), 2));
                    case 5:
                        return te0.w.h(new c(((t) dVar5).r3().d(), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), 2));
                    case 6:
                        return ((s0) ((t) dVar5).f231329b).H0().c(sVar2).map(new p(13, new n(13)));
                    case 7:
                        return te0.w.h(new c(((t) dVar5).q3().d(), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), 2));
                    case 8:
                        return ((s0) ((t) dVar5).f231329b).B0().c(sVar2).map(new p(15, new n(14)));
                    case 9:
                        return te0.w.h(new c(true, new TextLocalisedClause(R$string.sow_money_input_done_button_title, null, null, 14), 2));
                    case 10:
                    case 11:
                        return ((t) dVar5).y3().map(new p(6, new n(10)));
                    case 12:
                        return te0.w.h(new c(zBooleanValue, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), 2));
                    case 13:
                        return te0.w.h(new c(((od0.i) ((s0) ((t) dVar5).f231329b).E0().get()).d(), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), 2));
                    case 14:
                        return te0.w.h(new c(true, new TextLocalisedClause(R$string.fincrime_action_confirm, null, null, 14), 2));
                    case 15:
                        efm.r map = ((s0) ((t) dVar5).f231329b).O0().c(sVar2).map(new oy9.b(new n(0), 27));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.map(new p(16, new n(15)));
                    case 16:
                        return ((t) dVar5).z3().map(new p(17, new u(g0Var6, 19)));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 18:
                c cVar4 = (c) obj2;
                Intrinsics.h(cVar4);
                ypi.i iVar6 = this.f231338b.o;
                iVar6.setVisible(cVar4.f231263a);
                iVar6.setEnabled(cVar4.f231264b);
                iVar6.f(cVar4.f231265c);
                return Unit.f186387a;
            default:
                od0.i question = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                a aVar5 = this.f231338b.f231272m;
                f0d.d dVar6 = (f0d.d) question.g();
                gzc.r rVar2 = dVar6 != null ? dVar6.f131084a : null;
                ((k) aVar5).getClass();
                return new c((rVar2 != null ? rVar2.f148031a : null) == gzc.d.TEXT, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), 2);
        }
    }
}
