package ca;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import c1i.f;
import c2f.m;
import com.feature.feature_meta_sso_impl.MetaSsoWebAuthorizationHandlerActivity;
import com.revolut.data.utils.gson.GsonHolder;
import ecm.q;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.t0;
import yji.l;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends h implements j {
    public final aa.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final by5.a f22509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Activity f22510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f22511r;

    public d(aa.c oAuthResultInteractor, by5.a metaSsoFlowDialogMapper, Activity context) {
        Intrinsics.checkNotNullParameter(oAuthResultInteractor, "oAuthResultInteractor");
        Intrinsics.checkNotNullParameter(metaSsoFlowDialogMapper, "metaSsoFlowDialogMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.o = oAuthResultInteractor;
        this.f22509p = metaSsoFlowDialogMapper;
        this.f22510q = context;
        this.f22511r = d8l.d.a(this, new m(23));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, new t0(this.o.f2718b, 1), null, null, new f(this, (Continuation) null, 23), 3);
    }

    public final void I2() throws UnsupportedEncodingException {
        aa.c cVar = this.o;
        cVar.getClass();
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
        q qVar = cVar.f2717a;
        Intrinsics.checkNotNullParameter("STATE_UUID_KEY", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String strK = GsonHolder.a().k(value);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        if (strK.length() != 0) {
            ((SharedPreferences) qVar.f124861b).edit().putString("STATE_UUID_KEY", strK).apply();
        }
        cVar.f2718b.k(null);
        String authUrl = "https://www.facebook.com/v25.0/dialog/oauth?client_id=759244388703681&redirect_uri=" + URLEncoder.encode("https://revolut.com/app/meta-sso/auth", "UTF-8") + "&state=" + value;
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        MetaSsoWebAuthorizationHandlerActivity.Companion.getClass();
        Activity context = this.f22510q;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        Intent intent = new Intent(context, (Class<?>) MetaSsoWebAuthorizationHandlerActivity.class);
        intent.putExtra("EXTRA_KEY_AUTH_URL", authUrl);
        context.startActivity(intent);
    }

    @Override // yki.j
    public final void M0() throws UnsupportedEncodingException {
        I2();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f22511r;
    }
}
