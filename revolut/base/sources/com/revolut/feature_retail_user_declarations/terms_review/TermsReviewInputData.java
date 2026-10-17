package com.revolut.feature_retail_user_declarations.terms_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/terms_review/TermsReviewInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TermsReviewInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TermsReviewInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97742c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TermsReviewInputData(parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TermsReviewInputData[i];
        }
    }

    public TermsReviewInputData(List termsIds, boolean z, String stepId, String countryCode) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(termsIds, "termsIds");
        this.f97740a = stepId;
        this.f97741b = countryCode;
        this.f97742c = termsIds;
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
        if (!(obj2 instanceof TermsReviewInputData)) {
            return false;
        }
        TermsReviewInputData termsReviewInputData = (TermsReviewInputData) obj2;
        return Intrinsics.f(this.f97740a, termsReviewInputData.f97740a) && Intrinsics.f(this.f97741b, termsReviewInputData.f97741b) && Intrinsics.f(this.f97742c, termsReviewInputData.f97742c) && this.d == termsReviewInputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.c(this.f97740a.hashCode() * 31, 31, this.f97741b), 31, this.f97742c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97740a);
        dest.writeString(this.f97741b);
        dest.writeStringList(this.f97742c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
