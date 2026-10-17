package rgf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import ip0.qd0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.tab.accounts.impl.ui.spaces.a f254161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f254162b;

    public l(com.revolut.feature.tab.accounts.impl.ui.spaces.a cellsMapper, d0 nonProductFilterMapper) {
        Intrinsics.checkNotNullParameter(cellsMapper, "cellsMapper");
        Intrinsics.checkNotNullParameter(nonProductFilterMapper, "nonProductFilterMapper");
        this.f254161a = cellsMapper;
        this.f254162b = nonProductFilterMapper;
    }

    public static int b(qv0.k kVar) {
        switch (k.f254160a[kVar.ordinal()]) {
            case 1:
            case 3:
                return R$attr.uikit_dp4;
            case 2:
            case 4:
            case 5:
            case 6:
                return R$attr.uikit_dp8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int d(qv0.k kVar) {
        switch (k.f254160a[kVar.ordinal()]) {
            case 1:
            case 2:
                return R$attr.uikit_dp4;
            case 3:
            case 4:
            case 5:
            case 6:
                return R$attr.uikit_dp8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final SelectableDelegate.Model a(ProductContext productContext, ProductAccount.ValueItem.Main main, Set set) {
        ProductId productId = productContext.f89553a;
        ProductAccountId productAccountId = main.f89504c;
        ProductAccountDescriptor$Value.Main main2 = new ProductAccountDescriptor$Value.Main(productAccountId, productId);
        qv0.l lVarA = zfe.a.a(this.f254161a, productContext, ((productContext.f89554b instanceof ProductSpaceIdentifier.Favourites) || (productAccountId.f89730b instanceof ExtendedSubaccountType.Group) || main.i) ? main : ProductAccount.ValueItem.Main.T(main, null, AccountListItemModel.a(main.e, null, 507), null, null, 507), main2);
        return new SelectableDelegate.Model(lVarA.getF52222a(), lVarA, set.contains(main2) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f3, code lost:
    
        r6 = ip0.qd0.SELECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f8, code lost:
    
        r6 = ip0.qd0.UNSELECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fb, code lost:
    
        r3.add(new com.revolut.core.ui_kit.delegates.SelectableDelegate.Model(r38, r39, r6, null, null, false, null, null, null, false, 32760));
        r8 = r22;
        r6 = r53;
        r7 = r54;
        r10 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0324, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032a, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032b, code lost:
    
        r53 = r6;
        r54 = r7;
        r6 = zhm.u.b();
        r6.add(r26);
        r6.addAll(r3);
        r1 = zhm.u.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x033e, code lost:
    
        r20 = r1;
        r53 = r6;
        r54 = r7;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0345, code lost:
    
        if (r1 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0347, code lost:
    
        r2.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
    
        r25 = r3;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        if (r8.isEmpty() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        if (r8 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        r3 = rgf.c0.f254147a;
        r12 = r3[r9.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        if (r12 == 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016a, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016b, code lost:
    
        if (r12 != 2) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        r12 = "invest_filter_subheader";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r27 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0177, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        r3 = 2;
        r12 = "crypto_filter_subheader";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r9 = r3[r9.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        if (r9 == 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0185, code lost:
    
        if (r9 != r3) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:
    
        r20 = r1;
        r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactionUI_filter_screen_section_invest, null, null, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        r20 = r1;
        r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactionUI_filter_screen_section_crypto, null, null, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a9, code lost:
    
        r28 = new aw0.t0((com.revolut.core.ui_kit.models.Clause) r9, (com.revolut.core.ui_kit_core.displayers.image.Image) null, 0, false, 30);
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        r26 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model(r27, r28, mif.a.X(r24), null, null, null, null, 0, null, false, false, null, null, 32760);
        r3 = new java.util.ArrayList(zhm.w.t(r8, 10));
        r8 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
    
        if (r8.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        r9 = (com.revolut.feature.tab.accounts.models.NonProductAccountFilter) r8.next();
        r27 = rgf.d0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r9, r10) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fd, code lost:
    
        r22 = r8;
        r53 = r6;
        r54 = r7;
        r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactionUI_filter_screen_section_crypto, null, null, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020d, code lost:
    
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0210, code lost:
    
        r53 = r6;
        r54 = r7;
        r22 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0219, code lost:
    
        if ((r9 instanceof com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Invest) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021b, code lost:
    
        r12 = r14.h(rgf.d0.b((com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Invest) r9), r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r9, r10) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022f, code lost:
    
        r55 = r10;
        r6 = com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.INSTANCE.j(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_bitcoin, new com.revolut.core.ui.models.Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite), new com.revolut.core.ui.models.Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorPurple));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024a, code lost:
    
        r55 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024e, code lost:
    
        if ((r9 instanceof com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Invest) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0250, code lost:
    
        r6 = com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.INSTANCE.j(r14.g(rgf.d0.b((com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Invest) r9)), new com.revolut.core.ui.models.Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite), new com.revolut.core.ui.models.Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorLightBlue));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0270, code lost:
    
        r30 = new com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage.Image40(r6, null, null, false, null, false, 62);
        r32 = (dj0.d) r15.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0287, code lost:
    
        if (r32 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0289, code lost:
    
        r36 = new com.revolut.core.ui_kit.delegates.RowDelegate.Model.c.b(new com.revolut.core.ui_kit.models.MoneyClause(r32, new com.revolut.core.ui_kit.models.MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02af, code lost:
    
        r36 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b1, code lost:
    
        r39 = new com.revolut.core.ui_kit.delegates.RowDelegate.Model(r27, r30, r29, null, 0, null, null, null, 0, r36, false, null, false, null, null, null, null, null, null, r9, null, 0, 0, 0, 0, 532675576);
        r38 = rgf.d0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f1, code lost:
    
        if (r4.contains(r9) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f5  */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.ArrayList, java.util.List] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r57) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rgf.l.c(cli.j):cli.o");
    }
}
