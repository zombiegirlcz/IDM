package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertySpace;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ufi/f", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertySpace implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertySpace> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f98048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f98050c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertySpace(f.valueOf(parcel.readString()), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertySpace[i];
        }
    }

    public HotelsPropertySpace(f type, String description, double d) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f98048a = type;
        this.f98049b = description;
        this.f98050c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertySpace)) {
            return false;
        }
        HotelsPropertySpace hotelsPropertySpace = (HotelsPropertySpace) obj2;
        return this.f98048a == hotelsPropertySpace.f98048a && Intrinsics.f(this.f98049b, hotelsPropertySpace.f98049b) && Double.compare(this.f98050c, hotelsPropertySpace.f98050c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98050c) + p.a.c(this.f98048a.hashCode() * 31, 31, this.f98049b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98048a.name());
        dest.writeString(this.f98049b);
        dest.writeDouble(this.f98050c);
    }
}
