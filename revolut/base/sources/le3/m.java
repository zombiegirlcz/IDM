package le3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import tof.ab;
import tof.cc;
import tof.eb;
import tof.ec;
import tof.i7;
import tof.jb;
import tof.lb;
import tof.na;
import tof.oa;
import tof.q7;
import tof.q8;
import tof.u7;
import tof.xa;
import tof.y6;
import tof.y9;
import tof.za;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wif.a f194476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec f194477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9 f194478c;
    public final na d;
    public final na e;
    public final na f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q7 f194479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q7 f194480h;
    public final na i;

    public m(wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f194476a = userFeaturesChecker;
        this.f194477b = new ec(null);
        this.f194478c = new y9();
        i7.c cVar = i7.Companion;
        io3.l lVar = io3.l.CREDIT;
        i7[] i7VarArr = {new xa(lVar), new eb(lVar), new lb(lVar)};
        cVar.getClass();
        oa oaVarB = i7.c.b(i7VarArr);
        y6 y6Var = y6.TRANSFER;
        this.d = i7.c.e(i7.c.a(oaVarB, new cc(zhm.u.c(y6Var)), new u7(null), new jb(), new ab()));
        this.e = i7.c.e(new eb(io3.l.STAKING), new lb(io3.l.STAKING_PROXY));
        y6[] y6VarArr = (y6[]) k71.k.f181789a.toArray(new y6[0]);
        this.f = i7.c.e(i7.c.a(i7.c.d((y6[]) Arrays.copyOf(y6VarArr, y6VarArr.length)), i7.t.f272826a));
        io3.l lVar2 = io3.l.SAVINGS;
        this.f194479g = i7.c.a(new xa(lVar2), new cc(zhm.u.c(y6Var)), i7.s.f272825a);
        this.f194480h = i7.c.a(new xa(lVar2), i7.c.b(i7.c.a(i7.v.f272828a, i7.i.f272815a), new cc(zhm.u.c(y6.CARD_PAYMENT))));
        za zaVar = new za("revx_topup");
        za zaVar2 = new za("revx_crypto_topup");
        za zaVar3 = new za("revx_withdrawal");
        za zaVar4 = new za("revx_crypto_withdrawal");
        cc ccVar = new cc(zhm.v.k(y6.REVX_EXCHANGE, y6.REVX_TRANSFER));
        io3.l lVar3 = io3.l.REVX_FIAT;
        this.i = i7.c.e(zaVar, zaVar2, zaVar3, zaVar4, ccVar, new xa(lVar3), new q8(lVar3));
    }
}
