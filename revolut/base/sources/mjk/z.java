package mjk;

import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ljk.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfk.a f206065a;

    public z(qfk.a descriptorMapper) {
        Intrinsics.checkNotNullParameter(descriptorMapper, "descriptorMapper");
        this.f206065a = descriptorMapper;
    }

    public static PlanScreenElementView.ActionButton b(bjk.a aVar) {
        return new PlanScreenElementView.ActionButton(aVar.getLabel(), new PlanScreenElementView.Action(aVar.getDeeplink()));
    }

    public static PlanScreenElementView.ActionButton c(d.a aVar) {
        return new PlanScreenElementView.ActionButton(aVar.getLabel(), new PlanScreenElementView.Action(aVar.getDeeplink()));
    }

    public static PlanScreenElementView.Badge d(bjk.b bVar) {
        bjk.h icon = bVar.getIcon();
        com.revolut.feature.pricingplans.models.a aVar = null;
        PlanScreenElementView.Icon iconF = icon != null ? f(icon) : null;
        String color = bVar.getColor();
        if (color != null) {
            com.revolut.feature.pricingplans.models.a[] aVarArrValues = com.revolut.feature.pricingplans.models.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.revolut.feature.pricingplans.models.a aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), color, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        return new PlanScreenElementView.Badge(iconF, aVar, bVar.getText());
    }

    public static PlanScreenElementView.Badge e(d.C1108d c1108d) {
        d.r icon = c1108d.getIcon();
        com.revolut.feature.pricingplans.models.a aVar = null;
        PlanScreenElementView.Icon iconG = icon != null ? g(icon) : null;
        String color = c1108d.getColor();
        if (color != null) {
            com.revolut.feature.pricingplans.models.a[] aVarArrValues = com.revolut.feature.pricingplans.models.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.revolut.feature.pricingplans.models.a aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), color, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        return new PlanScreenElementView.Badge(iconG, aVar, c1108d.getText());
    }

    public static PlanScreenElementView.Icon f(bjk.h hVar) {
        return new PlanScreenElementView.Icon(hVar.getAssetName(), hVar.getProgress(), hVar.getUrl());
    }

    public static PlanScreenElementView.Icon g(d.r rVar) {
        return new PlanScreenElementView.Icon(rVar.getAssetName(), rVar.getProgress(), rVar.getUrl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.revolut.feature.pricingplans.models.b] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r14v3, types: [hha.c] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.revolut.feature.pricingplans.models.PlanScreenElementView$CellBanner$Accessory] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r24v0, types: [hha.c] */
    /* JADX WARN: Type inference failed for: r2v41, types: [hha.c[]] */
    /* JADX WARN: Type inference failed for: r6v35, types: [com.revolut.feature.pricingplans.models.b[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.pricingplans.models.PlanScreenElementView i(ljk.d r25) {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.z.i(ljk.d):com.revolut.feature.pricingplans.models.PlanScreenElementView");
    }

    public static PricingPlanTextDescriptor j(d.j jVar) {
        String url2;
        String text = jVar.getText();
        d.b action = jVar.getAction();
        return new PricingPlanTextDescriptor(text, (action == null || (url2 = action.getUrl()) == null) ? null : new PricingPlanTextDescriptor.Action.UrlNavigation(url2));
    }

    public static d.a k(PlanScreenElementView.ActionButton actionButton) {
        return new d.a(actionButton.f81006a, actionButton.f81007b.f81005a);
    }

    public static d.C1108d l(PlanScreenElementView.Badge badge) {
        PlanScreenElementView.Icon icon = badge.f81011a;
        d.r rVarN = icon != null ? n(icon) : null;
        com.revolut.feature.pricingplans.models.a aVar = badge.f81012b;
        return new d.C1108d(aVar != null ? aVar.name() : null, badge.f81013c, rVarN);
    }

    public static d.j m(PricingPlanTextDescriptor pricingPlanTextDescriptor) {
        d.b bVar;
        String str = pricingPlanTextDescriptor.f81148a;
        PricingPlanTextDescriptor.Action action = pricingPlanTextDescriptor.f81149b;
        if (action instanceof PricingPlanTextDescriptor.Action.UrlNavigation) {
            bVar = new d.b(((PricingPlanTextDescriptor.Action.UrlNavigation) action).f81150a);
        } else {
            if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = null;
        }
        return new d.j(str, bVar);
    }

    public static d.r n(PlanScreenElementView.Icon icon) {
        return new d.r(icon.f81077b, icon.f81078c, icon.f81076a);
    }

    public static ljk.d o(PlanScreenElementView domain) {
        d.l.a aVar;
        d.g.a aVar2;
        ArrayList arrayList;
        d.g.a cVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        if (domain instanceof PlanScreenElementView.CellBanner) {
            PlanScreenElementView.CellBanner cellBanner = (PlanScreenElementView.CellBanner) domain;
            String str = cellBanner.f81018a;
            String str2 = cellBanner.f81019b;
            com.revolut.feature.pricingplans.models.b bVar = cellBanner.f81020c;
            String strName = bVar != null ? bVar.name() : null;
            PlanScreenElementView.Badge badge = cellBanner.f81022h;
            d.C1108d c1108dL = badge != null ? l(badge) : null;
            List list = cellBanner.d;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(m((PricingPlanTextDescriptor) it8.next()));
            }
            PlanScreenElementView.CellBanner.Icon icon = cellBanner.e;
            d.g.b bVar2 = icon != null ? new d.g.b(icon.f81032a.name(), icon.f81034c, icon.d, icon.f81033b, Boolean.valueOf(icon.e), icon.f.name()) : null;
            PlanScreenElementView.ActionButton actionButton = cellBanner.f;
            d.a aVarK = actionButton != null ? k(actionButton) : null;
            PlanScreenElementView.Action action = cellBanner.f81021g;
            String str3 = action != null ? action.f81005a : null;
            PlanScreenElementView.CellBanner.Accessory accessory = cellBanner.i;
            if (accessory != null) {
                if (accessory instanceof PlanScreenElementView.CellBanner.Accessory.Tag) {
                    PlanScreenElementView.CellBanner.Accessory.Tag tag2 = (PlanScreenElementView.CellBanner.Accessory.Tag) accessory;
                    cVar = new d.g.a.e(tag2.f81028a, tag2.f81029b);
                } else if (accessory instanceof PlanScreenElementView.CellBanner.Accessory.Text) {
                    PlanScreenElementView.CellBanner.Accessory.Text text = (PlanScreenElementView.CellBanner.Accessory.Text) accessory;
                    cVar = new d.g.a.f(text.f81030a, text.f81031b);
                } else if (accessory instanceof PlanScreenElementView.CellBanner.Accessory.Button) {
                    PlanScreenElementView.CellBanner.Accessory.Button button = (PlanScreenElementView.CellBanner.Accessory.Button) accessory;
                    cVar = new d.g.a.C1109a(button.f81024a, button.f81025b);
                } else {
                    if (!(accessory instanceof PlanScreenElementView.CellBanner.Accessory.Icon)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlanScreenElementView.CellBanner.Accessory.Icon icon2 = (PlanScreenElementView.CellBanner.Accessory.Icon) accessory;
                    cVar = new d.g.a.c(new d.g.a.C1110d(icon2.f81026a, icon2.f81027b));
                }
                aVar2 = cVar;
            } else {
                aVar2 = null;
            }
            List list2 = cellBanner.f81023j;
            if (list2 != null) {
                List<PlanScreenElementView.CellBanner.TitleParam> list3 = list2;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (PlanScreenElementView.CellBanner.TitleParam titleParam : list3) {
                    String str4 = titleParam.f81035a;
                    com.revolut.feature.pricingplans.models.b bVar3 = titleParam.f81036b;
                    arrayList3.add(new d.g.c(str4, bVar3 != null ? bVar3.name() : null));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return new d.g(str, str2, strName, arrayList2, bVar2, c1108dL, aVarK, str3, aVar2, arrayList);
        }
        if (domain instanceof PlanScreenElementView.PlainText) {
            PlanScreenElementView.PlainText plainText = (PlanScreenElementView.PlainText) domain;
            String str5 = plainText.f81097a;
            List list4 = plainText.f81098b;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                arrayList4.add(m((PricingPlanTextDescriptor) it9.next()));
            }
            return new d.x(str5, arrayList4);
        }
        if (domain instanceof PlanScreenElementView.UnorderedList) {
            PlanScreenElementView.UnorderedList unorderedList = (PlanScreenElementView.UnorderedList) domain;
            String str6 = unorderedList.f81113a;
            List list5 = unorderedList.f81114b;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                arrayList5.add(new d.c0.a(((PlanScreenElementView.UnorderedList.Item) it10.next()).f81115a));
            }
            return new d.c0(str6, arrayList5);
        }
        if (domain instanceof PlanScreenElementView.ListView) {
            PlanScreenElementView.ListView listView = (PlanScreenElementView.ListView) domain;
            String str7 = listView.f81084a;
            PlanScreenElementView.ListView.Action action2 = listView.f81085b;
            d.u.a aVar3 = action2 != null ? new d.u.a(action2.f81087a, action2.f81088b, action2.f81089c.f81005a) : null;
            ArrayList arrayList6 = listView.f81086c;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                arrayList7.add(o((PlanScreenElementView) it11.next()));
            }
            return new d.u(str7, aVar3, arrayList7);
        }
        if (domain instanceof PlanScreenElementView.Footer) {
            PlanScreenElementView.Footer footer = (PlanScreenElementView.Footer) domain;
            String str8 = footer.f81053a;
            List list6 = footer.f81054b;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list6, 10));
            Iterator it12 = list6.iterator();
            while (it12.hasNext()) {
                arrayList8.add(m((PricingPlanTextDescriptor) it12.next()));
            }
            return new d.m(str8, arrayList8);
        }
        if (domain instanceof PlanScreenElementView.SlotManagerBanner) {
            return new d.e();
        }
        if (domain instanceof PlanScreenElementView.ExpansionArea) {
            PlanScreenElementView.ExpansionArea expansionArea = (PlanScreenElementView.ExpansionArea) domain;
            String str9 = expansionArea.f81042a;
            String str10 = expansionArea.f81043b;
            ArrayList arrayList9 = expansionArea.f81044c;
            ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
            Iterator it13 = arrayList9.iterator();
            while (it13.hasNext()) {
                arrayList10.add(o((PlanScreenElementView.CellBanner) it13.next()));
            }
            return new d.k(str9, str10, arrayList10);
        }
        if (domain instanceof PlanScreenElementView.Grid) {
            PlanScreenElementView.Grid grid = (PlanScreenElementView.Grid) domain;
            String str11 = grid.f81055a;
            String str12 = grid.f81056b;
            ArrayList<PlanScreenElementView.Grid.GridCell> arrayList11 = grid.f81057c;
            ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
            for (PlanScreenElementView.Grid.GridCell gridCell : arrayList11) {
                String str13 = gridCell.f81058a;
                String str14 = gridCell.f81059b;
                PlanScreenElementView.Icon icon3 = gridCell.f81060c;
                d.r rVarN = icon3 != null ? n(icon3) : null;
                PlanScreenElementView.Badge badge2 = gridCell.d;
                d.C1108d c1108dL2 = badge2 != null ? l(badge2) : null;
                PlanScreenElementView.Action action3 = gridCell.e;
                arrayList12.add(new d.n.a(str13, str14, rVarN, c1108dL2, action3 != null ? action3.f81005a : null));
            }
            PlanScreenElementView.ActionButton actionButton2 = grid.d;
            return new d.n(str11, str12, arrayList12, actionButton2 != null ? k(actionButton2) : null);
        }
        if (domain instanceof PlanScreenElementView.SecondaryButton) {
            PlanScreenElementView.SecondaryButton secondaryButton = (PlanScreenElementView.SecondaryButton) domain;
            String str15 = secondaryButton.f81102a;
            String str16 = secondaryButton.f81103b;
            PlanScreenElementView.Action action4 = secondaryButton.f81104c;
            return new d.z(str15, str16, action4 != null ? action4.f81005a : null);
        }
        if (domain instanceof PlanScreenElementView.PrimaryButton) {
            PlanScreenElementView.PrimaryButton primaryButton = (PlanScreenElementView.PrimaryButton) domain;
            String str17 = primaryButton.f81099a;
            String str18 = primaryButton.f81100b;
            PlanScreenElementView.Action action5 = primaryButton.f81101c;
            return new d.y(str17, str18, action5 != null ? action5.f81005a : null);
        }
        if (domain instanceof PlanScreenElementView.HorizontalButtons) {
            PlanScreenElementView.HorizontalButtons horizontalButtons = (PlanScreenElementView.HorizontalButtons) domain;
            String str19 = horizontalButtons.f81068a;
            ArrayList<PlanScreenElementView.HorizontalButtons.Button> arrayList13 = horizontalButtons.f81069b;
            ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
            for (PlanScreenElementView.HorizontalButtons.Button button2 : arrayList13) {
                arrayList14.add(new d.p.a(button2.f81070a, button2.f81071b, button2.f81072c.f81005a, button2.d.name()));
            }
            return new d.p(str19, arrayList14);
        }
        if (domain instanceof PlanScreenElementView.CellTuple) {
            PlanScreenElementView.CellTuple cellTuple = (PlanScreenElementView.CellTuple) domain;
            String str20 = cellTuple.f81037a;
            String str21 = cellTuple.f81038b;
            PlanScreenElementView.DescriptionOptions descriptionOptions = cellTuple.f81039c;
            return new d.h(str20, str21, descriptionOptions != null ? new d.i(descriptionOptions.f81040a, descriptionOptions.f81041b) : null);
        }
        if (domain instanceof PlanScreenElementView.Pager) {
            ArrayList<PlanScreenElementView.Pager.Page> arrayList15 = ((PlanScreenElementView.Pager) domain).f81093a;
            ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
            for (PlanScreenElementView.Pager.Page page : arrayList15) {
                String str22 = page.f81094a;
                String str23 = page.f81095b;
                List list7 = page.f81096c;
                ArrayList arrayList17 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it14 = list7.iterator();
                while (it14.hasNext()) {
                    arrayList17.add(o((PlanScreenElementView) it14.next()));
                }
                arrayList16.add(new d.w.a(str22, str23, arrayList17));
            }
            return new d.w(arrayList16);
        }
        if (domain instanceof PlanScreenElementView.ActionWidget) {
            PlanScreenElementView.ActionWidget actionWidget = (PlanScreenElementView.ActionWidget) domain;
            String str24 = actionWidget.f81008a;
            String str25 = actionWidget.f81009b;
            String str26 = actionWidget.f81010c;
            PlanScreenElementView.Icon icon4 = actionWidget.d;
            d.r rVarN2 = icon4 != null ? n(icon4) : null;
            PlanScreenElementView.ActionButton actionButton3 = actionWidget.e;
            d.a aVarK2 = actionButton3 != null ? k(actionButton3) : null;
            PlanScreenElementView.ActionButton actionButton4 = actionWidget.f;
            return new d.c(str24, str25, str26, rVarN2, aVarK2, actionButton4 != null ? k(actionButton4) : null);
        }
        if (domain instanceof PlanScreenElementView.HorizontalScroller) {
            PlanScreenElementView.HorizontalScroller horizontalScroller = (PlanScreenElementView.HorizontalScroller) domain;
            String str27 = horizontalScroller.f81073a;
            String str28 = horizontalScroller.f81074b;
            PlanScreenElementView.Icon icon5 = horizontalScroller.f81075c;
            d.r rVarN3 = icon5 != null ? n(icon5) : null;
            String strName2 = horizontalScroller.e.name();
            PlanScreenElementView.ActionButton actionButton5 = horizontalScroller.f;
            d.a aVarK3 = actionButton5 != null ? k(actionButton5) : null;
            ArrayList arrayList18 = horizontalScroller.d;
            ArrayList arrayList19 = new ArrayList(zhm.w.t(arrayList18, 10));
            Iterator it15 = arrayList18.iterator();
            while (it15.hasNext()) {
                arrayList19.add(o((PlanScreenElementView) it15.next()));
            }
            return new d.q(str27, str28, rVarN3, strName2, aVarK3, arrayList19);
        }
        if (domain instanceof PlanScreenElementView.Tile) {
            PlanScreenElementView.Tile tile = (PlanScreenElementView.Tile) domain;
            String str29 = tile.f81106a;
            String str30 = tile.f81107b;
            String str31 = tile.f81108c;
            PlanScreenElementView.Icon icon6 = tile.d;
            d.r rVarN4 = icon6 != null ? n(icon6) : null;
            PlanScreenElementView.Badge badge3 = tile.e;
            d.C1108d c1108dL3 = badge3 != null ? l(badge3) : null;
            PlanScreenElementView.Action action6 = tile.f;
            return new d.a0(str29, str30, str31, rVarN4, c1108dL3, action6 != null ? action6.f81005a : null);
        }
        if (domain instanceof PlanScreenElementView.Card) {
            PlanScreenElementView.Card card = (PlanScreenElementView.Card) domain;
            return new d.f(card.f81014a, card.f81015b, card.f81016c, new d.s(card.d.f81017a), n(card.e), card.f.f81005a);
        }
        if (domain instanceof PlanScreenElementView.HeroCard) {
            PlanScreenElementView.HeroCard heroCard = (PlanScreenElementView.HeroCard) domain;
            PlanScreenElementView.HeroCard.HeroAction heroAction = heroCard.e;
            return new d.o(heroCard.f81061a, heroCard.f81062b, new d.s(heroCard.f81063c.f81067a), heroCard.d.f81005a, new d.o.a(heroAction.f81064a, heroAction.f81066c.f81005a, n(heroAction.f81065b)));
        }
        if (domain instanceof PlanScreenElementView.Media) {
            PlanScreenElementView.Media media = (PlanScreenElementView.Media) domain;
            return new d.v(media.f81090a, new d.v.a(media.f81091b.name(), media.f81092c));
        }
        if (domain instanceof PlanScreenElementView.FeaturedActionWidget) {
            PlanScreenElementView.FeaturedActionWidget featuredActionWidget = (PlanScreenElementView.FeaturedActionWidget) domain;
            String str32 = featuredActionWidget.f81045a;
            String str33 = featuredActionWidget.f81046b;
            String str34 = featuredActionWidget.f81047c;
            String str35 = featuredActionWidget.d;
            PlanScreenElementView.Icon icon7 = featuredActionWidget.e;
            d.r rVarN5 = icon7 != null ? n(icon7) : null;
            PlanScreenElementView.Badge badge4 = featuredActionWidget.f;
            d.C1108d c1108dL4 = badge4 != null ? l(badge4) : null;
            PlanScreenElementView.FeaturedActionWidget.PrimaryButton primaryButton2 = featuredActionWidget.f81048g;
            if (primaryButton2 != null) {
                String str36 = primaryButton2.f81050a;
                String str37 = primaryButton2.f81051b;
                PlanScreenElementView.Icon icon8 = primaryButton2.f81052c;
                aVar = new d.l.a(str36, str37, icon8 != null ? n(icon8) : null, primaryButton2.d.f81005a);
            } else {
                aVar = null;
            }
            PlanScreenElementView.Action action7 = featuredActionWidget.f81049h;
            return new d.l(str32, str33, str34, str35, rVarN5, c1108dL4, aVar, action7 != null ? action7.f81005a : null);
        }
        if (domain instanceof PlanScreenElementView.LargeCard) {
            PlanScreenElementView.LargeCard largeCard = (PlanScreenElementView.LargeCard) domain;
            String str38 = largeCard.f81079a;
            String str39 = largeCard.f81080b;
            String str40 = largeCard.f81081c;
            d.s sVar = new d.s(largeCard.d.f81083a);
            PlanScreenElementView.Badge badge5 = largeCard.e;
            d.C1108d c1108dL5 = badge5 != null ? l(badge5) : null;
            Boolean boolValueOf = Boolean.valueOf(largeCard.f);
            PlanScreenElementView.Action action8 = largeCard.f81082g;
            return new d.t(str38, str39, str40, sVar, c1108dL5, boolValueOf, action8 != null ? action8.f81005a : null);
        }
        if (!(domain instanceof PlanScreenElementView.Timeline)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanScreenElementView.Timeline timeline = (PlanScreenElementView.Timeline) domain;
        String str41 = timeline.f81109a;
        List<PlanScreenElementView.Timeline.Step> list8 = timeline.f81110b;
        ArrayList arrayList20 = new ArrayList(zhm.w.t(list8, 10));
        for (PlanScreenElementView.Timeline.Step step : list8) {
            arrayList20.add(new d.b0.a(step.f81111a, step.f81112b));
        }
        return new d.b0(str41, arrayList20);
    }

    public static com.revolut.feature.pricingplans.models.d p(String str) {
        com.revolut.feature.pricingplans.models.d dVar;
        if (str != null) {
            com.revolut.feature.pricingplans.models.d[] dVarArrValues = com.revolut.feature.pricingplans.models.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (a0.z(dVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return com.revolut.feature.pricingplans.models.d.CARD;
    }

    public final List a(String str, List list) {
        ArrayList arrayList;
        if (list != null) {
            List<bjk.j> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (bjk.j jVar : list2) {
                arrayList.add(new eha.a(jVar.getText(), jVar.getUrl()));
            }
        } else {
            arrayList = null;
        }
        return this.f206065a.a(str, arrayList);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f206065a.equals(((z) obj2).f206065a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Type inference failed for: r12v12, types: [hha.c] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.revolut.feature.pricingplans.models.PlanScreenElementView$CellBanner$Accessory] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [com.revolut.feature.pricingplans.models.b] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r24v0, types: [hha.c] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v36, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v57, types: [hha.c[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.revolut.feature.pricingplans.models.b[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.pricingplans.models.PlanScreenElementView h(bjk.d r26) {
        /*
            Method dump skipped, instruction units count: 2153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.z.h(bjk.d):com.revolut.feature.pricingplans.models.PlanScreenElementView");
    }

    public final int hashCode() {
        return this.f206065a.hashCode();
    }
}
