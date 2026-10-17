package t70;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import no.h1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f268385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f268386b;

    public b(h localizationContext, d dynamicStringsListenerProvider) {
        Intrinsics.checkNotNullParameter(localizationContext, "localizationContext");
        Intrinsics.checkNotNullParameter(dynamicStringsListenerProvider, "dynamicStringsListenerProvider");
        this.f268385a = localizationContext;
        this.f268386b = dynamicStringsListenerProvider;
    }

    public final String a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (cp5.d.z(currency)) {
            String strE = cp5.d.e(currency);
            return strE.length() == 0 ? cp5.d.K(currency) : strE;
        }
        String str = currency.f306286a;
        String str2 = currency.f306286a;
        String strP = p.a.p("currency.", str, ".name");
        h1 h1VarA = ((e) this.f268386b).a();
        c cVar = c.STRING;
        h1VarA.a(strP, cVar.a());
        h hVar = this.f268385a;
        int identifier = hVar.getResources().getIdentifier(strP, cVar.a(), hVar.getPackageName());
        if (identifier != 0) {
            String string = hVar.getString(identifier);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        String strQ = cp5.d.q(jh.d.e(hVar), currency);
        if (strQ != null) {
            strQ = jli.g.b(strQ);
        }
        if (strQ == null || strQ.length() == 0 || Intrinsics.f(strQ, str2)) {
            strQ = cp5.d.e(currency);
        }
        return strQ.length() == 0 ? str2 : strQ;
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        xi0.b.Companion.getClass();
        return a(xi0.a.a(str));
    }

    public final String c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(currency.f306286a);
        m70.a.a(t0.f186434a);
        gj7.b.b(" · ", sb6);
        gj7.b.b(a(currency), sb6);
        return sb6.toString();
    }
}
