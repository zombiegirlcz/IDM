package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vvc.f;
import vvc.g;
import wtc.g0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation f85687w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation setTrustedWifiLocation, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f85687w = setTrustedWifiLocation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f85687w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g0 g0Var = dVar.f85691s;
            String str = this.f85687w.f85683a;
            f fVar = ((g) ((j2) dVar.f85693w.f22677a).getValue()).f292508a;
            LocationDomain location = fVar != null ? fVar.getLocation() : null;
            if (location == null) {
                throw new IllegalArgumentException("Location not set");
            }
            this.u = 1;
            if (g0Var.a(str, location, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.B2();
        return Unit.f186387a;
    }
}
