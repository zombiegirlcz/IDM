package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFe1mSDK {
    public final long AFInAppEventParameterName;

    public AFe1mSDK(long j2) {
        this.AFInAppEventParameterName = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && getClass() == obj2.getClass() && this.AFInAppEventParameterName == ((AFe1mSDK) obj2).AFInAppEventParameterName;
    }

    public int hashCode() {
        long j2 = this.AFInAppEventParameterName;
        return (int) (j2 ^ (j2 >>> 32));
    }
}
