package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionsEmptyDisplay;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionsEmptyDisplay implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionsEmptyDisplay> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100525b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionsEmptyDisplay(parcel.readString(), EsimHyperText.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionsEmptyDisplay[i];
        }
    }

    public EsimSubscriptionsEmptyDisplay(String title, EsimHyperText description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f100524a = title;
        this.f100525b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionsEmptyDisplay)) {
            return false;
        }
        EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay = (EsimSubscriptionsEmptyDisplay) obj2;
        return Intrinsics.f(this.f100524a, esimSubscriptionsEmptyDisplay.f100524a) && Intrinsics.f(this.f100525b, esimSubscriptionsEmptyDisplay.f100525b);
    }

    public final int hashCode() {
        return this.f100525b.hashCode() + (this.f100524a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100524a);
        this.f100525b.writeToParcel(dest, i);
    }
}
