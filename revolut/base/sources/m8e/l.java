package m8e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import yhm.o;
import ypg.p;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f203538w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f203538w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f203538w, continuation, 0);
            default:
                return new l(this.f203538w, continuation, 1);
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
                m mVar = this.f203538w;
                if (i == 0) {
                    o.b(obj2);
                    ppg.b bVar = mVar.f203539p;
                    String vaultId = mVar.o.f89097a.f234899a;
                    p pVar = (p) bVar;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                    r rVarB = ((aed.o) pVar.f315887a).b(vaultId);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mVar.C2(f.f203534a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    m mVar2 = this.f203538w;
                    l lVar = new l(mVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(mVar2.X(), "CANCEL_INVITATION_TAG", lVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
