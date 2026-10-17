package zz9;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.social.impl.R$string;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import com.revolut.retail.feature.plan_gifting.api.navigation.PlanGiftingConfig;
import com.revolut.retail.feature.plan_referrals.api.navigation.PlanReferralsDestination$Claim;
import cu9.b;
import dce.s0;
import grl.k9;
import ip0.um0;
import java.time.Period;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.b4;
import mx0.e4;
import rp0.d2;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerChatScreen f326608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f326608w = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f326608w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f326608w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f326608w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f326608w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f(this.f326608w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            case 5:
                f fVar6 = new f(this.f326608w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
            case 6:
                f fVar7 = new f(this.f326608w, continuation, 6);
                fVar7.v = obj2;
                return fVar7;
            case 7:
                f fVar8 = new f(this.f326608w, continuation, 7);
                fVar8.v = obj2;
                return fVar8;
            case 8:
                f fVar9 = new f(this.f326608w, continuation, 8);
                fVar9.v = obj2;
                return fVar9;
            case 9:
                f fVar10 = new f(this.f326608w, continuation, 9);
                fVar10.v = obj2;
                return fVar10;
            case 10:
                f fVar11 = new f(this.f326608w, continuation, 10);
                fVar11.v = obj2;
                return fVar11;
            case 11:
                f fVar12 = new f(this.f326608w, continuation, 11);
                fVar12.v = obj2;
                return fVar12;
            case 12:
                f fVar13 = new f(this.f326608w, continuation, 12);
                fVar13.v = obj2;
                return fVar13;
            default:
                f fVar14 = new f(this.f326608w, continuation, 13);
                fVar14.v = obj2;
                return fVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((e4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((b4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((h9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((P2PChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((P2PChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((cu9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((P2PChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        char c2;
        char c3;
        Custom custom;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        PeerToPeerChatScreen peerToPeerChatScreen = this.f326608w;
        switch (i) {
            case 0:
                e4 inputState = (e4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF3 = peerToPeerChatScreen.R2();
                Intrinsics.h(inputState);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(inputState, "inputState");
                dVar.H2(dVar.I, new zrd.q(inputState, 23));
                return Unit.f186387a;
            case 1:
                b4 b4Var = (b4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF32 = peerToPeerChatScreen.R2();
                Intrinsics.h(b4Var);
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF32).J2(b4Var);
                return Unit.f186387a;
            case 2:
                h9i.c reaction = (h9i.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF33 = peerToPeerChatScreen.R2();
                Intrinsics.h(reaction);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF33;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                e0a.b0 b0Var = dVar2.f79781s;
                zm3.a contact = ((q) ((j2) dVar2.I.f22677a).getValue()).f326625a;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                Intrinsics.checkNotNullParameter(contact, "contact");
                b0Var.T2(new e0a.y(reaction, b0Var, contact, null), new yi5.b(27));
                return Unit.f186387a;
            case 3:
                P2PChatItem p2pChatItem = (P2PChatItem) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF34 = peerToPeerChatScreen.R2();
                Intrinsics.h(p2pChatItem);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar3 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF34;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(p2pChatItem, "p2pChatItem");
                e0a.w wVar = (e0a.w) dVar3.f79783w;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(p2pChatItem, "p2pChatItem");
                wVar.V2(new dz6.o(wVar, p2pChatItem, null, 9), new yi5.b(29));
                return Unit.f186387a;
            case 4:
                P2PChatItem p2pChatItem2 = (P2PChatItem) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF35 = peerToPeerChatScreen.R2();
                Intrinsics.h(p2pChatItem2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar4 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF35;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(p2pChatItem2, "p2pChatItem");
                e0a.r rVar = dVar4.f79783w;
                zm3.a contact2 = ((q) ((j2) dVar4.I.f22677a).getValue()).f326625a;
                e0a.w wVar2 = (e0a.w) rVar;
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(p2pChatItem2, "p2pChatItem");
                Intrinsics.checkNotNullParameter(contact2, "contact");
                if (c8g.a.C(p2pChatItem2)) {
                    wVar2.T2(new s0(wVar2, (zm3.l) contact2, p2pChatItem2, null, 24), new yi5.b(27));
                }
                return Unit.f186387a;
            case 5:
                v longClickData = (v) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF36 = peerToPeerChatScreen.R2();
                Intrinsics.h(longClickData);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar5 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF36;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(longClickData, "longClickData");
                e0a.r rVar2 = dVar5.f79783w;
                zm3.a contact3 = ((q) ((j2) dVar5.I.f22677a).getValue()).f326625a;
                e0a.w wVar3 = (e0a.w) rVar2;
                wVar3.getClass();
                Intrinsics.checkNotNullParameter(longClickData, "longClickData");
                Intrinsics.checkNotNullParameter(contact3, "contact");
                P2PChatItem p2PChatItem = longClickData.f326634b;
                if (c8g.a.C(p2PChatItem)) {
                    wVar3.T2(new s0(wVar3, longClickData, (zm3.l) contact3, null, 25), new yi5.b(27));
                } else if (p2PChatItem instanceof MessageItem) {
                    List listA = ((ju9.a) wVar3.f121528l).a((MessageItem) p2PChatItem);
                    if (!listA.isEmpty()) {
                        wVar3.f121529m.x(new rp0.y(listA, null, null, null, null, null, 1022));
                    }
                }
                return Unit.f186387a;
            case 6:
                cu9.b messageButton = (cu9.b) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF37 = peerToPeerChatScreen.R2();
                Intrinsics.h(messageButton);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar6 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF37;
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(messageButton, "messageButton");
                e0a.m mVar = dVar6.f79784x;
                zm3.a contact4 = ((q) ((j2) dVar6.I.f22677a).getValue()).f326625a;
                e0a.q qVar = (e0a.q) mVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(messageButton, "messageButton");
                Intrinsics.checkNotNullParameter(contact4, "contact");
                if (messageButton instanceof cu9.d) {
                    cu9.d dVar7 = (cu9.d) messageButton;
                    ((g6k.r) qVar.f121515l).c3(vz9.q.a(dVar7.f108918b), dVar7.f108917a);
                } else if (messageButton instanceof cu9.g) {
                    cu9.g paidPlanGift = (cu9.g) messageButton;
                    g0a.g gVar = (g0a.g) qVar.f121518p;
                    g0a.h hVar = gVar.f139391l;
                    j60.a aVar8 = gVar.o;
                    Intrinsics.checkNotNullParameter(paidPlanGift, "paidPlanGift");
                    Intrinsics.checkNotNullParameter(contact4, "contact");
                    cu9.f fVar = paidPlanGift.f108920a;
                    com.revolut.feature.payments.messaging.data.api.model.b planTier = paidPlanGift.f108922c;
                    MessageItem messageItem = paidPlanGift.d;
                    String giftId = paidPlanGift.f108921b;
                    int i2 = g0a.b.f139379a[fVar.ordinal()];
                    if (i2 == 1) {
                        gVar.A2(new PlanGiftingConfig.ReceiverDestination(giftId, PlanGiftingClaimingExitRule.LeaveFlow.f102433a, kbk.k.CLAIM_ONLY));
                    } else if (i2 == 2) {
                        String contactName = hx7.q.H(contact4);
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(contactName, "contactName");
                        Intrinsics.checkNotNullParameter(planTier, "planTier");
                        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
                        Intrinsics.checkNotNullParameter(giftId, "giftId");
                        aVar8.x(rp0.d0.b(new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_decline_title, zhm.u.c(contactName), null, 12), new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_decline_description, zhm.u.c(g0a.h.a(planTier)), null, 12), new d2("GIFT_ACTION_PRIMARY_BUTTON_ID", new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_decline_action_negative, null, null, 14), null, 60), new d2("GIFT_ACTION_SECONDARY_BUTTON_ID", new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_decline_action_positive, null, null, 14), null, 60), new g0a.j(messageItem, giftId, contactName, g0a.i.REJECT), 112));
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String contactName2 = hx7.q.v(contact4);
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(contactName2, "contactName");
                        Intrinsics.checkNotNullParameter(planTier, "planTier");
                        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
                        Intrinsics.checkNotNullParameter(giftId, "giftId");
                        aVar8.x(rp0.d0.b(new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_cancel_title, zhm.v.k(g0a.h.a(planTier), contactName2), null, 12), new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_cancel_description, zhm.u.c(g0a.h.a(planTier)), null, 12), new d2("GIFT_ACTION_PRIMARY_BUTTON_ID", new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_cancel_action_negative, null, null, 14), null, 60), new d2("GIFT_ACTION_SECONDARY_BUTTON_ID", new TextLocalisedClause(R$string.payments_chat_bottom_sheet_gift_cancel_action_positive, null, null, 14), null, 60), new g0a.j(messageItem, giftId, contactName2, g0a.i.CANCEL), 112));
                    }
                } else if (messageButton instanceof cu9.i) {
                    cu9.i planReferral = (cu9.i) messageButton;
                    h0a.e eVar = (h0a.e) qVar.f121519q;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(planReferral, "planReferral");
                    Intrinsics.checkNotNullParameter(contact4, "contact");
                    int i3 = h0a.d.f148338a[planReferral.f108924b.ordinal()];
                    if (i3 == 1) {
                        eVar.A2(new PlanReferralsDestination$Claim(planReferral.f108923a));
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MessageType messageType = planReferral.f108925c.f79535h;
                        MessageType.PlanReferral referral = messageType instanceof MessageType.PlanReferral ? (MessageType.PlanReferral) messageType : null;
                        if (referral != null) {
                            h0a.b bVar = eVar.f148339l;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(referral, "referral");
                            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.premium_plan_referral_cancellation_sheet_title, null, null, 14);
                            int i5 = R$string.premium_plan_referral_cancellation_sheet_subtitle;
                            if (com.revolut.feature.payments.messaging.data.api.model.d.a(referral)) {
                                textLocalisedClause = new TextLocalisedClause(R$string.premium_plan_referral_cancellation_sheet_discount_free, null, null, 14);
                                c3 = 1;
                                c2 = 2;
                                custom = null;
                            } else {
                                c2 = 2;
                                c3 = 1;
                                custom = null;
                                textLocalisedClause = new TextLocalisedClause(R$string.premium_plan_referral_cancellation_sheet_discount_percentage, zhm.u.c(new PercentageClause(referral.f * ((double) 100), (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
                            }
                            Clause clauseC = bVar.f148337a.c(referral.d, custom);
                            Period period = referral.e;
                            PeriodClause periodClause = new PeriodClause(new PeriodClause.PeriodComponents(period.getYears(), period.getMonths(), period.getDays(), 0, 0, 0, 56), null);
                            Clause[] clauseArr = new Clause[3];
                            clauseArr[0] = textLocalisedClause;
                            clauseArr[c3] = clauseC;
                            clauseArr[c2] = periodClause;
                            lw0.a aVar9 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i5, zhm.v.k(clauseArr), null, 12), null, null, false, 28);
                            m6 m6Var = n6.Companion;
                            aw0.g gVar2 = new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.premium_plan_referral_cancellation_sheet_go_back_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.premium_plan_referral_cancellation_sheet_cancel_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                            k9 k9Var = k9.Payments;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            eVar.N2(new ActionsBottomSheetController(new dii.a(aVar9, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), bottom_dialog, new g31.e(eVar, 15, referral, planReferral));
                        }
                    }
                } else if (messageButton instanceof cu9.k) {
                    cu9.k kVar = (cu9.k) messageButton;
                    if (e0a.n.f121512a[kVar.f108927b.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.A2(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P(kVar.f108926a), null, null, null, 126)));
                } else if (messageButton instanceof cu9.e) {
                    qVar.T2(new dz6.o(qVar, messageButton, null, 6), new yi5.b(27));
                } else {
                    Continuation continuation = null;
                    if (messageButton instanceof cu9.m) {
                        qVar.T2(new dz6.o(qVar, (cu9.m) messageButton, continuation, 5), new yi5.b(27));
                    } else if (!messageButton.equals(b.a.f108916a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 7:
                P2PChatItem chatItem = (P2PChatItem) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF38 = peerToPeerChatScreen.R2();
                Intrinsics.h(chatItem);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar8 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF38;
                dVar8.getClass();
                Intrinsics.checkNotNullParameter(chatItem, "chatItem");
                dVar8.l2(new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.b(dVar8, chatItem, null), new yi5.b(26));
                return Unit.f186387a;
            case 8:
                String messageId = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gu9.a aVar12 = peerToPeerChatScreen.i0;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                aVar12.f146897b = messageId;
                return Unit.f186387a;
            case 9:
                um0 um0Var = (um0) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF39 = peerToPeerChatScreen.R2();
                String str = um0Var.f166697c.f;
                if (str == null) {
                    str = um0Var.f166695a;
                }
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF39).I2(um0Var.d, str);
                return Unit.f186387a;
            case 10:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF310 = peerToPeerChatScreen.R2();
                String str2 = um0Var2.f166696b.f;
                if (str2 == null) {
                    str2 = um0Var2.f166695a;
                }
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF310).I2(um0Var2.d, str2);
                return Unit.f186387a;
            case 11:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF311 = peerToPeerChatScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar9 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF311;
                dVar9.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "UNBLOCK_CLAUSE_LIST_ID")) {
                    zm3.a aVar16 = ((q) ((j2) dVar9.I.f22677a).getValue()).f326625a;
                    zm3.l lVar = aVar16 instanceof zm3.l ? (zm3.l) aVar16 : null;
                    if (lVar != null) {
                        oki.h.v2(dVar9.J, new PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.UnblockUser(lVar), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            case 12:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF312 = peerToPeerChatScreen.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar10 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF312;
                dVar10.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                dVar10.E.Z2(clickData2);
                return Unit.f186387a;
            default:
                String str3 = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarF313 = peerToPeerChatScreen.R2();
                Intrinsics.h(str3);
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF313).K2(str3);
                return Unit.f186387a;
        }
    }
}
