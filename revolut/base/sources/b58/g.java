package b58;

import akl.s1;
import cn3.b;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$State;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12452a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yki.b f12454c;
    public final /* synthetic */ InvitationType d;

    public /* synthetic */ g(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, InvitationType invitationType, yki.b bVar) {
        this.f12453b = dVar;
        this.d = invitationType;
        this.f12454c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        int i = 0;
        switch (this.f12452a) {
            case 0:
                t48.n result = (t48.n) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, t48.k.f267923a);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar = this.f12453b;
                if (zF || Intrinsics.f(result, t48.l.f267924a)) {
                    dVar.N2();
                } else {
                    boolean z = result instanceof t48.m;
                    yki.b bVar = this.f12454c;
                    Object[] objArr = 0;
                    if (z) {
                        dVar.l2(new s1((Object) dVar, (Object) bVar, (Object) result, (Continuation) (objArr == true ? 1 : 0), 25), new yi5.b(26));
                    } else {
                        InvitationType invitationType = this.d;
                        if (invitationType instanceof InvitationType.OutgoingInvitation) {
                            t48.j jVar = result instanceof t48.j ? (t48.j) result : null;
                            if (jVar == null || (obj3 = jVar.f267922a) == null) {
                                obj3 = f0.f322471a;
                            }
                            if (((InviteFlowContract$State) ((j2) dVar.C.f22677a).getValue()).f76559a.isEmpty()) {
                                dVar.H2(dVar.C, new f(obj3, dVar, i));
                            }
                            oki.h.t2(dVar, bVar, InviteFlowContract$Step.SelectUser.f76568a, true, null, false, 12);
                        } else if (invitationType instanceof InvitationType.IncomingInvitation) {
                            d0 d0Var = ((InvitationType.IncomingInvitation) invitationType).f76584a;
                            if (d0Var.e) {
                                dVar.O2(d0Var);
                            } else {
                                oki.h.t2(dVar, bVar, InviteFlowContract$Step.Confirmation.f76561a, true, null, false, 12);
                            }
                        }
                    }
                }
                return Unit.f186387a;
            default:
                cn3.b result2 = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2 instanceof b.a;
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar2 = this.f12453b;
                yki.b bVar2 = this.f12454c;
                if (z3) {
                    dVar2.getClass();
                    oki.h.r2(bVar2);
                    oki.h.t2(dVar2, bVar2, new InviteFlowContract$Step.Consent(dVar2.f76580t.a(((InviteFlowContract$State) ((j2) dVar2.C.f22677a).getValue()).f76559a)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    return Unit.f186387a;
                }
                dVar2.getClass();
                zm3.a aVar = null;
                if (result2 instanceof cn3.d) {
                    IllegalStateException illegalStateException = new IllegalStateException("Group contact should not be selected for Joint Account");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (!z3) {
                    if (!(result2 instanceof cn3.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cn3.e eVar = (cn3.e) zhm.d0.d0(((cn3.c) result2).f25344a);
                    if (eVar != null) {
                        aVar = eVar.f25347a;
                    }
                }
                if (aVar != null) {
                    dVar2.l2(new com.revolut.feature.joint.impl.ui.invite_flow.b(dVar2, this.d, aVar, bVar2, null), new yi5.b(26));
                } else {
                    oki.h.t2(dVar2, bVar2, new InviteFlowContract$Step.Consent(0), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, yki.b bVar, InvitationType invitationType) {
        this.f12453b = dVar;
        this.f12454c = bVar;
        this.d = invitationType;
    }
}
