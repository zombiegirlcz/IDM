package pp4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pnh.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    public static PlusActionNavBarMenuItem a() {
        return PlusActionNavBarMenuItem.Companion.a(PlusActionNavBarMenuItem.INSTANCE, "id_additional_cards_add_cardholder", new TextLocalisedClause(R$string.additional_cards_cardholders_details_invite, null, null, 14), 60);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f238260a, new a0(this, 18), new pof.e(this, 1), new p2b.a(this, 20));
    }
}
