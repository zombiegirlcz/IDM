package axb;

import a2g.m;
import aqd.h1;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(new TextLocalisedClause(R$string.gift_cards_home_used_and_expired_title, null, null, 14), (List) iii.c.f(domainState.f10915a, new ax9.a(this, 6), new h1(this, 28), new m(this, 29)));
    }
}
