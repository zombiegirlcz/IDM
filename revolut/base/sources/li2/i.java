package li2;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.apm.wero.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new b((List) iii.c.f(domainState.f195402a, new z(20), new l9j.j(22), new ldj.g(this, 1)), u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "ID_NAVBAR_MENU_PLUS", new TextLocalisedClause(R$string.wero_qr_link_list_title, null, null, 14))));
    }
}
