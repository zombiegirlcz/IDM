package mv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import fnc.s;
import hd.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kv5.q;
import oim.p;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements p {
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ CryptoInvestmentsSortingType f209142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ st5.b f209143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Data f209144y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(6, continuation);
        this.z = fVar;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        e eVar = new e(this.z, (Continuation) obj7);
        eVar.u = zBooleanValue;
        eVar.v = zBooleanValue2;
        eVar.f209142w = (CryptoInvestmentsSortingType) obj4;
        eVar.f209143x = (st5.b) obj5;
        eVar.f209144y = (Data) obj6;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        boolean z3 = this.v;
        CryptoInvestmentsSortingType sortingType = this.f209142w;
        st5.b itemsLimit = this.f209143x;
        Data data = this.f209144y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.z;
        r rVar = fVar.f209145a;
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
        return new fxb.f(ta6.a.h(((ut5.h) rVar.d).W(), mo3.a.e(((ut5.c) rVar.f151366c).c(), new mqg.a(28), new mqg.a(29)), new q(((s) rVar.f).o(), 2), new i(rVar, itemsLimit, z3, sortingType, null)), fVar, data, z, 2);
    }
}
