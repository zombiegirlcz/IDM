package srd;

import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CustomAssetDetailsController customAssetDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ExpandableCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExpandableCellDelegate.Model model = (ExpandableCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52256a, "historical_header")) {
            q qVar = (q) this.v.R2();
            qVar.H2(qVar.f265183q, new soi.a(16));
        }
        return Unit.f186387a;
    }
}
