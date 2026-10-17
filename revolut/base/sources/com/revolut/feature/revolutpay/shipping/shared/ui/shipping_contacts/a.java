package com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vkm.j2;
import xec.e;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        Object content = ((e) ((j2) bVar.f84758s.f22677a).getValue()).f304583g.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h.v2(bVar.f84759t, new ShippingContactsContract$ModalStep.AddNewAddress(new Address(null, null, null, null, null, ((Address) content).getCountry(), null, null, null, null, null, null, null, null, null, 32735, null)), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
