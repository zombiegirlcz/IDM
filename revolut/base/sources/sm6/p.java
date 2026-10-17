package sm6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends oki.h implements dli.b {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kg6.a f264378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qr0.i f264379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f264380r;

    public p(k inputData, kg6.a indiaUpiAppInteractor, qr0.i upiAppSorter, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(indiaUpiAppInteractor, "indiaUpiAppInteractor");
        Intrinsics.checkNotNullParameter(upiAppSorter, "upiAppSorter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f264378p = indiaUpiAppInteractor;
        this.f264379q = upiAppSorter;
        this.f264380r = mra.d.b(this, new j(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        boolean z = this.o.f264372c != null;
        kg6.a aVar = this.f264378p;
        aVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        th6.h hVar = aVar.f183920a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, nim.a.u(new o(this, continuation, 0), hVar.f271278c.b(z ? "mcy_upi_app" : "upi_app", loadingStrategy)), null, null, new o(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f264380r;
    }
}
