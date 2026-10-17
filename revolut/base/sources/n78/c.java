package n78;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f213035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf8.n f213036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f213037c;
    public final hj8.a d;
    public final ic8.b e;
    public final hy2.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f213038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vii.b f213039h;

    public c(n walletsInteractor, zf8.n juniorAccountStatesProvider, f cardsInteractor, hj8.a profileInteractor, ic8.b juniorCardRequestInteractor, hy2.f cardDesignInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(profileInteractor, "profileInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f213035a = walletsInteractor;
        this.f213036b = juniorAccountStatesProvider;
        this.f213037c = cardsInteractor;
        this.d = profileInteractor;
        this.e = juniorCardRequestInteractor;
        this.f = cardDesignInteractor;
        this.f213038g = pricingPlanInteractor;
        this.f213039h = new vii.b();
    }
}
