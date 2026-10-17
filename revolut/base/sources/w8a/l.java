package w8a;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8a.a f295636a;

    public l(j8a.a pixKeyFormatter) {
        Intrinsics.checkNotNullParameter(pixKeyFormatter, "pixKeyFormatter");
        this.f295636a = pixKeyFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pix_delete_prompt_title, null, null, 14), new TextLocalisedClause(R$string.pix_delete_prompt_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 28);
        PixKey pixKey = domainState.f295627a;
        List listC = u.c(new RowDelegate.Model(pixKey.getF80405a(), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(c6d.b.j(pixKey), R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextClause(((vca.f) this.f295636a).a(pixKey), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, new TextLocalisedClause(c6d.b.k(pixKey), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List listK = v.k(new LargeActionButtonDelegate.Model("DELETE_KEY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pix_delete_prompt_primary_action, null, null, 14), false, null, null, R$attr.uikit_dp16, 0, 0, 0, 7664), new LargeActionButtonDelegate.Model("CANCEL_DELETE_KEY_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.pix_delete_prompt_cancel, null, null, 14), false, null, null, R$attr.uikit_dp16, 0, 0, 0, 7664));
        yp0.b.q(listK, 0, R$attr.uikit_dp16, 0, 0, 13);
        return new h(d0.E0(listK, listC), aVar);
    }
}
