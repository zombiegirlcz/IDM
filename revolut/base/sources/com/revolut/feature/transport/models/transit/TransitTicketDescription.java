package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketDescription;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicketDescription> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92722c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketDescription(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketDescription[i];
        }
    }

    public TransitTicketDescription(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "default");
        this.f92720a = str;
        this.f92721b = str2;
        this.f92722c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketDescription)) {
            return false;
        }
        TransitTicketDescription transitTicketDescription = (TransitTicketDescription) obj2;
        return Intrinsics.f(this.f92720a, transitTicketDescription.f92720a) && Intrinsics.f(this.f92721b, transitTicketDescription.f92721b) && Intrinsics.f(this.f92722c, transitTicketDescription.f92722c);
    }

    public final int hashCode() {
        int iHashCode = this.f92720a.hashCode() * 31;
        String str = this.f92721b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92722c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92720a);
        dest.writeString(this.f92721b);
        dest.writeString(this.f92722c);
    }
}
