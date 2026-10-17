package zn6;

import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(boolean z, oh6.d dVar) {
        return new TextLocalisedClause((z && dVar == oh6.d.CARD_PROVIDER) ? R$string.external_institutions_account_linking_review_authorisation_subtitle_card_provider : z ? R$string.external_institutions_account_linking_review_authorisation_subtitle_renew_bank : dVar == oh6.d.CARD_PROVIDER ? R$string.external_institutions_account_linking_review_authorisation_subtitle_card_provider_setup : R$string.external_institutions_account_linking_review_authorisation_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f323673a, new zhf.f(this, domainState), new zba.a(this, domainState), new y(this, domainState, 19));
    }
}
