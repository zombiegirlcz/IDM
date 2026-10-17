package f9a;

import cli.y;
import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements g {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z8a.a f132885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s8a.c f132886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f132887r;

    public k(l stateMapper, j60.a bottomExpandableDialog, z8a.a aliasRegistrationExtension, s8a.c aliasManagementInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        this.o = bottomExpandableDialog;
        this.f132885p = aliasRegistrationExtension;
        this.f132886q = aliasManagementInteractor;
        this.f132887r = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        s8a.c cVar = this.f132886q;
        cVar.getClass();
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        yji.l.a1(this, nim.a.v(cVar.f260942a.g(accountId), new s6e.g(21)), null, null, new j(this, null, 0), 3);
    }

    @Override // yji.l
    public final void P1() {
        H2(this.f132887r, new cmc.a(false, 21));
        j60.a.v(this.o, false, null, 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.f132887r, new cmc.a(true, 21));
        yji.l.b1(this, rd0.e.b(this.o.E()), null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f132887r;
    }
}
