package m2j;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.balance.picker.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f202052b;

    public /* synthetic */ k(q qVar, int i) {
        this.f202051a = i;
        this.f202052b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String country;
        switch (this.f202051a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ArrayList arrayListE0 = zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
                if (arrayListE0.isEmpty()) {
                    return a.f202010a;
                }
                k1j.c cVar = k1j.c.SUBACCOUNTS;
                int i = R$string.payments_balance_picker_section_vaults_title;
                this.f202052b.getClass();
                return new b(new k1j.b(cVar, q.a(i), arrayListE0, 4));
            default:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                if (address != null && (country = address.getCountry()) != null) {
                    if (country.length() <= 0) {
                        country = null;
                    }
                    if (country != null) {
                        return country;
                    }
                }
                return ((s80.b) this.f202052b.i).a().getCountry();
        }
    }
}
