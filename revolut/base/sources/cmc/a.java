package cmc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.statements.impl.tools.ReportUtilsImpl;
import com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import cul.v;
import d6j.o;
import dmj.a0;
import e4k.x;
import e54.m;
import ip0.tg;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import org.jmrtd.PassportService;
import org.jmrtd.lds.LDSFile;
import yw4.p;
import yw4.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25193b;

    public /* synthetic */ a(Object obj2, boolean z, int i) {
        this.f25192a = i;
        this.f25193b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f25192a) {
            case 0:
                k routeSpec = (k) obj2;
                Intrinsics.checkNotNullParameter(routeSpec, "routeSpec");
                if (Intrinsics.f(routeSpec, j.f25211a)) {
                    return gc0.c.f(gmc.a.a());
                }
                if (!(routeSpec instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                NaviCommand naviCommand = ((i) routeSpec).f25209a;
                return this.f25193b ? new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, naviCommand, 2))) : naviCommand;
            case 1:
                return Boolean.valueOf(ReportUtilsImpl.cardExchangeTotal$lambda$0(this.f25193b, (TransactionDbModel) obj2));
            case 2:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                InvestInputValue investInputValue = update.e;
                boolean z = this.f25193b;
                return v.a(update, null, null, null, InvestInputValue.a(investInputValue, null, Boolean.valueOf(z), z ? false : update.e.f106846c, false, 9), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -17, 8191);
            case 3:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !this.f25193b, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 8191);
            case 4:
                return o.f((o) obj2, null, this.f25193b, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554423);
            case 5:
                return o.f((o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, this.f25193b, null, 25165823);
            case 6:
                da8.g update2 = (da8.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return da8.g.a(update2, null, null, null, null, null, null, this.f25193b, 63);
            case 7:
                return dm3.e.a((dm3.e) obj2, null, null, null, null, null, false, null, this.f25193b, false, null, 3583);
            case 8:
                a0 update3 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return a0.a(update3, null, null, null, null, null, null, this.f25193b, null, 191);
            case 9:
                doh.e updateState = (doh.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return doh.e.a(updateState, this.f25193b, null, null, 6);
            case 10:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                if (!this.f25193b) {
                    return facilities;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : facilities) {
                    if (((p) obj3).e != q.INACTIVE) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 11:
                ((e4j.b) obj2).getClass();
                return new e4j.b(this.f25193b);
            case 12:
                return x.a((x) obj2, null, null, null, 0, null, null, null, this.f25193b, 511);
            case 13:
                m update4 = (m) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return m.a(update4, 0L, 0L, null, null, null, null, null, false, null, null, this.f25193b, 2047);
            case 14:
                e77.f update5 = (e77.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return e77.f.a(update5, null, !this.f25193b, 3);
            case 15:
                return com.revolut.feature.global_markets.impl.ui.flow.index_details.a.a((com.revolut.feature.global_markets.impl.ui.flow.index_details.a) obj2, null, Boolean.valueOf(this.f25193b), null, null, LDSFile.EF_DG15_TAG);
            case 16:
                return e94.m.a((e94.m) obj2, null, this.f25193b, 1);
            case 17:
                return new eac.m(((r0) obj2).f201447a, this.f25193b);
            case 18:
                return eig.k.a((eig.k) obj2, null, null, null, null, false, this.f25193b, null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 19:
                return qje.o.a((qje.o) obj2, null, null, this.f25193b, null, 11);
            case 20:
                return eu2.d.a((eu2.d) obj2, false, !this.f25193b, 1);
            case 21:
                f9a.c update6 = (f9a.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return f9a.c.a(update6, this.f25193b, null, 2);
            case 22:
                return fb7.j.a((fb7.j) obj2, null, false, null, null, this.f25193b, 63);
            case 23:
                nag.a item = (nag.a) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                boolean z3 = this.f25193b;
                return new tg(new TextClause(item.f213901b.f97839c, (Style) new Custom(Integer.valueOf(z3 ? R$attr.uikit_colorGreen : R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), z3 ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246) : ue8.c.x(item.f213900a, R$attr.uikit_colorGreyTone50));
            case 24:
                NaviCommand activationCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(activationCommand, "activationCommand");
                return fg8.d.a(activationCommand, this.f25193b);
            case 25:
                fjd.o update7 = (fjd.o) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return fjd.o.a(update7, null, null, null, null, null, null, null, null, null, this.f25193b, null, null, null, 0L, 15871);
            case 26:
                fjj.k update8 = (fjj.k) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return fjj.k.a(update8, null, null, this.f25193b, null, null, 27);
            case 27:
                return fjj.k.a((fjj.k) obj2, null, null, this.f25193b, null, null, 27);
            case 28:
                Boolean boolValueOf = Boolean.valueOf(this.f25193b);
                ((fm5.d) obj2).getClass();
                return new fm5.d(boolValueOf);
            default:
                g6a.f update9 = (g6a.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return g6a.f.a(update9, null, null, null, this.f25193b, null, false, 55);
        }
    }

    public /* synthetic */ a(boolean z, int i) {
        this.f25192a = i;
        this.f25193b = z;
    }
}
