package vgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.n1;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesProvider f289183w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar, TravelMilesProvider travelMilesProvider, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f289183w = travelMilesProvider;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, this.f289183w, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j1 j1Var = n1Var instanceof j1 ? (j1) n1Var : null;
        if (j1Var == null) {
            return Unit.f186387a;
        }
        if (Intrinsics.f(j1Var.f216180b.f275445a, "ERROR_DIALOG_SIGN_UP_ITEM_ID")) {
            this.v.C1(new ExternalDestination.Browser(this.f289183w.e, null));
        }
        return Unit.f186387a;
    }
}
