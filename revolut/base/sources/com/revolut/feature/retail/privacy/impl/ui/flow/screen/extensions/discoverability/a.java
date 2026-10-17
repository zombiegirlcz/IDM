package com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability;

import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.MakeMeDiscoverableDialogMapper;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.t;
import y21.c;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ MakeMeDiscoverableDialogMapper.SwitchState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f82786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MakeMeDiscoverableDialogMapper.SwitchState switchState, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = switchState;
        this.f82786w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f82786w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t tVarC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean z = this.v.f82785a;
            b bVar = this.f82786w;
            if (z) {
                c cVar = bVar.o;
                cVar.getClass();
                tVarC = cVar.c(SecuritySettings.USERNAME, false);
            } else {
                c cVar2 = bVar.o;
                cVar2.getClass();
                tVarC = cVar2.c(SecuritySettings.USERNAME, true);
            }
            this.u = 1;
            if (nim.a.a(tVarC, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
