package of9;

import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(java.util.List r5) {
        /*
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lb2
            java.lang.Object r1 = r5.next()
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r1
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputAddress
            r3 = 0
            if (r2 == 0) goto L2d
            r2 = r1
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputAddress r2 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputAddress) r2
            com.revolut.feature.address.models.Address r2 = r2.d
            if (r2 == 0) goto L2a
            goto La5
        L2a:
            r1 = r3
            goto La5
        L2d:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputMoney
            if (r2 == 0) goto L3a
            r2 = r1
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputMoney r2 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputMoney) r2
            dj0.d r2 = r2.d
            if (r2 == 0) goto L2a
            goto La5
        L3a:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputText
            if (r2 == 0) goto L62
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputText r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputText) r1
            java.lang.String r2 = r1.d
            if (r2 == 0) goto L2a
            int r2 = r2.length()
            if (r2 != 0) goto L4b
            goto L2a
        L4b:
            java.util.List r2 = r1.f61318c
            if (r2 != 0) goto L50
            goto La5
        L50:
            java.util.ArrayList r2 = a(r2)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L5b
            r2 = r3
        L5b:
            r4 = 11
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputText r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputText.c(r1, r2, r3, r4)
            goto La5
        L62:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputNested
            if (r2 == 0) goto L73
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputNested r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputNested) r1
            java.util.List r2 = r1.f61309c
            java.util.ArrayList r2 = a(r2)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputNested r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputNested.c(r1, r2)
            goto La5
        L73:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown
            if (r2 == 0) goto L84
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeaterDropdown r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown) r1
            java.util.List r2 = r1.f61315c
            java.util.ArrayList r2 = a(r2)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeaterDropdown r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown.c(r1, r2)
            goto La5
        L84:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater
            if (r2 == 0) goto L95
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeater r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater) r1
            java.util.List r2 = r1.f61312c
            java.util.ArrayList r2 = a(r2)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeater r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater.c(r1, r2)
            goto La5
        L95:
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs
            if (r2 == 0) goto Lac
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputUntypedInputs r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs) r1
            java.util.List r2 = r1.f61321c
            java.util.ArrayList r2 = a(r2)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputUntypedInputs r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs.c(r1, r2)
        La5:
            if (r1 == 0) goto L10
            r0.add(r1)
            goto L10
        Lac:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of9.d.a(java.util.List):java.util.ArrayList");
    }

    public static final BillInputV2 b(BillInputV2 billInputV2, Function1 function1) {
        if (billInputV2 instanceof BillInputV2.BillInputNested) {
            BillInputV2.BillInputNested billInputNested = (BillInputV2.BillInputNested) billInputV2;
            return BillInputV2.BillInputNested.c(billInputNested, (List) function1.invoke(billInputNested.f61309c));
        }
        if (billInputV2 instanceof BillInputV2.BillInputUntypedInputs) {
            BillInputV2.BillInputUntypedInputs billInputUntypedInputs = (BillInputV2.BillInputUntypedInputs) billInputV2;
            return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs, (List) function1.invoke(billInputUntypedInputs.f61321c));
        }
        if (billInputV2 instanceof BillInputV2.BillInputRepeater) {
            BillInputV2.BillInputRepeater billInputRepeater = (BillInputV2.BillInputRepeater) billInputV2;
            return BillInputV2.BillInputRepeater.c(billInputRepeater, (List) function1.invoke(billInputRepeater.f61312c));
        }
        if (!(billInputV2 instanceof BillInputV2.BillInputRepeaterDropdown)) {
            return billInputV2;
        }
        BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = (BillInputV2.BillInputRepeaterDropdown) billInputV2;
        return BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, (List) function1.invoke(billInputRepeaterDropdown.f61315c));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList c(java.lang.String r6, java.lang.String r7, java.util.List r8) {
        /*
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L11:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r1 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r1
            boolean r2 = r1 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown
            if (r2 == 0) goto L59
            r2 = r1
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeaterDropdown r2 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown) r2
            java.lang.String r3 = r2.f61313a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r7)
            if (r3 == 0) goto L59
            java.util.List r1 = r2.f61315c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r5 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r5
            java.lang.String r5 = r5.getF61319a()
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L39
            r3.add(r4)
            goto L39
        L54:
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeaterDropdown r1 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeaterDropdown.c(r2, r3)
            goto L64
        L59:
            avj.o r2 = new avj.o
            r3 = 24
            r2.<init>(r6, r7, r3)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r1 = b(r1, r2)
        L64:
            r0.add(r1)
            goto L11
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of9.d.c(java.lang.String, java.lang.String, java.util.List):java.util.ArrayList");
    }

    public static final ArrayList d(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((BillInputV2) obj2).getF61319a(), str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(b((BillInputV2) it8.next(), new o23.l(str, 16)));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList e(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13) {
        /*
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = zhm.w.t(r13, r1)
            r0.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L11:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r13.next()
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r2 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r2
            boolean r3 = r2 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs
            if (r3 == 0) goto L9a
            r3 = r2
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputUntypedInputs r3 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs) r3
            java.util.List r4 = r3.f61321c
            java.lang.String r5 = r3.f61319a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r11)
            if (r5 == 0) goto L9a
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r5 = foh.i.g(r10, r4)
            boolean r6 = r5 instanceof com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater
            if (r6 == 0) goto L39
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeater r5 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater) r5
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 != 0) goto L3d
            goto La4
        L3d:
            java.util.List r2 = r5.f61312c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r8 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r8
            java.lang.String r8 = r8.getF61319a()
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r12)
            if (r8 != 0) goto L4a
            r6.add(r7)
            goto L4a
        L65:
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeater r2 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputRepeater.c(r5, r6)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = zhm.w.t(r4, r1)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L78:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L95
            java.lang.Object r7 = r4.next()
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r7 = (com.revolut.feature.apm.bills.core.api.model.BillInputV2) r7
            java.lang.String r8 = r7.getF61319a()
            java.lang.String r9 = r5.f61310a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L91
            r7 = r2
        L91:
            r6.add(r7)
            goto L78
        L95:
            com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputUntypedInputs r2 = com.revolut.feature.apm.bills.core.api.model.BillInputV2.BillInputUntypedInputs.c(r3, r6)
            goto La4
        L9a:
            be7.m r3 = new be7.m
            r4 = 5
            r3.<init>(r10, r11, r12, r4)
            com.revolut.feature.apm.bills.core.api.model.BillInputV2 r2 = b(r2, r3)
        La4:
            r0.add(r2)
            goto L11
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of9.d.e(java.lang.String, java.lang.String, java.lang.String, java.util.List):java.util.ArrayList");
    }

    public static final BillInputV2 f(BillInputV2 input, String targetName, ArrayList newChildInputs, String str, String str2) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        Intrinsics.checkNotNullParameter(newChildInputs, "newChildInputs");
        if (input instanceof BillInputV2.BillInputNested) {
            BillInputV2.BillInputNested billInputNested = (BillInputV2.BillInputNested) input;
            if (Intrinsics.f(billInputNested.f61307a, targetName)) {
                return BillInputV2.BillInputNested.c(billInputNested, newChildInputs);
            }
            List list = billInputNested.f61309c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(f((BillInputV2) it8.next(), targetName, newChildInputs, str, str2));
            }
            return BillInputV2.BillInputNested.c(billInputNested, arrayList);
        }
        if (!(input instanceof BillInputV2.BillInputUntypedInputs)) {
            if (!(input instanceof BillInputV2.BillInputRepeaterDropdown)) {
                return input;
            }
            BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = (BillInputV2.BillInputRepeaterDropdown) input;
            String str3 = billInputRepeaterDropdown.f61313a;
            List list2 = billInputRepeaterDropdown.f61315c;
            if (Intrinsics.f(str3, targetName)) {
                return BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, newChildInputs);
            }
            if (!Intrinsics.f(str3, str)) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(f((BillInputV2) it9.next(), targetName, newChildInputs, str, str2));
                }
                return BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, arrayList2);
            }
            BillInputV2 billInputV2G = foh.i.g(targetName, list2);
            BillInputV2.BillInputUntypedInputs billInputUntypedInputs = billInputV2G instanceof BillInputV2.BillInputUntypedInputs ? (BillInputV2.BillInputUntypedInputs) billInputV2G : null;
            if (billInputUntypedInputs == null) {
                return BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, d0.F0(new BillInputV2.BillInputUntypedInputs(targetName, null, newChildInputs), list2));
            }
            BillInputV2.BillInputUntypedInputs billInputUntypedInputsC = BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs, newChildInputs);
            List<BillInputV2> list4 = list2;
            ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
            for (BillInputV2 billInputV2 : list4) {
                if (Intrinsics.f(billInputV2, billInputUntypedInputs)) {
                    billInputV2 = billInputUntypedInputsC;
                }
                arrayList3.add(billInputV2);
            }
            return BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, arrayList3);
        }
        BillInputV2.BillInputUntypedInputs billInputUntypedInputs2 = (BillInputV2.BillInputUntypedInputs) input;
        String str4 = billInputUntypedInputs2.f61319a;
        List list5 = billInputUntypedInputs2.f61321c;
        if (Intrinsics.f(str4, targetName)) {
            return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs2, newChildInputs);
        }
        if (!Intrinsics.f(str4, str)) {
            List list6 = list5;
            ArrayList arrayList4 = new ArrayList(w.t(list6, 10));
            Iterator it10 = list6.iterator();
            while (it10.hasNext()) {
                arrayList4.add(f((BillInputV2) it10.next(), targetName, newChildInputs, str, str2));
            }
            return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs2, arrayList4);
        }
        BillInputV2 billInputV2G2 = foh.i.g(targetName, list5);
        BillInputV2.BillInputRepeater billInputRepeater = billInputV2G2 instanceof BillInputV2.BillInputRepeater ? (BillInputV2.BillInputRepeater) billInputV2G2 : null;
        if (billInputRepeater == null || str2 == null) {
            if (billInputRepeater == null) {
                List list7 = list5;
                ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                Iterator it11 = list7.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(f((BillInputV2) it11.next(), targetName, newChildInputs, str, str2));
                }
                return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs2, arrayList5);
            }
            BillInputV2.BillInputRepeater billInputRepeaterC = BillInputV2.BillInputRepeater.c(billInputRepeater, d0.F0(new BillInputV2.BillInputUntypedInputs(null, null, newChildInputs), billInputRepeater.f61312c));
            List<BillInputV2> list8 = list5;
            ArrayList arrayList6 = new ArrayList(w.t(list8, 10));
            for (BillInputV2 billInputV22 : list8) {
                if (Intrinsics.f(billInputV22.getF61319a(), billInputRepeater.f61310a)) {
                    billInputV22 = billInputRepeaterC;
                }
                arrayList6.add(billInputV22);
            }
            return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs2, arrayList6);
        }
        BillInputV2.BillInputUntypedInputs billInputUntypedInputs3 = new BillInputV2.BillInputUntypedInputs(str2, null, newChildInputs);
        List<BillInputV2> list9 = billInputRepeater.f61312c;
        ArrayList arrayList7 = new ArrayList(w.t(list9, 10));
        for (BillInputV2 billInputV23 : list9) {
            if (Intrinsics.f(billInputV23.getF61319a(), str2)) {
                billInputV23 = billInputUntypedInputs3;
            }
            arrayList7.add(billInputV23);
        }
        BillInputV2.BillInputRepeater billInputRepeaterC2 = BillInputV2.BillInputRepeater.c(billInputRepeater, arrayList7);
        List<BillInputV2> list10 = list5;
        ArrayList arrayList8 = new ArrayList(w.t(list10, 10));
        for (BillInputV2 billInputV24 : list10) {
            if (Intrinsics.f(billInputV24.getF61319a(), billInputRepeater.f61310a)) {
                billInputV24 = billInputRepeaterC2;
            }
            arrayList8.add(billInputV24);
        }
        return BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs2, arrayList8);
    }
}
