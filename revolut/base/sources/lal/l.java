package lal;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$InputData;
import java.util.Set;
import l9f.z;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends oal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TwinVerticalButton f193460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f193461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SuspiciousTransactionFlowContract$InputData f193462c;
    public final k d;
    public final l e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193463g;

    public l(k kVar, SuspiciousTransactionFlowContract$InputData suspiciousTransactionFlowContract$InputData, TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar) {
        this.d = kVar;
        this.f193460a = twinVerticalButton;
        this.f193461b = navBarWithToolbar;
        this.f193462c = suspiciousTransactionFlowContract$InputData;
        int i = 6;
        this.f = e4m.b.b(new z(kVar, this, 1, i));
        this.f193463g = e4m.b.b(new z(kVar, this, 0, i));
    }

    @Override // oal.a
    public final a A() {
        return new a(this.d, this.e, 3);
    }

    @Override // oal.a
    public final a B() {
        return new a(this.d, this.e, 4);
    }

    @Override // oal.a
    public final a D() {
        return new a(this.d, this.e, 5);
    }

    @Override // oal.a
    public final TwinVerticalButton G() {
        return this.f193460a;
    }

    @Override // oal.a
    public final a H() {
        return new a(this.d, this.e, 6);
    }

    @Override // oal.a
    public final a b() {
        return new a(this.d, this.e, 0);
    }

    @Override // oal.a
    public final a c() {
        return new a(this.d, this.e, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // oal.a
    public final kye.e j() {
        return new kye.e(this.d, this.e);
    }

    @Override // oal.a
    public final nal.d q() {
        return (nal.d) this.f193463g.get();
    }

    @Override // oal.a
    public final a s() {
        return new a(this.d, this.e, 2);
    }

    @Override // oal.a
    public final NavBarWithToolbar y() {
        return this.f193461b;
    }
}
