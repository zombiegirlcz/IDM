package t73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f268460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f268461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f268462c;
    public final ang.f d;
    public final d9e.b e;
    public final Object f;

    public f(xua.a recurringPaymentInteractor, gte.a featureToggleInteractor, l80.e dateProvider, ang.f userInteractor, d9e.b raisedSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(raisedSubscriptionsInteractor, "raisedSubscriptionsInteractor");
        this.f268460a = recurringPaymentInteractor;
        this.f268461b = featureToggleInteractor;
        this.f268462c = dateProvider;
        this.d = userInteractor;
        this.e = raisedSubscriptionsInteractor;
        this.f = te0.w.y0(new sii.a(this, 21));
    }

    public final sfm.b a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        ufm.i iVar = new ufm.i(this.d.f(false), new t45.a(new t3b.g(29), 12), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        sfm.b bVar = new sfm.b(ue0.e.I(iVar, zhm.h0.f322473a, new d(0)), new t45.a(new sx2.h(this, cardId, 25), 13), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
