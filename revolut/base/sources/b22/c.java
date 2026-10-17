package b22;

import aw0.n6;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ApmAliasClaimUploadScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ApmAliasClaimUploadScreen apmAliasClaimUploadScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = apmAliasClaimUploadScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ApmAliasClaimUploadScreen apmAliasClaimUploadScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                apmAliasClaimUploadScreen.e3().C2(f.f11858a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVarE3 = apmAliasClaimUploadScreen.e3();
                mVarE3.C2(new g(((e) ((j2) mVarE3.f11867p.f22677a).getValue()).f11857a));
                break;
        }
        return Unit.f186387a;
    }
}
