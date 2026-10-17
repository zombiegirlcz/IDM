package z8k;

import aw0.f4;
import aw0.k3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerAmountScreen f320193w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PeerToPeerAmountScreen peerToPeerAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320193w = peerToPeerAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f320193w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f320193w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f320193w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(this.f320193w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l(this.f320193w, continuation, 4);
                lVar5.v = obj2;
                return lVar5;
            case 5:
                l lVar6 = new l(this.f320193w, continuation, 5);
                lVar6.v = obj2;
                return lVar6;
            default:
                l lVar7 = new l(this.f320193w, continuation, 6);
                lVar7.v = obj2;
                return lVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((e2a.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((k3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((h9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320193w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarJ3 = peerToPeerAmountScreen.T2();
                Intrinsics.h(id10);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_FOOTER_FEE_DISCLAIMER")) {
                    bVar.E.Q();
                    j60.a aVar2 = bVar.D;
                    bVar.v.getClass();
                    aVar2.x(new rp0.y(zhm.f0.f322471a, new rp0.t(new TextLocalisedClause(R$string.payments_non_revolut_transfer_fee_warning_title, null, null, 14), new TextLocalisedClause(R$string.payments_non_revolut_transfer_fee_warning_description, null, null, 14), null, 28), null, null, null, null, 1020));
                }
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarJ32 = peerToPeerAmountScreen.T2();
                String amount = charSequence.toString();
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                bVar2.H2(new j0(bVar2, amount, 0));
                break;
            case 2:
                yof.b payload = (yof.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarJ33 = peerToPeerAmountScreen.T2();
                Intrinsics.h(payload);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar3 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                bVar3.l2(new yv1.k(bVar3, payload, null, 22), new yi5.b(26));
                break;
            case 3:
                f4 focusData = (f4) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarJ34 = peerToPeerAmountScreen.T2();
                Intrinsics.h(focusData);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar4 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ34;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                bVar4.J.b(focusData);
                break;
            case 4:
                e2a.b bVar5 = (e2a.b) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PeerToPeerAmountScreen.Companion aVar7 = PeerToPeerAmountScreen.INSTANCE;
                byl.h hVar = (byl.h) peerToPeerAmountScreen.X.getValue();
                UrlImage leftImage = bVar5.f122044a;
                UrlImage centerImage = bVar5.f122045b;
                UrlImage rightImage = bVar5.f122046c;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(leftImage, "leftImage");
                Intrinsics.checkNotNullParameter(centerImage, "centerImage");
                Intrinsics.checkNotNullParameter(rightImage, "rightImage");
                hVar.f19868b.postDelayed(new byl.g(hVar, leftImage, centerImage, rightImage, 0), 600L);
                break;
            case 5:
                k3 k3Var = (k3) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PeerToPeerAmountScreen.Companion aVar9 = PeerToPeerAmountScreen.INSTANCE;
                peerToPeerAmountScreen.i3().i.setLoadingStrategy(k3Var);
                break;
            default:
                h9i.c item = (h9i.c) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarJ35 = peerToPeerAmountScreen.T2();
                Intrinsics.h(item);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar6 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ35;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                bVar6.H2(new fr8.p(item, 2));
                break;
        }
        return Unit.f186387a;
    }
}
