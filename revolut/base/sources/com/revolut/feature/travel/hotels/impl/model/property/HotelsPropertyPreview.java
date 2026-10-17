package com.revolut.feature.travel.hotels.impl.model.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyPreview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyPreview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyPreview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93677b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyPreview(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyPreview[i];
        }
    }

    public HotelsPropertyPreview(String id10, String imageUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f93676a = id10;
        this.f93677b = imageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyPreview)) {
            return false;
        }
        HotelsPropertyPreview hotelsPropertyPreview = (HotelsPropertyPreview) obj2;
        return Intrinsics.f(this.f93676a, hotelsPropertyPreview.f93676a) && Intrinsics.f(this.f93677b, hotelsPropertyPreview.f93677b);
    }

    public final int hashCode() {
        return this.f93677b.hashCode() + (this.f93676a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93676a);
        dest.writeString(this.f93677b);
    }
}
