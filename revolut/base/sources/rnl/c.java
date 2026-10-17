package rnl;

import aw0.n6;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rbh.k;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MerchantPermissionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MerchantPermissionsScreen merchantPermissionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = merchantPermissionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        pnl.a aVar = pnl.a.f237839a;
        MerchantPermissionsScreen merchantPermissionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) merchantPermissionsScreen.e3()).C2(aVar);
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) merchantPermissionsScreen.e3();
                gVar.getClass();
                gVar.l2(new k(gVar, null, 12), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) merchantPermissionsScreen.e3()).C2(aVar);
                break;
        }
        return Unit.f186387a;
    }
}
