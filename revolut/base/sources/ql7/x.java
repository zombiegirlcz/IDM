package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryFlowContract$InputData f247515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f247517c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247519h;

    public x(k0 k0Var, BaseFlow baseFlow, DeliveryFlowContract$InputData deliveryFlowContract$InputData) {
        this.f247516b = k0Var;
        this.f247515a = deliveryFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 6;
        this.e = e4m.b.b(new l(k0Var, this, 2, i));
        this.f = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247518g = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247519h = e4m.b.b(new l(k0Var, this, 3, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247518g.get());
    }
}
