package an;

import a08.o0;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cqi.h f6512j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f6513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f6514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cqi.h view, a resultObservableProvider, ImmutableSet resultHandlers, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("PROMPT_DIALOG_MEDIATOR_DELEGATE"));
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resultObservableProvider, "resultObservableProvider");
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f6512j = view;
        this.k = resultObservableProvider;
        this.f6513l = yhm.j.b(new a2g.a(this, 20));
        this.f6514m = yhm.j.b(new l(0, resultHandlers));
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f6514m.getValue();
    }

    @Override // nm.a
    public final r Q() {
        Object value = this.f6513l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    @Override // nm.a, fsi.a
    public final void onStart() {
        super.onStart();
        efm.b bVarFlatMapCompletable = o70.a.f(this.k.f255131a).flatMapCompletable(new ai0.j(new afa.q(this, 29), 11));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1M = M();
        zjh.i iVar = new zjh.i(new a2i.j(new BreadcrumbException(), 14));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, iVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        m function = m.f6511a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar.w(new o0(2, function1M), new a1l.c(1));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f137706c, hVarW);
    }
}
