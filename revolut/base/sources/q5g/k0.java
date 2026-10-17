package q5g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.checkout.b f242385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242385w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f242385w, continuation, 0);
                k0Var.v = obj2;
                return k0Var;
            case 1:
                k0 k0Var2 = new k0(this.f242385w, continuation, 1);
                k0Var2.v = obj2;
                return k0Var2;
            case 2:
                k0 k0Var3 = new k0(this.f242385w, continuation, 2);
                k0Var3.v = obj2;
                return k0Var3;
            default:
                k0 k0Var4 = new k0(this.f242385w, continuation, 3);
                k0Var4.v = obj2;
                return k0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5g.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
