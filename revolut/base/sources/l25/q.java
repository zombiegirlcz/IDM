package l25;

import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kye.l0;
import rp0.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardDeeplink.AutopayFail f191643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, CreditCardDeeplink.AutopayFail autopayFail, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f191643w = autopayFail;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f191643w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u uVar = this.v;
        lb5.b bVar = uVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            CreditCardDeeplink.AutopayFail autopayFail = this.f191643w;
            String str = (String) ((kotlin.text.m) autopayFail.a().f314654a.c()).get(1);
            w4l.j jVar = w4l.j.f294644c;
            jhi.b bVarE = mo3.a.e(rd0.e.n(nim.a.v(u0.m(((yb5.e) bVar).b(str, jVar), ((yb5.e) bVar).a((String) ((kotlin.text.m) autopayFail.a().f314654a.c()).get(1), jVar)), new kzc.a(uVar, autopayFail, 6)), h0.f322473a), new l0(21), new l0(22));
            this.u = 1;
            obj2 = vkm.q.x(bVarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        uVar.o.x((y) obj2);
        return Unit.f186387a;
    }
}
