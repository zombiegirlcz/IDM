package ere;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$InputData;
import dw3.w3;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LogoutConfirmationFlowContract$InputData f128646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f128647b;

    public a(c cVar, LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData) {
        this.f128646a = logoutConfirmationFlowContract$InputData;
        this.f128647b = e4m.b.b(new w3(cVar, this, 18));
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
