package adb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList<d> arrayList = domainState.f3314a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (d dVar : arrayList) {
            arrayList2.add(new RowDelegate.Model(dVar.getId(), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(dVar.b(), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), new TextLocalisedClause(dVar.c(), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(dVar.a(), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new l(arrayList2);
    }
}
