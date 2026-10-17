package i4a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9e.a f158319a;

    public d(g9e.a subscriptionPresentationModel) {
        Intrinsics.checkNotNullParameter(subscriptionPresentationModel, "subscriptionPresentationModel");
        this.f158319a = subscriptionPresentationModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof i4a.c
            if (r0 == 0) goto L13
            r0 = r13
            i4a.c r0 = (i4a.c) r0
            int r1 = r0.f158318w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158318w = r1
            goto L18
        L13:
            i4a.c r0 = new i4a.c
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158318w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L52
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            yhm.o.b(r13)
            r0.f158318w = r3
            g9e.a r13 = r12.f158319a
            kce.q r13 = (kce.q) r13
            mk0.a r13 = r13.f182716j
            tk0.b r0 = new tk0.b
            java.lang.String r2 = "SCHEDULED_TOOLTIP_SHOWED_KEY"
            r0.<init>(r2)
            java.lang.Object r13 = r13.a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            if (r13 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r0 = 0
            if (r13 == 0) goto L5c
            return r0
        L5c:
            java.lang.String r13 = "id"
            java.lang.String r1 = "ID_MENU_ITEM_SCHEDULED"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r13)
            com.revolut.core.ui_kit.models.AppTipUIModel r2 = new com.revolut.core.ui_kit.models.AppTipUIModel
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_new_tip_text
            r3 = 14
            r5.<init>(r13, r0, r0, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_new_tip_subtitle
            r6.<init>(r13, r0, r0, r3)
            aw0.s r7 = new aw0.s
            int r13 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_lightbulb
            com.revolut.core.ui_kit_core.displayers.image.Image r13 = h5k.a.b(r13)
            r7.<init>(r13)
            r10 = 0
            r11 = 994(0x3e2, float:1.393E-42)
            java.lang.String r3 = "SCHEDULE_TOOLTIP_ID"
            r4 = 0
            r8 = 0
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            i4a.b r13 = new i4a.b
            com.revolut.core.ui_kit.utils.ListIdTarget r0 = new com.revolut.core.ui_kit.utils.ListIdTarget
            r0.<init>(r1)
            r13.<init>(r0, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i4a.d.a(gim.c):java.lang.Object");
    }
}
