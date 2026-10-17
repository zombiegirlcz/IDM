package com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "PreloadedContent", "LoadContent", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData$LoadContent;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData$PreloadedContent;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanInstalmentDetailsScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData$LoadContent;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadContent extends LoanInstalmentDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<LoadContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70425b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadContent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadContent[i];
            }
        }

        public LoadContent(String loanId, String instalmentId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(instalmentId, "instalmentId");
            this.f70424a = loanId;
            this.f70425b = instalmentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadContent)) {
                return false;
            }
            LoadContent loadContent = (LoadContent) obj2;
            return Intrinsics.f(this.f70424a, loadContent.f70424a) && Intrinsics.f(this.f70425b, loadContent.f70425b);
        }

        public final int hashCode() {
            return this.f70425b.hashCode() + (this.f70424a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70424a);
            dest.writeString(this.f70425b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData$PreloadedContent;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreloadedContent extends LoanInstalmentDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PreloadedContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f70427b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreloadedContent((LoanDetails) parcel.readParcelable(PreloadedContent.class.getClassLoader()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreloadedContent[i];
            }
        }

        public PreloadedContent(LoanDetails loanDetails, n user) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f70426a = loanDetails;
            this.f70427b = user;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreloadedContent)) {
                return false;
            }
            PreloadedContent preloadedContent = (PreloadedContent) obj2;
            return Intrinsics.f(this.f70426a, preloadedContent.f70426a) && Intrinsics.f(this.f70427b, preloadedContent.f70427b);
        }

        public final int hashCode() {
            return this.f70427b.hashCode() + (this.f70426a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70426a, i);
            dest.writeSerializable(this.f70427b);
        }
    }

    private LoanInstalmentDetailsScreenContract$InputData() {
    }
}
