package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import cli.y;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import vvc.f;
import vvc.g;
import vvc.m;
import vvc.p;
import wtc.g0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetTrustedLocationScreenContract$InputData.EditTrustedLocation f85685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, SetTrustedLocationScreenContract$InputData.EditTrustedLocation editTrustedLocation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f85685w = editTrustedLocation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f85685w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar = this.v;
        y yVar = dVar.f85693w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            g0 g0Var = dVar.f85691s;
            StreetModeTrustedLocation streetModeTrustedLocation = this.f85685w.f85681a;
            String str = streetModeTrustedLocation.f85428a;
            String str2 = streetModeTrustedLocation.f85429b;
            f fVar = ((g) ((j2) yVar.f22677a).getValue()).f292508a;
            LocationDomain location = fVar != null ? fVar.getLocation() : null;
            if (location == null) {
                throw new IllegalArgumentException("Location not set");
            }
            p pVar = ((g) ((j2) yVar.f22677a).getValue()).f292509b;
            m mVar = pVar instanceof m ? (m) pVar : null;
            if (mVar == null) {
                throw new IllegalArgumentException("Radius state not acceptable");
            }
            int i2 = mVar.f292516a;
            this.u = 1;
            if (g0Var.i(str, str2, location, i2, this) == aVar) {
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
