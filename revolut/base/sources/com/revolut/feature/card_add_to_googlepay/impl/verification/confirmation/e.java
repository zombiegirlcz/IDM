package com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import o5l.g;
import oki.h;
import ow2.i;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements ow2.d {
    public final GooglePayConfirmationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f64494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gw2.c f64495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ha3.f f64496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f64497s;

    public e(n stateMapper, GooglePayConfirmationControllerContract$InputData inputData, f revolutCardsInteractor, gw2.c googlePayInteractor, ha3.f cardsConfigInteractor, c90.c uiResources) {
        g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(googlePayInteractor, "googlePayInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f64494p = revolutCardsInteractor;
        this.f64495q = googlePayInteractor;
        this.f64496r = cardsConfigInteractor;
        Data data = new Data(null, null, true, 3, null);
        int i = i.f230286a[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = g.MDPI;
        } else if (i == 2) {
            gVar = g.HDPI;
        } else if (i == 3) {
            gVar = g.XHDPI;
        } else if (i == 4) {
            gVar = g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.XXXHDPI;
        }
        boolean z = inputData instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation;
        this.f64497s = mra.d.b(this, new ow2.e(data, new Data(null, null, true, 3, null), gVar, z, z ? ((GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) inputData).f64491b : cw2.a.GOOGLE_PAY), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            r19 = this;
            r0 = r19
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData r1 = r0.o
            boolean r2 = r1 instanceof com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation
            r3 = 0
            if (r2 == 0) goto L2d
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$Confirmation r1 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation) r1
            boolean r2 = r1.f64489b
            java.lang.String r1 = r1.f64488a
            gw2.c r4 = r0.f64495q
            r4.getClass()
            java.lang.String r5 = "cardInfoEncodedBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            gw2.a r6 = r4.a(r1, r2)
            if (r6 == 0) goto L2b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            gw2.a r1 = r4.a(r1, r2)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.f147274b
            goto L35
        L2b:
            r1 = r3
            goto L35
        L2d:
            boolean r2 = r1 instanceof com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation
            if (r2 == 0) goto L8b
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$RevivalConfirmation r1 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) r1
            java.lang.String r1 = r1.f64490a
        L35:
            if (r1 == 0) goto L49
            oli.f r2 = new oli.f
            r4 = 26
            r2.<init>(r0, r1, r3, r4)
            yi5.b r1 = new yi5.b
            r3 = 26
            r1.<init>(r3)
            r0.l2(r2, r1)
            return
        L49:
            nii.y0 r1 = new nii.y0
            nii.z r4 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.card_add_to_googlepay.impl.R$string.google_pay_confirm_wrong_gp_params_dialog_title
            r6 = 14
            r5.<init>(r2, r3, r3, r6)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.card_add_to_googlepay.impl.R$string.google_pay_confirm_wrong_gp_params_dialog_message
            r2.<init>(r7, r3, r3, r6)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.card_add_to_googlepay.impl.R$string.google_pay_confirm_wrong_gp_params_dialog_ok_button
            r7.<init>(r8, r3, r3, r6)
            r17 = 0
            r18 = 32756(0x7ff4, float:4.5901E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 0
            r5 = 5
            r1.<init>(r3, r4, r2, r5)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.d r4 = new com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.d
            r4.<init>(r0, r3)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            return
        L8b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e.I1():void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f64497s;
    }
}
