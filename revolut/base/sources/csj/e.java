package csj;

import a83.c0;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetCategoryBudgetsScreen f108478w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SetCategoryBudgetsScreen setCategoryBudgetsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108478w = setCategoryBudgetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f108478w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f108478w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        List list2;
        int i = this.u;
        SetCategoryBudgetsScreen setCategoryBudgetsScreen = this.f108478w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT2 = setCategoryBudgetsScreen.T2();
                Intrinsics.h(menuItemId);
                u uVar = (u) nVarT2;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("ITEM_ID_RESET")) {
                    g gVar = (g) ((i) uVar.t2()).f108482a.getContent();
                    if (gVar != null && (list = gVar.f108480b) != null) {
                        List<CategoryBudgetEditingInfo> list3 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                        for (CategoryBudgetEditingInfo categoryBudgetEditingInfo : list3) {
                            arrayList.add(CategoryBudgetEditingInfo.a(categoryBudgetEditingInfo, dj0.d.c(categoryBudgetEditingInfo.f101549c, 0L, null, 2)));
                        }
                        uVar.x2(new c0(15, arrayList));
                    }
                } else if (menuItemId.equals("ITEM_ID_SKIP")) {
                    uVar.y2();
                }
                break;
            default:
                j enteredCategoryData = (j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) setCategoryBudgetsScreen.T2();
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(enteredCategoryData, "enteredCategoryData");
                g gVar2 = (g) ((i) uVar2.t2()).f108482a.getContent();
                if (gVar2 != null && (list2 = gVar2.f108480b) != null) {
                    CategoryBudgetEditingInfo categoryBudgetEditingInfo2 = enteredCategoryData.f108483a;
                    CategoryBudgetEditingInfo categoryBudgetEditingInfoA = CategoryBudgetEditingInfo.a(categoryBudgetEditingInfo2, new dj0.d(uVar2.u.b(enteredCategoryData.f108484b, categoryBudgetEditingInfo2.f101549c.f115083b.f306286a), categoryBudgetEditingInfo2.f101549c.f115083b));
                    int size = list2.size();
                    ArrayList arrayListF1 = d0.f1(list2);
                    Iterator it8 = arrayListF1.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it8.hasNext()) {
                            i2 = -1;
                        } else if (!Intrinsics.f(((CategoryBudgetEditingInfo) it8.next()).f101547a, categoryBudgetEditingInfo2.f101547a)) {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        arrayListF1.set(i2, categoryBudgetEditingInfoA);
                    } else {
                        arrayListF1.add(size, categoryBudgetEditingInfoA);
                    }
                    uVar2.x2(new c0(14, arrayListF1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
