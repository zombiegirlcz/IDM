package yh6;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.apm.bills.boleto.impl.finder.info.BoletosInfoScreen;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import okhttp3.Cache;
import qlm.h0;
import qlm.v1;
import ulm.j1;
import yh6.x;
import yh6.z;
import yhf.b0;
import yhf.e;
import yhf.f;
import yhf.h0;
import yhf.k;
import yhf.k0;
import yhf.l;
import yhf.q;
import yhf.s;
import yhf.t;
import yhf.v;
import yhf.y;
import yhf.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313864a;

    public /* synthetic */ y(int i) {
        this.f313864a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException {
        switch (this.f313864a) {
            case 0:
                z.b bVar = z.Companion;
                return new qlm.e(x.a.f313863a);
            case 1:
                z.b bVar2 = z.Companion;
                return new qlm.e(x.a.f313863a);
            case 2:
                f.b bVar3 = yhf.f.Companion;
                return new qlm.e(v1.f247718a);
            case 3:
                k.b bVar4 = yhf.k.Companion;
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 4:
                q.b bVar5 = yhf.q.Companion;
                v1 v1Var2 = v1.f247718a;
                return new h0(v1Var2, v1Var2, 1);
            case 5:
                s.b bVar6 = yhf.s.Companion;
                return new qlm.e(e.a.f313956a);
            case 6:
                t.b bVar7 = yhf.t.Companion;
                return new qlm.e(v1.f247718a);
            case 7:
                v.Companion companion = yhf.v.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 8:
                v.Companion companion2 = yhf.v.INSTANCE;
                return new qlm.e(l.a.f314029a);
            case 9:
                v.Companion companion3 = yhf.v.INSTANCE;
                return new qlm.e(h0.a.f314003a);
            case 10:
                v.Companion companion4 = yhf.v.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 11:
                v.Companion companion5 = yhf.v.INSTANCE;
                return new qlm.e(y.a.f314160a);
            case 12:
                b0.b bVar8 = yhf.b0.Companion;
                return new qlm.e(z.a.f314164a);
            case 13:
                k0.b bVar9 = k0.Companion;
                return new qlm.e(v1.f247718a);
            case 14:
                Lazy lazy = yj0.i.f314366a;
                Method declaredMethod = Cache.class.getDeclaredMethod("remove$okhttp", j1.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            case 15:
                KProperty[] kPropertyArr = CFACInsuranceManageExpensesScreen.f75087b0;
                return new RowDelegate(null, null, 7);
            case 16:
                KProperty[] kPropertyArr2 = PseVerificationCodeScreen.Q;
                return new CounterTextDelegate();
            case 17:
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 18:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 19:
                KProperty[] kPropertyArr3 = BoletosInfoScreen.Q;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr4 = ProfileScreen.f81447v0;
                return new PlanWidgetDelegate();
            case 21:
                KProperty[] kPropertyArr5 = ProfileScreen.f81447v0;
                return new TextDelegate();
            case 22:
                KProperty[] kPropertyArr6 = ProfileScreen.f81447v0;
                return new CellDetailsActionDelegate();
            case 23:
                KProperty[] kPropertyArr7 = ProfileScreen.f81447v0;
                return new ListSubheaderDelegate();
            case 24:
                KProperty[] kPropertyArr8 = ProfileScreen.f81447v0;
                return new BigTileDelegate();
            case 25:
                KProperty[] kPropertyArr9 = ProfileScreen.f81447v0;
                return new CellDetailsSwitcherDelegate();
            case 26:
                KProperty[] kPropertyArr10 = ProfileScreen.f81447v0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr11 = ProfileScreen.f81447v0;
                return new TwinHorizontalButtonDelegate();
            case 28:
                KProperty[] kPropertyArr12 = ProfileScreen.f81447v0;
                SmallCardDelegate.INSTANCE.getClass();
                return new SmallCardDelegate(SmallCardDelegate.f53351j);
            default:
                KProperty[] kPropertyArr13 = ProfileScreen.f81447v0;
                return new RowDelegate(null, null, 7);
        }
    }
}
