package nz7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.n1;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_change.AddressChangePriceReviewContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported.AddressNotSupportedContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.overduepayment.OverduePaymentContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.youTransactor.uCube.rpc.Constants;
import ip0.k4;
import ip0.vd;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lz7.a;
import mif.e0;
import yx7.s;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;
import zw7.d0;
import zw7.d1;
import zw7.e1;
import zw7.f0;
import zw7.f1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f220976b;

    public /* synthetic */ f(p pVar, int i) {
        this.f220975a = i;
        this.f220976b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigTileDelegate.b bVar;
        Iterable iterableC;
        CdnImage cdnImageA;
        ActivityNavigateCommand activityNavigateCommand;
        switch (this.f220975a) {
            case 0:
                d0 pet = (d0) obj2;
                Intrinsics.checkNotNullParameter(pet, "pet");
                vy7.m mVar = (vy7.m) this.f220976b.f220987l;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pet, "pet");
                ln.a aVar = mVar.f293257b;
                n08.i.Companion.getClass();
                return aVar.a(new ActivityNavigateCommand(n08.c.f210886b, new PetProfileContract$Configuration(pet.f325764a), null, null, 0, null, null, null, null, false, 1020));
            case 1:
                oz7.b model = (oz7.b) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                oz7.d dVar = this.f220976b.f220988m;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                List list = model.f231116a;
                od0.i iVar = model.f231118c;
                List list2 = model.f231117b;
                List list3 = list;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                int i = 0;
                while (true) {
                    TextClause textClause = null;
                    if (!it8.hasNext()) {
                        if (list2.isEmpty()) {
                            f1 promotion = (f1) iVar.f224257a;
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_empty_large_tile_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorBlack), false, null, false, null, 254), 10);
                            CdnImage cdnImage = new CdnImage("big_tile", "mobile/pet/rev_10/onboarding", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                            k4 k4Var = new k4(R$attr.uikit_colorElevatedBackground, new TextLocalisedClause(R$string.pets_dashboard_empty_large_tile_caption, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.pets_dashboard_empty_large_tile_action_button_title, null, null, 14));
                            if (promotion != null) {
                                e1 e1Var = promotion.f325783b;
                                Intrinsics.checkNotNullParameter(promotion, "promotion");
                                d1 icon = e1Var.f325777b;
                                Intrinsics.checkNotNullParameter(icon, "icon");
                                bVar = new BigTileDelegate.b(null, new n1(new ms0.k(new TextClause(e1Var.f325776a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(s.a(icon), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), 1);
                            } else {
                                bVar = null;
                            }
                            BigTileDelegate.Model model2 = new BigTileDelegate.Model("ID_PET_HUB_BIG_TILE_ITEM", textLocalisedClause, cdnImage, null, null, false, k4Var, bVar, null, null, null, null, null, null, null, 33550452);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            iterableC = u.c(model2);
                        } else {
                            f1 f1Var = (f1) iVar.f224257a;
                            aim.e eVarB = u.b();
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list4) {
                                if (e0.o((d0) obj3) == ky7.c.ACTIVE) {
                                    arrayList2.add(obj3);
                                }
                            }
                            a0.x(dVar.a(arrayList2, "ID_SECTION_ACTIVE_SUBHEADER_ITEM", R$string.pets_dashboard_pet_tile_status_active, f1Var), eVarB);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list4) {
                                if (e0.o((d0) obj4) == ky7.c.IN_PROGRESS) {
                                    arrayList3.add(obj4);
                                }
                            }
                            a0.x(dVar.a(arrayList3, "ID_SECTION_IN_PROGRESS_SUBHEADER_ITEM", R$string.pets_dashboard_pet_tile_status_in_progress, f1Var), eVarB);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list4) {
                                if (e0.o((d0) obj5) == ky7.c.CANCELLED) {
                                    arrayList4.add(obj5);
                                }
                            }
                            a0.x(dVar.a(arrayList4, "ID_SECTION_CANCELLED_SUBHEADER_ITEM", R$string.pets_dashboard_pet_tile_status_inactive, f1Var), eVarB);
                            iterableC = u.a(eVarB);
                        }
                        return new Pair(model, zhm.d0.E0(iterableC, arrayList));
                    }
                    Object next = it8.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    f0 notification = (f0) next;
                    String strN = a0.d.n("ID_PREFIX_NOTIFICATION_ITEM_", i);
                    Intrinsics.checkNotNullParameter(notification, "notification");
                    switch (yx7.j.f317591a[notification.f325779a.ordinal()]) {
                        case 1:
                            cdnImageA = yx7.i.a("3D075");
                            break;
                        case 2:
                            cdnImageA = yx7.i.a("3D103");
                            break;
                        case 3:
                            cdnImageA = yx7.i.a("3D075");
                            break;
                        case 4:
                            cdnImageA = yx7.i.a("3D036");
                            break;
                        case 5:
                            cdnImageA = yx7.i.a("3D026");
                            break;
                        case 6:
                            cdnImageA = yx7.i.a("3D075");
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ComplexImage.Regular regular = new ComplexImage.Regular(cdnImageA);
                    TextClause textClause2 = new TextClause(notification.f325780b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str = notification.f325781c;
                    if (str != null) {
                        textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    BannerDelegate.Model model3 = new BannerDelegate.Model(strN, regular, textClause2, c8g.c.p(textClause), true, false, notification, null, null, null, null, 65408);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model3);
                    i = i2;
                }
                break;
            case 2:
                BannerDelegate.Model banner = (BannerDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(banner, "banner");
                Object obj6 = banner.k;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.PetNotification");
                f0 notification2 = (f0) obj6;
                zw7.e0 e0Var = notification2.f325779a;
                zw7.e0 e0Var2 = zw7.e0.PURCHASE_REMINDER;
                p pVar = this.f220976b;
                if (e0Var == e0Var2) {
                    return pVar.o.c0(a.b.f200943a);
                }
                vy7.m mVar2 = (vy7.m) pVar.f220987l;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(notification2, "notification");
                ln.a aVar2 = mVar2.f293257b;
                Intrinsics.checkNotNullParameter(notification2, "notification");
                switch (kz7.a.f191066a[e0Var.ordinal()]) {
                    case 1:
                        dz7.i.Companion.getClass();
                        activityNavigateCommand = new ActivityNavigateCommand(dz7.b.f121267b, new OverduePaymentContract$Configuration("PET_HUB_FLOW"), null, null, 0, null, null, null, null, false, 1020);
                        break;
                    case 2:
                        xy7.h.Companion.getClass();
                        activityNavigateCommand = new ActivityNavigateCommand(xy7.e.f309630b, new AddressChangePriceReviewContract$Configuration("PET_HUB_FLOW"), null, null, 0, null, null, null, null, false, 1020);
                        break;
                    case 3:
                        az7.d.Companion.getClass();
                        activityNavigateCommand = new ActivityNavigateCommand(az7.a.f11396b, new AddressNotSupportedContract$Configuration("PET_HUB_FLOW"), null, null, 0, null, null, null, null, false, 1020);
                        break;
                    case 4:
                        throw new UnsupportedOperationException(e0Var2 + " is not supposed to have a related navigation command, please review the flow");
                    case 5:
                        activityNavigateCommand = kz7.b.a();
                        break;
                    case 6:
                        activityNavigateCommand = kz7.b.a();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return aVar2.a(activityNavigateCommand);
            case 3:
                vd clickData = (vd) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f166806a.f54184a, "REMINDER_DATE_PICKER_CALENDAR_ITEM_LIST_ID")) {
                    return pfm.m.f235744a;
                }
                return this.f220976b.o.c0(new lz7.b(ebm.a.D(clickData.f166807b)));
            case 4:
                mm.d dVar2 = this.f220976b.o;
                LargeActionButtonDelegate.Model model4 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                if (!Intrinsics.f(model4.f52613a, "REMINDER_DATE_PICKER_LARGE_ACTION_BUTTON_ITEM_LIST_ID")) {
                    return pfm.m.f235744a;
                }
                Object obj7 = model4.i;
                Intrinsics.i(obj7, "null cannot be cast to non-null type java.util.Date");
                return dVar2.c0(a.C1141a.f200942a).e(dVar2.c0(new lz7.c((Date) obj7)));
            case 5:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (Intrinsics.f(it9, "ID_MENU_ADD_PET")) {
                    return ((vy7.m) this.f220976b.f220987l).a();
                }
                pfm.m mVar3 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                return mVar3;
            default:
                Intrinsics.checkNotNullParameter((BigTileDelegate.Model) obj2, "it");
                ln.a aVar3 = ((vy7.m) this.f220976b.f220987l).f293257b;
                nx7.g.Companion.getClass();
                return aVar3.a(new ActivityNavigateCommand(nx7.a.f220445b, null, null, null, 0, null, null, null, null, false, 1022));
        }
    }
}
