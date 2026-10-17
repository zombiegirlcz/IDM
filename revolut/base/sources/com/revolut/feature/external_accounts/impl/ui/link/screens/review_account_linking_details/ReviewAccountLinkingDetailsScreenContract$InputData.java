package com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/screens/review_account_linking_details/ReviewAccountLinkingDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewAccountLinkingDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReviewAccountLinkingDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73055c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewAccountLinkingDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewAccountLinkingDetailsScreenContract$InputData[i];
        }
    }

    public ReviewAccountLinkingDetailsScreenContract$InputData(String institutionId, String institutionName, String str, boolean z) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f73053a = institutionId;
        this.f73054b = institutionName;
        this.f73055c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewAccountLinkingDetailsScreenContract$InputData)) {
            return false;
        }
        ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = (ReviewAccountLinkingDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73053a, reviewAccountLinkingDetailsScreenContract$InputData.f73053a) && Intrinsics.f(this.f73054b, reviewAccountLinkingDetailsScreenContract$InputData.f73054b) && Intrinsics.f(this.f73055c, reviewAccountLinkingDetailsScreenContract$InputData.f73055c) && this.d == reviewAccountLinkingDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f73053a.hashCode() * 31, 31, this.f73054b);
        String str = this.f73055c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73053a);
        dest.writeString(this.f73054b);
        dest.writeString(this.f73055c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
