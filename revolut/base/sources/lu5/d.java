package lu5;

import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.ac;
import tof.cc;
import tof.eb;
import tof.fc;
import tof.i7;
import tof.lb;
import tof.n7;
import tof.na;
import tof.o7;
import tof.oa;
import tof.q7;
import tof.r7;
import tof.v6;
import tof.w6;
import tof.xa;
import tof.y6;
import tof.z8;
import tof.za;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td0.b f200025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f200026b;

    public d(td0.b currencySetsProvider) {
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        this.f200025a = currencySetsProvider;
        this.f200026b = yhm.j.b(new ljd.e(this, 17));
    }

    public final q7 a(List filters) {
        oa oaVarB;
        oa oaVarB2;
        Object objE;
        Object objB;
        Intrinsics.checkNotNullParameter(filters, "filters");
        List list = filters;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof CryptoTransactionFilter.TransactionTypeFilter) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((CryptoTransactionFilter.TransactionTypeFilter) obj3).f71395b) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            kt5.a type = ((CryptoTransactionFilter.TransactionTypeFilter) it8.next()).f71394a;
            Intrinsics.checkNotNullParameter(type, "type");
            switch (c.f200024b[type.ordinal()]) {
                case 1:
                    i7.c cVar = i7.Companion;
                    y6[] y6VarArr = {y6.EXCHANGE};
                    cVar.getClass();
                    objB = i7.c.b(i7.c.a(i7.c.d(y6VarArr), new n7(), fc.b(new r7(yvh.f.SPARE_CHANGE))), i7.c.a(i7.c.d(y6.REVX_EXCHANGE), i7.c.c(v6.COMPLETED), new n7()));
                    continue;
                    arrayList3.add(objB);
                    break;
                case 2:
                    i7.c cVar2 = i7.Companion;
                    y6[] y6VarArr2 = {y6.EXCHANGE};
                    cVar2.getClass();
                    objB = i7.c.b(i7.c.a(i7.c.d(y6VarArr2), new o7()), i7.c.a(i7.c.d(y6.REVX_EXCHANGE), i7.c.c(v6.COMPLETED), new o7()), i7.c.a(i7.c.d(y6.TOPUP), new ac(w6.CRYPTO_WALLET), new z8((List) this.f200026b.getValue())));
                    continue;
                    arrayList3.add(objB);
                    break;
                case 3:
                    i7.c cVar3 = i7.Companion;
                    y6[] y6VarArr3 = {y6.REWARD};
                    cVar3.getClass();
                    objB = i7.c.b(i7.c.d(y6VarArr3), i7.c.d(y6.CASHBACK));
                    break;
                case 4:
                    i7.c cVar4 = i7.Companion;
                    i7[] i7VarArr = {new xa(io3.l.CURRENT), new eb(io3.l.STAKING)};
                    cVar4.getClass();
                    objB = i7.c.a(i7VarArr);
                    break;
                case 5:
                    i7.c cVar5 = i7.Companion;
                    io3.l lVar = io3.l.CURRENT;
                    xa xaVar = new xa(lVar);
                    io3.l lVar2 = io3.l.STAKING;
                    i7[] i7VarArr2 = {xaVar, new lb(lVar2)};
                    cVar5.getClass();
                    q7 q7VarA = i7.c.a(i7VarArr2);
                    xa xaVar2 = new xa(lVar);
                    io3.l lVar3 = io3.l.STAKING_PROXY;
                    objB = i7.c.b(q7VarA, i7.c.a(xaVar2, new lb(lVar3)), i7.c.a(new xa(lVar2), new eb(lVar3)));
                    break;
                case 6:
                    objB = kt5.b.f189500a;
                    break;
                case 7:
                    objB = kt5.b.f189501b;
                    break;
                case 8:
                    i7.c cVar6 = i7.Companion;
                    y6[] y6VarArr4 = {y6.CRYPTO_WITHDRAWAL};
                    cVar6.getClass();
                    cc ccVarD = i7.c.d(y6VarArr4);
                    cc ccVarD2 = i7.c.d(y6.TRANSFER);
                    o7 o7Var = new o7();
                    na naVarB = fc.b(new za("revx_funding_payment"));
                    xa xaVar3 = new xa(io3.l.CURRENT);
                    io3.l lVar4 = io3.l.STAKING;
                    objB = i7.c.b(ccVarD, i7.c.a(ccVarD2, o7Var, naVarB, fc.b(i7.c.a(xaVar3, new eb(lVar4))), fc.b(i7.c.a(new xa(lVar4), new eb(io3.l.STAKING_PROXY)))), i7.c.a(i7.c.d(y6.REVX_TRANSFER), new o7()), kt5.b.f189502c);
                    break;
                case 9:
                    i7.c cVar7 = i7.Companion;
                    y6[] y6VarArr5 = {y6.TOPUP};
                    cVar7.getClass();
                    q7 q7VarA2 = i7.c.a(i7.c.d(y6VarArr5), new ac(w6.CRYPTO_WALLET), fc.b(i7.p.f272822a));
                    cc ccVarD3 = i7.c.d(y6.TRANSFER);
                    n7 n7Var = new n7();
                    na naVarB2 = fc.b(new za("revx_funding_payment"));
                    xa xaVar4 = new xa(io3.l.CURRENT);
                    io3.l lVar5 = io3.l.STAKING;
                    objB = i7.c.b(q7VarA2, i7.c.a(ccVarD3, n7Var, naVarB2, fc.b(i7.c.a(xaVar4, i7.c.b(new eb(lVar5), new lb(lVar5), new lb(io3.l.STAKING_PROXY))))), i7.c.a(i7.c.d(y6.REVX_TRANSFER), new n7()), kt5.b.d);
                    break;
                case 10:
                    i7.c cVar8 = i7.Companion;
                    y6[] y6VarArr6 = {y6.CARD_PAYMENT};
                    cVar8.getClass();
                    objB = i7.c.d(y6VarArr6);
                    break;
                case 11:
                    objB = new r7(yvh.f.SPARE_CHANGE);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList3.add(objB);
        }
        int i = 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof CryptoTransactionFilter.CurrencyFilter) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList4) {
            if (((CryptoTransactionFilter.CurrencyFilter) obj5).f71392b) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            arrayList6.add(((CryptoTransactionFilter.CurrencyFilter) it9.next()).f71391a);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : list) {
            if (obj6 instanceof CryptoTransactionFilter.AccountTypeFilter) {
                arrayList7.add(obj6);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj7 : arrayList7) {
            if (((CryptoTransactionFilter.AccountTypeFilter) obj7).f71389b) {
                arrayList8.add(obj7);
            }
        }
        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
        Iterator it10 = arrayList8.iterator();
        while (it10.hasNext()) {
            it5.a accountType = ((CryptoTransactionFilter.AccountTypeFilter) it10.next()).f71388a;
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            int i2 = c.f200023a[accountType.ordinal()];
            if (i2 == i) {
                i7.c cVar9 = i7.Companion;
                i7[] i7VarArr3 = {kt5.b.e};
                cVar9.getClass();
                objE = i7.c.e(i7VarArr3);
            } else {
                if (i2 == 2) {
                    throw new IllegalStateException("Spot margin account type is not supported for transaction filters");
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objE = kt5.b.e;
            }
            arrayList9.add(objE);
            i = 1;
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            i7.c cVar10 = i7.Companion;
            i7[] i7VarArr4 = (i7[]) arrayList3.toArray(new i7[0]);
            i7[] i7VarArr5 = (i7[]) Arrays.copyOf(i7VarArr4, i7VarArr4.length);
            cVar10.getClass();
            oaVarB = i7.c.b(i7VarArr5);
        } else {
            oaVarB = null;
        }
        if (arrayList6.isEmpty()) {
            arrayList6 = null;
        }
        z8 z8Var = arrayList6 != null ? new z8(arrayList6) : null;
        if (arrayList9.isEmpty()) {
            arrayList9 = null;
        }
        if (arrayList9 != null) {
            i7.c cVar11 = i7.Companion;
            i7[] i7VarArr6 = (i7[]) arrayList9.toArray(new i7[0]);
            i7[] i7VarArr7 = (i7[]) Arrays.copyOf(i7VarArr6, i7VarArr6.length);
            cVar11.getClass();
            oaVarB2 = i7.c.b(i7VarArr7);
        } else {
            oaVarB2 = null;
        }
        if (oaVarB == null && z8Var == null && oaVarB2 == null) {
            return null;
        }
        i7[] i7VarArr8 = {oaVarB, z8Var, oaVarB2};
        i7.Companion.getClass();
        return i7.c.a(i7VarArr8);
    }
}
