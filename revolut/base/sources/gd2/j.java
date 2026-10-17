package gd2;

import cli.n;
import cli.y;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements dli.b {
    public final IDealAccountsListControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ad2.a f143043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f143044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f143045r;

    public j(IDealAccountsListControllerContract$InputData inputData, ad2.a idealRepository, f80.a uriHelper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idealRepository, "idealRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f143043p = idealRepository;
        this.f143044q = uriHelper;
        d dVar = inputData.f62839b;
        f0 f0Var = f0.f322471a;
        this.f143045r = mra.d.b(this, new e(true, dVar, f0Var, f0Var), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new i(this, null, 1), new g4k.e(this, 29));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f143045r;
    }
}
