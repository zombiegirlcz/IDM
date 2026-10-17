package com.revolut.retail.toast.mediator;

import a08.q;
import a0d.g;
import com.revolut.core.extensions.rx.BreadcrumbException;
import cu8.u;
import d4l.b;
import efm.r;
import fsi.c;
import i4b.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fsi.b f104450j = new fsi.b("TOAST_MEDIATOR_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4l.a f104451h;
    public final c4l.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d4l.a actionObservableProvider, c4l.b toastView) {
        super(f104450j);
        Intrinsics.checkNotNullParameter(actionObservableProvider, "actionObservableProvider");
        Intrinsics.checkNotNullParameter(toastView, "toastView");
        this.f104451h = actionObservableProvider;
        this.i = toastView;
    }

    @Override // fsi.a
    public final void onStart() {
        r rVarF = o70.a.f(this.f104451h.f255133a);
        d34.b bVar = new d34.b(this, 8);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new f(new u(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g(11, bVar), new g(11, function1M), new q(24, function0L));
        w.j0(this.f137706c, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
