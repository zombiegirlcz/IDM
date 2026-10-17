package gf5;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final yud.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final df5.b f143350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final std.a f143351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sh5.d f143352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f143353s;

    public h(f stateMapper, yud.g stakingInteractor, df5.b disclaimerClauseProvider, std.a stakingProductActionControllerModelExtension, sh5.d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(disclaimerClauseProvider, "disclaimerClauseProvider");
        Intrinsics.checkNotNullParameter(stakingProductActionControllerModelExtension, "stakingProductActionControllerModelExtension");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.o = stakingInteractor;
        this.f143350p = disclaimerClauseProvider;
        this.f143351q = stakingProductActionControllerModelExtension;
        this.f143352r = cryptoFcaDisclaimerWidget;
        this.f143353s = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, this.o.e(w4l.h.f294642c), null, new gaa.g(this, continuation, 18), 3);
        n2(new g(this, continuation, 0), new whi.b(6));
        n2(new g(this, continuation, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f143353s;
    }
}
