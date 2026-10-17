package com.revolut.feature.onboarding.api.esignature.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import k89.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/api/esignature/models/ESignatureDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "k89/b", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ESignatureDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ESignatureDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureProcess f78144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f78145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78146c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ESignatureDetails(ESignatureProcess.CREATOR.createFromParcel(parcel), b.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ESignatureDetails[i];
        }
    }

    public ESignatureDetails(ESignatureProcess signatureProcess, b state, List inputDocumentIds) {
        Intrinsics.checkNotNullParameter(signatureProcess, "signatureProcess");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputDocumentIds, "inputDocumentIds");
        this.f78144a = signatureProcess;
        this.f78145b = state;
        this.f78146c = inputDocumentIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ESignatureDetails)) {
            return false;
        }
        ESignatureDetails eSignatureDetails = (ESignatureDetails) obj2;
        return Intrinsics.f(this.f78144a, eSignatureDetails.f78144a) && this.f78145b == eSignatureDetails.f78145b && Intrinsics.f(this.f78146c, eSignatureDetails.f78146c);
    }

    public final int hashCode() {
        return this.f78146c.hashCode() + ((this.f78145b.hashCode() + (this.f78144a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f78144a.writeToParcel(dest, i);
        dest.writeString(this.f78145b.name());
        dest.writeStringList(this.f78146c);
    }
}
