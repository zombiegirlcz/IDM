package com.revolut.feature.salary_switch.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MxSalarySwitchPromo", "ShareSalaryDetails", "SalarySwitchMx", "SalarySwitchBr", "CurrencySwitch", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$CurrencySwitch;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$MxSalarySwitchPromo;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$SalarySwitchBr;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$SalarySwitchMx;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$ShareSalaryDetails;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalarySwitchFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$CurrencySwitch;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencySwitch implements SalarySwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CurrencySwitch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85309b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencySwitch(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencySwitch[i];
            }
        }

        public CurrencySwitch(String salaryAccountCurrencyCode, String baseCurrencyCode) {
            Intrinsics.checkNotNullParameter(salaryAccountCurrencyCode, "salaryAccountCurrencyCode");
            Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
            this.f85308a = salaryAccountCurrencyCode;
            this.f85309b = baseCurrencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencySwitch)) {
                return false;
            }
            CurrencySwitch currencySwitch = (CurrencySwitch) obj2;
            return Intrinsics.f(this.f85308a, currencySwitch.f85308a) && Intrinsics.f(this.f85309b, currencySwitch.f85309b);
        }

        public final int hashCode() {
            return this.f85309b.hashCode() + (this.f85308a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85308a);
            dest.writeString(this.f85309b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$MxSalarySwitchPromo;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step;", "<init>", "()V", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MxSalarySwitchPromo implements SalarySwitchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MxSalarySwitchPromo f85310a = new MxSalarySwitchPromo();

        @NotNull
        public static final Parcelable.Creator<MxSalarySwitchPromo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MxSalarySwitchPromo.f85310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MxSalarySwitchPromo[i];
            }
        }

        private MxSalarySwitchPromo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$SalarySwitchBr;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalarySwitchBr implements SalarySwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SalarySwitchBr> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalarySwitchBr(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalarySwitchBr[i];
            }
        }

        public SalarySwitchBr(String str) {
            this.f85311a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalarySwitchBr) && Intrinsics.f(this.f85311a, ((SalarySwitchBr) obj2).f85311a);
        }

        public final int hashCode() {
            String str = this.f85311a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85311a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$SalarySwitchMx;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalarySwitchMx implements SalarySwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SalarySwitchMx> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85312a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalarySwitchMx(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalarySwitchMx[i];
            }
        }

        public SalarySwitchMx(String str) {
            this.f85312a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalarySwitchMx) && Intrinsics.f(this.f85312a, ((SalarySwitchMx) obj2).f85312a);
        }

        public final int hashCode() {
            String str = this.f85312a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85312a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step$ShareSalaryDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/flow/SalarySwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareSalaryDetails implements SalarySwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShareSalaryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85313a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareSalaryDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareSalaryDetails[i];
            }
        }

        public ShareSalaryDetails(String salaryAccountCurrencyCode) {
            Intrinsics.checkNotNullParameter(salaryAccountCurrencyCode, "salaryAccountCurrencyCode");
            this.f85313a = salaryAccountCurrencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareSalaryDetails) && Intrinsics.f(this.f85313a, ((ShareSalaryDetails) obj2).f85313a);
        }

        public final int hashCode() {
            return this.f85313a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85313a);
        }
    }
}
