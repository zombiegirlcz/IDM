package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAddPhoneNumberFlowContract$InputData f162140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f162141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f162142c = this;
    public final e4m.e d;
    public final e4m.e e;

    public c(k kVar, JuniorAddPhoneNumberFlowContract$InputData juniorAddPhoneNumberFlowContract$InputData) {
        this.f162141b = kVar;
        this.f162140a = juniorAddPhoneNumberFlowContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new i9e.l(kVar, this, 0, i));
        this.e = e4m.b.b(new i9e.l(kVar, this, 1, i));
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
