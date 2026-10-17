package t50;

import aw0.o9;
import com.revolut.chat.domain.model.rate.ExperienceTagItem;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class v {
    public static List a(z30.e eVar, z30.j ratingsData, Set chosenExperienceTags) {
        Object next;
        Intrinsics.checkNotNullParameter(ratingsData, "ratingsData");
        Intrinsics.checkNotNullParameter(chosenExperienceTags, "chosenExperienceTags");
        if (eVar == null) {
            return f0.f322471a;
        }
        Iterator it8 = ratingsData.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f((z30.e) next, eVar)) {
                break;
            }
        }
        z30.e eVar2 = (z30.e) next;
        if (eVar2 != null && !eVar2.c().isEmpty()) {
            mx0.l lVar = mx0.l.FLEXBOX;
            List<ExperienceTagItem> listC = eVar2.c();
            ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
            for (ExperienceTagItem experienceTagItem : listC) {
                arrayList.add(new ActionsView.Item(j6.a.q("LIST_ID_TAG.", experienceTagItem.f51104a), chosenExperienceTags.contains(experienceTagItem) ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, new TextClause(experienceTagItem.f51105b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, new s50.f(experienceTagItem), null, 24476));
            }
            return zhm.u.c(new z("LIST_ID_TAGS_BOX", arrayList, null, lVar, 0, 0, 116));
        }
        return f0.f322471a;
    }
}
