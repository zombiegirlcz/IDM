package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements qji.a, tqf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceFlowContract$InputData f199022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f199024c = this;
    public final e4m.e d;

    public f(i iVar, ReferenceFlowContract$InputData referenceFlowContract$InputData) {
        this.f199023b = iVar;
        this.f199022a = referenceFlowContract$InputData;
        this.d = e4m.b.b(new ld1.g(iVar, this, 21));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tqf.b
    public final tqf.a y() {
        return new r(this.f199023b, this.f199024c);
    }
}
