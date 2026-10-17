package cr5;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import efm.r;
import ko5.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ukm.f;
import vkm.q;
import vkm.z1;
import zhm.f0;
import zq5.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoSendWalletsListControllerContract$InputData f108200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d3j.b f108201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zq5.c f108202n;
    public final z1 o;

    public e(CryptoSendWalletsListControllerContract$InputData inputData, d3j.b beneficiaryInteractor, zq5.c beneficiaryTransferMoneyPocketResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryTransferMoneyPocketResolver, "beneficiaryTransferMoneyPocketResolver");
        this.f108200l = inputData;
        this.f108201m = beneficiaryInteractor;
        this.f108202n = beneficiaryTransferMoneyPocketResolver;
        this.o = q.b(1, 1, f.DROP_OLDEST);
    }

    @Override // cr5.a
    public final r Z2() {
        return this.f108200l.f71335b.contains(p.BANK_BENEFICIARY) ? nim.a.w(w2j.a.d(this.f108201m, null, false, null, 5), new com.revolut.feature.alipay_plus.mpm.webcontainer.a(26)) : zi0.c.j(new b(f0.f322471a));
    }

    @Override // cr5.a
    public final z1 b3() {
        return this.o;
    }

    @Override // cr5.a
    public final void c3(e0 row) {
        Intrinsics.checkNotNullParameter(row, "row");
        T2(new cn0.d(this, row.f324374a, (Continuation) null, 8), new yi5.b(27));
    }

    @Override // cr5.a
    public final void d3(e0 row, SwipeToActionDelegate.SwipeAction action) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(action, "action");
        T2(new d(action, row.f324374a, this, null), new yi5.b(27));
    }
}
