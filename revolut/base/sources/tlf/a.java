package tlf;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements oim.o {
    public /* synthetic */ a3 u;
    public /* synthetic */ Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ na7.a f272056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Map f272057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ prl.e f272058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(prl.e eVar, Continuation continuation) {
        super(5, continuation);
        this.f272058y = eVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a aVar = new a(this.f272058y, (Continuation) obj6);
        aVar.u = (a3) obj2;
        aVar.v = (Map) obj3;
        aVar.f272056w = (na7.a) obj4;
        aVar.f272057x = (Map) obj5;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 transaction = this.u;
        Map pockets = this.v;
        na7.a hiddenAccountData = this.f272056w;
        Map vaults = this.f272057x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        prl.e eVar = this.f272058y;
        Object obj3 = eVar.f239326c;
        cmf.h hVarF = vlf.b.f((vlf.b) eVar.d, transaction, pockets, hiddenAccountData, null, onh.b.a(transaction), 0, 0, 104);
        onh.b bVar = (onh.b) eVar.f239326c;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(hiddenAccountData, "hiddenAccountData");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        return cmf.h.a(hVarF, null, ynf.f.a((ynf.f) bVar.f226950b, transaction, false, pockets, vaults, null, null, null, onh.b.a(transaction), hiddenAccountData, false, 1138), null, null, null, false, false, null, null, null, 2045);
    }
}
