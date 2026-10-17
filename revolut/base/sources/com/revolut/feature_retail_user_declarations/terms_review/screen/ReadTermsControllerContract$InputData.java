package com.revolut.feature_retail_user_declarations.terms_review.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/terms_review/screen/ReadTermsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReadTermsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReadTermsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rbl.a f97750c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReadTermsControllerContract$InputData(parcel.readString(), (Clause) parcel.readParcelable(ReadTermsControllerContract$InputData.class.getClassLoader()), rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReadTermsControllerContract$InputData[i];
        }
    }

    public ReadTermsControllerContract$InputData(String termsId, Clause actionButtonText, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f97748a = termsId;
        this.f97749b = actionButtonText;
        this.f97750c = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReadTermsControllerContract$InputData)) {
            return false;
        }
        ReadTermsControllerContract$InputData readTermsControllerContract$InputData = (ReadTermsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f97748a, readTermsControllerContract$InputData.f97748a) && Intrinsics.f(this.f97749b, readTermsControllerContract$InputData.f97749b) && this.f97750c == readTermsControllerContract$InputData.f97750c;
    }

    public final int hashCode() {
        return this.f97750c.hashCode() + p.a.a(this.f97748a.hashCode() * 31, 31, this.f97749b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97748a);
        dest.writeParcelable(this.f97749b, i);
        dest.writeString(this.f97750c.name());
    }
}
