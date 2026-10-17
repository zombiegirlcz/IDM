package s9b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.retail.global_accounts.api.navigation.CountryProfileOnboardingFlowDestination;
import com.revolut.feature.retail.global_accounts.impl.management.ui.CountryProfilesManagementScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CountryProfilesManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CountryProfilesManagementScreen countryProfilesManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = countryProfilesManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String country;
        String country2;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        Intrinsics.h(model);
        p pVar = (p) hVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof e) {
            zlg.c cVar = ((e) obj3).f261152a;
            do3.e eVar = cVar.f323250a;
            String str = eVar.f116395a;
            Address address = eVar.e;
            if (address == null || (country2 = address.getCountry()) == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CountryProfilesManagementScreenModel", j6.a.q("Missing country value for Registered Identity ", str), null, h0Var);
            } else {
                pVar.I2(str, country2, cVar.f323251b ? p9b.c.DEFAULT : p9b.c.NON_DEFAULT);
            }
        } else if (obj3 instanceof f) {
            do3.e eVar2 = ((f) obj3).f261153a.f323250a;
            String str2 = eVar2.f116395a;
            Address address2 = eVar2.e;
            if (address2 == null || (country = address2.getCountry()) == null) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CountryProfilesManagementScreenModel", j6.a.q("Missing country value for Registered Identity ", str2), null, h0Var2);
            } else {
                pVar.I2(str2, country, p9b.c.TERMINATED);
            }
        } else if (Intrinsics.f(obj3, d.f261151a)) {
            pVar.C1(CountryProfileOnboardingFlowDestination.f82639a);
        }
        return Unit.f186387a;
    }
}
