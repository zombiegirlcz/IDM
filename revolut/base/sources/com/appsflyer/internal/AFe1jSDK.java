package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1jSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFe1mSDK AFInAppEventParameterName;

    @NonNull
    private final Body AFInAppEventType;
    final int AFKeystoreWrapper;

    @NonNull
    final Map<String, List<String>> valueOf;
    final boolean values;

    public AFe1jSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFe1mSDK aFe1mSDK) {
        this.AFInAppEventType = body;
        this.AFKeystoreWrapper = i;
        this.values = z;
        this.valueOf = new HashMap(map);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    public final String AFInAppEventParameterName(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it8 = headerField.iterator();
        StringBuilder sb6 = new StringBuilder(it8.next());
        while (it8.hasNext()) {
            sb6.append(", ");
            sb6.append(it8.next());
        }
        return sb6.toString();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        AFe1jSDK aFe1jSDK = (AFe1jSDK) obj2;
        if (this.AFKeystoreWrapper == aFe1jSDK.AFKeystoreWrapper && this.values == aFe1jSDK.values && this.AFInAppEventType.equals(aFe1jSDK.AFInAppEventType) && this.valueOf.equals(aFe1jSDK.valueOf)) {
            return this.AFInAppEventParameterName.equals(aFe1jSDK.AFInAppEventParameterName);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.valueOf.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.valueOf.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + ((this.valueOf.hashCode() + (((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}
