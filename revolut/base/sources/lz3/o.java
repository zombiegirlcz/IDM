package lz3;

import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import hs3.v;
import hs3.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements a {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wie.a f200928a;

    public o(wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200928a = creditAccountDestinationResolver;
    }

    @Override // lz3.a
    public final Object a(it3.d dVar, Continuation continuation) {
        Object obj2;
        Object next;
        String str;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof y)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof y) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.ExitMetadata");
            }
            obj2 = (y) obj3;
        }
        y yVar = (y) obj2;
        if (yVar == null || (str = yVar.f154971a) == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "NonEmbeddedCreditInsuranceFtcExitDelegate", "facilityId is null after finishing the application", null, null, 16);
            return null;
        }
        Map map = yVar.f154973c;
        String str2 = map != null ? (String) map.get("insurancePolicyId") : null;
        return this.f200928a.c(new CreditAccountType.Loan(str), str2 != null ? new TabAccountsInitialPayload.Action(new InsuranceCreditNavigationDestination(new Facility.Loan(str), str2, null)) : null, (gim.c) continuation);
    }
}
