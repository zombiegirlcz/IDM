package y4h;

import ael.d0;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xv4.o;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RatingsDetailsScreenContract$InputData f310942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f310943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f310944r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RatingsDetailsScreenContract$InputData inputData, d0 stocksInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f310942p = inputData;
        this.f310943q = stocksInteractor;
        this.f310944r = new d(inputData.f95436a, null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(nim.a.w(this.f310943q.a(this.f310942p.f95437b.f214596b, false), new y4b.b(12))), null, new o(this, (Continuation) null, 23), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f310944r;
    }
}
