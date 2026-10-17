package zz9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.api.navigation.ContactFlowConfiguration;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillFeatureConfig;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.ui_kit.payments.R$id;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mx0.b4;
import rp0.l0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PeerToPeerChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            case 3:
                return new g(this.v, continuation, 3);
            case 4:
                return new g(this.v, continuation, 4);
            case 5:
                return new g(this.v, continuation, 5);
            case 6:
                return new g(this.v, continuation, 6);
            case 7:
                return new g(this.v, continuation, 7);
            default:
                return new g(this.v, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        char c2 = 1;
        int i2 = 0;
        Continuation continuation = null;
        PeerToPeerChatScreen peerToPeerChatScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2();
                f0a.c cVar = dVar.f79785y;
                cli.y yVar = dVar.I;
                cVar.Z2(((q) ((j2) yVar.f22677a).getValue()).f326627c, ((q) ((j2) yVar.f22677a).getValue()).f326625a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                peerToPeerChatScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0a.i iVar = (e0a.i) ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2()).v;
                iVar.A2(u0.c(new ContactFlowFeatureConfig(new ContactFlowConfiguration(iVar.f121497l.f79768a, null))));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                ChatInputView chatInputView = peerToPeerChatScreen.e3().f11270p;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                chatInputView.setInput(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                x xVarF3 = peerToPeerChatScreen.R2();
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3).K2("");
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2()).L2(w.FOOTER);
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2();
                vz9.e eVar = ((q) ((j2) dVar2.I.f22677a).getValue()).f.f326616a;
                vz9.c cVar2 = eVar instanceof vz9.c ? (vz9.c) eVar : null;
                vz9.j jVar = cVar2 != null ? cVar2.e : null;
                if (Intrinsics.f(jVar, vz9.i.f293431a)) {
                    e0a.i iVar2 = (e0a.i) dVar2.v;
                    iVar2.A2(u0.c(new SplitBillFeatureConfig.ChooseBills(zhm.u.c(iVar2.f121497l.f79768a), x0a.a.CHAT)));
                } else if (Intrinsics.f(jVar, vz9.f.f293428a)) {
                    dVar2.J2(b4.REACTIONS_KEYBOARD);
                } else if (Intrinsics.f(jVar, vz9.g.f293429a)) {
                    l0.d(dVar2.F, new ViewIdTarget(R$id.chatScreen_firstSmallButton), zi0.c.d(zhm.v.k(new PopupMenuItem.Cell("POPUP_ITEM_GIF_LIST_ID", new TextLocalisedClause(R$string.payments_quick_actions_send_gif_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_20_keyboard_sticker, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, null, null, 1016), new PopupMenuItem.Cell("POPUP_ITEM_SPLIT_BILL_LIST_ID", new TextLocalisedClause(R$string.payments_quick_actions_split_bill_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, null, null, 1016))), null, 12);
                } else {
                    if (!Intrinsics.f(jVar, vz9.h.f293430a) && jVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eVar == null) {
                        str = "null";
                    } else if (eVar.equals(vz9.a.f293422b)) {
                        str = "Empty";
                    } else if (eVar.equals(vz9.b.f293423b)) {
                        str = "Initial";
                    } else if (eVar instanceof vz9.c) {
                        vz9.c cVar3 = (vz9.c) eVar;
                        str = "QuickActionsBarState(sendButtonVisible=" + cVar3.f293424b + ", sendButtonEnabled=" + cVar3.f293425c + ", requestButtonVisible=" + cVar3.d + ", firstSmallButtonState=" + cVar3.e + ")";
                    } else {
                        if (!(eVar instanceof vz9.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "SuggestionBarState(sendAmountButtonTextPresent=" + (((vz9.d) eVar).f293426b != null) + ")";
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unexpected moneyActionBarState=", str));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0a.i iVar3 = (e0a.i) ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2()).v;
                iVar3.getClass();
                iVar3.T2(new ds4.y(iVar3, null, 8), new yi5.b(27));
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar3 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2();
                dVar3.getClass();
                dVar3.l2(new h0(c2 == true ? 1 : 0, dVar3, continuation), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar4 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) peerToPeerChatScreen.R2();
                dVar4.getClass();
                dVar4.l2(new h0(i2, dVar4, continuation), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
