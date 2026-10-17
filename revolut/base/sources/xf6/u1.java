package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateDetailsScreenContract$InputData f305104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f305105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305106c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305108h;

    public u1(y1 y1Var, BaseScreen baseScreen, MandateDetailsScreenContract$InputData mandateDetailsScreenContract$InputData) {
        this.f305104a = mandateDetailsScreenContract$InputData;
        this.f305105b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 0;
        this.f305106c = e4m.b.b(new t1(y1Var, this, 2, i));
        this.d = e4m.b.b(new t1(y1Var, this, 1, i));
        this.e = e4m.b.b(new t1(y1Var, this, 0, i));
        this.f = e4m.b.b(new t1(y1Var, this, 4, i));
        this.f305107g = e4m.b.b(new t1(y1Var, this, 5, i));
        this.f305108h = e4m.b.b(new t1(y1Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
