package m8e;

import cli.y;
import cli.z;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements z {
    public final VaultInvitationDeclineScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ppg.b f203539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f203540q;

    public m(k mapper, VaultInvitationDeclineScreenContract$InputData inputData, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.o = inputData;
        this.f203539p = vaultsInteractor;
        this.f203540q = mra.d.b(this, e.f203533a, mapper, null, false, 12);
    }

    public final void I2(d dVar) {
        if (dVar.equals(b.f203531a)) {
            l2(new lo.c(this, (Continuation) null, 25), new yi5.b(26));
        } else {
            if (!dVar.equals(c.f203532a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(g.f203535a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203540q;
    }
}
