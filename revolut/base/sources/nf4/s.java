package nf4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f214824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalculatorScreenContract$InputData f214825b;

    public s(b0 calculatorListItemMapper, ae4.a screenHeaderTagMapper, CalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(calculatorListItemMapper, "calculatorListItemMapper");
        Intrinsics.checkNotNullParameter(screenHeaderTagMapper, "screenHeaderTagMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f214824a = calculatorListItemMapper;
        this.f214825b = inputData;
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.credit_application_calculator_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f214806b, new n7h.c(this, 25), new n8i.e(this, 12), new m88.c(this, domainState, 28));
    }
}
