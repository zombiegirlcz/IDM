package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1j.b f288950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(t1j.b bVar, Continuation continuation) {
        super(3, continuation);
        this.f288950w = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m1 m1Var = new m1(this.f288950w, (Continuation) obj4);
        m1Var.u = (List) obj2;
        m1Var.v = (List) obj3;
        return m1Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t1j.b bVar;
        SubSpaceContentModel subSpaceContentModelC;
        List list = this.u;
        List list2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list3 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            bVar = this.f288950w;
            if (!zHasNext) {
                break;
            }
            arrayList.add(t1j.b.a(bVar, (ProductAccountDescriptor$Value.Discover) it8.next()));
        }
        Set setI1 = zhm.d0.i1(arrayList);
        List<SpaceContentModel> list4 = list;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
        for (SpaceContentModel spaceContentModel : list4) {
            List<SubSpaceContentModel> list5 = spaceContentModel.f89558c;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
            for (SubSpaceContentModel subSpaceContentModel : list5) {
                List f = subSpaceContentModel.getF();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : f) {
                    SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) obj3;
                    ProductAccount productAccount = subSpaceAccountItem.f89560b;
                    if (!(productAccount instanceof ProductAccount.ValueItem.Discover) || !setI1.contains(t1j.b.a(bVar, com.revolut.feature.tab.accounts.api.model.a.b(productAccount, subSpaceAccountItem.f89559a.f89553a)))) {
                        arrayList4.add(obj3);
                    }
                }
                if (subSpaceContentModel instanceof SubSpaceContentModel.FlatSubSpaceContentModel) {
                    subSpaceContentModelC = SubSpaceContentModel.FlatSubSpaceContentModel.c((SubSpaceContentModel.FlatSubSpaceContentModel) subSpaceContentModel, arrayList4);
                } else {
                    if (!(subSpaceContentModel instanceof SubSpaceContentModel.GroupedSubSpaceContentModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subSpaceContentModelC = SubSpaceContentModel.GroupedSubSpaceContentModel.c((SubSpaceContentModel.GroupedSubSpaceContentModel) subSpaceContentModel, false, arrayList4, 15);
                }
                arrayList3.add(subSpaceContentModelC);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (!((SubSpaceContentModel) obj4).getF().isEmpty()) {
                    arrayList5.add(obj4);
                }
            }
            arrayList2.add(SpaceContentModel.a(spaceContentModel, arrayList5));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList2) {
            if (!((SpaceContentModel) obj5).f89558c.isEmpty()) {
                arrayList6.add(obj5);
            }
        }
        return arrayList6;
    }
}
