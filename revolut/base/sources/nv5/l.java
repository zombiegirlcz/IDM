package nv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.main_accounts.MainAccountsWidgetContract$Parcel$ActionButtonParcel;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nuc.n;
import oim.p;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements p {
    public final /* synthetic */ CryptoInvestmentsSortingType A;
    public final /* synthetic */ st5.b B;
    public final /* synthetic */ boolean C;
    public /* synthetic */ Data u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f219503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ List f219504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f219505y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, CryptoInvestmentsSortingType cryptoInvestmentsSortingType, st5.b bVar, boolean z, Continuation continuation) {
        super(6, continuation);
        this.z = mVar;
        this.A = cryptoInvestmentsSortingType;
        this.B = bVar;
        this.C = z;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        st5.b bVar = this.B;
        boolean z = this.C;
        l lVar = new l(this.z, this.A, bVar, z, (Continuation) obj7);
        lVar.u = (Data) obj2;
        lVar.v = (List) obj3;
        lVar.f219503w = (List) obj4;
        lVar.f219504x = (List) obj5;
        lVar.f219505y = (SplitAccountsItemGroup) obj6;
        return lVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        final List list = this.v;
        final List list2 = this.f219503w;
        final List list3 = this.f219504x;
        final SplitAccountsItemGroup splitAccountsItemGroup = this.f219505y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = new n(4);
        nsl.d dVar = new nsl.d(9);
        final m mVar = this.z;
        final CryptoInvestmentsSortingType cryptoInvestmentsSortingType = this.A;
        final st5.b bVar = this.B;
        final boolean z = this.C;
        return iii.c.f(data, nVar, dVar, new Function3() { // from class: nv5.k
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Collection collectionA;
                i iVar;
                Object next;
                Object next2;
                rt5.h pocketsData = (rt5.h) obj3;
                ((Boolean) obj4).getClass();
                m mVar2 = mVar;
                i iVar2 = mVar2.f219507b;
                gv5.k kVar = mVar2.f219506a;
                Intrinsics.checkNotNullParameter(pocketsData, "pocketsData");
                List stakeableCurrencies = list2;
                Intrinsics.checkNotNullParameter(stakeableCurrencies, "stakeableCurrencies");
                List autoStakingActiveCurrencies = list3;
                Intrinsics.checkNotNullParameter(autoStakingActiveCurrencies, "autoStakingActiveCurrencies");
                List list4 = stakeableCurrencies;
                ArrayList arrayList = new ArrayList(w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((xi0.b) it8.next()).f306286a);
                }
                Set setI1 = d0.i1(arrayList);
                List list5 = autoStakingActiveCurrencies;
                ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((xi0.b) it9.next()).f306286a);
                }
                Set setI12 = d0.i1(arrayList2);
                List list6 = pocketsData.f257199a;
                ArrayList<rt5.f> arrayList3 = new ArrayList();
                for (Object obj6 : list6) {
                    if (!((rt5.f) obj6).f257193a.k()) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                for (rt5.f fVar : arrayList3) {
                    xi0.b bVar2 = fVar.f257193a.f115083b;
                    xi0.b bVar3 = fVar.f257195c;
                    String str = bVar2.f306286a;
                    gv5.h hVar = setI12.contains(str) ? gv5.h.ACTIVE : setI1.contains(str) ? gv5.h.AVAILABLE : gv5.h.UNAVAILABLE;
                    gv5.j jVar = iVar2.f219497a;
                    Iterator it10 = pocketsData.f257200b.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            iVar = iVar2;
                            next = null;
                            break;
                        }
                        next = it10.next();
                        rt5.b bVar4 = (rt5.b) next;
                        iVar = iVar2;
                        if (Intrinsics.f(bVar4.f257188a, bVar2) && Intrinsics.f(bVar4.f257189b.f126704b, bVar3)) {
                            break;
                        }
                        iVar2 = iVar;
                    }
                    rt5.b bVar5 = (rt5.b) next;
                    Iterator it11 = pocketsData.f257201c.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it11.next();
                        if (Intrinsics.f(((rt5.g) next2).f257196a, bVar2)) {
                            break;
                        }
                    }
                    arrayList4.add(jVar.a(fVar, bVar5, (rt5.g) next2, hVar, false, SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel.MainItemParcel.f71413a));
                    iVar2 = iVar;
                }
                ArrayList arrayListB = kVar.b(kVar.c(mVar2.f.a(arrayList4, list), cryptoInvestmentsSortingType));
                SplitAccountsItemGroup splitAccountsItemGroup2 = splitAccountsItemGroup;
                SplitAccountsItemGroup.Empty empty = SplitAccountsItemGroup.Empty.f71455a;
                if (Intrinsics.f(splitAccountsItemGroup2, empty)) {
                    collectionA = f0.f322471a;
                } else if (splitAccountsItemGroup2 instanceof SplitAccountsItemGroup.ErrorGroup) {
                    collectionA = u.c(((SplitAccountsItemGroup.ErrorGroup) splitAccountsItemGroup2).f71456a);
                } else if (splitAccountsItemGroup2 instanceof SplitAccountsItemGroup.LoadingGroup) {
                    collectionA = ((SplitAccountsItemGroup.LoadingGroup) splitAccountsItemGroup2).f71470a;
                } else if (splitAccountsItemGroup2 instanceof SplitAccountsItemGroup.ItemsGroup) {
                    collectionA = ((SplitAccountsItemGroup.ItemsGroup) splitAccountsItemGroup2).f71467a;
                } else if (splitAccountsItemGroup2 instanceof SplitAccountsItemGroup.GroupWithHeader) {
                    aim.e eVarB = u.b();
                    SplitAccountsItemGroup.GroupWithHeader groupWithHeader = (SplitAccountsItemGroup.GroupWithHeader) splitAccountsItemGroup2;
                    eVarB.addAll(groupWithHeader.f71464c);
                    eVarB.addAll(groupWithHeader.d);
                    eVarB.addAll(groupWithHeader.e);
                    collectionA = u.a(eVarB);
                } else {
                    if (!(splitAccountsItemGroup2 instanceof SplitAccountsItemGroup.GroupWithActionHeader)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "MainAccountsWidgetItemsProvider", "Main accounts do not support an action header group", null, h0Var);
                    collectionA = f0.f322471a;
                }
                ArrayList arrayListE0 = d0.E0(arrayListB, collectionA);
                return arrayListE0.isEmpty() ? empty : new SplitAccountsItemGroup.ItemsGroup(arrayListE0, !z, bVar.b(), MainAccountsWidgetContract$Parcel$ActionButtonParcel.f71450a);
            }
        });
    }
}
