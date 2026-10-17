package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification;

import cli.y;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import do3.n;
import gim.i;
import gk3.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nj1.j;
import oki.h;
import q23.g;
import q23.q;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public b u;
    public Address v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f65147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f65147x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f65147x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        b bVar = this.f65147x;
        y yVar = bVar.B;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f65146w;
        if (i == 0) {
            o.b(obj2);
            Object content = ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent();
            Object content2 = ((q) ((j2) yVar.f22677a).getValue()).i.getContent();
            if (content != null && content2 != null) {
                n nVar = (n) content2;
                Address address2 = (Address) content;
                if (Intrinsics.f(((q) ((j2) yVar.f22677a).getValue()).f241516j, Boolean.TRUE)) {
                    bVar.N2();
                    return Unit.f186387a;
                }
                if (((q) ((j2) yVar.f22677a).getValue()).f241512b) {
                    b.O2(bVar, address2);
                    return Unit.f186387a;
                }
                wi0.b bVarY = do3.q.y(nVar);
                wi0.b.Companion.getClass();
                if (bVarY.equals(wi0.b.O0) && !m33.a.d(do3.q.x(nVar), address2)) {
                    h.v2(bVar.C, new CardDeliveryAddressVerificationScreenContract$ModalStep.ConfirmDifferentAddressDialog(address2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return Unit.f186387a;
                }
                if (((q) ((j2) yVar.f22677a).getValue()).f241515h) {
                    b.O2(bVar, address2);
                    return Unit.f186387a;
                }
                this.u = bVar;
                this.v = address2;
                this.f65146w = 1;
                Object objJ2 = b.J2(bVar, address2, this);
                if (objJ2 == aVar) {
                    return aVar;
                }
                address = address2;
                obj2 = objJ2;
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Address address3 = this.v;
        b bVar2 = this.u;
        o.b(obj2);
        address = address3;
        bVar = bVar2;
        j jVar = ((nj1.i) obj2).f216333b;
        if (jVar != null) {
            j60.a aVar2 = bVar.u;
            bVar.f65152t.getClass();
            aVar2.x(u23.a.a(jVar));
            return Unit.f186387a;
        }
        d dVarP2 = b.P2(((q) ((j2) bVar.B.f22677a).getValue()).f241514g, nz8.d.g(address));
        if (dVarP2 == null) {
            return Unit.f186387a;
        }
        if (!bVar.Q2(address, dVarP2).isEmpty()) {
            bVar.L2((Address) ((q) ((j2) bVar.B.f22677a).getValue()).f241511a.getContent(), true, g.INVALID_FIELDS);
            return Unit.f186387a;
        }
        bVar.l2(new q23.i(bVar, address, null, 0), new yi5.b(26));
        return Unit.f186387a;
    }
}
