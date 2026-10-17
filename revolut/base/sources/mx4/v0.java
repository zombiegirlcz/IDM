package mx4;

import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.h4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210196a;

    public v0(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210196a = contentImageMapper;
    }

    public static TextLocalisedClause a(Clause clause) {
        return new TextLocalisedClause(R$string.credit_application_constructor_row_title, zhm.u.c(clause), null, 12);
    }

    public static j2 b(h4 h4Var) {
        int i = u0.f210194a[h4Var.ordinal()];
        if (i == 1) {
            return j2.CAPTION;
        }
        if (i == 2) {
            return j2.H6;
        }
        throw new NoWhenBranchMatchedException();
    }
}
