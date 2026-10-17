package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w2 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementScreenContract$InputData f176418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176420c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176422h;

    public w2(a3 a3Var, BaseScreen baseScreen, CreditCardStatementScreenContract$InputData creditCardStatementScreenContract$InputData) {
        this.f176419b = a3Var;
        this.f176418a = creditCardStatementScreenContract$InputData;
        this.f176420c = e4m.b.b(e4m.c.a(baseScreen));
        this.d = e4m.b.b(new f1(a3Var, this, 2, 16));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 16));
        this.f = e4m.b.b(new f1(a3Var, this, 0, 16));
        this.f176421g = e4m.b.b(new f1(a3Var, this, 4, 16));
        this.f176422h = e4m.b.b(new f1(a3Var, this, 3, 16));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
