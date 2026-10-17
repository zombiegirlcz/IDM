package wti;

import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lui.e;
import mti.g;
import n14.k;
import nii.f;
import nii.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a f299994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f299995x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar, e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f299994w = aVar;
        this.f299995x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f299994w, this.f299995x, continuation, 0);
            default:
                return new d(this.f299994w, this.f299995x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    zsi.e eVar = this.f299994w.f98800q;
                    String str = this.f299995x.f200243a;
                    this.v = 1;
                    if (((g) eVar).d(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar3 = this.f299994w;
                if (i2 == 0) {
                    o.b(obj2);
                    e eVar2 = this.f299995x;
                    a3b.i iVar = new a3b.i(aVar3, eVar2, 25);
                    d dVar = new d(aVar3, eVar2, null, 0);
                    this.v = 1;
                    obj2 = k.V(aVar3, null, null, iVar, dVar, this, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h hVar = (h) obj2;
                if (hVar instanceof f) {
                    aVar3.B2();
                } else {
                    if (!(hVar instanceof nii.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar3.f98801r);
                }
                return Unit.f186387a;
        }
    }
}
