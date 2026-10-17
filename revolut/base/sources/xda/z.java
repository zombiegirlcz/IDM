package xda;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import okhttp3.Interceptor;
import qlm.j1;
import qlm.v1;
import xhf.e2;
import xhf.f0;
import xhf.f2;
import xhf.g0;
import xhf.h2;
import xhf.i1;
import xhf.j1;
import xhf.t1;
import xhf.u;
import xhf.v1;
import xhf.y;
import xhf.z;
import xj0.g;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304381a;

    public /* synthetic */ z(int i) {
        this.f304381a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Interceptor interceptor;
        switch (this.f304381a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 2:
                return new qlm.e(m0.f304349a);
            case 3:
                return new qlm.e(p0.f304356a);
            case 4:
                return new qlm.e(v0.f304370a);
            case 5:
                return new qlm.e(v0.f304370a);
            case 6:
                return new qlm.e(b1.f304306a);
            case 7:
                KProperty[] kPropertyArr = SharedCompletedAlertsScreen.f86726e0;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr2 = SharedCompletedAlertsScreen.f86726e0;
                return new TextDelegate();
            case 9:
                KProperty[] kPropertyArr3 = SharedCompletedAlertsScreen.f86726e0;
                return new RowLoadingDelegate();
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return new qlm.e(v1.f247718a);
            case 12:
                return new qlm.e(xg3.g.f305491a);
            case 13:
                return j1.b("com.revolut.feature.checklist_challenges_ui.impl.model.checklist_collection.ChecklistCollectionItem.State", xg3.i.values());
            case 14:
                return new qlm.e(xga.a0.Companion.serializer());
            case 15:
                return new qlm.d1("com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.dto.PricingPlanContextualParametrizedTextDto.ParamDto.Unknown", xga.z.INSTANCE, new Annotation[0]);
            case 16:
                Lazy lazy = xgc.a.f305673a;
                return new kg.p(new kg.o()).b();
            case 17:
                Lazy lazy2 = xgl.a.f305772a;
                return ged.a.a().b();
            case 18:
                u.b bVar = xhf.u.Companion;
                return new qlm.e(v1.f247718a);
            case 19:
                z.b bVar2 = xhf.z.Companion;
                return new qlm.e(y.a.f306219a);
            case 20:
                f0.b bVar3 = xhf.f0.Companion;
                return new qlm.e(g0.a.f305991a);
            case 21:
                i1.b bVar4 = i1.Companion;
                return new qlm.e(j1.a.f306059a);
            case 22:
                t1.b bVar5 = t1.Companion;
                return new qlm.e(v1.a.f306194a);
            case 23:
                e2.b bVar6 = e2.Companion;
                return new qlm.e(f2.a.f305989a);
            case 24:
                h2.b bVar7 = h2.Companion;
                return new qlm.e(h2.c.a.f306018a);
            case 25:
                h2.b bVar8 = h2.Companion;
                return new qlm.e(h2.d.a.f306020a);
            case 26:
                return com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30);
            case 27:
                List<String> list = xj0.g.f;
                if (list == null) {
                    return zhm.f0.f322471a;
                }
                g.a aVar = xj0.g.f306449c;
                ArrayList arrayList = new ArrayList();
                for (String className : list) {
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(className, "className");
                    try {
                        interceptor = (Interceptor) Class.forName(className).newInstance();
                    } catch (ClassNotFoundException unused) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "InstrumentationTestInterceptor", j6.a.q("Interceptor not found: ", className), null, h0Var);
                        interceptor = null;
                    }
                    if (interceptor != null) {
                        arrayList.add(interceptor);
                    }
                    break;
                }
                return arrayList;
            case 28:
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr4 = CFACClaimExpenseDetailsScreen.f75139b0;
                return new RowDelegate(null, null, 7);
        }
    }
}
