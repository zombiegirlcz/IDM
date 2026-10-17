package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelematicsDeviceUnpluggedScreenContract$InputData f247343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247345c;

    public j1(k0 k0Var, o oVar, TelematicsDeviceUnpluggedScreenContract$InputData telematicsDeviceUnpluggedScreenContract$InputData) {
        this.f247343a = telematicsDeviceUnpluggedScreenContract$InputData;
        int i = 24;
        this.f247344b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247345c = e4m.b.b(new l(k0Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
