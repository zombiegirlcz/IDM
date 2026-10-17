package yvk;

import aii.q;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a f317222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f317223x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f317222w = aVar;
        this.f317223x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f317222w, this.f317223x, continuation, 0);
            default:
                return new m(this.f317222w, this.f317223x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar2 = this.f317222w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ogm.i iVar = aVar2.f104029p;
                    trk.a aVar3 = aVar2.o.f104027a;
                    this.v = 1;
                    lrk.e eVar = (lrk.e) iVar.f225222b;
                    mk0.a aVar4 = eVar.f199526a;
                    tk0.e eVar2 = new tk0.e(lrk.d.a(aVar3));
                    List<AssetStatsId> list = this.f317223x;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (AssetStatsId statsId : list) {
                        grk.b bVar = eVar.f199527b;
                        Intrinsics.checkNotNullParameter(statsId, "statsId");
                        String str = (String) bVar.f146054a.get(statsId);
                        if (str == null) {
                            throw new IllegalStateException(("No mapping found for " + statsId).toString());
                        }
                        arrayList.add(str);
                    }
                    Object objE = aVar4.e(eVar2, arrayList, this);
                    fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                    if (objE != aVar5) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar5) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.C2(q.f5292a);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar7 = this.f317222w;
                    m mVar = new m(aVar7, this.f317223x, null, 0);
                    this.v = 1;
                    if (aVar7.p2(this, mVar) == aVar6) {
                        return aVar6;
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
