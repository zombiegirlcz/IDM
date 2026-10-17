package com.revolut.feature.tab.accounts.impl.ui.spaces;

import cie.n1;
import cie.o1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.HomeContext;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;
import qv0.l;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements zfe.a {

    @NotNull
    public static final C0556a Companion = new C0556a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccentCircleBadge f89622a = d8l.d.b(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f89623b = w.y0(new a92.d(24));

    /* JADX INFO: renamed from: com.revolut.feature.tab.accounts.impl.ui.spaces.a$a, reason: collision with other inner class name */
    public static final class C0556a {
        private C0556a() {
        }
    }

    public static String c(ProductContext productContext, ProductAccount productAccount) {
        String id10 = productContext.f89554b.f89741a.getId();
        String id11 = productContext.f89555c.getId();
        String id12 = productContext.f89553a.getId();
        return v0.a.i(p.a.t(id10, "_", id11, "_", id12), "_", productAccount.getF89504c().f89729a);
    }

    public static ArrayList f(List list) {
        xh0 xh0Var;
        List<ProductAccountListAction> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ProductAccountListAction productAccountListAction : list2) {
            String str = productAccountListAction.f89510a;
            Image image = productAccountListAction.f89512c;
            Clause clause = productAccountListAction.f89511b;
            int i = aie.a.f5233a[productAccountListAction.d.ordinal()];
            if (i == 1) {
                xh0Var = xh0.PRIMARY;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xh0Var = xh0.NEGATIVE;
            }
            arrayList.add(new SwipeToActionDelegate.SwipeAction(str, image, clause, xh0Var, null, productAccountListAction.f89514h, null, 80));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    public final Image b(Image image) {
        if (image instanceof CurrencyImage) {
            CurrencyImage currencyImage = (CurrencyImage) image;
            String currencyCode = currencyImage.f59911a;
            ImageTransformations imageTransformations = currencyImage.f59913c;
            Clause clause = currencyImage.d;
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            return new CurrencyImage(currencyCode, true, imageTransformations, clause);
        }
        if (!(image instanceof UrlImage)) {
            return image;
        }
        UrlImage urlImage = (UrlImage) image;
        UrlImageDrawable urlImageDrawable = urlImage.f60019c;
        if (urlImageDrawable == null) {
            urlImageDrawable = (UrlImageDrawable.Shimmering.Transformable) this.f89623b.getValue();
        }
        return UrlImage.a(urlImage, null, null, urlImageDrawable, null, null, 524283);
    }

    public final l d(ProductContext productContext, ProductAccount account, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(account, "account");
        String strC = c(productContext, account);
        v vVar = productContext.f89555c;
        ProductSpaceIdentifier productSpaceIdentifier = productContext.f89554b;
        ProductId productId = productContext.f89553a;
        if (account instanceof ProductAccount.ValueItem.Main) {
            return e((ProductAccount.ValueItem.Main) account, strC, productContext, z, z3, true, null);
        }
        if (!(account instanceof ProductAccount.ValueItem.Discover)) {
            if (!(account instanceof ProductAccount.PendingItem)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductAccount.PendingItem pendingItem = (ProductAccount.PendingItem) account;
            HomeContext.a aVarNewBuilder = HomeContext.newBuilder();
            String id10 = productId.getId();
            aVarNewBuilder.c();
            ((HomeContext) aVarNewBuilder.f49761b).setProductIdentifier(id10);
            HomeContext homeContext = (HomeContext) aVarNewBuilder.a();
            TrackableClause trackableClause = new TrackableClause(pendingItem.f89497c, R$string.home_account_switcher_item);
            Clause clause = pendingItem.d;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(pendingItem.f89496b, pendingItem.e, null, false, null, false, 60);
            AnalyticsContext.INSTANCE.getClass();
            return new RowDelegate.Model(strC, image40, trackableClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, new SpaceContentListMapper$ItemParcel.PendingItem(productSpaceIdentifier, vVar, new nie.b(productId, pendingItem.f89495a, pendingItem.f)), new AnalyticsContext(AnalyticsContext.Companion.a(homeContext)), 0, 0, 0, 0, 524287960);
        }
        ProductAccount.ValueItem.Discover discover = (ProductAccount.ValueItem.Discover) account;
        SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem subspaceDiscoverItem = new SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem(productSpaceIdentifier, vVar, com.revolut.feature.tab.accounts.api.model.a.c(discover, productId, discover.f89501c), z);
        int i = R$string.home_account_switcher_item;
        AccountListItemModel accountListItemModel = discover.e;
        TrackableClause trackableClause2 = new TrackableClause(accountListItemModel.f89478b, i);
        Clause clause2 = accountListItemModel.f89479c;
        Image imageB = b(accountListItemModel.f89477a);
        CircleBadgeModel circleBadgeModel = z ? this.f89622a : null;
        if (circleBadgeModel == null) {
            circleBadgeModel = accountListItemModel.e;
        }
        return new wh(strC, new RowDelegate.Model(strC, new RowDelegate.Model.MainImage.Image40(imageB, circleBadgeModel, null, accountListItemModel.f, null, false, 52), trackableClause2, null, 0, clause2, null, null, 0, new pf(new TextLocalisedClause(R$string.account_switcher_discover_item_action_discover, null, null, 14), null, null, false, subspaceDiscoverItem, null, 478), false, null, false, null, null, null, null, null, null, subspaceDiscoverItem, null, 0, 0, 0, 0, 532675544), f(d0.F0(new ProductAccountListAction(504, null, new TextLocalisedClause(R.string.common_action_hide, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, j6.a.q("DISCOVER_ACTION_HIDE_", strC), null, null, false, false), accountListItemModel.d)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final l e(ProductAccount.ValueItem.Main main, String str, ProductContext productContext, boolean z, boolean z3, boolean z4, Object obj2) {
        Pair pair;
        List list;
        RowDelegate.Model.c.b bVar;
        Clause clause;
        Object subspaceValueItem;
        xi0.b bVar2;
        ProductId productId = productContext.f89553a;
        ProductAccountId productAccountId = main.f89504c;
        AccountListItemModel accountListItemModel = main.e;
        ProductAccountDescriptor$Value productAccountDescriptor$ValueC = com.revolut.feature.tab.accounts.api.model.a.c(main, productId, productAccountId);
        ProductAccountValue productAccountValue = main.d;
        if (productAccountValue instanceof ProductAccountValue.Balance) {
            ProductAccountValue.Balance balance = (ProductAccountValue.Balance) productAccountValue;
            pair = new Pair(new MoneyClause(balance.f89532b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), balance.f89533c);
        } else {
            if (!(productAccountValue instanceof ProductAccountValue.Text)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductAccountValue.Text text = (ProductAccountValue.Text) productAccountValue;
            pair = new Pair(text.f89536b, text.f89537c);
        }
        Clause clause2 = (Clause) pair.f186385a;
        Clause clause3 = (Clause) pair.f186386b;
        o1.Companion.getClass();
        dj0.d dVarA = n1.a(productAccountValue);
        String str2 = (dVarA == null || (bVar2 = dVarA.f115083b) == null) ? null : bVar2.f306286a;
        HomeContext.a aVarNewBuilder = HomeContext.newBuilder();
        String id10 = productAccountDescriptor$ValueC.getF89727a().getId();
        aVarNewBuilder.c();
        ((HomeContext) aVarNewBuilder.f49761b).setProductIdentifier(id10);
        String str3 = productAccountDescriptor$ValueC.getF89728b().f89729a;
        aVarNewBuilder.c();
        ((HomeContext) aVarNewBuilder.f49761b).setPocketId(str3);
        if (str2 != null) {
            aVarNewBuilder.c();
            ((HomeContext) aVarNewBuilder.f49761b).setCurrencyCode(str2);
        }
        HomeContext homeContext = (HomeContext) aVarNewBuilder.a();
        int i = R$string.home_account_switcher_item;
        Clause clause4 = accountListItemModel.f89478b;
        List list2 = accountListItemModel.d;
        TrackableClause trackableClause = new TrackableClause(clause4, i);
        RowDelegate.Model.b bVar3 = accountListItemModel.f89481h ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
        Clause clause5 = accountListItemModel.f89479c;
        Image imageB = b(accountListItemModel.f89477a);
        CircleBadgeModel circleBadgeModel = z ? this.f89622a : null;
        if (circleBadgeModel == null) {
            circleBadgeModel = accountListItemModel.e;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageB, circleBadgeModel, null, accountListItemModel.f, null, false, 52);
        if (accountListItemModel.f89480g) {
            list = list2;
            bVar = new RowDelegate.Model.c.b(clause2, clause3, null, !main.i, 60);
        } else {
            list = list2;
            bVar = null;
        }
        AnalyticsContext.INSTANCE.getClass();
        w0 w0VarA = AnalyticsContext.Companion.a(homeContext);
        if (obj2 == null) {
            clause = clause5;
            subspaceValueItem = new SpaceContentListMapper$ItemParcel.SubspaceValueItem(productContext.f89554b, productContext.f89555c, productAccountDescriptor$ValueC, z3 && main.f89507j, z, accountListItemModel.i);
        } else {
            clause = clause5;
            subspaceValueItem = obj2;
        }
        RowDelegate.Model model = new RowDelegate.Model(str, image40, trackableClause, null, 0, clause, null, null, 0, bVar, false, null, false, bVar3, null, null, null, null, null, subspaceValueItem, new AnalyticsContext(w0VarA), 0, 0, 0, 0, 524270552);
        return (list.isEmpty() || !z4) ? model : new wh(str, model, f(list), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
