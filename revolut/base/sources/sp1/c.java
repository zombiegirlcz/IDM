package sp1;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import gp1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {
    public static final BillInputV2 a(gp1.b bVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List inputs = bVar.getInputs();
        if (inputs != null) {
            List list = inputs;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(a((gp1.b) it8.next()));
            }
        } else {
            arrayList = null;
        }
        xo1.c type = bVar.getType();
        int i = type == null ? -1 : b.f264874a[type.ordinal()];
        if (i == -1) {
            String name = bVar.getName();
            List list2 = arrayList;
            if (arrayList == null) {
                list2 = f0.f322471a;
            }
            return new BillInputV2.BillInputUntypedInputs(name, null, list2);
        }
        if (i == 1) {
            gp1.d value = bVar.getValue();
            d.a aVar = value instanceof d.a ? (d.a) value : null;
            if (aVar == null) {
                throw new IllegalStateException("ADDRESS without address value");
            }
            String name2 = bVar.getName();
            if (name2 != null) {
                return new BillInputV2.BillInputAddress(name2, arrayList, oo3.a.a(aVar.f145217a));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 2) {
            gp1.d value2 = bVar.getValue();
            d.b bVar2 = value2 instanceof d.b ? (d.b) value2 : null;
            if (bVar2 == null) {
                throw new IllegalStateException("MONEY without money value");
            }
            String name3 = bVar.getName();
            if (name3 != null) {
                return new BillInputV2.BillInputMoney(mo3.a.o(bVar2.f145218a), name3, arrayList);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 3) {
            String name4 = bVar.getName();
            List list3 = arrayList;
            if (name4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (arrayList == null) {
                list3 = f0.f322471a;
            }
            return new BillInputV2.BillInputNested(name4, list3);
        }
        if (i == 4) {
            String name5 = bVar.getName();
            List list4 = arrayList;
            if (name5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (arrayList == null) {
                list4 = f0.f322471a;
            }
            return new BillInputV2.BillInputRepeaterDropdown(name5, list4);
        }
        if (i != 5) {
            gp1.d value3 = bVar.getValue();
            d.c cVar = value3 instanceof d.c ? (d.c) value3 : null;
            String str = cVar != null ? cVar.f145219a : null;
            String name6 = bVar.getName();
            if (name6 != null) {
                return new BillInputV2.BillInputText(name6, bVar.getType(), arrayList, str);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        String name7 = bVar.getName();
        List list5 = arrayList;
        if (name7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (arrayList == null) {
            list5 = f0.f322471a;
        }
        return new BillInputV2.BillInputRepeater(name7, list5);
    }

    public static final gp1.c b(BillInputV2 billInputV2) {
        Intrinsics.checkNotNullParameter(billInputV2, "<this>");
        ArrayList arrayList = null;
        if (billInputV2 instanceof BillInputV2.BillInputAddress) {
            BillInputV2.BillInputAddress billInputAddress = (BillInputV2.BillInputAddress) billInputV2;
            String str = billInputAddress.f61301a;
            xo1.c cVar = billInputAddress.f61302b;
            Address address = billInputAddress.d;
            no3.b bVarD = address != null ? oo3.a.d(address) : null;
            List list = billInputAddress.f61303c;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(b((BillInputV2) it8.next()));
                }
            }
            return new gp1.c(str, cVar, bVarD, arrayList);
        }
        if (billInputV2 instanceof BillInputV2.BillInputMoney) {
            BillInputV2.BillInputMoney billInputMoney = (BillInputV2.BillInputMoney) billInputV2;
            String str2 = billInputMoney.f61304a;
            xo1.c cVar2 = billInputMoney.f61305b;
            dj0.d dVar = billInputMoney.d;
            jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
            List list3 = billInputMoney.f61306c;
            if (list3 != null) {
                List list4 = list3;
                arrayList = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList.add(b((BillInputV2) it9.next()));
                }
            }
            return new gp1.c(str2, cVar2, aVarP, arrayList);
        }
        if (billInputV2 instanceof BillInputV2.BillInputText) {
            BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) billInputV2;
            String str3 = billInputText.f61316a;
            xo1.c cVar3 = xo1.c.TEXT;
            String str4 = billInputText.d;
            List list5 = billInputText.f61318c;
            if (list5 != null) {
                List list6 = list5;
                arrayList = new ArrayList(w.t(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    arrayList.add(b((BillInputV2) it10.next()));
                }
            }
            return new gp1.c(str3, cVar3, str4, arrayList);
        }
        if (billInputV2 instanceof BillInputV2.BillInputNested) {
            BillInputV2.BillInputNested billInputNested = (BillInputV2.BillInputNested) billInputV2;
            String str5 = billInputNested.f61307a;
            xo1.c cVar4 = billInputNested.f61308b;
            List list7 = billInputNested.f61309c;
            ArrayList arrayList2 = new ArrayList(w.t(list7, 10));
            Iterator it11 = list7.iterator();
            while (it11.hasNext()) {
                arrayList2.add(b((BillInputV2) it11.next()));
            }
            return new gp1.c(str5, cVar4, null, arrayList2);
        }
        if (billInputV2 instanceof BillInputV2.BillInputRepeaterDropdown) {
            BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = (BillInputV2.BillInputRepeaterDropdown) billInputV2;
            String str6 = billInputRepeaterDropdown.f61313a;
            xo1.c cVar5 = billInputRepeaterDropdown.f61314b;
            List list8 = billInputRepeaterDropdown.f61315c;
            ArrayList arrayList3 = new ArrayList(w.t(list8, 10));
            Iterator it12 = list8.iterator();
            while (it12.hasNext()) {
                arrayList3.add(b((BillInputV2) it12.next()));
            }
            return new gp1.c(str6, cVar5, null, arrayList3);
        }
        if (billInputV2 instanceof BillInputV2.BillInputRepeater) {
            BillInputV2.BillInputRepeater billInputRepeater = (BillInputV2.BillInputRepeater) billInputV2;
            String str7 = billInputRepeater.f61310a;
            xo1.c cVar6 = billInputRepeater.f61311b;
            List list9 = billInputRepeater.f61312c;
            ArrayList arrayList4 = new ArrayList(w.t(list9, 10));
            Iterator it13 = list9.iterator();
            while (it13.hasNext()) {
                arrayList4.add(b((BillInputV2) it13.next()));
            }
            return new gp1.c(str7, cVar6, null, arrayList4);
        }
        if (!(billInputV2 instanceof BillInputV2.BillInputUntypedInputs)) {
            throw new NoWhenBranchMatchedException();
        }
        BillInputV2.BillInputUntypedInputs billInputUntypedInputs = (BillInputV2.BillInputUntypedInputs) billInputV2;
        String str8 = billInputUntypedInputs.f61319a;
        List list10 = billInputUntypedInputs.f61321c;
        ArrayList arrayList5 = new ArrayList(w.t(list10, 10));
        Iterator it14 = list10.iterator();
        while (it14.hasNext()) {
            arrayList5.add(b((BillInputV2) it14.next()));
        }
        return new gp1.c(str8, null, null, arrayList5);
    }
}
