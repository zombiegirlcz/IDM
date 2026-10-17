package i5k;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f158847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f158848m;

    public d(h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f158847l = systemTimeProvider;
        this.f158848m = q.c(0L);
    }

    @Override // yji.n
    public final void D2() {
        Z2();
    }

    @Override // i5k.a
    public final void Z2() {
        this.f158847l.getClass();
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        j2 j2Var = this.f158848m;
        j2Var.getClass();
        j2Var.g(null, lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // i5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(boolean r17, boolean r18, boolean r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof i5k.c
            if (r2 == 0) goto L17
            r2 = r1
            i5k.c r2 = (i5k.c) r2
            int r3 = r2.f158846w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f158846w = r3
            goto L1c
        L17:
            i5k.c r2 = new i5k.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f158846w
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto La8
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            if (r19 == 0) goto L5d
            vkm.j2 r1 = r0.f158848m
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L4c
            goto L5d
        L4c:
            l80.h r1 = r0.f158847l
            r1.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            r6 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L5d
            goto Laa
        L5d:
            if (r17 == 0) goto L60
            goto Laa
        L60:
            if (r20 == 0) goto L66
            r1 = 2131961868(0x7f13280c, float:1.9560445E38)
            goto L69
        L66:
            r1 = 2131961928(0x7f132848, float:1.9560567E38)
        L69:
            nii.y0 r4 = new nii.y0
            nii.l0 r6 = new nii.l0
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.retail.feature.payments.core.R$string.payments_app_fraud_warning_confirmation_dialog_title
            r9 = 0
            r10 = 14
            r7.<init>(r8, r9, r9, r10)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r11 = com.revolut.retail.feature.payments.core.R$string.payments_app_fraud_warning_confirmation_dialog_subtitle
            r8.<init>(r11, r9, r9, r10)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r11.<init>(r1, r9, r9, r10)
            r1 = r11
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.retail.feature.payments.core.R$string.payments_core_app_fraud_warning_action_decline
            r11.<init>(r12, r9, r9, r10)
            r14 = 0
            r15 = 996(0x3e4, float:1.396E-42)
            r12 = 0
            r13 = 0
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 0
            r7 = 4
            java.lang.String r8 = "APP_FRAUD_DIALOG_ID"
            r4.<init>(r8, r6, r1, r7)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r4)
            r2.f158846w = r5
            java.lang.Object r1 = vkm.q.x(r1, r2)
            if (r1 != r3) goto La8
            return r3
        La8:
            boolean r5 = r1 instanceof nii.l1
        Laa:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5k.d.b3(boolean, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
