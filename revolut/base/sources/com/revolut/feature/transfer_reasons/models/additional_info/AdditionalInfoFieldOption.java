package com.revolut.feature.transfer_reasons.models.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoFieldOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoFieldOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoFieldOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92412b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalInfoFieldOption(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoFieldOption[i];
        }
    }

    public AdditionalInfoFieldOption(String key, String label) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92411a = key;
        this.f92412b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoFieldOption)) {
            return false;
        }
        AdditionalInfoFieldOption additionalInfoFieldOption = (AdditionalInfoFieldOption) obj2;
        return Intrinsics.f(this.f92411a, additionalInfoFieldOption.f92411a) && Intrinsics.f(this.f92412b, additionalInfoFieldOption.f92412b);
    }

    public final int hashCode() {
        return this.f92412b.hashCode() + (this.f92411a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92411a);
        dest.writeString(this.f92412b);
    }
}
