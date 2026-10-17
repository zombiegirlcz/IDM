package ab4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx4.r f2890a;

    public u(mx4.r checkboxItemContentItemMapper) {
        Intrinsics.checkNotNullParameter(checkboxItemContentItemMapper, "checkboxItemContentItemMapper");
        this.f2890a = checkboxItemContentItemMapper;
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.credit_application_e_signature_documents_title_template, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f2873a, new a9h.b(this, 15), new a9d.p(this, 4), new a2f.q(this, 7));
    }
}
