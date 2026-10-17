package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingServiceProvider;", "Lcom/revolut/retail/feature/esim/api/model/EsimPickerItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingServiceProvider implements EsimPickerItem {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingServiceProvider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100398b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingServiceProvider(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingServiceProvider[i];
        }
    }

    public EsimPhoneNumberPortingServiceProvider(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f100397a = id10;
        this.f100398b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingServiceProvider)) {
            return false;
        }
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = (EsimPhoneNumberPortingServiceProvider) obj2;
        return Intrinsics.f(this.f100397a, esimPhoneNumberPortingServiceProvider.f100397a) && Intrinsics.f(this.f100398b, esimPhoneNumberPortingServiceProvider.f100398b);
    }

    public final int hashCode() {
        return this.f100398b.hashCode() + (this.f100397a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100397a);
        dest.writeString(this.f100398b);
    }
}
