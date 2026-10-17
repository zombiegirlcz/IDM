package ueg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m1c.f1;
import m1c.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f279437w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f279437w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v0(this.v, this.f279437w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u1 u1Var;
        rp0.y yVarA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                efm.d0 d0VarFirstOrError = m70.a.g(bVar.D.a(f1.STAYS, w4l.h.f294642c), null, null, 3).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                this.u = 1;
                obj2 = nim.a.b(d0VarFirstOrError, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            u1Var = (u1) obj2;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            u1Var = null;
        }
        xcg.b bVar2 = bVar.f94067y;
        TravelHotelsPromotion promotion = (TravelHotelsPromotion) this.f279437w;
        xcg.d dVar = (xcg.d) bVar2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        TextLocalisedClause textLocalisedClauseB = dVar.b(promotion, R$string.hotels_package_rates_details_title, rim.d.d(promotion.e));
        if (textLocalisedClauseB != null) {
            yVarA = xcg.d.a(promotion, textLocalisedClauseB, new TextLocalisedClause(R$string.hotels_package_rates_details_book_stay_title, zhm.u.c(rim.d.b(promotion.e) + "%"), null, 12), u1Var);
        } else {
            yVarA = null;
        }
        if (yVarA == null) {
            return null;
        }
        bVar.f94065w.x(yVarA);
        return Unit.f186387a;
    }
}
