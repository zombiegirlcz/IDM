package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState;", "Landroid/os/Parcelable;", "Insured", "Eligible", "Ineligible", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Eligible;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Ineligible;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Insured;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanInsuranceState extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Eligible;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Eligible implements LoanInsuranceState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Eligible f70161a = new Eligible();

        @NotNull
        public static final Parcelable.Creator<Eligible> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Eligible.f70161a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eligible[i];
            }
        }

        private Eligible() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Ineligible;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Ineligible implements LoanInsuranceState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ineligible f70162a = new Ineligible();

        @NotNull
        public static final Parcelable.Creator<Ineligible> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ineligible.f70162a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ineligible[i];
            }
        }

        private Ineligible() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState$Insured;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsuranceState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Insured implements LoanInsuranceState {

        @NotNull
        public static final Parcelable.Creator<Insured> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f70163a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(LoanInsurancePolicyData.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Insured(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Insured[i];
            }
        }

        public Insured(ArrayList policies) {
            Intrinsics.checkNotNullParameter(policies, "policies");
            this.f70163a = policies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Insured) && this.f70163a.equals(((Insured) obj2).f70163a);
        }

        public final int hashCode() {
            return this.f70163a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f70163a, dest);
            while (itY.hasNext()) {
                ((LoanInsurancePolicyData) itY.next()).writeToParcel(dest, i);
            }
        }
    }
}
