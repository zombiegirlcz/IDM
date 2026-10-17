package nx4;

import dx4.a4;
import dx4.b4;
import dx4.f3;
import dx4.g3;
import dx4.n4;
import dx4.p4;
import dx4.q4;
import dx4.y3;
import dx4.z3;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nx4.g2;
import nx4.l2;
import nx4.w1;

/* JADX INFO: loaded from: classes22.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f220296a = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static final dx4.c1 a(dx4.b1 b1Var, j0 contentIcon, List contentItems) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(contentIcon, "contentIcon");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = contentItems.iterator();
        Object obj2 = null;
        int i = 0;
        m0 m0Var = null;
        while (it8.hasNext()) {
            m0 m0Var2 = (m0) it8.next();
            boolean z = m0Var2 instanceof j0;
            j0 j0Var = z ? (j0) m0Var2 : null;
            String icon = j0Var != null ? j0Var.getIcon() : null;
            j0 j0Var2 = m0Var instanceof j0 ? (j0) m0Var : null;
            i = Intrinsics.f(icon, j0Var2 != null ? j0Var2.getIcon() : null) ? i + 1 : 0;
            if (z) {
                arrayList.add(new Pair(m0Var2, Integer.valueOf(i)));
            }
            m0Var = m0Var2;
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next = it9.next();
            if (Intrinsics.f((j0) ((Pair) next).f186385a, contentIcon)) {
                obj2 = next;
                break;
            }
        }
        Pair pair = (Pair) obj2;
        int iIntValue = pair != null ? ((Number) pair.f186386b).intValue() : 0;
        String icon2 = contentIcon.getIcon();
        if (icon2 == null) {
            icon2 = "";
        }
        b1Var.getClass();
        return dx4.b1.a(iIntValue, icon2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public static final dx4.t0 b(d0 d0Var) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String strB = d0Var.getId();
        if (strB == null) {
            strB = d0Var.getTitle();
        }
        String str = strB;
        String strE = d0Var.getTitle();
        Boolean boolD = d0Var.getRequired();
        boolean zBooleanValue = boolD != null ? boolD.booleanValue() : true;
        Boolean boolA = d0Var.getChecked();
        boolean zBooleanValue2 = boolA != null ? boolA.booleanValue() : false;
        List listC = d0Var.getLinks();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator it8 = listC.iterator();
            while (it8.hasNext()) {
                dx4.m1 m1VarH = h((s0) it8.next());
                if (m1VarH != null) {
                    arrayList.add(m1VarH);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        return new dx4.t0(str, strE, arrayList, zBooleanValue, zBooleanValue2);
    }

    public static final dx4.x0 c(i0 i0Var) {
        Object v0Var;
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        String strB = i0Var.getId();
        String strC = i0Var.getText();
        Map mapA = i0Var.getAttachments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(mapA.size()));
        for (Map.Entry entry : mapA.entrySet()) {
            Object key = entry.getKey();
            h0 h0Var = (h0) entry.getValue();
            if (h0Var instanceof f0) {
                f0 f0Var = (f0) h0Var;
                String strB2 = f0Var.getLabel();
                n nVarA = f0Var.getAction();
                v0Var = new dx4.u0(strB2, nVarA != null ? p.a(nVarA) : null);
            } else {
                if (!(h0Var instanceof g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                g0 g0Var = (g0) h0Var;
                String strB3 = g0Var.getLabel();
                n nVarA2 = g0Var.getAction();
                v0Var = new dx4.v0(strB3, nVarA2 != null ? p.a(nVarA2) : null);
            }
            linkedHashMap.put(key, v0Var);
        }
        return new dx4.x0(strB, strC, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.d1 d(nx4.k0 r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.o0.d(nx4.k0):dx4.d1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v60, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.e1 e(nx4.m0 r31, java.util.List r32, java.util.Map r33) {
        /*
            Method dump skipped, instruction units count: 3651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.o0.e(nx4.m0, java.util.List, java.util.Map):dx4.e1");
    }

    public static final dx4.j1 f(l0 l0Var) {
        Object next;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        if (!(l0Var instanceof e0)) {
            if (!(l0Var instanceof f2)) {
                throw new NoWhenBranchMatchedException();
            }
            f2 f2Var = (f2) l0Var;
            Iterator<E> it8 = dx4.i1.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (kotlin.text.a0.z(((dx4.i1) next).name(), f2Var.getVariant(), true)) {
                    break;
                }
            }
            dx4.i1 i1Var = (dx4.i1) next;
            if (i1Var != null) {
                return i1Var;
            }
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ContentItemDtoMapper", p.a.p("Can't support variant: ", f2Var.getVariant(), " for RevolutContentItemBadgeDto"), null, h0Var);
            return null;
        }
        e0 e0Var = (e0) l0Var;
        Iterator<E> it9 = dx4.f1.a().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (kotlin.text.a0.z(((dx4.f1) next2).name(), e0Var.getIcon(), true)) {
                break;
            }
        }
        dx4.f1 f1Var = (dx4.f1) next2;
        if (f1Var == null) {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ContentItemDtoMapper", p.a.p("Can't support icon: ", e0Var.getIcon(), " for CircleContentItemBadgeDto"), null, h0Var2);
            return null;
        }
        Iterator<E> it10 = dx4.g1.a().iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (kotlin.text.a0.z(((dx4.g1) next3).name(), e0Var.getStyle(), true)) {
                break;
            }
        }
        dx4.g1 g1Var = (dx4.g1) next3;
        if (g1Var != null) {
            return new dx4.h1(f1Var, g1Var);
        }
        zhm.h0 h0Var3 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "ContentItemDtoMapper", p.a.p("Can't support style: ", e0Var.getStyle(), " for CircleContentItemBadgeDto"), null, h0Var3);
        return null;
    }

    public static final dx4.l1 g(q0 q0Var) {
        dx4.q qVar;
        dx4.q qVar2;
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        String strA = q0Var.getTitle();
        String strE = q0Var.getValue();
        String strD = q0Var.getUnit();
        String strC = q0Var.getTitleIcon();
        if (strC != null) {
            dx4.q[] qVarArrValues = dx4.q.values();
            int length = qVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qVar2 = null;
                    break;
                }
                qVar2 = qVarArrValues[i];
                if (kotlin.text.a0.z(qVar2.name(), strC, true)) {
                    break;
                }
                i++;
            }
            qVar = qVar2;
        } else {
            qVar = null;
        }
        n nVarB = q0Var.getTitleAction();
        return new dx4.l1(strA, strE, strD, qVar, nVarB != null ? p.a(nVarB) : null);
    }

    public static final dx4.m1 h(s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        dx4.l lVarA = p.a(s0Var.getAction());
        if (lVarA != null) {
            return new dx4.m1(s0Var.getLinkId(), lVarA);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.a2 i(nx4.z0 r12) {
        /*
            java.lang.String r1 = r12.getId()
            java.lang.String r2 = r12.getText()
            java.lang.String r0 = r12.getStyle()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L46
            dx4.z1 r6 = dx4.z1.FOOTER
            dx4.z1[] r7 = dx4.z1.values()
            int r8 = r7.length
            r9 = r3
        L19:
            if (r9 >= r8) goto L2b
            r10 = r7[r9]
            java.lang.String r11 = r10.name()
            boolean r11 = kotlin.text.a0.z(r11, r0, r5)
            if (r11 == 0) goto L28
            goto L2c
        L28:
            int r9 = r9 + 1
            goto L19
        L2b:
            r10 = r4
        L2c:
            if (r10 != 0) goto L43
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "There is no enum value for: "
            java.lang.String r0 = r8.concat(r0)
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r4, r4, r7, r0)
            goto L44
        L43:
            r6 = r10
        L44:
            if (r6 != 0) goto L48
        L46:
            dx4.z1 r6 = dx4.z1.FOOTER
        L48:
            java.lang.String r0 = r12.getHorizontalInset()
            if (r0 == 0) goto L65
            dx4.y1[] r7 = dx4.y1.values()
            int r8 = r7.length
        L53:
            if (r3 >= r8) goto L65
            r9 = r7[r3]
            java.lang.String r10 = r9.name()
            boolean r10 = kotlin.text.a0.z(r10, r0, r5)
            if (r10 == 0) goto L62
            goto L66
        L62:
            int r3 = r3 + 1
            goto L53
        L65:
            r9 = r4
        L66:
            java.util.List r12 = r12.getLinks()
            if (r12 == 0) goto L8d
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r12.iterator()
        L77:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r12.next()
            nx4.s0 r0 = (nx4.s0) r0
            dx4.m1 r0 = h(r0)
            if (r0 == 0) goto L77
            r4.add(r0)
            goto L77
        L8d:
            if (r4 != 0) goto L91
            zhm.f0 r4 = zhm.f0.f322471a
        L91:
            r5 = r4
            dx4.a2 r0 = new dx4.a2
            r3 = r6
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.o0.i(nx4.z0):dx4.a2");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.g2 j(nx4.d1 r11, java.util.Map r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r11.getName()
            java.lang.String r3 = r11.getTitle()
            java.lang.String r4 = r11.getEndLabel()
            java.util.List r0 = r11.getItems()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = zhm.d0.Z(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r0.iterator()
        L29:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r1.next()
            nx4.m0 r6 = (nx4.m0) r6
            dx4.e1 r6 = e(r6, r0, r12)
            if (r6 == 0) goto L29
            r5.add(r6)
            goto L29
        L3f:
            java.lang.String r12 = r11.getIcon()
            r0 = 0
            if (r12 == 0) goto L65
            dx4.q[] r1 = dx4.q.values()
            int r6 = r1.length
            r7 = 0
        L4c:
            if (r7 >= r6) goto L5f
            r8 = r1[r7]
            java.lang.String r9 = r8.name()
            r10 = 1
            boolean r9 = kotlin.text.a0.z(r9, r12, r10)
            if (r9 == 0) goto L5c
            goto L60
        L5c:
            int r7 = r7 + 1
            goto L4c
        L5f:
            r8 = r0
        L60:
            if (r8 != 0) goto L63
            goto L65
        L63:
            r6 = r8
            goto L6f
        L65:
            nx4.s1 r12 = r11.getInfo()
            if (r12 == 0) goto L6e
            dx4.q r8 = dx4.q.INFO
            goto L63
        L6e:
            r6 = r0
        L6f:
            nx4.n r12 = r11.getAction()
            if (r12 == 0) goto L7e
            dx4.l r12 = nx4.p.a(r12)
            if (r12 != 0) goto L7c
            goto L7e
        L7c:
            r7 = r12
            goto L89
        L7e:
            nx4.s1 r11 = r11.getInfo()
            if (r11 == 0) goto L88
            dx4.h r0 = q(r11)
        L88:
            r7 = r0
        L89:
            dx4.g2 r1 = new dx4.g2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.o0.j(nx4.d1, java.util.Map):dx4.g2");
    }

    public static final dx4.k2 k(i1 i1Var) {
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        String id10 = i1Var.getId();
        String title = i1Var.getTitle();
        String strB = i1Var.getDescription();
        dx4.d1 d1VarD = d(i1Var.getImage());
        n nVarA = i1Var.getAction();
        return new dx4.k2(id10, title, strB, d1VarD, nVarA != null ? p.a(nVarA) : null, pd.b.j(i1Var.getValueUpdated()));
    }

    public static final g3 l(w1.c.C1225c c1225c) {
        f3 f3Var;
        Intrinsics.checkNotNullParameter(c1225c, "<this>");
        String strE = c1225c.getValue();
        String strD = c1225c.getTitle();
        String strB = c1225c.getImage();
        String strC = c1225c.getLabel();
        w1.c.b bVarA = c1225c.getExplainerBottomSheet();
        if (bVarA != null) {
            Intrinsics.checkNotNullParameter(bVarA, "<this>");
            f3Var = new f3(bVarA.getTitle(), bVarA.getDescription(), bVarA.getButtonTitle());
        } else {
            f3Var = null;
        }
        return new g3(strE, strD, strB, strC, f3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final b4 m(g2 g2Var) {
        ?? arrayList;
        a4 a4Var;
        y3 y3Var;
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        List listA = g2Var.getSegments();
        if (listA != null) {
            List<g2.a> list = listA;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (g2.a aVar : list) {
                String strA = aVar.getText();
                g2.b bVarB = aVar.getTextStyle();
                if (bVarB != null) {
                    String strA2 = bVarB.getColor();
                    if (strA2 != null) {
                        y3[] y3VarArrValues = y3.values();
                        int length = y3VarArrValues.length;
                        for (int i = 0; i < length; i++) {
                            y3Var = y3VarArrValues[i];
                            if (kotlin.text.a0.z(y3Var.name(), strA2, true)) {
                                break;
                            }
                        }
                        y3Var = null;
                        a4Var = new a4(y3Var);
                    } else {
                        y3Var = null;
                        a4Var = new a4(y3Var);
                    }
                } else {
                    a4Var = null;
                }
                arrayList.add(new z3(strA, a4Var));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b4(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [zhm.f0] */
    public static final n4 n(l2.a aVar) {
        ?? arrayList;
        ?? arrayList2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strA = aVar.getId();
        List listB = aVar.getScreens();
        if (listB != null) {
            ArrayList<l2> arrayListZ = zhm.d0.Z(listB);
            arrayList = new ArrayList(zhm.w.t(arrayListZ, 10));
            for (l2 l2Var : arrayListZ) {
                Intrinsics.checkNotNullParameter(l2Var, "<this>");
                String strC = l2Var.getId();
                String strH = l2Var.getTitle();
                String strG = l2Var.getSubtitle();
                m2 m2VarF = l2Var.getSecondSubtitle();
                q4 q4VarO = m2VarF != null ? o(m2VarF) : null;
                String strB = l2Var.getConfirmButtonTitle();
                Boolean boolA = l2Var.getConfirmButtonEnabled();
                boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
                ArrayList arrayListZ2 = zhm.d0.Z(l2Var.getItems());
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = arrayListZ2.iterator();
                while (it8.hasNext()) {
                    dx4.e1 e1VarP = p((m0) it8.next(), arrayListZ2);
                    if (e1VarP != null) {
                        arrayList3.add(e1VarP);
                    }
                }
                List listE = l2Var.getItemsDetails();
                if (listE != null) {
                    ArrayList arrayListZ3 = zhm.d0.Z(listE);
                    arrayList2 = new ArrayList(zhm.w.t(arrayListZ3, 10));
                    Iterator it9 = arrayListZ3.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(n((l2.a) it9.next()));
                    }
                } else {
                    arrayList2 = zhm.f0.f322471a;
                }
                arrayList.add(new p4(strC, strG, q4VarO, strH, arrayList3, arrayList2, strB, zBooleanValue));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        return new n4(strA, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final q4 o(m2 m2Var) {
        dx4.l lVarQ;
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        String strD = m2Var.getText();
        Boolean boolE = m2Var.getValueUpdated();
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        n nVarA = m2Var.getAction();
        ?? arrayList = 0;
        if (nVarA == null || (lVarQ = p.a(nVarA)) == null) {
            s1 s1VarB = m2Var.getInfo();
            lVarQ = s1VarB != null ? q(s1VarB) : null;
        }
        List listC = m2Var.getLinks();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator it8 = listC.iterator();
            while (it8.hasNext()) {
                dx4.m1 m1VarH = h((s0) it8.next());
                if (m1VarH != null) {
                    arrayList.add(m1VarH);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        return new q4(strD, zBooleanValue, lVarQ, arrayList);
    }

    public static /* synthetic */ dx4.e1 p(m0 m0Var, List list) {
        return e(m0Var, list, zhm.r0.g());
    }

    public static final dx4.h q(s1 s1Var) {
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        return new dx4.h(p.c(s1Var));
    }
}
