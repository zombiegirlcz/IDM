package yid;

import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg6.v;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShopsCarouselDetailsScreen f314307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ShopsCarouselDetailsScreen shopsCarouselDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f314307w = shopsCarouselDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f314307w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f314307w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen = this.f314307w;
        switch (i) {
            case 0:
                List listOfItems = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = shopsCarouselDetailsScreen.d();
                Intrinsics.h(listOfItems);
                com.revolut.feature.shops.impl.ui.carousel_details.a aVar2 = (com.revolut.feature.shops.impl.ui.carousel_details.a) nVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listOfItems, "listOfItems");
                aVar2.n2(new v(aVar2, listOfItems, null, 3), new whi.b(6));
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shops.impl.ui.carousel_details.a aVar4 = (com.revolut.feature.shops.impl.ui.carousel_details.a) shopsCarouselDetailsScreen.d();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                aVar4.f87154r.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
