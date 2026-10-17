package smd;

import aw0.n6;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CategoryBudgetsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(CategoryBudgetsController categoryBudgetsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = categoryBudgetsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.v, continuation, 0);
            default:
                return new q(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CategoryBudgetsController categoryBudgetsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                categoryBudgetsController.R2().B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarR2 = categoryBudgetsController.R2();
                j jVar = (j) ((j2) uVarR2.u.f22677a).getValue();
                h hVar = (h) jVar.f264423a.getContent();
                if (hVar != null) {
                    Map map = jVar.f264424b;
                    List list = hVar.f264418b;
                    int iB = q0.b(zhm.w.t(list, 10));
                    int i2 = 16;
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj3 : list) {
                        linkedHashMap.put(((g) obj3).f264414a.getId(), obj3);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it8 = map.entrySet().iterator();
                    while (true) {
                        ?? xVar = 0;
                        xVar = 0;
                        xVar = 0;
                        xVar = 0;
                        if (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            String str = (String) entry.getKey();
                            c cVar = (c) entry.getValue();
                            g gVar = (g) linkedHashMap.get(str);
                            if (gVar != null) {
                                String str2 = gVar.f264416c;
                                if (cVar instanceof a) {
                                    dj0.d dVar = ((a) cVar).f264408a;
                                    if (!Intrinsics.f(dVar, gVar.d)) {
                                        if (dVar.f115082a != 0) {
                                            xVar = str2 == null ? new lzi.w(dVar, str) : new lzi.y(dVar, str2, str);
                                        } else if (str2 != null) {
                                            xVar = new lzi.x(str2, str);
                                        }
                                    }
                                } else {
                                    if (!(cVar instanceof b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (str2 != null) {
                                        xVar = new lzi.x(str2, str);
                                    }
                                }
                            }
                            if (xVar != 0) {
                                linkedHashSet.add(xVar);
                            }
                        } else {
                            uVarR2.A1(new sbb.w(uVarR2, linkedHashSet, xVar, i2), new yi5.b(25));
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
