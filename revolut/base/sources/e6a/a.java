package e6a;

import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.gj;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import f6a.c;
import f6a.d;
import f6a.e;
import f6a.f;
import f6a.g;
import f6a.h;
import f6a.i;
import g6a.m;
import ip0.ck0;
import ip0.go0;
import ip0.po0;
import ip0.xk;
import ip0.yj0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.y;
import ms0.h4;
import org.jmrtd.lds.LDSFile;
import yy0.j;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f122961a;

    public a(f6a.b cardsHorizontalListMapper, c centerTextMapper, e gridMapper, f merchantNotFoundMapper, g noResultsMapper, i verticalListMapper, d expandableVerticalListBlockMapper) {
        Intrinsics.checkNotNullParameter(cardsHorizontalListMapper, "cardsHorizontalListMapper");
        Intrinsics.checkNotNullParameter(centerTextMapper, "centerTextMapper");
        Intrinsics.checkNotNullParameter(gridMapper, "gridMapper");
        Intrinsics.checkNotNullParameter(merchantNotFoundMapper, "merchantNotFoundMapper");
        Intrinsics.checkNotNullParameter(noResultsMapper, "noResultsMapper");
        Intrinsics.checkNotNullParameter(verticalListMapper, "verticalListMapper");
        Intrinsics.checkNotNullParameter(expandableVerticalListBlockMapper, "expandableVerticalListBlockMapper");
        this.f122961a = centerTextMapper;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.Lazy] */
    public final aim.e a(String query, List blocks) {
        Iterator it8;
        Collection collectionA;
        TextClause textClause;
        TextClause textClause2;
        Iterator it9;
        gj gjVar;
        TagViewData tagViewDataE;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(query, "searchQuery");
        aim.e eVarB = u.b();
        Iterator it10 = blocks.iterator();
        while (it10.hasNext()) {
            ProviderBlock providerBlock = (ProviderBlock) it10.next();
            if (providerBlock instanceof ProviderBlock.CardsHorizontalList) {
                ProviderBlock.CardsHorizontalList item = (ProviderBlock.CardsHorizontalList) providerBlock;
                Intrinsics.checkNotNullParameter(item, "item");
                aim.e eVarB2 = u.b();
                String str = item.f80224a;
                ListSubheaderDelegate.Model modelA = f6a.a.a(str, item.f80225b);
                if (modelA != null) {
                    eVarB2.add(modelA);
                }
                String strQ = j6.a.q("LIST_ID_SCROLLER_PREFIX_", str);
                List<Provider> list = item.f80226c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Provider provider : list) {
                    String strA = h.a(str, provider.f80211a);
                    String str2 = provider.f80214g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zi ziVar = new zi(new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902), go0.PROGRESSIVE_BLUR);
                    UrlImage urlImageB = h.b(provider);
                    TextClause textClause3 = new TextClause(provider.f80212b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    gj gjVar2 = new gj(1);
                    Provider.PointsRewardRate pointsRewardRate = provider.i;
                    if (pointsRewardRate != null) {
                        Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
                        Double dK = y.k(pointsRewardRate.f80219a);
                        if (dK != null) {
                            gjVar = gjVar2;
                            it9 = it10;
                            tagViewDataE = TagViewData.Companion.e(TagViewData.INSTANCE, new CompositeClause(v.k(nub.a.h(dK.doubleValue(), null, o9.NON_SENSITIVE, 3), new MoneyClause((dj0.d) pointsRewardRate.f80221c.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), f6a.b.f132410a, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), null, 8), false, null, 12);
                        } else {
                            it9 = it10;
                            gjVar = gjVar2;
                            tagViewDataE = null;
                        }
                        po0 po0Var = tagViewDataE != null ? new po0(tagViewDataE) : null;
                        VoucherSmallTileDelegate.Model model = new VoucherSmallTileDelegate.Model(strA, ziVar, textClause3, gjVar, null, null, urlImageB, null, null, po0Var, null, false, null, null, provider, 260976);
                        int i = R$attr.uikit_dp0;
                        yp0.b.l(model, i, i, i, i, null, false, 48);
                        arrayList.add(model);
                        it10 = it9;
                    } else {
                        it9 = it10;
                        gjVar = gjVar2;
                    }
                    VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(strA, ziVar, textClause3, gjVar, null, null, urlImageB, null, null, po0Var, null, false, null, null, provider, 260976);
                    int i2 = R$attr.uikit_dp0;
                    yp0.b.l(model2, i2, i2, i2, i2, null, false, 48);
                    arrayList.add(model2);
                    it10 = it9;
                }
                it8 = it10;
                gg.c cVar = new gg.c(0);
                m.Companion.getClass();
                hg hgVar = new hg(strQ, arrayList, 2, new y4(g6a.e.f140898b), null, cVar, false, false, null, null, 0, 0, 0, 0, 32720);
                int i3 = R$attr.uikit_dp0;
                yp0.b.r(hgVar, 0, 0, i3, i3, 3);
                eVarB2.add(hgVar);
                collectionA = u.a(eVarB2);
            } else {
                it8 = it10;
                if (providerBlock instanceof ProviderBlock.CenterText) {
                    ProviderBlock.CenterText item2 = (ProviderBlock.CenterText) providerBlock;
                    String str3 = item2.f80229a;
                    Intrinsics.checkNotNullParameter(item2, "item");
                    c cVar2 = this.f122961a;
                    int iJ = nkm.y.j(Regex.c(cVar2.f132411a, str3));
                    List list2 = item2.f80230b;
                    if (iJ != list2.size()) {
                        IllegalStateException illegalStateException = new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.m("Text has ", iJ, list2.size(), " placeholders but ", " args"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        textClause2 = new TextClause(item2.f80229a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else if (cVar2.f132412b.a(str3)) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Text contains unsupported format specifier");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        textClause2 = new TextClause(item2.f80229a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        String str4 = item2.f80229a;
                        List<ProviderBlock.CenterText.Link> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                        for (ProviderBlock.CenterText.Link link : list3) {
                            arrayList2.add(new TextClause(link.f80231a, (Style) new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) link.f80232b, "SUBTITLE_URL_CLICK_ID", false), (Integer) null, false, (o9) null, (List) null, 124));
                        }
                        textClause = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) arrayList2, 94);
                        collectionA = u.c(new TextDelegate.Model("LIST_ID_CENTER_TEXT", textClause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
                    }
                    textClause = textClause2;
                    collectionA = u.c(new TextDelegate.Model("LIST_ID_CENTER_TEXT", textClause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
                } else if (providerBlock instanceof ProviderBlock.Grid) {
                    ProviderBlock.Grid item3 = (ProviderBlock.Grid) providerBlock;
                    String str5 = item3.f80239a;
                    Intrinsics.checkNotNullParameter(item3, "item");
                    aim.e eVarB3 = u.b();
                    ListSubheaderDelegate.Model modelA2 = f6a.a.a(str5, item3.f80240b);
                    if (modelA2 != null) {
                        eVarB3.add(modelA2);
                    }
                    String strQ2 = j6.a.q("LIST_ID_GRID_PREFIX_", str5);
                    List<Provider> list4 = item3.f80241c;
                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                    for (Provider provider2 : list4) {
                        arrayList3.add(new ReferralContactDelegate.Model(h.a(str5, provider2.f80211a), new AvatarModel.Default(h.b(provider2), null, null, null, null, null, 126), new TextClause(provider2.f80212b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, ke.MATCH_PARENT, null, provider2, null, 6072));
                    }
                    xk xkVar = new xk(strQ2, arrayList3, 4, null, null, 56);
                    yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                    eVarB3.add(xkVar);
                    collectionA = u.a(eVarB3);
                } else if (providerBlock instanceof ProviderBlock.MerchantNotFound) {
                    RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_MERCHANT_NOT_FOUND", null, new TextLocalisedClause(R$string.payments_migration_item_missing_merchant_title, null, null, 14), null, 0, null, null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    collectionA = u.c(model3);
                } else if (providerBlock instanceof ProviderBlock.NoResults) {
                    Intrinsics.checkNotNullParameter(query, "query");
                    FullScreenStateDelegate.Model model4 = new FullScreenStateDelegate.Model("LIST_ID_NO_RESULTS", new TextLocalisedClause(R$string.payments_migration_search_no_results_title, null, null, 14), new TextLocalisedClause(R$string.payments_migration_search_no_results_description, u.c(query), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.payments_migration_search_no_results_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    collectionA = u.c(model4);
                } else if (providerBlock instanceof ProviderBlock.VerticalList) {
                    ProviderBlock.VerticalList item4 = (ProviderBlock.VerticalList) providerBlock;
                    String str6 = item4.f80246a;
                    Intrinsics.checkNotNullParameter(item4, "item");
                    aim.e eVarB4 = u.b();
                    ListSubheaderDelegate.Model modelA3 = f6a.a.a(str6, item4.f80247b);
                    if (modelA3 != null) {
                        eVarB4.add(modelA3);
                    }
                    List list5 = item4.f80248c;
                    ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        arrayList4.add(f6a.a.b(str6, (Provider) it11.next()));
                    }
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    eVarB4.addAll(arrayList4);
                    collectionA = u.a(eVarB4);
                } else if (providerBlock instanceof ProviderBlock.ExpandableVerticalList) {
                    ProviderBlock.ExpandableVerticalList item5 = (ProviderBlock.ExpandableVerticalList) providerBlock;
                    String str7 = item5.f80235a;
                    Intrinsics.checkNotNullParameter(item5, "item");
                    aim.e eVarB5 = u.b();
                    ListSubheaderDelegate.Model modelA4 = f6a.a.a(str7, item5.f80236b);
                    if (modelA4 != null) {
                        eVarB5.add(modelA4);
                    }
                    List list6 = item5.f80237c;
                    ArrayList arrayList5 = new ArrayList(w.t(list6, 10));
                    Iterator it12 = list6.iterator();
                    while (it12.hasNext()) {
                        arrayList5.add(f6a.a.b(str7, (Provider) it12.next()));
                    }
                    ArrayList arrayListF0 = d0.F0(new LargeActionButtonDelegate.Model(j6.a.q("LIST_ID_SEE_ALL_", str7), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.payments_migration_item_see_all_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, null, null, item5, null, 744), arrayList5);
                    yp0.b.k(arrayListF0, 0, 0, 0, 0, 31);
                    eVarB5.addAll(arrayListF0);
                    collectionA = u.a(eVarB5);
                } else {
                    if (!(providerBlock instanceof ProviderBlock.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    collectionA = f0.f322471a;
                }
            }
            eVarB.addAll(collectionA);
            it10 = it8;
        }
        return u.a(eVarB);
    }
}
