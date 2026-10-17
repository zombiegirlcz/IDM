package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFi1gSDK;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK extends AFi1oSDK {
    private String afInfoLog;

    @NotNull
    private final AFi1fSDK d;

    @NotNull
    private final Runnable registerClient;

    @NotNull
    private final ExecutorService unregisterClient;

    @NotNull
    private final AFd1sSDK values;

    /* JADX INFO: loaded from: classes16.dex */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AFi1fSDK.values().length];
            iArr[AFi1fSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1fSDK.INSTAGRAM.ordinal()] = 2;
            iArr[AFi1fSDK.FACEBOOK_LITE.ordinal()] = 3;
            valueOf = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1iSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull ExecutorService executorService, @NotNull AFi1fSDK aFi1fSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFi1gSDK.AFa1zSDK.AFKeystoreWrapper[aFi1fSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super("app", str, aFd1sSDK, runnable);
        this.values = aFd1sSDK;
        this.unregisterClient = executorService;
        this.d = aFi1fSDK;
        this.registerClient = runnable2;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[PHI: r0
      0x0071: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v15 java.lang.String), (r0v22 java.lang.String) binds: [B:14:0x002e, B:23:0x004e, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFInAppEventType(android.content.Context r6) {
        /*
            r5 = this;
            boolean r0 = r5.AFKeystoreWrapper()
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r6 = "[MetaReferrer]: Referrer collection disallowed by counter."
            com.appsflyer.AFLogger.afDebugLog(r6)
            return r1
        Ld:
            com.appsflyer.internal.AFd1sSDK r0 = r5.values
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.AFInAppEventType(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L1f
            java.lang.String r0 = kotlin.text.d0.e0(r0, r2)
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == 0) goto L28
            int r4 = r0.length()
            if (r4 != 0) goto L2e
        L28:
            java.lang.String r0 = "[MetaReferrer]: Facebook app id Manifest metadata is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r3
        L2e:
            if (r0 != 0) goto L71
            com.appsflyer.internal.AFd1sSDK r0 = r5.values
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.AFKeystoreWrapper(r4)
            if (r0 == 0) goto L3f
            java.lang.String r0 = kotlin.text.d0.e0(r0, r2)
            goto L40
        L3f:
            r0 = r3
        L40:
            if (r0 == 0) goto L48
            int r4 = r0.length()
            if (r4 != 0) goto L4e
        L48:
            java.lang.String r0 = "[MetaReferrer]: Facebook app id string resource is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r3
        L4e:
            if (r0 != 0) goto L71
            com.appsflyer.internal.AFd1sSDK r0 = r5.values
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.AFInAppEventType(r4)
            if (r0 == 0) goto L5f
            java.lang.String r0 = kotlin.text.d0.e0(r0, r2)
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r0 == 0) goto L68
            int r2 = r0.length()
            if (r2 != 0) goto L6e
        L68:
            java.lang.String r0 = "[MetaReferrer]: AF Facebook app id Manifest metadata is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r3
        L6e:
            if (r0 != 0) goto L71
            goto L72
        L71:
            r3 = r0
        L72:
            r5.afInfoLog = r3
            if (r3 != 0) goto L7c
            java.lang.String r6 = "[MetaReferrer]: Referrer collection disallowed by missing Facebook app id."
            com.appsflyer.AFLogger.afDebugLog(r6)
            return r1
        L7c:
            boolean r6 = r5.valueOf(r6)
            if (r6 != 0) goto L88
            java.lang.String r6 = "[MetaReferrer]: Referrer collection disallowed by missing content providers."
            com.appsflyer.AFLogger.afDebugLog(r6)
            return r1
        L88:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.AFInAppEventType(android.content.Context):boolean");
    }

    private static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean AFLogger(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean valueOf(Context context) {
        int i = AFa1vSDK.valueOf[this.d.ordinal()];
        if (i == 1) {
            return AFKeystoreWrapper(context);
        }
        if (i == 2) {
            return AFInAppEventParameterName(context);
        }
        if (i == 3) {
            return AFLogger(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFInAppEventType(context)) {
            this.unregisterClient.execute(new g(this, context, 2));
        } else {
            this.registerClient.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5 A[PHI: r13
      0x01b5: PHI (r13v2 android.content.ContentProviderClient) = 
      (r13v1 android.content.ContentProviderClient)
      (r13v3 android.content.ContentProviderClient)
      (r13v3 android.content.ContentProviderClient)
     binds: [B:79:0x01d0, B:69:0x01b3, B:74:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AFInAppEventParameterName(com.appsflyer.internal.AFi1iSDK r19, android.content.Context r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.AFInAppEventParameterName(com.appsflyer.internal.AFi1iSDK, android.content.Context):void");
    }
}
