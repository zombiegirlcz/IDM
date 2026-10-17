package qti;

import bti.c;
import bti.d;
import bti.e;
import bti.f;
import bti.g;
import bti.h;
import com.revolut.feature.hyper_text.model.HyperTextDescriptor;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oti.c2;
import oti.f2;
import oti.l;
import oti.q;
import oti.u;
import oti.v0;
import oti.x;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final d a(l lVar) {
        c cVar;
        String str;
        c cVar2;
        g gVar;
        e eVar;
        e eVar2;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str2 = lVar.f229654a;
        String str3 = lVar.f229655b;
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (a0.z(cVar.name(), str3, true)) {
                break;
            }
            i++;
        }
        if (cVar == null) {
            y0.b(new Pair("AsftSlotPrebookingMapping", "AsftBookingSlotStatusDto toEnumSafe state unknown"));
            cVar = c.UNKNOWN;
        }
        c cVar3 = cVar;
        String str4 = lVar.f229656c;
        OffsetDateTime offsetDateTime = str4 != null ? OffsetDateTime.parse(str4) : null;
        String str5 = lVar.d;
        String str6 = lVar.e;
        String str7 = lVar.f;
        String str8 = lVar.f229657g;
        LocalDate localDate = LocalDate.parse(lVar.f229658h);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        q qVar = lVar.i;
        Object obj2 = b.f249158a;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        AsftTimeSlot asftTimeSlot = new AsftTimeSlot(qVar.f229677a, qVar.f229678b);
        int i2 = lVar.f229659j;
        oti.a0 a0Var = lVar.k;
        dj0.d dVarO = mo3.a.o(a0Var.f229595a);
        dj0.d dVarO2 = mo3.a.o(a0Var.f229596b);
        u uVar = a0Var.f229597c;
        if (uVar != null) {
            String str9 = uVar.f229691a;
            str = str2;
            dj0.d dVarO3 = mo3.a.o(uVar.f229692b);
            List list = uVar.f229693c;
            Intrinsics.checkNotNullParameter(list, "<this>");
            List list2 = list;
            cVar2 = cVar3;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                x xVar = (x) it8.next();
                arrayList.add(new f(Double.parseDouble(xVar.f229701a), mo3.a.o(xVar.f229702b), mo3.a.o(xVar.f229703c), xVar.d));
            }
            gVar = new g(dVarO3, str9, arrayList);
        } else {
            str = str2;
            cVar2 = cVar3;
            gVar = null;
        }
        jo3.a aVar = a0Var.d;
        dj0.d dVarO4 = aVar != null ? mo3.a.o(aVar) : null;
        jo3.a aVar2 = a0Var.e;
        dj0.d dVarO5 = aVar2 != null ? mo3.a.o(aVar2) : null;
        String str10 = a0Var.f;
        jo3.a aVar3 = a0Var.f229598g;
        dj0.d dVarO6 = aVar3 != null ? mo3.a.o(aVar3) : null;
        jo3.a aVar4 = a0Var.f229599h;
        h hVar = new h(dVarO, dVarO2, gVar, dVarO4, dVarO5, str10, dVarO6, aVar4 != null ? mo3.a.o(aVar4) : null, a0Var.i);
        AsftTermsAndConditions asftTermsAndConditionsC = c(lVar.f229660l);
        String str11 = lVar.f229661m;
        if (str11 != null) {
            e[] eVarArrValues = e.values();
            int length2 = eVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    eVar2 = null;
                    break;
                }
                eVar2 = eVarArrValues[i3];
                if (a0.z(eVar2.name(), str11, true)) {
                    break;
                }
                i3++;
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        return new d(str, cVar2, offsetDateTime, str5, str6, str7, str8, localDate, asftTimeSlot, i2, hVar, asftTermsAndConditionsC, eVar);
    }

    public static final ParameterisedHyperTextContent b(c2 c2Var) {
        HyperTextTarget action;
        String str = c2Var.f229623a;
        List<v0> list = c2Var.f229624b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (v0 v0Var : list) {
            String str2 = v0Var.f229696a;
            String str3 = v0Var.f229697b;
            if (str3 != null) {
                action = new HyperTextTarget.Link(str3);
            } else {
                String str4 = v0Var.f229698c;
                action = str4 != null ? new HyperTextTarget.Action(str4) : null;
            }
            arrayList.add(new HyperTextDescriptor(str2, action));
        }
        return new ParameterisedHyperTextContent(str, arrayList);
    }

    public static final AsftTermsAndConditions c(f2 f2Var) {
        Intrinsics.checkNotNullParameter(f2Var, "<this>");
        ParameterisedHyperTextContent parameterisedHyperTextContentB = b(f2Var.f229635a);
        c2 c2Var = f2Var.f229636b;
        ParameterisedHyperTextContent parameterisedHyperTextContentB2 = c2Var != null ? b(c2Var) : null;
        c2 c2Var2 = f2Var.f229637c;
        ParameterisedHyperTextContent parameterisedHyperTextContentB3 = c2Var2 != null ? b(c2Var2) : null;
        c2 c2Var3 = f2Var.d;
        ParameterisedHyperTextContent parameterisedHyperTextContentB4 = c2Var3 != null ? b(c2Var3) : null;
        c2 c2Var4 = f2Var.e;
        return new AsftTermsAndConditions(parameterisedHyperTextContentB, parameterisedHyperTextContentB2, parameterisedHyperTextContentB3, parameterisedHyperTextContentB4, c2Var4 != null ? b(c2Var4) : null);
    }

    public static final c2 d(ParameterisedHyperTextContent parameterisedHyperTextContent) {
        String str = parameterisedHyperTextContent.f74759a;
        ArrayList<HyperTextDescriptor> arrayList = parameterisedHyperTextContent.f74760b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (HyperTextDescriptor hyperTextDescriptor : arrayList) {
            String str2 = hyperTextDescriptor.f74754a;
            HyperTextTarget hyperTextTarget = hyperTextDescriptor.f74755b;
            String str3 = null;
            HyperTextTarget.Link link = hyperTextTarget instanceof HyperTextTarget.Link ? (HyperTextTarget.Link) hyperTextTarget : null;
            String str4 = link != null ? link.f74757a : null;
            HyperTextTarget.Action action = hyperTextTarget instanceof HyperTextTarget.Action ? (HyperTextTarget.Action) hyperTextTarget : null;
            if (action != null) {
                str3 = (String) action.f74756a;
            }
            arrayList2.add(new v0(str2, str4, str3));
        }
        return new c2(str, arrayList2);
    }

    public static final f2 e(AsftTermsAndConditions asftTermsAndConditions) {
        Intrinsics.checkNotNullParameter(asftTermsAndConditions, "<this>");
        c2 c2VarD = d(asftTermsAndConditions.f98746a);
        ParameterisedHyperTextContent parameterisedHyperTextContent = asftTermsAndConditions.f98747b;
        c2 c2VarD2 = parameterisedHyperTextContent != null ? d(parameterisedHyperTextContent) : null;
        ParameterisedHyperTextContent parameterisedHyperTextContent2 = asftTermsAndConditions.f98748c;
        c2 c2VarD3 = parameterisedHyperTextContent2 != null ? d(parameterisedHyperTextContent2) : null;
        ParameterisedHyperTextContent parameterisedHyperTextContent3 = asftTermsAndConditions.d;
        c2 c2VarD4 = parameterisedHyperTextContent3 != null ? d(parameterisedHyperTextContent3) : null;
        ParameterisedHyperTextContent parameterisedHyperTextContent4 = asftTermsAndConditions.e;
        return new f2(c2VarD, c2VarD2, c2VarD3, c2VarD4, parameterisedHyperTextContent4 != null ? d(parameterisedHyperTextContent4) : null);
    }
}
