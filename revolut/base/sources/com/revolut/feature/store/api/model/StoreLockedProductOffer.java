package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreLockedProductOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreLockedProductOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreLockedProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f88532c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreLockedProductOffer(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreLockedProductOffer[i];
        }
    }

    public StoreLockedProductOffer(String id10, String str, List eligiblePlans, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eligiblePlans, "eligiblePlans");
        this.f88530a = id10;
        this.f88531b = str;
        this.f88532c = eligiblePlans;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreLockedProductOffer)) {
            return false;
        }
        StoreLockedProductOffer storeLockedProductOffer = (StoreLockedProductOffer) obj2;
        return Intrinsics.f(this.f88530a, storeLockedProductOffer.f88530a) && Intrinsics.f(this.f88531b, storeLockedProductOffer.f88531b) && Intrinsics.f(this.f88532c, storeLockedProductOffer.f88532c) && Intrinsics.f(this.d, storeLockedProductOffer.d);
    }

    public final int hashCode() {
        int iHashCode = this.f88530a.hashCode() * 31;
        String str = this.f88531b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88532c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88530a);
        dest.writeString(this.f88531b);
        dest.writeStringList(this.f88532c);
        dest.writeString(this.d);
    }
}
