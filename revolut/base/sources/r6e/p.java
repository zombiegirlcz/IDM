package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountDetailsScreenContract$InputData f251788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f251789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251790c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251792h;

    public p(o oVar, SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData) {
        this.f251789b = oVar;
        this.f251788a = subaccountDetailsScreenContract$InputData;
        int i = 16;
        this.f251790c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 3, i));
        this.f251791g = e4m.b.b(new qy7.f(oVar, this, 5, i));
        this.f251792h = e4m.b.b(new qy7.f(oVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
