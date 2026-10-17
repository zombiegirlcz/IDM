package lbh;

import bw0.m;
import com.google.android.gms.common.util.GmsVersion;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import fo3.c;
import h30.l;
import io3.d;
import ip0.ij;
import ip0.nf0;
import ip0.o9;
import ip0.of0;
import ip0.p9;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kii.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import lc0.j;
import ldk.f;
import ldk.x;
import le.u1;
import lw0.h;
import m1c.e1;
import m1c.f1;
import ngm.n;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import pcd.s;
import uam.i;
import xi0.b;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193687a;

    public /* synthetic */ a(int i) {
        this.f193687a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        Optional optionalOf;
        Object next = null;
        switch (this.f193687a) {
            case 0:
                c it8 = (c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.d;
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    if (l.D(b.Companion, ((d) obj3).f163147c)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 2:
                Iterable CameraConfiguration = (Iterable) obj2;
                CardPhotoScreen.Companion aVar = CardPhotoScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(CameraConfiguration, "$this$CameraConfiguration");
                Iterator it9 = CameraConfiguration.iterator();
                if (it9.hasNext()) {
                    next = it9.next();
                    if (it9.hasNext()) {
                        int iAbs = Math.abs(GmsVersion.VERSION_LONGHORN - ((i) next).a());
                        do {
                            Object next2 = it9.next();
                            int iAbs2 = Math.abs(GmsVersion.VERSION_LONGHORN - ((i) next2).a());
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (it9.hasNext());
                    }
                }
                return (i) next;
            case 3:
                CardPhotoScreen.Companion aVar2 = CardPhotoScreen.INSTANCE;
                Intrinsics.checkNotNullParameter((zam.a) obj2, "it");
                return Unit.f186387a;
            case 4:
                j updateStateWithCameraMode = (j) obj2;
                Intrinsics.checkNotNullParameter(updateStateWithCameraMode, "$this$updateStateWithCameraMode");
                return j.a(updateStateWithCameraMode, null, null, null, null, null, false, ISO781611.SMT_TAG);
            case 5:
                j updateStateWithCameraMode2 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateStateWithCameraMode2, "$this$updateStateWithCameraMode");
                return j.a(updateStateWithCameraMode2, null, null, null, null, null, false, 126);
            case 6:
                j updateStateWithCameraMode3 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateStateWithCameraMode3, "$this$updateStateWithCameraMode");
                return j.a(updateStateWithCameraMode3, null, null, null, null, null, false, LDSFile.EF_SOD_TAG);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new m(null, bw0.l.LOADING, null, false, null, 24);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new h(lw0.i.AVATAR);
            case 9:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                m70.a.c(t0.f186434a);
                return new ld4.m(ky4.a.a(R$string.credit_application_loan_selection_title, ""), list);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new s7("PAYMENT_BREAKDOWN_TOTAL_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("PAYMENT_BREAKDOWN_EXCHANGE_RATE_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("PAYMENT_BREAKDOWN_FEES_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("PAYMENT_BREAKDOWN_PAY_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 12:
                PersistedBackground it10 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                NavBarWithContainerBackground navBarWithContainerBackground = it10.f63743a.f63742b;
                if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground) {
                    NavBarWithContainerBackground.ImageBackground imageBackground = (NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground;
                    objA = imageBackground.f57881c;
                    if (objA == null) {
                        objA = imageBackground.f57879a;
                    }
                } else if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.VideoBackground) {
                    objA = ((NavBarWithContainerBackground.VideoBackground) navBarWithContainerBackground).f57884b;
                } else {
                    if (!(navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ColorImage.INSTANCE.getClass();
                    objA = ColorImage.Companion.a();
                }
                return (objA == null || (optionalOf = Optional.of(objA)) == null) ? Optional.empty() : optionalOf;
            case 13:
                yt8.c it11 = (yt8.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!n.p(it11.f316662a)) {
                    return u1.a(new g7d.a(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_banner_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_banner_description, null, null, 14)));
                }
                Optional optionalEmpty = Optional.empty();
                Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
                return optionalEmpty;
            case 14:
                ArrayList arrayListP = e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(t61.a.o("LOADING_POLICY_", i, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 15:
                RevPointsPocketState it12 = (RevPointsPocketState) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 instanceof RevPointsPocketState.Inactive);
            case 16:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.REV_POINTS_POCKETS) : b39.b.f12015a;
            case 17:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 18:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list2 = previousPage.f196171a;
                if (list2.isEmpty() || list2.size() < 100) {
                    return null;
                }
                return new RevPointsTransactionPageParams(0, Long.valueOf(((e1) d0.m0(list2)).f201358b), null, null, f1.REVPOINTS_POCKET, null, null, null, null, 493);
            case 19:
                ty0.a clickData = (ty0.a) obj2;
                KProperty[] kPropertyArr = PriceTargetsDetailsScreen.f100155b0;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return Boolean.valueOf(Intrinsics.f(clickData.f275445a, "LEARN_MORE_CLICK_ID"));
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ldj.i.b();
            case 21:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, new Data(null, null, true, 3, null), false, 2);
            case 22:
                f update2 = (f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return f.a(update2, null, true, 1);
            case 23:
                f update3 = (f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return f.a(update3, null, false, 1);
            case 24:
                return f.a((f) obj2, null, true, 1);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                ArrayList arrayList2 = new ArrayList(6);
                for (int i2 = 0; i2 < 6; i2++) {
                    p9 p9VarA = o9.a(p9.Companion, "LIST_ID_GRID_ITEM_" + i2);
                    yp0.b.l(p9VarA, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(p9VarA);
                }
                Float fValueOf = Float.valueOf(12.0f);
                int i3 = R$attr.uikit_dp32;
                int i5 = R$attr.uikit_dp16;
                int i6 = R$attr.uikit_dp4;
                eVarB.add(new xk("LIST_ID_TILES_GRID", arrayList2, 2, fValueOf, null, i3, i5, i6, i6, 63600));
                eVarB.add(new ij("LIST_ID_FOOTER_TEXT"));
                return new x(ldk.i.f194168a, null, u.a(eVarB));
            case 26:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List list3 = (List) it13.getContent();
                return list3 == null ? f0.f322471a : list3;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i21 = R$attr.uikit_dp4;
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange, 10));
                vim.f it14 = intRange.iterator();
                while (it14.f289625c) {
                    nf0 nf0Var = new nf0(a0.d.n("CATEGORY_ITEM_LOADING_", it14.nextInt()), of0.TEAL);
                    yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(nf0Var);
                }
                return u.c(new xk("CATEGORY_ITEMS_GRID_LOADING_BOX_ID", arrayList3, null, null, null, i21, 0, 0, 0, 65404));
            case 28:
                c it15 = (c) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            default:
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return e.u(vault, b.Companion);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f193687a = i;
    }
}
