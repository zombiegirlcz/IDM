package mjk;

import bjk.g2;
import bjk.i0;
import bjk.j0;
import bjk.k0;
import bjk.m0;
import bjk.n0;
import bjk.o0;
import bjk.p0;
import bjk.q0;
import bjk.r0;
import bjk.s0;
import ggk.a0;
import ggk.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    public static final ggk.y a(r0 r0Var) {
        ArrayList arrayList;
        ggk.z zVar;
        ArrayList arrayList2;
        ggk.u uVar;
        ggk.u uVar2;
        Iterator it8;
        Iterator it9;
        ggk.v vVar;
        ?? arrayList3;
        ggk.w wVar;
        ggk.w wVar2;
        j0 bottomSheet;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        List sections = r0Var.getSections();
        int i = 10;
        if (sections != null) {
            List list = sections;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                s0 s0Var = (s0) it10.next();
                Intrinsics.checkNotNullParameter(s0Var, "<this>");
                String title = s0Var.getTitle();
                List cells = s0Var.getCells();
                ArrayList arrayList5 = new ArrayList();
                Iterator it11 = cells.iterator();
                while (it11.hasNext()) {
                    o0 o0Var = (o0) it11.next();
                    Intrinsics.checkNotNullParameter(o0Var, "<this>");
                    ggk.q qVarW = ofm.q.W(o0Var.getAvatar());
                    if (qVarW != null) {
                        String title2 = o0Var.getTitle();
                        String description = o0Var.getDescription();
                        List accessoryTexts = o0Var.getAccessoryTexts();
                        if (accessoryTexts != null) {
                            List<i0> list2 = accessoryTexts;
                            arrayList3 = new ArrayList(zhm.w.t(list2, i));
                            for (i0 i0Var : list2) {
                                Intrinsics.checkNotNullParameter(i0Var, "<this>");
                                arrayList3.add(new ggk.n(i0Var.getText(), i0Var.getStrikethrough()));
                            }
                        } else {
                            arrayList3 = 0;
                        }
                        if (arrayList3 == 0) {
                            arrayList3 = f0.f322471a;
                        }
                        ?? r152 = arrayList3;
                        n0 action = o0Var.getAction();
                        if (action != null) {
                            Intrinsics.checkNotNullParameter(action, "<this>");
                            if (!Intrinsics.f(action.getType(), "BOTTOM_SHEET") || (bottomSheet = action.getBottomSheet()) == null) {
                                it8 = it10;
                                it9 = it11;
                                wVar2 = null;
                            } else {
                                Intrinsics.checkNotNullParameter(bottomSheet, "<this>");
                                k0 avatar = bottomSheet.getAvatar();
                                ggk.q qVarW2 = avatar != null ? ofm.q.W(avatar) : null;
                                String title3 = bottomSheet.getTitle();
                                String description2 = bottomSheet.getDescription();
                                List detailsItems = bottomSheet.getDetailsItems();
                                it8 = it10;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(detailsItems, 10));
                                Iterator it12 = detailsItems.iterator();
                                while (it12.hasNext()) {
                                    p0 p0Var = (p0) it12.next();
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    arrayList6.add(new ggk.x(p0Var.getIcon(), p0Var.getTitle(), p0Var.getDescription()));
                                    it12 = it12;
                                    it11 = it11;
                                }
                                it9 = it11;
                                wVar2 = new ggk.w(qVarW2, title3, description2, arrayList6);
                            }
                            wVar = wVar2;
                        } else {
                            it8 = it10;
                            it9 = it11;
                            wVar = null;
                        }
                        vVar = new ggk.v(qVarW, title2, description, r152, wVar);
                    } else {
                        it8 = it10;
                        it9 = it11;
                        vVar = null;
                    }
                    if (vVar != null) {
                        arrayList5.add(vVar);
                    }
                    i = 10;
                    it10 = it8;
                    it11 = it9;
                }
                arrayList4.add(new a0(title, arrayList5));
                i = 10;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List cards = r0Var.getCards();
        if (cards == null) {
            cards = f0.f322471a;
        }
        List list3 = cards;
        q0 benefitsLayout = r0Var.getBenefitsLayout();
        if (benefitsLayout != null) {
            Intrinsics.checkNotNullParameter(benefitsLayout, "<this>");
            g2.d.s highlightedBenefits = benefitsLayout.getHighlightedBenefits();
            b1 b1VarI = highlightedBenefits != null ? r.i(highlightedBenefits) : null;
            List benefitCategories = benefitsLayout.getBenefitCategories();
            ArrayList arrayListA = benefitCategories != null ? r.a(benefitCategories) : null;
            g2.d.u perks = benefitsLayout.getPerks();
            zVar = new ggk.z(b1VarI, arrayListA, perks != null ? r.j(perks) : null);
        } else {
            zVar = null;
        }
        List insuranceBenefits = r0Var.getInsuranceBenefits();
        if (insuranceBenefits != null) {
            List<m0> list4 = insuranceBenefits;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
            for (m0 m0Var : list4) {
                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                arrayList7.add(new ggk.t(m0Var.getIcon(), m0Var.getTitle(), m0Var.getSubtitle()));
            }
            arrayList2 = arrayList7;
        } else {
            arrayList2 = null;
        }
        String cardTerminationReason = r0Var.getCardTerminationReason();
        if (cardTerminationReason != null) {
            ggk.u[] uVarArrValues = ggk.u.values();
            int length = uVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    uVar2 = null;
                    break;
                }
                uVar2 = uVarArrValues[i2];
                if (kotlin.text.a0.z(uVar2.name(), cardTerminationReason, true)) {
                    break;
                }
                i2++;
            }
            uVar = uVar2;
        } else {
            uVar = null;
        }
        return new ggk.y(arrayList, list3, zVar, arrayList2, uVar);
    }
}
