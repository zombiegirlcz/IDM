package com.appsflyer.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1zSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0007\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\n\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0010\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u0015J\u000f\u0010\u000b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u001d\u0010\b\u001a\u00020\u0017*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00038CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001c\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0013\u0010'\u001a\u00020\u0011X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b'\u0010$"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "Lcom/appsflyer/internal/AFf1xSDK;", "Lcom/appsflyer/internal/AFh1tSDK;", "", "afInfoLog", "()Z", "", "p0", "AFKeystoreWrapper", "(I)Z", "valueOf", "values", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;)Z", "AFInAppEventParameterName", "", "()J", "Lcom/appsflyer/internal/AFe1fSDK;", "()Lcom/appsflyer/internal/AFe1fSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1tSDK;Ljava/lang/String;)V", "e", "Lcom/appsflyer/internal/AFh1tSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "registerClient", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "d", "Lcom/appsflyer/internal/AFd1sSDK;", "AFLogger", "AFInAppEventType", "force", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFd1oSDK;", "Lcom/appsflyer/internal/AFd1oSDK;", "unregisterClient", "Lcom/appsflyer/internal/AFd1fSDK;", "<init>", "(Lcom/appsflyer/internal/AFd1fSDK;)V", "AFa1uSDK", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFf1pSDK extends AFf1xSDK<AFh1tSDK> {

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final AFd1oSDK registerClient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFh1tSDK valueOf;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final Lazy values;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK AFInAppEventParameterName;

    @NotNull
    private final Lazy unregisterClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1pSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function0<Long> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Long lN;
            String strAFInAppEventType = AFf1pSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((strAFInAppEventType == null || (lN = z.n(strAFInAppEventType)) == null) ? 1000L : lN.longValue());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1pSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1zSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1ySDK(AFa1zSDK aFa1zSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1zSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLogger.afWarnLog("Could not fetch GAID using CloudDevSdk: " + reason);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLogger.afRDLog("CloudDevCallback received onSuccess");
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00060\nj\u0002`\u000bHÇ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000bHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0004R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\u00060\nj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "component4", "()Ljava/lang/StringBuilder;", "advertisingId", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "gaidError", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class AFa1zSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1zSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1zSDK copy$default(AFa1zSDK aFa1zSDK, String str, Boolean bool, boolean z, StringBuilder sb6, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = aFa1zSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1zSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1zSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb6 = aFa1zSDK.gaidError;
            }
            return aFa1zSDK.copy(str, bool, z, sb6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1zSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1zSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) other;
            return Intrinsics.f(this.advertisingId, aFa1zSDK.advertisingId) && Intrinsics.f(this.isLimitAdTrackingEnabled, aFa1zSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1zSDK.advertisingIdWithGps && Intrinsics.f(this.gaidError, aFa1zSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            ?? r110 = z;
            if (z) {
                r110 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r110) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "AFa1zSDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public AFa1zSDK(String str, Boolean bool, boolean z, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1zSDK(String str, Boolean bool, boolean z, StringBuilder sb6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(@NotNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.FETCH_ADVERTISING_ID, new AFf1ySDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        AFd1nSDK aFd1nSDKAfInfoLog = aFd1fSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFd1nSDKAfInfoLog, "");
        this.AFInAppEventParameterName = aFd1nSDKAfInfoLog;
        AFd1sSDK aFd1sSDKValueOf = aFd1fSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1sSDKValueOf, "");
        this.AFKeystoreWrapper = aFd1sSDKValueOf;
        AFd1oSDK level = aFd1fSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.registerClient = level;
        this.valueOf = new AFh1tSDK(null, null, null, null, null, null, null, null, 255, null);
        this.unregisterClient = yhm.j.b(new AnonymousClass3());
        this.values = yhm.j.b(new AnonymousClass4());
    }

    private static boolean AFLogger() {
        String string;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th10) {
            if (th10 instanceof ClassNotFoundException) {
                string = "CloudDevSdk not found";
            } else {
                StringBuilder sb6 = new StringBuilder("Unexpected exception while checking if running in cloud environment: ");
                sb6.append(th10.getMessage());
                string = sb6.toString();
            }
            AFLogger.afErrorLog(string, th10, true);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[LOOP:0: B:3:0x0003->B:15:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[EDGE_INSN: B:19:0x0030->B:16:0x0030 BREAK  A[LOOP:0: B:3:0x0003->B:15:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean afInfoLog() {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = r1
        L3:
            if (r0 <= 0) goto L30
            boolean r2 = r4.e()
            r3 = 1
            if (r2 == 0) goto L19
            boolean r2 = r4.values(r0)
            if (r2 == 0) goto L19
            java.lang.String r2 = "GAID fetched using Samsung Cloud dev SDK"
            com.appsflyer.AFLogger.afRDLog(r2)
        L17:
            r2 = r3
            goto L2b
        L19:
            boolean r2 = r4.AFKeystoreWrapper(r0)
            if (r2 == 0) goto L25
            java.lang.String r2 = "GAID fetched using GMS"
            com.appsflyer.AFLogger.afRDLog(r2)
            goto L17
        L25:
            java.lang.String r2 = "Failed to fetch GAID"
            com.appsflyer.AFLogger.afRDLog(r2)
            r2 = r1
        L2b:
            if (r2 != 0) goto L30
            int r0 = r0 + (-1)
            goto L3
        L30:
            com.appsflyer.internal.AFd1oSDK r0 = r4.registerClient
            com.appsflyer.internal.AFh1tSDK r1 = r4.valueOf
            r0.AFLogger = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.afInfoLog():boolean");
    }

    private final boolean e() {
        return ((Boolean) this.values.getValue()).booleanValue();
    }

    private static int valueOf(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th10) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th10);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NotNull
    public final AFe1fSDK AFInAppEventParameterName() {
        if (this.registerClient.AFKeystoreWrapper()) {
            AFLogger.afRDLog("QUEUE: Advertising ID collection is disabled. Skipping fetching... ");
            return AFe1fSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(afInfoLog());
        Boolean bool = Boolean.FALSE;
        AFe1fSDK aFe1fSDK = v.k(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1fSDK.SUCCESS : AFe1fSDK.FAILURE;
        AFd1oSDK aFd1oSDK = this.registerClient;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        StringBuilder sb6 = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb6.append(aFe1mSDK.AFInAppEventParameterName);
        sb6.append("ms");
        AFLogger.afRDLog(sb6.toString());
        aFd1oSDK.values(aFe1mSDK);
        return aFe1fSDK;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFKeystoreWrapper(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Trying to fetch GAID..."
            com.appsflyer.AFLogger.afInfoLog(r0)
            com.appsflyer.internal.AFf1pSDK$AFa1zSDK r1 = new com.appsflyer.internal.AFf1pSDK$AFa1zSDK
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.appsflyer.internal.AFd1nSDK r0 = r8.AFInAppEventParameterName
            android.content.Context r0 = r0.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.h(r0)
            int r0 = valueOf(r0)
            com.appsflyer.internal.AFd1nSDK r2 = r8.AFInAppEventParameterName
            android.content.Context r2 = r2.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.h(r2)
            boolean r2 = r8.AFInAppEventParameterName(r2, r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L7c
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "enableGpsFallback"
            boolean r2 = r2.getBoolean(r5, r4)
            if (r2 == 0) goto L46
            com.appsflyer.internal.AFd1nSDK r2 = r8.AFInAppEventParameterName
            android.content.Context r2 = r2.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.h(r2)
            boolean r2 = r8.AFKeystoreWrapper(r2, r1)
            if (r2 == 0) goto L46
            r2 = r4
            goto L47
        L46:
            r2 = r3
        L47:
            java.lang.StringBuilder r5 = r1.getGaidError()
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L74
            boolean r6 = kotlin.text.d0.W(r5)
            if (r6 == 0) goto L58
            goto L74
        L58:
            java.lang.CharSequence r5 = kotlin.text.d0.F0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = ": "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L74:
            com.appsflyer.internal.AFh1tSDK r0 = r8.valueOf
            AFKeystoreWrapper(r0, r5)
            if (r2 != 0) goto L7c
            return r3
        L7c:
            com.appsflyer.internal.AFh1tSDK r0 = r8.valueOf
            java.lang.String r2 = r1.getAdvertisingId()
            r0.AFInAppEventType = r2
            java.lang.Boolean r2 = r1.isLimitAdTrackingEnabled()
            r0.unregisterClient = r2
            java.lang.Boolean r2 = r1.isLimitAdTrackingEnabled()
            if (r2 == 0) goto L9a
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L9b
        L9a:
            r2 = 0
        L9b:
            r0.AFInAppEventParameterName = r2
            boolean r1 = r1.getAdvertisingIdWithGps()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.valueOf = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.AFKeystoreWrapper = r1
            r1 = 2
            if (r9 == r1) goto Laf
            r3 = r4
        Laf:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r0.AFLogger = r9
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.AFKeystoreWrapper(int):boolean");
    }

    private final boolean values(int p0) {
        return valueOf(p0);
    }

    private final boolean valueOf(int p0) {
        String string;
        AFLogger.afInfoLog("Trying to fetch GAID using Samsung Cloud Dev...");
        if (AFLogger()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            Intrinsics.h(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1zSDK aFa1zSDK = new AFa1zSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.AFInAppEventParameterName.AFKeystoreWrapper;
                    Intrinsics.h(context2);
                    cloudDevSdk2.request(context2, zhm.u.c("gaid"), new AFa1ySDK(aFa1zSDK, countDownLatch));
                    countDownLatch.await(((Number) this.unregisterClient.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th10) {
                    try {
                        if (th10 instanceof InterruptedException) {
                            string = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th10 instanceof ClassNotFoundException) {
                            string = "CloudDevSdk not found";
                        } else {
                            StringBuilder sb6 = new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ");
                            sb6.append(th10.getMessage());
                            string = sb6.toString();
                        }
                        AFLogger.afErrorLog(string, th10, true);
                        StringBuilder gaidError = aFa1zSDK.getGaidError();
                        gaidError.append(th10.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1zSDK.getGaidError().length() > 0) {
                        }
                    } finally {
                    }
                }
                if (aFa1zSDK.getGaidError().length() > 0) {
                    AFKeystoreWrapper(this.valueOf, aFa1zSDK.getGaidError().toString());
                }
                String advertisingId = aFa1zSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1tSDK aFh1tSDK = this.valueOf;
                aFh1tSDK.AFInAppEventType = aFa1zSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1tSDK.unregisterClient = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1tSDK.AFInAppEventParameterName = bool2;
                aFh1tSDK.valueOf = bool;
                aFh1tSDK.AFKeystoreWrapper = bool2;
                aFh1tSDK.AFLogger = Boolean.valueOf(p0 != 2);
                return true;
            }
        }
        AFLogger.afInfoLog("Not running in Samsung Cloud Environment. Try using GMS...");
        return false;
    }

    private final boolean AFInAppEventParameterName(Context p0, AFa1zSDK p17) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p17.setAdvertisingId(advertisingIdInfo.getId());
                p17.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p17.setAdvertisingIdWithGps(true);
                String advertisingId = p17.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p17.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f186387a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p17.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th10) {
            StringBuilder sb6 = new StringBuilder("Google Play Services is missing ");
            sb6.append(th10.getMessage());
            AFLogger.afErrorLog(sb6.toString(), th10);
            StringBuilder gaidError = p17.getGaidError();
            gaidError.append(th10.getClass().getSimpleName());
            gaidError.append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            return false;
        }
    }

    private final boolean AFKeystoreWrapper(Context p0, AFa1zSDK p17) throws IllegalStateException {
        try {
            AFb1zSDK.AFa1uSDK aFa1uSDKValueOf = AFb1zSDK.valueOf(p0);
            p17.setAdvertisingId(aFa1uSDKValueOf.valueOf);
            p17.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1uSDKValueOf.AFInAppEventParameterName()));
            String advertisingId = p17.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p17.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f186387a != null) {
                return true;
            }
            p17.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th10) {
            StringBuilder sb6 = new StringBuilder("Failed to fetch GAID: ");
            sb6.append(th10.getMessage());
            AFLogger.afErrorLog(sb6.toString(), th10, true, false, false);
            StringBuilder gaidError = p17.getGaidError();
            gaidError.append(th10.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th10.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th10.toString();
            }
            AFLogger.afInfoLog(localizedMessage);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return ((Number) this.unregisterClient.getValue()).longValue();
    }

    private static void AFKeystoreWrapper(AFh1tSDK aFh1tSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1tSDK.values;
        if (str2 != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append(" | ");
            sb6.append(str);
            String string = sb6.toString();
            if (string != null) {
                str = string;
            }
        }
        aFh1tSDK.values = str;
    }
}
