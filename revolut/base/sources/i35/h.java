package i35;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import i2l.n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {
    public static e a(List list) {
        return new e(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.credit_collateral_account_title, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorIndigo), list);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f158097a, new i2i.o(this, 23), new n0(this, 2), new gzb.d(this, 23));
    }
}
