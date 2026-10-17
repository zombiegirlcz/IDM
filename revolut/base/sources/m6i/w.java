package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.n2;
import tof.n9;
import tof.o9;
import tof.p9;
import tof.q7;
import tof.q9;
import tof.ub;
import tof.vb;
import tof.wb;
import tof.xb;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f203211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6i.o f203212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7i.u f203213c;
    public final wa7.m d;
    public final za7.c e;
    public final hd.r f;

    public w(com.revolut.domain.interactors.transactions.a transactionsInteractor, h6i.o accountProvider, r7i.u balancePairEligibilityChecker, wa7.m hiddenAccountsInteractor, za7.c hiddenBalancesIdProvider, hd.r secondAccountSelector) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(balancePairEligibilityChecker, "balancePairEligibilityChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenBalancesIdProvider, "hiddenBalancesIdProvider");
        Intrinsics.checkNotNullParameter(secondAccountSelector, "secondAccountSelector");
        this.f203211a = transactionsInteractor;
        this.f203212b = accountProvider;
        this.f203213c = balancePairEligibilityChecker;
        this.d = hiddenAccountsInteractor;
        this.e = hiddenBalancesIdProvider;
        this.f = secondAccountSelector;
    }

    public static q7 c(AccountWrapper accountWrapper) {
        i7.c cVar = i7.Companion;
        q9 q9Var = new q9(y.c(accountWrapper));
        n9 n9Var = new n9(accountWrapper.getId());
        i7[] i7VarArr = {new p9(n2.MONEYBOX), new o9(accountWrapper.getId())};
        cVar.getClass();
        return i7.c.a(q9Var, i7.c.b(n9Var, i7.c.a(i7VarArr)));
    }

    public static q7 e(AccountWrapper accountWrapper) {
        i7.c cVar = i7.Companion;
        xb xbVar = new xb(y.c(accountWrapper));
        ub ubVar = new ub(accountWrapper.getId());
        i7[] i7VarArr = {new wb(n2.MONEYBOX), new vb(accountWrapper.getId())};
        cVar.getClass();
        return i7.c.a(xbVar, i7.c.b(ubVar, i7.c.a(i7VarArr)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r13 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        if (r13 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(tof.a3 r10, com.revolut.feature_move_money.api.model.AccountWrapper r11, com.revolut.shared.feature.move_money.api.navigation.a r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.w.a(tof.a3, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.a, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (r13 != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.a3 r10, com.revolut.feature_move_money.api.model.AccountWrapper r11, com.revolut.shared.feature.move_money.api.navigation.a r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.w.b(tof.a3, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature_move_money.api.model.AccountWrapper r18, com.revolut.shared.feature.move_money.api.navigation.a r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.w.d(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.a, gim.c):java.lang.Object");
    }
}
