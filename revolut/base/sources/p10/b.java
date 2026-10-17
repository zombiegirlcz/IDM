package p10;

import android.os.Build;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f231593c;
    public final List d;
    public final Integer e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f231594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f231595h;
    public final lm.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f231596j;
    public final String k;

    public b(String appVersion, boolean z, String hostPattern, List sslPins, Integer num, ResourceImage resourceImage, Integer num2, Integer num3, lm.d webSocketOnDemand, String mobileServices) {
        String phoneModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter("4.5.0", "chatVersion");
        Intrinsics.checkNotNullParameter("https://chat.revolut.com", "host");
        Intrinsics.checkNotNullParameter("https://chat.revolut.com/api/client/ws", "wsHost");
        Intrinsics.checkNotNullParameter(hostPattern, "hostPattern");
        Intrinsics.checkNotNullParameter(sslPins, "sslPins");
        Intrinsics.checkNotNullParameter("revolut", "deeplinkScheme");
        Intrinsics.checkNotNullParameter(webSocketOnDemand, "webSocketOnDemand");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        this.f231591a = appVersion;
        this.f231592b = z;
        this.f231593c = hostPattern;
        this.d = sslPins;
        this.e = num;
        this.f = resourceImage;
        this.f231594g = num2;
        this.f231595h = num3;
        this.i = webSocketOnDemand;
        this.f231596j = mobileServices;
        this.k = v0.a.i(v0.a.m("Chat/4.5.0 (", phoneModel, "; Android ", osVersion, "; sp:"), mobileServices, ")");
    }

    public static String a(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String country = locale.getCountry();
        if (country != null && country.length() != 0) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(locale.getLanguage(), "-", locale.getCountry());
        }
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        String str = Build.MODEL;
        if (!Intrinsics.f(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.f(str2, str2) && Intrinsics.f(this.f231591a, bVar.f231591a) && this.f231592b == bVar.f231592b && Intrinsics.f(this.f231593c, bVar.f231593c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.f231594g.equals(bVar.f231594g) && this.f231595h.equals(bVar.f231595h) && this.i.equals(bVar.i) && Intrinsics.f(this.f231596j, bVar.f231596j);
    }

    public final int hashCode() {
        return this.f231596j.hashCode() + ((this.i.hashCode() + ((this.f231595h.hashCode() + ((this.f231594g.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f, (this.e.hashCode() + ((((this.d.hashCode() + p.a.c((((((Boolean.hashCode(this.f231592b) + ((((this.f231591a.hashCode() + p.a.c(Build.MODEL.hashCode() * 31, 31, Build.VERSION.RELEASE)) * 31) + 49445885) * 31)) * 31) - 100327765) * 31) - 131549817) * 31, 31, this.f231593c)) * 31) + 1100138591) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }
}
