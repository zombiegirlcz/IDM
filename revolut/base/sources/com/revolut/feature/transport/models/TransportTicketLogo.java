package com.revolut.feature.transport.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zwf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/models/TransportTicketLogo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "zwf/b", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportTicketLogo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransportTicketLogo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92597b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportTicketLogo(b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportTicketLogo[i];
        }
    }

    public TransportTicketLogo(b type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92596a = type;
        this.f92597b = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportTicketLogo)) {
            return false;
        }
        TransportTicketLogo transportTicketLogo = (TransportTicketLogo) obj2;
        return this.f92596a == transportTicketLogo.f92596a && Intrinsics.f(this.f92597b, transportTicketLogo.f92597b);
    }

    public final int hashCode() {
        return this.f92597b.hashCode() + (this.f92596a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92596a.name());
        dest.writeString(this.f92597b);
    }
}
