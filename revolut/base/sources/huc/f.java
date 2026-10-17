package huc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.flow.m;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import com.revolut.kompot.common.ModalDestination;
import h93.f0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nwc.k;
import pwc.n;
import pwc.o;
import rp0.a1;
import yki.l;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f155613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f155614c;

    public /* synthetic */ f(m mVar, l lVar, int i) {
        this.f155612a = i;
        this.f155613b = mVar;
        this.f155614c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155612a) {
            case 0:
                k outputData = (k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof nwc.i;
                m mVar = this.f155613b;
                if (z) {
                    mVar.L2("question.what-is-wealth-protection");
                } else if (outputData instanceof nwc.j) {
                    mVar.L2("question.What-are-wealth-protection-limits");
                } else {
                    if (!(outputData instanceof nwc.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nwc.h hVar = (nwc.h) outputData;
                    oki.h.t2(mVar, this.f155614c, new SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount(hVar.f219823a, hVar.f219824b), true, null, false, 12);
                }
                return Unit.f186387a;
            case 1:
                bwc.g it8 = (bwc.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z3 = it8 instanceof bwc.e;
                m mVar2 = this.f155613b;
                if (z3) {
                    oki.h.t2(mVar2, this.f155614c, new SecurityHubFlowContract$Step.TransactionsLimitChange(((bwc.e) it8).f19311a, LimitType.OutboundLimit.f85503a), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(it8, bwc.f.f19312a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar2.L2("question.how-can-i-change-my-single-transaction-limit");
                }
                return Unit.f186387a;
            case 2:
                m mVar3 = this.f155613b;
                a aVar = mVar3.f85572r;
                jwc.j result = (jwc.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof jwc.h) {
                    TextLocalisedClause textLocalisedClause = ((jwc.h) result).f178959a;
                    aVar.getClass();
                    mVar3.X1(a.a(textLocalisedClause));
                } else if (Intrinsics.f(result, jwc.i.f178960a)) {
                    aVar.getClass();
                    mVar3.X1(new mii.k("LIMIT_CHANGE_DELETE_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_wealth_protection_security_limits_amount_dialog_removed, null, null, 14), null, null, null, 28));
                } else {
                    if (!(result instanceof jwc.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause message = ((jwc.g) result).f178958a;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    mVar3.X1(new mii.f("LIMIT_CHANGE_SUCCESS_SHOT_PENDING_DIALOG_ID", message, null, new ResourceImage(R$drawable.uikit_icn_24_time_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, a1.LONG, 44));
                }
                l lVar = this.f155614c;
                if (lVar.c()) {
                    mVar3.B2();
                } else {
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    lVar.n();
                }
                return Unit.f186387a;
            case 3:
                m mVar4 = this.f155613b;
                a aVar2 = mVar4.f85572r;
                o it9 = (o) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                boolean z4 = it9 instanceof pwc.i;
                l lVar2 = this.f155614c;
                if (z4) {
                    if (lVar2.c()) {
                        aVar2.getClass();
                        mVar4.X1(a.a(null));
                        mVar4.B2();
                    } else {
                        Intrinsics.checkNotNullParameter(lVar2, "<this>");
                        lVar2.n();
                    }
                } else if (it9 instanceof pwc.j) {
                    aVar2.getClass();
                    mVar4.X1(new mii.k("LIMIT_CHANGE_DELETE_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_wealth_protection_security_limits_amount_dialog_removed, null, null, 14), null, null, null, 28));
                    mVar4.B2();
                } else if (it9 instanceof pwc.l) {
                    mVar4.n2(new af3.f(mVar4, ((pwc.l) it9).f240410a, (Continuation) null, 19), new whi.b(6));
                } else if (it9 instanceof pwc.m) {
                    oki.h.t2(mVar4, lVar2, new SecurityHubFlowContract$Step.StreetMode(StreetModeFlowContract$Step.TrustedLocationsList.f85664a), true, null, false, 12);
                } else if (it9 instanceof n) {
                    oki.h.t2(mVar4, lVar2, new SecurityHubFlowContract$Step.StreetMode(StreetModeFlowContract$Step.TrustedWifisList.f85665a), true, null, false, 12);
                } else {
                    if (!(it9 instanceof pwc.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(mVar4, lVar2, new SecurityHubFlowContract$Step.StreetMode(new StreetModeFlowContract$Step.SetTrustedWifiLocation(((pwc.k) it9).f240409a)), true, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                cvc.c it10 = (cvc.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!Intrinsics.f(it10, cvc.c.f109327a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(this.f155613b, this.f155614c, SecurityHubFlowContract$Step.SecureAccount.f85539a, true, null, false, 12);
                return Unit.f186387a;
            case 5:
                vuc.j step = (vuc.j) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z6 = step instanceof vuc.i;
                m mVar5 = this.f155613b;
                l lVar3 = this.f155614c;
                if (z6) {
                    vuc.i iVar = (vuc.i) step;
                    oki.h.t2(mVar5, lVar3, new SecurityHubFlowContract$Step.LinkedWalletDetails(iVar.f292323a, iVar.f292324b, iVar.f292325c, iVar.d), true, null, false, 12);
                } else {
                    if (!(step instanceof vuc.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vuc.h hVar2 = (vuc.h) step;
                    f0 f0Var = hVar2.f292321a;
                    SecurityHubProductArticleKey securityHubProductArticleKey = hVar2.f292322b;
                    if (securityHubProductArticleKey != null) {
                        oki.h.t2(mVar5, lVar3, new SecurityHubFlowContract$Step.AddToClickToPayProductArticle(f0Var, securityHubProductArticleKey), true, null, false, 12);
                    } else {
                        oki.h.t2(mVar5, lVar3, new SecurityHubFlowContract$Step.AddToClickToPay(f0Var), true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 6:
                m mVar6 = this.f155613b;
                a aVar3 = mVar6.f85572r;
                tuc.j result2 = (tuc.j) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, tuc.g.f274576a)) {
                    aVar3.getClass();
                    mVar6.X1(new mii.k("LINKED_WALLETS_CARD_FROZEN_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_linked_wallets_toast_card_frozen, null, null, 14), null, null, null, 28));
                    mVar6.B2();
                } else if (result2 instanceof tuc.h) {
                    int i = com.revolut.feature.security_hub.impl.ui.flow.b.f85554b[((tuc.h) result2).f274577a.ordinal()];
                    if (i == 1) {
                        aVar3.getClass();
                        mVar6.X1(new mii.k("CARD_TERMINATED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_linked_wallets_toast_card_terminated, null, null, 14), null, null, null, 28));
                        mVar6.B2();
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar6.l2(new hp2.d(mVar6, this.f155614c, null, 12), new yi5.b(26));
                    }
                } else {
                    if (!Intrinsics.f(result2, tuc.i.f274578a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.getClass();
                    mVar6.X1(new mii.k("CARD_REMOVED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_card_connections_removal_success, null, null, 14), null, null, null, 28));
                    mVar6.B2();
                }
                return Unit.f186387a;
            default:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                int i2 = com.revolut.feature.security_hub.impl.ui.flow.b.f85555c[output.ordinal()];
                if (i2 == 1) {
                    this.f155613b.B2();
                } else if (i2 == 2) {
                    oki.h.w2(this.f155614c, SecurityHubFlowContract$Step.CallSecurityPermissionRequest.f85510a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(l lVar, m mVar) {
        this.f155612a = 3;
        this.f155614c = lVar;
        this.f155613b = mVar;
    }
}
