package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes16.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + 104 + String.valueOf(i).length() + 194);
        sb6.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb6.append(i2);
        sb6.append(" but found ");
        sb6.append(i);
        sb6.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i, sb6.toString());
    }
}
