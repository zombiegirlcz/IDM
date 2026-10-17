package s14;

import bv3.f;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import cv3.p;
import dx4.e1;
import dx4.i;
import dx4.l;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.m0;
import nx4.m2;
import nx4.n;
import nx4.o0;
import nx4.s;
import t14.m;
import uz3.h;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public static final bv3.c a(d dVar) {
        ArrayList arrayList;
        ?? arrayList2;
        p pVar;
        String str;
        f fVar;
        Button button;
        fu3.a aVar;
        fu3.a aVar2;
        l iVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        p pVar2 = dVar.getTopItem() != null ? new p(m.a(dVar.getTopItem())) : null;
        String title = dVar.getTitle();
        String subtitle = dVar.getSubtitle();
        String description = dVar.getDescription();
        String tag2 = dVar.getTag();
        String backgroundImage = dVar.getBackgroundImage();
        bv3.d dVar2 = bv3.e.Companion;
        String subtitleImage = dVar.getSubtitleImage();
        if (subtitleImage == null) {
            subtitleImage = "";
        }
        dVar2.getClass();
        bv3.e eVarA = bv3.d.a(subtitleImage);
        List secondSubtitles = dVar.getSecondSubtitles();
        if (secondSubtitles != null) {
            List list = secondSubtitles;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList3.add(o0.o((m2) it8.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List actionItems = dVar.getActionItems();
        if (actionItems != null) {
            List<s> list2 = actionItems;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (s sVar : list2) {
                DateTimeFormatter dateTimeFormatter = o0.f220296a;
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                String name = sVar.getName();
                String text = sVar.getText();
                n action = sVar.getAction();
                if (action == null || (iVar = nx4.p.a(action)) == null) {
                    iVar = new i(null);
                }
                arrayList2.add(new dx4.p(name, text, iVar));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        ?? r142 = arrayList2;
        ArrayList arrayListZ = d0.Z(dVar.getContentItems());
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = arrayListZ.iterator();
        while (it9.hasNext()) {
            e1 e1VarP = o0.p((m0) it9.next(), arrayListZ);
            if (e1VarP != null) {
                arrayList4.add(e1VarP);
            }
        }
        e parameters = dVar.getParameters();
        if (parameters != null) {
            Intrinsics.checkNotNullParameter(parameters, "<this>");
            long amount = parameters.getAmount();
            Integer duration = parameters.getDuration();
            String repaymentType = parameters.getRepaymentType();
            if (repaymentType != null) {
                fu3.a[] aVarArrValues = fu3.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = aVarArrValues[i];
                    int i2 = i;
                    int i3 = length;
                    if (a0.z(aVar2.name(), repaymentType, true)) {
                        break;
                    }
                    i = i2 + 1;
                    length = i3;
                }
                if (aVar2 == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    pVar = pVar2;
                    str = title;
                    rd0.d.a(rd0.c.ERROR, "CreditOfferDtoMapper.kt", "Unsupported repaymentType ".concat(repaymentType), null, h0Var);
                    aVar = fu3.a.EQUAL_INSTALLMENTS;
                } else {
                    pVar = pVar2;
                    str = title;
                    aVar = aVar2;
                }
            } else {
                pVar = pVar2;
                str = title;
                aVar = null;
            }
            fVar = new f(amount, duration, aVar);
        } else {
            pVar = pVar2;
            str = title;
            fVar = null;
        }
        uz3.i primaryButton = dVar.getPrimaryButton();
        if (primaryButton != null) {
            button = h.b(primaryButton);
        } else {
            String confirmButtonTitle = dVar.getConfirmButtonTitle();
            button = confirmButtonTitle != null ? new Button(confirmButtonTitle, new Action.Accept(null)) : null;
        }
        if (button != null) {
            return new bv3.c(pVar, str, subtitle, description, tag2, backgroundImage, eVarA, arrayList, r142, arrayList4, button, fVar, dVar.getDisclaimer());
        }
        throw new IllegalArgumentException("Either primaryButton or confirmButtonTitle must be present");
    }
}
