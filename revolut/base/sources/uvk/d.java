package uvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddKeyStatsViewGroupsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addKeyStatsViewGroupsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                addKeyStatsViewGroupsScreen.e3().B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                addKeyStatsViewGroupsScreen.e3().f283489t.setValue(null);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = addKeyStatsViewGroupsScreen.e3();
                awk.h hVar = ((e) ((j2) oVarE3.f283488s.f22677a).getValue()).f283475b;
                if (hVar != null) {
                    ?? r06 = hVar.f10802a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : r06.entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    oVarE3.C2(new g(d0.i1(linkedHashMap.keySet())));
                }
                break;
        }
        return Unit.f186387a;
    }
}
