package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements qji.a, dqf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInformationFlowContract$InputData f199008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f199010c = this;
    public final e4m.e d;

    public b(i iVar, AdditionalInformationFlowContract$InputData additionalInformationFlowContract$InputData) {
        this.f199009b = iVar;
        this.f199008a = additionalInformationFlowContract$InputData;
        this.d = e4m.b.b(new ld1.g(iVar, this, 20));
    }

    @Override // dqf.b
    public final dqf.a A() {
        return new m(this.f199009b, this.f199010c);
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
