package c64;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e64.b f21621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalculatorScreenContract$InputData f21622b;

    public d0(e64.b calculatorListItemMapper, ae4.a screenHeaderTagMapper, CalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(calculatorListItemMapper, "calculatorListItemMapper");
        Intrinsics.checkNotNullParameter(screenHeaderTagMapper, "screenHeaderTagMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f21621a = calculatorListItemMapper;
        this.f21622b = inputData;
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.credit_application_calculator_title, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f21631b, new bzg.t(this, 29), new bwd.a(this, 23), new b1c.p(this, domainState, 28));
    }
}
