package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyCheckInDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyCheckInDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyCheckInDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f98013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f98014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsPropertyCheckInInfo f98015c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyCheckInDetails(Window.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), HotelsPropertyCheckInInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyCheckInDetails[i];
        }
    }

    public HotelsPropertyCheckInDetails(Window window, Integer num, HotelsPropertyCheckInInfo information) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(information, "information");
        this.f98013a = window;
        this.f98014b = num;
        this.f98015c = information;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyCheckInDetails)) {
            return false;
        }
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails = (HotelsPropertyCheckInDetails) obj2;
        return Intrinsics.f(this.f98013a, hotelsPropertyCheckInDetails.f98013a) && Intrinsics.f(this.f98014b, hotelsPropertyCheckInDetails.f98014b) && Intrinsics.f(this.f98015c, hotelsPropertyCheckInDetails.f98015c);
    }

    public final int hashCode() {
        int iHashCode = this.f98013a.hashCode() * 31;
        Integer num = this.f98014b;
        return this.f98015c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98013a.writeToParcel(dest, i);
        Integer num = this.f98014b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        this.f98015c.writeToParcel(dest, i);
    }
}
