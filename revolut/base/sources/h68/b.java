package h68;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private b() {
    }

    public static TextLocalisedClause a(bj0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = a.f149604a[bVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.junior_common_gender_boy, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.junior_common_gender_girl, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
