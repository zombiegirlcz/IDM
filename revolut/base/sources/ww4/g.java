package ww4;

import al4.n;
import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementWidgetMapper f300606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f300607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f300608c;
    public final a0 d;
    public final j e;

    public g(CreditCardStatementWidgetMapper creditCardStatementWidgetMapper, n creditCardInteractor, m navigator, a0 widgetsUiInteractor, j creditCardStatementWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardStatementWidgetMapper, "creditCardStatementWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardStatementWidgetVisibilityProvider, "creditCardStatementWidgetVisibilityProvider");
        this.f300606a = creditCardStatementWidgetMapper;
        this.f300607b = creditCardInteractor;
        this.f300608c = navigator;
        this.d = widgetsUiInteractor;
        this.e = creditCardStatementWidgetVisibilityProvider;
    }
}
