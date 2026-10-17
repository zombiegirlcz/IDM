package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import uk9.h;
import xme.f;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesAirline f94271w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, TravelMilesAirline travelMilesAirline, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f94271w = travelMilesAirline;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f94271w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = new h(bVar, null, 14);
            this.u = 1;
            obj2 = u0.b0(bVar.X(), "TRANSFER_POINTS_BUTTON_LOADING_TAG", hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        f fVar = (f) ((Data) obj2).getContent();
        if (fVar == null || (str = fVar.f307233a) == null) {
            return bVar.X1(b.I2());
        }
        oki.h.v2(bVar.f94278x, new TravelMilesAirlineDetailsScreenContract$ModalStep.AccountRegistrationByTaxId(this.f94271w, str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
