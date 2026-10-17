package b74;

import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LegacyEditConsentPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = legacyEditConsentPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.v, continuation, 0);
            default:
                return new p(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) legacyEditConsentPreferencesScreen.e3()).C2(t.f12900a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) legacyEditConsentPreferencesScreen.e3();
                s sVar = (s) ((j2) aVar3.f67279p.f22677a).getValue();
                if (sVar.f12899b) {
                    aVar3.C2(new u(sVar.f12898a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
