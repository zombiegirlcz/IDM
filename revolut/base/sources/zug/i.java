package zug;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements dli.b {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f325461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.c f325462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f325463r;

    public i(k stateMapper, j saveStateDelegate, b inputData, r dividendsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dividendsInteractor, "dividendsInteractor");
        this.o = inputData;
        this.f325461p = dividendsInteractor;
        this.f325462q = new vii.c();
        this.f325463r = mra.d.b(this, new a(0), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f325462q.a(Unit.f186387a, w4l.h.f294642c), new z6e.g(continuation, this, 21)), null, null, new zt4.l(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f325463r;
    }
}
