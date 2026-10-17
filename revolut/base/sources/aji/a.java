package aji;

import aii.o;
import dki.g;
import efm.c0;
import efm.r;
import ifm.b;
import ifm.c;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import rd0.e;
import te0.w;
import tji.f;
import tji.l;
import y4l.e;
import zc0.m;
import zii.h;
import zii.i;
import zii.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends g implements j, i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c0 f5584t;
    public final b u = new b();
    public final b v = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f5585w = w.y0(new a2g.a(this, 17));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final c E(r rVar, Function1 onNext, Function1 handleError, m onComplete, zii.c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        return ((h) this.f5585w.getValue()).E(rVar, onNext, handleError, onComplete, onSubscribe);
    }

    @Override // yji.l
    public void O1() {
        this.u.d();
    }

    public final r O2(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return e.c(X().d(dialogModel), kotlin.coroutines.g.f186406a);
    }

    @Override // yji.l
    public final void R1() {
        this.v.d();
    }

    @Override // zii.j
    public final c0 u0() {
        return this.f5584t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final c w0(r rVar, Function1 onNext, Function1 handleError, m onComplete, zii.c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        return ((h) this.f5585w.getValue()).w0(rVar, onNext, handleError, onComplete, onSubscribe);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zii.i
    public final ofm.h y0(efm.b bVar, boolean z, Function0 onComplete, Function1 handleError) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        return ((h) this.f5585w.getValue()).y0(bVar, false, onComplete, handleError);
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
            this.f5584t = e.a.a();
        }
    }
}
