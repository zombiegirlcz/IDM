package myg;

import aw0.k7;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f210505a;

    public k(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210505a = featureToggleInteractor;
    }

    public static MoneyClause a(dj0.d dVar, Integer num) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), num != null ? new Custom(Integer.valueOf(num.intValue()), false, null, false, null, 254) : null, null, 8);
    }
}
