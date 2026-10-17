package md7;

import com.revolut.feature.hyper_text.model.HyperTextDescriptor;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ld7.c;
import ld7.f;
import ld7.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final ParameterisedHyperText a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new ParameterisedHyperText(b(fVar.f194043a));
    }

    public static final ParameterisedHyperTextContent b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f194040a;
        List<i> list = cVar.f194041b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (i iVar : list) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            arrayList.add(new HyperTextDescriptor(iVar.f194045a, new HyperTextTarget.Link(iVar.f194046b)));
        }
        return new ParameterisedHyperTextContent(str, arrayList);
    }

    public static final c c(ParameterisedHyperTextContent parameterisedHyperTextContent) {
        Intrinsics.checkNotNullParameter(parameterisedHyperTextContent, "<this>");
        String str = parameterisedHyperTextContent.f74759a;
        ArrayList<HyperTextDescriptor> arrayList = parameterisedHyperTextContent.f74760b;
        ArrayList arrayList2 = new ArrayList();
        for (HyperTextDescriptor hyperTextDescriptor : arrayList) {
            Intrinsics.checkNotNullParameter(hyperTextDescriptor, "<this>");
            HyperTextTarget hyperTextTarget = hyperTextDescriptor.f74755b;
            HyperTextTarget.Link link = hyperTextTarget instanceof HyperTextTarget.Link ? (HyperTextTarget.Link) hyperTextTarget : null;
            i iVar = link != null ? new i(hyperTextDescriptor.f74754a, link.f74757a) : null;
            if (iVar != null) {
                arrayList2.add(iVar);
            }
        }
        return new c(str, arrayList2);
    }

    public static final f d(ParameterisedHyperText parameterisedHyperText) {
        Intrinsics.checkNotNullParameter(parameterisedHyperText, "<this>");
        return new f(c(parameterisedHyperText.f74758a));
    }
}
