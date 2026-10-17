package hx9;

import com.revolut.data.model.Data;
import efm.r;
import hw3.d;
import kotlin.jvm.internal.Intrinsics;
import uw1.e;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f156412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wif.a f156413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f156414c;
    public final gte.a d;

    public a(n walletsInteractor, wif.a userFeaturesChecker, e apmProductProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(apmProductProvider, "apmProductProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f156412a = walletsInteractor;
        this.f156413b = userFeaturesChecker;
        this.f156414c = apmProductProvider;
        this.d = featureToggleInteractor;
    }

    public final r a() {
        r rVarSwitchMap = this.f156413b.d(wog.a.JUNIOR).switchMap(new d(21, new hw9.a(this, 7)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.E(rVarSwitchMap, new Data(null, null, false, 7, null));
    }
}
