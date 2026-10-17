package f7i;

import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyAutomationScreenContract$InputData f132625a;

    public d(MoveMoneyAutomationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f132625a = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip a(java.lang.String r9, c7i.o r10, h7i.k r11) {
        /*
            boolean r0 = r10 instanceof c7i.m
            if (r0 == 0) goto L35
            com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip r1 = new com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip
            c7i.m r10 = (c7i.m) r10
            com.revolut.feature_move_money.api.model.AccountWrapper r10 = r10.f22014a
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r10.f97226c
            com.revolut.core.ui_kit.models.Clause r4 = r10.f97225b
            if (r11 == 0) goto L2a
            boolean r0 = r11 instanceof h7i.a
            if (r0 == 0) goto L23
            h7i.a r11 = (h7i.a) r11
            com.revolut.feature_move_money.api.model.AccountWrapper r11 = r11.getAccount()
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r11, r10)
            if (r10 == 0) goto L23
            ip0.gc r10 = ip0.gc.ERROR
            goto L25
        L23:
            ip0.gc r10 = ip0.gc.ACTIVE
        L25:
            if (r10 != 0) goto L28
            goto L2a
        L28:
            r5 = r10
            goto L2d
        L2a:
            ip0.gc r10 = ip0.gc.ACTIVE
            goto L28
        L2d:
            r6 = 0
            r7 = 48
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L35:
            r2 = r9
            boolean r9 = r10 instanceof c7i.n
            if (r9 == 0) goto L50
            r3 = r2
            com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip r2 = new com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r9 = com.revolut.feature_move_money.impl.R$string.move_money_automation_set_automation_source_select
            r10 = 14
            r11 = 0
            r5.<init>(r9, r11, r11, r10)
            r7 = 0
            r8 = 58
            r4 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L50:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f7i.d.a(java.lang.String, c7i.o, h7i.k):com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip");
    }
}
