package mq4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.n4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends oki.h implements i {

    @NotNull
    public static final p Companion = new p();
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f207877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n4 f207878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final al4.q f207879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f207880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f207881t;
    public final ow4.a u;
    public final CollateralMoveMoneyScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f207882w;

    public x(wsg.n walletInteractor, j60.a bottomDialogExtension, n4 securedCreditCardInteractor, al4.q creditCardProductInteractor, wj0.a idempotencyKeyHolder, k dialogProvider, ow4.a moneyUtils, CollateralMoveMoneyScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(moneyUtils, "moneyUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f207877p = bottomDialogExtension;
        this.f207878q = securedCreditCardInteractor;
        this.f207879r = creditCardProductInteractor;
        this.f207880s = idempotencyKeyHolder;
        this.f207881t = dialogProvider;
        this.u = moneyUtils;
        this.v = inputData;
        this.f207882w = mra.d.b(this, new g(inputData.f69168c, new Data(null, null, true, 3, null), "", null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        int i = q.f207871a[this.v.f69168c.ordinal()];
        wj0.a aVar = this.f207880s;
        if (i == 1 || i == 2) {
            aVar.a("security_credit_card_top_up_idempotency_key_tag");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a("security_credit_card_withdraw_idempotency_key_tag");
        }
        l2(new v(this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(dj0.d r17, java.lang.String r18, dj0.d r19, gim.c r20) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof mq4.r
            if (r2 == 0) goto L17
            r2 = r1
            mq4.r r2 = (mq4.r) r2
            int r3 = r2.f207873x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f207873x = r3
            goto L1c
        L17:
            mq4.r r2 = new mq4.r
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f207873x
            com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData r5 = r0.v
            om4.n4 r6 = r0.f207878q
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L42
            if (r4 == r8) goto L3c
            if (r4 != r7) goto L34
            dj0.d r2 = r2.u
            yhm.o.b(r1)
            goto L7f
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            dj0.d r4 = r2.u
            yhm.o.b(r1)
            goto L71
        L42:
            yhm.o.b(r1)
            java.lang.String r10 = r5.f69166a
            r12 = r17
            r2.u = r12
            r2.f207873x = r8
            a5h.g r9 = r6.f226650a
            dp4.g1 r8 = new dp4.g1
            r14 = 0
            r15 = 0
            r11 = r18
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r8, r2)
            if (r1 != r3) goto L65
            goto L67
        L65:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L67:
            if (r1 != r3) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L6c:
            if (r1 != r3) goto L6f
            goto L7d
        L6f:
            r4 = r17
        L71:
            java.lang.String r1 = r5.f69166a
            r2.u = r4
            r2.f207873x = r7
            java.lang.Object r1 = r6.b(r1, r2)
            if (r1 != r3) goto L7e
        L7d:
            return r3
        L7e:
            r2 = r4
        L7f:
            nii.y0 r1 = new nii.y0
            nii.j0 r3 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.credit.core.R$string.credit_security_deposit_collateral_move_money_add_money_status_dialog_success_description
            r6 = 3
            r7 = 0
            com.revolut.core.ui_kit.models.MoneyClause r2 = sx4.f.b(r6, r7, r7, r2)
            java.util.List r2 = zhm.u.c(r2)
            r6 = 12
            r4.<init>(r5, r2, r7, r6)
            r14 = 0
            r15 = 4094(0xffe, float:5.737E-42)
            r5 = 0
            r6 = 0
            r2 = r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r5 = 5
            r1.<init>(r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            mq4.s r4 = new mq4.s
            r4.<init>(r0, r2)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mq4.x.I2(dj0.d, java.lang.String, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(dj0.d r17, java.lang.String r18, dj0.d r19, gim.c r20) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof mq4.w
            if (r2 == 0) goto L17
            r2 = r1
            mq4.w r2 = (mq4.w) r2
            int r3 = r2.f207876x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f207876x = r3
            goto L1c
        L17:
            mq4.w r2 = new mq4.w
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f207876x
            com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData r5 = r0.v
            om4.n4 r6 = r0.f207878q
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L42
            if (r4 == r8) goto L3c
            if (r4 != r7) goto L34
            dj0.d r2 = r2.u
            yhm.o.b(r1)
            goto L7f
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            dj0.d r4 = r2.u
            yhm.o.b(r1)
            goto L71
        L42:
            yhm.o.b(r1)
            java.lang.String r10 = r5.f69166a
            r12 = r17
            r2.u = r12
            r2.f207876x = r8
            a5h.g r9 = r6.f226650a
            dp4.g1 r8 = new dp4.g1
            r14 = 0
            r15 = 1
            r11 = r18
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r8, r2)
            if (r1 != r3) goto L65
            goto L67
        L65:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L67:
            if (r1 != r3) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L6c:
            if (r1 != r3) goto L6f
            goto L7d
        L6f:
            r4 = r17
        L71:
            java.lang.String r1 = r5.f69166a
            r2.u = r4
            r2.f207876x = r7
            java.lang.Object r1 = r6.b(r1, r2)
            if (r1 != r3) goto L7e
        L7d:
            return r3
        L7e:
            r2 = r4
        L7f:
            nii.y0 r1 = new nii.y0
            nii.j0 r3 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.credit.core.R$string.credit_security_deposit_collateral_move_money_withdraw_status_dialog_success_description
            r6 = 3
            r7 = 0
            com.revolut.core.ui_kit.models.MoneyClause r2 = sx4.f.b(r6, r7, r7, r2)
            java.util.List r2 = zhm.u.c(r2)
            r6 = 12
            r4.<init>(r5, r2, r7, r6)
            r14 = 0
            r15 = 4094(0xffe, float:5.737E-42)
            r5 = 0
            r6 = 0
            r2 = r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r5 = 5
            r1.<init>(r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            m9d.y0 r4 = new m9d.y0
            r3 = 25
            r4.<init>(r0, r2, r3)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mq4.x.J2(dj0.d, java.lang.String, dj0.d, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f207882w;
    }
}
