package ytj;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a f316814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0j.k f316815x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar, d0j.k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f316814w = aVar;
        this.f316815x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f316814w, this.f316815x, continuation, 0);
            default:
                return new g(this.f316814w, this.f316815x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        d0j.k kVar = this.f316815x;
        com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar = this.f316814w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                stj.h hVar = aVar.o;
                List listC = zhm.u.c(new mtj.a(kVar.f110411b, kVar.f110410a, ((Boolean) aVar.f101583t.getValue()).booleanValue() ? Boolean.TRUE : null));
                this.v = 1;
                mtj.q qVar = (mtj.q) hVar.f265610a;
                qVar.getClass();
                mpd.p pVar = new mpd.p(listC, qVar, null, 7);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, pVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    stj.h hVar2 = aVar.o;
                    String str = kVar.f110410a;
                    this.v = 1;
                    mk0.a aVar4 = ((mtj.q) hVar2.f265610a).e;
                    Collection collection = (List) kii.e.n("CHALLENGE_DETAILS_CONFETTI", aVar4);
                    if (collection == null) {
                        collection = f0.f322471a;
                    }
                    Object objE = aVar4.e(new tk0.e("CHALLENGE_DETAILS_CONFETTI"), d0.F0(str, collection), this);
                    if (objE != aVar3) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar3) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
