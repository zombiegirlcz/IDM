package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftPass f98836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, AsftPass asftPass, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f98836w = asftPass;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f98836w, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = (String) data.getContent();
        c cVar = this.v;
        if (!cVar.A && str != null) {
            cVar.A = true;
            com.revolut.kompot.navigable.vc.modal.a aVar2 = cVar.C;
            AsftPass asftPass = this.f98836w;
            h.v2(aVar2, new AsftHomeScreenContract$ModalStep.PassAvailableSoon(asftPass.f98723q, new AsftManageBookingPayload(str, asftPass.f98713a, asftPass.i, asftPass.o, asftPass.u)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
