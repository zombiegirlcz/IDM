package y12;

import aw0.n6;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.ApmAliasClaimAdditionalInfoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ApmAliasClaimAdditionalInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = apmAliasClaimAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) apmAliasClaimAdditionalInfoScreen.N.getValue()).C2(e.f310278a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) apmAliasClaimAdditionalInfoScreen.N.getValue();
                iVar.C2(new f(((d) ((j2) iVar.o.f22677a).getValue()).f310277a));
                break;
        }
        return Unit.f186387a;
    }
}
