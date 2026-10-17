package ib7;

import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.youTransactor.uCube.rpc.Constants;
import fb7.w;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import yhm.r;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.tab.accounts.impl.ui.spaces.a f160108a;

    public b(com.revolut.feature.tab.accounts.impl.ui.spaces.a accountSpacesCellsMapper) {
        Intrinsics.checkNotNullParameter(accountSpacesCellsMapper, "accountSpacesCellsMapper");
        this.f160108a = accountSpacesCellsMapper;
    }

    @Override // ib7.i
    public final h a(fb7.j domain) {
        r rVar;
        Pair pair;
        boolean z;
        Set set;
        int i;
        int i2;
        List list;
        int i3;
        int i5;
        b bVar = this;
        Intrinsics.checkNotNullParameter(domain, "domain");
        na7.b bVar2 = domain.f133484c;
        boolean z3 = domain.d;
        Set set2 = domain.e;
        fb7.n nVar = domain.f133482a;
        boolean z4 = nVar instanceof fb7.m;
        fb7.k kVar = nVar instanceof fb7.k ? (fb7.k) nVar : null;
        Iterable iterable = kVar != null ? kVar.f133487a : null;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = iterable.iterator();
        while (true) {
            int i6 = 1;
            if (!it8.hasNext()) {
                na7.b bVar3 = bVar2;
                boolean z6 = z3;
                boolean zIsEmpty = arrayList.isEmpty();
                if (z4) {
                    return new g(iii.c.c(5));
                }
                if (!zIsEmpty) {
                    return new e(arrayList);
                }
                if (z6 || domain.f133485g) {
                    int i21 = a.f160107b[bVar3.ordinal()];
                    if (i21 == 1) {
                        rVar = new r(Integer.valueOf(R$string.secret_accounts_screen_list_empty_state_description), Integer.valueOf(R$string.secret_accounts_screen_list_empty_state_title), Integer.valueOf(R$string.secret_accounts_screen_list_empty_state_action));
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVar = new r(Integer.valueOf(R$string.hidden_accounts_screen_list_empty_state_title), Integer.valueOf(R$string.hidden_accounts_screen_list_empty_state_security_description), Integer.valueOf(R$string.hidden_accounts_screen_list_empty_state_security_action));
                    }
                    List listC = u.c(new FullScreenStateDelegate.Model("HIDDEN_ACCOUNTS_EMPTY_LIST_ID", new TextLocalisedClause(((Number) rVar.f314201a).intValue(), null, null, 14), new TextLocalisedClause(((Number) rVar.f314202b).intValue(), null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_wallet, null, null, 6)), !z6 ? new l6(12, new TextLocalisedClause(((Number) rVar.f314203c).intValue(), null, null, 14), null, h4.ACCENT) : null, null, false, null, null, null, YearClass.CLASS_2016));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return new f(listC);
                }
                int i22 = a.f160107b[bVar3.ordinal()];
                if (i22 == 1) {
                    pair = new Pair(Integer.valueOf(R$string.secret_accounts_screen_list_empty_state_description), Integer.valueOf(R$string.secret_accounts_screen_list_empty_state_only_main_account_subtitle_html));
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(R$string.hidden_accounts_screen_list_empty_state_title), Integer.valueOf(R$string.hidden_accounts_screen_list_empty_state_only_main_account_subtitle_html));
                }
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iIntValue, null, null, 14);
                od0.a aVar = od0.a.f224253a;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                List listC2 = u.c(od0.a.e() ? "af56d626-7076-404d-9bcf-30a1cbb549e7" : "7b4c8719-d513-499d-89f5-4a8a38f81db9");
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                List listC3 = u.c(new FullScreenStateDelegate.Model("HIDDEN_ACCOUNTS_EMPTY_LIST_ID", textLocalisedClause, new HtmlLocalisedClause(iIntValue2, listC2, (Integer) null, new w(od0.a.e() ? "af56d626-7076-404d-9bcf-30a1cbb549e7" : "7b4c8719-d513-499d-89f5-4a8a38f81db9"), 12), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_wallet, null, null, 6)), null, null, false, null, null, false, 0, 0, 32752));
                yp0.b.k(listC3, 0, 0, 0, 0, 31);
                return new f(listC3);
            }
            SpaceContentModel spaceContentModel = (SpaceContentModel) it8.next();
            List list2 = spaceContentModel.f89558c;
            ProductSpaceIdentifier productSpaceIdentifier = spaceContentModel.f89556a;
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            int i32 = 0;
            for (Object obj2 : list3) {
                int i33 = i32 + 1;
                if (i32 < 0) {
                    v.s();
                    throw null;
                }
                SubSpaceContentModel subSpaceContentModel = (SubSpaceContentModel) obj2;
                na7.b bVar4 = bVar2;
                qv0.k kVar2 = list2.size() == i6 ? qv0.k.Single : i32 == 0 ? qv0.k.Top : i32 == list2.size() - i6 ? qv0.k.Bottom : qv0.k.Middle;
                if (subSpaceContentModel instanceof SubSpaceContentModel.FlatSubSpaceContentModel) {
                    ArrayList arrayListB = bVar.b(subSpaceContentModel, z3, set2);
                    int[] iArr = a.f160106a;
                    switch (iArr[kVar2.ordinal()]) {
                        case 1:
                        case 2:
                            i3 = R$attr.uikit_dp4;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i3 = R$attr.uikit_dp8;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    int i43 = i3;
                    switch (iArr[kVar2.ordinal()]) {
                        case 1:
                        case 3:
                            i5 = R$attr.uikit_dp4;
                            break;
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                            i5 = R$attr.uikit_dp8;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    yp0.b.k(arrayListB, i43, i5, 0, 0, 28);
                    z = z3;
                    set = set2;
                    list = arrayListB;
                } else {
                    if (!(subSpaceContentModel instanceof SubSpaceContentModel.GroupedSubSpaceContentModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SubSpaceContentModel.GroupedSubSpaceContentModel groupedSubSpaceContentModel = (SubSpaceContentModel.GroupedSubSpaceContentModel) subSpaceContentModel;
                    boolean z11 = groupedSubSpaceContentModel.f89564b;
                    pie.v vVar = groupedSubSpaceContentModel.e;
                    qv0.k kVar3 = kVar2;
                    z = z3;
                    set = set2;
                    List listQ = i2b.a.q(new CellDetailsDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(productSpaceIdentifier.f89741a.getId(), "_", vVar.getId()), groupedSubSpaceContentModel.f89565c, false, new ImageClause(z11 ? R$drawable.uikit_icn_24_chevron_down : R$drawable.uikit_icn_24_chevron_up, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (Float) null, (Float) null, 28), null, null, null, true, new fb7.u(productSpaceIdentifier, vVar), null, 0, 134168532), z11 ? f0.f322471a : bVar.b(groupedSubSpaceContentModel, z3, set2));
                    int[] iArr2 = a.f160106a;
                    switch (iArr2[kVar3.ordinal()]) {
                        case 1:
                        case 2:
                            i = R$attr.uikit_dp4;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i = R$attr.uikit_dp8;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    int i59 = i;
                    switch (iArr2[kVar3.ordinal()]) {
                        case 1:
                        case 3:
                            i2 = R$attr.uikit_dp4;
                            break;
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                            i2 = R$attr.uikit_dp8;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    yp0.b.k(listQ, i59, i2, 0, 0, 28);
                    list = listQ;
                }
                arrayList2.add(list);
                bVar = this;
                bVar2 = bVar4;
                i32 = i33;
                z3 = z;
                set2 = set;
                i6 = 1;
            }
            na7.b bVar5 = bVar2;
            boolean z12 = z3;
            Set set3 = set2;
            aim.e eVarB = u.b();
            if (spaceContentModel.f89557b != null) {
                eVarB.add(new ListSubheaderDelegate.Model(productSpaceIdentifier.f89741a.getId(), (Image) null, spaceContentModel.f89557b, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) spaceContentModel.f89556a, (Parcelable) null, 0, 0, 0, 0, 64506));
            }
            eVarB.addAll(zhm.w.u(arrayList2));
            a0.x(u.a(eVarB), arrayList);
            bVar = this;
            bVar2 = bVar5;
            z3 = z12;
            set2 = set3;
        }
    }

    public final ArrayList b(SubSpaceContentModel subSpaceContentModel, boolean z, Set set) {
        List<SubSpaceAccountItem> f = subSpaceContentModel.getF();
        ArrayList arrayList = new ArrayList();
        for (SubSpaceAccountItem subSpaceAccountItem : f) {
            ProductAccount productAccount = subSpaceAccountItem.f89560b;
            ProductContext productContext = subSpaceAccountItem.f89559a;
            Object model = null;
            ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
            if (main != null) {
                ProductAccountId productAccountId = main.f89504c;
                com.revolut.feature.tab.accounts.impl.ui.spaces.a aVar = this.f160108a;
                model = z ? new SelectableDelegate.Model(j6.a.q("SELECTABLE_DELEGATE_LIST_ID_", productAccountId.f89729a), zfe.a.a(aVar, productContext, main, new fb7.v(com.revolut.feature.tab.accounts.api.model.a.c(main, productContext.f89553a, productAccountId))), set.contains(productAccountId.f89729a) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760) : new wh(j6.a.q("SWIPE_TO_ACTION_DELEGATE_LIST_ID_", productAccountId.f89729a), zfe.a.a(aVar, productContext, main, new fb7.v(com.revolut.feature.tab.accounts.api.model.a.c(main, productContext.f89553a, productAccountId))), u.c(new SwipeToActionDelegate.SwipeAction("UNHIDE_ACTION_ID", new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.hidden_accounts_action_unhide, null, null, 14), null, null, null, null, SyslogConstants.LOG_CLOCK)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
        return arrayList;
    }
}
