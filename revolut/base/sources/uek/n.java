package uek;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.rf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = domainState.f279469a;
        d dVar = domainState.f279470b;
        if (gVar == null) {
            return new h(iii.c.c(5), dVar);
        }
        ArrayList<e> arrayList = gVar.f279472b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (e eVar : arrayList) {
            PodNominee podNominee = eVar.f279466a;
            arrayList2.add(new RowDelegate.Model(j6.a.q("ID_POD_NOMINEE_ITEM_", podNominee.f102617a), new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, podNominee.d, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62), new TextClause(podNominee.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new rf(Long.valueOf(eVar.f279467b), new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, true, null, 44), false, null, false, null, null, null, null, null, null, new i(podNominee.f102617a), null, 0, 0, 0, 0, 532673528));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new h(arrayList2, dVar);
    }
}
