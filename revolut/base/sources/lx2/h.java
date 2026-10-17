package lx2;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {
    public static final ChecklistChallenge a(e93.f cardDesign, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ChecklistChallenge) obj2).f65776b instanceof ChecklistChallengeReward.VirtualAsset) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            ChecklistChallengeReward checklistChallengeReward = ((ChecklistChallenge) next).f65776b;
            Intrinsics.i(checklistChallengeReward, "null cannot be cast to non-null type com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward.VirtualAsset");
            List<String> list2 = ((ChecklistChallengeReward.VirtualAsset) checklistChallengeReward).f65793a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (String str : list2) {
                Locale locale = Locale.UK;
                arrayList2.add(v0.a.j(locale, "UK", str, locale, "toUpperCase(...)"));
            }
            if (arrayList2.contains(cardDesign.c().f13615a)) {
                break;
            }
        }
        return (ChecklistChallenge) next;
    }
}
