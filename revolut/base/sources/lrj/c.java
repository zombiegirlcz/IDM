package lrj;

import com.revolut.core.model.account.AccountId;
import grj.f;
import klf.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kx4.f0;
import rd0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzi.a f199523a;

    public c(pzi.a budgetOverviewInteractor) {
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        this.f199523a = budgetOverviewInteractor;
    }

    @Override // mf1.a
    public final Flow a() {
        return e.e(new f0(e.b(((f) this.f199523a).a(AccountId.Personal.f51414a)), 29), h0.f322473a, new l1(3, 17, null));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
