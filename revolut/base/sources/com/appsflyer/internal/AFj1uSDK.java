package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFj1uSDK;", "", "", "AFInAppEventParameterName", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1jSDK;", "p0", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFh1jSDK;)Ljava/lang/String;", "", "AFInAppEventType", "(Ljava/lang/String;Z)Ljava/lang/String;", "values", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "p1", "valueOf", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFj1rSDK;", "Lcom/appsflyer/internal/AFj1rSDK;", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFj1rSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFj1uSDK {

    @NotNull
    public static final String AFInAppEventParameterName;

    @NotNull
    public static final String AFInAppEventType;

    @NotNull
    public static String AFLogger;

    @NotNull
    public static final String d;

    @NotNull
    public static final String e;

    @NotNull
    public static final String registerClient;

    @NotNull
    public static final String unregisterClient;

    @NotNull
    public static final String valueOf;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f26039w;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final AFj1rSDK valueOf;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final AFd1sSDK AFKeystoreWrapper;

    static {
        StringBuilder sb6 = new StringBuilder();
        String str = AFb1rSDK.valueOf;
        sb6.append(str);
        sb6.append("/androidevent?app_id=");
        String string = sb6.toString();
        f26039w = string;
        StringBuilder sb9 = new StringBuilder("https://%sattr.%s/api/v");
        sb9.append(string);
        AFInAppEventParameterName = sb9.toString();
        AFInAppEventType = "https://%sadrevenue.%s/api/v2/generic/v6.14.2/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.14.2/android?app_id=";
        StringBuilder sb10 = new StringBuilder("https://%sconversions.%s/api/v");
        sb10.append(string);
        e = sb10.toString();
        StringBuilder sb11 = new StringBuilder("https://%slaunches.%s/api/v");
        sb11.append(string);
        registerClient = sb11.toString();
        StringBuilder sb12 = new StringBuilder("https://%sinapps.%s/api/v");
        sb12.append(string);
        d = sb12.toString();
        unregisterClient = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        StringBuilder sb13 = new StringBuilder("https://%svalidate.%s/api/v");
        sb13.append(str);
        sb13.append("/androidevent?buildnumber=6.14.2&app_id=");
        AFLogger = sb13.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1uSDK(@NotNull AFd1sSDK aFd1sSDK) {
        this(aFd1sSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
    }

    public static String AFInAppEventParameterName() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    public static String AFInAppEventType(String str, boolean z) {
        StringBuilder sbS = p.a.s(str);
        sbS.append(!z ? "&buildnumber=6.14.2" : "");
        return sbS.toString();
    }

    public static Uri.Builder valueOf(Uri.Builder builder, String str, String str2) {
        if (str != null && str2 != null) {
            builder.appendQueryParameter("af_sig", AFb1mSDK.AFInAppEventParameterName(str2.concat(str), str));
            return builder;
        }
        String str3 = str == null ? "devKey" : "timestamp";
        AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
        return builder;
    }

    @NotNull
    public final String AFKeystoreWrapper(@NotNull AFh1jSDK p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 instanceof AFh1fSDK) {
            return this.valueOf.AFInAppEventParameterName("https://%ssdk-services.%s/validate-android-signature");
        }
        if (!(p0 instanceof AFh1iSDK)) {
            throw new UnsupportedOperationException();
        }
        StringBuilder sbS = p.a.s(this.valueOf.AFInAppEventParameterName(AFLogger));
        sbS.append(this.AFKeystoreWrapper.valueOf.AFKeystoreWrapper.getPackageName());
        return sbS.toString();
    }

    public final String values(String str) {
        StringBuilder sbS = p.a.s(str);
        String strAFLogger = this.AFKeystoreWrapper.AFLogger();
        String strConcat = strAFLogger != null ? "&channel=".concat(strAFLogger) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        sbS.append(strConcat);
        return sbS.toString();
    }

    private AFj1uSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFj1rSDK aFj1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        this.AFKeystoreWrapper = aFd1sSDK;
        this.valueOf = aFj1rSDK;
    }

    public /* synthetic */ AFj1uSDK(AFd1sSDK aFd1sSDK, AFj1rSDK aFj1rSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, (i & 2) != 0 ? new AFj1oSDK() : aFj1rSDK);
    }
}
