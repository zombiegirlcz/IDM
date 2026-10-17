package nof;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.data.model.Data;
import com.revolut.feature.transactions.impl.R$plurals;
import com.revolut.feature.transactions.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tof.a3;
import tof.i7;
import tof.w4;
import tof.w6;
import tof.y2;
import tof.y6;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f218021a;

    public b(thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f218021a = transactionTextResourcesMapper;
    }

    @Override // nof.h
    public final boolean a(a3 currentTransaction) {
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        return currentTransaction.e == y6.TOPUP;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // nof.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tof.q7 c(tof.a3 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "currentTransaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            tof.i7$c r0 = tof.i7.Companion
            tof.w6 r1 = r11.f272602n0
            r2 = 0
            if (r1 == 0) goto La6
            tof.ac r3 = new tof.ac
            r3.<init>(r1)
            java.util.Set r1 = k71.k.f181789a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            tof.y2 r1 = r11.f272604o0
            tof.y2 r4 = tof.y2.APPLE_PAY
            r5 = 1
            r6 = 0
            r7 = 2
            if (r1 != r4) goto L27
            tof.zb r1 = new tof.zb
            r1.<init>(r4)
            goto L88
        L27:
            boolean r1 = k71.k.D(r11)
            if (r1 != 0) goto L76
            boolean r1 = k71.k.c(r11)
            if (r1 == 0) goto L34
            goto L76
        L34:
            tof.w6 r1 = r11.f272602n0
            tof.w6 r4 = tof.w6.EXTERNAL_CARD
            if (r1 != r4) goto L6b
            tof.w4 r1 = r11.p0
            if (r1 == 0) goto L69
            java.lang.String r1 = r1.f273142b
            if (r1 == 0) goto L69
            tof.z7 r4 = new tof.z7
            r4.<init>(r1)
            tof.e9 r8 = new tof.e9
            java.lang.String r9 = "Top-Up by *"
            java.lang.String r1 = r9.concat(r1)
            r8.<init>(r1)
            tof.i7[] r1 = new tof.i7[r7]
            r1[r6] = r4
            r1[r5] = r8
            r0.getClass()
            tof.oa r1 = tof.i7.c.b(r1)
            tof.zb r4 = new tof.zb
            r4.<init>(r2)
            tof.i7 r1 = tof.fc.a(r1, r4)
            goto L88
        L69:
            r1 = r2
            goto L88
        L6b:
            java.lang.String r1 = r11.f272609r
            if (r1 == 0) goto L69
            tof.e9 r4 = new tof.e9
            r4.<init>(r1)
            r1 = r4
            goto L88
        L76:
            tof.zb r1 = new tof.zb
            tof.y2 r4 = tof.y2.GOOGLE_PAY
            r1.<init>(r4)
            tof.zb r4 = new tof.zb
            tof.y2 r8 = tof.y2.ANDROID_PAY
            r4.<init>(r8)
            tof.i7 r1 = tof.fc.c(r1, r4)
        L88:
            if (r1 != 0) goto L8b
            goto La6
        L8b:
            tof.y6 r11 = r11.e
            tof.y6[] r11 = new tof.y6[]{r11}
            r0.getClass()
            tof.cc r11 = tof.i7.c.d(r11)
            r0 = 3
            tof.i7[] r0 = new tof.i7[r0]
            r0[r6] = r3
            r0[r5] = r1
            r0[r7] = r11
            tof.q7 r11 = tof.i7.c.a(r0)
            return r11
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nof.b.c(tof.a3):tof.q7");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // nof.h
    public final List d(g gVar, boolean z) {
        e statistics = (e) gVar;
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_statistics_section_total_received, null, null, 14);
        dj0.d dVar = statistics.f218029b;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_STATS_TOTAL_RECEIVED", textLocalisedClause, sx4.f.b(3, null, null, dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        int i = R$plurals.transaction_details_statistics_see_all;
        int i2 = statistics.f218028a;
        List listK = v.k(model, h.b(new TextLocalisedQuantityClause(i, Integer.valueOf(i2), u.c(Integer.valueOf(i2)), (Style) null, 24), statistics.f218030c, new TextLocalisedClause(R$string.transaction_statistics_list_received_in_total, u.c(sx4.f.b(3, null, null, dVar)), null, 12), statistics.d));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // nof.h
    public final Data e(a3 currentTransaction, int i, dj0.d sentAmount, dj0.d receivedAmount, i7 filter) {
        Clause textLocalisedClause;
        int i2;
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        Intrinsics.checkNotNullParameter(sentAmount, "sentAmount");
        Intrinsics.checkNotNullParameter(receivedAmount, "receivedAmount");
        Intrinsics.checkNotNullParameter(filter, "filter");
        dj0.d dVarH = pyd.c.H(receivedAmount, sentAmount);
        Set set = k71.k.f181789a;
        Intrinsics.checkNotNullParameter(currentTransaction, "<this>");
        boolean z = currentTransaction.f272604o0 == y2.APPLE_PAY;
        w4 w4Var = currentTransaction.p0;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.transaction_statistics_list_title_apple_pay, null, null, 14);
        } else {
            if (!k71.k.D(currentTransaction) && !k71.k.c(currentTransaction)) {
                if (currentTransaction.f272602n0 == w6.EXTERNAL_CARD) {
                    String str = w4Var != null ? w4Var.f273142b : null;
                    if (str != null && !d0.W(str)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.transaction_statistics_list_title_card_last_four, v.l(w4Var != null ? w4Var.f273142b : null), null, 12);
                    }
                }
                i2 = i;
                textLocalisedClause = new TextClause(thf.m.a(this.f218021a, currentTransaction, r0.g(), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return zi0.c.P(new e(i2, dVarH, textLocalisedClause, filter), false, null, 3);
            }
            textLocalisedClause = new TextLocalisedClause(R$string.transaction_statistics_list_title_google_pay, null, null, 14);
        }
        i2 = i;
        return zi0.c.P(new e(i2, dVarH, textLocalisedClause, filter), false, null, 3);
    }
}
