package bpl;

import akl.e1;
import akl.o0;
import bi2.n;
import cli.y;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements f {
    public final AccountDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f17641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rqk.k f17642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f17643r;

    public j(AccountDetailsScreenContract$InputData inputData, o0 revolutAccountUserInfoRepository, rqk.k revolutSsoDependenciesProvider, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f17641p = revolutAccountUserInfoRepository;
        this.f17642q = revolutSsoDependenciesProvider;
        this.f17643r = mra.d.b(this, new e(inputData.f106708b, inputData.f106707a, inputData.f106709c, inputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((e1) this.f17641p).e(this.o.f106708b.f106203a, true), null, null, new n(this, null, 18), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            n2(new aza.g(this, null, 23), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f17643r;
    }
}
