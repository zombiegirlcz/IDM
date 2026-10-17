package lol;

import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tll.n;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f197475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jol.b f197476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f197477r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, n parentStateReceiver, jol.b passwordFlowDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(parentStateReceiver, "parentStateReceiver");
        Intrinsics.checkNotNullParameter(passwordFlowDialogFactory, "passwordFlowDialogFactory");
        this.f197475p = parentStateReceiver;
        this.f197476q = passwordFlowDialogFactory;
        this.f197477r = new f(null, true, false);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f197475p.f272117a, null, null, new le8.d(this, (Continuation) null, 28), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f197477r;
    }
}
