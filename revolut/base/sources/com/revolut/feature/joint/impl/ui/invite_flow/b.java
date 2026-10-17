package com.revolut.feature.joint.impl.ui.invite_flow;

import av7.l;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import d58.f;
import g48.r0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f76573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InvitationType f76574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zm3.a f76575y;
    public final /* synthetic */ yki.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, InvitationType invitationType, zm3.a aVar, yki.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f76573w = dVar;
        this.f76574x = invitationType;
        this.f76575y = aVar;
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f76573w, this.f76574x, this.f76575y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f bVar;
        f fVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        d dVar = this.f76573w;
        if (i == 0) {
            o.b(obj2);
            dVar.getClass();
            InvitationType invitationType = this.f76574x;
            if (invitationType instanceof InvitationType.OutgoingInvitation) {
                f.Companion.getClass();
                bVar = d58.a.a(this.f76575y);
            } else {
                if (!(invitationType instanceof InvitationType.IncomingInvitation)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d58.b(((InvitationType.IncomingInvitation) invitationType).f76584a);
            }
            r0 r0Var = dVar.f76577q;
            this.u = bVar;
            this.v = 1;
            Object objP = r0Var.p(this);
            if (objP == aVar) {
                return aVar;
            }
            fVar = bVar;
            obj2 = objP;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.u;
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.t2(this.f76573w, this.z, new InviteFlowContract$Step.Relationship(fVar), true, null, false, 12);
        } else {
            dVar.getClass();
            dVar.l2(new l(dVar, fVar, null, 11), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
