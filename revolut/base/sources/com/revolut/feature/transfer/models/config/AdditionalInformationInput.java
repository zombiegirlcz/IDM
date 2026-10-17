package com.revolut.feature.transfer.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/config/AdditionalInformationInput;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInformationInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInformationInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92268c;
    public final String d;
    public final AdditionalInformationInputMaskConfig e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalInformationInput(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdditionalInformationInputMaskConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInformationInput[i];
        }
    }

    public AdditionalInformationInput(String type, String label, String str, String initialValue, AdditionalInformationInputMaskConfig additionalInformationInputMaskConfig) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        this.f92266a = type;
        this.f92267b = label;
        this.f92268c = str;
        this.d = initialValue;
        this.e = additionalInformationInputMaskConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInformationInput)) {
            return false;
        }
        AdditionalInformationInput additionalInformationInput = (AdditionalInformationInput) obj2;
        return Intrinsics.f(this.f92266a, additionalInformationInput.f92266a) && Intrinsics.f(this.f92267b, additionalInformationInput.f92267b) && Intrinsics.f(this.f92268c, additionalInformationInput.f92268c) && Intrinsics.f(this.d, additionalInformationInput.d) && Intrinsics.f(this.e, additionalInformationInput.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f92266a.hashCode() * 31, 31, this.f92267b);
        String str = this.f92268c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        AdditionalInformationInputMaskConfig additionalInformationInputMaskConfig = this.e;
        return iC2 + (additionalInformationInputMaskConfig != null ? additionalInformationInputMaskConfig.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92266a);
        dest.writeString(this.f92267b);
        dest.writeString(this.f92268c);
        dest.writeString(this.d);
        AdditionalInformationInputMaskConfig additionalInformationInputMaskConfig = this.e;
        if (additionalInformationInputMaskConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInformationInputMaskConfig.writeToParcel(dest, i);
        }
    }
}
