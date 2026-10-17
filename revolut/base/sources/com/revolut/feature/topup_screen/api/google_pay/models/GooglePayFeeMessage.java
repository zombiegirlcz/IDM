package com.revolut.feature.topup_screen.api.google_pay.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFeeMessage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayFeeMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GooglePayFeeMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90522b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayFeeMessage(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayFeeMessage[i];
        }
    }

    public GooglePayFeeMessage(String title, String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f90521a = title;
        this.f90522b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GooglePayFeeMessage)) {
            return false;
        }
        GooglePayFeeMessage googlePayFeeMessage = (GooglePayFeeMessage) obj2;
        return Intrinsics.f(this.f90521a, googlePayFeeMessage.f90521a) && Intrinsics.f(this.f90522b, googlePayFeeMessage.f90522b);
    }

    public final int hashCode() {
        return this.f90522b.hashCode() + (this.f90521a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90521a);
        dest.writeString(this.f90522b);
    }
}
