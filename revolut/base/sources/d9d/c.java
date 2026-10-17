package d9d;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.shared.help_centre.impl.R$string;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f112361a;

    public c(i sharedHelpRecurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(sharedHelpRecurringPaymentInteractor, "sharedHelpRecurringPaymentInteractor");
        this.f112361a = sharedHelpRecurringPaymentInteractor;
    }

    public static y a(String str, TextClause textClause, String str2, TextClause textClause2, TextClause textClause3) {
        String str3 = null;
        return new y(u.c(new um0(str, new tm0(LargeActionButton.ButtonStyle.f58726b, null, textClause2, false, null, str3, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, textClause3, false, str3, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 28), null, null, null, null, str, null, null, null, 3836);
    }

    public static z b() {
        return new z(new CompositeClause(v.k(new TextLocalisedClause(R$string.help_center_common_error_title, null, null, 14), new TextLocalisedClause(R$string.help_center_common_error_action_try_again, null, null, 14)), new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r6.t(r26, r4) == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r25, qua.p r26, gim.c r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r3 instanceof d9d.b
            if (r4 == 0) goto L1b
            r4 = r3
            d9d.b r4 = (d9d.b) r4
            int r5 = r4.f112360w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f112360w = r5
            goto L20
        L1b:
            d9d.b r4 = new d9d.b
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.u
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f112360w
            r7 = 14
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L41
            if (r6 == r9) goto L3d
            if (r6 != r8) goto L35
            yhm.o.b(r3)     // Catch: java.lang.Exception -> Lb5
            goto L8f
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            yhm.o.b(r3)     // Catch: java.lang.Exception -> Lb5
            goto L5e
        L41:
            yhm.o.b(r3)
            if (r2 != 0) goto L4b
            nii.z r1 = b()
            return r1
        L4b:
            java.lang.String r3 = "confirm_block_id"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r1, r3)     // Catch: java.lang.Exception -> Lb5
            kgm.i r6 = r0.f112361a
            if (r3 == 0) goto L7e
            r4.f112360w = r9     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r1 = r6.c(r2, r4)     // Catch: java.lang.Exception -> Lb5
            if (r1 != r5) goto L5e
            goto L8e
        L5e:
            nii.j0 r11 = new nii.j0     // Catch: java.lang.Exception -> Lb5
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Exception -> Lb5
            int r1 = com.revolut.feature.shared.help_centre.impl.R$string.help_center_troubleshooting_recurring_payment_blocked     // Catch: java.lang.Exception -> Lb5
            r12.<init>(r1, r10, r10, r7)     // Catch: java.lang.Exception -> Lb5
            r22 = 0
            r23 = 4094(0xffe, float:5.737E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Exception -> Lb5
            return r11
        L7e:
            java.lang.String r3 = "confirm_unblock_id"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto Laf
            r4.f112360w = r8     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r1 = r6.t(r2, r4)     // Catch: java.lang.Exception -> Lb5
            if (r1 != r5) goto L8f
        L8e:
            return r5
        L8f:
            nii.j0 r11 = new nii.j0     // Catch: java.lang.Exception -> Lb5
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Exception -> Lb5
            int r1 = com.revolut.feature.shared.help_centre.impl.R$string.help_center_troubleshooting_recurring_payment_unblocked     // Catch: java.lang.Exception -> Lb5
            r12.<init>(r1, r10, r10, r7)     // Catch: java.lang.Exception -> Lb5
            r22 = 0
            r23 = 4094(0xffe, float:5.737E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Exception -> Lb5
            return r11
        Laf:
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError     // Catch: java.lang.Exception -> Lb5
            r1.<init>(r10, r9, r10)     // Catch: java.lang.Exception -> Lb5
            throw r1     // Catch: java.lang.Exception -> Lb5
        Lb5:
            nii.z r1 = b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d9d.c.c(java.lang.String, qua.p, gim.c):java.lang.Object");
    }
}
