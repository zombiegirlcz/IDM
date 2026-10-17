package com.appsflyer.internal;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0011\u0010\n\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0011\u0010\b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1bSDK;", "", "", "unregisterClient", "Lkotlin/Lazy;", "valueOf", "values", "AFInAppEventParameterName", "AFInAppEventType", "()Ljava/lang/String;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "", "()Z", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "d", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFe1bSDK {
    private static AFe1kSDK e;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK values;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    private final Lazy valueOf;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK d;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final Lazy AFInAppEventParameterName;

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String AFInAppEventType = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> registerClient = v.k("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1bSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventParameterName", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1bSDK.this.values.valueOf.AFKeystoreWrapper.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1bSDK.values(packageName, AFe1bSDK.AFInAppEventParameterName(AFe1bSDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1bSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventParameterName", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strAFInAppEventType = AFb1rSDK.AFInAppEventType(AFe1bSDK.this.d, AFe1bSDK.this.values.AFLogger());
            if (strAFInAppEventType != null && !d0.W(strAFInAppEventType)) {
                String string = d0.F0(strAFInAppEventType).toString();
                List<String> listValues = Companion.values();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (listValues.contains(lowerCase)) {
                    String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFLogger.afWarnLog(str);
                    strAFInAppEventType = "";
                } else {
                    strAFInAppEventType = "-".concat(string);
                }
            }
            return d0.F0(strAFInAppEventType != null ? strAFInAppEventType : "").toString();
        }
    }

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AFe1cSDK.values().length];
            iArr[AFe1cSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1cSDK.API.ordinal()] = 2;
            iArr[AFe1cSDK.RC.ordinal()] = 3;
            valueOf = iArr;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1bSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\r@\u0007X\u0087\n¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u000b\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFe1bSDK$AFa1ySDK;", "", "", "", "registerClient", "Ljava/util/List;", "values", "()Ljava/util/List;", "AFKeystoreWrapper", "AFInAppEventParameterName", "Ljava/lang/String;", "AFInAppEventType", "valueOf", "Lcom/appsflyer/internal/AFe1kSDK;", "e", "Lcom/appsflyer/internal/AFe1kSDK;", "(Lcom/appsflyer/internal/AFe1kSDK;)V", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void AFInAppEventType(AFe1kSDK aFe1kSDK) {
            AFe1bSDK.e = aFe1kSDK;
        }

        @NotNull
        public static List<String> values() {
            return AFe1bSDK.registerClient;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFe1bSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.values = aFd1sSDK;
        this.d = aFd1pSDK;
        this.valueOf = yhm.j.b(new AnonymousClass5());
        this.AFInAppEventParameterName = yhm.j.b(new AnonymousClass2());
    }

    public static final /* synthetic */ String AFInAppEventParameterName(AFe1bSDK aFe1bSDK) {
        return (String) aFe1bSDK.valueOf.getValue();
    }

    public static final void valueOf(AFe1kSDK aFe1kSDK) {
        Companion.AFInAppEventType(aFe1kSDK);
    }

    public static final /* synthetic */ String values(String str, String str2) throws NoSuchAlgorithmException {
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str);
        sb9.append(str2);
        String string = sb9.toString();
        Intrinsics.checkNotNullParameter(string, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb6.append(strSubstring);
        sb6.append(CoreConstants.DASH_CHAR);
        return sb6.toString();
    }

    @NotNull
    public final String AFInAppEventType() {
        int i = AFa1tSDK.valueOf[(valueOf() ? AFe1cSDK.DEFAULT : AFe1cSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1kSDK aFe1kSDK = e;
        String str = aFe1kSDK != null ? aFe1kSDK.values : null;
        return str == null ? "" : str;
    }

    @NotNull
    public final String AFKeystoreWrapper() {
        int i = AFa1tSDK.valueOf[(valueOf() ? AFe1cSDK.DEFAULT : AFe1cSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.AFInAppEventParameterName.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1kSDK aFe1kSDK = e;
        String str = aFe1kSDK != null ? aFe1kSDK.AFInAppEventType : null;
        return str == null ? "" : str;
    }

    public static boolean valueOf() {
        return e == null;
    }
}
