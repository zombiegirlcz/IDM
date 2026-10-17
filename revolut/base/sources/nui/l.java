package nui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b f219320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lui.e f219321x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar, lui.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f219320w = bVar;
        this.f219321x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f219320w, this.f219321x, continuation, 0);
            default:
                return new l(this.f219320w, this.f219321x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    zsi.e eVar = this.f219320w.f98860p;
                    String str = this.f219321x.f200243a;
                    this.v = 1;
                    if (((mti.g) eVar).d(str, this) == aVar) {
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
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar = this.f219320w;
                if (i2 == 0) {
                    o.b(obj2);
                    lui.e eVar2 = this.f219321x;
                    a3b.i iVar = new a3b.i(bVar, eVar2, 16);
                    l lVar = new l(bVar, eVar2, null, 0);
                    this.v = 1;
                    obj2 = n14.k.V(bVar, null, null, iVar, lVar, this, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (!(hVar instanceof nii.f)) {
                    if (!(hVar instanceof nii.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.B2();
                }
                return Unit.f186387a;
        }
    }
}
