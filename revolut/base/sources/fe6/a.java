package fe6;

import a08.d;
import b9i.f;
import be6.e;
import be6.h;
import be6.j;
import be6.k;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import efm.d0;
import fag.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pd.b;
import pfm.r;
import pfm.t;
import pfm.z;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f134453a;

    public a(e repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f134453a = repo;
    }

    public final t a(ExtensionAuthRequestData data) {
        r rVarG0;
        Intrinsics.checkNotNullParameter(data, "requestData");
        j jVar = (j) this.f134453a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof ExtensionAuthRequestData.Verification) {
            ExtensionAuthRequestData.Verification verification = (ExtensionAuthRequestData.Verification) data;
            rVarG0 = w.g0(jVar.f14687a.confirmVerification(verification.f72184b, new be6.a(verification.f72183a)));
        } else {
            if (!(data instanceof ExtensionAuthRequestData.AppChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            pfm.a aVar = new pfm.a(b.n(g.f186406a, new be6.g(jVar, data, null)), new bce.e(new f(jVar, 15), 19), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            rVarG0 = w.g0(aVar);
        }
        t tVarL = rVarG0.l(new d(this, 18));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final z b() {
        d0<k> verificationCode = ((j) this.f134453a).f14687a.getVerificationCode("app");
        h hVar = h.f;
        a0.b bVar = new a0.b(29);
        verificationCode.getClass();
        i iVar = new i(verificationCode, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(w.i0(iVar), new m0(new fca.d(this, 5), 22), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.F(iVar2, Boolean.FALSE);
    }

    public final pfm.a c(ExtensionAuthRequestData data) {
        Object objG0;
        Intrinsics.checkNotNullParameter(data, "requestData");
        j jVar = (j) this.f134453a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof ExtensionAuthRequestData.Verification) {
            objG0 = w.g0(jVar.f14687a.rejectVerification(((ExtensionAuthRequestData.Verification) data).f72184b));
        } else {
            if (!(data instanceof ExtensionAuthRequestData.AppChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            pfm.a aVar = new pfm.a(b.n(g.f186406a, new be6.i(jVar, data, null)), new bce.e(new f(jVar, 15), 19), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            objG0 = aVar;
        }
        pfm.a aVar2 = new pfm.a(objG0, jVar.a(null), 0);
        Intrinsics.checkNotNullExpressionValue(aVar2, "concatWith(...)");
        return aVar2;
    }
}
