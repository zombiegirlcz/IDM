package iv5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.model.PocketItemParcel;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import mu5.p;
import rp0.l0;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends ut5.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f168745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f168746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gv5.e f168747n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ut5.h f168748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ut5.d f168749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CryptoInvestmentsSortingType f168750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f168751s;

    public o(l0 popupMenuDialogDisplayer, j60.a bottomDialog, gv5.e popupDialogsMapper, p widgetCustomizationInteractor, ut5.h splitPocketsDataProvider, ut5.d fiatItemsDataProvider) {
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(popupDialogsMapper, "popupDialogsMapper");
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(splitPocketsDataProvider, "splitPocketsDataProvider");
        Intrinsics.checkNotNullParameter(fiatItemsDataProvider, "fiatItemsDataProvider");
        this.f168745l = popupMenuDialogDisplayer;
        this.f168746m = bottomDialog;
        this.f168747n = popupDialogsMapper;
        this.o = widgetCustomizationInteractor;
        this.f168748p = splitPocketsDataProvider;
        this.f168749q = fiatItemsDataProvider;
        this.f168751s = q.c(Boolean.FALSE);
    }

    public static final Object f3(o oVar, st5.b bVar, Object obj2, ikf.g gVar) throws Throwable {
        p pVar = oVar.o;
        if (oVar.h3(obj2)) {
            pVar.getClass();
            mu5.n nVar = new mu5.n(pVar, bVar, null, 1);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, nVar, gVar);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objJ != aVar) {
                objJ = Unit.f186387a;
            }
            return objJ == aVar ? objJ : Unit.f186387a;
        }
        if (g3(obj2)) {
            pVar.getClass();
            mu5.n nVar2 = new mu5.n(pVar, bVar, null, 0);
            p0 p0Var2 = p0.f264001a;
            Object objJ2 = e0.J(elm.f.f127540b, nVar2, gVar);
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            if (objJ2 != aVar2) {
                objJ2 = Unit.f186387a;
            }
            return objJ2 == aVar2 ? objJ2 : Unit.f186387a;
        }
        if (i3(obj2)) {
            pVar.getClass();
            mu5.n nVar3 = new mu5.n(pVar, bVar, null, 2);
            p0 p0Var3 = p0.f264001a;
            Object objJ3 = e0.J(elm.f.f127540b, nVar3, gVar);
            fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
            if (objJ3 != aVar3) {
                objJ3 = Unit.f186387a;
            }
            return objJ3 == aVar3 ? objJ3 : Unit.f186387a;
        }
        if (!j3(obj2)) {
            return Unit.f186387a;
        }
        pVar.getClass();
        mu5.n nVar4 = new mu5.n(pVar, bVar, null, 3);
        p0 p0Var4 = p0.f264001a;
        Object objJ4 = e0.J(elm.f.f127540b, nVar4, gVar);
        fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
        if (objJ4 != aVar4) {
            objJ4 = Unit.f186387a;
        }
        return objJ4 == aVar4 ? objJ4 : Unit.f186387a;
    }

    public static boolean g3(Object obj2) {
        return (obj2 instanceof PocketItemParcel) && (((PocketItemParcel) obj2).f71387b instanceof SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel.EarnItemParcel);
    }

    public static boolean i3(Object obj2) {
        return (obj2 instanceof PocketItemParcel) && (((PocketItemParcel) obj2).f71387b instanceof SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel.PerpetualItemParcel);
    }

    public static boolean j3(Object obj2) {
        return (obj2 instanceof PocketItemParcel) && (((PocketItemParcel) obj2).f71387b instanceof SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel.SpotMarginTradingItemParcel);
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, this.f168748p.W(), null, new iug.j(this, (Continuation) null, 4), 3);
    }

    @Override // ut5.i
    public final void Z2() {
        this.f168750r = null;
    }

    @Override // ut5.i
    public final void b3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        V2(new m(model, this, null), new yi5.b(29));
    }

    @Override // ut5.i
    public final void c3(PopupMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        V2(new ikf.g(item, this, null, 21), new yi5.b(29));
    }

    @Override // ut5.i
    public final void d3(RowDelegate.Model model) {
        ArrayList arrayList;
        Pair pair;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        String anchorItemId = model.f53228a;
        if (h3(obj2) || g3(obj2) || i3(obj2) || j3(obj2)) {
            Object obj3 = model.u;
            boolean zH3 = h3(obj3);
            p pVar = this.o;
            st5.b selectedItemsLimit = zH3 ? pVar.a("CRYPTO_INVESTMENTS_WIDGET_SHOW_UP_TO") : g3(obj3) ? pVar.a("CRYPTO_EARNING_WIDGET_SHOW_UP_TO") : i3(obj3) ? pVar.a("CRYPTO_PERPETUALS_WIDGET_SHOW_UP_TO") : j3(obj3) ? pVar.a("CRYPTO_SPOT_MARGIN_TRADING_WIDGET_SHOW_UP_TO") : null;
            Object obj4 = model.u;
            this.f168747n.getClass();
            Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
            PopupMenuItem.Cell cellA = com.revolut.core.ui_kit.models.popup.a.a("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_SORT_ID", new TextLocalisedClause(R$string.crypto_investments_sort_by_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrows_sort, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            if (selectedItemsLimit == null) {
                arrayList = null;
            } else {
                EnumEntries<st5.b> enumEntriesA = st5.b.a();
                ArrayList arrayList2 = new ArrayList(w.t(enumEntriesA, 10));
                for (st5.b bVar : enumEntriesA) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    Intrinsics.checkNotNullParameter(selectedItemsLimit, "selectedItemsLimit");
                    switch (gv5.g.f147065a[bVar.ordinal()]) {
                        case 1:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_UNLIMITED_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_no_limit, null, null, 14));
                            break;
                        case 2:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_1_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_one, null, null, 14));
                            break;
                        case 3:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_2_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_two, null, null, 14));
                            break;
                        case 4:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_3_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_three, null, null, 14));
                            break;
                        case 5:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_5_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_five, null, null, 14));
                            break;
                        case 6:
                            pair = new Pair("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_10_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_option_ten, null, null, 14));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(com.revolut.core.ui_kit.models.popup.a.a((String) pair.f186385a, (TextLocalisedClause) pair.f186386b, bVar == selectedItemsLimit ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTransparent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, obj4, null, null, Constants.TAG_EMV_L2_CHECKSUM));
                }
                arrayList = arrayList2;
            }
            PopupMenuItem[] elements = {cellA, arrayList != null ? new PopupMenuItem.NestedParent("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_ID", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_show_up_to_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_menu, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), arrayList, new gv5.f(anchorItemId, obj4), null, null, 96) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f168745l.e(anchorItemId, zi0.c.d(kotlin.collections.d.L(elements)), mw0.o.VIEW_BOUNDS, new mw0.l(false));
        }
    }

    @Override // ut5.i
    public final void e3(SingleChoiceDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        V2(new n(model, this, null), new yi5.b(29));
    }

    public final boolean h3(Object obj2) {
        if ((obj2 instanceof PocketItemParcel) && (((PocketItemParcel) obj2).f71387b instanceof SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel.MainItemParcel)) {
            return true;
        }
        return this.f168749q.e(obj2) && ((Boolean) this.f168751s.getValue()).booleanValue();
    }
}
