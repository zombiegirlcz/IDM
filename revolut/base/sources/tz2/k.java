package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements qji.a, j13.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangePinFlowContract$InputData f275786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f275788c = this;
    public final e4m.e d;

    public k(e eVar, ChangePinFlowContract$InputData changePinFlowContract$InputData) {
        this.f275787b = eVar;
        this.f275786a = changePinFlowContract$InputData;
        this.d = e4m.b.b(new ta9.f(eVar, this, 17));
    }

    @Override // j13.a
    public final p b() {
        return new p(this.f275787b, this.f275788c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
