package wm;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wk2.x;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final opi.d f298581j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f298582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f298583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(opi.d view, a actionsObservableProvider, ImmutableSet resultHandlers, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("EXPANDABLE_DIALOG_MEDIATOR_DELEGATE"));
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionsObservableProvider, "actionsObservableProvider");
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f298581j = view;
        this.k = actionsObservableProvider;
        this.f298582l = yhm.j.b(new vt3.a(this, 25));
        this.f298583m = yhm.j.b(new an.l(8, resultHandlers));
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f298583m.getValue();
    }

    @Override // nm.a
    public final r Q() {
        Object value = this.f298582l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    @Override // nm.a, fsi.a
    public final void onStart() {
        super.onStart();
        efm.b bVarFlatMapCompletable = o70.a.f(this.k.f255131a).flatMapCompletable(new wl3.b(new x(this, 10), 10));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1M = M();
        ugc.a aVar = new ugc.a(new vx5.r(new BreadcrumbException(), 23), (byte) 0);
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, aVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        k function = k.f298580a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new nw8.d(18, function1M), new a1l.c(24));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f137706c, hVarW);
    }
}
