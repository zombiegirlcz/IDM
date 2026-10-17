package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements pl8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCreatePhoneNumberDestination.InputData f162155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162157c;

    public h(k kVar, JuniorCreatePhoneNumberDestination.InputData inputData) {
        this.f162155a = inputData;
        this.f162156b = e4m.g.a(new g(kVar, this, 1));
        this.f162157c = e4m.b.b(new g(kVar, this, 0));
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
