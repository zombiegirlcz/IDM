package j1k;

import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreenContract$InputData;
import imk.p0;
import iug.j;
import jki.h;
import jki.i;
import jki.p;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WealthDailyNewsScreenContract$InputData f170628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0k.c f170629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f170630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f170631s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WealthDailyNewsScreenContract$InputData inputData, m0k.c dailyNewsInteractor, b0 footerDisclosurePresentationModel, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dailyNewsInteractor, "dailyNewsInteractor");
        Intrinsics.checkNotNullParameter(footerDisclosurePresentationModel, "footerDisclosurePresentationModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f170628p = inputData;
        this.f170629q = dailyNewsInteractor;
        this.f170630r = footerDisclosurePresentationModel;
        this.f170631s = new d(inputData.f101871a, null, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f170629q.f201158a), null, null, new j(this, continuation, 13), 3);
        l2(new p0(this, continuation, 13), new yi5.b(26));
    }

    @Override // jki.g
    public final i r2() {
        return this.f170631s;
    }
}
