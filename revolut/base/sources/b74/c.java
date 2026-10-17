package b74;

import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditConsentPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EditConsentPreferencesScreen editConsentPreferencesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editConsentPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditConsentPreferencesScreen editConsentPreferencesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((l) editConsentPreferencesScreen.e3()).C2(g.f12889a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) editConsentPreferencesScreen.e3();
                f fVar = (f) ((j2) lVar.f12894p.f22677a).getValue();
                if (fVar.f12888b) {
                    lVar.C2(new h(fVar.f12887a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
