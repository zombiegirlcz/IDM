package jlh;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f175770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f175771b;

    public e(f accountWidgetsPersonalisationInteractor, ujh.d portfolioSortByItemsProvider, ujh.b portfolioShowUpToItemsProvider, ujh.a portfolioGroupByProductsItemProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountWidgetsPersonalisationInteractor, "accountWidgetsPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(portfolioSortByItemsProvider, "portfolioSortByItemsProvider");
        Intrinsics.checkNotNullParameter(portfolioShowUpToItemsProvider, "portfolioShowUpToItemsProvider");
        Intrinsics.checkNotNullParameter(portfolioGroupByProductsItemProvider, "portfolioGroupByProductsItemProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f175770a = accountWidgetsPersonalisationInteractor;
        this.f175771b = featureToggleInteractor;
    }

    public final Pair a(List items, n4l.b showUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(showUpTo, "showUpTo");
        if (!(showUpTo instanceof n4l.a)) {
            showUpTo = null;
        }
        n4l.a aVar = (n4l.a) showUpTo;
        if (aVar == null) {
            return new Pair(items, bih.b.Hidden);
        }
        int i = aVar.f212468a;
        boolean z3 = items.size() > i;
        if (z3 && z) {
            items = d0.V0(items, i);
        }
        return new Pair(items, !z3 ? bih.b.Hidden : z ? bih.b.ShowMore : bih.b.ShowLess);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187 A[LOOP:0: B:41:0x0181->B:43:0x0187, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.shared.feature.wealth.models.account.WealthAccountType r42, gim.c r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jlh.e.b(com.revolut.shared.feature.wealth.models.account.WealthAccountType, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.shared.feature.wealth.models.account.WealthAccountType r7, gim.c r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jlh.e.c(com.revolut.shared.feature.wealth.models.account.WealthAccountType, gim.c, java.lang.String):java.lang.Object");
    }
}
