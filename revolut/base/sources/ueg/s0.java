package ueg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HotelsProperty f279418x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, HotelsProperty hotelsProperty, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279417w = bVar;
        this.f279418x = hotelsProperty;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s0(this.f279417w, this.f279418x, continuation, 0);
            default:
                return new s0(this.f279417w, this.f279418x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = this.f279417w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = bVar.f94061q.b(this.f279418x.f97981a);
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
                bVar.X1(new mii.k("DIALOG_ITEM_ID", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_removed_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = this.f279417w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarA = bVar2.f94061q.a(this.f279418x.f97981a);
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
                bVar2.X1(new mii.k("DIALOG_ITEM_ID", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_added_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
        }
    }
}
