package com.revolut.feature.kyc.api.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ReviewDocumentDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewDocumentDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ReviewDocumentDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f77512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77514c;
    public final AnalyticsProduct d;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewDocumentDestination((Uri) parcel.readParcelable(ReviewDocumentDestination.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(ReviewDocumentDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewDocumentDestination[i];
        }
    }

    public ReviewDocumentDestination(Uri fileUri, int i, int i2, AnalyticsProduct product) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f77512a = fileUri;
        this.f77513b = i;
        this.f77514c = i2;
        this.d = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewDocumentDestination)) {
            return false;
        }
        ReviewDocumentDestination reviewDocumentDestination = (ReviewDocumentDestination) obj2;
        return Intrinsics.f(this.f77512a, reviewDocumentDestination.f77512a) && this.f77513b == reviewDocumentDestination.f77513b && this.f77514c == reviewDocumentDestination.f77514c && Intrinsics.f(this.d, reviewDocumentDestination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f77514c, j6.a.b(this.f77513b, this.f77512a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77512a, i);
        dest.writeInt(this.f77513b);
        dest.writeInt(this.f77514c);
        dest.writeParcelable(this.d, i);
    }
}
