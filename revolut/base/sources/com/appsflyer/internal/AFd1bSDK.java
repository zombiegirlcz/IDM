package com.appsflyer.internal;

import android.os.Build;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1aSDK;
import grl.b4;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.json.JSONObject;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1bSDK implements AFd1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afInfoLog = 1875983563;
    private static int afRDLog = 1;
    private static boolean force = true;
    private static int i = 0;
    private static char[] v = {15401, 15417, 15402, 15397, 15407};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f26018w = true;

    @NotNull
    private final Lazy AFInAppEventParameterName;

    @NotNull
    private AFd1fSDK AFInAppEventType;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final Lazy AFLogger;

    @NotNull
    private final Lazy d;

    @NotNull
    private final Lazy e;
    private AFd1aSDK.AFa1zSDK registerClient;

    @NotNull
    private final String unregisterClient;

    @NotNull
    private final Lazy valueOf;

    @NotNull
    private final Lazy values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1iSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFd1iSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<AFd1iSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFd1iSDK invoke() {
            AFd1nSDK aFd1nSDKAfInfoLog = AFd1bSDK.valueOf(AFd1bSDK.this).afInfoLog();
            Intrinsics.checkNotNullExpressionValue(aFd1nSDKAfInfoLog, "");
            return new AFd1iSDK(aFd1nSDKAfInfoLog);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1wSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFg1wSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass10 extends u implements Function0<AFg1wSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFg1wSDK invoke() {
            AFg1wSDK aFg1wSDKV = AFd1bSDK.valueOf(AFd1bSDK.this).v();
            Intrinsics.checkNotNullExpressionValue(aFg1wSDKV, "");
            return aFg1wSDKV;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1pSDK;", "valueOf", "()Lcom/appsflyer/internal/AFd1pSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<AFd1pSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFd1pSDK invoke() {
            AFd1pSDK aFd1pSDKAFInAppEventType = AFd1bSDK.valueOf(AFd1bSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(aFd1pSDKAFInAppEventType, "");
            return aFd1pSDKAFInAppEventType;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "()Lcom/appsflyer/internal/AFd1sSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function0<AFd1sSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFd1sSDK invoke() {
            AFd1sSDK aFd1sSDKValueOf = AFd1bSDK.valueOf(AFd1bSDK.this).valueOf();
            Intrinsics.checkNotNullExpressionValue(aFd1sSDKValueOf, "");
            return aFd1sSDKValueOf;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1ySDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFg1ySDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0<AFg1ySDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFg1ySDK invoke() {
            AFg1ySDK aFg1ySDKE = AFd1bSDK.valueOf(AFd1bSDK.this).e();
            Intrinsics.checkNotNullExpressionValue(aFg1ySDKE, "");
            return aFg1ySDKE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFKeystoreWrapper", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService executorServiceAFKeystoreWrapper = AFd1bSDK.valueOf(AFd1bSDK.this).AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(executorServiceAFKeystoreWrapper, "");
            return executorServiceAFKeystoreWrapper;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1cSDK;", "values", "()Lcom/appsflyer/internal/AFd1cSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass7 extends u implements Function0<AFd1cSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1cSDK invoke() {
            return new AFd1cSDK(AFd1bSDK.this.AFKeystoreWrapper());
        }
    }

    public AFd1bSDK(@NotNull AFd1fSDK aFd1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFInAppEventType = aFd1fSDK;
        this.AFKeystoreWrapper = yhm.j.b(new AnonymousClass4());
        this.values = yhm.j.b(new AnonymousClass3());
        this.valueOf = yhm.j.b(new AnonymousClass2());
        this.AFInAppEventParameterName = yhm.j.b(new AnonymousClass10());
        this.e = yhm.j.b(new AnonymousClass5());
        this.unregisterClient = "6.14.2";
        this.AFLogger = yhm.j.b(new AnonymousClass1());
        this.d = yhm.j.b(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1bSDK aFd1bSDK, Throwable th10, String str) {
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        Intrinsics.checkNotNullParameter(th10, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1eSDK aFh1eSDKD = aFd1bSDK.d();
        if (aFh1eSDKD == null) {
            afRDLog = (i + 85) % 128;
            return;
        }
        if (aFd1bSDK.AFKeystoreWrapper(aFh1eSDKD)) {
            int i2 = afRDLog + 91;
            i = i2 % 128;
            int i3 = i2 % 2;
            aFd1bSDK.AFKeystoreWrapper().AFInAppEventParameterName(th10, str);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    private final ExecutorService AFLogger() {
        i = (afRDLog + 43) % 128;
        ExecutorService executorService = (ExecutorService) this.e.getValue();
        int i2 = i + 35;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return executorService;
    }

    private final void afInfoLog() {
        AFh1eSDK aFh1eSDKD;
        int i2 = i + 5;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            aFh1eSDKD = d();
            int i3 = 77 / 0;
            if (aFh1eSDKD == null) {
                return;
            }
        } else {
            aFh1eSDKD = d();
            if (aFh1eSDKD == null) {
                return;
            }
        }
        int i5 = afRDLog + 17;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            values(aFh1eSDKD);
            throw null;
        }
        if (!values(aFh1eSDKD)) {
            AFg1cSDK.v$default(AFLogger.INSTANCE, AFg1bSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            afRDLog = (i + 35) % 128;
            return;
        }
        String str = e().AFLogger;
        if (str != null) {
            String string = new JSONObject(valueOf(valueOf(aFh1eSDKD), AFKeystoreWrapper().AFInAppEventType())).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            valueOf(string, str);
        }
    }

    private final AFg1wSDK e() {
        i = (afRDLog + 29) % 128;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.AFInAppEventParameterName.getValue();
        i = (afRDLog + LDSFile.EF_SOD_TAG) % 128;
        return aFg1wSDK;
    }

    private final synchronized void i() {
        boolean zAFKeystoreWrapper;
        try {
            int i2 = i + 75;
            afRDLog = i2 % 128;
            if (i2 % 2 == 0) {
                d();
                throw null;
            }
            AFh1eSDK aFh1eSDKD = d();
            if (aFh1eSDKD != null) {
                if (aFh1eSDKD.values == -1) {
                    unregisterClient().AFInAppEventParameterName("af_send_exc_to_server_window");
                } else if (unregisterClient().AFInAppEventParameterName("af_send_exc_to_server_window", -1L) == -1) {
                    afRDLog = (i + 49) % 128;
                    AFInAppEventParameterName(aFh1eSDKD);
                }
                zAFKeystoreWrapper = AFKeystoreWrapper(aFh1eSDKD);
            } else {
                zAFKeystoreWrapper = false;
            }
            AFd1aSDK.AFa1zSDK aFa1zSDK = this.registerClient;
            if (aFa1zSDK != null) {
                i = (afRDLog + 83) % 128;
                aFa1zSDK.onConfigurationChanged(zAFKeystoreWrapper);
                i = (afRDLog + 99) % 128;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @NotNull
    private AFd1eSDK registerClient() {
        int i2 = afRDLog + 31;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return (AFd1eSDK) this.d.getValue();
        }
        throw null;
    }

    private final AFd1pSDK unregisterClient() {
        afRDLog = (i + 3) % 128;
        AFd1pSDK aFd1pSDK = (AFd1pSDK) this.valueOf.getValue();
        afRDLog = (i + 5) % 128;
        return aFd1pSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x0043, B:16:0x004a, B:18:0x0051, B:20:0x005a, B:22:0x005e, B:24:0x0070, B:26:0x0078, B:28:0x007e, B:30:0x0084, B:32:0x008a, B:34:0x0096, B:36:0x009c, B:38:0x00aa, B:40:0x00b8, B:42:0x00c4, B:44:0x00cf, B:46:0x00d5, B:48:0x00db, B:54:0x00ec, B:56:0x00f7, B:58:0x00fd, B:60:0x0103, B:62:0x010f, B:64:0x0115, B:66:0x011b, B:68:0x0127, B:70:0x012d, B:78:0x0144, B:85:0x01a7, B:87:0x01ab, B:89:0x01b1, B:90:0x01bd, B:80:0x0154, B:82:0x016e, B:83:0x0186, B:75:0x013c, B:52:0x00ea, B:55:0x00ee, B:84:0x0197, B:73:0x013a, B:50:0x00e8), top: B:98:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void v() {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1bSDK.v():void");
    }

    public static final /* synthetic */ AFd1fSDK valueOf(AFd1bSDK aFd1bSDK) {
        int i2 = (i + 7) % 128;
        afRDLog = i2;
        AFd1fSDK aFd1fSDK = aFd1bSDK.AFInAppEventType;
        i = (i2 + 63) % 128;
        return aFd1fSDK;
    }

    private final AFg1ySDK values() {
        int i2 = afRDLog + ISO781611.SMT_TAG;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) this.AFKeystoreWrapper.getValue();
        int i3 = i + 75;
        afRDLog = i3 % 128;
        if (i3 % 2 != 0) {
            return aFg1ySDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFInAppEventParameterName(@NotNull Throwable th10, @NotNull String str) {
        afRDLog = (i + 75) % 128;
        Intrinsics.checkNotNullParameter(th10, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFLogger().execute(new b0.d(this, 2, th10, str));
        int i2 = i + 101;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    public final AFd1hSDK AFKeystoreWrapper() {
        i = (afRDLog + 91) % 128;
        AFd1hSDK aFd1hSDK = (AFd1hSDK) this.AFLogger.getValue();
        afRDLog = (i + 79) % 128;
        return aFd1hSDK;
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            $11 = ($10 + 35) % 128;
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr2 = v;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $11 = ($10 + 105) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ 7803990084475239563L);
            }
            cArr2 = cArr3;
        }
        int i5 = (int) (7803990084475239563L ^ ((long) afInfoLog));
        if (f26018w) {
            int length2 = bArr.length;
            aFk1wSDK.values = length2;
            char[] cArr4 = new char[length2];
            aFk1wSDK.AFInAppEventParameterName = 0;
            while (true) {
                int i6 = aFk1wSDK.AFInAppEventParameterName;
                int i21 = aFk1wSDK.values;
                if (i6 >= i21) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i6] = (char) (cArr2[bArr[(i21 - 1) - i6] + i2] - i5);
                    aFk1wSDK.AFInAppEventParameterName = i6 + 1;
                }
            }
        } else if (force) {
            int length3 = cArr.length;
            aFk1wSDK.values = length3;
            char[] cArr5 = new char[length3];
            aFk1wSDK.AFInAppEventParameterName = 0;
            while (true) {
                int i22 = aFk1wSDK.AFInAppEventParameterName;
                int i32 = aFk1wSDK.values;
                if (i22 >= i32) {
                    String str3 = new String(cArr5);
                    $11 = ($10 + 13) % 128;
                    objArr[0] = str3;
                    return;
                }
                cArr5[i22] = (char) (cArr2[cArr[(i32 - 1) - i22] - i2] - i5);
                aFk1wSDK.AFInAppEventParameterName = i22 + 1;
            }
        } else {
            int length4 = iArr.length;
            aFk1wSDK.values = length4;
            char[] cArr6 = new char[length4];
            aFk1wSDK.AFInAppEventParameterName = 0;
            while (true) {
                int i33 = aFk1wSDK.AFInAppEventParameterName;
                int i43 = aFk1wSDK.values;
                if (i33 >= i43) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i33] = (char) (cArr2[iArr[(i43 - 1) - i33] - i2] - i5);
                    aFk1wSDK.AFInAppEventParameterName = i33 + 1;
                }
            }
        }
    }

    private final AFh1eSDK d() {
        AFh1aSDK aFh1aSDK;
        int i2 = afRDLog + 85;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            aFh1aSDK = values().AFInAppEventType.AFKeystoreWrapper;
            int i3 = 9 / 0;
            if (aFh1aSDK == null) {
                return null;
            }
        } else {
            aFh1aSDK = values().AFInAppEventType.AFKeystoreWrapper;
            if (aFh1aSDK == null) {
                return null;
            }
        }
        int i5 = (i + 57) % 128;
        afRDLog = i5;
        AFh1hSDK aFh1hSDK = aFh1aSDK.AFInAppEventParameterName;
        if (aFh1hSDK == null) {
            return null;
        }
        AFh1eSDK aFh1eSDK = aFh1hSDK.AFInAppEventParameterName;
        i = (i5 + 7) % 128;
        return aFh1eSDK;
    }

    private final AFd1sSDK valueOf() {
        AFd1sSDK aFd1sSDK;
        int i2 = i + 45;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            aFd1sSDK = (AFd1sSDK) this.values.getValue();
            int i3 = 31 / 0;
        } else {
            aFd1sSDK = (AFd1sSDK) this.values.getValue();
        }
        int i5 = i + 59;
        afRDLog = i5 % 128;
        if (i5 % 2 != 0) {
            return aFd1sSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1bSDK aFd1bSDK) {
        int i2 = i + 35;
        afRDLog = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.v();
        } else {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.v();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFKeystoreWrapper(AFd1aSDK.AFa1zSDK aFa1zSDK) {
        int i2 = afRDLog + ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            this.registerClient = aFa1zSDK;
            AFLogger().execute(new d(this, 0));
            throw null;
        }
        this.registerClient = aFa1zSDK;
        AFLogger().execute(new d(this, 0));
        i = (afRDLog + 23) % 128;
    }

    private final Map<String, String> valueOf(AFh1eSDK aFh1eSDK) throws UnsupportedEncodingException {
        Object[] objArr = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", valueOf().valueOf.AFKeystoreWrapper.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1cSDK().AFKeystoreWrapper());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair("sdk", this.unregisterClient);
        AFd1sSDK aFd1sSDKValueOf = valueOf();
        Map<String, String> mapK = r0.k(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1jSDK.AFInAppEventType(aFd1sSDKValueOf.valueOf, aFd1sSDKValueOf.values)), new Pair("exc_config", aFh1eSDK.AFInAppEventType()));
        int i2 = afRDLog + 65;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return mapK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFInAppEventParameterName() {
        i = (afRDLog + 23) % 128;
        AFLogger().execute(new d(this, 1));
        i = (afRDLog + 83) % 128;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFInAppEventType() {
        i = (afRDLog + 71) % 128;
        AFLogger().execute(new a0.a(this, 11));
        i = (afRDLog + 53) % 128;
    }

    private final void AFInAppEventParameterName(AFh1eSDK aFh1eSDK) {
        afRDLog = (i + 25) % 128;
        int i2 = aFh1eSDK.AFInAppEventType;
        long millis = TimeUnit.DAYS.toMillis(aFh1eSDK.values) + System.currentTimeMillis();
        AFd1pSDK aFd1pSDKUnregisterClient = unregisterClient();
        aFd1pSDKUnregisterClient.values("af_send_exc_to_server_window", millis);
        aFd1pSDKUnregisterClient.AFInAppEventParameterName("af_send_exc_min", i2);
        afRDLog = (i + 89) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1bSDK aFd1bSDK) {
        afRDLog = (i + 1) % 128;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        aFd1bSDK.i();
        int i2 = i + 55;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final boolean values(AFh1eSDK aFh1eSDK) {
        afRDLog = (i + 5) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAFInAppEventParameterName = unregisterClient().AFInAppEventParameterName("af_send_exc_to_server_window", -1L);
        if (aFh1eSDK.valueOf < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            i = (afRDLog + 55) % 128;
            return false;
        }
        if (jAFInAppEventParameterName != -1) {
            i = (afRDLog + 103) % 128;
            if (jAFInAppEventParameterName >= jCurrentTimeMillis) {
                int iValueOf = unregisterClient().valueOf("af_send_exc_min", -1);
                if (iValueOf != -1 && AFKeystoreWrapper().valueOf() >= iValueOf) {
                    return AFInAppEventType(aFh1eSDK);
                }
                int i2 = i + 19;
                afRDLog = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFd1bSDK aFd1bSDK) {
        i = (afRDLog + 87) % 128;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        aFd1bSDK.afInfoLog();
        int i2 = i + 89;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final boolean AFInAppEventType(AFh1eSDK aFh1eSDK) {
        new AFe1xSDK();
        String str = this.unregisterClient;
        String str2 = aFh1eSDK.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean zValueOf = AFe1xSDK.valueOf(str, str2);
        int i2 = afRDLog + 87;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return zValueOf;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r0 == (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        com.appsflyer.internal.AFd1bSDK.i = (com.appsflyer.internal.AFd1bSDK.afRDLog + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r0 >= r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return AFInAppEventType(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r12.valueOf < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r12.valueOf < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFKeystoreWrapper(com.appsflyer.internal.AFh1eSDK r12) {
        /*
            r11 = this;
            int r0 = com.appsflyer.internal.AFd1bSDK.i
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1bSDK.afRDLog = r1
            int r0 = r0 % 2
            java.lang.String r1 = "af_send_exc_to_server_window"
            r2 = 0
            r3 = -1
            if (r0 != 0) goto L2d
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1pSDK r0 = r11.unregisterClient()
            long r0 = r0.AFInAppEventParameterName(r1, r3)
            long r7 = r12.valueOf
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r9.toSeconds(r5)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r8 = 97
            int r8 = r8 / r2
            if (r7 >= 0) goto L46
            goto L45
        L2d:
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1pSDK r0 = r11.unregisterClient()
            long r0 = r0.AFInAppEventParameterName(r1, r3)
            long r7 = r12.valueOf
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r9.toSeconds(r5)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L46
        L45:
            return r2
        L46:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            int r3 = com.appsflyer.internal.AFd1bSDK.afRDLog
            int r3 = r3 + 7
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1bSDK.i = r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L57
            goto L5c
        L57:
            boolean r12 = r11.AFInAppEventType(r12)
            return r12
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1bSDK.AFKeystoreWrapper(com.appsflyer.internal.AFh1eSDK):boolean");
    }

    private static Map<String, Object> valueOf(Map<String, ? extends Object> map, List<AFd1jSDK> list) {
        int i2 = i + 19;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            Pair[] pairArr = new Pair[2];
            pairArr[1] = new Pair("deviceInfo", map);
            pairArr[1] = new Pair("excs", AFe1zSDK.AFInAppEventParameterName(list));
            return r0.k(pairArr);
        }
        return r0.k(new Pair("deviceInfo", map), new Pair("excs", AFe1zSDK.AFInAppEventParameterName(list)));
    }

    private final void valueOf(String str, String str2) {
        i = (afRDLog + 75) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        registerClient().AFInAppEventType(bytes, a0.d.x("Authorization", AFb1mSDK.AFInAppEventParameterName(str, str2)), b4.EXPIRED_OR_INVALID_KEY_VALUE);
        afRDLog = (i + 21) % 128;
    }
}
