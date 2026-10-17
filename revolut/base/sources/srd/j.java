package srd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CustomAssetDetailsController customAssetDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.o;
        boolean z = obj3 instanceof dj0.d;
        CustomAssetDetailsController customAssetDetailsController = this.v;
        if (z) {
            ((q) customAssetDetailsController.R2()).J2((dj0.d) obj3);
        } else if (obj3 instanceof ValueHistoryEntry) {
            ValueHistoryEntry entry = (ValueHistoryEntry) obj3;
            q qVar = (q) customAssetDetailsController.R2();
            qVar.getClass();
            Intrinsics.checkNotNullParameter(entry, "entry");
            qVar.l1().M0(new TotalWealthContract$Events.AdjustHistoricalValue(((a) ((j2) qVar.f265183q.f22677a).getValue()).f265160a.f99216a, entry));
        }
        return Unit.f186387a;
    }
}
