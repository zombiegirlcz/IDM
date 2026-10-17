package com.revolut.retail.retail_shot.mediator;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import e0f.n;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kfm.o;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import org.jetbrains.annotations.NotNull;
import qm.e;
import qza.x;
import rp0.k1;
import s3l.b;
import s3l.f;
import yf.c;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends nm.a {

    @NotNull
    private static final b Companion = new b();
    public static final fsi.b o = new fsi.b("SHOT_MEDIATOR_DELEGATE_ID");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f104427j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r3l.a f104428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f104429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f104430n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f actionObservableProvider, ImmutableSet resultHandlers, r3l.a shotDialogView, e resultDispatcherFactory) {
        super(resultDispatcherFactory, o);
        Intrinsics.checkNotNullParameter(actionObservableProvider, "actionObservableProvider");
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f104427j = actionObservableProvider;
        this.k = resultHandlers;
        this.f104428l = shotDialogView;
        final int i = 0;
        this.f104429m = j.b(new Function0(this) { // from class: s3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.retail_shot.mediator.a f259709b;

            {
                this.f259709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((k1) ((r3l.c) this.f259709b.f104428l).f251317h).d;
                    default:
                        Set set = this.f259709b.k;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            a0.d.B(it8.next());
                            arrayList.add(new s1c.a(28));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.f104430n = j.b(new Function0(this) { // from class: s3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.retail_shot.mediator.a f259709b;

            {
                this.f259709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((k1) ((r3l.c) this.f259709b.f104428l).f251317h).d;
                    default:
                        Set set = this.f259709b.k;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            a0.d.B(it8.next());
                            arrayList.add(new s1c.a(28));
                        }
                        return arrayList;
                }
            }
        });
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f104430n.getValue();
    }

    @Override // nm.a
    public final r Q() {
        return (r) this.f104429m.getValue();
    }

    @Override // nm.a, fsi.a
    public final void onStart() {
        super.onStart();
        r rVarF = o70.a.f(this.f104427j.f255133a);
        f2 f2Var = new f2(this, 14);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext((o) new c(new x(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n(2, f2Var), new n(2, function1M), new c86.f(12, function0L));
        te0.w.j0(this.e, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
