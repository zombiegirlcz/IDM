package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u0014\u0010\u0006\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFd1dSDK;", "Lcom/appsflyer/internal/AFd1gSDK;", "", "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1sSDK;", "valueOf", "Lcom/appsflyer/internal/AFe1sSDK;", "()Lcom/appsflyer/internal/AFe1sSDK;", "AFInAppEventParameterName", "AFKeystoreWrapper", "()Ljava/lang/String;", "", "p0", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "AFa1uSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFd1dSDK extends AFd1gSDK {

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final AFe1sSDK AFInAppEventParameterName;

    @NotNull
    public static String AFInAppEventType = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1dSDK(@NotNull byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = AFe1sSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    /* JADX INFO: renamed from: AFInAppEventType, reason: from getter */
    public final AFe1sSDK getAFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        String str = String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }
}
