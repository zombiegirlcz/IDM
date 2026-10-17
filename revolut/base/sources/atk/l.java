package atk;

import a0e.m;
import ael.d0;
import akb.s;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f9091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f9092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c4h.c f9093n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f9094p;

    public l(e inputData, d0 stocksInteractor, c4h.c stocksOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(stocksOnboardingInteractor, "stocksOnboardingInteractor");
        this.f9091l = inputData;
        this.f9092m = stocksInteractor;
        this.f9093n = stocksOnboardingInteractor;
        d dVar = new d(new Data(null, null, false, 7, null));
        this.o = dVar;
        this.f9094p = pyd.c.a(this, dVar);
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, q.Q(this.f9093n.a(), new m((Continuation) null, this, 27)), null, null, 7);
    }

    @Override // atk.c
    public final void Z2() {
        V2(new s(this, null, 16), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f9094p;
    }
}
