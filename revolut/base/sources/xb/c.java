package xb;

import ac.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import xe.d;
import yb.h0;
import yb.i0;
import yb.l;
import zb.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wif.a f303921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f303922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f303923c;
    public final URL d;
    public final ic.a e;
    public final ic.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f303924g;

    public c(Context context, ic.a aVar, ic.a aVar2) {
        d dVar = new d();
        l.f312114a.configure(dVar);
        dVar.d = true;
        this.f303921a = new wif.a(dVar);
        this.f303923c = context;
        this.f303922b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f303915c);
        this.e = aVar2;
        this.f = aVar;
        this.f303924g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(j6.a.q("Invalid url: ", str), e);
        }
    }

    public final i a(i iVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f303922b.getActiveNetworkInfo();
        zb.h hVarC = iVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map = hVarC.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i));
        hVarC.a("model", Build.MODEL);
        hVarC.a("hardware", Build.HARDWARE);
        hVarC.a("device", Build.DEVICE);
        hVarC.a("product", Build.PRODUCT);
        hVarC.a("os-uild", Build.ID);
        hVarC.a("manufacturer", Build.MANUFACTURER);
        hVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = hVarC.f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iB = activeNetworkInfo == null ? i0.NONE.b() : activeNetworkInfo.getType();
        HashMap map3 = hVarC.f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(iB));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = h0.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = h0.COMBINED.b();
            } else if (h0.a(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = hVarC.f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        hVarC.a("country", Locale.getDefault().getCountry());
        hVarC.a("locale", Locale.getDefault().getLanguage());
        Context context = this.f303923c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        hVarC.a("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            nim.a.k("CctTransportBackend", "Unable to find version code for package", e);
        }
        hVarC.a("application_build", Integer.toString(i2));
        return hVarC.b();
    }
}
