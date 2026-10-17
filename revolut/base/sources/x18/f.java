package x18;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.List;
import java.util.Set;
import kkf.x5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b f302334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302334w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f302334w, continuation, 0);
            case 1:
                return new f(this.f302334w, continuation, 1);
            case 2:
                return new f(this.f302334w, continuation, 2);
            default:
                return new f(this.f302334w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = this.f302334w;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.k kVarU = nim.a.u(new b(bVar, null), tzg.m.c(bVar.f76445s, null, cfl.k.f23744a, 1));
                    int i2 = 3;
                    c cVar = new c(i2, 0, continuation);
                    h0 h0Var = h0.f322473a;
                    vkm.y yVarE = rd0.e.e(kVarU, h0Var, cVar);
                    l3d.h0 h0Var2 = bVar.u;
                    y1d.b.Companion.getClass();
                    FavouritesAssetTypeKey assetTypeKey = y1d.a.f;
                    h0Var2.getClass();
                    Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
                    jhi.b bVarG = mo3.a.g(nim.a.v(u0.m(yVarE, rd0.e.e(nim.a.v(new x5(h0Var2.f191909a.g(zhm.u.c(assetTypeKey), false), 24), new x1.n(12)), h0Var, new c(i2, 1, continuation))), new x0b.c(bVar, 7)), null, new wyg.s(18), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(bVar.A.h(null, (Set) obj2));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar2 = this.f302334w;
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.a aVar3 = new com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.a(bVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar2.k, "open_watchlist", aVar3, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar3 = this.f302334w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    jt0.b bVar4 = bVar3.f76442p;
                    r18.m.Companion.getClass();
                    List list = r18.m.f250919r;
                    Set set = (Set) bVar3.A.getValue();
                    if (set == null) {
                        set = h0.f322473a;
                    }
                    this.v = 1;
                    Object objG = ((k18.c) bVar4.f178266c).g(list, set, 50, this);
                    if (objG != aVar4) {
                        objG = Unit.f186387a;
                    }
                    if (objG == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar3.B.a();
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    y08.a aVar6 = this.f302334w.f76448x;
                    this.v = 1;
                    if (aVar6.Z2(false, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
