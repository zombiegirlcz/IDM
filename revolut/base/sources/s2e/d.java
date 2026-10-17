package s2e;

import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StoreBrandDetailDiscountScreen f259290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StoreBrandDetailDiscountScreen storeBrandDetailDiscountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259290w = storeBrandDetailDiscountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f259290w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f259290w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StoreBrandDetailDiscountScreen storeBrandDetailDiscountScreen = this.f259290w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) storeBrandDetailDiscountScreen.V.getValue();
                Intrinsics.h(clickData);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVar.C2(new f(clickData));
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) storeBrandDetailDiscountScreen.V.getValue();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                kVar2.f259302s.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
