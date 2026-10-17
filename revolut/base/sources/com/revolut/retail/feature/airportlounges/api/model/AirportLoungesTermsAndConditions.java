package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/AirportLoungesTermsAndConditions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesTermsAndConditions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesTermsAndConditions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParameterisedHyperTextContent f98928c;
    public final ParameterisedHyperTextContent d;
    public final ParameterisedHyperTextContent e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesTermsAndConditions((ParameterisedHyperTextContent) parcel.readParcelable(AirportLoungesTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AirportLoungesTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AirportLoungesTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AirportLoungesTermsAndConditions.class.getClassLoader()), (ParameterisedHyperTextContent) parcel.readParcelable(AirportLoungesTermsAndConditions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesTermsAndConditions[i];
        }
    }

    public AirportLoungesTermsAndConditions(ParameterisedHyperTextContent content, ParameterisedHyperTextContent parameterisedHyperTextContent, ParameterisedHyperTextContent parameterisedHyperTextContent2, ParameterisedHyperTextContent parameterisedHyperTextContent3, ParameterisedHyperTextContent parameterisedHyperTextContent4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f98926a = content;
        this.f98927b = parameterisedHyperTextContent;
        this.f98928c = parameterisedHyperTextContent2;
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
        if (!(obj2 instanceof AirportLoungesTermsAndConditions)) {
            return false;
        }
        AirportLoungesTermsAndConditions airportLoungesTermsAndConditions = (AirportLoungesTermsAndConditions) obj2;
        return Intrinsics.f(this.f98926a, airportLoungesTermsAndConditions.f98926a) && Intrinsics.f(this.f98927b, airportLoungesTermsAndConditions.f98927b) && Intrinsics.f(this.f98928c, airportLoungesTermsAndConditions.f98928c) && Intrinsics.f(this.d, airportLoungesTermsAndConditions.d) && Intrinsics.f(this.e, airportLoungesTermsAndConditions.e);
    }

    public final int hashCode() {
        int iHashCode = this.f98926a.hashCode() * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent = this.f98927b;
        int iHashCode2 = (iHashCode + (parameterisedHyperTextContent == null ? 0 : parameterisedHyperTextContent.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent2 = this.f98928c;
        int iHashCode3 = (iHashCode2 + (parameterisedHyperTextContent2 == null ? 0 : parameterisedHyperTextContent2.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent3 = this.d;
        int iHashCode4 = (iHashCode3 + (parameterisedHyperTextContent3 == null ? 0 : parameterisedHyperTextContent3.hashCode())) * 31;
        ParameterisedHyperTextContent parameterisedHyperTextContent4 = this.e;
        return iHashCode4 + (parameterisedHyperTextContent4 != null ? parameterisedHyperTextContent4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98926a, i);
        dest.writeParcelable(this.f98927b, i);
        dest.writeParcelable(this.f98928c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
