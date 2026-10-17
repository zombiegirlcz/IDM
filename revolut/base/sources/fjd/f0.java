package fjd;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a f135570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f135571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.shops.impl.ui.home.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135570w = aVar;
        this.f135571x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f135570w, this.f135571x, continuation, 0);
            default:
                return new f0(this.f135570w, this.f135571x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.shops.impl.ui.home.a aVar2 = this.f135570w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pjd.a aVar3 = aVar2.f87196q;
                    aVar3.getClass();
                    String id10 = this.f135571x;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    if (!Intrinsics.f(id10, "CLICK_ID_SHOPS_TERMS")) {
                        throw new IllegalArgumentException(j6.a.q("No navigation command defined for ", id10));
                    }
                    mre.c cVar = aVar3.f236731a;
                    TermsScope.INSTANCE.getClass();
                    ufm.i iVarC = ((rre.d) cVar).c(TermsScope.i0, null);
                    this.v = 1;
                    obj2 = nim.a.b(iVarC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.h(naviCommand);
                return aVar2.C1(new BridgeDestination(naviCommand));
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.shops.impl.ui.home.a aVar5 = this.f135570w;
                    yji.l.b1(aVar5, vkm.q.q(rd0.e.b(aVar5.A.f174431b)), null, new x(aVar5, null, 9), 3);
                    jid.d dVar = aVar5.A;
                    ihm.f events = aVar5.K;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    String categoryId = this.f135571x;
                    Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                    dVar.f174432c = categoryId;
                    efm.b bVarB = ((lk0.d) dVar.d.getValue()).b(events);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar4) {
                        return aVar4;
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
