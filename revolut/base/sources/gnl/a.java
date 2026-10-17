package gnl;

import android.content.Context;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g90.a f145027b;

    public a(Context context, g90.a telephonyProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(telephonyProvider, "telephonyProvider");
        this.f145026a = context;
        this.f145027b = telephonyProvider;
    }

    public static List b() {
        wi0.b.Companion.getClass();
        return zhm.v.k(wi0.b.p0, wi0.b.L0, wi0.b.f297750h0, wi0.b.f297760n0);
    }

    public final wi0.b a() {
        wi0.b bVarA;
        wi0.b bVarA2;
        Locale locale;
        TelephonyManager telephonyManager = this.f145027b.f141426a;
        String simCountryIso = telephonyManager.getSimCountryIso();
        wi0.b bVarA3 = null;
        if (simCountryIso == null || d0.W(simCountryIso)) {
            bVarA = null;
        } else {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(simCountryIso);
        }
        if (bVarA != null) {
            return bVarA;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (networkCountryIso == null || d0.W(networkCountryIso)) {
            bVarA2 = null;
        } else {
            wi0.b.Companion.getClass();
            bVarA2 = wi0.a.a(networkCountryIso);
        }
        if (bVarA2 != null) {
            return bVarA2;
        }
        LocaleList locales = this.f145026a.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            locales = null;
        }
        if (locales != null && (locale = locales.get(0)) != null) {
            String country = locale.getCountry();
            Intrinsics.h(country);
            if (country.length() != 0) {
                wi0.b.Companion.getClass();
                bVarA3 = wi0.a.a(country);
            }
        }
        return bVarA3 == null ? (wi0.b) zhm.d0.b0(b()) : bVarA3;
    }
}
