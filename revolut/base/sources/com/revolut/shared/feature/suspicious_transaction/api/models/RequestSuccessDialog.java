package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/RequestSuccessDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Button", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestSuccessDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RequestSuccessDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f104912c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/RequestSuccessDialog$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104914b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f104913a = title;
            this.f104914b = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f104913a, button.f104913a) && Intrinsics.f(this.f104914b, button.f104914b);
        }

        public final int hashCode() {
            return this.f104914b.hashCode() + (this.f104913a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104913a);
            dest.writeString(this.f104914b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RequestSuccessDialog(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestSuccessDialog[i];
        }
    }

    public RequestSuccessDialog(String title, String str, Button button) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104910a = title;
        this.f104911b = str;
        this.f104912c = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RequestSuccessDialog)) {
            return false;
        }
        RequestSuccessDialog requestSuccessDialog = (RequestSuccessDialog) obj2;
        return Intrinsics.f(this.f104910a, requestSuccessDialog.f104910a) && Intrinsics.f(this.f104911b, requestSuccessDialog.f104911b) && Intrinsics.f(this.f104912c, requestSuccessDialog.f104912c);
    }

    public final int hashCode() {
        int iHashCode = this.f104910a.hashCode() * 31;
        String str = this.f104911b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Button button = this.f104912c;
        return iHashCode2 + (button != null ? button.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104910a);
        dest.writeString(this.f104911b);
        Button button = this.f104912c;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
    }
}
