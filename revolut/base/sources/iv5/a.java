package iv5;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.q;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.youTransactor.uCube.rpc.Constants;
import ip0.nb0;
import ip0.pb0;
import ip0.xh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    private static final C0950a Companion = new C0950a();

    /* JADX INFO: renamed from: iv5.a$a, reason: collision with other inner class name */
    public static final class C0950a {
        private C0950a() {
        }
    }

    public static ArrayList a(List list, boolean z, int i, Parcelable parcelable) {
        int i2 = i;
        if (i2 < 0) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SplitAccountsGroupsMapper", j6.a.l(i2, "Negative items limit ", " was clamped to 0"), null, h0Var);
            i2 = 0;
        }
        if (i2 == 999 || list.size() <= i2) {
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                a0.x(d((SplitAccountsItemGroup.Item) it8.next()), arrayList);
            }
            return arrayList;
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                a0.x(d((SplitAccountsItemGroup.Item) it9.next()), arrayList2);
            }
            return d0.F0(new LargeActionButtonDelegate.Model("CryptoInvestmentsWidgetContract.SEE_LESS_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.crypto_home_portfolio_button_show_less, null, null, 14), false, null, null, parcelable, null, 744), arrayList2);
        }
        List listV0 = d0.V0(list, i2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = listV0.iterator();
        while (it10.hasNext()) {
            a0.x(d((SplitAccountsItemGroup.Item) it10.next()), arrayList3);
        }
        return d0.F0(new LargeActionButtonDelegate.Model("CryptoInvestmentsWidgetContract.SHOW_MORE_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.crypto_home_portfolio_button_show_more, null, null, 14), false, null, null, parcelable, null, 744), arrayList3);
    }

    public static List c(SplitAccountsItemGroup splitAccountsItemGroup) {
        List listC;
        List listC2;
        if (Intrinsics.f(splitAccountsItemGroup, SplitAccountsItemGroup.Empty.f71455a)) {
            return f0.f322471a;
        }
        if (splitAccountsItemGroup instanceof SplitAccountsItemGroup.ErrorGroup) {
            SplitAccountsItemGroup.ErrorItem errorItem = ((SplitAccountsItemGroup.ErrorGroup) splitAccountsItemGroup).f71456a;
            boolean z = errorItem.f71457a;
            String str = errorItem.f71459c;
            if (str == null) {
                str = "ERROR_STATE_ID";
            }
            return iii.c.a(str, z, errorItem.f71458b);
        }
        if (splitAccountsItemGroup instanceof SplitAccountsItemGroup.LoadingGroup) {
            SplitAccountsItemGroup.LoadingGroup loadingGroup = (SplitAccountsItemGroup.LoadingGroup) splitAccountsItemGroup;
            List list = loadingGroup.f71470a;
            boolean z3 = loadingGroup.f71472c;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                a0.x(d((SplitAccountsItemGroup.LoadingItem) it8.next()), arrayList);
            }
            SplitAccountsItemGroup.RowItem rowItem = loadingGroup.f71471b;
            if (rowItem == null) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            }
            qv0.l header = e(rowItem, Boolean.valueOf(z3));
            if (z3) {
                listC2 = i26.l.d(header, arrayList, header, arrayList.size());
            } else {
                Intrinsics.checkNotNullParameter(header, "header");
                listC2 = u.c(header);
            }
            List list2 = listC2;
            yp0.b.k(list2, 0, 0, 0, 0, 15);
            return list2;
        }
        if (splitAccountsItemGroup instanceof SplitAccountsItemGroup.ItemsGroup) {
            SplitAccountsItemGroup.ItemsGroup itemsGroup = (SplitAccountsItemGroup.ItemsGroup) splitAccountsItemGroup;
            ArrayList arrayListA = a(itemsGroup.f71467a, itemsGroup.f71468b, itemsGroup.f71469c, itemsGroup.d);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            return arrayListA;
        }
        if (!(splitAccountsItemGroup instanceof SplitAccountsItemGroup.GroupWithHeader)) {
            if (!(splitAccountsItemGroup instanceof SplitAccountsItemGroup.GroupWithActionHeader)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SplitAccountsGroupsMapper", "Use mapActionHeaderGroup to map an action header group", null, h0Var);
            return f0.f322471a;
        }
        SplitAccountsItemGroup.GroupWithHeader groupWithHeader = (SplitAccountsItemGroup.GroupWithHeader) splitAccountsItemGroup;
        aim.e eVarB = u.b();
        List list3 = groupWithHeader.f71464c;
        boolean z4 = groupWithHeader.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            a0.x(d((SplitAccountsItemGroup.Item) it9.next()), arrayList2);
        }
        eVarB.addAll(arrayList2);
        eVarB.addAll(a(groupWithHeader.d, groupWithHeader.f71465g, groupWithHeader.f71466h, groupWithHeader.i));
        aim.e eVarA = u.a(eVarB);
        qv0.l header2 = e(groupWithHeader.f71463b, Boolean.valueOf(z4));
        if (z4) {
            aim.e eVarD = i26.l.d(header2, eVarA, header2, eVarA.size());
            List list4 = groupWithHeader.e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it10 = list4.iterator();
            while (it10.hasNext()) {
                List listD = d((SplitAccountsItemGroup.Item) it10.next());
                ArrayList arrayList4 = new ArrayList();
                Iterator it11 = listD.iterator();
                while (it11.hasNext()) {
                    a0.x(i26.l.e((qv0.l) it11.next(), f0.f322471a), arrayList4);
                }
                a0.x(arrayList4, arrayList3);
            }
            listC = d0.E0(arrayList3, eVarD);
        } else {
            Intrinsics.checkNotNullParameter(header2, "header");
            listC = u.c(header2);
        }
        List list5 = listC;
        yp0.b.k(list5, 0, 0, 0, 0, 15);
        return list5;
    }

    public static List d(SplitAccountsItemGroup.Item item) {
        if (item instanceof SplitAccountsItemGroup.RowItem) {
            return u.c(e((SplitAccountsItemGroup.RowItem) item, null));
        }
        if (item instanceof SplitAccountsItemGroup.LoadingItem) {
            SplitAccountsItemGroup.LoadingItem loadingItem = (SplitAccountsItemGroup.LoadingItem) item;
            return u.c(nb0.b(pb0.Companion, loadingItem.f71473a, loadingItem.f71474b, 0, loadingItem.f71475c, 20));
        }
        if (!(item instanceof SplitAccountsItemGroup.ErrorItem)) {
            throw new NoWhenBranchMatchedException();
        }
        SplitAccountsItemGroup.ErrorItem errorItem = (SplitAccountsItemGroup.ErrorItem) item;
        boolean z = errorItem.f71457a;
        String str = errorItem.f71459c;
        if (str == null) {
            str = "ERROR_STATE_ID";
        }
        return iii.c.a(str, z, errorItem.f71458b);
    }

    public static qv0.l e(SplitAccountsItemGroup.RowItem rowItem, Boolean bool) {
        RowDelegate.Model.c bVar;
        xh0 xh0Var;
        SplitAccountsItemGroup.RowItem.Value value = rowItem.f;
        List list = rowItem.i;
        String str = rowItem.f71476a;
        Clause clause = rowItem.f71478c;
        Image image = rowItem.d;
        mf mfVar = image != null ? new mf(image, false) : null;
        Clause clause2 = rowItem.e;
        tf tfVar = null;
        RowDelegate.Model.MainImage mainImage = rowItem.f71477b;
        if (bool != null) {
            yy0.i iVar = yy0.l.Companion;
            ResourceImage resourceImage = new ResourceImage(bool.booleanValue() ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            bVar = new tf(yy0.i.a(resourceImage));
        } else {
            if (value instanceof SplitAccountsItemGroup.RowItem.Value.TrailingImage) {
                yy0.i iVar2 = yy0.l.Companion;
                Image image2 = ((SplitAccountsItemGroup.RowItem.Value.TrailingImage) value).f71484a;
                iVar2.getClass();
                tfVar = new tf(yy0.i.a(image2));
            } else if (value instanceof SplitAccountsItemGroup.RowItem.Value.Texts) {
                SplitAccountsItemGroup.RowItem.Value.Texts texts = (SplitAccountsItemGroup.RowItem.Value.Texts) value;
                bVar = new RowDelegate.Model.c.b(texts.f71482a, texts.f71483b, null, false, 124);
            }
            bVar = tfVar;
        }
        RowDelegate.Model model = new RowDelegate.Model(str, mainImage, clause, null, 0, clause2, null, null, 0, bVar, rowItem.f71480h, null, false, rowItem.f71479g ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, mfVar, null, null, null, rowItem.f71481j, null, 0, 0, 0, 0, 532591576);
        if (list.isEmpty()) {
            return model;
        }
        String str2 = rowItem.f71476a;
        List<SplitAccountsItemGroup.SwipeAction> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (SplitAccountsItemGroup.SwipeAction swipeAction : list2) {
            String str3 = swipeAction.f71485a;
            Image image3 = swipeAction.f71486b;
            Clause clause3 = swipeAction.f71487c;
            int i = b.f168721a[swipeAction.d.ordinal()];
            if (i == 1) {
                xh0Var = xh0.PRIMARY;
            } else if (i == 2) {
                xh0Var = xh0.NEUTRAL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                xh0Var = xh0.NEGATIVE;
            }
            arrayList.add(new SwipeToActionDelegate.SwipeAction(str3, image3, clause3, xh0Var, null, swipeAction.e, null, 80));
        }
        return new wh(str2, model, arrayList, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ArrayList b(List groups) {
        List listC;
        Intrinsics.checkNotNullParameter(groups, "groups");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = groups.iterator();
        while (it8.hasNext()) {
            SplitAccountsItemGroup splitAccountsItemGroup = (SplitAccountsItemGroup) it8.next();
            if (splitAccountsItemGroup instanceof SplitAccountsItemGroup.GroupWithActionHeader) {
                SplitAccountsItemGroup.GroupWithActionHeader groupWithActionHeader = (SplitAccountsItemGroup.GroupWithActionHeader) splitAccountsItemGroup;
                aim.e eVarB = u.b();
                SplitAccountsItemGroup.ActionHeaderItem actionHeaderItem = groupWithActionHeader.f71460a;
                String str = actionHeaderItem.f71452a;
                Clause clause = actionHeaderItem.f71453b;
                Clause clause2 = actionHeaderItem.f71454c;
                com.revolut.core.ui_kit.delegates.m mVar = new com.revolut.core.ui_kit.delegates.m(actionHeaderItem.d, (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10);
                q qVar = q.REGULAR;
                eVarB.add(new ActionWidgetDelegate.Model(str, clause, clause2, mVar, new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.j(actionHeaderItem.e, null, 14), qVar, actionHeaderItem.f, null, false, 7936));
                List listC2 = c(groupWithActionHeader.f71461b);
                i26.l.E(listC2);
                eVarB.addAll(listC2);
                listC = u.a(eVarB);
                yp0.b.k(listC, 0, 0, 0, 0, 31);
            } else {
                listC = c(splitAccountsItemGroup);
            }
            a0.x(listC, arrayList);
        }
        return arrayList;
    }
}
