package com.revolut.feature.onboarding.api.onboarding.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/models/EmailData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EmailData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78194c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailData[i];
        }
    }

    public EmailData(String email, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f78192a = email;
        this.f78193b = z;
        this.f78194c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailData)) {
            return false;
        }
        EmailData emailData = (EmailData) obj2;
        return Intrinsics.f(this.f78192a, emailData.f78192a) && this.f78193b == emailData.f78193b && this.f78194c == emailData.f78194c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78194c) + j6.a.c(this.f78192a.hashCode() * 31, 31, this.f78193b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78192a);
        dest.writeInt(this.f78193b ? 1 : 0);
        dest.writeInt(this.f78194c ? 1 : 0);
    }
}
