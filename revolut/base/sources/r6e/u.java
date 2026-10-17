package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultInvitationConfirmationScreenContract$InputData f251807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251809c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251810g;

    public u(o oVar, BaseScreen baseScreen, VaultInvitationConfirmationScreenContract$InputData vaultInvitationConfirmationScreenContract$InputData) {
        this.f251807a = vaultInvitationConfirmationScreenContract$InputData;
        this.f251808b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f251809c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 4, i));
        this.f251810g = e4m.b.b(new qy7.f(oVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
