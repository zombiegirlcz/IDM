package zoc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements m1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f323964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nmc.a f323965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f323966c;

    public e(qmc.h portfolioInfoProvider, nmc.a addMoneyDialogProvider, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(addMoneyDialogProvider, "addMoneyDialogProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f323964a = portfolioInfoProvider;
        this.f323965b = addMoneyDialogProvider;
        this.f323966c = tradingAccountsInteractor;
    }

    @Override // m1h.a
    public final Object a() {
        return new j0((Clause) new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_update_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }

    @Override // m1h.a
    public final Object b(TransferSubjectId transferSubjectId, dj0.d dVar, iah.h hVar) {
        return d(transferSubjectId, new c(this, transferSubjectId, dVar, null), hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // m1h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r17, dj0.d r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof zoc.a
            if (r3 == 0) goto L19
            r3 = r2
            zoc.a r3 = (zoc.a) r3
            int r4 = r3.f323955w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f323955w = r4
            goto L20
        L19:
            zoc.a r3 = new zoc.a
            gim.c r2 = (gim.c) r2
            r3.<init>(r0, r2)
        L20:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f323955w
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            yhm.o.b(r2)
            goto L4b
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            r3.f323955w = r6
            zoc.b r2 = new zoc.b
            r5 = 0
            r6 = r18
            r2.<init>(r0, r1, r6, r5)
            java.lang.Object r2 = r0.d(r1, r2, r3)
            if (r2 != r4) goto L4b
            return r4
        L4b:
            r4 = r2
            com.revolut.core.ui_kit.models.Clause r4 = (com.revolut.core.ui_kit.models.Clause) r4
            nii.j0 r3 = new nii.j0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 4094(0xffe, float:5.737E-42)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zoc.e.c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r7, kotlin.jvm.functions.Function2 r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zoc.d
            if (r0 == 0) goto L13
            r0 = r9
            zoc.d r0 = (zoc.d) r0
            int r1 = r0.f323963x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323963x = r1
            goto L18
        L13:
            zoc.d r0 = new zoc.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323963x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            gim.i r7 = r0.u
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            yhm.o.b(r9)
            goto L5c
        L3c:
            yhm.o.b(r9)
            ybl.k r9 = r6.f323966c
            java.lang.String r7 = r7.getF95657a()
            akg.n r7 = ybl.k.i(r9, r7)
            r9 = 3
            jhi.b r7 = mo3.a.g(r7, r5, r5, r9)
            r9 = r8
            gim.i r9 = (gim.i) r9
            r0.u = r9
            r0.f323963x = r3
            java.lang.Object r9 = vkm.q.z(r7, r0)
            if (r9 != r1) goto L5c
            goto L7f
        L5c:
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L65
            java.lang.Object r7 = r9.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r7
            goto L66
        L65:
            r7 = r5
        L66:
            boolean r9 = r7 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo
            if (r9 == 0) goto L6d
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Robo r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo) r7
            goto L6e
        L6d:
            r7 = r5
        L6e:
            if (r7 != 0) goto L75
            java.lang.String r9 = "No Robo account found for portfolio ID"
            r6.b.D(r9)
        L75:
            r0.u = r5
            r0.f323963x = r4
            java.lang.Object r7 = r8.invoke(r7, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zoc.e.d(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }
}
