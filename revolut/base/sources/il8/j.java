package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorInviteCreationScreenContract$InputData f162161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162163c;

    public j(k kVar, i iVar, JuniorInviteCreationScreenContract$InputData juniorInviteCreationScreenContract$InputData) {
        this.f162161a = juniorInviteCreationScreenContract$InputData;
        int i = 13;
        this.f162162b = e4m.b.b(new i9e.l(kVar, this, 1, i));
        this.f162163c = e4m.b.b(new i9e.l(kVar, this, 0, i));
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
