package r6k;

import kotlin.jvm.internal.Intrinsics;
import tqi.g;
import wv9.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f251915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f251916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f251917c;

    public a(c moneyRequestResourcesMapper, gte.a featureToggleInteractor, g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(moneyRequestResourcesMapper, "moneyRequestResourcesMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.f251915a = moneyRequestResourcesMapper;
        this.f251916b = featureToggleInteractor;
        this.f251917c = shareNaviCommandFactory;
    }
}
