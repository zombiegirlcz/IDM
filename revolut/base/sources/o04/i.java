package o04;

import cv3.s;
import dx4.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.m0;
import nx4.o0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class i {
    public static nu3.c a(h dto) {
        String buttonTitle;
        nu3.b bVar;
        nu3.b bVar2;
        cv3.k lVar;
        nu3.g gVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        j parameters = dto.getParameters();
        nu3.f fVar = new nu3.f(parameters.getAmount(), parameters.getStatementDueDay(), parameters.getPlanId());
        g offerContent = dto.getOfferContent();
        cv3.p pVar = new cv3.p(t14.m.a(offerContent.getTopItem()));
        ArrayList arrayListZ = d0.Z(offerContent.getItems());
        ArrayList arrayList = new ArrayList();
        Iterator it8 = arrayListZ.iterator();
        while (it8.hasNext()) {
            e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
            if (e1VarP != null) {
                arrayList.add(e1VarP);
            }
        }
        String disclaimer = offerContent.getDisclaimer();
        uz3.i primaryButton = offerContent.getPrimaryButton();
        if (primaryButton == null || (buttonTitle = uz3.h.b(primaryButton).f66298a) == null) {
            buttonTitle = offerContent.getButtonTitle();
        }
        String str = buttonTitle;
        uz3.i primaryButton2 = offerContent.getPrimaryButton();
        if (primaryButton2 != null) {
            lVar = new cv3.j(uz3.h.b(primaryButton2).f66299b);
        } else {
            c buttonAction = offerContent.getButtonAction();
            if (buttonAction instanceof a) {
                dx4.l lVarA = nx4.p.a(((a) buttonAction).f221117a);
                if (lVarA != null) {
                    lVar = new cv3.l(lVarA);
                } else {
                    bVar = nu3.b.ACCEPT;
                    lVar = bVar;
                }
            } else {
                if (buttonAction instanceof b) {
                    String str2 = ((b) buttonAction).f221118a;
                    nu3.b[] bVarArrValues = nu3.b.values();
                    int length = bVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            bVar2 = null;
                            break;
                        }
                        bVar2 = bVarArrValues[i];
                        if (a0.z(bVar2.name(), str2, true)) {
                            break;
                        }
                        i++;
                    }
                    if (bVar2 != null) {
                        lVar = bVar2;
                    } else {
                        bVar = nu3.b.ACCEPT;
                    }
                } else {
                    if (buttonAction != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = nu3.b.ACCEPT;
                }
                lVar = bVar;
            }
        }
        uz3.i secondaryButton = offerContent.getSecondaryButton();
        s sVar = new s(pVar, arrayList, disclaimer, str, lVar, secondaryButton != null ? uz3.h.b(secondaryButton) : null);
        f benefitsContent = dto.getBenefitsContent();
        nu3.d dVar = new nu3.d(benefitsContent.getPlanId(), benefitsContent.getTitle());
        k statementDueDaySelection = dto.getStatementDueDaySelection();
        if (statementDueDaySelection != null) {
            String title = statementDueDaySelection.getTitle();
            String subtitle = statementDueDaySelection.getSubtitle();
            int maxDay = statementDueDaySelection.getMaxDay();
            int selectedDay = statementDueDaySelection.getSelectedDay();
            List disabledDays = statementDueDaySelection.getDisabledDays();
            if (disabledDays == null) {
                disabledDays = f0.f322471a;
            }
            List list = disabledDays;
            ArrayList arrayListZ2 = d0.Z(statementDueDaySelection.getItems());
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = arrayListZ2.iterator();
            while (it9.hasNext()) {
                e1 e1VarP2 = o0.p((m0) it9.next(), arrayListZ2);
                if (e1VarP2 != null) {
                    arrayList2.add(e1VarP2);
                }
            }
            gVar = new nu3.g(title, subtitle, selectedDay, maxDay, list, arrayList2, statementDueDaySelection.getButtonTitle(), statementDueDaySelection.getParameterKey());
        } else {
            gVar = null;
        }
        return new nu3.c(id10, fVar, sVar, dVar, gVar);
    }
}
