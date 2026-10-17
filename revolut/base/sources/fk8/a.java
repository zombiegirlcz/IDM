package fk8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import com.revolut.feature.pay_later.impl.ui.planprogress.PlanProgressController;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import fkd.d0;
import fkd.e0;
import fkd.h;
import fkd.h0;
import fkd.k;
import fkd.p;
import fkd.q;
import fmd.d;
import fmg.l;
import fmg.n;
import fmg.t;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.e;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import qlm.x;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135731a;

    public /* synthetic */ a(int i) {
        this.f135731a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f135731a) {
            case 0:
                return new d1("Completed", JuniorProgressionPromptStage.Completed.INSTANCE, new Annotation[0]);
            case 1:
                return new d1("FeaturesReloading", JuniorProgressionPromptStage.FeaturesReloading.INSTANCE, new Annotation[0]);
            case 2:
                return new d1("Initial", JuniorProgressionPromptStage.Initial.INSTANCE, new Annotation[0]);
            case 3:
                return new d1("PreCompletion", JuniorProgressionPromptStage.PreCompletion.INSTANCE, new Annotation[0]);
            case 4:
                KProperty[] kPropertyArr = PlanProgressController.S;
                return new ProgressStepVerticalDelegate();
            case 5:
                return j1.a("com.revolut.feature.slot_manager.api.model.todo.SlotDefaultTodoTile.ActionVariant", k.values(), new String[]{"primary", "secondary"}, new Annotation[][]{null, null});
            case 6:
                return new e(h.f135766a);
            case 7:
                return SlotIconAsset.INSTANCE.serializer();
            case 8:
                return SlotIconAsset.INSTANCE.serializer();
            case 9:
                p.Companion companion = p.INSTANCE;
                return j1.a("com.revolut.feature.slot_manager.api.model.todo.SlotDefaultTodoTile.Style.Theme", q.values(), new String[]{"default", "warning", "high-alert"}, new Annotation[][]{null, null, null});
            case 10:
                return SlotIconAsset.INSTANCE.serializer();
            case 11:
                return SlotIconAsset.INSTANCE.serializer();
            case 12:
                d0.Companion companion2 = d0.INSTANCE;
                return j1.a("com.revolut.feature.slot_manager.api.model.todo.SlotNoButtonsTodoTile.Style.Theme", e0.values(), new String[]{"default", "warning", "high-alert"}, new Annotation[][]{null, null, null});
            case 13:
                return new e(h0.f135767a);
            case 14:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 15:
                v1 v1Var2 = v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            case 16:
                KProperty[] kPropertyArr2 = EsimMobilePlanGetPortOutCredentialsScreen.X;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr3 = EsimMobilePlanGetPortOutCredentialsScreen.X;
                return new FullScreenStateDelegate();
            case 18:
                return Unit.f186387a;
            case 19:
                return new e(fla.p.Companion.serializer(n0.f247680a));
            case 20:
                return new e(fla.p.Companion.serializer(x.f247723a));
            case 21:
                return new e(fla.p.Companion.serializer(qlm.h.f247648a));
            case 22:
                return new e(fla.p.Companion.serializer(v1.f247718a));
            case 23:
                return new e(fla.p.Companion.serializer(v1.f247718a));
            case 24:
                return new e(fla.p.Companion.serializer(v1.f247718a));
            case 25:
                return fmd.e.Companion.serializer();
            case 26:
                return new d1("new_is", d.INSTANCE, new Annotation[0]);
            case 27:
                return new e(l.f136437a);
            case 28:
                return j1.b("com.revolut.feature.user.checklist.impl.data.models.ChecklistItem.State", t.values());
            default:
                return j1.b("com.revolut.feature.user.checklist.impl.data.models.AdoptionJourney.Step.State", n.values());
        }
    }
}
