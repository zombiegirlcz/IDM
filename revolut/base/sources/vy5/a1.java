package vy5;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f293134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uy5.f f293135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f293136c;
    public final x79.a d;
    public final utk.f e;
    public final zy5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e95.a f293137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wda.r f293138h;
    public final wa7.m i;

    public a1(v0 mapper, uy5.f interactor, ang.f userInteractor, x79.a onHoldAccountInteractor, utk.f alternativeFeaturesProvider, zy5.a currencyEmptyStateProvider, e95.a overdraftHomeAccountInteractor, wda.r pocketDetailsPreviewSource, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(alternativeFeaturesProvider, "alternativeFeaturesProvider");
        Intrinsics.checkNotNullParameter(currencyEmptyStateProvider, "currencyEmptyStateProvider");
        Intrinsics.checkNotNullParameter(overdraftHomeAccountInteractor, "overdraftHomeAccountInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsPreviewSource, "pocketDetailsPreviewSource");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f293134a = mapper;
        this.f293135b = interactor;
        this.f293136c = userInteractor;
        this.d = onHoldAccountInteractor;
        this.e = alternativeFeaturesProvider;
        this.f = currencyEmptyStateProvider;
        this.f293137g = overdraftHomeAccountInteractor;
        this.f293138h = pocketDetailsPreviewSource;
        this.i = hiddenAccountsInteractor;
    }

    @Override // pfe.g
    public final Flow a() {
        return new go.g(Boolean.TRUE, 2);
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        vkm.f fVarM = vkm.q.m(new z0(this, null));
        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
        return vkm.q.C(fVarM, oji.e.f225788b);
    }
}
