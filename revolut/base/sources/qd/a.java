package qd;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f244811g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f244812h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244815c;
    public final Date d;
    public final long e;
    public final long f;

    public a(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f244813a = str;
        this.f244814b = str2;
        this.f244815c = str3;
        this.d = date;
        this.e = j2;
        this.f = j3;
    }

    public final td.a a() {
        td.a aVar = new td.a();
        aVar.f269894a = "frc";
        aVar.f269901m = this.d.getTime();
        aVar.f269895b = this.f244813a;
        aVar.f269896c = this.f244814b;
        String str = this.f244815c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.d = str;
        aVar.e = this.e;
        aVar.f269899j = this.f;
        return aVar;
    }
}
