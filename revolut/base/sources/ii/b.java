package ii;

import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaOrientation;
import com.hcaptcha.sdk.HCaptchaSize;
import com.hcaptcha.sdk.HCaptchaTheme;

/* JADX INFO: loaded from: classes17.dex */
public final class b {
    public boolean A;
    public Boolean B;
    public boolean C;
    public j D;
    public boolean E;
    public long F;
    public boolean G;
    public Boolean H;
    public boolean I;
    public Boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f161472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f161473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f161474c;
    public boolean d;
    public Boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f161475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f161476h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f161477j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f161478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f161479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f161480n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f161481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f161482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HCaptchaSize f161483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f161484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HCaptchaOrientation f161485t;
    public boolean u;
    public HCaptchaTheme v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f161486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f161487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f161488y;
    public String z;

    public final HCaptchaConfig a() {
        Boolean bool = this.f161474c;
        if (!this.f161473b) {
            bool = Boolean.TRUE;
        }
        Boolean bool2 = bool;
        Boolean bool3 = this.e;
        if (!this.d) {
            bool3 = Boolean.TRUE;
        }
        Boolean bool4 = bool3;
        Boolean bool5 = this.f161475g;
        if (!this.f) {
            bool5 = Boolean.FALSE;
        }
        Boolean bool6 = bool5;
        String str$default$apiEndpoint = HCaptchaConfig.$default$apiEndpoint();
        String str$default$jsSrc = this.f161477j;
        if (!this.i) {
            str$default$jsSrc = HCaptchaConfig.$default$jsSrc();
        }
        String str = str$default$jsSrc;
        String str$default$locale = this.f161481p;
        if (!this.o) {
            str$default$locale = HCaptchaConfig.$default$locale();
        }
        String str2 = str$default$locale;
        HCaptchaSize hCaptchaSize = this.f161483r;
        if (!this.f161482q) {
            hCaptchaSize = HCaptchaSize.INVISIBLE;
        }
        HCaptchaSize hCaptchaSize2 = hCaptchaSize;
        HCaptchaOrientation hCaptchaOrientation = this.f161485t;
        if (!this.f161484s) {
            hCaptchaOrientation = HCaptchaOrientation.PORTRAIT;
        }
        HCaptchaOrientation hCaptchaOrientation2 = hCaptchaOrientation;
        HCaptchaTheme hCaptchaTheme = this.v;
        if (!this.u) {
            hCaptchaTheme = HCaptchaTheme.LIGHT;
        }
        HCaptchaTheme hCaptchaTheme2 = hCaptchaTheme;
        String str$default$host = this.f161487x;
        if (!this.f161486w) {
            str$default$host = HCaptchaConfig.$default$host();
        }
        String str3 = str$default$host;
        String str$default$customTheme = this.z;
        if (!this.f161488y) {
            str$default$customTheme = HCaptchaConfig.$default$customTheme();
        }
        String str4 = str$default$customTheme;
        Boolean bool7 = this.B;
        if (!this.A) {
            bool7 = Boolean.FALSE;
        }
        Boolean bool8 = bool7;
        j jVar$default$retryPredicate = this.D;
        if (!this.C) {
            jVar$default$retryPredicate = HCaptchaConfig.$default$retryPredicate();
        }
        j jVar = jVar$default$retryPredicate;
        long j$default$tokenExpiration = this.F;
        if (!this.E) {
            j$default$tokenExpiration = HCaptchaConfig.$default$tokenExpiration();
        }
        long j2 = j$default$tokenExpiration;
        Boolean bool9 = this.H;
        if (!this.G) {
            bool9 = Boolean.FALSE;
        }
        Boolean bool10 = bool9;
        Boolean bool11 = this.J;
        if (!this.I) {
            bool11 = Boolean.TRUE;
        }
        return new HCaptchaConfig(this.f161472a, bool2, bool4, bool6, this.f161476h, str$default$apiEndpoint, str, this.k, this.f161478l, this.f161479m, this.f161480n, str2, hCaptchaSize2, hCaptchaOrientation2, hCaptchaTheme2, str3, str4, bool8, jVar, j2, bool10, bool11);
    }

    public final String toString() {
        return "HCaptchaConfig.HCaptchaConfigBuilder(siteKey=" + this.f161472a + ", sentry$value=" + this.f161474c + ", loading$value=" + this.e + ", hideDialog$value=" + this.f161475g + ", rqdata=" + this.f161476h + ", apiEndpoint$value=null, jsSrc$value=" + this.f161477j + ", endpoint=" + this.k + ", reportapi=" + this.f161478l + ", assethost=" + this.f161479m + ", imghost=" + this.f161480n + ", locale$value=" + this.f161481p + ", size$value=" + this.f161483r + ", orientation$value=" + this.f161485t + ", theme$value=" + this.v + ", host$value=" + this.f161487x + ", customTheme$value=" + this.z + ", resetOnTimeout$value=" + this.B + ", retryPredicate$value=" + this.D + ", tokenExpiration$value=" + this.F + ", diagnosticLog$value=" + this.H + ", disableHardwareAcceleration$value=" + this.J + ")";
    }
}
