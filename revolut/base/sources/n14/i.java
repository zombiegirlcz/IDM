package n14;

import dx4.a3;
import dx4.c2;
import dx4.d2;
import dx4.e1;
import dx4.e2;
import dx4.f2;
import dx4.k0;
import dx4.q4;
import dx4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.a1;
import nx4.c1;
import nx4.l2;
import nx4.m0;
import nx4.m2;
import nx4.o0;
import nx4.p;
import nx4.s1;
import nx4.t1;
import nx4.u1;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [dx4.d2[]] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v5, types: [dx4.d2] */
    /* JADX WARN: Type inference failed for: r18v6, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v11, types: [dx4.a1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [dx4.c1] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [dx4.k0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    public static final lv3.a a(y14.a aVar) {
        ?? arrayList;
        String str;
        a3 a3Var;
        a3 f2Var;
        int i;
        String str2;
        ?? r182;
        ?? A;
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String subtitle = aVar.getSubtitle();
        m2 secondSubtitle = aVar.getSecondSubtitle();
        q4 q4VarO = secondSubtitle != null ? o0.o(secondSubtitle) : null;
        ArrayList arrayListZ = d0.Z(aVar.getItems());
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayListZ.iterator();
        while (it8.hasNext()) {
            e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
            if (e1VarP != null) {
                arrayList2.add(e1VarP);
            }
        }
        List itemsDetails = aVar.getItemsDetails();
        if (itemsDetails != null) {
            ArrayList arrayListZ2 = d0.Z(itemsDetails);
            arrayList = new ArrayList(w.t(arrayListZ2, 10));
            Iterator it9 = arrayListZ2.iterator();
            while (it9.hasNext()) {
                arrayList.add(o0.n((l2.a) it9.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        Throwable th10 = null;
        String buttonTitle = aVar.getButtonTitle();
        u1 confirmScreen = aVar.getConfirmScreen();
        if (confirmScreen != null) {
            Intrinsics.checkNotNullParameter(confirmScreen, "<this>");
            if (confirmScreen instanceof s1) {
                f2Var = p.c((s1) confirmScreen);
                str = title;
            } else if (confirmScreen instanceof c1) {
                c1 c1Var = (c1) confirmScreen;
                Intrinsics.checkNotNullParameter(c1Var, "<this>");
                String title2 = c1Var.getTitle();
                List<c1.a> items = c1Var.getItems();
                ArrayList arrayList3 = new ArrayList(w.t(items, 10));
                for (c1.a aVar2 : items) {
                    Intrinsics.checkNotNullParameter(aVar2, str3);
                    String type = aVar2.getType();
                    ?? Values = d2.values();
                    Throwable th11 = th10;
                    int length = Values.length;
                    int i2 = 0;
                    c1 c1Var2 = c1Var;
                    int i3 = 0;
                    while (true) {
                        i = 1;
                        if (i3 >= length) {
                            str2 = title;
                            r182 = th11;
                            break;
                        }
                        r182 = Values[i3];
                        str2 = title;
                        if (a0.z(r182.name(), type, true)) {
                            break;
                        }
                        i3++;
                        title = str2;
                    }
                    if (r182 == 0) {
                        r182 = d2.NONE;
                    }
                    ?? sectionType = r182;
                    List items2 = aVar2.getItems();
                    ArrayList arrayList4 = new ArrayList(w.t(items2, 10));
                    for (Object obj2 : items2) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            v.s();
                            throw th11;
                        }
                        c1.a.C1222a c1222a = (c1.a.C1222a) obj2;
                        Intrinsics.checkNotNullParameter(c1222a, str3);
                        Intrinsics.checkNotNullParameter(sectionType, "sectionType");
                        int i6 = a1.f220124a[sectionType.ordinal()];
                        if (i6 != i) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                A = th11;
                            } else {
                                k0.Companion.getClass();
                                A = new k0(i5);
                            }
                        } else if (c1222a.getIcon() != null) {
                            y0 y0Var = dx4.a1.Companion;
                            String icon = c1222a.getIcon();
                            y0Var.getClass();
                            A = y0.a(icon);
                        } else {
                            A = th11;
                        }
                        arrayList4.add(new c2(A, c1222a.getTitle(), c1222a.getDescription()));
                        i2 = i5;
                        str3 = str3;
                        i = 1;
                    }
                    arrayList3.add(new e2(arrayList4));
                    c1Var = c1Var2;
                    th10 = th11;
                    str3 = str3;
                    title = str2;
                }
                str = title;
                f2Var = new f2(title2, c1Var.getButtonTitle(), arrayList3);
            } else {
                str = title;
                if (!(confirmScreen instanceof t1)) {
                    throw new NoWhenBranchMatchedException();
                }
                f2Var = null;
            }
            a3Var = f2Var;
        } else {
            str = title;
            a3Var = null;
        }
        return new lv3.a(str, subtitle, q4VarO, arrayList2, r62, buttonTitle, a3Var);
    }
}
