package pn6;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements h {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eg6.a f237674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f237675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v60.e f237676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f237677s;

    public l(n stateMapper, g inputData, eg6.a accountsToLinkInteractor, sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsToLinkInteractor, "accountsToLinkInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.o = inputData;
        this.f237674p = accountsToLinkInteractor;
        this.f237675q = serverErrorParser;
        this.f237676r = serverErrorsProvider;
        this.f237677s = mra.d.b(this, new f(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, I2(), null, null, new j(this, null, 0), 3);
    }

    public final vkm.d I2() {
        ExternalInstitutionAuthData authData = this.o.f237670a;
        eg6.a aVar = this.f237674p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(authData, "authData");
        th6.c cVar = aVar.f125549a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(authData, "authData");
        return rd0.e.b(cVar.f271270c.f(authData, false));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237677s;
    }
}
