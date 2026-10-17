package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$InputData f160890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f160892c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(f fVar, UpiTransferFlowContract$InputData upiTransferFlowContract$InputData) {
        this.f160891b = fVar;
        this.f160890a = upiTransferFlowContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.e = e4m.b.b(new i9e.l(fVar, this, 0, i));
        this.f = e4m.b.b(new i9e.l(fVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
