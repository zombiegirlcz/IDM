package nhe;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.k1;
import rp0.l0;
import zhm.a1;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends pfe.c {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f215439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oqk.k f215440n;
    public final ahe.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ahe.t f215441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f215442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f215443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f215444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uge.e f215445t;
    public final f u;
    public final c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LargeActionButtonDelegate f215446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f215447x;

    public s(LinkedHashMap navigationHandlers, oqk.k transactionsWidgetActionExtension, ahe.n hiddenPlaceholdersRepository, ahe.t totalWealthInteractor, j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer, uge.e addNewProductDestinationFactory, f accountDetailsHandler, c0 apmHomeActionDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigationHandlers, "navigationHandlers");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(hiddenPlaceholdersRepository, "hiddenPlaceholdersRepository");
        Intrinsics.checkNotNullParameter(totalWealthInteractor, "totalWealthInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(addNewProductDestinationFactory, "addNewProductDestinationFactory");
        Intrinsics.checkNotNullParameter(accountDetailsHandler, "accountDetailsHandler");
        Intrinsics.checkNotNullParameter(apmHomeActionDestinationResolver, "apmHomeActionDestinationResolver");
        this.f215439m = navigationHandlers;
        this.f215440n = transactionsWidgetActionExtension;
        this.o = hiddenPlaceholdersRepository;
        this.f215441p = totalWealthInteractor;
        this.f215442q = bottomDialogExtension;
        this.f215443r = popupMenuDialogDisplayer;
        this.f215444s = shotDialogDisplayer;
        this.f215445t = addNewProductDestinationFactory;
        this.u = accountDetailsHandler;
        this.v = apmHomeActionDestinationResolver;
        this.f215446w = new LargeActionButtonDelegate();
        Set setI1 = d0.i1(navigationHandlers.values());
        yji.n[] elements = {transactionsWidgetActionExtension, accountDetailsHandler};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f215447x = a1.l(setI1, kotlin.collections.d.y0(elements));
    }

    @Override // yji.n
    public final void D2() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.f215446w;
        this.f215442q.d(u.c(largeActionButtonDelegate));
        yji.n.j2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new r(this, null), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.f215447x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r20v0, types: [nhe.s, yji.n] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aii.u] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(sfe.n r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nhe.k
            if (r0 == 0) goto L13
            r0 = r6
            nhe.k r0 = (nhe.k) r0
            int r1 = r0.f215428w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215428w = r1
            goto L18
        L13:
            nhe.k r0 = new nhe.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215428w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L70
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.f262423b
            boolean r6 = r5 instanceof sfe.x
            r2 = 0
            if (r6 == 0) goto L3c
            sfe.x r5 = (sfe.x) r5
            goto L3d
        L3c:
            r5 = r2
        L3d:
            if (r5 != 0) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L42:
            com.revolut.core.ui_kit.delegates.SmallStockCardDelegate$Model r5 = r5.f262435a
            java.lang.Object r5 = r5.f53388p
            boolean r6 = r5 instanceof mhe.i
            if (r6 == 0) goto L4d
            r2 = r5
            mhe.i r2 = (mhe.i) r2
        L4d:
            if (r2 != 0) goto L52
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L52:
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r5 = r2.f205557a
            yfe.a r5 = com.revolut.feature.tab.accounts.api.total_wealth.a.a(r5)
            java.util.LinkedHashMap r6 = r4.f215439m
            java.lang.Object r5 = r6.get(r5)
            yfe.c r5 = (yfe.c) r5
            if (r5 != 0) goto L65
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L65:
            yfe.h$a r6 = r2.f205558b
            r0.f215428w = r3
            java.lang.Object r5 = r5.Z2(r6, r0)
            if (r5 != r1) goto L70
            return r1
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.c3(sfe.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(sfe.n r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof nhe.l
            if (r0 == 0) goto L13
            r0 = r14
            nhe.l r0 = (nhe.l) r0
            int r1 = r0.f215429w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215429w = r1
            goto L18
        L13:
            nhe.l r0 = new nhe.l
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215429w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto L91
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            yhm.o.b(r14)
            java.lang.Object r13 = r13.f262423b
            boolean r14 = r13 instanceof com.revolut.core.ui_kit.models.popup.PopupMenuItem
            if (r14 == 0) goto L3c
            com.revolut.core.ui_kit.models.popup.PopupMenuItem r13 = (com.revolut.core.ui_kit.models.popup.PopupMenuItem) r13
            goto L3d
        L3c:
            r13 = r4
        L3d:
            if (r13 != 0) goto L42
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L42:
            java.lang.String r14 = r13.getF54961b()
            java.lang.String r2 = "total_wealth_hide_placeholder"
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r14 != 0) goto L51
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L51:
            java.lang.Object r13 = r13.getF54968n()
            boolean r14 = r13 instanceof com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey
            if (r14 == 0) goto L5c
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r13 = (com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey) r13
            goto L5d
        L5c:
            r13 = r4
        L5d:
            if (r13 != 0) goto L62
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L62:
            r0.f215429w = r3
            ahe.n r14 = r12.o
            ahe.q r14 = (ahe.q) r14
            mk0.a r14 = r14.f5024a
            java.lang.String r2 = "HOME_TOTAL_WEALTH_HIDDEN_PLACEHOLDERS"
            java.lang.Object r3 = kii.e.n(r2, r14)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L76
            zhm.f0 r3 = zhm.f0.f322471a
        L76:
            tk0.e r5 = new tk0.e
            r5.<init>(r2)
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String r13 = ahe.r.b(r13)
            java.util.ArrayList r13 = zhm.d0.F0(r13, r3)
            java.lang.Object r13 = r14.e(r5, r13, r0)
            if (r13 != r1) goto L8c
            goto L8e
        L8c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L8e:
            if (r13 != r1) goto L91
            return r1
        L91:
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a r5 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.tab.accounts.api.R$string.home_discover_item_hide_success_title
            r14 = 14
            r7.<init>(r13, r4, r4, r14)
            r10 = 0
            r11 = 60
            java.lang.String r6 = "total_wealth_hide_placeholder_success"
            r8 = 0
            r9 = 0
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r13 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.Companion.f(r5, r6, r7, r8, r9, r10, r11)
            rp0.k1 r14 = r12.f215444s
            r14.d(r13)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.d3(sfe.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(sfe.n r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nhe.m
            if (r0 == 0) goto L13
            r0 = r7
            nhe.m r0 = (nhe.m) r0
            int r1 = r0.f215430w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215430w = r1
            goto L18
        L13:
            nhe.m r0 = new nhe.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215430w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L8e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r6 = r6.f262423b
            boolean r7 = r6 instanceof mhe.k
            if (r7 == 0) goto L3b
            mhe.k r6 = (mhe.k) r6
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r6 != 0) goto L41
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L41:
            java.util.List r6 = r6.f205560a
            r0.f215430w = r3
            ahe.t r7 = r5.f215441p
            ahe.w0 r7 = (ahe.w0) r7
            ahe.f r7 = r7.f5050q
            ahe.j r7 = (ahe.j) r7
            mk0.a r7 = r7.f5005a
            tk0.e r2 = new tk0.e
            java.lang.String r3 = "HOME_TOTAL_WEALTH_TILE_ORDER"
            r2.<init>(r3)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r6, r4)
            r3.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r6.next()
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r4 = (com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey) r4
            java.lang.String r4 = ahe.r.b(r4)
            r3.add(r4)
            goto L67
        L7b:
            java.lang.Object r6 = r7.e(r2, r3, r0)
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto L84
            goto L86
        L84:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L86:
            if (r6 != r7) goto L89
            goto L8b
        L89:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L8b:
            if (r6 != r1) goto L8e
            return r1
        L8e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.e3(sfe.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(sfe.n r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.f3(sfe.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(sfe.n r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof nhe.o
            if (r0 == 0) goto L13
            r0 = r12
            nhe.o r0 = (nhe.o) r0
            int r1 = r0.f215433w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215433w = r1
            goto L18
        L13:
            nhe.o r0 = new nhe.o
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215433w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            r6 = r10
            goto L6b
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            java.lang.Object r11 = r11.f262423b
            boolean r12 = r11 instanceof com.revolut.core.ui_kit.delegates.SmallStockCardDelegate.Model
            r2 = 0
            if (r12 == 0) goto L3e
            com.revolut.core.ui_kit.delegates.SmallStockCardDelegate$Model r11 = (com.revolut.core.ui_kit.delegates.SmallStockCardDelegate.Model) r11
            r8 = r11
            goto L3f
        L3e:
            r8 = r2
        L3f:
            if (r8 != 0) goto L44
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L44:
            java.lang.Object r11 = r8.f53388p
            boolean r12 = r11 instanceof mhe.j
            if (r12 == 0) goto L4d
            r2 = r11
            mhe.j r2 = (mhe.j) r2
        L4d:
            r5 = r2
            if (r5 != 0) goto L53
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L53:
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r11 = r5.a()
            yfe.a r7 = com.revolut.feature.tab.accounts.api.total_wealth.a.a(r11)
            nhe.p r4 = new nhe.p
            r9 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f215433w = r3
            java.lang.Object r11 = r10.Y2(r0, r4)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.g3(sfe.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(sfe.n r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nhe.q
            if (r0 == 0) goto L13
            r0 = r6
            nhe.q r0 = (nhe.q) r0
            int r1 = r0.f215437w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215437w = r1
            goto L18
        L13:
            nhe.q r0 = new nhe.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215437w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.f262423b
            oqk.k r6 = r4.f215440n
            ssi.k r5 = r6.c3(r5)
            if (r5 == 0) goto L45
            r0.f215437w = r3
            java.lang.Object r5 = r6.Z2(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L45:
            r3 = 0
        L46:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.s.h3(sfe.n, gim.c):java.lang.Object");
    }
}
