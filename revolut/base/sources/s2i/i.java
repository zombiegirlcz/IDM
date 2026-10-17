package s2i;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.passcode_reminder.api.navigation.PasscodeReminderDestination;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.workflow.chat.api.navigation.WorkflowChatDestination;
import com.revolut.feature_workflow_reminder_api.WorkflowReminderDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.ExtendedHoursBackendFlowContract$Configuration;
import dy0.o;
import h93.k0;
import h93.l0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import v3e.d0;
import v6l.b1;
import ya6.h0;
import zc0.y2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f259362b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f259361a = i;
        this.f259362b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object next;
        switch (this.f259361a) {
            case 0:
                xi0.b bVar = (xi0.b) this.f259362b;
                if (!cp5.d.y(bVar)) {
                }
                break;
            case 2:
                ue0.c cVar = ((soi.e) this.f259362b).f264849c;
                Type type = l21.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                break;
            case 3:
                ((cid.a) this.f259362b).f24445b.c(new FeatureCommand(new KompotOverlayFeatureConfig(PasscodeReminderDestination.f78645a, yhi.b.SOLID, (Integer) null, 12)));
                break;
            case 9:
                ((uge.g) this.f259362b).f280030a.c(jbb.a.a(ibb.c.f160140a, null, o.BOTTOM, null, 10));
                break;
            case 10:
                ((uhl.e) this.f259362b).a();
                break;
            case 11:
                ((v3a.c) this.f259362b).f285866a.c(new FeatureCommand(TransferBridgeFeatureConfig.FindFriends.f80026g));
                break;
            case 12:
                d0 d0Var = (d0) this.f259362b;
                Iterator it8 = d0Var.f285888s.iterator();
                while (it8.hasNext()) {
                    d0Var.f285883m.a(((StoriesModel) it8.next()).f88785b);
                }
                break;
            case 13:
                Iterator it9 = ((b1) this.f259362b).g().iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        u6l.j jVar = (u6l.j) next;
                        if (jVar.getSubProductType() != null) {
                            k0 k0Var = l0.Companion;
                            String strM = jVar.getSubProductType();
                            k0Var.getClass();
                            if (k0.a(strM) == l0.MEXICO_MCY) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                break;
            case 14:
                break;
            case 15:
                ((cid.a) this.f259362b).f24445b.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new WorkflowChatDestination(0), false, (Integer) null, 0, 61)));
                break;
            case 16:
                ((xgi.a) this.f259362b).f305763a.c(vhi.c.c(WorkflowReminderDestination.f98185a, yhi.b.BOTTOM_DIALOG, null, false, 12));
                break;
            case 17:
                break;
            case 18:
                xyk.d dVar = (xyk.d) this.f259362b;
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                ExtendedHoursBackendFlowContract$Configuration extendedHoursBackendFlowContract$Configuration = (ExtendedHoursBackendFlowContract$Configuration) w.O(((xyk.e) dVar.f309748m).w0());
                break;
            case 21:
                xe0.e eVar = ((h0) this.f259362b).f311970a;
                Type PENDING_DONATIONS_TYPE = h0.f311969b;
                Intrinsics.checkNotNullExpressionValue(PENDING_DONATIONS_TYPE, "PENDING_DONATIONS_TYPE");
                Set set = (Set) eVar.T2("STORAGE_KEY_PENDING_DONATIONS", PENDING_DONATIONS_TYPE);
                if (set == null) {
                }
                break;
            case 22:
                ((yke.b) this.f259362b).f314609a.c(jbb.a.a(ibb.c.f160141b, null, null, null, 14));
                break;
            case 26:
                FormScreen formScreenE0 = ((y2) this.f259362b).f321162h.e0();
                if (formScreenE0 != null) {
                }
                break;
        }
        return (String) ((eki.e) this.f259362b).invoke();
    }
}
