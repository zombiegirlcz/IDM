package ara;

import aw0.f4;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardOwnerMainInfoScreen f8598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CardOwnerMainInfoScreen cardOwnerMainInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f8598w = cardOwnerMainInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f8598w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f8598w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f8598w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            default:
                f fVar4 = new f(this.f8598w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((gra.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.f8598w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE3 = cardOwnerMainInfoScreen.d();
                Intrinsics.h(itemId);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar2 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) qVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("ID_NAVBAR_SHIELD_BUTTON")) {
                    oki.h.v2(aVar2.f81585x, CardOwnerMainInfoScreenContract$ModalStep.CardSchemeInfo.f81578a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    aVar2.v.y();
                }
                break;
            case 1:
                g6 g6Var = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE32 = cardOwnerMainInfoScreen.d();
                String selectedId = g6Var.f54199a;
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar4 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) qVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                bra.i iVar = aVar4.o;
                CardOwnerInfoState currentInfo = aVar4.I2();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                boolean zF = Intrinsics.f(selectedId, "TAB_MY_CARD");
                String str2 = "";
                if (zF) {
                    m70.a.c(t0.f186434a);
                    str = "";
                } else {
                    str = currentInfo.f81551c;
                }
                if (zF) {
                    m70.a.c(t0.f186434a);
                } else {
                    str2 = currentInfo.d;
                }
                aVar4.H2(aVar4.f81586y, new s(CardOwnerInfoState.a(currentInfo, zF, null, str, str2, null, 18), 0));
                break;
            case 2:
                f4 focusData = (f4) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE33 = cardOwnerMainInfoScreen.d();
                Intrinsics.h(focusData);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar6 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) qVarE33;
                rpi.j jVar = aVar6.v;
                n60.a aVar7 = aVar6.f81584w;
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                if (focusData.f10304b) {
                    if (Intrinsics.f(focusData.f10303a, "FIELD_CARD_NUMBER")) {
                        aVar7.R();
                        jVar.r(350L);
                    } else {
                        jVar.y();
                        aVar7.S(false);
                    }
                }
                break;
            default:
                gra.c data = (gra.c) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE34 = cardOwnerMainInfoScreen.d();
                Intrinsics.h(data);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar9 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) qVarE34;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                bra.e eVar = aVar9.f81579p;
                CardOwnerInfoState currentInfo2 = aVar9.I2();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(currentInfo2, "currentInfo");
                Intrinsics.checkNotNullParameter(data, "data");
                String str3 = data.f145958b;
                if (!Intrinsics.f(currentInfo2.f81550b, str3)) {
                    currentInfo2 = CardOwnerInfoState.a(currentInfo2, false, str3, null, null, fqa.a.MANUAL, 13);
                }
                aVar9.H2(aVar9.f81586y, new s(currentInfo2, 1));
                break;
        }
        return Unit.f186387a;
    }
}
