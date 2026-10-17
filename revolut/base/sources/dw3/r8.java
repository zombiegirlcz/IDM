package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r8 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119697a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditLinkedAccountsV2ListScreenContract$InputData f119698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119699c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119701h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119702j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119703l;

    public r8(c1 c1Var, l1 l1Var, BaseScreen baseScreen, CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData) {
        this.f119698b = creditLinkedAccountsV2ListScreenContract$InputData;
        this.f119699c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 1;
        this.d = e4m.b.b(new q8(c1Var, l1Var, this, 2, i));
        this.e = e4m.b.b(new q8(c1Var, l1Var, this, 1, i));
        this.f = e4m.b.b(new q8(c1Var, l1Var, this, 0, i));
        q8 q8Var = new q8(c1Var, l1Var, this, 4, i);
        this.f119703l = q8Var;
        this.f119700g = e4m.b.b(q8Var);
        this.f119701h = e4m.b.b(new q8(c1Var, l1Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f119703l);
        this.f119702j = e4m.b.b(new q8(c1Var, l1Var, this, 6, i));
        this.k = e4m.b.b(new q8(c1Var, l1Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f119697a) {
        }
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f119697a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f119701h.get());
    }

    public r8(c1 c1Var, m1 m1Var, BaseScreen baseScreen, CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData) {
        this.f119698b = creditLinkedAccountsV2ListScreenContract$InputData;
        this.f119699c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 0;
        this.d = e4m.b.b(new q8(c1Var, m1Var, this, 2, i));
        this.e = e4m.b.b(new q8(c1Var, m1Var, this, 1, i));
        this.f = e4m.b.b(new q8(c1Var, m1Var, this, 0, i));
        q8 q8Var = new q8(c1Var, m1Var, this, 4, i);
        this.f119703l = q8Var;
        this.f119700g = e4m.b.b(q8Var);
        this.f119701h = e4m.b.b(new q8(c1Var, m1Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f119703l);
        this.f119702j = e4m.b.b(new q8(c1Var, m1Var, this, 6, i));
        this.k = e4m.b.b(new q8(c1Var, m1Var, this, 5, i));
    }
}
