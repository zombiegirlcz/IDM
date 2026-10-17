package com.hcaptcha.sdk;

import d9.u;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ii.j;
import java.io.Serializable;
import java.util.Locale;
import lombok.Generated;
import lombok.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public class HCaptchaConfig implements Serializable {

    @u
    @Deprecated
    private String apiEndpoint;
    private String assethost;
    private String customTheme;
    private Boolean diagnosticLog;

    @NonNull
    private Boolean disableHardwareAcceleration;
    private String endpoint;
    private Boolean hideDialog;
    private String host;
    private String imghost;
    private String jsSrc;
    private Boolean loading;
    private String locale;
    private HCaptchaOrientation orientation;
    private String reportapi;

    @Deprecated
    private Boolean resetOnTimeout;

    @u
    private j retryPredicate;
    private String rqdata;
    private Boolean sentry;

    @NonNull
    private String siteKey;
    private HCaptchaSize size;
    private HCaptchaTheme theme;
    private long tokenExpiration;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$apiEndpoint() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$customTheme() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$host() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$jsSrc() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$locale() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static j $default$retryPredicate() {
        return new ii.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static long $default$tokenExpiration() {
        return 120L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaConfig(@NonNull String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str10, String str11, Boolean bool4, j jVar, long j2, Boolean bool5, @NonNull Boolean bool6) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        if (bool6 == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.siteKey = str;
        this.sentry = bool;
        this.loading = bool2;
        this.hideDialog = bool3;
        this.rqdata = str2;
        this.apiEndpoint = str3;
        this.jsSrc = str4;
        this.endpoint = str5;
        this.reportapi = str6;
        this.assethost = str7;
        this.imghost = str8;
        this.locale = str9;
        this.size = hCaptchaSize;
        this.orientation = hCaptchaOrientation;
        this.theme = hCaptchaTheme;
        this.host = str10;
        this.customTheme = str11;
        this.resetOnTimeout = bool4;
        this.retryPredicate = jVar;
        this.tokenExpiration = j2;
        this.diagnosticLog = bool5;
        this.disableHardwareAcceleration = bool6;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ii.b builder() {
        return new ii.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$$default$retryPredicate$41a513e9$1(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        return Boolean.TRUE.equals(hCaptchaConfig.resetOnTimeout) && hCaptchaException.f49849a == HCaptchaError.SESSION_TIMEOUT;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj2) {
        return obj2 instanceof HCaptchaConfig;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj2;
        if (!hCaptchaConfig.canEqual(this) || getTokenExpiration() != hCaptchaConfig.getTokenExpiration()) {
            return false;
        }
        Boolean sentry = getSentry();
        Boolean sentry2 = hCaptchaConfig.getSentry();
        if (sentry != null ? !sentry.equals(sentry2) : sentry2 != null) {
            return false;
        }
        Boolean loading = getLoading();
        Boolean loading2 = hCaptchaConfig.getLoading();
        if (loading != null ? !loading.equals(loading2) : loading2 != null) {
            return false;
        }
        Boolean hideDialog = getHideDialog();
        Boolean hideDialog2 = hCaptchaConfig.getHideDialog();
        if (hideDialog != null ? !hideDialog.equals(hideDialog2) : hideDialog2 != null) {
            return false;
        }
        Boolean resetOnTimeout = getResetOnTimeout();
        Boolean resetOnTimeout2 = hCaptchaConfig.getResetOnTimeout();
        if (resetOnTimeout != null ? !resetOnTimeout.equals(resetOnTimeout2) : resetOnTimeout2 != null) {
            return false;
        }
        Boolean diagnosticLog = getDiagnosticLog();
        Boolean diagnosticLog2 = hCaptchaConfig.getDiagnosticLog();
        if (diagnosticLog != null ? !diagnosticLog.equals(diagnosticLog2) : diagnosticLog2 != null) {
            return false;
        }
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        Boolean disableHardwareAcceleration2 = hCaptchaConfig.getDisableHardwareAcceleration();
        if (disableHardwareAcceleration != null ? !disableHardwareAcceleration.equals(disableHardwareAcceleration2) : disableHardwareAcceleration2 != null) {
            return false;
        }
        String siteKey = getSiteKey();
        String siteKey2 = hCaptchaConfig.getSiteKey();
        if (siteKey != null ? !siteKey.equals(siteKey2) : siteKey2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaConfig.getRqdata();
        if (rqdata != null ? !rqdata.equals(rqdata2) : rqdata2 != null) {
            return false;
        }
        String apiEndpoint = getApiEndpoint();
        String apiEndpoint2 = hCaptchaConfig.getApiEndpoint();
        if (apiEndpoint != null ? !apiEndpoint.equals(apiEndpoint2) : apiEndpoint2 != null) {
            return false;
        }
        String jsSrc = getJsSrc();
        String jsSrc2 = hCaptchaConfig.getJsSrc();
        if (jsSrc != null ? !jsSrc.equals(jsSrc2) : jsSrc2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = hCaptchaConfig.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String reportapi = getReportapi();
        String reportapi2 = hCaptchaConfig.getReportapi();
        if (reportapi != null ? !reportapi.equals(reportapi2) : reportapi2 != null) {
            return false;
        }
        String assethost = getAssethost();
        String assethost2 = hCaptchaConfig.getAssethost();
        if (assethost != null ? !assethost.equals(assethost2) : assethost2 != null) {
            return false;
        }
        String imghost = getImghost();
        String imghost2 = hCaptchaConfig.getImghost();
        if (imghost != null ? !imghost.equals(imghost2) : imghost2 != null) {
            return false;
        }
        String locale = getLocale();
        String locale2 = hCaptchaConfig.getLocale();
        if (locale != null ? !locale.equals(locale2) : locale2 != null) {
            return false;
        }
        HCaptchaSize size = getSize();
        HCaptchaSize size2 = hCaptchaConfig.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        HCaptchaOrientation orientation = getOrientation();
        HCaptchaOrientation orientation2 = hCaptchaConfig.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        HCaptchaTheme theme = getTheme();
        HCaptchaTheme theme2 = hCaptchaConfig.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = hCaptchaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String customTheme = getCustomTheme();
        String customTheme2 = hCaptchaConfig.getCustomTheme();
        if (customTheme != null ? !customTheme.equals(customTheme2) : customTheme2 != null) {
            return false;
        }
        j retryPredicate = getRetryPredicate();
        j retryPredicate2 = hCaptchaConfig.getRetryPredicate();
        return retryPredicate != null ? retryPredicate.equals(retryPredicate2) : retryPredicate2 == null;
    }

    @Deprecated
    public String getApiEndpoint() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getAssethost() {
        return this.assethost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomTheme() {
        return this.customTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDiagnosticLog() {
        return this.diagnosticLog;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getHideDialog() {
        return this.hideDialog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getHost() {
        return this.host;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getImghost() {
        return this.imghost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getJsSrc() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getLoading() {
        return this.loading;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getLocale() {
        return this.locale;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaOrientation getOrientation() {
        return this.orientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getReportapi() {
        return this.reportapi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public Boolean getResetOnTimeout() {
        return this.resetOnTimeout;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public j getRetryPredicate() {
        return this.retryPredicate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRqdata() {
        return this.rqdata;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getSentry() {
        return this.sentry;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSiteKey() {
        return this.siteKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaSize getSize() {
        return this.size;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaTheme getTheme() {
        return this.theme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getTokenExpiration() {
        return this.tokenExpiration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long tokenExpiration = getTokenExpiration();
        Boolean sentry = getSentry();
        int iHashCode = ((((int) (tokenExpiration ^ (tokenExpiration >>> 32))) + 59) * 59) + (sentry == null ? 43 : sentry.hashCode());
        Boolean loading = getLoading();
        int iHashCode2 = (iHashCode * 59) + (loading == null ? 43 : loading.hashCode());
        Boolean hideDialog = getHideDialog();
        int iHashCode3 = (iHashCode2 * 59) + (hideDialog == null ? 43 : hideDialog.hashCode());
        Boolean resetOnTimeout = getResetOnTimeout();
        int iHashCode4 = (iHashCode3 * 59) + (resetOnTimeout == null ? 43 : resetOnTimeout.hashCode());
        Boolean diagnosticLog = getDiagnosticLog();
        int iHashCode5 = (iHashCode4 * 59) + (diagnosticLog == null ? 43 : diagnosticLog.hashCode());
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        int iHashCode6 = (iHashCode5 * 59) + (disableHardwareAcceleration == null ? 43 : disableHardwareAcceleration.hashCode());
        String siteKey = getSiteKey();
        int iHashCode7 = (iHashCode6 * 59) + (siteKey == null ? 43 : siteKey.hashCode());
        String rqdata = getRqdata();
        int iHashCode8 = (iHashCode7 * 59) + (rqdata == null ? 43 : rqdata.hashCode());
        String apiEndpoint = getApiEndpoint();
        int iHashCode9 = (iHashCode8 * 59) + (apiEndpoint == null ? 43 : apiEndpoint.hashCode());
        String jsSrc = getJsSrc();
        int iHashCode10 = (iHashCode9 * 59) + (jsSrc == null ? 43 : jsSrc.hashCode());
        String endpoint = getEndpoint();
        int iHashCode11 = (iHashCode10 * 59) + (endpoint == null ? 43 : endpoint.hashCode());
        String reportapi = getReportapi();
        int iHashCode12 = (iHashCode11 * 59) + (reportapi == null ? 43 : reportapi.hashCode());
        String assethost = getAssethost();
        int iHashCode13 = (iHashCode12 * 59) + (assethost == null ? 43 : assethost.hashCode());
        String imghost = getImghost();
        int iHashCode14 = (iHashCode13 * 59) + (imghost == null ? 43 : imghost.hashCode());
        String locale = getLocale();
        int iHashCode15 = (iHashCode14 * 59) + (locale == null ? 43 : locale.hashCode());
        HCaptchaSize size = getSize();
        int iHashCode16 = (iHashCode15 * 59) + (size == null ? 43 : size.hashCode());
        HCaptchaOrientation orientation = getOrientation();
        int iHashCode17 = (iHashCode16 * 59) + (orientation == null ? 43 : orientation.hashCode());
        HCaptchaTheme theme = getTheme();
        int iHashCode18 = (iHashCode17 * 59) + (theme == null ? 43 : theme.hashCode());
        String host = getHost();
        int iHashCode19 = (iHashCode18 * 59) + (host == null ? 43 : host.hashCode());
        String customTheme = getCustomTheme();
        int iHashCode20 = (iHashCode19 * 59) + (customTheme == null ? 43 : customTheme.hashCode());
        j retryPredicate = getRetryPredicate();
        return (iHashCode20 * 59) + (retryPredicate != null ? retryPredicate.hashCode() : 43);
    }

    @u
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setApiEndpoint(String str) {
        this.apiEndpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setAssethost(String str) {
        this.assethost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCustomTheme(String str) {
        this.customTheme = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiagnosticLog(Boolean bool) {
        this.diagnosticLog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDisableHardwareAcceleration(@NonNull Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.disableHardwareAcceleration = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHideDialog(Boolean bool) {
        this.hideDialog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHost(String str) {
        this.host = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setImghost(String str) {
        this.imghost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setJsSrc(String str) {
        this.jsSrc = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLoading(Boolean bool) {
        this.loading = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLocale(String str) {
        this.locale = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setOrientation(HCaptchaOrientation hCaptchaOrientation) {
        this.orientation = hCaptchaOrientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReportapi(String str) {
        this.reportapi = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setResetOnTimeout(Boolean bool) {
        this.resetOnTimeout = bool;
    }

    @u
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRetryPredicate(j jVar) {
        this.retryPredicate = jVar;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRqdata(String str) {
        this.rqdata = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSentry(Boolean bool) {
        this.sentry = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSiteKey(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSize(HCaptchaSize hCaptchaSize) {
        this.size = hCaptchaSize;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTheme(HCaptchaTheme hCaptchaTheme) {
        this.theme = hCaptchaTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTokenExpiration(long j2) {
        this.tokenExpiration = j2;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ii.b toBuilder() {
        ii.b bVar = new ii.b();
        String str = this.siteKey;
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        bVar.f161472a = str;
        bVar.f161474c = this.sentry;
        bVar.f161473b = true;
        bVar.e = this.loading;
        bVar.d = true;
        bVar.f161475g = this.hideDialog;
        bVar.f = true;
        bVar.f161476h = this.rqdata;
        bVar.f161477j = this.jsSrc;
        bVar.i = true;
        bVar.k = this.endpoint;
        bVar.f161478l = this.reportapi;
        bVar.f161479m = this.assethost;
        bVar.f161480n = this.imghost;
        bVar.f161481p = this.locale;
        bVar.o = true;
        bVar.f161483r = this.size;
        bVar.f161482q = true;
        bVar.f161485t = this.orientation;
        bVar.f161484s = true;
        bVar.v = this.theme;
        bVar.u = true;
        bVar.f161487x = this.host;
        bVar.f161486w = true;
        bVar.z = this.customTheme;
        bVar.f161488y = true;
        bVar.B = this.resetOnTimeout;
        bVar.A = true;
        bVar.D = this.retryPredicate;
        bVar.C = true;
        bVar.F = this.tokenExpiration;
        bVar.E = true;
        bVar.H = this.diagnosticLog;
        bVar.G = true;
        Boolean bool = this.disableHardwareAcceleration;
        if (bool == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        bVar.J = bool;
        bVar.I = true;
        return bVar;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaConfig(siteKey=" + getSiteKey() + ", sentry=" + getSentry() + ", loading=" + getLoading() + ", hideDialog=" + getHideDialog() + ", rqdata=" + getRqdata() + ", apiEndpoint=" + getApiEndpoint() + ", jsSrc=" + getJsSrc() + ", endpoint=" + getEndpoint() + ", reportapi=" + getReportapi() + ", assethost=" + getAssethost() + ", imghost=" + getImghost() + ", locale=" + getLocale() + ", size=" + getSize() + ", orientation=" + getOrientation() + ", theme=" + getTheme() + ", host=" + getHost() + ", customTheme=" + getCustomTheme() + ", resetOnTimeout=" + getResetOnTimeout() + ", retryPredicate=" + getRetryPredicate() + ", tokenExpiration=" + getTokenExpiration() + ", diagnosticLog=" + getDiagnosticLog() + ", disableHardwareAcceleration=" + getDisableHardwareAcceleration() + ")";
    }
}
