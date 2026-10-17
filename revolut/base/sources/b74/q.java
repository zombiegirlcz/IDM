package b74;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreenContract$InputData;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LegacyEditConsentPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = legacyEditConsentPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ConsentRetention consentRetentionI2;
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVarD = this.v.d();
        String listId = model.f52519a;
        com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) wVarD;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        LegacyEditConsentPreferencesScreenContract$InputData legacyEditConsentPreferencesScreenContract$InputData = aVar2.o;
        EditPreferencesConfiguration editPreferencesConfiguration = legacyEditConsentPreferencesScreenContract$InputData.f67277a;
        if (!Intrinsics.f(listId, "consent-retention-default")) {
            if (Intrinsics.f(listId, "consent-retention-custom")) {
                consentRetentionI2 = aVar2.I2((LocalDate) kotlin.ranges.f.j(editPreferencesConfiguration.getE(), editPreferencesConfiguration.getF67267c(), editPreferencesConfiguration.getD()));
            }
            return Unit.f186387a;
        }
        EditPreferencesConfiguration editPreferencesConfiguration2 = legacyEditConsentPreferencesScreenContract$InputData.f67277a;
        if (editPreferencesConfiguration2 instanceof EditPreferencesConfiguration.ActiveFacility) {
            consentRetentionI2 = ConsentRetention.ActiveFacility.Indefinitely.f66438a;
        } else {
            if (!(editPreferencesConfiguration2 instanceof EditPreferencesConfiguration.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            consentRetentionI2 = new ConsentRetention.Application.DefaultDuration(((EditPreferencesConfiguration.Application) editPreferencesConfiguration2).f67266b);
        }
        aVar2.H2(aVar2.f67279p, new b58.f(consentRetentionI2, aVar2, 13));
        return Unit.f186387a;
    }
}
