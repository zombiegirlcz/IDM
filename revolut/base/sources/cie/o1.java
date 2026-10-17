package cie;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 implements cli.n {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.d f24509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final itb.c f24510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f24511c;
    public final t d;
    public final gte.a e;
    public final rfe.m f;

    public o1(i49.a pendingActionsItemsProvider, mkd.d slotManagerFeedControllerModelExtension, die.b tabAccountsActionsProvider, u multiAccountUiUtils, itb.c headerUiProvider, c0 tabAccountsNavBarProductIntroProvider, a0 tabAccountMainTextProvider, t floatingButtonConfigMapper, gte.a featureToggleInteractor, rfe.m analyticsScreenNameProvider) {
        Intrinsics.checkNotNullParameter(pendingActionsItemsProvider, "pendingActionsItemsProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(tabAccountsActionsProvider, "tabAccountsActionsProvider");
        Intrinsics.checkNotNullParameter(multiAccountUiUtils, "multiAccountUiUtils");
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        Intrinsics.checkNotNullParameter(tabAccountsNavBarProductIntroProvider, "tabAccountsNavBarProductIntroProvider");
        Intrinsics.checkNotNullParameter(tabAccountMainTextProvider, "tabAccountMainTextProvider");
        Intrinsics.checkNotNullParameter(floatingButtonConfigMapper, "floatingButtonConfigMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(analyticsScreenNameProvider, "analyticsScreenNameProvider");
        this.f24509a = slotManagerFeedControllerModelExtension;
        this.f24510b = headerUiProvider;
        this.f24511c = tabAccountsNavBarProductIntroProvider;
        this.d = floatingButtonConfigMapper;
        this.e = featureToggleInteractor;
        this.f = analyticsScreenNameProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(koi.j r4) {
        /*
            boolean r0 = r4 instanceof qv0.p
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r4
            qv0.p r0 = (qv0.p) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.getK()
            goto L12
        L11:
            r0 = r1
        L12:
            boolean r0 = r0 instanceof zn.d
            r2 = 1
            if (r0 != 0) goto L83
            boolean r0 = r4 instanceof com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate.Model
            if (r0 == 0) goto L1f
            r0 = r4
            com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate.Model) r0
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 == 0) goto L44
            java.util.ArrayList r0 = r0.f55241g
            if (r0 == 0) goto L44
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2d
            goto L44
        L2d:
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r0.next()
            koi.j r3 = (koi.j) r3
            boolean r3 = a(r3)
            if (r3 == 0) goto L31
            goto L83
        L44:
            boolean r0 = r4 instanceof com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate.Model
            if (r0 == 0) goto L4b
            com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate$Model r4 = (com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate.Model) r4
            goto L4c
        L4b:
            r4 = r1
        L4c:
            if (r4 == 0) goto L81
            java.util.ArrayList r4 = r4.f55209c
            if (r4 == 0) goto L81
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L59
            goto L81
        L59:
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r4.next()
            qv0.i r0 = (qv0.i) r0
            r3 = r0
            koi.j r3 = (koi.j) r3
            boolean r3 = a(r3)
            if (r3 != 0) goto L83
            boolean r3 = r0 instanceof com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate.Model
            if (r3 == 0) goto L79
            com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate.Model) r0
            goto L7a
        L79:
            r0 = r1
        L7a:
            if (r0 == 0) goto L5d
            boolean r0 = r0.f52907h
            if (r0 != r2) goto L5d
            goto L83
        L81:
            r4 = 0
            return r4
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cie.o1.a(koi.j):boolean");
    }

    public static TextLocalisedClause b(do3.n nVar) {
        return te0.w.V(nVar) ? new TextLocalisedClause(R$string.tab_accounts_selector_accounts_mx, null, null, 14) : new TextLocalisedClause(R$string.tab_accounts_selector_accounts, null, null, 14);
    }

    public static ArrayList d(int i) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("TX_LOADING_", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static List e(Data data) {
        return (List) iii.c.f(data, new cge.g(23), new ccg.a(18), new l1(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133 A[EDGE_INSN: B:196:0x0133->B:57:0x0133 BREAK  A[LOOP:5: B:49:0x0106->B:197:?]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bc  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r38) {
        /*
            Method dump skipped, instruction units count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cie.o1.c(cli.j):cli.o");
    }
}
