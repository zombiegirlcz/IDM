package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoPayFlowContract$InputData f159164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159166c;

    public t(m mVar, MultibancoPayFlowContract$InputData multibancoPayFlowContract$InputData) {
        this.f159165b = mVar;
        this.f159164a = multibancoPayFlowContract$InputData;
        this.f159166c = e4m.b.b(new hc2.r(mVar, this, 10));
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
