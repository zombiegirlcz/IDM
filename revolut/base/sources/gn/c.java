package gn;

import akl.s;
import c86.f;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import ecm.q;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lpi.e f144891j;
    public final sm.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f144892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f144893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lpi.e dialogView, sm.e actionsObservable, ImmutableSet resultHandlers, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("COMMON_UI_BOTTOM_DIALOG_MEDIATOR"));
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(actionsObservable, "actionsObservable");
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f144891j = dialogView;
        this.k = actionsObservable;
        this.f144892l = j.b(new androidx.lifecycle.b(this, 21));
        this.f144893m = j.b(new cn.c(1, resultHandlers));
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f144893m.getValue();
    }

    @Override // nm.a
    public final r Q() {
        Object value = this.f144892l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    @Override // nm.a, fsi.a
    public final void onStart() {
        super.onStart();
        r rVarF = o70.a.f(this.k.f255133a);
        s sVar = new s(this, 16);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new q(new bo.c(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new b(0, sVar), new b(0, function1M), new f(2, function0L));
        w.j0(this.e, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
