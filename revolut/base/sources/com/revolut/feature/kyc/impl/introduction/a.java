package com.revolut.feature.kyc.impl.introduction;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenItem;
import com.youTransactor.uCube.rpc.Constants;
import gz0.b;
import ip0.ak0;
import ip0.qe0;
import ip0.we0;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import pw8.m;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntroductionScreenContract$InputData f77838a;

    public a(IntroductionScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f77838a = input;
    }

    @Override // cli.n
    public final o c(j jVar) {
        we0 we0Var;
        boolean z;
        List listC;
        IntroductionScreenContract$State domainState = (IntroductionScreenContract$State) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        IntroductionScreenContract$InputData introductionScreenContract$InputData = this.f77838a;
        List list = introductionScreenContract$InputData.f77824a;
        Integer num = introductionScreenContract$InputData.f77828h;
        boolean z3 = domainState.f77829a;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof IntroductionScreenItem.ImageItem) {
                arrayList.add(obj2);
            }
        }
        IntroductionScreenItem.ImageItem imageItem = (IntroductionScreenItem.ImageItem) d0.d0(arrayList);
        ArrayList<IntroductionScreenItem.ListCellItem> arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof IntroductionScreenItem.ListCellItem) {
                arrayList2.add(obj3);
            }
        }
        ArrayList<IntroductionScreenItem.ProductSelectionItem> arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof IntroductionScreenItem.ProductSelectionItem) {
                arrayList3.add(obj4);
            }
        }
        if (imageItem != null) {
            String str = imageItem.f77831b;
            String str2 = imageItem.f77830a;
            b bVar = b.Undefined;
            Integer numValueOf = Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST);
            we0Var = new we0(str, new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c(str2, new ImageTransformations(null, null, null, bVar, null, numValueOf, numValueOf, 23), UrlImageDrawable.Shimmering.INSTANCE, null, 24)));
        } else {
            we0Var = null;
        }
        List listL = v.l(we0Var);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
        for (IntroductionScreenItem.ListCellItem listCellItem : arrayList2) {
            arrayList4.add(new ListCellDelegate.Model(listCellItem.d, new j8(new ResourceImage(listCellItem.f77832a, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), listCellItem.f77833b, listCellItem.f77834c, false, null, null, 0, 0, 0, 0, 4064));
        }
        int i = R$attr.uikit_dp0;
        yp0.b.k(arrayList4, i, i, 0, 0, 28);
        ArrayList arrayListE0 = d0.E0(arrayList4, listL);
        ArrayList arrayList5 = new ArrayList(w.t(arrayList3, 10));
        for (IntroductionScreenItem.ProductSelectionItem productSelectionItem : arrayList3) {
            String str3 = productSelectionItem.f;
            Clause clause = productSelectionItem.f77835a;
            Clause clause2 = productSelectionItem.f77836b;
            dc dcVar = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c(productSelectionItem.f77837c, null, null, null, 30));
            Integer num2 = productSelectionItem.d;
            Integer num3 = productSelectionItem.e;
            if (num2 == null || num3 == null) {
                z = z3;
                listC = f0.f322471a;
            } else {
                z = z3;
                listC = u.c(new pc("product-selection-item-tag", new TagViewData(new ResourceImage(num2.intValue(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOnAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(num3.intValue(), null, new Custom(Integer.valueOf(R$attr.uikit_colorOnAccent), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorAccent), R$attr.uikit_colorTransparent, null, 1000), null));
            }
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(str3, dcVar, clause, clause2, listC, null, null, false, false, false, 992);
            yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
            arrayList5.add(model);
            z3 = z;
        }
        boolean z4 = z3;
        ArrayList arrayListE02 = d0.E0(v.l(num != null ? new TextDelegate.Model("LIST_ITEM_ID_FOOTER", new TextLocalisedClause(num.intValue(), null, new Custom(Integer.valueOf(z4 ? R$attr.uikit_colorTransparent : R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null), d0.E0(arrayList5, arrayListE0));
        Clause clause3 = introductionScreenContract$InputData.f77825b;
        Clause clause4 = introductionScreenContract$InputData.f77826c;
        Clause clause5 = introductionScreenContract$InputData.d;
        return new pw8.j(arrayListE02, clause3, clause4, clause5, clause5 != null);
    }
}
