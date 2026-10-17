package com.hcaptcha.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes17.dex */
public abstract class HCaptchaStateListener implements Parcelable {
    public abstract void a(HCaptchaException hCaptchaException);

    public abstract void b();

    public abstract void c(String str);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
