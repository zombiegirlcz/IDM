package d88;

import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import eb8.l;
import eb8.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import sf8.m;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f112140b;

    public /* synthetic */ b(g gVar, int i) {
        this.f112139a = i;
        this.f112140b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        g gVar;
        List listC;
        m mVar;
        g88.g gVar2;
        switch (this.f112139a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar = (fo3.c) pair.f186385a;
                ArrayList arrayListA = g.a((List) pair.f186386b);
                if (!arrayListA.isEmpty()) {
                    return nim.a.v(rd0.e.b(this.f112140b.f112156m.O(arrayListA, false, cVar.d)), new atg.c(cVar, 1));
                }
                i.Companion.getClass();
                return new go.g(new Data(i.f224256b, null, false, 6, null), 2);
            case 1:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                List listP0 = d0.P0(list, new a9j.f(new f(), 19));
                ArrayList arrayList = new ArrayList();
                Iterator it8 = listP0.iterator();
                while (it8.hasNext()) {
                    c cVar2 = (c) it8.next();
                    m mVar2 = cVar2.f112141a;
                    Data data7 = cVar2.f112142b;
                    Data data8 = cVar2.f112143c;
                    Data data9 = cVar2.d;
                    Data data10 = cVar2.e;
                    Data data11 = cVar2.f;
                    Data data12 = cVar2.f112144g;
                    i iVar = cVar2.f112145h;
                    i iVar2 = cVar2.i;
                    Data data13 = cVar2.f112146j;
                    Data data14 = cVar2.k;
                    Data data15 = (Data) iVar.f224257a;
                    g gVar3 = this.f112140b;
                    Iterator it9 = it8;
                    l lVar = l.f124309a;
                    if (data15 != null) {
                        g88.i iVar3 = gVar3.f112155l;
                        List list3 = (List) data15.getContent();
                        if (list3 == null) {
                            list3 = f0.f322471a;
                        }
                        List list4 = (List) data8.getContent();
                        Boolean bool = (Boolean) data9.getContent();
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        n nVar = (n) data10.getContent();
                        if (nVar == null) {
                            nVar = lVar;
                        }
                        do3.n nVar2 = (do3.n) data11.getContent();
                        if (nVar2 == null) {
                            throw new IllegalStateException("Parent profile is required");
                        }
                        Boolean bool2 = (Boolean) data12.getContent();
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        Boolean bool3 = (Boolean) data13.getContent();
                        List list5 = list3;
                        boolean z = zBooleanValue2;
                        data6 = data7;
                        gVar = gVar3;
                        data = data8;
                        data2 = data9;
                        boolean z3 = zBooleanValue;
                        data3 = data10;
                        n nVar3 = nVar;
                        data4 = data11;
                        data5 = data12;
                        listC = iVar3.b(list5, mVar2, list4, z3, list2, nVar3, nVar2, z, iVar2, bool3 != null ? bool3.booleanValue() : false, (mf8.e) data14.getContent());
                        mVar2 = mVar2;
                        if (listC != null) {
                            continue;
                        }
                        a0.x(listC, arrayList);
                        it8 = it9;
                    } else {
                        data = data8;
                        data2 = data9;
                        data3 = data10;
                        data4 = data11;
                        data5 = data12;
                        data6 = data7;
                        gVar = gVar3;
                    }
                    g88.g gVar4 = gVar.f112151c;
                    List list6 = (List) data6.getContent();
                    if (list6 == null) {
                        list6 = f0.f322471a;
                    }
                    List list7 = (List) data.getContent();
                    Boolean bool4 = (Boolean) data2.getContent();
                    boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                    n nVar4 = (n) data3.getContent();
                    if (nVar4 == null) {
                        nVar4 = lVar;
                    }
                    do3.n nVar5 = (do3.n) data4.getContent();
                    if (nVar5 == null) {
                        throw new IllegalStateException("Parent profile is required");
                    }
                    Boolean bool5 = (Boolean) data5.getContent();
                    listC = u.c(gVar4.a(mVar2, list6, list7, zBooleanValue3, list2, nVar4, nVar5, bool5 != null ? bool5.booleanValue() : false));
                    a0.x(listC, arrayList);
                    it8 = it9;
                }
                return arrayList;
            default:
                f78.b accountWithExtraData = (f78.b) obj2;
                Intrinsics.checkNotNullParameter(accountWithExtraData, "accountWithExtraData");
                g gVar5 = this.f112140b;
                if (((jte.d) gVar5.f112154j).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
                    g88.i iVar4 = gVar5.f112155l;
                    List list8 = accountWithExtraData.o;
                    m mVarC = gVar5.c(accountWithExtraData);
                    List list9 = (List) accountWithExtraData.f132576j.getContent();
                    Boolean bool6 = (Boolean) accountWithExtraData.k.getContent();
                    boolean zBooleanValue4 = bool6 != null ? bool6.booleanValue() : false;
                    List list10 = (List) accountWithExtraData.f132577l.getContent();
                    if (list10 == null) {
                        list10 = f0.f322471a;
                    }
                    List list11 = list10;
                    n nVar6 = accountWithExtraData.f132578m;
                    do3.n nVar7 = accountWithExtraData.f132575h;
                    Boolean bool7 = (Boolean) accountWithExtraData.f132579n.getContent();
                    boolean zBooleanValue5 = bool7 != null ? bool7.booleanValue() : false;
                    i iVar5 = accountWithExtraData.f132580p;
                    Boolean bool8 = (Boolean) accountWithExtraData.f132581q.getContent();
                    return iVar4.b(list8, mVarC, list9, zBooleanValue4, list11, nVar6, nVar7, zBooleanValue5, iVar5, bool8 != null ? bool8.booleanValue() : false, (mf8.e) accountWithExtraData.f132582r.getContent());
                }
                g88.g gVar6 = gVar5.f112151c;
                m mVarC2 = gVar5.c(accountWithExtraData);
                List list12 = (List) accountWithExtraData.i.getContent();
                if (list12 == null) {
                    list12 = f0.f322471a;
                }
                List list13 = (List) accountWithExtraData.f132576j.getContent();
                Boolean bool9 = (Boolean) accountWithExtraData.k.getContent();
                boolean zBooleanValue6 = bool9 != null ? bool9.booleanValue() : false;
                List list14 = (List) accountWithExtraData.f132577l.getContent();
                if (list14 == null) {
                    list14 = f0.f322471a;
                }
                n nVar8 = accountWithExtraData.f132578m;
                boolean zBooleanValue7 = false;
                List list15 = list12;
                boolean z4 = zBooleanValue6;
                List list16 = list14;
                do3.n nVar9 = accountWithExtraData.f132575h;
                Boolean bool10 = (Boolean) accountWithExtraData.f132579n.getContent();
                if (bool10 != null) {
                    mVar = mVarC2;
                    gVar2 = gVar6;
                    zBooleanValue7 = bool10.booleanValue();
                } else {
                    mVar = mVarC2;
                    gVar2 = gVar6;
                }
                return u.c(gVar2.a(mVar, list15, list13, z4, list16, nVar8, nVar9, zBooleanValue7));
        }
    }
}
