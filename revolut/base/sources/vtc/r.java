package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameLocationScreenContract$InputData f292047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f292048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292049c;

    public r(t tVar, x xVar, NameLocationScreenContract$InputData nameLocationScreenContract$InputData) {
        this.f292047a = nameLocationScreenContract$InputData;
        int i = 15;
        this.f292048b = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.f292049c = e4m.b.b(new vn2.l(tVar, this, 0, i));
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
