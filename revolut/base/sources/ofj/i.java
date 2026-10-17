package ofj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import dej.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.e0;
import kfj.g0;
import kfj.m0;
import kfj.r;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i {
    public static final EsimInfoBottomSheetData a(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String title = m0Var.getTitle();
        String subtitle = m0Var.getSubtitle();
        EsimInfoBottomSheetData.Content contentA = h.a(g0.INSTANCE, m0Var.getItems(), m0Var.getContent());
        EsimHyperText esimHyperText = null;
        List list = null;
        if (contentA == null) {
            return null;
        }
        e0 terms = m0Var.getTerms();
        if (terms != null) {
            String text = terms.getText();
            List<r> descriptors = terms.getDescriptors();
            ArrayList arrayList = new ArrayList();
            for (r rVar : descriptors) {
                String text2 = rVar.getText();
                if (rVar.getAction() != null) {
                    f0[] f0VarArrValues = f0.values();
                    if (f0VarArrValues.length > 0) {
                        f0 f0Var = f0VarArrValues[0];
                        throw null;
                    }
                }
                String url2 = rVar.getUrl();
                EsimHyperText.Descriptor descriptor = url2 != null ? new EsimHyperText.Descriptor(text2, new EsimDescriptorValue.Link(url2)) : null;
                if (descriptor != null) {
                    arrayList.add(descriptor);
                }
            }
            List<String> parameters = terms.getParameters();
            if (parameters != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : parameters) {
                    dej.g0[] g0VarArrValues = dej.g0.values();
                    if (g0VarArrValues.length > 0) {
                        dej.g0 g0Var = g0VarArrValues[0];
                        throw null;
                    }
                }
                list = arrayList2;
            }
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            esimHyperText = new EsimHyperText(text, arrayList, list);
        }
        return new EsimInfoBottomSheetData(title, subtitle, contentA, esimHyperText);
    }

    public static final m0 b(EsimInfoBottomSheetData esimInfoBottomSheetData) {
        ArrayList arrayList;
        EsimHyperText esimHyperText;
        Intrinsics.checkNotNullParameter(esimInfoBottomSheetData, "<this>");
        String str = esimInfoBottomSheetData.f100284a;
        String str2 = esimInfoBottomSheetData.f100285b;
        EsimInfoBottomSheetData.Content content = esimInfoBottomSheetData.f100286c;
        EsimInfoBottomSheetData.Content.Text text = content instanceof EsimInfoBottomSheetData.Content.Text ? (EsimInfoBottomSheetData.Content.Text) content : null;
        e0 e0VarA = (text == null || (esimHyperText = text.f100288a) == null) ? null : f.a(esimHyperText);
        EsimInfoBottomSheetData.Content.Items items = content instanceof EsimInfoBottomSheetData.Content.Items ? (EsimInfoBottomSheetData.Content.Items) content : null;
        if (items != null) {
            ArrayList arrayList2 = items.f100287a;
            arrayList = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(h.b((EsimInfoBottomSheetData.Item) it8.next()));
            }
        } else {
            arrayList = null;
        }
        EsimHyperText esimHyperText2 = esimInfoBottomSheetData.d;
        return new m0(str, str2, e0VarA, arrayList, esimHyperText2 != null ? f.a(esimHyperText2) : null);
    }
}
