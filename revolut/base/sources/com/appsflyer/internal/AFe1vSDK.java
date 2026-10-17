package com.appsflyer.internal;

import grl.b4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u000b\u001a\u00020\tX\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\u000fR\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "Lcom/appsflyer/internal/AFd1gSDK;", "", "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1sSDK;", "registerClient", "Lcom/appsflyer/internal/AFe1sSDK;", "()Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "AFInAppEventParameterName", "", "valueOf", "Z", "()Z", "values", "AFKeystoreWrapper", "()Ljava/lang/String;", "p0", "", "p1", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;[BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFe1vSDK extends AFd1gSDK {

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    public AFd1sSDK AFInAppEventParameterName;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFe1sSDK AFInAppEventType;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    private final boolean values;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1vSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from getter */
    public final boolean getValues() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    /* JADX INFO: renamed from: AFInAppEventType, reason: from getter */
    public final AFe1sSDK getAFInAppEventType() {
        return this.AFInAppEventType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        AFj1uSDK aFj1uSDK = new AFj1uSDK(this.AFInAppEventParameterName, null, 2, 0 == true ? 1 : 0);
        StringBuilder sbS = p.a.s(aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.unregisterClient));
        sbS.append(aFj1uSDK.AFKeystoreWrapper.valueOf.AFKeystoreWrapper.getPackageName());
        return sbS.toString();
    }

    public /* synthetic */ AFe1vSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? b4.EXPIRED_OR_INVALID_KEY_VALUE : i);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1vSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = aFd1sSDK;
        this.AFInAppEventType = AFe1sSDK.OCTET_STREAM;
    }
}
