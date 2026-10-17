package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftTermsAndConditions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTermsAndConditions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftTermsAndConditions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98748c;
    public final ParameterisedHyperTextContent d;
    public final ParameterisedHyperTextContent e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftTermsAndConditions((ParameterisedHyperTextContent) parcel.readParcelable(AsftTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AsftTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AsftTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AsftTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AsftTermsAndConditions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTermsAndConditions[i];
        }
    }

    public AsftTermsAndConditions(ParameterisedHyperTextContent content, ParameterisedHyperTextContent parameterisedHyperTextContent, ParameterisedHyperTextContent parameterisedHyperTextContent2, ParameterisedHyperTextContent parameterisedHyperTextContent3, ParameterisedHyperTextContent parameterisedHyperTextContent4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f98746a = content;
        this.f98747b = parameterisedHyperTextContent;
        this.f98748c = parameterisedHyperTextContent2;
        this.d = parameterisedHyperTextContent3;
        this.e = parameterisedHyperTextContent4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTermsAndConditions)) {
            return false;
        }
        AsftTermsAndConditions asftTermsAndConditions = (AsftTermsAndConditions) obj2;
        return Intrinsics.f(this.f98746a, asftTermsAndConditions.f98746a) && Intrinsics.f(this.f98747b, asftTermsAndConditions.f98747b) && Intrinsics.f(this.f98748c, asftTermsAndConditions.f98748c) && Intrinsics.f(this.d, asftTermsAndConditions.d) && Intrinsics.f(this.e, asftTermsAndConditions.e);
    }

    public final int hashCode() {
        int iHashCode = this.f98746a.hashCode() * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent = this.f98747b;
        int iHashCode2 = (iHashCode + (parameterisedHyperTextContent == null ? 0 : parameterisedHyperTextContent.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent2 = this.f98748c;
        int iHashCode3 = (iHashCode2 + (parameterisedHyperTextContent2 == null ? 0 : parameterisedHyperTextContent2.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent3 = this.d;
        int iHashCode4 = (iHashCode3 + (parameterisedHyperTextContent3 == null ? 0 : parameterisedHyperTextContent3.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent4 = this.e;
        return iHashCode4 + (parameterisedHyperTextContent4 != null ? parameterisedHyperTextContent4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98746a, i);
        dest.writeParcelable(this.f98747b, i);
        dest.writeParcelable(this.f98748c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
