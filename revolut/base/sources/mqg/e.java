package mqg;

import bcb.g;
import ccb.k;
import ccb.y;
import com.revolut.core.model.account.AccountId;
import java.util.List;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mlk.a0;
import mll.c0;
import pcd.s;
import vkm.q;
import vkm.v1;
import w4l.h;
import wsg.n;
import ypg.p;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public class e implements ybb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f207998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f207999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.a f208000c;
    public final o7.d d;
    public final ijb.a e;
    public final hj8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c4i.a f208001g;

    public e(hj8.a juniorProfileInteractor, ijb.a savingsProductInteractor, o7.d validator, ppg.a customisedVaultInteractor, ppg.b vaultsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f207998a = vaultsInteractor;
        this.f207999b = walletInteractor;
        this.f208000c = customisedVaultInteractor;
        this.d = validator;
        this.e = savingsProductInteractor;
        this.f = juniorProfileInteractor;
        this.f208001g = c4i.a.VAULT_TRANSFER;
    }

    @Override // ybb.d
    public final vkm.d a(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return qk.d.n(this.f207999b, currency, accountId);
    }

    @Override // ybb.d
    public final Flow b(bcb.e moneyBox, k moneyFlowType, xi0.b sourcePocketCurrency) {
        Intrinsics.checkNotNullParameter(moneyBox, "moneyBox");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(sourcePocketCurrency, "sourcePocketCurrency");
        if (moneyBox instanceof bcb.d) {
            s sVar = ((bcb.d) moneyBox).f14423c;
            if (sVar.f234889n == pcd.b.YOUTH && moneyFlowType == k.OUT) {
                return mo3.a.g(nim.a.v(hj8.a.a(this.f, sVar.f, h.f294642c), new a0(29)), null, new a(0), 1);
            }
        }
        return super.b(moneyBox, moneyFlowType, sourcePocketCurrency);
    }

    @Override // ybb.d
    public final v1 d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new v1(new c0(this, id10, (Continuation) null, 8));
    }

    @Override // ybb.d
    public final c4i.a e() {
        return this.f208001g;
    }

    @Override // ybb.d
    public final Object f(String str, y yVar) {
        return q.x(rd0.e.e(mo3.a.g(rd0.e.b(pd.b.r(((p) this.f207998a).i(str), new ml3.y(this, 28))), null, new a(1), 1), h0.f322473a, new l1(3, 26, null)), yVar);
    }

    @Override // ybb.d
    public final vkm.d g(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.b(zi0.c.F(nim.a.w(ppg.a.a(this.f208000c, id10), new b(0)), nib.a.a()));
    }

    @Override // ybb.d
    public Flow h(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.b(m70.a.g(nim.a.w(((p) this.f207998a).i(id10), d.f), null, new a(2), 1));
    }

    @Override // ybb.d
    public final List i(g validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        return this.d.z(validationData.f14429a).f316033b;
    }
}
