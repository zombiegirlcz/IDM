package xed;

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
public final class k extends gim.i implements Function1 {
    public AlertItem u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vh f304623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f304624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f304625y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vh vhVar, Continuation continuation, CoroutineScope coroutineScope, n nVar) {
        super(1, continuation);
        this.f304623w = vhVar;
        this.f304624x = coroutineScope;
        this.f304625y = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f304623w, continuation, this.f304624x, this.f304625y);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AlertItem alertItem;
        Throwable th10;
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        n nVar = this.f304625y;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f304623w.f54883a.f;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem");
            AlertItem alertItem2 = (AlertItem) obj3;
            FavouritesAssetTypeKey favouritesAssetTypeKey = alertItem2.getF86877b().d;
            try {
                m.Companion companion = yhm.m.INSTANCE;
                efd.a aVar2 = nVar.f304630p;
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
        g1 g1Var = nVar.f304631q;
        k1 k1Var = (k1) g1Var;
        k1Var.d(((ped.b) nVar.f304632r).a(alertItem.getF86877b().f86864b, !(objA instanceof yhm.n)));
        return Unit.f186387a;
    }
}
