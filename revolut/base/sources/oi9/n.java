package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterRepaymentDetailsScreenContract$InputData f225541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f225542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225543c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f225544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f225545h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f225546j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f225547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f225548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f225549n;

    public n(f fVar, BaseScreen baseScreen, PayLaterRepaymentDetailsScreenContract$InputData payLaterRepaymentDetailsScreenContract$InputData) {
        this.f225542b = fVar;
        this.f225541a = payLaterRepaymentDetailsScreenContract$InputData;
        this.f225543c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        this.d = e4m.b.b(new a(fVar, this, 2, i));
        this.e = e4m.b.b(new a(fVar, this, 1, i));
        this.f = e4m.b.b(new a(fVar, this, 0, i));
        this.f225544g = e4m.b.b(new a(fVar, this, 4, i));
        this.f225545h = e4m.b.b(new a(fVar, this, 3, i));
        this.i = e4m.b.b(new a(fVar, this, 6, i));
        this.f225546j = e4m.b.b(new a(fVar, this, 5, i));
        this.k = e4m.b.b(new a(fVar, this, 8, i));
        this.f225547l = e4m.b.b(new a(fVar, this, 7, i));
        this.f225548m = e4m.b.b(new a(fVar, this, 10, i));
        this.f225549n = e4m.b.b(new a(fVar, this, 9, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f225545h.get(), (yji.n) this.f225546j.get(), (yji.n) this.f225547l.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
