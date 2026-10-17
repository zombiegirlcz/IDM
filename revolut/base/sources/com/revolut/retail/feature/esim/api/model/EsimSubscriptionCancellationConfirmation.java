package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionCancellationConfirmation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionCancellationConfirmation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionCancellationConfirmation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100461c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionCancellationConfirmation(parcel.readString(), EsimHyperText.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionCancellationConfirmation[i];
        }
    }

    public EsimSubscriptionCancellationConfirmation(String title, EsimHyperText subtitle, String primaryActionLabel, String secondaryActionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(secondaryActionLabel, "secondaryActionLabel");
        this.f100459a = title;
        this.f100460b = subtitle;
        this.f100461c = primaryActionLabel;
        this.d = secondaryActionLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionCancellationConfirmation)) {
            return false;
        }
        EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation = (EsimSubscriptionCancellationConfirmation) obj2;
        return Intrinsics.f(this.f100459a, esimSubscriptionCancellationConfirmation.f100459a) && Intrinsics.f(this.f100460b, esimSubscriptionCancellationConfirmation.f100460b) && Intrinsics.f(this.f100461c, esimSubscriptionCancellationConfirmation.f100461c) && Intrinsics.f(this.d, esimSubscriptionCancellationConfirmation.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f100460b.hashCode() + (this.f100459a.hashCode() * 31)) * 31, 31, this.f100461c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100459a);
        this.f100460b.writeToParcel(dest, i);
        dest.writeString(this.f100461c);
        dest.writeString(this.d);
    }
}
