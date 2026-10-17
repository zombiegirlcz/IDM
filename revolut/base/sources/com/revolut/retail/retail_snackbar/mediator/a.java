package com.revolut.retail.retail_snackbar.mediator;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import t1i.n;
import t3l.h;
import tx0.p4;
import u3a.g;
import u3a.q;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends nm.a {

    @NotNull
    private static final u3l.b Companion = new u3l.b();
    public static final fsi.b o = new fsi.b("SNACKBAR_MEDIATOR_DELEGATE_ID");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u3l.e f104436j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t3l.d f104437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f104438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f104439n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u3l.e actionObservableProvider, ImmutableSet resultHandlers, t3l.d snackbarView, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, o);
        Intrinsics.checkNotNullParameter(actionObservableProvider, "actionObservableProvider");
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(snackbarView, "snackbarView");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f104436j = actionObservableProvider;
        this.k = resultHandlers;
        this.f104437l = snackbarView;
        final int i = 0;
        this.f104438m = j.b(new Function0(this) { // from class: u3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.retail_snackbar.mediator.a f276949b;

            {
                this.f276949b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((h) this.f276949b.f104437l).f267828j.map(new q(new g(21), 2));
                    default:
                        Set set = this.f276949b.k;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            if (it8.next() != null) {
                                throw new ClassCastException();
                            }
                            arrayList.add(new g(20));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.f104439n = j.b(new Function0(this) { // from class: u3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.retail_snackbar.mediator.a f276949b;

            {
                this.f276949b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((h) this.f276949b.f104437l).f267828j.map(new q(new g(21), 2));
                    default:
                        Set set = this.f276949b.k;
                        ArrayList arrayList = new ArrayList(w.t(set, 10));
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            if (it8.next() != null) {
                                throw new ClassCastException();
                            }
                            arrayList.add(new g(20));
                        }
                        return arrayList;
                }
            }
        });
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f104439n.getValue();
    }

    @Override // nm.a
    public final r Q() {
        Object value = this.f104438m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    @Override // nm.a, fsi.a
    public final void onStart() {
        super.onStart();
        r rVarF = o70.a.f(this.f104436j.f255133a);
        p4 p4Var = new p4(this, 23);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new i(new t33.r(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(24, p4Var), new m3l.d(24, function1M), new n(6, function0L));
        te0.w.j0(this.e, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
