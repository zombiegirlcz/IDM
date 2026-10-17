package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimAutoRenewalTermsItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimAutoRenewalTermsItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimAutoRenewalTermsItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100191b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimAutoRenewalTermsItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimAutoRenewalTermsItem[i];
        }
    }

    public EsimAutoRenewalTermsItem(String icon, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f100190a = icon;
        this.f100191b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimAutoRenewalTermsItem)) {
            return false;
        }
        EsimAutoRenewalTermsItem esimAutoRenewalTermsItem = (EsimAutoRenewalTermsItem) obj2;
        return Intrinsics.f(this.f100190a, esimAutoRenewalTermsItem.f100190a) && Intrinsics.f(this.f100191b, esimAutoRenewalTermsItem.f100191b);
    }

    public final int hashCode() {
        return this.f100191b.hashCode() + (this.f100190a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100190a);
        dest.writeString(this.f100191b);
    }
}
