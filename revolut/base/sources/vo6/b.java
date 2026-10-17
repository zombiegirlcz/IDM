package vo6;

import ang.f;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f290871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f290872b;

    public b(f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f290871a = userInteractor;
        this.f290872b = featureToggleInteractor;
    }

    public final ufm.b a() {
        ufm.b bVarM = d0.m("retail");
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
