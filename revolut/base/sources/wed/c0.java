package wed;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.g1;
import rp0.k1;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function1 {
    public AlertItem u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vh f296716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f296717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f296718y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vh vhVar, Continuation continuation, CoroutineScope coroutineScope, f0 f0Var) {
        super(1, continuation);
        this.f296716w = vhVar;
        this.f296717x = coroutineScope;
        this.f296718y = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.f296716w, continuation, this.f296717x, this.f296718y);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AlertItem alertItem;
        Throwable th10;
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        f0 f0Var = this.f296718y;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f296716w.f54883a.f;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem");
            AlertItem alertItem2 = (AlertItem) obj3;
            FavouritesAssetTypeKey favouritesAssetTypeKey = alertItem2.getF86877b().d;
            try {
                m.Companion companion = yhm.m.INSTANCE;
                efd.a aVar2 = f0Var.f296727r;
                String f86876a = alertItem2.getF86876a();
                mgd.f i2 = alertItem2.getI();
                this.u = alertItem2;
                this.v = 1;
                if (((l2d.n) aVar2).f(f86876a, favouritesAssetTypeKey, i2, this) == aVar) {
                    return aVar;
                }
                alertItem = alertItem2;
            } catch (Throwable th11) {
                alertItem = alertItem2;
                th10 = th11;
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alertItem = this.u;
            try {
                yhm.o.b(obj2);
            } catch (Throwable th12) {
                th10 = th12;
                m.Companion companion22 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
        }
        objA = Unit.f186387a;
        m.Companion companion3 = yhm.m.INSTANCE;
        g1 g1Var = f0Var.u;
        k1 k1Var = (k1) g1Var;
        k1Var.d(((ped.b) f0Var.v).a(alertItem.getF86877b().f86864b, !(objA instanceof yhm.n)));
        return Unit.f186387a;
    }
}
