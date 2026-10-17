package eol;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.sso.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(!domainState.f127997b ? f0.f322471a : u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "LIST_ID_NEW_PASSKEY", new TextLocalisedClause(R$string.revolut_sso_passkeys_management_bar_button_new, null, null, 14), null, 60)), (List) iii.c.f(domainState.f127996a, new elb.a(28), new en6.a(7), new dob.a(this, 27)));
    }
}
