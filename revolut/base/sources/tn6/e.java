package tn6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConsentScreen f272312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ConsentScreen consentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f272312w = consentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f272312w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f272312w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConsentScreen consentScreen = this.f272312w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = consentScreen.e3();
                Intrinsics.h(aVar);
                ((l) iVarE3).I2(aVar);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = consentScreen.e3();
                Intrinsics.h(aVar3);
                ((l) iVarE32).I2(aVar3);
                break;
        }
        return Unit.f186387a;
    }
}
