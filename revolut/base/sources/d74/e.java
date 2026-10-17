package d74;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ LegacyConsentPreferencesScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LegacyConsentPreferencesScreen legacyConsentPreferencesScreen, Continuation continuation) {
        super(2, continuation);
        this.u = legacyConsentPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) this.u.d();
        mVar.H2(mVar.f111822r, new d6j.b(11));
        mVar.J2();
        return Unit.f186387a;
    }
}
