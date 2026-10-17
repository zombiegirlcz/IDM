package pw4;

import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.d f240328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f240329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f240330c;
    public final j d;
    public final sri.m e;

    public g(al4.d creditCardAdditionalCardholdersInteractor, i creditCardCashbackWidgetMapper, a0 widgetsUiInteractor, j creditCardCashbackWidgetVisibilityProvider, sri.m navigator) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetMapper, "creditCardCashbackWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetVisibilityProvider, "creditCardCashbackWidgetVisibilityProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f240328a = creditCardAdditionalCardholdersInteractor;
        this.f240329b = creditCardCashbackWidgetMapper;
        this.f240330c = widgetsUiInteractor;
        this.d = creditCardCashbackWidgetVisibilityProvider;
        this.e = navigator;
    }
}
