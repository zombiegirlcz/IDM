package b74;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreenContract$InputData;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditConsentPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditConsentPreferencesScreen editConsentPreferencesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editConsentPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ConsentRetention consentRetentionI2;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String listId = model.f53228a;
        l lVar = (l) jVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        EditConsentPreferencesScreenContract$InputData editConsentPreferencesScreenContract$InputData = lVar.o;
        EditPreferencesConfiguration editPreferencesConfiguration = editConsentPreferencesScreenContract$InputData.f67276a;
        if (!Intrinsics.f(listId, "consent-retention-default")) {
            if (Intrinsics.f(listId, "consent-retention-custom")) {
                consentRetentionI2 = lVar.I2((LocalDate) kotlin.ranges.f.j(editPreferencesConfiguration.getE(), editPreferencesConfiguration.getF67267c(), editPreferencesConfiguration.getD()));
            }
            return Unit.f186387a;
        }
        EditPreferencesConfiguration editPreferencesConfiguration2 = editConsentPreferencesScreenContract$InputData.f67276a;
        if (editPreferencesConfiguration2 instanceof EditPreferencesConfiguration.ActiveFacility) {
            consentRetentionI2 = ConsentRetention.ActiveFacility.Indefinitely.f66438a;
        } else {
            if (!(editPreferencesConfiguration2 instanceof EditPreferencesConfiguration.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            consentRetentionI2 = new ConsentRetention.Application.DefaultDuration(((EditPreferencesConfiguration.Application) editPreferencesConfiguration2).f67266b);
        }
        lVar.H2(lVar.f12894p, new b58.f(consentRetentionI2, lVar, 12));
        return Unit.f186387a;
    }
}
