package com.appsflyer.internal;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0006X\u0086\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "values", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "AFKeystoreWrapper", "I", "AFInAppEventParameterName", "Ljava/lang/String;", "AFInAppEventType", "valueOf", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFd1jSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    final String AFInAppEventParameterName;

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    public final String valueOf;
    int AFKeystoreWrapper;

    @NotNull
    public final String values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1jSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK$AFa1zSDK;", "", "", "p0", "", "", "p1", "", "values", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1jSDK;", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1jSDK;", "AFInAppEventType", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static String AFInAppEventType(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = d0.F0(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }

        public static AFd1jSDK values(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            List<String> listN0 = d0.n0(p0, new String[]{"\n"}, 0, 6);
            if (listN0.size() == 4) {
                String strAFInAppEventType = null;
                String strAFInAppEventType2 = null;
                String strAFInAppEventType3 = null;
                Integer numValueOf = null;
                for (String str : listN0) {
                    if (a0.H(str, "label=", false)) {
                        strAFInAppEventType = AFInAppEventType(str, "label=");
                    } else if (a0.H(str, "hashName=", false)) {
                        strAFInAppEventType2 = AFInAppEventType(str, "hashName=");
                    } else if (!a0.H(str, "stackTrace=", false)) {
                        if (!a0.H(str, "c=", false)) {
                            break;
                        }
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        numValueOf = Integer.valueOf(Integer.parseInt(d0.F0(strSubstring).toString()));
                    } else {
                        strAFInAppEventType3 = AFInAppEventType(str, "stackTrace=");
                    }
                }
                if (!values(numValueOf, strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3)) {
                    Intrinsics.h(strAFInAppEventType);
                    Intrinsics.h(strAFInAppEventType2);
                    Intrinsics.h(strAFInAppEventType3);
                    Intrinsics.h(numValueOf);
                    return new AFd1jSDK(strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3, numValueOf.intValue());
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean values(Integer p0, String... p17) {
            boolean z = p0 == null;
            int length = p17.length;
            for (int i = 0; i < 3; i++) {
                String str = p17[i];
                z = z || str == null || str.length() == 0;
            }
            return z;
        }
    }

    public AFd1jSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.AFInAppEventParameterName = str2;
        this.values = str3;
        this.AFKeystoreWrapper = i;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFd1jSDK)) {
            return false;
        }
        AFd1jSDK aFd1jSDK = (AFd1jSDK) p0;
        return Intrinsics.f(this.valueOf, aFd1jSDK.valueOf) && Intrinsics.f(this.AFInAppEventParameterName, aFd1jSDK.AFInAppEventParameterName) && Intrinsics.f(this.values, aFd1jSDK.values) && this.AFKeystoreWrapper == aFd1jSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFKeystoreWrapper) + ((this.values.hashCode() + ((this.AFInAppEventParameterName.hashCode() + (this.valueOf.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AFd1jSDK(valueOf=");
        sb6.append(this.valueOf);
        sb6.append(", AFInAppEventParameterName=");
        sb6.append(this.AFInAppEventParameterName);
        sb6.append(", values=");
        sb6.append(this.values);
        sb6.append(", AFKeystoreWrapper=");
        sb6.append(this.AFKeystoreWrapper);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    @NotNull
    public final JSONObject values() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.valueOf);
        jSONObject.put("hash_name", this.AFInAppEventParameterName);
        jSONObject.put("st", this.values);
        jSONObject.put("c", String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }

    public /* synthetic */ AFd1jSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }
}
