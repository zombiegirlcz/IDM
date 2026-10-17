package xvf;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f309259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f309260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageClause f309261c;

    public static final class a {
        private a() {
        }
    }

    public n() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transport_get_help_otp_action, null, null, 14);
        int i = R$drawable.uikit_icn_24_link_external;
        ImageClauseTint.TextColor textColor = ImageClauseTint.TextColor.f57790a;
        List listK = v.k(textLocalisedClause, new ImageClause(i, textColor, (Float) null, (Float) null, 28));
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        this.f309259a = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        List listK2 = v.k(new TextLocalisedClause(R$string.transport_get_help_otp_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new ImageClause(R$drawable.uikit_icn_24_link_external, new ImageClauseTint.Color(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f309260b = new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        int i2 = R$drawable.uikit_icn_16_copy;
        Float fValueOf = Float.valueOf(16.0f);
        this.f309261c = new ImageClause(i2, textColor, fValueOf, fValueOf, 16);
    }

    public final CellDetailsActionDelegate.Model a(String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transport_get_help_otp_field_username, null, null, 14);
        List listK = v.k(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), this.f309261c);
        m70.a.t(t0.f186434a);
        return new CellDetailsActionDelegate.Model("ID_USERNAME", textLocalisedClause, 0, null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, false, null, new c(str), 0, 0, 32224);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f309249a, new xub.e(15), new xti.k(9), new wx6.k(this, domainState, 21));
        List listK = v.k(new RowDelegate.Model("ID_SKYCASH_1", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 24), false, false, 6), new TextLocalisedClause(R$string.transport_get_help_otp_step_portal_generic, u.c(this.f309260b), null, 12), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, d.f309248a, null, 0, 0, 0, 0, 532674552), new RowDelegate.Model("ID_SKYCASH_2", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 24), false, false, 6), new TextLocalisedClause(R$string.transport_get_help_otp_step_login, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new g(this.f309259a, d0.E0(list, listK));
    }
}
