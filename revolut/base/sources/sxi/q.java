package sxi;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;
import cu8.r0;
import dwi.b0;
import dwi.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sqd.h0;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends jki.g implements l {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f266515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f266516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AirportLoungeDetailsScreenContract$InputData f266517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uxi.a f266518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f266519t;
    public final r0 u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f266520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, b0 loungesInteractor, s loungePassesInteractor, AirportLoungeDetailsScreenContract$InputData inputData, uxi.a weeklyScheduleDialogBuilder, j60.a expandableDialogControllerExtension, r0 kycRequiredActionTransformer) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(loungesInteractor, "loungesInteractor");
        Intrinsics.checkNotNullParameter(loungePassesInteractor, "loungePassesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(weeklyScheduleDialogBuilder, "weeklyScheduleDialogBuilder");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f266515p = loungesInteractor;
        this.f266516q = loungePassesInteractor;
        this.f266517r = inputData;
        this.f266518s = weeklyScheduleDialogBuilder;
        this.f266519t = expandableDialogControllerExtension;
        this.u = kycRequiredActionTransformer;
        this.v = new g(new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)));
        this.f266520w = vkm.q.b(0, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(sxi.q r13, java.lang.String r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof sxi.o
            if (r0 == 0) goto L13
            r0 = r15
            sxi.o r0 = (sxi.o) r0
            int r1 = r0.f266513w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266513w = r1
            goto L18
        L13:
            sxi.o r0 = new sxi.o
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266513w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L41
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            dwi.b0 r15 = r13.f266515p
            pfm.r r14 = r15.a(r14)
            r0.f266513w = r3
            java.lang.Object r14 = nim.a.a(r14, r0)
            if (r14 != r1) goto L41
            return r1
        L41:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_saved_lounges_added_title
            r15 = 14
            r0 = 0
            r3.<init>(r14, r0, r0, r15)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart
            int r14 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = 108(0x6c, float:1.51E-43)
            java.lang.String r2 = "ID_SAVE_LOUNGE_DIALOG"
            r5 = r4
            r4 = 0
            mii.f r14 = te0.w.a(r2, r3, r4, r5, r6, r7, r8)
            r13.X1(r14)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sxi.q.y2(sxi.q, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(sxi.q r13, java.lang.String r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof sxi.p
            if (r0 == 0) goto L13
            r0 = r15
            sxi.p r0 = (sxi.p) r0
            int r1 = r0.f266514w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266514w = r1
            goto L18
        L13:
            sxi.p r0 = new sxi.p
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266514w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L41
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            dwi.b0 r15 = r13.f266515p
            pfm.r r14 = r15.d(r14)
            r0.f266514w = r3
            java.lang.Object r14 = nim.a.a(r14, r0)
            if (r14 != r1) goto L41
            return r1
        L41:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_saved_lounges_removed_title
            r15 = 14
            r0 = 0
            r3.<init>(r14, r0, r0, r15)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart_outline
            int r14 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = 108(0x6c, float:1.51E-43)
            java.lang.String r2 = "ID_SAVE_LOUNGE_DIALOG"
            r5 = r4
            r4 = 0
            mii.f r14 = te0.w.a(r2, r3, r4, r5, r6, r7, r8)
            r13.X1(r14)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sxi.q.z2(sxi.q, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f266520w, new s9b.n(continuation, this, 16)), null, null, new sek.q(this, continuation, 28), 3);
        l2(new h0(this, continuation, 5), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }
}
