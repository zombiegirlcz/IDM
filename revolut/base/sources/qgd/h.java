package qgd;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.watchlists_new_watchlist_title, null, null, 14), null, null, null, false, 30);
        List listC = u.c(new InputTextDelegate.Model("new-watchlist-name-input", new TextClause(domainState.f245778a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.watchlists_new_watchlist_name_input_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.watchlists_new_watchlist_create_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, !d0.W(domainState.f245778a), null, null, 988), null, null, 55), listC, aVar);
    }
}
