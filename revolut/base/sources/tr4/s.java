package tr4;

import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.c0;
import om4.r1;
import te0.w;
import tof.i7;
import tof.s9;
import tof.xa;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.credit.card.impl.ui.instalment.confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wi0.b countryCode = (wi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.card.impl.ui.instalment.confirmation.a aVar2 = this.v;
        whf.b bVar = aVar2.f69312t;
        i7.c cVar = i7.Companion;
        InstalmentConfirmationScreenContract$InputData instalmentConfirmationScreenContract$InputData = aVar2.o;
        i7[] i7VarArr = {new s9(instalmentConfirmationScreenContract$InputData.f69300b), new xa(instalmentConfirmationScreenContract$InputData.d)};
        cVar.getClass();
        vkm.d dVarB = rd0.e.b(whf.b.a(bVar, w.h(i7.c.a(i7VarArr)), null, null, null, 14));
        smd.s sVar = aVar2.f69308p;
        io3.l pocketType = instalmentConfirmationScreenContract$InputData.d;
        String facilityId = instalmentConfirmationScreenContract$InputData.f69299a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int i = a.f273725a[pocketType.ordinal()];
        w4l.h hVar = w4l.h.f294642c;
        return nim.a.v(u0.m(dVarB, i == 1 ? nim.a.v(((c0) ((al4.e) sVar.f264433b)).a(countryCode, hVar), new tpi.g(4)) : nim.a.v(((r1) ((al4.m) sVar.f264432a)).m(facilityId, hVar), new tpi.g(5))), new tkm.d(aVar2, countryCode, 17));
    }
}
