package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFg1nSDK {

    @NotNull
    final String AFInAppEventParameterName;
    final int AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public AFg1nSDK(int i, int i2, int i3, int i5, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = i;
        this.values = i2;
        this.AFKeystoreWrapper = i3;
        this.AFInAppEventType = i5;
        this.AFInAppEventParameterName = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AFg1nSDK)) {
            return false;
        }
        AFg1nSDK aFg1nSDK = (AFg1nSDK) obj2;
        return this.valueOf == aFg1nSDK.valueOf && this.values == aFg1nSDK.values && this.AFKeystoreWrapper == aFg1nSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1nSDK.AFInAppEventType && Intrinsics.f(this.AFInAppEventParameterName, aFg1nSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + j6.a.b(this.AFInAppEventType, j6.a.b(this.AFKeystoreWrapper, j6.a.b(this.values, Integer.hashCode(this.valueOf) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("CmpTcfData(policyVersion=");
        sb6.append(this.valueOf);
        sb6.append(", gdprApplies=");
        sb6.append(this.values);
        sb6.append(", cmpSdkId=");
        sb6.append(this.AFKeystoreWrapper);
        sb6.append(", cmpSdkVersion=");
        sb6.append(this.AFInAppEventType);
        sb6.append(", tcString=");
        sb6.append(this.AFInAppEventParameterName);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}
