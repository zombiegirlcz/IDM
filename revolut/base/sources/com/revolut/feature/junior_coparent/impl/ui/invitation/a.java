package com.revolut.feature.junior_coparent.impl.ui.invitation;

import com.revolut.feature.junior_coparent.impl.provider.CoparentConfirmationDialogProvider$DialogConfiguration;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ee8.e;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.a f76889w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, zm3.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f76889w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f76889w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        zm3.a aVar2 = this.f76889w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = bVar.f76891q;
            String str = bVar.o.f76885a;
            this.u = 1;
            obj2 = eVar.c(str, aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.w2(bVar.f76893s, new CoparentInvitationFlowContract$Step.ContactConfirmation((CoparentConfirmationDialogProvider$DialogConfiguration) obj2, aVar2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
