package a92;

import adk.f1;
import adk.g0;
import adk.j0;
import adk.m0;
import adk.s0;
import adk.w;
import af6.a;
import af6.b;
import aj0.l;
import aj0.l0;
import aj0.p;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l71.a;
import org.jmrtd.cbeff.ISO781611;
import qlm.d1;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2299a;

    public /* synthetic */ d(int i) {
        this.f2299a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float f = null;
        Object[] objArr = 0;
        boolean z = false;
        switch (this.f2299a) {
            case 0:
                KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                return new ActionsDelegate();
            case 1:
                KProperty[] kPropertyArr2 = WithdrawalCodeListScreen.V;
                return new CellDetailsChevronDelegate();
            case 2:
                KProperty[] kPropertyArr3 = WithdrawalCodeListScreen.V;
                return new FullScreenStateDelegate();
            case 3:
                return new qlm.e(s98.b.f261123a);
            case 4:
                return new qlm.e(s98.b.f261123a);
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                l71.a[] elements = {a.w.f192493a, a.h0.f192478a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 7:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_out_confirmation_info_title, null, null, 14);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_24_info_outline;
                int i2 = R$attr.uikit_colorAccent;
                List listC = u.c(new RowDelegate.Model("TRANSFER_OUT_ASSET_SELECTION_INFO", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 8:
                return u.c(new RowLoadingDelegate());
            case 9:
                return new qlm.e(adk.d.f3373a);
            case 10:
                return new qlm.e(adk.a.f3362a);
            case 11:
                return new qlm.e(j0.f3400a);
            case 12:
                return new qlm.e(g0.f3387a);
            case 13:
                return new qlm.e(w.f3452a);
            case 14:
                return new qlm.e(m0.f3412a);
            case 15:
                return new qlm.e(m0.f3412a);
            case 16:
                return new qlm.e(s0.f3431a);
            case 17:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 18:
                return new qlm.e(f1.f3385a);
            case 19:
                a.Companion bVar = af6.a.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 20:
                b.C0014b c0014b = af6.b.Companion;
                return new qlm.e(a.C0012a.f3910a);
            case 21:
                b.C0014b c0014b2 = af6.b.Companion;
                return new qlm.e(a.C0012a.f3910a);
            case 22:
                return TotalWealthCategoryKey.INSTANCE.serializer();
            case 23:
                KProperty[] kPropertyArr4 = SingleSelectorInputDetailsScreen.R;
                return new RowDelegate(null, null, 7);
            case 24:
                return new UrlImageDrawable.Shimmering.Transformable(new ImageTransformations(null, new CircleTransformation(f, (Integer) (objArr == true ? 1 : 0), z, 15), null, null, null, null, null, ISO781611.SMT_TAG));
            case 25:
                return j1.b("com.revolut.core.model.pigeon.PigeonNodeType", gj0.c.values());
            case 26:
                return l0.Companion.serializer();
            case 27:
                return new qlm.e(v1.f247718a);
            case 28:
                return new d1("com.revolut.core.model.faq.PigeonNodeDetails.Content.Branch", l.INSTANCE, new Annotation[0]);
            default:
                return new qlm.e(p.f5371a);
        }
    }
}
