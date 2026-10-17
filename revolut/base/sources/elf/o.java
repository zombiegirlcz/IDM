package elf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bd3.a f127389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bmf.b f127390m;

    public o(bd3.a cashbackInteractor, bmf.b modalFactory) {
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f127389l = cashbackInteractor;
        this.f127390m = modalFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof elf.n
            if (r0 == 0) goto L13
            r0 = r9
            elf.n r0 = (elf.n) r0
            int r1 = r0.f127377w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127377w = r1
            goto L18
        L13:
            elf.n r0 = new elf.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127377w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto L5e
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            yhm.o.b(r9)
            bd3.a r9 = r8.f127389l
            w4l.h r2 = w4l.h.f294642c
            efm.r r9 = r9.c(r2)
            bbh.a r2 = new bbh.a
            r5 = 11
            r2.<init>(r5)
            efm.r r9 = nim.a.w(r9, r2)
            vkm.d r9 = rd0.e.b(r9)
            ej9.t r2 = new ej9.t
            r5 = 18
            r2.<init>(r5)
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            r0.f127377w = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r9 = (java.lang.String) r9
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r0 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            java.lang.String r1 = r1.f83420a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r2 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r3 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r5 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$PlanCashback r7 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.PlanCashback.INSTANCE
            r6.<init>(r9, r7)
            r3.<init>(r6, r5)
            r2.<init>(r3, r4)
            r9 = 10
            r0.<init>(r1, r4, r2, r9)
            r8.A2(r0)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.o.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof a3)) {
            A2(new TransactionDetailsDestination(ofm.q.P((a3) obj2), (rhf.d) null, 6));
        } else if (str.equals("ID_ACQUIRING_CASHBACK_BOOSTER")) {
            A2(new FreelancerBizFeatureConfig.Cashback(com.revolut.feature.freelancer.api.navigation.a.BOOSTER));
        } else if (str.equals("ID_ACQUIRING_CASHBACK_PLAN")) {
            A2(new FreelancerBizFeatureConfig.Cashback(com.revolut.feature.freelancer.api.navigation.a.PLAN));
        } else if (str.equals("ID_ACQUIRING_CASHBACK_INFO")) {
            A2(new FreelancerBizFeatureConfig.Cashback(com.revolut.feature.freelancer.api.navigation.a.DETAILS));
        } else {
            if (!str.equals("ID_PLAN_CASHBACK_AMOUNT")) {
                if (str.equals("ID_PLAN_CASHBACK_TO_VAULT")) {
                    return Z2((gim.c) continuation);
                }
                return Boolean.valueOf(z);
            }
            yji.n.P2(this, bmf.a.c(this.f127390m, new TextLocalisedClause(R$string.transactionUI_transaction_details_plan_cashback_info_title, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_details_plan_cashback_info_description, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_details_plan_cashback_info_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, 40), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
