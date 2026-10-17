package t73;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.common.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f268550x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f268549w = gVar;
        this.f268550x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u1(this.f268549w, this.f268550x, continuation, 0);
            case 1:
                return new u1(this.f268549w, this.f268550x, continuation, 1);
            case 2:
                return new u1(this.f268549w, this.f268550x, continuation, 2);
            case 3:
                return new u1(this.f268549w, this.f268550x, continuation, 3);
            case 4:
                return new u1(this.f268549w, this.f268550x, continuation, 4);
            default:
                return new u1(this.f268549w, this.f268550x, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268549w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ha3.x xVar = (ha3.x) gVar.B;
                    xVar.getClass();
                    String cardId = this.f268550x;
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    pfm.h hVarN = pd.b.n(skm.p0.f264003c, new ha3.s(xVar, cardId, continuation, 0));
                    this.v = 1;
                    if (nim.a.a(hVarN, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((rp0.k1) gVar.z).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ONE_CLICK_ACTIVATION_SUCCESS_TOAST", new TextLocalisedClause(R$string.card_screen_one_click_activation_success_toast, null, null, 14), null, null, null, 60));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String cardId2 = this.f268550x;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268549w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ha3.x xVar2 = (ha3.x) gVar2.B;
                    xVar2.getClass();
                    Intrinsics.checkNotNullParameter(cardId2, "cardId");
                    pfm.h hVarN2 = pd.b.n(skm.p0.f264003c, new ha3.s(xVar2, cardId2, null, 0));
                    this.v = 1;
                    if (nim.a.a(hVarN2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        Boolean bool = (Boolean) obj2;
                        Intrinsics.h(bool);
                        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.P2(gVar2, cardId2, bool.booleanValue(), o1.ACTIVATION);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                h93.f0 f0Var = (h93.f0) ((q0) ((vkm.j2) gVar2.f65434h0.f22677a).getValue()).d.f224257a;
                if (f0Var == null) {
                    return Unit.f186387a;
                }
                efm.d0 d0VarK2 = com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.K2(gVar2, f0Var);
                this.v = 2;
                obj2 = nim.a.b(d0VarK2, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                Boolean bool2 = (Boolean) obj2;
                Intrinsics.h(bool2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.P2(gVar2, cardId2, bool2.booleanValue(), o1.ACTIVATION);
                return Unit.f186387a;
            case 2:
                l93.f fVar = this.f268549w.B;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ha3.x xVar3 = (ha3.x) fVar;
                    xVar3.getClass();
                    String cardId3 = this.f268550x;
                    Intrinsics.checkNotNullParameter(cardId3, "cardId");
                    pfm.a aVarE = pd.b.n(skm.p0.f264003c, new ha3.s(xVar3, cardId3, null, 5)).e(((ha3.x) fVar).C());
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = this.f268549w;
                    u1 u1Var = new u1(gVar3, this.f268550x, null, 2);
                    this.v = 1;
                    if (gVar3.p2(this, u1Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.b bVarP = ((ha3.x) this.f268549w.B).p(this.f268550x);
                this.v = 1;
                Object objB = nim.a.b(bVarP, this);
                return objB == aVar5 ? aVar5 : objB;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar4 = this.f268549w;
                u1 u1Var2 = new u1(gVar4, this.f268550x, null, 4);
                this.v = 1;
                Object objP2 = gVar4.p2(this, u1Var2);
                return objP2 == aVar6 ? aVar6 : objP2;
        }
    }
}
