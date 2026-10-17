package ea2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements xki.c, gb2.a, db2.a, ta2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayIdFlowContract$InputData f124084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f124086c = this;
    public final e4m.e d;

    public i(h hVar, PayIdFlowContract$InputData payIdFlowContract$InputData) {
        this.f124085b = hVar;
        this.f124084a = payIdFlowContract$InputData;
        this.d = e4m.b.b(new w3(hVar, this, 12));
    }

    @Override // ta2.a
    public final l b() {
        return new l(this.f124085b, this.f124086c, 1);
    }

    @Override // db2.a
    public final n c() {
        return new n(this.f124085b, this.f124086c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // gb2.a
    public final q j() {
        return new q(this.f124085b, this.f124086c, 0);
    }
}
