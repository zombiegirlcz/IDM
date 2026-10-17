package khe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import com.revolut.feature.tab.accounts.impl.total_wealth.models.TotalWealthCategoryViewInfo;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;
import vge.t3;
import vge.z2;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public ArrayList u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a f184113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f184114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SpaceContentListMapper$ItemParcel.SubspaceValueItem f184115y;
    public final /* synthetic */ RowDelegate.Model z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItem, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f184113w = aVar;
        this.f184114x = productAccountDescriptor$Value;
        this.f184115y = subspaceValueItem;
        this.z = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.f184113w, this.f184114x, this.f184115y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        ProductAccountDescriptor$Value descriptor = this.f184114x;
        boolean z = true;
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar2 = this.f184113w;
        if (i == 0) {
            yhm.o.b(obj2);
            z2 z2Var = aVar2.f89597s;
            this.v = 1;
            obj2 = ((t3) z2Var).e(descriptor);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.u;
            yhm.o.b(obj2);
            aVar2.f89598t.e(this.z.f53228a, zi0.c.d(arrayList), mw0.o.VIEW_BOUNDS, new mw0.l(false));
            return Unit.f186387a;
        }
        yhm.o.b(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        TotalWealthCategoryViewInfo totalWealthCategoryViewInfo = (TotalWealthCategoryViewInfo) ((TotalWealthCategoryListContract$State) ((j2) aVar2.F.f22677a).getValue()).f89589b.getContent();
        if (totalWealthCategoryViewInfo == null) {
            return Unit.f186387a;
        }
        if (!zBooleanValue) {
            Iterator it8 = totalWealthCategoryViewInfo.f89605a.iterator();
            int i2 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((SpaceContentModel) it8.next()).f89558c.iterator();
                int size = 0;
                while (it9.hasNext()) {
                    List f = ((SubSpaceContentModel) it9.next()).getF();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : f) {
                        if (((SubSpaceAccountItem) obj3).f89560b instanceof ProductAccount.ValueItem.Main) {
                            arrayList2.add(obj3);
                        }
                    }
                    size += arrayList2.size();
                }
                i2 += size;
            }
            if (i2 < 2) {
                z = false;
            }
        }
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b bVar = aVar2.f89594p;
        boolean z3 = this.f184115y.f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayListE0 = d0.E0(zhm.v.l(bVar.f89604c.a(descriptor, z3)), z ? mge.a.b(descriptor, zBooleanValue) : f0.f322471a);
        if (arrayListE0.isEmpty()) {
            return Unit.f186387a;
        }
        this.u = arrayListE0;
        this.v = 2;
        if (k0.b(300L, this) != aVar) {
            arrayList = arrayListE0;
            aVar2.f89598t.e(this.z.f53228a, zi0.c.d(arrayList), mw0.o.VIEW_BOUNDS, new mw0.l(false));
            return Unit.f186387a;
        }
        return aVar;
    }
}
