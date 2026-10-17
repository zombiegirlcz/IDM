package tal;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.shared.feature.suspicious_transaction.api.models.ActionButton;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.TransactionCell;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements e {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static b d(ActionButton actionButton, boolean z) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        TextClause textClause = new TextClause(actionButton.f104901b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = g.f269370a[actionButton.f104900a.ordinal()];
        if (i == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return new b(textClause, defaultFilledButton, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tal.a a(com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "screen"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.SimpleWarning
            r2 = 0
            if (r1 == 0) goto L13
            r1 = r0
            com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog$Screen$SimpleWarning r1 = (com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.SimpleWarning) r1
            java.lang.String r1 = r1.e
        L11:
            r4 = r1
            goto L32
        L13:
            boolean r1 = r0 instanceof com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.CircleWarning
            if (r1 == 0) goto L1d
            r1 = r0
            com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog$Screen$CircleWarning r1 = (com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.CircleWarning) r1
            java.lang.String r1 = r1.e
            goto L11
        L1d:
            boolean r1 = r0 instanceof com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.Cancel
            if (r1 == 0) goto L27
            r1 = r0
            com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog$Screen$Cancel r1 = (com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.Cancel) r1
            java.lang.String r1 = r1.e
            goto L11
        L27:
            boolean r1 = r0 instanceof com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.RiskAgreement
            if (r1 == 0) goto L2d
        L2b:
            r4 = r2
            goto L32
        L2d:
            boolean r1 = r0 instanceof com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen.SimpleConfirmation
            if (r1 == 0) goto La9
            goto L2b
        L32:
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r6 = r0.getF104964a()
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1 = r5
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r6 = r0.getF104964a()
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r11 = r5
            if (r4 == 0) goto L5d
            com.revolut.core.ui_kit.models.TextClause r3 = new com.revolut.core.ui_kit.models.TextClause
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r8 = r3
            goto L5e
        L5d:
            r8 = r2
        L5e:
            r3 = 1
            if (r4 == 0) goto L6a
            boolean r4 = kotlin.text.d0.W(r4)
            if (r4 == 0) goto L68
            goto L6a
        L68:
            r4 = 0
            goto L6b
        L6a:
            r4 = r3
        L6b:
            r9 = r4 ^ 1
            java.lang.String r13 = r0.getF104965b()
            if (r13 == 0) goto L99
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r12 = new com.revolut.core.ui_kit_core.displayers.image.models.UrlImage
            r29 = 0
            r30 = 524286(0x7fffe, float:7.34681E-40)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12.<init>(r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r10 = r12
            goto L9a
        L99:
            r10 = r2
        L9a:
            int r0 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrow_thin_left
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            tal.a r5 = new tal.a
            r6 = r1
            r7 = r11
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        La9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tal.f.a(com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog$Screen):tal.a");
    }

    public final c b(SuspiciousTransactionDialog.Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ActionButton actionButton = (ActionButton) d0.e0(0, screen.b());
        if (actionButton == null) {
            return null;
        }
        b bVarD = d(actionButton, z);
        ActionButton actionButton2 = (ActionButton) d0.e0(1, screen.b());
        return new c(bVarD, true, actionButton2 != null ? d(actionButton2, true) : null);
    }

    public final RowDelegate.Model c(TransactionCell transactionCell) {
        Intrinsics.checkNotNullParameter(transactionCell, "transactionCell");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UserAvatarImage(new UserNamePlaceholder.Default(transactionCell.f104978a, 0), null, null, 6), null, null, false, null, false, 62);
        TextClause textClause = new TextClause(transactionCell.f104979b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Long l2 = transactionCell.f104980c;
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_TRANSACTION", image40, textClause, null, 0, l2 != null ? new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(0), null, null, 12) : null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(transactionCell.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
