package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionCancelledAllowance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionCancelledAllowance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionCancelledAllowance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100466b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionCancelledAllowance(parcel.readString(), EsimHyperText.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionCancelledAllowance[i];
        }
    }

    public EsimSubscriptionCancelledAllowance(String icon, EsimHyperText content) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f100465a = icon;
        this.f100466b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionCancelledAllowance)) {
            return false;
        }
        EsimSubscriptionCancelledAllowance esimSubscriptionCancelledAllowance = (EsimSubscriptionCancelledAllowance) obj2;
        return Intrinsics.f(this.f100465a, esimSubscriptionCancelledAllowance.f100465a) && Intrinsics.f(this.f100466b, esimSubscriptionCancelledAllowance.f100466b);
    }

    public final int hashCode() {
        return this.f100466b.hashCode() + (this.f100465a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100465a);
        this.f100466b.writeToParcel(dest, i);
    }
}
