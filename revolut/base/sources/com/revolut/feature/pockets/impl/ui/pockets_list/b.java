package com.revolut.feature.pockets.impl.ui.pockets_list;

import a01.e;
import afa.f;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.h2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wi0.b f80918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f80919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation, wi0.b bVar) {
        super(1, continuation);
        this.v = cVar;
        this.f80918w = bVar;
        this.f80919x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        wi0.b bVar = this.f80918w;
        return new b(this.v, this.f80919x, continuation, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = cVar.A;
            this.u = 1;
            if (((Boolean) fVar.d.getValue()).booleanValue()) {
                kli.c.c(fVar.f3986c.D2(), true);
                objD = h2.d(500L, new e(fVar, null, 23), this);
                if (objD != obj3) {
                    objD = Unit.f186387a;
                }
            } else {
                objD = Unit.f186387a;
            }
            if (objD == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        com.revolut.kompot.navigable.vc.modal.a aVar = cVar.E;
        xi0.b.Companion.getClass();
        h.v2(aVar, new PocketsListContract$ModalStep.MultiIban(this.f80918w, xi0.a.a(this.f80919x)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
