package e4k;

import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankTransferAmountScreen f122602b;

    public /* synthetic */ h(BankTransferAmountScreen bankTransferAmountScreen, int i) {
        this.f122601a = i;
        this.f122602b = bankTransferAmountScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f122601a
            java.lang.String r2 = "field"
            java.lang.String r3 = "data"
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen r4 = r0.f122602b
            switch(r1) {
                case 0: goto L46;
                default: goto Ld;
            }
        Ld:
            r1 = r20
            com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model r1 = (com.revolut.core.ui_kit.delegates.CenteredAmountDelegate.Model) r1
            r5 = r21
            com.revolut.core.ui_kit.views.CenteredAmountView r5 = (com.revolut.core.ui_kit.views.CenteredAmountView) r5
            kotlin.reflect.KProperty[] r6 = com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen.f102060r0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            zp0.d r7 = new zp0.d
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r8 = r5.getEditText()
            java.lang.Object r1 = r1.f51981p
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            yof.b r1 = (yof.b) r1
            xi0.b r9 = r1.f315672a
            java.lang.Object r1 = r4.f102062b0
            java.lang.Object r1 = r1.getValue()
            r10 = r1
            u80.d r10 = (u80.d) r10
            r17 = 0
            r18 = 1944(0x798, float:2.724E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        L46:
            r1 = r20
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r1 = (com.revolut.core.ui_kit.delegates.InputTextDelegate.Model) r1
            r5 = r21
            com.revolut.core.ui_kit.views.input.InputText r5 = (com.revolut.core.ui_kit.views.input.InputText) r5
            kotlin.reflect.KProperty[] r6 = com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen.f102060r0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.Object r2 = r1.P
            boolean r3 = r2 instanceof com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig
            r6 = 0
            if (r3 == 0) goto L63
            com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig r2 = (com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig) r2
            java.lang.String r2 = r2.f92270b
        L61:
            r10 = r2
            goto L6d
        L63:
            boolean r3 = r2 instanceof com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper.StructuredReferenceItemsMapper$ReferenceMaskConfig
            if (r3 == 0) goto L6c
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper.StructuredReferenceItemsMapper$ReferenceMaskConfig r2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper.StructuredReferenceItemsMapper$ReferenceMaskConfig) r2
            java.lang.String r2 = r2.f102091b
            goto L61
        L6c:
            r10 = r6
        L6d:
            if (r10 == 0) goto L90
            java.lang.String r2 = i4k.o.a(r1, r10)
            java.lang.String r12 = r1.f52580a
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r8 = r5.getInnerEditText()
            if (r2 == 0) goto L7f
            android.text.method.DigitsKeyListener r6 = android.text.method.DigitsKeyListener.getInstance(r2)
        L7f:
            r13 = r6
            abf.c r11 = new abf.c
            r2 = 21
            r11.<init>(r4, r1, r2)
            zp0.y r7 = new zp0.y
            r14 = 1
            r15 = 2
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r6 = r7
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e4k.h.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
