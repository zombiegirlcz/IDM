package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cd;
import com.fourthline.orca.internal.p2;
import com.fourthline.orca.internal.q2;
import com.fourthline.orca.internal.t2;
import com.fourthline.orca.internal.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class z2 implements ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f35497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x2 f35498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u2 f35499c;
    private final v2 d;
    private final wr e;
    private final w2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cd f35500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rx f35501h;
    private final pd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kw f35502j;
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f35503l;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, z2.class, obj2, "onItemSelected", "onItemSelected(Lcom/fourthline/orca/core/internal/composable/base_selector/SelectableItem;)V");
        }

        public final void a(a01 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((z2) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((a01) obj2);
            return Unit.f186387a;
        }
    }

    public z2(mq0 presenter, x2 stateProvider, u2 repository, v2 resultRepository, wr effectHandler, w2 selectionValidator, cd countriesFilter, rx filterCountriesUseCase, pd errorValidator, kw errorHandler, String analyticsSource) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(selectionValidator, "selectionValidator");
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        Intrinsics.checkNotNullParameter(errorValidator, "errorValidator");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
        this.f35497a = presenter;
        this.f35498b = stateProvider;
        this.f35499c = repository;
        this.d = resultRepository;
        this.e = effectHandler;
        this.f = selectionValidator;
        this.f35500g = countriesFilter;
        this.f35501h = filterCountriesUseCase;
        this.i = errorValidator;
        this.f35502j = errorHandler;
        this.k = analyticsSource;
        this.f35503l = zhm.f0.f322471a;
    }

    private final void b(String str) {
        this.f35497a.a(this.f35498b.a(str));
        this.f35503l = this.f35499c.e();
        this.f35501h.a(kotlin.text.d0.F0(str).toString(), this.f35503l, new a(this), new ss1(this, 9));
    }

    private final void c() {
        s2 s2Var = (s2) this.f35497a.b();
        if (s2Var.n().getState() != l20.f30508b) {
            return;
        }
        k20 k20VarA = a(s2Var.n().getText());
        this.f35497a.a(this.f35498b.a(k20VarA));
        if (k20VarA != null) {
            this.d.a();
        }
        this.e.a(new it1(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 d() {
        return p2.b.f31802a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 e() {
        return p2.b.f31802a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 f() {
        return p2.a.f31801a;
    }

    private final void g() {
        this.e.a(new it1(27));
        a01 a01VarD = this.f35499c.d();
        this.f35497a.a(this.f35498b.a(a01VarD, Intrinsics.f(a01VarD != null ? this.f.a(a01VarD) : null, w2.a.b.f34494a)));
        if (a01VarD != null) {
            a(a01VarD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 h() {
        return p2.b.f31802a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(q2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q2.h) {
            g();
            return;
        }
        if (event instanceof q2.c) {
            b(((q2.c) event).a());
            return;
        }
        if (event instanceof q2.d) {
            a();
            return;
        }
        if (!(event instanceof q2.e) && !Intrinsics.f(event, q2.b.f32163a)) {
            if (event instanceof q2.f) {
                a(((q2.f) event).a());
                return;
            } else {
                if (!(event instanceof q2.a) && !(event instanceof q2.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        c();
    }

    private final void b(a01 a01Var) {
        this.f35497a.a(this.f35498b.b(a01Var));
        this.d.a(a01Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 b() {
        return p2.c.f31803a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z2 z2Var, List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        z2Var.f35497a.a(z2Var.f35498b.a(suggestions));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a01 a01Var) {
        w2.a aVarA = this.f.a(a01Var);
        if (aVarA instanceof w2.a.b) {
            b(a01Var);
        } else {
            if (!(aVarA instanceof w2.a.C0303a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(a01Var, ((w2.a.C0303a) aVarA).a());
        }
        this.e.a(new it1(25));
        this.e.a(new it1(26));
    }

    private final void a(a01 a01Var, kh0 kh0Var) {
        this.f35497a.a(this.f35498b.a(a01Var));
        this.f35502j.handleError(new t2.a(kh0Var), this.k);
        this.d.a(a01Var);
    }

    private final void a() {
        String text;
        s2 s2Var = (s2) this.f35497a.b();
        if (s2Var.n().getState() == l20.f30508b) {
            return;
        }
        boolean z = s2Var.n().getState() == l20.f30509c;
        boolean z3 = this.f35499c.d() != null;
        if (z && !z3) {
            b(s2Var.n().getText());
            text = s2Var.n().getText();
        } else {
            this.d.a();
            text = "";
        }
        this.f35497a.a(this.f35498b.d(text));
        this.e.a(new it1(24));
    }

    private final k20 a(String str) {
        List listA = this.f35500g.a(str, this.f35503l);
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(((cd.a) it8.next()).a());
        }
        return this.i.a(str, arrayList);
    }
}
