package com.revolut.feature.kyc.impl.fourthline;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/FourthlineDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FourthlineDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<FourthlineDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocType f77755c;
    public final b d;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FourthlineDestination((DocType) parcel.readParcelable(FourthlineDestination.class.getClassLoader()), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FourthlineDestination[i];
        }
    }

    public FourthlineDestination(DocType docType, String checkId, String verificationToken, b issuingCountry) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        this.f77753a = checkId;
        this.f77754b = verificationToken;
        this.f77755c = docType;
        this.d = issuingCountry;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FourthlineDestination)) {
            return false;
        }
        FourthlineDestination fourthlineDestination = (FourthlineDestination) obj2;
        return Intrinsics.f(this.f77753a, fourthlineDestination.f77753a) && Intrinsics.f(this.f77754b, fourthlineDestination.f77754b) && Intrinsics.f(this.f77755c, fourthlineDestination.f77755c) && Intrinsics.f(this.d, fourthlineDestination.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + ((this.f77755c.hashCode() + p.a.c(this.f77753a.hashCode() * 31, 31, this.f77754b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77753a);
        dest.writeString(this.f77754b);
        dest.writeParcelable(this.f77755c, i);
        dest.writeSerializable(this.d);
    }
}
