package q03;

import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.subscriptions.api.navigation.CardSubscriptionListConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import ip0.l00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevolutCardSettingsController f241062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevolutCardSettingsController revolutCardSettingsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241062w = revolutCardSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f241062w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f241062w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f241062w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((l00) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i93.i iVar;
        i93.l lVar;
        int i = this.u;
        Continuation continuation = null;
        int i2 = 3;
        RevolutCardSettingsController revolutCardSettingsController = this.f241062w;
        switch (i) {
            case 0:
                l00 clickData = (l00) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o0 o0VarD3 = revolutCardSettingsController.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) o0VarD3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                j60.a.v(bVar.f64909p, false, null, 3);
                if (Intrinsics.f(clickData.f165098a.f165287a, "AFFECTED_SUBSCRIPTIONS_LIST_ID")) {
                    bVar.C1(u0.b(new FeatureCommand(new CardSubscriptionListConfig(((i0) ((j2) bVar.E.f22677a).getValue()).f241080a, b9e.d.None))));
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o0 o0VarD32 = revolutCardSettingsController.R2();
                String id10 = aVar2.f275445a;
                Object obj3 = aVar2.d;
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar2 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) o0VarD32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if ((obj3 instanceof i93.i) && (lVar = (iVar = (i93.i) obj3).d) != null) {
                    bVar2.C2(new l0(((i0) ((j2) bVar2.E.f22677a).getValue()).f241080a, iVar.f159561a, lVar));
                }
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o0 o0VarD33 = revolutCardSettingsController.R2();
                Intrinsics.h(listId);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar3 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) o0VarD33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                j60.a.v(bVar3.f64909p, false, null, 3);
                switch (listId.hashCode()) {
                    case -1819104713:
                        if (listId.equals("CONFIRM_REPLACE_CARD_LIST_ID")) {
                            bVar3.n2(new k(i2, bVar3, continuation), new whi.b(6));
                        }
                        break;
                    case -658490872:
                        if (listId.equals("CARD_TERMINATION_NEGATIVE_BUTTON_ID")) {
                            bVar3.n2(new k(1, bVar3, continuation), new whi.b(6));
                        }
                        break;
                    case -378948190:
                        if (listId.equals("RESET_PIN_TRIES_POSITIVE_BUTTON_ID")) {
                            bVar3.n2(new m(bVar3, null), new whi.b(6));
                        }
                        break;
                    case 650382625:
                        if (listId.equals("ADD_TO_GOOGLE_WALLET_ID")) {
                            bVar3.C1(u0.c(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.AddToGooglePay(((i0) ((j2) bVar3.E.f22677a).getValue()).f241080a), 15)));
                        }
                        break;
                    case 1572533839:
                        if (listId.equals("TERMINATE_MCY_CARD_ACTION_ID")) {
                            bVar3.n2(new k(5, bVar3, continuation), new whi.b(6));
                        }
                        break;
                    case 1874793108:
                        if (listId.equals("LOCATION_SETTINGS_POSITIVE_BUTTON_ID")) {
                            bVar3.C1(u0.b(new IntentCommand(((s70.b) bVar3.f64913t).c(), null)));
                        }
                        break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
