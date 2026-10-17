package veh;

import cli.y;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabControllerContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import vkm.j2;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements dli.b {
    public final OptionsTabControllerContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rul.e f288335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f288336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f288337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f288338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f288339t;
    public final y u;

    public k(n stateMapper, OptionsTabControllerContract$Input inputData, rul.e optionsInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(optionsInteractor, "optionsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = inputData;
        this.f288335p = optionsInteractor;
        this.f288336q = instrumentTickerInteractor;
        this.f288337r = new vii.b();
        this.f288338s = q.c(null);
        this.f288339t = new vii.b();
        this.u = mra.d.b(this, new e(null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(((ael.k) this.f288336q).g(this.o.f95719a), h0.f322473a), null, null, new j(0, continuation, this), 3);
        yji.l.a1(this, q.Q(this.f288338s, new i(0, continuation, this)), null, null, new j(1, continuation, this), 3);
        yji.l.a1(this, q.Q(this.f288337r, new i(1, continuation, this)), null, null, new j(2, continuation, this), 3);
    }

    public final void I2(Function1 function1) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        H2(this.u, new sc7.b(function1, ref$ObjectRef, this, ref$BooleanRef, 16));
        if (ref$BooleanRef.f186407a) {
            this.f288338s.setValue(ref$ObjectRef.f186409a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
