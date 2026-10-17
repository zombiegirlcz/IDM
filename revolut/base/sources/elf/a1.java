package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends yji.n implements s0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bmf.b f127292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xua.a f127293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.h0 f127294n;
    public final klf.m1 o;

    public a1(bmf.b modalFactory, xua.a recurringPaymentInteractor, klf.h0 commonDataSource, klf.m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f127292l = modalFactory;
        this.f127293m = recurringPaymentInteractor;
        this.f127294n = commonDataSource;
        this.o = juniorDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof elf.z0
            if (r2 == 0) goto L17
            r2 = r1
            elf.z0 r2 = (elf.z0) r2
            int r3 = r2.f127442w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f127442w = r3
            goto L1c
        L17:
            elf.z0 r2 = new elf.z0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f127442w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L49
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            klf.m1 r1 = r0.o
            kotlin.Lazy r1 = r1.f185532g
            java.lang.Object r1 = r1.getValue()
            kotlinx.coroutines.flow.SharedFlow r1 = (kotlinx.coroutines.flow.SharedFlow) r1
            r2.f127442w = r5
            java.lang.Object r1 = vkm.q.x(r1, r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r1 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r1
            r2 = 14
            r3 = 0
            if (r1 == 0) goto L61
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.transactions.impl.R$string.subscriptions_junior_add_dialog_subtitle
            java.lang.String r1 = r1.f77099b
            java.util.List r1 = zhm.u.c(r1)
            r6 = 12
            r4.<init>(r5, r1, r3, r6)
        L5f:
            r7 = r4
            goto L69
        L61:
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.subscriptions_add_dialog_subtitle
            r4.<init>(r1, r3, r3, r2)
            goto L5f
        L69:
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.subscriptions_add_dialog_title
            r6.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.transaction_details_subscriptions_confirmation_modal_button_negative
            r8.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cross
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.transaction_details_subscriptions_confirmation_modal_button_positive
            r10.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r11 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r12 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_check
            r18 = 0
            r19 = 254(0xfe, float:3.56E-43)
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r12 = 400(0x190, float:5.6E-43)
            bmf.b r5 = r0.f127292l
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r1 = bmf.a.b(r5, r6, r7, r8, r9, r10, r11, r12)
            ei8.d r2 = new ei8.d
            r3 = 13
            r2.<init>(r0, r3)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r3 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r0.N2(r1, r3, r2)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.a1.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_MENU_ITEM_MARK_AS_SUBSCRIPTION") ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
