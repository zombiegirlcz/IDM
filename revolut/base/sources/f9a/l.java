package f9a;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String str, int i, int i2, AliasRegistrationType aliasRegistrationType) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aliasRegistrationType, null, 0, 0, 0, 0, 532676600);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        y yVar = null;
        if (domainState.f132877a) {
            Data data = domainState.f132878b;
            yVar = new y((List) iii.c.f(data, new f7l.c(4), new f5g.l(11), new et6.a(this, 17)), new t(new TextLocalisedClause(R$string.pix_new_alias_prompt_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_alias_prompt_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28), rp0.l.WINDOW, null, null, null, 1016);
        }
        return new h(yVar);
    }
}
