package t14;

import cv3.b0;
import cv3.d0;
import cv3.s;
import dx4.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.m0;
import nx4.o0;
import z14.a;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static b0 a(o dto) {
        d0 d0Var;
        mv3.a aVar;
        hu3.a aVar2;
        ?? arrayList;
        ?? arrayList2;
        fu3.a aVar3;
        Intrinsics.checkNotNullParameter(dto, "dto");
        q parameters = dto.getParameters();
        if (parameters != null) {
            List credits = parameters.getCredits();
            if (credits != null) {
                ArrayList arrayListZ = zhm.d0.Z(credits);
                arrayList2 = new ArrayList(w.t(arrayListZ, 10));
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(n14.j.b((z14.d) it8.next()));
                }
            } else {
                arrayList2 = f0.f322471a;
            }
            ?? r112 = arrayList2;
            long amount = parameters.getAmount();
            long duration = parameters.getDuration();
            Integer repaymentDayRequested = parameters.getRepaymentDayRequested();
            String repaymentType = parameters.getRepaymentType();
            if (repaymentType != null) {
                fu3.a[] aVarArrValues = fu3.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar3 = null;
                        break;
                    }
                    aVar3 = aVarArrValues[i];
                    if (a0.z(aVar3.name(), repaymentType, true)) {
                        break;
                    }
                    i++;
                }
                if (aVar3 == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "OfferV2DetailsDtoMapper.kt", "Unsupported repaymentType ".concat(repaymentType), null, h0Var);
                    aVar3 = fu3.a.EQUAL_INSTALLMENTS;
                }
            } else {
                aVar3 = null;
            }
            d0Var = new d0(aVar3, repaymentDayRequested, Long.valueOf(amount), Long.valueOf(duration), parameters.getInsurance(), r112);
        } else {
            d0Var = null;
        }
        h offerContent = dto.getOfferContent();
        s sVarA = offerContent != null ? j.a(offerContent) : null;
        a calculator = dto.getCalculator();
        cv3.a aVarN = calculator != null ? oi0.d.N(calculator) : null;
        m04.b insurance = dto.getInsurance();
        mu3.b bVarW = insurance != null ? hx7.a.w(insurance) : null;
        d04.a editRepaymentType = dto.getEditRepaymentType();
        fu3.c cVarA = editRepaymentType != null ? d04.b.a(editRepaymentType) : null;
        z14.a creditsToRefinance = dto.getCreditsToRefinance();
        if (creditsToRefinance != null) {
            Intrinsics.checkNotNullParameter(creditsToRefinance, "<this>");
            String title = creditsToRefinance.getTitle();
            String subtitle = creditsToRefinance.getSubtitle();
            ArrayList arrayListZ2 = zhm.d0.Z(creditsToRefinance.getItems());
            ArrayList arrayList3 = new ArrayList();
            Iterator it9 = arrayListZ2.iterator();
            while (it9.hasNext()) {
                e1 e1VarP = o0.p((m0) it9.next(), arrayListZ2);
                if (e1VarP != null) {
                    arrayList3.add(e1VarP);
                }
            }
            List bottomItems = creditsToRefinance.getBottomItems();
            if (bottomItems != null) {
                ArrayList arrayListZ3 = zhm.d0.Z(bottomItems);
                arrayList = new ArrayList();
                Iterator it10 = arrayListZ3.iterator();
                while (it10.hasNext()) {
                    e1 e1VarP2 = o0.p((m0) it10.next(), arrayListZ3);
                    if (e1VarP2 != null) {
                        arrayList.add(e1VarP2);
                    }
                }
            } else {
                arrayList = f0.f322471a;
            }
            String title2 = creditsToRefinance.getPrimaryButton().getTitle();
            a.C1771a secondaryButton = creditsToRefinance.getSecondaryButton();
            aVar = new mv3.a(title, subtitle, arrayList3, arrayList, title2, secondaryButton != null ? secondaryButton.getTitle() : null, creditsToRefinance.getDisclaimer(), creditsToRefinance.getIsValidItemsSelection());
        } else {
            aVar = null;
        }
        f04.a repaymentDaySelection = dto.getRepaymentDaySelection();
        if (repaymentDaySelection != null) {
            Intrinsics.checkNotNullParameter(repaymentDaySelection, "<this>");
            ArrayList arrayListZ4 = zhm.d0.Z(repaymentDaySelection.getItems());
            String title3 = repaymentDaySelection.getTitle();
            String subtitle2 = repaymentDaySelection.getSubtitle();
            int selectedDay = repaymentDaySelection.getSelectedDay();
            List disabledDays = repaymentDaySelection.getDisabledDays();
            int maxDay = repaymentDaySelection.getMaxDay();
            String approximationCaveat = repaymentDaySelection.getApproximationCaveat();
            String buttonTitle = repaymentDaySelection.getButtonTitle();
            String parameterKey = repaymentDaySelection.getParameterKey();
            ArrayList arrayList4 = new ArrayList();
            Iterator it11 = arrayListZ4.iterator();
            while (it11.hasNext()) {
                e1 e1VarP3 = o0.p((m0) it11.next(), arrayListZ4);
                if (e1VarP3 != null) {
                    arrayList4.add(e1VarP3);
                }
            }
            aVar2 = new hu3.a(title3, subtitle2, selectedDay, maxDay, disabledDays, approximationCaveat, buttonTitle, parameterKey, arrayList4);
        } else {
            aVar2 = null;
        }
        return new b0(d0Var, sVarA, aVarN, bVarW, cVarA, aVar, aVar2);
    }
}
