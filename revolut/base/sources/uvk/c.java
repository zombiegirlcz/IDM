package uvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddKeyStatsViewGroupsScreen f283473w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283473w = addKeyStatsViewGroupsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f283473w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f283473w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = this.f283473w;
        switch (i) {
            case 0:
                i iVar = (i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = addKeyStatsViewGroupsScreen.e3();
                AssetStatsGroup assetStatsGroup = iVar.f283479a;
                oVarE3.getClass();
                Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
                oVarE3.C2(new f(assetStatsGroup));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                addKeyStatsViewGroupsScreen.e3().f283489t.setValue(str);
                break;
        }
        return Unit.f186387a;
    }
}
