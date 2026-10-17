package vvc;

import cli.y;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SetTrustedLocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SetTrustedLocationScreen setTrustedLocationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = setTrustedLocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetTrustedLocationScreen setTrustedLocationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) setTrustedLocationScreen.e3()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) setTrustedLocationScreen.e3();
                g gVar = (g) ((j2) dVar.f85693w.f22677a).getValue();
                String str = gVar.d;
                if (str != null || (str = gVar.e) != null) {
                    dVar.C2(new i(str));
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) setTrustedLocationScreen.e3()).C2(k.f292515a);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) setTrustedLocationScreen.e3();
                SetTrustedLocationScreenContract$InputData setTrustedLocationScreenContract$InputData = dVar2.o;
                if (setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.EditTrustedLocation) {
                    dVar2.l2(new com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.b(dVar2, (SetTrustedLocationScreenContract$InputData.EditTrustedLocation) setTrustedLocationScreenContract$InputData, null), new yi5.b(26));
                } else if (setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation) {
                    dVar2.A1(new com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.c(dVar2, (SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation) setTrustedLocationScreenContract$InputData, null), new yi5.b(25));
                } else {
                    if (!(setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.SetTrustedLocation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y yVar = dVar2.f85693w;
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
                    dVar2.C2(new j(location, mVar.f292516a));
                }
                return Unit.f186387a;
        }
    }
}
