package l0c;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsControllerContract$InputData;
import com.revolut.feature.terms.api.model.Terms;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    public x(RevPointsReadTermsControllerContract$InputData inputData, a fileReader) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fileReader, "fileReader");
    }

    public static TextClause a(j jVar) {
        String str;
        Terms terms = jVar.f191212a;
        if (terms == null || (str = terms.f90359h) == null) {
            return null;
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f191213b, new s(this, domainState), new v(this, domainState), new kcg.j(this, domainState, 20));
    }
}
