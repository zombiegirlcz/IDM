package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetTrustedLocationScreenContract$InputData.EditTrustedLocation f85686w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, SetTrustedLocationScreenContract$InputData.EditTrustedLocation editTrustedLocation, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f85686w = editTrustedLocation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f85686w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SetTrustedLocationScreenContract$InputData.EditTrustedLocation editTrustedLocation = this.f85686w;
            d dVar = this.v;
            a aVar2 = new a(dVar, editTrustedLocation, null);
            this.u = 1;
            if (dVar.p2(this, aVar2) == aVar) {
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
