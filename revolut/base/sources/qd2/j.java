package qd2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import java.util.Set;
import qbj.w;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpinTransferFlowContract$InputData f244853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f244854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f244855c;

    public j(f fVar, SpinTransferFlowContract$InputData spinTransferFlowContract$InputData) {
        this.f244854b = fVar;
        this.f244853a = spinTransferFlowContract$InputData;
        this.f244855c = e4m.b.b(new w(fVar, this, 1));
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
