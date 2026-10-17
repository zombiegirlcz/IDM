package u43;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_payment_method.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nkm.r;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import s43.n;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s43.b f277040c;
    public final t43.c d;
    public final TextLocalisedClause e;
    public final TextLocalisedClause f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s43.b pocketsMapper, t43.c pocketsTransformer, n searchMatcher, a visibilityPolicy) {
        super(searchMatcher, visibilityPolicy);
        Intrinsics.checkNotNullParameter(pocketsMapper, "pocketsMapper");
        Intrinsics.checkNotNullParameter(pocketsTransformer, "pocketsTransformer");
        Intrinsics.checkNotNullParameter(searchMatcher, "searchMatcher");
        Intrinsics.checkNotNullParameter(visibilityPolicy, "visibilityPolicy");
        this.f277040c = pocketsMapper;
        this.d = pocketsTransformer;
        this.e = new TextLocalisedClause(R$string.card_payment_method_all_accounts_crypto, null, null, 14);
        this.f = new TextLocalisedClause(R$string.card_payment_method_all_accounts_by_highest_balance, null, null, 14);
    }

    @Override // u43.e
    public final d a(s43.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        x33.b bVar = input.f259736c;
        nkm.c cVarA = this.d.a(d0.Q(bVar.f302633b.f302636a), input.a().a(), bVar.f302635g, input.f259737g != null);
        boolean z = y.j(cVarA) == 0;
        TextLocalisedClause textLocalisedClause = this.e;
        return new d(z ? new r(new s43.c(textLocalisedClause, "SEARCHABLE_ITEM_ID_ALL_BALANCES_CRYPTO"), 1) : y.E(new r(new s43.c(textLocalisedClause, "SEARCHABLE_ITEM_ID_ALL_BALANCES_CRYPTO"), 1), y.x(cVarA, new u3a.g(22))), null);
    }

    @Override // u43.e
    public final c d(s43.f input, d preprocessedPreviewContent) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(preprocessedPreviewContent, "preprocessedPreviewContent");
        return new c(e.c(new TextLocalisedClause(R$string.card_payment_method_crypto_section_title, null, null, 14), input.f259735b.a(), input.f259738h), y.x(preprocessedPreviewContent.f277036a, new twg.a(this, input, 20)));
    }
}
