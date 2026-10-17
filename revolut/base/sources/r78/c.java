package r78;

import cfa.g;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Set;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m78.i;
import qg7.p;
import vkm.z1;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends v68.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s78.b f252044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f252045n;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f252046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f252047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f252048r;

    public c(s78.b juniorDashboardCurrencyInconsistencyDialogProvider, g removePocketExtension, n walletInteractor, i juniorWalletInteractor) {
        Intrinsics.checkNotNullParameter(juniorDashboardCurrencyInconsistencyDialogProvider, "juniorDashboardCurrencyInconsistencyDialogProvider");
        Intrinsics.checkNotNullParameter(removePocketExtension, "removePocketExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorWalletInteractor, "juniorWalletInteractor");
        this.f252044m = juniorDashboardCurrencyInconsistencyDialogProvider;
        this.f252045n = removePocketExtension;
        this.o = walletInteractor;
        this.f252046p = juniorWalletInteractor;
        this.f252047q = ta6.a.a(0);
        yji.n[] elements = {removePocketExtension, juniorDashboardCurrencyInconsistencyDialogProvider};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f252048r = d.y0(elements);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.f252048r;
    }

    @Override // v68.a
    public final z1 b3() {
        return this.f252047q;
    }

    @Override // v68.a
    public final void c3(String str, ProductAccountId productAccountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorId$0");
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        yji.n.j2(this, this.f252045n.Z2(new RemoveAccountContract$InputData(productAccountId, ProductId.YOUTH)), null, new p(10, this, pocket, str, (Continuation) null), 3);
    }
}
