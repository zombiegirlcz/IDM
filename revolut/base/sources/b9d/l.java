package b9d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f13725a;

    public l(lde.n widgetsInteractor, p9d.c doneButtonProvider) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        this.f13725a = doneButtonProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.addAll((List) iii.c.f(domainState.f13716b, new b96.a(this, 4), new b6d.a(23), new b0c.a(5)));
        Data data = domainState.f13717c;
        String str = domainState.f13715a;
        eVarB.addAll((List) iii.c.f(data, new b96.a(this, 3), new b6d.a(22), new k(0, str, this)));
        aim.e eVarA = u.a(eVarB);
        ArrayList arrayList = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_screen_cards_troubleshooter_title_v2, null, null, 14);
        List listA = ((p9d.d) this.f13725a).a(domainState.d);
        String str2 = domainState.e;
        List list = (List) data.getContent();
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((hj0.f) it8.next()).getKey());
            }
        }
        return new j(eVarA, textLocalisedClause, listA, l7d.a.c(str, str2, arrayList));
    }
}
