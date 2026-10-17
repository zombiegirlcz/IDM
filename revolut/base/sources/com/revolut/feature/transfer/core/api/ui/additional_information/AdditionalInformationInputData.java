package com.revolut.feature.transfer.core.api.ui.additional_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/additional_information/AdditionalInformationInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInformationInputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92157c;
    public final int d;
    public final AdditionalInformationInput e;

    @NotNull
    public static final Parcelable.Creator<AdditionalInformationInputData> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalInformationInputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (AdditionalInformationInput) parcel.readParcelable(AdditionalInformationInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInformationInputData[i];
        }
    }

    public AdditionalInformationInputData(String type, String label, String str, int i, AdditionalInformationInput additionalInformationInput) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92155a = type;
        this.f92156b = label;
        this.f92157c = str;
        this.d = i;
        this.e = additionalInformationInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInformationInputData)) {
            return false;
        }
        AdditionalInformationInputData additionalInformationInputData = (AdditionalInformationInputData) obj2;
        return Intrinsics.f(this.f92155a, additionalInformationInputData.f92155a) && Intrinsics.f(this.f92156b, additionalInformationInputData.f92156b) && Intrinsics.f(this.f92157c, additionalInformationInputData.f92157c) && this.d == additionalInformationInputData.d && Intrinsics.f(this.e, additionalInformationInputData.e);
    }

    public final int hashCode() {
        int iC = a.c(this.f92155a.hashCode() * 31, 31, this.f92156b);
        String str = this.f92157c;
        int iB = j6.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        AdditionalInformationInput additionalInformationInput = this.e;
        return iB + (additionalInformationInput != null ? additionalInformationInput.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92155a);
        dest.writeString(this.f92156b);
        dest.writeString(this.f92157c);
        dest.writeInt(this.d);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ AdditionalInformationInputData(String str, String str2, String str3, AdditionalInformationInput additionalInformationInput, int i) {
        this(str, str2, str3, 30, (i & 16) != 0 ? null : additionalInformationInput);
    }
}
