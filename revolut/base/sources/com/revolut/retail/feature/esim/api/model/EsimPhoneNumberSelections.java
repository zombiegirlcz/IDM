package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberSelections;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberSelections implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberSelections> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f100407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberSelectionOptions f100408b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberSelections(parcel.createStringArrayList(), EsimPhoneNumberSelectionOptions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberSelections[i];
        }
    }

    public EsimPhoneNumberSelections(List mobilePlanIds, EsimPhoneNumberSelectionOptions options) {
        Intrinsics.checkNotNullParameter(mobilePlanIds, "mobilePlanIds");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f100407a = mobilePlanIds;
        this.f100408b = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberSelections)) {
            return false;
        }
        EsimPhoneNumberSelections esimPhoneNumberSelections = (EsimPhoneNumberSelections) obj2;
        return Intrinsics.f(this.f100407a, esimPhoneNumberSelections.f100407a) && Intrinsics.f(this.f100408b, esimPhoneNumberSelections.f100408b);
    }

    public final int hashCode() {
        return this.f100408b.hashCode() + (this.f100407a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f100407a);
        this.f100408b.writeToParcel(dest, i);
    }
}
