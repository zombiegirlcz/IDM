package eb2;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.payid.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f124291a;

    public j(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f124291a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        d dVar = this.f124291a;
        lw0.a aVar = new lw0.a(dVar.f124282a, dVar.f124283b, null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.apm_delete_confirm_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(dVar.f124284c, LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
        RowDelegate.Model model = new RowDelegate.Model(dVar.d, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, dVar.f124285g, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, null, null, 48), dVar.f124286h, null, false, null, false, 60), new TextClause(dVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(R$string.pay_id_details_subtitle, v.k(dVar.e, dVar.f), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new cii.b(gVar, u.c(model), aVar);
    }
}
