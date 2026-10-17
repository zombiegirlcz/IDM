package com.appsflyer.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1xSDK {

    public static final class AFa1ySDK {
        public final String AFInAppEventType;
        public final float valueOf;

        public AFa1ySDK(float f, String str) {
            this.valueOf = f;
            this.AFInAppEventType = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj2;
            return Float.valueOf(this.valueOf).equals(Float.valueOf(aFa1ySDK.valueOf)) && Intrinsics.f(this.AFInAppEventType, aFa1ySDK.AFInAppEventType);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.valueOf) * 31;
            String str = this.AFInAppEventType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb6 = new StringBuilder("BatteryData(level=");
            sb6.append(this.valueOf);
            sb6.append(", charging=");
            sb6.append(this.AFInAppEventType);
            sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb6.toString();
        }
    }

    @NotNull
    AFa1ySDK values(@NotNull Context context);
}
