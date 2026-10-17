package wh3;

import di3.w;
import ei3.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f297361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q89.e f297362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final di3.k f297363c;
    public final w d;
    public final p e;
    public final y51.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f297364g;

    public a(sh3.a checkoutInteractor, q89.e onboardingInteractor, di3.k checkoutHandler, w resultHandler, p processCheckoutOrderProvider, y51.a externalCardsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutHandler, "checkoutHandler");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(processCheckoutOrderProvider, "processCheckoutOrderProvider");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f297361a = checkoutInteractor;
        this.f297362b = onboardingInteractor;
        this.f297363c = checkoutHandler;
        this.d = resultHandler;
        this.e = processCheckoutOrderProvider;
        this.f = externalCardsInteractor;
        this.f297364g = userInteractor;
    }

    public final n a(zfk.c planSubscriberControllerModelExtension) {
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        return new n(this.f297362b, this.f297361a, new i(this.f297363c, this.d, planSubscriberControllerModelExtension), this.e);
    }
}
