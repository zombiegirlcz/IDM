package tw5;

import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoTrendingService;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import qw5.b;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function3 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cw5.e f274926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cw5.d f274927x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, cw5.e eVar, cw5.d dVar, Continuation continuation) {
        super(3, continuation);
        this.v = iVar;
        this.f274926w = eVar;
        this.f274927x = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        cw5.e eVar = this.f274926w;
        cw5.d dVar = this.f274927x;
        return new h(this.v, eVar, dVar, (Continuation) obj4).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b.c cVar;
        b.EnumC1371b enumC1371b;
        cw5.e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CryptoTrendingService cryptoTrendingService = this.v.f274928a;
            cw5.e eVar2 = this.f274926w;
            Intrinsics.checkNotNullParameter(eVar2, "<this>");
            int i2 = pw5.b.f240337c[eVar2.ordinal()];
            if (i2 == 1) {
                cVar = b.c.ONE_DAY;
            } else if (i2 == 2) {
                cVar = b.c.ONE_WEEK;
            } else if (i2 == 3) {
                cVar = b.c.ONE_MONTH;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = b.c.ONE_YEAR;
            }
            cw5.d dVar = this.f274927x;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            int i3 = pw5.b.d[dVar.ordinal()];
            if (i3 == 1) {
                enumC1371b = b.EnumC1371b.SECURITY;
            } else if (i3 == 2) {
                enumC1371b = b.EnumC1371b.CRYPTO;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC1371b = b.EnumC1371b.COMMODITY;
            }
            this.u = 1;
            obj2 = cryptoTrendingService.getTrending(cVar, enumC1371b, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        qw5.b bVar = (qw5.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b.c timeSpan = bVar.getTimeSpan();
        if (timeSpan != null) {
            int i5 = pw5.b.f240335a[timeSpan.ordinal()];
            if (i5 == 1) {
                eVar = cw5.e.ONE_DAY;
            } else if (i5 == 2) {
                eVar = cw5.e.ONE_WEEK;
            } else if (i5 == 3) {
                eVar = cw5.e.ONE_MONTH;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = cw5.e.ONE_YEAR;
            }
        } else {
            eVar = null;
        }
        cw5.d dVarA = pw5.c.a(bVar.getAssetType());
        List<b.a> assets = bVar.getAssets();
        ArrayList arrayList = new ArrayList(w.t(assets, 10));
        for (b.a aVar2 : assets) {
            arrayList.add(new cw5.c(aVar2.getRef(), pw5.c.a(aVar2.getAssetType()), aVar2.getVolumeChange()));
        }
        return new cw5.f(eVar, dVarA, arrayList);
    }
}
