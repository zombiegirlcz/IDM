package ofj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.e0;
import kfj.r;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    public static final e0 a(EsimHyperText esimHyperText) {
        Enum r56;
        Intrinsics.checkNotNullParameter(esimHyperText, "<this>");
        String str = esimHyperText.f100276a;
        List list = esimHyperText.f100277b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            strName = null;
            String strName = null;
            if (!it8.hasNext()) {
                break;
            }
            EsimHyperText.Descriptor descriptor = (EsimHyperText.Descriptor) it8.next();
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            String str2 = descriptor.f100279a;
            EsimDescriptorValue esimDescriptorValue = descriptor.f100280b;
            EsimDescriptorValue.Link link = esimDescriptorValue instanceof EsimDescriptorValue.Link ? (EsimDescriptorValue.Link) esimDescriptorValue : null;
            String str3 = link != null ? link.f100253a : null;
            EsimDescriptorValue.Action action = esimDescriptorValue instanceof EsimDescriptorValue.Action ? (EsimDescriptorValue.Action) esimDescriptorValue : null;
            if (action != null && (r56 = action.f100252a) != null) {
                strName = r56.name();
            }
            arrayList.add(new r(str2, str3, strName));
        }
        List list2 = esimHyperText.f100278c;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((Enum) it9.next()).name());
        }
        return new e0(arrayList, arrayList2.isEmpty() ? null : arrayList2, str);
    }
}
