package com.revolut.feature.wealth.api.domain.model.collectionquote;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/collectionquote/CollectionQuoteFeeBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectionQuoteFeeBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollectionQuoteFeeBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95273c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectionQuoteFeeBreakdown((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectionQuoteFeeBreakdown[i];
        }
    }

    public CollectionQuoteFeeBreakdown(d sellCurrencyAmount, String title, String shortDescription, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sellCurrencyAmount, "sellCurrencyAmount");
        this.f95271a = title;
        this.f95272b = shortDescription;
        this.f95273c = description;
        this.d = sellCurrencyAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectionQuoteFeeBreakdown)) {
            return false;
        }
        CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = (CollectionQuoteFeeBreakdown) obj2;
        return Intrinsics.f(this.f95271a, collectionQuoteFeeBreakdown.f95271a) && Intrinsics.f(this.f95272b, collectionQuoteFeeBreakdown.f95272b) && Intrinsics.f(this.f95273c, collectionQuoteFeeBreakdown.f95273c) && Intrinsics.f(this.d, collectionQuoteFeeBreakdown.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f95271a.hashCode() * 31, 31, this.f95272b), 31, this.f95273c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95271a);
        dest.writeString(this.f95272b);
        dest.writeString(this.f95273c);
        dest.writeSerializable(this.d);
    }
}
