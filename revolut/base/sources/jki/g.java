package jki;

import aii.s;
import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.t0;
import yji.r;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g extends yji.l implements h, r {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f175188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zji.d f175189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zji.d f175190n;
    public final Object o;

    public g(p stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f175188l = stateMapper;
        this.f175189m = new zji.d();
        this.f175190n = new zji.d();
        this.o = yhm.j.c(yhm.k.NONE, new ite.d(this, 4));
    }

    @Override // yji.l
    public final void S1(s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.S1(event);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.setClassLoader(getClass().getClassLoader());
        Parcelable parcelable = state.getParcelable("DOMAIN_STATE_KEY");
        if (parcelable != null) {
            kki.a aVarS2 = s2();
            if (aVarS2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ((MutableSharedFlow) this.o.getValue()).k(aVarS2.c(r2(), parcelable));
        }
    }

    public void g(Bundle outState) {
        ScreenStates$RetainedDomain screenStates$RetainedDomainA;
        Intrinsics.checkNotNullParameter(outState, "outState");
        kki.a aVarS2 = s2();
        if (aVarS2 == null || (screenStates$RetainedDomainA = aVarS2.a(t2())) == null) {
            return;
        }
        outState.putParcelable("DOMAIN_STATE_KEY", screenStates$RetainedDomainA);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public Flow q2() {
        return q.q((MutableSharedFlow) this.o.getValue());
    }

    public abstract i r2();

    public kki.a s2() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final i t2() {
        Object objD0 = d0.d0(((MutableSharedFlow) this.o.getValue()).d());
        if (objD0 != null) {
            return (i) objD0;
        }
        throw new IllegalStateException("initialState must be initialised to use coroutines API");
    }

    public final void u2() {
        this.f175190n.a(Unit.f186387a);
    }

    public final void v2(aii.r result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f175189m.a(result);
    }

    public final t0 w2() {
        return q.B(new ald.p(this, null, 7), new t0(q2(), 2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void x2(Function1 func) {
        Intrinsics.checkNotNullParameter(func, "func");
        ((MutableSharedFlow) this.o.getValue()).k(func.invoke(t2()));
    }
}
