package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.EnableBirthdaySharingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnableBirthdaySharingScreenContract$InputData f234712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234714c;

    public a(b bVar, g gVar, EnableBirthdaySharingScreenContract$InputData enableBirthdaySharingScreenContract$InputData) {
        this.f234712a = enableBirthdaySharingScreenContract$InputData;
        int i = 7;
        this.f234713b = e4m.b.b(new pa6.f(bVar, this, 1, i));
        this.f234714c = e4m.b.b(new pa6.f(bVar, this, 0, i));
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
