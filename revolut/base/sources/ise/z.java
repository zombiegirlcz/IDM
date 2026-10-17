package ise;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f168245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168246x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f168246x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f168246x, continuation);
                zVar.f168245w = obj2;
                return zVar;
            default:
                z zVar2 = new z(1, this.f168246x, continuation);
                zVar2.f168245w = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.f168245w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = this.f168246x;
                    dVar.H2(dVar.M, new ilk.i(data, 25));
                    j2 j2Var = dVar.L;
                    this.f168245w = null;
                    this.v = 1;
                    j2Var.setValue(data);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Data data2 = (Data) this.f168245w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = this.f168246x;
                    dVar2.H2(dVar2.M, new ilk.i(data2, dVar2, 26));
                    j2 j2Var2 = dVar2.K;
                    this.f168245w = null;
                    this.v = 1;
                    j2Var2.setValue(data2);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
