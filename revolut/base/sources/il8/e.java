package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAddPhoneNumberScreenContract$InputData f162146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162148c;

    public e(k kVar, c cVar, JuniorAddPhoneNumberScreenContract$InputData juniorAddPhoneNumberScreenContract$InputData) {
        this.f162146a = juniorAddPhoneNumberScreenContract$InputData;
        this.f162147b = e4m.b.b(new d(kVar, cVar, this, 1, 0));
        this.f162148c = e4m.b.b(new d(kVar, cVar, this, 0, 0));
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
