package qw4;

import al4.n;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f249770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f249771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f249772c;
    public final f d;

    public g(n creditCardInteractor, e creditCardCashbackWidgetMapper, a0 widgetsUiInteractor, f creditCardCashbackWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetMapper, "creditCardCashbackWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetVisibilityProvider, "creditCardCashbackWidgetVisibilityProvider");
        this.f249770a = creditCardInteractor;
        this.f249771b = creditCardCashbackWidgetMapper;
        this.f249772c = widgetsUiInteractor;
        this.d = creditCardCashbackWidgetVisibilityProvider;
    }
}
