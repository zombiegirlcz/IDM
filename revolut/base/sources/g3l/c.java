package g3l;

import a08.p0;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import g0d.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f140307j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3l.b f140308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f140309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f140310n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ImmutableSet resultHandlers, g configurationObservable, k3l.b statusDialogView, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("STATUS_DIALOG_VIEW_MEDIATOR_ACTIVITY_DELEGATE"));
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(configurationObservable, "configurationObservable");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f140307j = resultHandlers;
        this.k = configurationObservable;
        this.f140308l = statusDialogView;
        final int i = 0;
        this.f140309m = j.b(new Function0(this) { // from class: g3l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f140306b;

            {
                this.f140306b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((k3l.d) this.f140306b.f140308l).f180813j;
                    default:
                        Set set = this.f140306b.f140307j;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new g1.b((d) it8.next(), 23));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.f140310n = j.b(new Function0(this) { // from class: g3l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f140306b;

            {
                this.f140306b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((k3l.d) this.f140306b.f140308l).f180813j;
                    default:
                        Set set = this.f140306b.f140307j;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new g1.b((d) it8.next(), 23));
                        }
                        return arrayList;
                }
            }
        });
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f140310n.getValue();
    }

    @Override // nm.a
    public final r Q() {
        return (r) this.f140309m.getValue();
    }

    @Override // fsi.a
    public final void onResume() {
        r rVarF = o70.a.f(this.k.f255133a);
        g1.b bVar = new g1.b(this, 24);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new fn2.c(new m(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(15, bVar), new p0(15, function1M), new ea9.c(12, function0L));
        te0.w.j0(this.e, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
