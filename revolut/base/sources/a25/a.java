package a25;

import al4.p;
import com.revolut.feature.credit.impl.notifications.data.i;
import kotlin.jvm.internal.Intrinsics;
import pp3.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f667c;

    public a(i repository, gte.a featureToggleInteractor, p creditCardProductFeatureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureToggleInteractor, "creditCardProductFeatureToggleInteractor");
        this.f665a = repository;
        this.f666b = featureToggleInteractor;
        this.f667c = creditCardProductFeatureToggleInteractor;
    }
}
