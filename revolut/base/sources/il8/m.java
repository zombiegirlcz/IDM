package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.navigation.JuniorUpdatePhoneNumberDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements sl8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorUpdatePhoneNumberDestination.InputData f162172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162174c;

    public m(k kVar, JuniorUpdatePhoneNumberDestination.InputData inputData) {
        this.f162172a = inputData;
        this.f162173b = e4m.g.a(new l(kVar, this, 1));
        this.f162174c = e4m.b.b(new l(kVar, this, 0));
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
