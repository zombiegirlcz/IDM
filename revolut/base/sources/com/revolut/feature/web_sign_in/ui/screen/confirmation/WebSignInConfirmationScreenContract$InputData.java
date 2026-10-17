package com.revolut.feature.web_sign_in.ui.screen.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/web_sign_in/ui/screen/confirmation/WebSignInConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebSignInConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WebSignInConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f96345c;
    public final String d;
    public final long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WebSignInConfirmationScreenContract$InputData(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebSignInConfirmationScreenContract$InputData[i];
        }
    }

    public WebSignInConfirmationScreenContract$InputData(long j2, Long l2, String str, String ip2, String device) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        Intrinsics.checkNotNullParameter(device, "device");
        this.f96343a = str;
        this.f96344b = ip2;
        this.f96345c = l2;
        this.d = device;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WebSignInConfirmationScreenContract$InputData)) {
            return false;
        }
        WebSignInConfirmationScreenContract$InputData webSignInConfirmationScreenContract$InputData = (WebSignInConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f96343a, webSignInConfirmationScreenContract$InputData.f96343a) && Intrinsics.f(this.f96344b, webSignInConfirmationScreenContract$InputData.f96344b) && Intrinsics.f(this.f96345c, webSignInConfirmationScreenContract$InputData.f96345c) && Intrinsics.f(this.d, webSignInConfirmationScreenContract$InputData.d) && this.e == webSignInConfirmationScreenContract$InputData.e;
    }

    public final int hashCode() {
        String str = this.f96343a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f96344b);
        Long l2 = this.f96345c;
        return Long.hashCode(this.e) + p.a.c((iC + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96343a);
        dest.writeString(this.f96344b);
        Long l2 = this.f96345c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.d);
        dest.writeLong(this.e);
    }
}
