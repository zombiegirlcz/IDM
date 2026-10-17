package abl;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.loading.LoadingScreenContract$InputData;
import java.util.Map;
import jki.i;
import jki.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fal.b f2986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LoadingScreenContract$InputData f2987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f2988r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, fal.b suspiciousTransactionInteractor, LoadingScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f2986p = suspiciousTransactionInteractor;
        this.f2987q = inputData;
        this.f2988r = b.f2980a;
    }

    @Override // yji.l
    public final void I1() {
        LoadingScreenContract$InputData loadingScreenContract$InputData = this.f2987q;
        String transactionId = loadingScreenContract$InputData.f105013a;
        Map params = loadingScreenContract$InputData.f105014b;
        pal.a aVar = (pal.a) this.f2986p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(params, "params");
        ial.f fVar = (ial.f) aVar.f234578a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(params, "params");
        l.a1(this, rd0.e.b(fVar.e.f(new Pair(transactionId, params), true)), null, null, new f(this, null), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f2988r;
    }
}
