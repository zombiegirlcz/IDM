package k50;

import android.os.Parcelable;
import aw0.k7;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.common.transition.MainElementRevealTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import com.revolut.shared.feature.suspicious_transaction.api.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b2 extends kotlin.jvm.internal.q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CreditCardSecurityDeposit creditCardSecurityDeposit;
        boolean z = true;
        char c2 = 1;
        Continuation continuation = null;
        int i = 0;
        switch (this.f) {
            case 0:
                Function1 function1 = (Function1) this.receiver;
                MessagesScreen.a aVar = MessagesScreen.Companion;
                function1.invoke(obj2);
                return Unit.f186387a;
            case 1:
                return com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a.I2((com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) this.receiver, (PopupMenuItem) obj2, (Continuation) obj3);
            case 2:
                String str = (String) obj2;
                kye.k3 k3Var = (kye.k3) ((kye.g0) this.receiver);
                eye.b bVar = k3Var.f190765q;
                cli.y yVar = k3Var.f190763d0;
                dj0.d dVarA = bVar.a(str, ((kye.m) ((vkm.j2) yVar.f22677a).getValue()).f190775b);
                vkm.j2 j2Var = (vkm.j2) yVar.f22677a;
                dj0.d dVar = ((kye.m) j2Var.getValue()).f;
                if (dVar == null) {
                    z = ((kye.m) j2Var.getValue()).v;
                } else if (dVarA.f115082a < 0 || dVarA.compareTo(dVar) >= 0) {
                    z = false;
                }
                k3Var.H2(yVar, new g48.h(dVarA, str, z, 29));
                return Unit.f186387a;
            case 3:
                Function1 function12 = (Function1) this.receiver;
                KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                function12.invoke(obj2);
                return Unit.f186387a;
            case 4:
                wrk.a params = (wrk.a) obj2;
                List content = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "p0");
                Intrinsics.checkNotNullParameter(content, "p1");
                xqk.a aVar2 = (xqk.a) this.receiver;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(content, "content");
                ne0.j jVar = aVar2.f308184a;
                String ref2 = params.f299623a;
                uqk.e period = params.f299624b;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(period, "period");
                jVar.f(ref2 + "|" + period.name(), content);
                return Unit.f186387a;
            case 5:
                wrk.b params2 = (wrk.b) obj2;
                List statements = (List) obj3;
                Intrinsics.checkNotNullParameter(params2, "p0");
                Intrinsics.checkNotNullParameter(statements, "p1");
                xqk.a aVar3 = (xqk.a) this.receiver;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(statements, "statements");
                ne0.j jVar2 = aVar3.f308184a;
                String ref3 = params2.f299625a;
                uqk.l statementType = params2.f299626b;
                uqk.e period2 = params2.f299627c;
                Intrinsics.checkNotNullParameter(ref3, "ref");
                Intrinsics.checkNotNullParameter(statementType, "statementType");
                Intrinsics.checkNotNullParameter(period2, "period");
                jVar2.f(com.google.android.gms.internal.mlkit_vision_face.a.p(ref3, "|", statementType.name(), "|", period2.name()), statements);
                return Unit.f186387a;
            case 6:
                return m50.k.f3((m50.k) this.receiver, (rd7.h) obj2, (Continuation) obj3);
            case 7:
                return m50.k.f3((m50.k) this.receiver, (rd7.h) obj2, (Continuation) obj3);
            case 8:
                String str2 = (String) obj2;
                mq4.x xVar = (mq4.x) ((mq4.i) this.receiver);
                cli.y yVar2 = xVar.f207882w;
                mq4.h hVar = (mq4.h) ((mq4.g) ((vkm.j2) yVar2.f22677a).getValue()).f207858b.getContent();
                if (hVar != null && (creditCardSecurityDeposit = hVar.f207860a) != null) {
                    xVar.H2(yVar2, new e1.e(str2, xVar.u.a(str2, creditCardSecurityDeposit.f68756c.f306286a), creditCardSecurityDeposit, xVar, 3));
                }
                return Unit.f186387a;
            case 9:
                String p0 = (String) obj2;
                dj0.d p17 = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar4 = (com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver;
                aVar4.getClass();
                MoneyClause moneyClause = new MoneyClause(p17, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
                yji.l.a1(aVar4, aVar4.X1(new nii.y0("ID_STATUS_DIALOG_CANCEL", new nii.z(p0.length() == 0 ? new TextLocalisedClause(R$string.outbound_transfer_confirmation_cancelled_title_no_receiver, zhm.u.c(moneyClause), null, 12) : new TextLocalisedClause(R$string.outbound_transfer_confirmation_cancelled_title, zhm.v.k(moneyClause, p0), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new nal.p(aVar4, continuation, i), 3);
                return Unit.f186387a;
            case 10:
                String p03 = (String) obj2;
                dj0.d p110 = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p110, "p1");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar5 = (com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver;
                aVar5.getClass();
                MoneyClause moneyClause2 = new MoneyClause(p110, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
                yji.l.a1(aVar5, aVar5.X1(new nii.y0("ID_STATUS_DIALOG_SUCCESS", new nii.j0((Clause) (p03.length() == 0 ? new TextLocalisedClause(R$string.outbound_transfer_confirmation_success_title_no_receiver, zhm.u.c(moneyClause2), null, 12) : new TextLocalisedClause(R$string.outbound_transfer_confirmation_success_title, zhm.v.k(moneyClause2, p03), null, 12)), (Clause) new TextLocalisedClause(R$string.outbound_transfer_confirmation_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (nii.u1) new nii.v1(new TextLocalisedClause(R$string.outbound_transfer_confirmation_success_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076), false, 4)), null, null, new nal.p(aVar5, continuation, c2 == true ? 1 : 0), 3);
                return Unit.f186387a;
            case 11:
                Function1 p010 = (Function1) obj2;
                Function2 p111 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(p111, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.receiver).n2(p111, p010);
            case 12:
                Function1 p011 = (Function1) obj2;
                Function2 p112 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p011, "p0");
                Intrinsics.checkNotNullParameter(p112, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.receiver).n2(p112, p011);
            case 13:
                teh.c p012 = (teh.c) obj2;
                teh.a p113 = (teh.a) obj3;
                Intrinsics.checkNotNullParameter(p012, "p0");
                Intrinsics.checkNotNullParameter(p113, "p1");
                neh.b.g((neh.b) this.receiver, p012, p113);
                return Unit.f186387a;
            case 14:
                com.google.protobuf.h3 p013 = (com.google.protobuf.h3) obj2;
                com.google.protobuf.h3 p114 = (com.google.protobuf.h3) obj3;
                Intrinsics.checkNotNullParameter(p013, "p0");
                Intrinsics.checkNotNullParameter(p114, "p1");
                ((no.z) this.receiver).getClass();
                return com.bumptech.glide.c.g(new nc1.j(p013, p114, 28));
            case 15:
                String str3 = (String) obj2;
                np4.o oVar = (np4.o) ((np4.f) this.receiver);
                oVar.H2(oVar.f218143r, new csl.a(str3, oVar.f218141p.a(str3, oVar.f218142q.f.f306286a), oVar, 13));
                return Unit.f186387a;
            case 16:
                Function1 p014 = (Function1) obj2;
                Function2 p115 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p014, "p0");
                Intrinsics.checkNotNullParameter(p115, "p1");
                return ((com.revolut.feature.wealth_discovery.impl.screener.screens.result.a) this.receiver).n2(p115, p014);
            case 17:
                return ((xt4.c) ((fm4.a) this.receiver)).b((List) obj2, (Continuation) obj3);
            case 18:
                Function1 p015 = (Function1) obj2;
                Function2 p116 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p015, "p0");
                Intrinsics.checkNotNullParameter(p116, "p1");
                return ((oph.m) this.receiver).n2(p116, p015);
            case 19:
                Function1 p016 = (Function1) obj2;
                Function2 p117 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p016, "p0");
                Intrinsics.checkNotNullParameter(p117, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.receiver).n2(p117, p016);
            case 20:
                String p017 = (String) obj2;
                String p118 = (String) obj3;
                Intrinsics.checkNotNullParameter(p017, "p0");
                Intrinsics.checkNotNullParameter(p118, "p1");
                ((pf9.e) this.receiver).o3(p017, p118);
                return Unit.f186387a;
            case 21:
                Function1 p018 = (Function1) obj2;
                Function2 p119 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p018, "p0");
                Intrinsics.checkNotNullParameter(p119, "p1");
                return ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.receiver).n2(p119, p018);
            case 22:
                Function1 p019 = (Function1) obj2;
                Function2 p120 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p019, "p0");
                Intrinsics.checkNotNullParameter(p120, "p1");
                return ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.receiver).n2(p120, p019);
            case 23:
                Function1 function13 = (Function1) this.receiver;
                CmsStoriesScreen.a aVar6 = CmsStoriesScreen.Companion;
                function13.invoke(obj2);
                return Unit.f186387a;
            case 24:
                return ((ProducerScope) this.receiver).send((Data) obj2, (Continuation) obj3);
            case 25:
                Function1 p020 = (Function1) obj2;
                Function2 p121 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p020, "p0");
                Intrinsics.checkNotNullParameter(p121, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a) this.receiver).n2(p121, p020);
            case 26:
                Function1 p021 = (Function1) obj2;
                Function2 p122 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p021, "p0");
                Intrinsics.checkNotNullParameter(p122, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a) this.receiver).n2(p122, p021);
            case 27:
                String str4 = (String) obj2;
                qu4.u uVar = (qu4.u) ((qu4.m) this.receiver);
                cli.y yVar3 = uVar.f249246t;
                if (!Intrinsics.f(((qu4.i) ((vkm.j2) yVar3.f22677a).getValue()).f249223a, str4)) {
                    ow4.a aVar7 = uVar.o;
                    CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = uVar.f249242p;
                    uVar.H2(yVar3, new qu4.o(new dj0.d(aVar7.a(str4, creditCardRepayPaymentAmountScreenContract$InputData.f69609b.f306286a), creditCardRepayPaymentAmountScreenContract$InputData.f69609b), str4));
                }
                return Unit.f186387a;
            case 28:
                Pair pair = (Pair) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.receiver;
                if (zBooleanValue) {
                    eVar.getClass();
                    eVar.l2(new com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.b(eVar, null), new yi5.b(26));
                } else {
                    oki.h.t2(eVar, eVar.A, new AirportLoungePassDetailsFlowContract$Step.PassDetails(pair), false, pair != null ? new MainElementRevealTransitionAnimation("ID_ITEM_PASS_CARD") : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                }
                return Unit.f186387a;
            default:
                Function1 p022 = (Function1) obj2;
                Function2 p123 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p022, "p0");
                Intrinsics.checkNotNullParameter(p123, "p1");
                return ((com.revolut.feature.retail.cfd.impl.screens.home.a) this.receiver).n2(p123, p022);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(no.z zVar) {
        super(2, 0, no.z.class, zVar, "mergeSendingErrors", "mergeSendingErrors(Lcom/google/protobuf/Struct;Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct;");
        this.f = 14;
    }
}
