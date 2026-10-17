package jkh;

import aw0.s;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import ip0.l1;
import java.util.List;
import jfb.v0;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements n {

    @NotNull
    public static final C0994a Companion = new C0994a();

    /* JADX INFO: renamed from: jkh.a$a, reason: collision with other inner class name */
    public static final class C0994a {
        private C0994a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        kih.c domainState = (kih.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        m mVar = (m) iii.c.f(domainState.f184234b, new jj3.a(18), new v0(21), new jb8.b(12));
        List list = null;
        if (domainState.f184235c) {
            List listC = u.c(new l1(new AppTipUIModel("CurrencyChangerChangeTip", null, new TextLocalisedClause(R$string.wealth_invest_currency_changer_tooltip_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_currency_changer_tooltip_description, null, null, 14), new s(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lightbulb, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48)), null, null, kih.b.f184232a, 738)));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        }
        List[] elements = {list, (List) iii.c.f(domainState.f184233a, new jj3.a(17), new v0(20), new jb8.b(11))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new kih.f(mVar, w.u(kotlin.collections.d.L(elements)));
    }
}
