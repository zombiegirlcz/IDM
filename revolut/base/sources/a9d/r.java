package a9d;

import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.e0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements jki.p {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f2418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.l f2419b;

    public r(lde.n widgetsInteractor, p9d.c doneButtonProvider, p9d.l searchHintProvider) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(searchHintProvider, "searchHintProvider");
        this.f2418a = doneButtonProvider;
        this.f2419b = searchHintProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Collection collectionG;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_screen_cards_home_title, null, null, 14);
        aim.e eVarB = zhm.u.b();
        eVarB.addAll((List) iii.c.f(domainState.f2405a, new a82.l(this, 24), new p(0), new a2g.m(this, 8)));
        List list = (List) domainState.f2406b.getContent();
        if (list == null) {
            collectionG = f0.f322471a;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(p9d.f.a("CARDS_ACTION_LIGHT_ITEM_ID", (FaqNodeBase) it8.next()));
            }
            collectionG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("CARDS_ACTIONS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_actions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
        }
        eVarB.addAll(collectionG);
        return new o(zhm.u.a(eVarB), textLocalisedClause, ((p9d.m) this.f2419b).a(), ((p9d.d) this.f2418a).a(domainState.f2407c));
    }
}
