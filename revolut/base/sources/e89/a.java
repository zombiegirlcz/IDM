package e89;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitleAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.tracking.v3.HomeContext;
import io3.d;
import io3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pyd.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements y79.a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.CompositeClause d(dj0.d r21) {
        /*
            r1 = r21
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L15
            dj0.c r0 = dj0.d.Companion
            r0.getClass()
            dj0.d r0 = dj0.d.e
            boolean r0 = r1.f(r0)
            if (r0 != r7) goto L15
            r8 = r7
            goto L16
        L15:
            r8 = r6
        L16:
            com.revolut.core.ui_kit.models.CompositeClause r9 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r11 = com.revolut.feature.on_hold.accounts.impl.R$string.home_account_restricted_subtitle
            com.revolut.core.ui_kit.models.MoneyClause r0 = new com.revolut.core.ui_kit.models.MoneyClause
            r12 = 0
            if (r1 != 0) goto L22
            goto L77
        L22:
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r2 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r17 = 0
            r18 = 15
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r4 = 0
            r5 = 12
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = zhm.u.c(r0)
            r1 = 12
            r10.<init>(r11, r0, r12, r1)
            com.revolut.core.ui_kit.models.ImageClause r13 = new com.revolut.core.ui_kit.models.ImageClause
            int r14 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_lock_closed
            r17 = 0
            r18 = 28
            com.revolut.core.ui_kit.models.ImageClauseTint$TextColor r15 = com.revolut.core.ui_kit.models.ImageClauseTint.TextColor.f57790a
            r16 = 0
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 2
            com.revolut.core.ui_kit.models.Clause[] r0 = new com.revolut.core.ui_kit.models.Clause[r0]
            r0[r6] = r10
            r0[r7] = r13
            java.util.List r1 = zhm.v.k(r0)
            com.revolut.core.ui_kit.models.TextClause r2 = new com.revolut.core.ui_kit.models.TextClause
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.t(r0)
            r19 = 0
            r20 = 126(0x7e, float:1.77E-43)
            java.lang.String r14 = " "
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L77
            return r0
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e89.a.d(dj0.d):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public final ProductAccountSubtitle.Clickable a(d sourcePocket, List onHoldAccounts) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Iterator it8 = onHoldAccounts.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (d0.J(((z79.a) next).f319951b.d, sourcePocket.f163145a, false)) {
                break;
            }
        }
        z79.a aVar = (z79.a) next;
        d dVar = aVar != null ? aVar.f319951b : null;
        CompositeClause compositeClauseD = d(dVar != null ? h.e(dVar) : null);
        if (compositeClauseD == null || dVar == null || (str = dVar.f163145a) == null) {
            return null;
        }
        ProductAccountSubtitleAction.SwitchToAccountIdAction switchToAccountIdAction = new ProductAccountSubtitleAction.SwitchToAccountIdAction(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.ON_HOLD));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        HomeContext.a aVarNewBuilder = HomeContext.newBuilder();
        aVarNewBuilder.c();
        ((HomeContext) aVarNewBuilder.f49761b).setDestinationPocketId(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new ProductAccountSubtitle.Clickable(compositeClauseD, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), switchToAccountIdAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle.Clickable b(java.util.List r14, xi0.b r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e89.a.b(java.util.List, xi0.b):com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle$Clickable");
    }

    public final ProductAccountSubtitle.Text c(List onHoldAccounts) {
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : onHoldAccounts) {
            if (cp5.d.A(h.e(((z79.a) obj2).f319951b).f115083b)) {
                arrayList.add(obj2);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.d;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            dj0.d dVar = ((z79.a) it8.next()).f319952c;
            if (dVar == null) {
                dj0.d.Companion.getClass();
                dVar = dj0.d.e;
            }
            dVarO = c.O(dVarO, dVar);
        }
        CompositeClause compositeClauseD = d(dVarO);
        if (compositeClauseD != null) {
            return new ProductAccountSubtitle.Text(compositeClauseD, null);
        }
        return null;
    }
}
