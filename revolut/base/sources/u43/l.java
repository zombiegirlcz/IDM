package u43;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_payment_method.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import s43.n;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends e {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s43.b f277043c;
    public final t43.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s43.b pocketsMapper, t43.c pocketsTransformer, n searchMatcher, a visibilityPolicy) {
        super(searchMatcher, visibilityPolicy);
        Intrinsics.checkNotNullParameter(pocketsMapper, "pocketsMapper");
        Intrinsics.checkNotNullParameter(pocketsTransformer, "pocketsTransformer");
        Intrinsics.checkNotNullParameter(searchMatcher, "searchMatcher");
        Intrinsics.checkNotNullParameter(visibilityPolicy, "visibilityPolicy");
        this.f277043c = pocketsMapper;
        this.d = pocketsTransformer;
    }

    @Override // u43.e
    public final d a(s43.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        x33.b bVar = input.f259736c;
        return new d(y.x(this.d.a(d0.Q(bVar.f302634c.f302636a), input.a().a(), bVar.f302635g, input.f259737g != null), new u3a.g(24)), null);
    }

    @Override // u43.e
    public final c d(s43.f input, d preprocessedPreviewContent) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(preprocessedPreviewContent, "preprocessedPreviewContent");
        String strA = input.f259735b.a();
        AccountId accountId = input.f259734a;
        if (accountId instanceof AccountId.Joint) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_payment_method_joint_pockets_section_title, null, null, 14);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_payment_method_pockets_section_title, null, null, 14);
        }
        return new c(e.c(textLocalisedClause, strA, d0.T(q43.a.f242003a, input.i)), y.x(preprocessedPreviewContent.f277036a, new twg.a(input, this, 22)));
    }
}
