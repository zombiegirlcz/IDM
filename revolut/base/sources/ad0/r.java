package ad0;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendCard;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowWidgetProgression;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItem;
import com.revolut.feature.backend_flow.domain.models.TableItem;
import com.revolut.feature.backend_flow.domain.models.TableRowItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import com.revolut.feature.tickets.api.declaration.DetailedTicketsApi$Toggles$TicketorRevamp;
import ip0.s7;
import ip0.u40;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import yc0.f0;
import yp0.e0;
import zc0.i3;
import zc0.j3;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements p {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0.q f3221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc0.r f3222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3223c;
    public final w d;
    public final f0 e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f3224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9l.a f3225h;

    public r(yc0.q imageItemMapper, yc0.r infoListItemMapper, c backendCardMapper, w widgetProgressionItemMapper, f0 transactionCellItemMapper, h entitiesListItemMapper, n entitiesMapper, u9l.a sharedTransactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(infoListItemMapper, "infoListItemMapper");
        Intrinsics.checkNotNullParameter(backendCardMapper, "backendCardMapper");
        Intrinsics.checkNotNullParameter(widgetProgressionItemMapper, "widgetProgressionItemMapper");
        Intrinsics.checkNotNullParameter(transactionCellItemMapper, "transactionCellItemMapper");
        Intrinsics.checkNotNullParameter(entitiesListItemMapper, "entitiesListItemMapper");
        Intrinsics.checkNotNullParameter(entitiesMapper, "entitiesMapper");
        Intrinsics.checkNotNullParameter(sharedTransactionIconResourcesMapper, "sharedTransactionIconResourcesMapper");
        this.f3221a = imageItemMapper;
        this.f3222b = infoListItemMapper;
        this.f3223c = backendCardMapper;
        this.d = widgetProgressionItemMapper;
        this.e = transactionCellItemMapper;
        this.f = entitiesListItemMapper;
        this.f3224g = entitiesMapper;
        this.f3225h = sharedTransactionIconResourcesMapper;
    }

    public final List a(xl2.u item) {
        Object obj2;
        Object j3Var;
        v9l.a aVar;
        Image imageA;
        fr2.j jVar;
        Integer numValueOf;
        fr2.a aVar2;
        fr2.a aVar3;
        String str;
        int i;
        fr2.j jVar2;
        Intrinsics.checkNotNullParameter(item, "item");
        RowDelegate.Model model = null;
        image40 = null;
        RowDelegate.Model.MainImage.Image40 image40 = null;
        if (item instanceof ImageItem) {
            ImageItem imageItem = (ImageItem) item;
            Image imageA2 = this.f3221a.a(imageItem, 300);
            return zhm.v.l(imageA2 != null ? new uyl.q("ID_IMAGE_ITEM_" + imageItem, imageA2) : null);
        }
        if (item instanceof InfoListItem) {
            InfoListItem item2 = (InfoListItem) item;
            yc0.u uVar = (yc0.u) this.f3222b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(item2, "item");
            ArrayList arrayList = item2.e;
            xl2.m mVar = item2.f63496c;
            ArrayList arrayListA = uVar.a(arrayList, mVar, item2.d);
            String str2 = item2.f63495b;
            m70.a.c(t0.f186434a);
            if (!Intrinsics.f(str2, "") && str2 != null) {
                return yp0.b.g(arrayListA, new ListSubheaderDelegate.Model(j6.a.q("LIST_HEADER_ID_PREFIX_", item2.f63494a), (Image) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
            }
            yc0.u.c(arrayListA, mVar);
            return arrayListA;
        }
        if (item instanceof TransactionCellItem) {
            TransactionCellItem item3 = (TransactionCellItem) item;
            f0 f0Var = this.e;
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(item3, "item");
            v9l.a aVar4 = item3.d;
            if (aVar4 != null) {
                List listB = ((u9l.c) f0Var.f312421a).b(zhm.u.c(aVar4), new hbl.b(false), new pb0.h(item3, 1));
                if (listB != null) {
                    return listB;
                }
            }
            return zhm.f0.f322471a;
        }
        if (item instanceof CardCellItem) {
            BackendCard backendCard = ((CardCellItem) item).d;
            return zhm.v.l(backendCard != null ? ((d) this.f3223c).a(backendCard, null) : null);
        }
        if (!(item instanceof WidgetProgressionItem)) {
            if (item instanceof TableItem) {
                ArrayList<TableRowItem> arrayList2 = ((TableItem) item).f63674b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (TableRowItem tableRowItem : arrayList2) {
                    arrayList3.add(new CellDetailsDelegate.Model(tableRowItem.f63675a, new TextClause(tableRowItem.f63676b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(tableRowItem.f63677c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 3, null, null, null, null, 3, null, false, null, 0, 0, 0, 0, 1044392));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return arrayList3;
            }
            boolean z = item instanceof EntitiesListItem;
            j jVar3 = j.f3216a;
            if (z) {
                EntitiesListItem item4 = (EntitiesListItem) item;
                i iVar = (i) this.f;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(item4, "item");
                List list = item4.e;
                if (list == null) {
                    return zhm.f0.f322471a;
                }
                List listP = i2b.a.p(iVar.f3215a.d(item4, d0.V0(list, ebm.a.o(item4)), jVar3), list.size() == ebm.a.o(item4) ? new LargeActionButtonDelegate.Model(a0.d.r(item4.f63420a, "ExpandActionButton"), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.form_builder_entities_list_see_all, null, null, 14), false, null, null, item4, null, 744) : null);
                String str3 = item4.f63420a;
                String str4 = item4.f63422c;
                if (str4 != null) {
                    return yp0.b.g(listP, new ListSubheaderDelegate.Model(str3, (Image) null, (Clause) new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
                }
                yp0.b.k(listP, 0, 0, 0, 0, 31);
                return listP;
            }
            if (item instanceof EntityCellItem) {
                EntityCellItem entityCellItem = (EntityCellItem) item;
                List list2 = entityCellItem.f63432c;
                if (list2 == null || list2.size() != 1) {
                    r6.b.D("Incorrect size of BackendFlowEntity list for EntityCellItem");
                    return zhm.f0.f322471a;
                }
                xl2.r rVar = (xl2.r) d0.M0(list2);
                return rVar == null ? zhm.f0.f322471a : this.f3224g.d(entityCellItem, zhm.u.c(rVar), jVar3);
            }
            if (!(item instanceof EntitiesSummaryItem)) {
                throw new NoWhenBranchMatchedException();
            }
            EntitiesSummaryItem entitiesSummaryItem = (EntitiesSummaryItem) item;
            BackendEntitiesSummaryItem backendEntitiesSummaryItem = entitiesSummaryItem.f63429c;
            String str5 = entitiesSummaryItem.f63427a;
            if (backendEntitiesSummaryItem != null) {
                List list3 = entitiesSummaryItem.f63428b;
                Action action = list3 != null ? (Action) d0.d0(list3) : null;
                if (action != null) {
                    j3Var = new i3(str5, action);
                } else if (entitiesSummaryItem.e) {
                    j3Var = new j3(str5, entitiesSummaryItem.d);
                } else {
                    obj2 = null;
                    String str6 = entitiesSummaryItem.f63427a;
                    TextClause textClause = new TextClause(backendEntitiesSummaryItem.f63260a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause2 = new TextClause(backendEntitiesSummaryItem.f63261b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    aVar = entitiesSummaryItem.f;
                    if (aVar != null && (imageA = this.f3225h.a(aVar)) != null) {
                        image40 = new RowDelegate.Model.MainImage.Image40(imageA, null, null, false, null, false, 60);
                    }
                    RowDelegate.Model model2 = new RowDelegate.Model(str6, image40, textClause, null, 0, textClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532675544);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model = model2;
                }
                obj2 = j3Var;
                String str62 = entitiesSummaryItem.f63427a;
                TextClause textClause3 = new TextClause(backendEntitiesSummaryItem.f63260a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause22 = new TextClause(backendEntitiesSummaryItem.f63261b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                aVar = entitiesSummaryItem.f;
                if (aVar != null) {
                    image40 = new RowDelegate.Model.MainImage.Image40(imageA, null, null, false, null, false, 60);
                }
                RowDelegate.Model model22 = new RowDelegate.Model(str62, image40, textClause3, null, 0, textClause22, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532675544);
                yp0.b.l(model22, 0, 0, 0, 0, null, false, 63);
                model = model22;
            }
            return zhm.v.l(model);
        }
        WidgetProgressionItem item5 = (WidgetProgressionItem) item;
        z zVar = (z) this.d;
        Intrinsics.checkNotNullParameter(item5, "item");
        BackendFlowWidgetProgression backendFlowWidgetProgression = item5.f63722c;
        if (backendFlowWidgetProgression == null) {
            s7 s7Var = new s7(j6.a.q("ID_TICKETOR_PROGRESSION_PROGRESS_TITLE_", item5.f63721b), 0, 0, 0, 0, false, null, 126);
            IntRange intRange = new IntRange(1, 3, 1);
            ArrayList arrayList4 = new ArrayList(zhm.w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList4.add(new u40(a0.d.n("ID_PROGRESS_STEP_", it8.nextInt())));
            }
            return ue0.e.J(s7Var, arrayList4);
        }
        String str7 = backendFlowWidgetProgression.f63290a;
        int i2 = backendFlowWidgetProgression.f63292c;
        ArrayList<BackendFlowWidgetProgression.Step> arrayList5 = backendFlowWidgetProgression.f63291b;
        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
        for (BackendFlowWidgetProgression.Step step : arrayList5) {
            String str8 = step.f63293a;
            String str9 = step.f63294b;
            Long l2 = step.f63295c;
            com.revolut.feature.backend_flow.domain.models.c cVar = step.d;
            if (cVar != null) {
                int i3 = y.f3229a[cVar.ordinal()];
                if (i3 == 1) {
                    jVar2 = fr2.j.SOLID;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar2 = fr2.j.DASHED;
                }
                jVar = jVar2;
            } else {
                jVar = null;
            }
            com.revolut.feature.backend_flow.domain.models.b bVar = step.e;
            if (bVar != null) {
                switch (y.f3231c[bVar.ordinal()]) {
                    case 1:
                        i = R$attr.uikit_colorAccent;
                        break;
                    case 2:
                        i = R$attr.uikit_colorForeground;
                        break;
                    case 3:
                        i = R$attr.uikit_colorGrey50;
                        break;
                    case 4:
                        i = R$attr.uikit_colorGrey20;
                        break;
                    case 5:
                        i = R$attr.uikit_colorGrey20;
                        break;
                    case 6:
                        i = R$attr.uikit_colorPink;
                        break;
                    case 7:
                        i = R$attr.uikit_colorOrange;
                        break;
                    case 8:
                        i = R$attr.uikit_colorWhite;
                        break;
                    case 9:
                        i = R$attr.uikit_colorRed;
                        break;
                    case 10:
                        i = R$attr.uikit_colorBlack;
                        break;
                    case 11:
                        i = R$attr.uikit_colorBlue;
                        break;
                    case 12:
                        i = R$attr.uikit_colorGreen;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(i);
            } else {
                numValueOf = null;
            }
            String str10 = step.f;
            BackendFlowWidgetProgression.Step.Action action2 = step.f63296g;
            FincrimeHomeScreenAction.Deeplink deeplink = (action2 == null || (str = action2.f63298a) == null) ? null : new FincrimeHomeScreenAction.Deeplink(str);
            com.revolut.feature.backend_flow.domain.models.a aVar5 = step.f63297h;
            if (aVar5 != null) {
                int i5 = y.f3230b[aVar5.ordinal()];
                if (i5 == 1) {
                    aVar3 = fr2.a.INLINE;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3 = fr2.a.BUTTON;
                }
                aVar2 = aVar3;
            } else {
                aVar2 = null;
            }
            arrayList6.add(new Step(str8, str9, l2, jVar, numValueOf, deeplink, str10, aVar2));
        }
        return ((yxc.r) zVar.f3232a).d(new SectionContent.ProgressionSteps(str7, null, arrayList6, i2, fr2.k.ALWAYS_BLUE, null), ((jte.d) zVar.f3233b.f258135a.f125269a).c(DetailedTicketsApi$Toggles$TicketorRevamp.f90443c));
    }
}
