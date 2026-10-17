package yjl;

import com.revolut.sso.api.models.ConsentedClient;
import java.util.ArrayList;
import java.util.List;
import jkl.u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {
    public static final ConsentedClient.Consent a(u0.b bVar) {
        com.revolut.sso.api.models.c cVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean display = bVar.getDisplay();
        String name = bVar.getName();
        String displayName = bVar.getDisplayName();
        List<u0.b.a> claims = bVar.getClaims();
        ArrayList arrayList = new ArrayList(zhm.w.t(claims, 10));
        for (u0.b.a aVar : claims) {
            switch (k.f314547a[aVar.getName().ordinal()]) {
                case 1:
                    cVar = com.revolut.sso.api.models.c.ADDRESS;
                    break;
                case 2:
                    cVar = com.revolut.sso.api.models.c.BIRTH_DATE;
                    break;
                case 3:
                    cVar = com.revolut.sso.api.models.c.CITIZENSHIP;
                    break;
                case 4:
                    cVar = com.revolut.sso.api.models.c.EMAIL;
                    break;
                case 5:
                    cVar = com.revolut.sso.api.models.c.NAME;
                    break;
                case 6:
                    cVar = com.revolut.sso.api.models.c.PHONE;
                    break;
                case 7:
                    cVar = com.revolut.sso.api.models.c.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new ConsentedClient.Consent.Claim(cVar, aVar.getDisplayName(), aVar.getValue()));
        }
        return new ConsentedClient.Consent(name, displayName, bVar.getDescription(), arrayList, display);
    }
}
