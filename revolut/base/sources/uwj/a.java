package uwj;

import com.revolut.core.model.account.AccountId;
import e0f.k;
import e0f.v0;
import kotlin.jvm.internal.Intrinsics;
import r0j.c;
import te0.w;
import ue0.e;
import ufm.i;
import uwf.b;
import uwi.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vte.a f283696a;

    public a(vte.a topUpInteractor) {
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        this.f283696a = topUpInteractor;
    }

    public final i a() {
        v0 v0Var = (v0) this.f283696a;
        i iVar = new i(w.H0(v0Var.f121694b.w(AccountId.Personal.f51414a), v0Var.d.getKyc()), new k(new dz7.k(22), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(iVar, new b(1, new v(this, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return e.D(iVar2, new v(2));
    }
}
