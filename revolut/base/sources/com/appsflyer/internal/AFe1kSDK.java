package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFe1kSDK {

    @NotNull
    final String AFInAppEventType;

    @NotNull
    final String values;

    public AFe1kSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventType = str;
        this.values = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj2;
        return Intrinsics.f(this.AFInAppEventType, aFe1kSDK.AFInAppEventType) && Intrinsics.f(this.values, aFe1kSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.AFInAppEventType.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("HostConfig(prefix=");
        sb6.append(this.AFInAppEventType);
        sb6.append(", host=");
        sb6.append(this.values);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}
