package oh3;

import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import e0f.r1;
import h6i.o;
import h93.j0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m2j.j;
import neg.q;
import w4l.h;
import yte.n;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements lh3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f225284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5i.c f225285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u51.a f225286c;
    public final o d;
    public final w5i.d e;

    public f(j balancesInteractor, w5i.c moveMoneyBalancesListInteractor, u51.a topUpMethodsInteractor, o moveMoneyAccountProvider, w5i.d moveMoneyQuoteInteractor) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesListInteractor, "moveMoneyBalancesListInteractor");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(moveMoneyQuoteInteractor, "moveMoneyQuoteInteractor");
        this.f225284a = balancesInteractor;
        this.f225285b = moveMoneyBalancesListInteractor;
        this.f225286c = topUpMethodsInteractor;
        this.d = moveMoneyAccountProvider;
        this.e = moveMoneyQuoteInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(oh3.f r16, com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r17, com.revolut.feature_move_money.api.model.AccountWrapper r18, com.revolut.feature_move_money.api.model.AccountWrapper r19, dj0.d r20, gim.c r21) {
        /*
            r0 = r16
            r1 = r21
            r0.getClass()
            boolean r2 = r1 instanceof oh3.b
            if (r2 == 0) goto L1a
            r2 = r1
            oh3.b r2 = (oh3.b) r2
            int r3 = r2.f225276x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f225276x = r3
            goto L1f
        L1a:
            oh3.b r2 = new oh3.b
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f225276x
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L39
            if (r4 != r6) goto L31
            long r2 = r2.u
            yhm.o.b(r1)     // Catch: java.lang.Exception -> L7a
            goto L67
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            yhm.o.b(r1)
            r1 = r17
            java.lang.Long r1 = r1.f99405b
            if (r1 == 0) goto L7f
            long r7 = r1.longValue()
            w5i.d r9 = r0.e     // Catch: java.lang.Exception -> L7a
            r0 = r20
            long r12 = r0.f115082a     // Catch: java.lang.Exception -> L7a
            com.revolut.feature_move_money.api.model.OrderMode$Market r15 = new com.revolut.feature_move_money.api.model.OrderMode$Market     // Catch: java.lang.Exception -> L7a
            r0 = 0
            r15.<init>(r0)     // Catch: java.lang.Exception -> L7a
            r14 = 0
            r10 = r18
            r11 = r19
            jhi.b r0 = w5i.d.a(r9, r10, r11, r12, r14, r15)     // Catch: java.lang.Exception -> L7a
            r2.u = r7     // Catch: java.lang.Exception -> L7a
            r2.f225276x = r6     // Catch: java.lang.Exception -> L7a
            java.lang.Object r1 = vkm.q.x(r0, r2)     // Catch: java.lang.Exception -> L7a
            if (r1 != r3) goto L66
            return r3
        L66:
            r2 = r7
        L67:
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r1 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r1     // Catch: java.lang.Exception -> L7a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r1.d     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L6f
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r1.f104754c     // Catch: java.lang.Exception -> L7a
        L6f:
            dj0.d r0 = a.a.L(r0)     // Catch: java.lang.Exception -> L7a
            long r0 = r0.f115082a     // Catch: java.lang.Exception -> L7a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L7a
            r5 = r6
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oh3.f.a(oh3.f, com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, dj0.d, gim.c):java.lang.Object");
    }

    public final Flow b(dj0.d requiredAmount, j0 j0Var, AccountWrapper targetAccount, boolean z, n contextType, List tags) {
        Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        k1j.a[] elements = {k1j.a.POCKETS, k1j.a.SAVINGS, k1j.a.VAULTS, k1j.a.CRYPTO, k1j.a.COMMODITIES, k1j.a.JOINT_ACCOUNT, k1j.a.JOINT_VAULTS, k1j.a.JOINT_SAVINGS, k1j.a.PRO, k1j.a.CREDIT_CARDS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Flow flowI = c6d.b.i(nim.a.v(rd0.e.b(w5i.c.a(this.f225285b, kotlin.collections.d.y0(elements), null, null, requiredAmount.f115083b, 62)), new q(targetAccount, requiredAmount, j0Var, this)), new q(this, 28, targetAccount, requiredAmount));
        if (!z) {
            return flowI;
        }
        return nim.a.v(u0.m(flowI, nim.a.v(((r1) this.f225286c).j(requiredAmount.f115083b.f306286a, contextType, h.f294642c, new CheckoutContext(requiredAmount, null, null), tags), new a(1))), new a(2));
    }
}
