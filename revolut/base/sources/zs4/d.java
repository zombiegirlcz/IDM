package zs4;

import aw0.h;
import aw0.n6;
import cli.n;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p35.e0;
import ql4.q;
import vf0.y;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zsk.d;
import zuj.p;
import zuj.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324808a;

    public /* synthetic */ d(int i) {
        this.f324808a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f324808a) {
            case 0:
                Throwable error = (Throwable) obj2;
                q qVar = (q) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (qVar == null) {
                    return error;
                }
                return null;
            case 1:
                d.a aVar = zsk.d.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ytk.a.a(4);
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 4:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((sil.g) obj3, "<unused var>");
                return Unit.f186387a;
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new w((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), p.f325503a, f0.f322471a);
            case 6:
                Throwable th10 = (Throwable) obj2;
                if (((dj0.d) obj3) == null) {
                    return th10;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 8:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 11:
                Throwable error2 = (Throwable) obj2;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (savingsAccountDetails == null) {
                    return error2;
                }
                return null;
            case 12:
                i iVar = (i) obj2;
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                return iVar;
            case 13:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 14:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 15:
                Throwable error4 = (Throwable) obj2;
                r rVar = (r) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (rVar == null) {
                    return error4;
                }
                return null;
            case 16:
                Throwable error5 = (Throwable) obj2;
                y yVar = (y) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (yVar == null) {
                    return error5;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 18:
                Throwable error6 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pricingPlanSubscription == null) {
                    return error6;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listK = v.k(new RowDelegate.Model("0", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_earn_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_earn_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("1", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 60), new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_redeem_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_redeem_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new azb.b(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(3))), 508), new n6(new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f, null, null, false, null, new azb.b(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRedeemHub(false))), 508), null, null, null, 121), listK, new lw0.a(new TextLocalisedClause(R$string.rev_points_bottom_sheet_title, u.c(new TextLocalisedClause(R$string.rev_points_bottom_sheet_generic_title, null, null, 14)), null, 12), null, null, null, false, 30));
            case 20:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            default:
                Throwable error7 = (Throwable) obj2;
                e0 e0Var = (e0) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (e0Var == null) {
                    return error7;
                }
                return null;
        }
    }

    public /* synthetic */ d(n nVar, int i) {
        this.f324808a = i;
    }
}
