package nof;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.transactions.impl.R$plurals;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.y6;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends h {
    @Override // nof.h
    public final boolean a(a3 currentTransaction) {
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        return currentTransaction.e == y6.TRANSFER;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    @Override // nof.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tof.q7 c(tof.a3 r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nof.n.c(tof.a3):tof.q7");
    }

    @Override // nof.h
    public final List d(g gVar, boolean z) {
        f statistics = (f) gVar;
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        dj0.d dVar = statistics.f218032b;
        int i = statistics.f218031a;
        dj0.d dVar2 = statistics.f218033c;
        CellDetailsDelegate.Model model = dVar != null ? new CellDetailsDelegate.Model("ID_STATS_TOTAL_SENT", new TextLocalisedClause(R$string.transaction_statistics_section_total_sent, null, null, 14), sx4.f.b(3, null, null, dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        CellDetailsDelegate.Model model2 = dVar2 != null ? new CellDetailsDelegate.Model("ID_STATS_TOTAL_RECEIVED", new TextLocalisedClause(R$string.transaction_statistics_section_total_received, null, null, 14), sx4.f.b(3, null, null, dVar2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.transaction_details_statistics_see_all, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
        TextClause textClause = new TextClause(statistics.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause[] elements = {dVar != null ? new TextLocalisedClause(R$string.transaction_statistics_list_sent, u.c(sx4.f.b(3, null, null, dVar)), null, 12) : null, dVar2 != null ? new TextLocalisedClause(R$string.transaction_statistics_list_received, u.c(sx4.f.b(3, null, null, dVar2)), null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        qv0.i[] elements2 = {model, model2, h.b(textLocalisedQuantityClause, textClause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), statistics.e)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = kotlin.collections.d.L(elements2);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // nof.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.data.model.Data e(tof.a3 r11, int r12, dj0.d r13, dj0.d r14, tof.i7 r15) {
        /*
            r10 = this;
            java.lang.String r0 = "currentTransaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "sentAmount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "receivedAmount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            tof.q r0 = r11.f272597k0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.String r3 = r0.f273000a
            java.lang.String r0 = r0.f273001b
            java.lang.String r4 = " "
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_face.a.o(r3, r4, r0)
            if (r0 == 0) goto L34
            boolean r3 = kotlin.text.d0.W(r0)
            if (r3 != 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L31
            goto L34
        L31:
            r8 = r0
            goto L94
        L34:
            tof.x6 r0 = r11.I
            tof.e3 r0 = r0.d
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.f272728c
            if (r0 == 0) goto L45
            boolean r3 = kotlin.text.d0.W(r0)
            if (r3 != 0) goto L45
            goto L46
        L45:
            r0 = r2
        L46:
            if (r0 != 0) goto L31
            tof.z6 r0 = k71.k.l0(r11)
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.c()
            if (r0 == 0) goto L5b
            boolean r3 = kotlin.text.d0.W(r0)
            if (r3 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r2
        L5c:
            if (r0 != 0) goto L31
            tof.i5 r0 = r11.Z
            if (r0 == 0) goto L75
            java.util.List r0 = r0.f272802b
            if (r0 == 0) goto L75
            java.lang.Object r0 = zhm.d0.e0(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L75
            boolean r3 = kotlin.text.d0.W(r0)
            if (r3 != 0) goto L75
            goto L76
        L75:
            r0 = r2
        L76:
            if (r0 != 0) goto L31
            java.lang.String r11 = r11.f272609r
            if (r11 == 0) goto L86
            boolean r0 = kotlin.text.d0.W(r11)
            if (r0 != 0) goto L83
            goto L84
        L83:
            r11 = r2
        L84:
            r0 = r11
            goto L87
        L86:
            r0 = r2
        L87:
            if (r0 != 0) goto L31
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L94:
            dj0.d r11 = dj0.d.e
            boolean r0 = r13.f(r11)
            if (r0 == 0) goto L9e
            r6 = r13
            goto L9f
        L9e:
            r6 = r2
        L9f:
            boolean r11 = r14.f(r11)
            if (r11 == 0) goto La7
            r7 = r14
            goto La8
        La7:
            r7 = r2
        La8:
            nof.f r4 = new nof.f
            r5 = r12
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            com.revolut.data.model.Data r11 = zi0.c.P(r4, r1, r2, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nof.n.e(tof.a3, int, dj0.d, dj0.d, tof.i7):com.revolut.data.model.Data");
    }
}
