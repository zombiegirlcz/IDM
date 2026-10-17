package qk2;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import kotlin.jvm.internal.Intrinsics;
import qg7.v;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {
    public static cii.b a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_cross, GlyphImageTint.DANGER.f59929a, null, 4)), null, false, 26);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, aVar);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f246951a, new v(27), new qjj.g(this, 4), new h(this, 0));
    }
}
