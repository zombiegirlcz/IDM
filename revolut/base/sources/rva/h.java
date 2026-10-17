package rva;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.recurringbuys.api.R$string;
import ix0.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import ru5.m;
import ru6.r;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f257740a;

    public h(whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f257740a = transactionsListMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.ListSubheaderDelegate.Model a(tva.a r21) {
        /*
            r0 = r21
            r1 = 0
            if (r0 == 0) goto L9
            dj0.d r0 = r0.f274739a
            r3 = r0
            goto La
        L9:
            r3 = r1
        La:
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_details_transactions_title
            r4 = 14
            r0.<init>(r2, r1, r1, r4)
            if (r3 == 0) goto L31
            boolean r2 = r3.k()
            if (r2 != 0) goto L1c
            r1 = r3
        L1c:
            if (r1 == 0) goto L31
            com.revolut.core.ui_kit.models.MoneyClause r2 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r4 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r8 = 0
            r9 = 15
            r5 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r7 = 12
            r2.<init>(r3, r4, r5, r6, r7)
            goto L45
        L31:
            com.revolut.core.ui_kit.models.TextClause r3 = new com.revolut.core.ui_kit.models.TextClause
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r1)
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r3
        L45:
            r9 = r2
            com.revolut.core.ui_kit.models.Clause r9 = (com.revolut.core.ui_kit.models.Clause) r9
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r4 = new com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model
            java.lang.String r5 = "TRANSACTIONS_HEADER_ITEM_LIST_ID"
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 65514(0xffea, float:9.1805E-41)
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rva.h.a(tva.a):com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model");
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f257734a, new r(this, 8), new m(10), new ri4.o(this, 13));
        xi0.b bVar = domainState.f257735b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_recurringbuy, null, null, 14);
        m70.a.t(t0.f186434a);
        return new c(new CompositeClause(v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d0.a(bVar, null)), null, null, null, 14), list);
    }
}
