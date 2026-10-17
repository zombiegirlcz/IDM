package htc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.second_device_login.impl.ui.flow.SecondDeviceLoginFlowContract$InputData;
import h30.q;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecondDeviceLoginFlowContract$InputData f155352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f155353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f155354c = this;
    public final e4m.e d = e4m.b.b(new hm9.d(this, 10));

    public d(b bVar, SecondDeviceLoginFlowContract$InputData secondDeviceLoginFlowContract$InputData) {
        this.f155353b = bVar;
        this.f155352a = secondDeviceLoginFlowContract$InputData;
    }

    public final q b() {
        b bVar = this.f155353b;
        return new q(((n86.d) bVar.f155344b).d(), (ltc.a) bVar.k.get(), bVar.d.c(), bVar.e.b());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
