package g4k;

import com.revolut.data.model.Data;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements oim.o {
    public /* synthetic */ List u;
    public /* synthetic */ dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ n61.o f140565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f140566x;

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        l lVar = new l(5, (Continuation) obj6);
        lVar.u = (List) obj2;
        lVar.v = (dj0.d) obj3;
        lVar.f140565w = (n61.o) obj4;
        lVar.f140566x = (Data) obj5;
        return lVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = this.u;
        dj0.d dVar = this.v;
        n61.o oVar = this.f140565w;
        Data data = this.f140566x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(list);
        ArrayList arrayListN = zhm.c0.N(list, WalletLimit.CounterLimit.class);
        boolean z = oVar.f212696a && oVar.f212697b;
        Intrinsics.h(data);
        return new r(data, arrayListN, dVar, z);
    }
}
