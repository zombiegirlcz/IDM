package vq0;

import androidx.lifecycle.LifecycleObserver;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import te0.w;
import up5.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifm.b f291280a = new ifm.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vn8.a f291281b = new vn8.a(29);

    public abstract void a(nu0.m mVar);

    public final void b(r rVar, Function1 onNext) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        r rVarOnErrorResumeNext = rVar.onErrorResumeNext(new ugc.a(new s(new BreadcrumbException(), 27), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0(24, onNext), new vpg.b(11, this.f291281b));
        w.j0(this.f291280a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
