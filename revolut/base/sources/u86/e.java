package u86;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.impl.R$string;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$FlowState;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.q;
import gim.i;
import h86.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import vkm.j2;
import yhm.o;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.devicemanagement.impl.ui.flow.b f278125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f278126x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.devicemanagement.impl.ui.flow.b bVar, f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f278125w = bVar;
        this.f278126x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f278125w, this.f278126x, continuation, 0);
            case 1:
                return new e(this.f278125w, this.f278126x, continuation, 1);
            default:
                return new e(this.f278125w, this.f278126x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarA;
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                f logOutAction = this.f278126x;
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar = this.f278125w;
                if (i == 0) {
                    o.b(obj2);
                    kdh.b bVar2 = bVar.o;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(logOutAction, "logOutAction");
                    if (logOutAction instanceof h86.d) {
                        bVarA = bVar2.O(((h86.d) logOutAction).f149945a.f71914a);
                    } else {
                        if (!(logOutAction instanceof h86.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVarA = ((mli.e) bVar2.f182900c).a(((h86.e) logOutAction).f149946a);
                    }
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objB = obj2;
                        NaviCommand naviCommand = (NaviCommand) objB;
                        Intrinsics.h(naviCommand);
                        return bVar.C1(new BridgeDestination(naviCommand));
                    }
                    o.b(obj2);
                }
                if (logOutAction instanceof h86.d) {
                    UserDevice device = ((h86.d) logOutAction).f149945a;
                    r86.d dVar = bVar.f71939p;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(device, "device");
                    l.a1(bVar, bVar.X1(new y0("logoutSuccess", new j0((Clause) new TextLocalisedClause(R$string.devices_change_passcode_title, u.c(dVar.f252377a.a(device)), null, 12), (Clause) new TextLocalisedClause(R$string.devices_change_passcode_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.devices_change_passcode_primary_button, null, null, 14), new TextLocalisedClause(R$string.devices_change_passcode_secondary_button, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4)), null, null, new com.revolut.feature.devicemanagement.impl.ui.flow.a(bVar, null), 3);
                    return Unit.f186387a;
                }
                if (!(logOutAction instanceof h86.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ufm.i iVarA = com.revolut.retail.feature.api.userauth.navigation.a.a(((jma.i) bVar.f71940q).f176505a, false, null, 7);
                this.v = 2;
                objB = nim.a.b(iVarA, this);
                if (objB == aVar) {
                    return aVar;
                }
                NaviCommand naviCommand2 = (NaviCommand) objB;
                Intrinsics.h(naviCommand2);
                return bVar.C1(new BridgeDestination(naviCommand2));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar3 = this.f278125w;
                e eVar = new e(bVar3, this.f278126x, null, 0);
                this.v = 1;
                Object objT = q.t(bVar3, eVar, this);
                return objT == aVar2 ? aVar2 : objT;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar4 = this.f278125w;
                e eVar2 = new e(bVar4, this.f278126x, null, 1);
                this.v = 1;
                String str = ((DeviceManagementFlowContract$FlowState) ((j2) bVar4.f71942s.f22677a).getValue()).f71935a;
                Object objP2 = (!(bVar4.f71943t.d() instanceof DeviceManagementFlowContract$Step.DeviceDetails) || str == null) ? bVar4.p2(this, eVar2) : u0.b0(bVar4.X(), str, eVar2, this);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
