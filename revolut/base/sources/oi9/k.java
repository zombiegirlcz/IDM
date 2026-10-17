package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterPlanDetailsScreenContract$InputData f225528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f225529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225530c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f225531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f225532h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f225533j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f225534l;

    public k(f fVar, BaseScreen baseScreen, PayLaterPlanDetailsScreenContract$InputData payLaterPlanDetailsScreenContract$InputData) {
        this.f225529b = fVar;
        this.f225528a = payLaterPlanDetailsScreenContract$InputData;
        this.f225530c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.d = e4m.b.b(new a(fVar, this, 2, i));
        this.e = e4m.b.b(new a(fVar, this, 1, i));
        this.f = e4m.b.b(new a(fVar, this, 0, i));
        this.f225531g = e4m.b.b(new a(fVar, this, 4, i));
        this.f225532h = e4m.b.b(new a(fVar, this, 3, i));
        this.i = e4m.b.b(new a(fVar, this, 6, i));
        this.f225533j = e4m.b.b(new a(fVar, this, 5, i));
        this.k = e4m.b.b(new a(fVar, this, 8, i));
        this.f225534l = e4m.b.b(new a(fVar, this, 7, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f225532h.get(), (yji.n) this.f225533j.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
