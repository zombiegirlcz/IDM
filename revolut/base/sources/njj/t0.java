package njj;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a f216591w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f216591w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(0, this.f216591w, continuation);
                t0Var.v = obj2;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(1, this.f216591w, continuation);
                t0Var2.v = obj2;
                return t0Var2;
            case 2:
                t0 t0Var3 = new t0(2, this.f216591w, continuation);
                t0Var3.v = obj2;
                return t0Var3;
            case 3:
                t0 t0Var4 = new t0(3, this.f216591w, continuation);
                t0Var4.v = obj2;
                return t0Var4;
            case 4:
                t0 t0Var5 = new t0(4, this.f216591w, continuation);
                t0Var5.v = obj2;
                return t0Var5;
            default:
                t0 t0Var6 = new t0(5, this.f216591w, continuation);
                t0Var6.v = obj2;
                return t0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
