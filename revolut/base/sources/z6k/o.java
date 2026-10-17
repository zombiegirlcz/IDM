package z6k;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    @NotNull
    public static final k Companion = new k();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vv9.c f319802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1a.i f319803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f319804c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(100, pkm.e.MILLISECONDS);
    }

    public o(vv9.c moneyRequestInteractor, m1a.i itemizationItemsDetailsDataProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(itemizationItemsDetailsDataProvider, "itemizationItemsDetailsDataProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f319802a = moneyRequestInteractor;
        this.f319803b = itemizationItemsDetailsDataProvider;
        this.f319804c = featureToggleInteractor;
    }
}
