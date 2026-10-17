package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import bxf.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketType;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "bxf/h", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicketType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f92733c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketType(parcel.readString(), parcel.readString(), h.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketType[i];
        }
    }

    public TransitTicketType(String key, String name, h category, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f92731a = key;
        this.f92732b = name;
        this.f92733c = category;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketType)) {
            return false;
        }
        TransitTicketType transitTicketType = (TransitTicketType) obj2;
        return Intrinsics.f(this.f92731a, transitTicketType.f92731a) && Intrinsics.f(this.f92732b, transitTicketType.f92732b) && this.f92733c == transitTicketType.f92733c && this.d == transitTicketType.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f92733c.hashCode() + p.a.c(this.f92731a.hashCode() * 31, 31, this.f92732b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92731a);
        dest.writeString(this.f92732b);
        dest.writeString(this.f92733c.name());
        dest.writeInt(this.d);
    }
}
