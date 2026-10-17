package jck;

import aw0.y4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.data.model.Data;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.youTransactor.uCube.rpc.Constants;
import ip0.bo0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import k50.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f172873b;

    public /* synthetic */ y(Object obj2, boolean z, int i) {
        this.f172872a = i;
        this.f172873b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f172872a;
        boolean z = this.f172873b;
        switch (i) {
            case 0:
                o update = (o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return o.a(update, null, new Data(Boolean.valueOf(z), null, false, 6, null), 1);
            case 1:
                return kih.c.a((kih.c) obj2, null, null, z, 3);
            case 2:
                jqg.i update2 = (jqg.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jqg.i.a(update2, null, z, 5);
            case 3:
                return jvc.i.a((jvc.i) obj2, this.f172873b, null, null, null, null, null, false, null, null, false, null, 65532);
            case 4:
                jwf.e updateState = (jwf.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return jwf.e.a(updateState, null, z, null, 5);
            case 5:
                return jwf.e.a((jwf.e) obj2, null, z, null, 5);
            case 6:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return !z ? it8 : com.revolut.retail.core.navigation.a.c(jyk.g.c(), it8);
            case 7:
                FeatureCommand it9 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return z ? new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, it9, 2))) : it9;
            case 8:
                k4a.k update3 = (k4a.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return k4a.k.a(update3, null, this.f172873b, null, null, null, null, ISO781611.SMT_TAG);
            case 9:
                k50.h0 update4 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return k50.h0.a(update4, null, null, null, null, o0.a(update4.e, null, 0L, null, null, this.f172873b, null, null, LDSFile.EF_DG15_TAG), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            case 10:
                return k50.h0.a((k50.h0) obj2, null, null, null, null, null, null, null, null, null, null, false, this.f172873b, null, null, null, null, false, null, null, null, null, null, null, null, 268433407);
            case 11:
                return k50.h0.a((k50.h0) obj2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, this.f172873b, null, null, null, null, null, null, null, 267911167);
            case 12:
                Intrinsics.checkNotNullParameter((u6c.n) obj2, "it");
                return Boolean.valueOf(z);
            case 13:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayListP.add(nb0.b(pb0.Companion, "FAQ_LOADING_ITEM_ID", false, 0, false, 30));
                }
                return k8d.u.b(arrayListP, z);
            case 14:
                return k8g.k.a((k8g.k) obj2, null, null, null, null, false, this.f172873b, 31);
            case 15:
                ka2.h update5 = (ka2.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ka2.h.a(update5, false, this.f172873b, null, null, 13);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (!z) {
                    return zhm.f0.f322471a;
                }
                gu guVar = new gu("SUBHEADER_ITEM_RECENTLY_VIEWED_ID", 0, 0, 30);
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    bo0 bo0Var = new bo0(a0.d.n("LOADING_ITEM_ID_", it10.nextInt()));
                    yp0.b.l(bo0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(bo0Var);
                }
                return zhm.v.k(guVar, new hg("RECENTLY_VIEWED_LIST_ITEM_ID", arrayList, 2, new y4(kcg.m.f182736b), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656));
            case 17:
                return ke7.n.a((ke7.n) obj2, null, null, this.f172873b, null, null, null, null, false, Constants.TAG_FB_CHARGING_STATUS);
            case 18:
                com.revolut.feature.shops.impl.ui.map_view.b update6 = (com.revolut.feature.shops.impl.ui.map_view.b) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return com.revolut.feature.shops.impl.ui.map_view.b.a(update6, null, this.f172873b, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, 1021);
            case 19:
                return kqh.f.a((kqh.f) obj2, null, null, z, 7);
            case 20:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, this.f172873b, null, false, false, null, null, null, null, null, null, null, null, null, -33554433, 63);
            case 21:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, this.f172873b, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -4097, 63);
            case 22:
                return l5a.l.a((l5a.l) obj2, null, null, null, null, null, this.f172873b, null, null, false, null, 991);
            case 23:
                return l5a.l.a((l5a.l) obj2, null, null, null, null, null, false, null, null, this.f172873b, null, 767);
            case 24:
                return lbc.m.a((lbc.m) obj2, null, null, null, null, this.f172873b, 31);
            case 25:
                lg5.e eVar = (lg5.e) obj2;
                boolean z3 = eVar.f195068a;
                eVar.getClass();
                return new lg5.e(z3, z);
            case 26:
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2, null, null, null, null, null, null, null, null, this.f172873b, 255);
            case 27:
                lnj.f update7 = (lnj.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return lnj.f.a(update7, null, null, z, 3);
            case 28:
                return lnk.e.a((lnk.e) obj2, null, z, null, 23);
            default:
                lol.f updateState2 = (lol.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return lol.f.a(updateState2, null, false, z, 3);
        }
    }

    public /* synthetic */ y(boolean z, int i) {
        this.f172872a = i;
        this.f172873b = z;
    }

    public /* synthetic */ y(boolean z, Object obj2, int i) {
        this.f172872a = i;
        this.f172873b = z;
    }
}
