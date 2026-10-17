package jnb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(List list, ListSubheaderDelegate.Model model) {
        List<bjb.a> listP0 = d0.P0(list, new n());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (bjb.a aVar : listP0) {
            arrayList.add(new RowDelegate.Model(j6.a.q("DOCUMENT_LIST_ITEM_ID_", aVar.f15589a), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextClause(aVar.f15589a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar.f15590b, null, 0, 0, 0, 0, 532676600));
        }
        if (model != null) {
            return yp0.b.g(arrayList, model, null, 0, 0, 126);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f176668a, new jn2.a(1), new jme.f(3), new jb8.b(this, 15));
    }
}
