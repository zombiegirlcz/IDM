package com.revolut.trading.orders.ui.invest.placement.target_price;

import bfl.g;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$ModalStep;
import gim.i;
import k4l.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import nel.n;
import oki.h;
import oul.k;
import vkm.j2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function1 {
    public b u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f107003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f107004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107005y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        g gVar;
        com.revolut.kompot.navigable.vc.modal.a aVar;
        r0 r0Var;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f107005y;
        if (i == 0) {
            o.b(obj2);
            bVar = this.z;
            com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar.C;
            gVar = ((k) ((j2) bVar.getState().f22677a).getValue()).f229905a;
            r0 r0VarJ2 = bVar.J2();
            this.u = bVar;
            this.v = aVar3;
            this.f107003w = gVar;
            this.f107004x = r0VarJ2;
            this.f107005y = 1;
            Object objX = q.x(mo3.a.g((Flow) bVar.f107013y.getValue(), null, null, 3), this);
            if (objX == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objX;
            r0Var = r0VarJ2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0Var = this.f107004x;
            gVar = this.f107003w;
            aVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        h.x2(bVar, aVar, new TargetPriceScreenContract$ModalStep.Tutorial(gVar, r0Var, (n) obj2));
        return Unit.f186387a;
    }
}
