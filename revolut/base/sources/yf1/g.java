package yf1;

import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddNewProductScreen f313120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AddNewProductScreen addNewProductScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313120w = addNewProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f313120w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f313120w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        List list2;
        int i = this.u;
        qf1.c cVar = null;
        AddNewProductScreen addNewProductScreen = this.f313120w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = AddNewProductScreen.T;
                Tabs addNewProductTabs = addNewProductScreen.d3().d;
                Intrinsics.checkNotNullExpressionValue(addNewProductTabs, "addNewProductTabs");
                knm.b.z(addNewProductTabs, !bool.booleanValue(), null, 14);
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t60.a aVar3 = (t60.a) pair.f186385a;
                t60.a currentState = (t60.a) pair.f186386b;
                o oVarR2 = addNewProductScreen.R2();
                Intrinsics.h(currentState);
                y yVar = (y) oVarR2;
                cli.y yVar2 = yVar.v;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                int i2 = currentState.f268122c;
                int i3 = currentState.d;
                b0 b0Var = yVar.o;
                IntRange positions = new IntRange(i2, i3, 1);
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(positions, "positions");
                q qVar = (q) b0Var.f313115a.getValue();
                boolean z = false;
                if (qVar == null || (list2 = qVar.f313131b) == null || zhm.v.j(list2) < i2) {
                    list = f0.f322471a;
                } else {
                    int iMax = Math.max(0, i2);
                    ArrayList arrayList = new ArrayList();
                    for (int iMin = Math.min(zhm.v.j(list2), positions.f186449b); -1 < iMin; iMin--) {
                        cg1.a aVar4 = (cg1.a) list2.get(iMin);
                        if (aVar4 instanceof cg1.b) {
                            arrayList.add(((cg1.b) aVar4).f23855a);
                            if (iMin <= iMax) {
                                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                                Collections.reverse(arrayList);
                                list = arrayList;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    Collections.reverse(arrayList);
                    list = arrayList;
                }
                Object obj3 = ((m) ((j2) yVar2.f22677a).getValue()).d;
                Object obj4 = ((m) ((j2) yVar2.f22677a).getValue()).e;
                if (obj4 == null || list.contains(obj4)) {
                    if (obj4 != null) {
                        yVar.H2(yVar2, new ye1.m(11));
                    } else {
                        if (aVar3 != null && currentState.f268120a < aVar3.f268120a) {
                            z = true;
                        }
                        if (obj3 == null || i2 == 0 || !list.contains(obj3)) {
                            cVar = (qf1.c) d0.d0(list);
                        } else if (z && obj3 != d0.d0(list)) {
                            cVar = (qf1.c) d0.d0(list);
                        }
                        if (cVar != null) {
                            yVar.H2(yVar2, new t(cVar, 1));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
