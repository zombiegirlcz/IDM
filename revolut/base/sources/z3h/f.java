package z3h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreenContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatingsDetailsScreenContract$InputData f319276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f319277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319278c;

    public f(g gVar, RatingsDetailsScreenContract$InputData ratingsDetailsScreenContract$InputData) {
        this.f319276a = ratingsDetailsScreenContract$InputData;
        int i = 6;
        this.f319277b = e4m.b.b(new k0(gVar, this, 1, i));
        this.f319278c = e4m.b.b(new k0(gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
