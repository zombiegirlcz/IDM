package n79;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.notification_centre.R$string;
import ip0.ck0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import kw0.e;
import kw0.g;
import kw0.h;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = new g(new kw0.k((ResourceImage) null, new TextLocalisedClause(R$string.revolut_feed_screen_header_revolut_news_title, null, null, 14), (TextLocalisedClause) null, 11), new e(new AvatarModel.Default(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_megaphone, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, null, null, null, 126)), (TextLocalisedClause) null, new h(new TextLocalisedClause(R$string.revolut_feed_screen_header_revolut_news_title, null, null, 14), null, null, 14), (Clause) null, (kw0.c) null, 116);
        TextDelegate.Model model = new TextDelegate.Model("TEXT_ITEM_ID", new TextLocalisedClause(R$string.revolut_feed_profile_description, null, null, 14), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        return new b(u.c(model), gVar);
    }
}
