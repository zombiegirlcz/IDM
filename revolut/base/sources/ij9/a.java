package ij9;

import com.revolut.feature.pay_later.impl.ui.help.PayLaterGetHelpDialogFactory;
import kotlin.jvm.internal.Intrinsics;
import ui9.z;
import vi9.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh9.a f161734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qi9.d f161735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f161736c;
    public final vi9.d d;
    public final vi9.f e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PayLaterGetHelpDialogFactory f161737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f161738h;
    public final ang.f i;

    public a(xh9.a payLaterInteractor, qi9.d payLaterNavigationCommandFactory, e0 payLaterStateDialogMapper, vi9.d payLaterActivationErrorDialogMapper, vi9.f payLaterActivationWarningDialogMapper, z payLaterCrossSellInteractor, PayLaterGetHelpDialogFactory payLaterGetHelpDialogFactory, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterActivationErrorDialogMapper, "payLaterActivationErrorDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterActivationWarningDialogMapper, "payLaterActivationWarningDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterCrossSellInteractor, "payLaterCrossSellInteractor");
        Intrinsics.checkNotNullParameter(payLaterGetHelpDialogFactory, "payLaterGetHelpDialogFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f161734a = payLaterInteractor;
        this.f161735b = payLaterNavigationCommandFactory;
        this.f161736c = payLaterStateDialogMapper;
        this.d = payLaterActivationErrorDialogMapper;
        this.e = payLaterActivationWarningDialogMapper;
        this.f = payLaterCrossSellInteractor;
        this.f161737g = payLaterGetHelpDialogFactory;
        this.f161738h = featureToggleInteractor;
        this.i = userInteractor;
    }

    public final sj9.a a() {
        return new sj9.a(this.f161734a, this.f161735b, this.d);
    }

    public final com.revolut.feature.pay_later.impl.ui.help.a b(f15.a getCreditHelpExtension) {
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        return new com.revolut.feature.pay_later.impl.ui.help.a(getCreditHelpExtension, this.f161737g, this.f161738h, this.f161734a, this.i);
    }
}
