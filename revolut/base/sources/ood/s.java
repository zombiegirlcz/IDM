package ood;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TripsListController f227077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(TripsListController tripsListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227077w = tripsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f227077w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f227077w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            default:
                s sVar3 = new s(this.f227077w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((cr0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[PHI: r13
      0x0087: PHI (r13v52 com.revolut.feature.categorisation.api.model.CategorisationFilter) = 
      (r13v51 com.revolut.feature.categorisation.api.model.CategorisationFilter)
      (r13v55 com.revolut.feature.categorisation.api.model.CategorisationFilter)
     binds: [B:34:0x0084, B:29:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ood.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
