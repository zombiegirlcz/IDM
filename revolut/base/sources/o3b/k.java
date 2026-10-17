package o3b;

import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CfdExitStrategiesSetUpController f221741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221741w = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f221741w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f221741w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((com.revolut.core.ui_kit.delegates.x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((com.revolut.core.ui_kit.delegates.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3b.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
