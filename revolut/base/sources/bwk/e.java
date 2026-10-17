package bwk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StockOrderBookController f19371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StockOrderBookController stockOrderBookController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f19371w = stockOrderBookController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f19371w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f19371w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ewk.a aVar = (ewk.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StockOrderBookController stockOrderBookController = this.f19371w;
        switch (i) {
            case 0:
                ewk.a parcel = (ewk.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) ((f) stockOrderBookController.L.getValue());
                mVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Float f = parcel.f130319a;
                if (f != null) {
                    mVar.n2(new l(mVar, f.floatValue(), (Continuation) null, 1), new whi.b(6));
                }
                break;
            default:
                ewk.a parcel2 = (ewk.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar2 = (m) ((f) stockOrderBookController.L.getValue());
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                Float f4 = parcel2.f130320b;
                if (f4 != null) {
                    mVar2.n2(new l(mVar2, f4.floatValue(), (Continuation) null, 0), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
