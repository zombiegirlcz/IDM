package o14;

import cv3.s;
import cv3.u;
import dx4.a1;
import dx4.y0;
import hs3.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o14.a;
import o14.d;
import o14.i;
import wy3.p;
import wy3.q;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    public static final wy3.j a(b bVar, dr3.g promptMapper) {
        Map mapG;
        Iterator it8;
        wy3.i gVar;
        a1 a1VarA;
        wy3.c cVar;
        wy3.c cVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(promptMapper, "promptMapper");
        u uVar = new u(bVar.getOfferParameters());
        s sVarA = t14.j.a(bVar.getInitialScreen());
        Map additionalScreens = bVar.getAdditionalScreens();
        if (additionalScreens != null) {
            mapG = new LinkedHashMap(q0.b(additionalScreens.size()));
            Iterator it9 = additionalScreens.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry = (Map.Entry) it9.next();
                Object key = entry.getKey();
                d dVar = (d) entry.getValue();
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(promptMapper, "promptMapper");
                if (dVar instanceof d.a) {
                    d.a aVar = (d.a) dVar;
                    cv3.a aVarN = oi0.d.N(aVar.getContent());
                    String presentationStyle = aVar.getPresentationStyle();
                    if (presentationStyle != null) {
                        cVar = wy3.c.PUSH;
                        wy3.c[] cVarArrValues = wy3.c.values();
                        int length = cVarArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                it8 = it9;
                                cVar2 = null;
                                break;
                            }
                            cVar2 = cVarArrValues[i];
                            it8 = it9;
                            if (a0.z(cVar2.name(), presentationStyle, true)) {
                                break;
                            }
                            i++;
                            it9 = it8;
                        }
                        if (cVar2 == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("There is no enum value for: ".concat(presentationStyle));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        } else {
                            cVar = cVar2;
                        }
                        if (cVar == null) {
                        }
                        gVar = new wy3.d(aVarN, cVar);
                    } else {
                        it8 = it9;
                    }
                    cVar = wy3.c.PUSH;
                    gVar = new wy3.d(aVarN, cVar);
                } else {
                    it8 = it9;
                    if (dVar instanceof d.b) {
                        a content = ((d.b) dVar).getContent();
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        String title = content.getTitle();
                        String description = content.getDescription();
                        List<a.C1229a> items = content.getItems();
                        ArrayList arrayList = new ArrayList(w.t(items, 10));
                        for (a.C1229a c1229a : items) {
                            Intrinsics.checkNotNullParameter(c1229a, "<this>");
                            String title2 = c1229a.getTitle();
                            String description2 = c1229a.getDescription();
                            String icon = c1229a.getIcon();
                            if (icon != null) {
                                a1.Companion.getClass();
                                a1VarA = y0.a(icon);
                            } else {
                                a1VarA = null;
                            }
                            arrayList.add(new wy3.a(a1VarA, title2, description2));
                        }
                        gVar = new wy3.e(new wy3.b(title, description, content.getPrimaryButtonTitle(), content.getSecondaryButtonTitle(), content.getParameterKey(), arrayList));
                    } else if (dVar instanceof d.c) {
                        gVar = new wy3.f(cp5.c.E(((d.c) dVar).getContent(), promptMapper));
                    } else if (dVar instanceof d.e) {
                        i content2 = ((d.e) dVar).getContent();
                        Intrinsics.checkNotNullParameter(content2, "<this>");
                        String title3 = content2.getTitle();
                        String description3 = content2.getDescription();
                        List<i.a> items2 = content2.getItems();
                        ArrayList arrayList2 = new ArrayList(w.t(items2, 10));
                        for (i.a aVar2 : items2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList2.add(new p(aVar2.getId(), aVar2.getTitle(), aVar2.getDescription(), aVar2.getButtonTitle(), aVar2.getSelected()));
                        }
                        gVar = new wy3.h(new q(title3, description3, content2.getDisclaimer(), content2.getParameterKey(), arrayList2));
                    } else {
                        if (!(dVar instanceof d.C1230d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d.C1230d c1230d = (d.C1230d) dVar;
                        s sVarA2 = t14.j.a(c1230d.getContent());
                        t14.h content3 = c1230d.getContent();
                        Intrinsics.checkNotNullParameter(content3, "<this>");
                        gVar = new wy3.g(sVarA2, content3.getTopItem() != null ? j0.TOP_ITEM : (content3.getTag() == null || content3.getBackgroundImage() == null) ? j0.DEFAULT : j0.WITH_IMAGE_HEADER);
                    }
                }
                mapG.put(key, gVar);
                it9 = it8;
            }
        } else {
            mapG = r0.g();
        }
        return new wy3.j(uVar, sVarA, mapG);
    }
}
