package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointWithdrawContract$InputData f122466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f122467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f122468c;

    public q(g gVar, JointWithdrawContract$InputData jointWithdrawContract$InputData) {
        this.f122467b = gVar;
        this.f122466a = jointWithdrawContract$InputData;
        this.f122468c = e4m.b.b(new w3(gVar, this, 8));
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
