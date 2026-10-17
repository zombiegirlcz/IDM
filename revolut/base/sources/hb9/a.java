package hb9;

import com.revolut.feature.onboarding.models.OnboardingCompany;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t89.f;
import t89.g;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static g a(List companies, wi0.b country) {
        Object next;
        Intrinsics.checkNotNullParameter(companies, "companies");
        Intrinsics.checkNotNullParameter(country, "country");
        Iterator it8 = companies.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((OnboardingCompany) next).d.contains(country)) {
                break;
            }
        }
        OnboardingCompany onboardingCompany = (OnboardingCompany) next;
        if (onboardingCompany == null) {
            return null;
        }
        f fVar = g.Companion;
        String str = onboardingCompany.f78598a;
        fVar.getClass();
        return f.a(str);
    }
}
