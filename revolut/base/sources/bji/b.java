package bji;

import aii.o;
import android.os.Bundle;
import cji.d;
import com.revolut.kompot.common.utils.ApiMisuseException;
import efm.c0;
import efm.d0;
import efm.r;
import ifm.c;
import java.util.Map;
import java.util.Set;
import jki.g;
import jki.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import l9.l;
import rd0.e;
import te0.w;
import tji.f;
import y4l.e;
import zc0.m;
import zii.h;
import zii.i;
import zii.j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends g implements j, i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c0 f15675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cji.a f15676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ifm.b f15677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ifm.b f15678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15679t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f15676q = new cji.a();
        this.f15677r = new ifm.b();
        this.f15678s = new ifm.b();
        this.f15679t = w.y0(new androidx.lifecycle.b(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final ofm.i A2(d0 d0Var, Function1 onSuccess, Function1 handleError) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        return ((h) this.f15679t.getValue()).f(d0Var, onSuccess, handleError);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final c E(r rVar, Function1 onNext, Function1 handleError, m onComplete, zii.c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        return ((h) this.f15679t.getValue()).E(rVar, onNext, handleError, onComplete, onSubscribe);
    }

    @Override // yji.l
    public final void O1() {
        this.f15677r.d();
    }

    @Override // yji.l
    public final void R1() {
        this.f15678s.d();
    }

    @Override // jki.g, yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        cji.a aVar = this.f15676q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        state.setClassLoader(cji.a.class.getClassLoader());
        for (Map.Entry entry : aVar.f24682a.entrySet()) {
            String str = (String) entry.getKey();
            cji.b bVar = (cji.b) entry.getValue();
            Object obj2 = state.get(str);
            if (obj2 != null) {
                ((d) bVar).d(obj2);
            }
        }
    }

    @Override // jki.g, yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        cji.a aVar = this.f15676q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        for (Map.Entry entry : aVar.f24682a.entrySet()) {
            l.c(outState, (String) entry.getKey(), ((d) ((cji.b) entry.getValue())).b());
        }
    }

    @Override // jki.g
    public final Flow q2() {
        try {
            return super.q2();
        } catch (ApiMisuseException unused) {
            return e.b(y2());
        }
    }

    @Override // jki.g
    public jki.i r2() {
        Intrinsics.checkNotNullParameter("Initial state must be initialized to use coroutines API", "msg");
        throw new ApiMisuseException("Initial state must be initialized to use coroutines API");
    }

    @Override // zii.j
    public final c0 u0() {
        return this.f15675p;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final c w0(r rVar, Function1 onNext, Function1 handleError, m onComplete, zii.c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        return ((h) this.f15679t.getValue()).w0(rVar, onNext, handleError, onComplete, onSubscribe);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final ofm.h y0(efm.b bVar, boolean z, Function0 onComplete, Function1 handleError) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        return ((h) this.f15679t.getValue()).y0(bVar, z, onComplete, handleError);
    }

    @Override // yji.l
    public final void y1(f dialogDisplayer, o eventsDispatcher, aki.c controllersCache, CoroutineDispatcher mainDispatcher, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        super.y1(dialogDisplayer, eventsDispatcher, controllersCache, mainDispatcher, controllerModelExtensions);
        if (mainDispatcher != null) {
            y4l.e.Companion.getClass();
            this.f15675p = e.a.a();
        }
    }

    public r y2() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    public final r z2(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return rd0.e.c(X().d(dialogModel), kotlin.coroutines.g.f186406a);
    }
}
