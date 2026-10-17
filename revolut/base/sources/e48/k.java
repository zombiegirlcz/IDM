package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.phone_confirmation.JointContactPhoneConfirmationContract$InputData;
import dw3.f6;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointContactPhoneConfirmationContract$InputData f122450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f122451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f122452c;

    public k(g gVar, m mVar, JointContactPhoneConfirmationContract$InputData jointContactPhoneConfirmationContract$InputData) {
        this.f122450a = jointContactPhoneConfirmationContract$InputData;
        int i = 7;
        this.f122451b = e4m.b.b(new f6(this, 1, i));
        this.f122452c = e4m.b.b(new f6(this, 0, i));
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
