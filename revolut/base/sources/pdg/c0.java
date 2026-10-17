package pdg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m1c.f1;
import m1c.u1;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f235179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HotelsProperty f235180x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(i0 i0Var, HotelsProperty hotelsProperty, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235179w = i0Var;
        this.f235180x = hotelsProperty;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f235179w, this.f235180x, continuation, 0);
            case 1:
                return new c0(this.f235179w, this.f235180x, continuation, 1);
            case 2:
                return new c0(this.f235179w, this.f235180x, continuation, 2);
            case 3:
                return new c0(this.f235179w, this.f235180x, continuation, 3);
            case 4:
                return new c0(this.f235179w, this.f235180x, continuation, 4);
            default:
                return new c0(this.f235179w, this.f235180x, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarJust;
        Long lA;
        rp0.y yVarA;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i0 i0Var = this.f235179w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = i0Var.f235196x.b(this.f235180x.f97981a);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                i0Var.X1(new mii.k("DIALOG_ITEM_ID", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_removed_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                i0 i0Var2 = this.f235179w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarA = i0Var2.f235196x.a(this.f235180x.f97981a);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                i0Var2.X1(new mii.k("DIALOG_ITEM_ID", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_added_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    i0 i0Var3 = this.f235179w;
                    ol8.e eVar = new ol8.e(i0Var3, this.f235180x, null, 19);
                    this.v = 1;
                    if (i0.K2(i0Var3, eVar, this) == aVar3) {
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
                    i0 i0Var4 = this.f235179w;
                    oqk.h hVar = new oqk.h(i0Var4, this.f235180x, (Continuation) null, 5);
                    this.v = 1;
                    if (i0.K2(i0Var4, hVar, this) == aVar4) {
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
                i0 i0Var5 = this.f235179w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    if (((i9g.v) i0Var5.v).b()) {
                        rVarJust = i0Var5.f235195w.a(f1.STAYS, w4l.h.f294642c);
                    } else {
                        rVarJust = efm.r.just(new Data(null, null, false, 6, null));
                        Intrinsics.h(rVarJust);
                    }
                    efm.d0 d0VarFirstOrError = m70.a.h(zi0.c.J(rVarJust), new p2b.a(7), new pch.f(3), null, 4).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                od0.i iVar = (od0.i) obj2;
                HotelsProperty hotelsProperty = this.f235180x;
                TravelHotelsPromotion promotion = hotelsProperty.B;
                if (promotion != null && (lA = rag.b.a(hotelsProperty)) != null) {
                    long jLongValue = lA.longValue();
                    xcg.b bVar = i0Var5.u;
                    u1 u1Var = (u1) iVar.g();
                    xcg.d dVar = (xcg.d) bVar;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(promotion, "promotion");
                    TextLocalisedClause textLocalisedClauseB = dVar.b(promotion, R$string.hotels_package_rates_property_details_title, jLongValue);
                    if (textLocalisedClauseB != null) {
                        yVarA = xcg.d.a(promotion, textLocalisedClauseB, new TextLocalisedClause(R$string.hotels_package_rates_property_details_book_stay_title, zhm.u.c(jLongValue + "%"), null, 12), u1Var);
                    } else {
                        yVarA = null;
                    }
                    if (yVarA != null) {
                        i0Var5.z.x(yVarA);
                        return Unit.f186387a;
                    }
                }
                return null;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    i0 i0Var6 = this.f235179w;
                    if (!i0Var6.D && ((m) ((j2) i0Var6.E.f22677a).getValue()).k) {
                        i0Var6.D = true;
                        p8g.b bVar2 = i0Var6.f235194t;
                        String propertyId = this.f235180x.f97981a;
                        i9g.t tVar = (i9g.t) bVar2;
                        tVar.getClass();
                        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                        efm.d0 d0VarFirstOrError2 = te0.w.l(tVar.f159838a.h(), tVar.f159840c.a()).firstOrError();
                        i52.j jVar = new i52.j(25, new i9g.r(tVar, propertyId, 1));
                        d0VarFirstOrError2.getClass();
                        pfm.a aVar7 = new pfm.a(d0VarFirstOrError2, jVar, 4);
                        Intrinsics.checkNotNullExpressionValue(aVar7, "flatMapCompletable(...)");
                        pfm.a aVarV = ue0.e.v(ue0.e.v(aVar7));
                        this.v = 1;
                        if (nim.a.a(aVarV, this) == aVar6) {
                            return aVar6;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
