package b58;

import a31.w;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$State;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.e0;
import skm.p0;
import vkm.j2;
import z38.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d58.f f12462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, d58.f fVar, Continuation continuation) {
        super(1, continuation);
        this.f12461w = dVar;
        this.f12462x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f12462x, this.f12461w, continuation);
            default:
                return new l(this.f12461w, this.f12462x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        d58.f fVar = this.f12462x;
        switch (i) {
            case 0:
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar = this.f12461w;
                k38.d dVar2 = dVar.f76576p;
                qki.d dVar3 = dVar.C;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (fVar instanceof d58.b) {
                        String str = ((d58.b) fVar).f111396a.f211939c.f211960b;
                        List list = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76559a;
                        j38.a aVar = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76560b;
                        this.v = 1;
                        c48.g gVar = (c48.g) dVar2;
                        gVar.getClass();
                        w wVar = new w(12, gVar, new n.b(str), list, aVar, (Continuation) null);
                        p0 p0Var = p0.f264001a;
                        Object objJ = e0.J(elm.f.f127540b, wVar, this);
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ == obj3) {
                            return obj3;
                        }
                    } else if (fVar instanceof d58.d) {
                        String str2 = ((d58.d) fVar).f111397a;
                        List list2 = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76559a;
                        j38.a aVar2 = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76560b;
                        this.v = 2;
                        c48.g gVar2 = (c48.g) dVar2;
                        gVar2.getClass();
                        w wVar2 = new w(12, gVar2, new n.a(str2), list2, aVar2, (Continuation) null);
                        p0 p0Var2 = p0.f264001a;
                        Object objJ2 = e0.J(elm.f.f127540b, wVar2, this);
                        if (objJ2 != obj3) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 != obj3) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 == obj3) {
                            return obj3;
                        }
                    } else {
                        if (!(fVar instanceof d58.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str3 = ((d58.e) fVar).f111399a;
                        List list3 = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76559a;
                        j38.a aVar3 = ((InviteFlowContract$State) ((j2) dVar3.f22677a).getValue()).f76560b;
                        this.v = 3;
                        c48.g gVar3 = (c48.g) dVar2;
                        gVar3.getClass();
                        w wVar3 = new w(12, gVar3, new n.b(str3), list3, aVar3, (Continuation) null);
                        p0 p0Var3 = p0.f264001a;
                        Object objJ3 = e0.J(elm.f.f127540b, wVar3, this);
                        if (objJ3 != obj3) {
                            objJ3 = Unit.f186387a;
                        }
                        if (objJ3 != obj3) {
                            objJ3 = Unit.f186387a;
                        }
                        if (objJ3 == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        yji.l.a1(dVar, dVar.X1(new y0("SUCCESS_CONFIRM_OUTGOING_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.joint_confirm_number_dialog_success_title, u.c(fVar.e5()), null, 12), (Clause) new TextLocalisedClause(R$string.joint_confirm_number_dialog_success_description, u.c(fVar.e5()), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new s(dVar, null), 3);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 4;
                if (k38.d.a(dVar2, this) == obj3) {
                    return obj3;
                }
                yji.l.a1(dVar, dVar.X1(new y0("SUCCESS_CONFIRM_OUTGOING_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.joint_confirm_number_dialog_success_title, u.c(fVar.e5()), null, 12), (Clause) new TextLocalisedClause(R$string.joint_confirm_number_dialog_success_description, u.c(fVar.e5()), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new s(dVar, null), 3);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar4 = this.f12461w;
                l lVar = new l(fVar, dVar4, (Continuation) null);
                this.v = 1;
                Object objB = pu7.a.B(dVar4.k, "invite user", lVar, this);
                return objB == aVar4 ? aVar4 : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d58.f fVar, com.revolut.feature.joint.impl.ui.invite_flow.d dVar, Continuation continuation) {
        super(1, continuation);
        this.f12462x = fVar;
        this.f12461w = dVar;
    }
}
