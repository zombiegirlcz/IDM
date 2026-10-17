package h74;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f149861a;

    public r(z mapper, ix4.b checkboxValidator) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(checkboxValidator, "checkboxValidator");
        this.f149861a = mapper;
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.consents_template_documents_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f149842b, new h5i.b(this), new h43.q(this, 7), new fyg.b(this, domainState, 28));
    }
}
