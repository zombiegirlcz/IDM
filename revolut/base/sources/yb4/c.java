package yb4;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreen;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FinancialSituationChangesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FinancialSituationChangesScreen financialSituationChangesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = financialSituationChangesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        FinancialSituationChangesScreen financialSituationChangesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                financialSituationChangesScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) financialSituationChangesScreen.O.getValue();
                f fVar = (f) ((j2) jVar.f312189p.f22677a).getValue();
                Map map = fVar.f312184a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it8 = map.entrySet().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        Map map2 = fVar.f312185b;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(map2.size()));
                        for (Map.Entry entry : map2.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            String str = (String) value;
                            if (!Intrinsics.f(fVar.f312184a.get(entry.getKey()), Boolean.TRUE) || d0.W(str)) {
                                value = null;
                            }
                            linkedHashMap2.put(key, (String) value);
                        }
                        jVar.C2(new g(new sy3.d(linkedHashMap, linkedHashMap2)));
                        break;
                    } else {
                        Map.Entry entry2 = (Map.Entry) it8.next();
                        String str2 = (String) entry2.getKey();
                        Iterator it9 = jVar.o.f67762a.f266608c.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (Intrinsics.f(((sy3.a) next).f266603a, str2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        sy3.a aVar3 = (sy3.a) next;
                        if ((aVar3 != null ? aVar3.f266605c : null) == sy3.b.DEFAULT) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
