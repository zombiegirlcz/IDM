package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\tR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "", "", "p0", "", "values", "(Ljava/lang/String;)Z", "p1", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "valueOf", "Ljava/util/Map;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFc1pSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFc1pSDK;", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1pSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFc1oSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final AFc1pSDK AFInAppEventParameterName;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> AFKeystoreWrapper;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1oSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK$AFa1ySDK;", "", "Lcom/appsflyer/internal/AFa1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFa1pSDK;)Lcom/appsflyer/internal/AFc1oSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFc1pSDK;)Lcom/appsflyer/internal/AFc1oSDK;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static AFc1oSDK AFInAppEventParameterName(@NotNull AFa1pSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> mapAFInAppEventType = p0.AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
            return new AFc1oSDK(mapAFInAppEventType, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public static AFc1oSDK AFKeystoreWrapper(@NotNull AFc1pSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AFc1oSDK(new LinkedHashMap(), p0, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1pSDK aFc1pSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1pSDK);
    }

    @NotNull
    public static final AFc1oSDK AFInAppEventType(@NotNull AFc1pSDK aFc1pSDK) {
        return Companion.AFKeystoreWrapper(aFc1pSDK);
    }

    @NotNull
    public static final AFc1oSDK AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK) {
        return Companion.AFInAppEventParameterName(aFa1pSDK);
    }

    public final void values(@NotNull String p0, Object p17) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.AFKeystoreWrapper.put(p0, p17);
        AFc1pSDK aFc1pSDK = this.AFInAppEventParameterName;
        if (aFc1pSDK != null) {
            aFc1pSDK.AFInAppEventParameterName(this.AFKeystoreWrapper);
        }
    }

    private AFc1oSDK(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        this.AFKeystoreWrapper = map;
        this.AFInAppEventParameterName = aFc1pSDK;
    }

    public final boolean values(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.AFKeystoreWrapper.containsKey(p0);
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1pSDK aFc1pSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1pSDK);
    }
}
