package neg;

import com.revolut.feature_travel_hotels_models.property.search.HotelsSelectedDates;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c f214535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f214536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dgi.c f214537y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar, String str, dgi.c cVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f214535w = cVar;
        this.f214536x = str;
        this.f214537y = cVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f214535w, this.f214536x, this.f214537y, continuation, 0);
            default:
                return new t(this.f214535w, this.f214536x, this.f214537y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar = this.f214535w;
                i9g.c cVar2 = cVar.o;
                dgi.c cVar3 = this.f214537y;
                String str = cVar3.i;
                if (str == null) {
                    str = "";
                }
                efm.r rVarOnErrorReturn = mo3.a.n(ue0.e.p(cVar2.c(new dgi.h(this.f214536x, str, new dgi.f(new HotelsSelectedDates(cVar3.f114672b, cVar3.f114673c)))), h0.f322473a)).doOnNext(new nd3.a(new p(cVar, 1), 5)).onErrorReturn(new nd3.a(new nd8.i(10), 6));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                this.v = 1;
                Object objF = nim.a.f(rVarOnErrorReturn, this);
                return objF == aVar ? aVar : objF;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar4 = this.f214535w;
                t tVar = new t(cVar4, this.f214536x, this.f214537y, null, 0);
                this.v = 1;
                Object objB0 = u0.b0(cVar4.X(), "BUTTON_LOADING_TAG", tVar, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
