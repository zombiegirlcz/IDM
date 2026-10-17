package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorContactPickerScreenContract$InputData f162149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162151c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(k kVar, c cVar, JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData) {
        this.f162149a = juniorContactPickerScreenContract$InputData;
        int i = 12;
        this.f162150b = e4m.g.a(new i9e.l(kVar, this, 2, i));
        this.f162151c = e4m.b.b(new i9e.l(kVar, this, 1, i));
        this.d = e4m.b.b(new i9e.l(kVar, this, 3, i));
        this.e = e4m.b.b(new i9e.l(kVar, this, 4, i));
        this.f = e4m.b.b(new i9e.l(kVar, this, 0, i));
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
