package m6i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f203187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6i.o f203188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f203189c;
    public final u5k.d d;

    public n0(MoveMoneyInputData inputData, h6i.o accountProvider, wsg.n walletInteractor, u5k.d transferWalletLimitsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        this.f203187a = inputData;
        this.f203188b = accountProvider;
        this.f203189c = walletInteractor;
        this.d = transferWalletLimitsInteractor;
    }

    public static long a(BalanceWrapper balanceWrapper) {
        dj0.d f = balanceWrapper.getF();
        if (f != null) {
            return f.f115082a;
        }
        Long l2 = balanceWrapper.f99405b;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(3:13|66|67)(2:14|15))(6:16|70|17|30|35|(4:41|(1:43)|44|(4:46|(1:48)(2:49|(2:52|(3:53|(1:55)|56)))|58|(1:63)(1:75))(1:74))(1:40)))(1:21))(3:22|(0)|65)|25|68|26|(8:29|30|35|(1:37)|41|(0)|44|(0)(0))|65) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        r11 = r14;
        r14 = r13;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0109, code lost:
    
        if (r15 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r13, java.util.List r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.n0.b(dj0.d, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        if (r3 == r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_move_money.api.model.AccountWrapper r18, dj0.d r19, gim.c r20, java.util.List r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.n0.c(com.revolut.feature_move_money.api.model.AccountWrapper, dj0.d, gim.c, java.util.List):java.lang.Object");
    }
}
