package hph;

import com.revolut.core.ui_kit.delegates.i1;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final i1 a(List refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        List listV0 = d0.V0(refs, 4);
        if (listV0.isEmpty()) {
            listV0 = null;
        }
        if (listV0 == null) {
            return null;
        }
        List list = listV0;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new InstrumentImage((String) it8.next(), 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone5)));
        }
        return new i1(arrayList);
    }
}
