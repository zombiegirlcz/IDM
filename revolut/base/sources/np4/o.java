package np4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements f {
    public final al4.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ow4.a f218141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AdditionalCardsChangeLimitScreenContract$InputData f218142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f218143r;

    public o(al4.d creditCardAdditionalCardholdersInteractor, ow4.a moneyUtils, AdditionalCardsChangeLimitScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(moneyUtils, "moneyUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardAdditionalCardholdersInteractor;
        this.f218141p = moneyUtils;
        this.f218142q = inputData;
        dj0.d dVar = inputData.f69027c;
        this.f218143r = mra.d.b(this, new d(dVar, String.valueOf(dVar != null ? sx4.f.b(3, null, null, dVar) : null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(np4.o r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof np4.h
            if (r0 == 0) goto L13
            r0 = r13
            np4.h r0 = (np4.h) r0
            int r1 = r0.f218135w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218135w = r1
            goto L18
        L13:
            np4.h r0 = new np4.h
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218135w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto L52
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            al4.d r13 = r12.o
            com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData r2 = r12.f218142q
            java.lang.String r5 = r2.f69025a
            java.lang.String r2 = r2.f69026b
            el4.g r6 = new el4.g
            el4.j r7 = new el4.j
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.<init>(r8, r4)
            r6.<init>(r4, r7, r4)
            r0.f218135w = r3
            om4.l r13 = (om4.l) r13
            java.lang.Object r13 = r13.e(r5, r2, r6, r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            mii.k r5 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.credit.core.R$string.additional_cards_cardholders_details_settings_purchase_limit_removed
            r0 = 14
            r7.<init>(r13, r4, r4, r0)
            r10 = 0
            r11 = 28
            java.lang.String r6 = "disable_single_purchase_limit_success"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.Flow r7 = r12.X1(r5)
            np4.i r10 = new np4.i
            r13 = 0
            r10.<init>(r12, r4, r13)
            r11 = 3
            r6 = r12
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: np4.o.I2(np4.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(np4.o r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof np4.m
            if (r0 == 0) goto L13
            r0 = r13
            np4.m r0 = (np4.m) r0
            int r1 = r0.f218139w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218139w = r1
            goto L18
        L13:
            np4.m r0 = new np4.m
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218139w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto L64
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            al4.d r13 = r12.o
            com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData r2 = r12.f218142q
            java.lang.String r5 = r2.f69025a
            java.lang.String r2 = r2.f69026b
            el4.g r6 = new el4.g
            cli.y r7 = r12.f218143r
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            np4.d r7 = (np4.d) r7
            dj0.d r7 = r7.f218131b
            if (r7 == 0) goto L55
            long r7 = r7.f115082a
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            goto L56
        L55:
            r9 = r4
        L56:
            r6.<init>(r9, r4, r4)
            r0.f218139w = r3
            om4.l r13 = (om4.l) r13
            java.lang.Object r13 = r13.e(r5, r2, r6, r0)
            if (r13 != r1) goto L64
            return r1
        L64:
            mii.k r5 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.credit.core.R$string.additional_cards_cardholders_details_settings_spending_limit_changed
            r0 = 14
            r7.<init>(r13, r4, r4, r0)
            r10 = 0
            r11 = 28
            java.lang.String r6 = "monthly_purchase_limit_update_success"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.Flow r7 = r12.X1(r5)
            np4.i r10 = new np4.i
            r13 = 1
            r10.<init>(r12, r4, r13)
            r11 = 3
            r6 = r12
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: np4.o.J2(np4.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(np4.o r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof np4.n
            if (r0 == 0) goto L13
            r0 = r13
            np4.n r0 = (np4.n) r0
            int r1 = r0.f218140w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218140w = r1
            goto L18
        L13:
            np4.n r0 = new np4.n
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218140w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto L6b
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            al4.d r13 = r12.o
            com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData r2 = r12.f218142q
            java.lang.String r5 = r2.f69025a
            java.lang.String r2 = r2.f69026b
            el4.g r6 = new el4.g
            el4.j r7 = new el4.j
            cli.y r8 = r12.f218143r
            java.lang.Object r8 = r8.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            np4.d r8 = (np4.d) r8
            dj0.d r8 = r8.f218131b
            if (r8 == 0) goto L57
            long r8 = r8.f115082a
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            goto L58
        L57:
            r10 = r4
        L58:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.<init>(r8, r10)
            r6.<init>(r4, r7, r4)
            r0.f218140w = r3
            om4.l r13 = (om4.l) r13
            java.lang.Object r13 = r13.e(r5, r2, r6, r0)
            if (r13 != r1) goto L6b
            return r1
        L6b:
            mii.k r5 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.credit.core.R$string.additional_cards_cardholders_details_settings_purchase_limit_set
            r0 = 14
            r7.<init>(r13, r4, r4, r0)
            r10 = 0
            r11 = 28
            java.lang.String r6 = "update_single_purchase_limit_success"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.Flow r7 = r12.X1(r5)
            np4.i r10 = new np4.i
            r13 = 2
            r10.<init>(r12, r4, r13)
            r11 = 3
            r6 = r12
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: np4.o.K2(np4.o, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f218143r;
    }
}
