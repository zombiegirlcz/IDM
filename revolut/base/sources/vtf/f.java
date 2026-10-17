package vtf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import efm.d0;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import m2j.j;
import ufm.i;
import vo8.t;
import vq5.x;
import vrl.i0;
import vrl.v0;
import wsg.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements utf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f292115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f292116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f292117c;
    public final fk3.a d;
    public final ppk.f e;
    public final bqf.d f;

    public f(n walletInteractor, ang.f userInteractor, j balancesInteractor, fk3.a configurationInteractor, ppk.f ratesInteractor, bqf.d trustInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        this.f292115a = walletInteractor;
        this.f292116b = userInteractor;
        this.f292117c = balancesInteractor;
        this.d = configurationInteractor;
        this.e = ratesInteractor;
        this.f = trustInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vtf.f r5, com.revolut.domain.models.moneyrequest.MoneyRequest r6, do3.n r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vtf.f.a(vtf.f, com.revolut.domain.models.moneyrequest.MoneyRequest, do3.n, gim.c):java.lang.Object");
    }

    public final i b(TransferRequestApprovalData approvalData) {
        Intrinsics.checkNotNullParameter(approvalData, "approvalData");
        dj0.d f92449a = approvalData.getF92449a();
        d0 d0VarFirstOrError = m70.a.g(osg.b.e(this.f292115a, false, l.CURRENT, null, io3.i.INTERNAL, null, null, null, 116), null, new t(25), 1).map(new v0(15, new b(0, f92449a))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        v0 v0Var = new v0(14, new a(this, approvalData));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, v0Var, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final i c(dj0.d dVar) {
        d0 d0VarFirstOrError = m70.a.g(((ik3.c) this.d).n(), null, null, 3).firstOrError();
        v0 v0Var = new v0(13, new i0(6));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, v0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(new i(iVar, new v0(10, new x(this, 14)), 0), new v0(11, new vrl.n(this, dVar, 5)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        i iVar3 = new i(zi0.c.t(iVar2), new v0(12, new ar3.a(29, dVar)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return iVar3;
    }
}
