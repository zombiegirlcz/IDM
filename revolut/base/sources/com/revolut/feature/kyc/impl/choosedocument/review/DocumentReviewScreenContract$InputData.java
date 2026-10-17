package com.revolut.feature.kyc.impl.choosedocument.review;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/choosedocument/review/DocumentReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f77601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77603c;
    public final AnalyticsProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentReviewScreenContract$InputData((Uri) parcel.readParcelable(DocumentReviewScreenContract$InputData.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(DocumentReviewScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentReviewScreenContract$InputData[i];
        }
    }

    public DocumentReviewScreenContract$InputData(Uri fileUri, int i, int i2, AnalyticsProduct product) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f77601a = fileUri;
        this.f77602b = i;
        this.f77603c = i2;
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
        if (!(obj2 instanceof DocumentReviewScreenContract$InputData)) {
            return false;
        }
        DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData = (DocumentReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77601a, documentReviewScreenContract$InputData.f77601a) && this.f77602b == documentReviewScreenContract$InputData.f77602b && this.f77603c == documentReviewScreenContract$InputData.f77603c && Intrinsics.f(this.d, documentReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f77603c, j6.a.b(this.f77602b, this.f77601a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77601a, i);
        dest.writeInt(this.f77602b);
        dest.writeInt(this.f77603c);
        dest.writeParcelable(this.d, i);
    }
}
