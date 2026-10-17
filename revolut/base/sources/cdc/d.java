package cdc;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.k;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f23229a;

    public d(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f23229a = uriHelper;
    }

    public static String a(String str, List list) throws IOException {
        if (list.isEmpty()) {
            return str;
        }
        String strK0 = d0.k0(list, "&", null, null, 0, new ccg.c(9), 30);
        return (str == null || kotlin.text.d0.W(str)) ? strK0 : com.google.android.gms.internal.mlkit_vision_face.a.o(str, "&", strK0);
    }

    public final Uri b(String url2, String orderToken) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Uri uriF = ((f80.b) this.f23229a).f(url2);
        Uri uriBuild = uriF.buildUpon().encodedFragment(a(uriF.getFragment(), v.k(new Pair("_rp_dos", "payment_summary"), new Pair("_rp_oid", orderToken)))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "run(...)");
        return uriBuild;
    }

    public final Uri c(String url2, String orderToken) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Uri uriBuild = ((f80.b) this.f23229a).f(url2).buildUpon().appendQueryParameter("_rp_dos", "payment_summary").appendQueryParameter("_rp_oid", orderToken).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    public final Uri d(String url2, k kVar, String orderToken) {
        String strName;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        if (kVar == null || (strName = kVar.name()) == null) {
            strName = "UNKNOWN";
        }
        Uri uriF = ((f80.b) this.f23229a).f(url2);
        Uri uriBuild = uriF.buildUpon().encodedFragment(a(uriF.getFragment(), v.k(new Pair("_rp_fr", strName), new Pair("_rp_oid", orderToken)))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "run(...)");
        return uriBuild;
    }

    public final Uri e(String url2, k kVar, String orderToken) {
        String strName;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        if (kVar == null || (strName = kVar.name()) == null) {
            strName = "UNKNOWN";
        }
        Uri uriBuild = ((f80.b) this.f23229a).f(url2).buildUpon().appendQueryParameter("_rp_fr", strName).appendQueryParameter("_rp_oid", orderToken).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    public final Uri f(String url2, String orderToken) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Uri uriF = ((f80.b) this.f23229a).f(url2);
        Uri uriBuild = uriF.buildUpon().encodedFragment(a(uriF.getFragment(), v.k(new Pair("_rp_s", "true"), new Pair("_rp_oid", orderToken)))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "run(...)");
        return uriBuild;
    }

    public final Uri g(String url2, String orderToken) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Uri uriBuild = ((f80.b) this.f23229a).f(url2).buildUpon().appendQueryParameter("_rp_s", "true").appendQueryParameter("_rp_oid", orderToken).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }
}
