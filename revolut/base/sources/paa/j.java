package paa;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8a.a f234466a;

    public j(j8a.a pixKeyFormatter) {
        Intrinsics.checkNotNullParameter(pixKeyFormatter, "pixKeyFormatter");
        this.f234466a = pixKeyFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextClause(((vca.f) this.f234466a).a(domainState.f234460a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(c6d.b.k(domainState.f234460a), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 28);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RowDelegate.Model model = new RowDelegate.Model("list_id_create_qr", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_qr, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.pix_manage_alias_create_qr, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        LayeredImage layeredImageI = companion.i(R$drawable.uikit_icn_24_delete, R$attr.uikit_colorRed, R$attr.uikit_colorRed_10);
        List listK = v.k(model, new RowDelegate.Model("list_id_delete_key", new RowDelegate.Model.MainImage.Image40(layeredImageI, null, null, false, null, false, 62), new TextLocalisedClause(R$string.pix_manage_alias_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new h(listK, aVar);
    }
}
