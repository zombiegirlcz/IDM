package e11;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.crypto.challenge.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {
    public static TextLocalisedClause a(f11.c plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        int i = c.f121846a[plan.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.crypto_challenge_progress_plan_premium, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.crypto_challenge_progress_plan_metal, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.crypto_challenge_progress_plan_ultra, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
