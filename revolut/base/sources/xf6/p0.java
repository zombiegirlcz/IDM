package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$InputData f304984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f304986c = this;
    public final e4m.e d;

    public p0(t tVar, UpiTransferFlowContract$InputData upiTransferFlowContract$InputData) {
        this.f304985b = tVar;
        this.f304984a = upiTransferFlowContract$InputData;
        this.d = e4m.b.b(new i0(tVar, this, 5));
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
