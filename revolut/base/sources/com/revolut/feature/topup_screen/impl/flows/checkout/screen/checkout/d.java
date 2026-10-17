package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout;

import cli.j;
import cli.n;
import cul.r1;
import cxe.b0;
import ixe.e;
import ixe.m;
import ixe.o;
import ixe.q;
import ixe.r;
import ixe.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f90752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f90753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq.a f90754c;
    public final q d;

    public d(e checkoutHeaderMapper, r threeDsHeaderMapper, m checkoutOrderItemsMapper, s threeDsOrderItemsMapper, zq.a actionFooterModelMapper, o selectedExtraTopUpAmountMapper, q totalAmountMapper, exe.b analyticContextDelegate, ixe.n checkoutRevPointsDiscountMapper) {
        Intrinsics.checkNotNullParameter(checkoutHeaderMapper, "checkoutHeaderMapper");
        Intrinsics.checkNotNullParameter(threeDsHeaderMapper, "threeDsHeaderMapper");
        Intrinsics.checkNotNullParameter(checkoutOrderItemsMapper, "checkoutOrderItemsMapper");
        Intrinsics.checkNotNullParameter(threeDsOrderItemsMapper, "threeDsOrderItemsMapper");
        Intrinsics.checkNotNullParameter(actionFooterModelMapper, "actionFooterModelMapper");
        Intrinsics.checkNotNullParameter(selectedExtraTopUpAmountMapper, "selectedExtraTopUpAmountMapper");
        Intrinsics.checkNotNullParameter(totalAmountMapper, "totalAmountMapper");
        Intrinsics.checkNotNullParameter(analyticContextDelegate, "analyticContextDelegate");
        Intrinsics.checkNotNullParameter(checkoutRevPointsDiscountMapper, "checkoutRevPointsDiscountMapper");
        this.f90752a = checkoutHeaderMapper;
        this.f90753b = checkoutOrderItemsMapper;
        this.f90754c = actionFooterModelMapper;
        this.d = totalAmountMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04e8  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r4v30, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(cxe.b r50) {
        /*
            Method dump skipped, instruction units count: 2804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.d.a(cxe.b):java.util.ArrayList");
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        cxe.e domainState = (cxe.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cxe.q) iii.c.f(domainState.f109940a, new cw7.j(this, 11), new r1(this, 26), new cab.m(this, domainState, 13));
    }
}
