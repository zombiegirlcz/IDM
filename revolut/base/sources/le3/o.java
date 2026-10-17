package le3;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import tof.ab;
import tof.bb;
import tof.cc;
import tof.eb;
import tof.fc;
import tof.i7;
import tof.jb;
import tof.kb;
import tof.lb;
import tof.ma;
import tof.o7;
import tof.oa;
import tof.q7;
import tof.q8;
import tof.q9;
import tof.u7;
import tof.xa;
import tof.xb;
import tof.y6;
import tof.y9;
import tof.ya;
import tof.za;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa f194484a;

    public o() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {fc.b(new jb()), fc.b(new ab())};
        cVar.getClass();
        this.f194484a = i7.c.b(i7VarArr);
    }

    public static cc b() {
        y6[] y6VarArr = {y6.OTP_PAYMENT, y6.OTP_PAYMENT_REFUND, y6.OTP_ATM};
        y6[] y6VarArr2 = {y6.ATM, y6.FEE, y6.CHARGE, y6.TRANSFER, y6.CARD_PAYMENT, y6.REV_PAYMENT, y6.TAX, y6.MERCHANT_REFUND, y6.MERCHANT_CB};
        i7.c cVar = i7.Companion;
        y6[] y6VarArr3 = (y6[]) zhm.p.A(y6VarArr, y6VarArr2);
        y6[] y6VarArr4 = (y6[]) Arrays.copyOf(y6VarArr3, y6VarArr3.length);
        cVar.getClass();
        return i7.c.d(y6VarArr4);
    }

    public static q7 c(CategorisationFilter categorisationFilter) {
        oa oaVarB;
        oa oaVarB2;
        Set set = (Set) ue0.e.M(categorisationFilter.i);
        oa oaVarB3 = null;
        if (set != null) {
            Set<String> set2 = set;
            ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
            for (String str : set2) {
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {fc.b(new kb(null)), fc.b(new kb(str))};
                cVar.getClass();
                arrayList.add(i7.c.a(i7VarArr));
            }
            i7.c cVar2 = i7.Companion;
            i7[] i7VarArr2 = (i7[]) arrayList.toArray(new i7[0]);
            i7[] i7VarArr3 = (i7[]) Arrays.copyOf(i7VarArr2, i7VarArr2.length);
            cVar2.getClass();
            oaVarB = i7.c.b(i7VarArr3);
        } else {
            oaVarB = null;
        }
        Set set3 = (Set) ue0.e.M(categorisationFilter.i);
        if (set3 != null) {
            Set<String> set4 = set3;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(set4, 10));
            for (String str2 : set4) {
                i7.c cVar3 = i7.Companion;
                i7[] i7VarArr4 = {fc.b(new bb(null)), fc.b(new bb(str2))};
                cVar3.getClass();
                arrayList2.add(i7.c.a(i7VarArr4));
            }
            i7.c cVar4 = i7.Companion;
            i7[] i7VarArr5 = (i7[]) arrayList2.toArray(new i7[0]);
            i7[] i7VarArr6 = (i7[]) Arrays.copyOf(i7VarArr5, i7VarArr5.length);
            cVar4.getClass();
            oaVarB2 = i7.c.b(i7VarArr6);
        } else {
            oaVarB2 = null;
        }
        List list = (List) ue0.e.M(d0.Z(zhm.v.k(oaVarB, oaVarB2)));
        if (list != null) {
            i7.c cVar5 = i7.Companion;
            i7[] i7VarArr7 = (i7[]) list.toArray(new i7[0]);
            i7[] i7VarArr8 = (i7[]) Arrays.copyOf(i7VarArr7, i7VarArr7.length);
            cVar5.getClass();
            oaVarB3 = i7.c.b(i7VarArr8);
        }
        i7.c cVar6 = i7.Companion;
        xa xaVar = new xa(io3.l.SAVINGS);
        y6[] y6VarArr = {y6.TRANSFER};
        cVar6.getClass();
        return i7.c.a(xaVar, i7.c.d(y6VarArr), i7.c.b(oaVarB3, i7.c.a(i7.c.b(fc.b(new ab()), fc.b(new jb())), i7.c.b(i7.y.f272830a, fc.b(new ma())))));
    }

    public final q7 a(CategorisationFilter categorisationFilter) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {fc.b(new y9()), new q8(io3.l.INVESTMENT)};
        cVar.getClass();
        oa oaVarB = i7.c.b(i7VarArr);
        io3.l lVar = io3.l.STAKING;
        xa xaVar = new xa(lVar);
        lb lbVar = new lb(lVar);
        eb ebVar = new eb(lVar);
        io3.l lVar2 = io3.l.STAKING_PROXY;
        oa oaVarB2 = i7.c.b(xaVar, lbVar, ebVar, new xa(lVar2), new lb(lVar2), new eb(lVar2));
        tof.c cVar2 = tof.c.LOYALTY_VAULT;
        oa oaVarB3 = i7.c.b(new xb(cVar2), new q9(cVar2));
        io3.l lVar3 = io3.l.SAVINGS;
        oa oaVarB4 = i7.c.b(i7.y.f272830a, new xa(lVar3), new lb(lVar3), new eb(lVar3), new q8(lVar3));
        q7 q7VarA = i7.c.a(new o7(), new xa(lVar3), i7.c.b(i7.c.a(i7.v.f272828a, i7.i.f272815a), i7.c.d(y6.CARD_PAYMENT)));
        q7 q7VarC = c(categorisationFilter);
        io3.l lVar4 = io3.l.CREDIT;
        oa oaVarB5 = i7.c.b(new xa(lVar4), new eb(lVar4), new lb(lVar4));
        y6 y6Var = y6.TRANSFER;
        cc ccVarD = i7.c.d(y6Var);
        u7 u7Var = new u7(null);
        oa oaVar = this.f194484a;
        q7 q7VarA2 = i7.c.a(oaVarB5, ccVarD, u7Var, fc.b(oaVar));
        io3.l lVar5 = io3.l.MERCHANT;
        q7 q7VarA3 = i7.c.a(i7.c.b(new xa(lVar5), new lb(lVar5), new eb(lVar5)), i7.c.d(y6Var), new u7(null), fc.b(oaVar));
        io3.l lVar6 = io3.l.BLOCKING;
        eb ebVar2 = new eb(lVar6);
        lb lbVar2 = new lb(lVar6);
        oa oaVarB6 = i7.c.b(new za("revx_topup"), new za("revx_crypto_topup"), new za("revx_withdrawal"), new za("revx_crypto_withdrawal"));
        return i7.c.a(fc.b(oaVarB), fc.b(oaVarB2), fc.b(oaVarB3), i7.c.b(fc.b(oaVarB4), fc.b(new u7(null)), fc.b(new ya(null)), q7VarA, q7VarC), fc.b(q7VarA2), fc.b(q7VarA3), fc.b(ebVar2), fc.b(lbVar2), fc.b(oaVarB6), fc.b(i7.z.f272831a));
    }
}
