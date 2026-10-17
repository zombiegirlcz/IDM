package yl9;

import cli.y;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements dli.b {
    public final FallbackConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f314674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ql9.d f314675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f314676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f314677s;

    public k(FallbackConfirmationScreenContract$InputData inputData, l80.e dateProvider, ql9.d settingsRepository, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f314674p = dateProvider;
        this.f314675q = settingsRepository;
        this.f314677s = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        long j2 = this.o.f78958a.e;
        ((l80.f) this.f314674p).getClass();
        long jCurrentTimeMillis = j2 - System.currentTimeMillis();
        a2 a2Var = this.f314676r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f314676r = yji.l.a1(this, ta6.a.J(jCurrentTimeMillis, TimeUnit.MILLISECONDS), null, null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314677s;
    }
}
