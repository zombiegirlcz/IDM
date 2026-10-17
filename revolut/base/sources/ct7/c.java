package ct7;

import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f108649a;

    public static final class a {
        private a() {
        }
    }

    public c() {
        String[] elements = {"credit-insurance/loan", "credit-insurance/credit-card"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f108649a = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f108649a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) throws IOException {
        String strA;
        Facility creditCard;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA2 = g.a("facility-id", linkedHashMap);
        if (strA2 == null || (strA = g.a("policy-id", linkedHashMap)) == null) {
            return null;
        }
        String strK0 = d0.k0(deeplink.d, "/", null, null, 0, null, 62);
        if (Intrinsics.f(strK0, "credit-insurance/loan")) {
            creditCard = new Facility.Loan(strA2);
        } else {
            if (!Intrinsics.f(strK0, "credit-insurance/credit-card")) {
                return null;
            }
            creditCard = new Facility.CreditCard(strA2);
        }
        return new InsuranceCreditNavigationDestination(creditCard, strA, g.a("destination", linkedHashMap));
    }
}
