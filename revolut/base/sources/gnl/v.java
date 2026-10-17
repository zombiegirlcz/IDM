package gnl;

import akl.z;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import gkl.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends x7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f145057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f145058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f145059c;
    public final z80.b d;

    public v(z configurationRepository, f01.a uiKitResources, a countriesProvider, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(countriesProvider, "countriesProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f145057a = configurationRepository;
        this.f145058b = uiKitResources;
        this.f145059c = countriesProvider;
        this.d = phoneToolsProvider;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new s7a.q((String) d0.a0(ids), null);
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.a aVar = wi0.b.Companion;
        String str = countryCode.f297794a;
        aVar.getClass();
        return j6.a.q("+", this.d.j(wi0.a.a(str)));
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.f145058b.b(new CountryClause(countryCode, null)).toString();
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        List<o.b> listA = this.f145057a.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o.b bVar : listA) {
            wi0.a aVar = wi0.b.Companion;
            String value = bVar.getValue();
            aVar.getClass();
            arrayList.add(wi0.a.a(value));
        }
        if (arrayList.isEmpty()) {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Allowed countries must always be present. Absence of data means code is broken, as there always must be a fallback");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        }
        return new go.g(zi0.c.P(arrayList, false, null, 3), 2);
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        this.f145059c.getClass();
        List listB = a.b();
        List<o.b> listA = this.f145057a.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o.b bVar : listA) {
            wi0.a aVar = wi0.b.Companion;
            String value = bVar.getValue();
            aVar.getClass();
            arrayList.add(wi0.a.a(value));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listB) {
            if (arrayList.contains((wi0.b) obj3)) {
                arrayList2.add(obj3);
            }
        }
        return new go.g(zi0.c.P(arrayList2, false, null, 3), 2);
    }
}
