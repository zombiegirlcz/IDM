package ag5;

import a2g.m;
import ael.r0;
import aw0.m6;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.exchange.fees.api.R$string;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f4796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f4797b;

    public j(sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f4796a = serverErrorParser;
        this.f4797b = serverErrorsProvider;
    }

    public static aw0.e a() {
        return new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_exchange_fees_got_it, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, null, 1020), null, null, 55);
    }

    public static lw0.a b() {
        return new lw0.a(new TextLocalisedClause(R$string.crypto_exchange_fees_title, null, null, 14), new TextLocalisedClause(R$string.crypto_exchange_fees_description_simplified_info, u.c(new TextLocalisedClause(R$string.crypto_exchange_fees_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_CLICK_ID", false), 10)), null, 12), null, null, false, 28);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f4788b != CryptoExchangeFeesDialogMode.INFORMATIONAL) {
            return (cii.b) iii.c.f(domainState.f4787a, new r0(this, 28), new ack.f(this, 12), new m(this, 14));
        }
        return new cii.b(a(), f0.f322471a, b());
    }
}
