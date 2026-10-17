package n14;

import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import xz3.d;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    public static final du3.d a(xz3.d dVar, String pluginPath, r10.f networkUrlBuilder) {
        du3.c cVar;
        h hVar;
        h hVar2;
        a1 a1VarA;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(pluginPath, "pluginPath");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        String disclaimer = dVar.getDisclaimer();
        String title = dVar.getTitle();
        d.a subtitle = dVar.getSubtitle();
        if (subtitle != null) {
            String icon = subtitle.getIcon();
            if (icon != null) {
                a1.Companion.getClass();
                a1VarA = y0.a(icon);
            } else {
                a1VarA = null;
            }
            cVar = new du3.c(a1VarA, subtitle.getText());
        } else {
            cVar = null;
        }
        String description = dVar.getDescription();
        String buttonText = dVar.getButtonText();
        List<xz3.a> documents = dVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        for (xz3.a aVar : documents) {
            String status = aVar.getStatus();
            if (status != null) {
                h[] hVarArrValues = h.values();
                int length = hVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        hVar2 = null;
                        break;
                    }
                    hVar2 = hVarArrValues[i];
                    if (a0.z(hVar2.name(), status, true)) {
                        break;
                    }
                    i++;
                }
                if (hVar2 == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CreditApplicationAgreementsDocumentsDtoMapper.kt", "Unsupported documentStatus: ".concat(status), null, h0Var);
                    hVar2 = h.NOT_SIGNED;
                }
                hVar = hVar2;
            } else {
                hVar = null;
            }
            String name = aVar.getName();
            String displayName = aVar.getDisplayName();
            String description2 = aVar.getDescription();
            String string = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/", pluginPath, "/", aVar.getName(), "/html")).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/", pluginPath, "/", aVar.getName(), "/pdf")).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(new du3.a(name, displayName, description2, string, string2, hVar == h.SIGNED));
        }
        return new du3.d(arrayList, disclaimer, title, cVar, description, buttonText);
    }
}
