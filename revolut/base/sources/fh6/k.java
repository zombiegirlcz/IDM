package fh6;

import cli.n;
import cli.y;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements dli.b {
    public final MandateLimitInputScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f135163p;

    public k(n stateMapper, MandateLimitInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135163p = mra.d.b(this, new h(inputData.f72458a.getF72455a(), inputData.f72458a, null, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135163p;
    }
}
