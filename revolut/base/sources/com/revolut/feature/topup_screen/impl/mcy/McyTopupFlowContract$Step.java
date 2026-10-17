package com.revolut.feature.topup_screen.impl.mcy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.mcy.McyTopUpMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "IndiaTopupSelectCountry", "IndiaTopupDeclaration", "McyExchangeRate", "McyAccountVerification", "McyProductArticle", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$IndiaTopupDeclaration;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$IndiaTopupSelectCountry;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyAccountVerification;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyExchangeRate;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyProductArticle;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class McyTopupFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$IndiaTopupDeclaration;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaTopupDeclaration extends McyTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IndiaTopupDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f91051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f91053c;
        public final McyTopUpMethod d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaTopupDeclaration((xi0.b) parcel.readSerializable(), (d) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (McyTopUpMethod) parcel.readParcelable(IndiaTopupDeclaration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaTopupDeclaration[i];
            }
        }

        public IndiaTopupDeclaration(xi0.b baseCurrency, d enteredAmount, wi0.b countryCode, McyTopUpMethod mcyTopUpMethod) {
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f91051a = baseCurrency;
            this.f91052b = enteredAmount;
            this.f91053c = countryCode;
            this.d = mcyTopUpMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IndiaTopupDeclaration)) {
                return false;
            }
            IndiaTopupDeclaration indiaTopupDeclaration = (IndiaTopupDeclaration) obj2;
            return Intrinsics.f(this.f91051a, indiaTopupDeclaration.f91051a) && Intrinsics.f(this.f91052b, indiaTopupDeclaration.f91052b) && Intrinsics.f(this.f91053c, indiaTopupDeclaration.f91053c) && Intrinsics.f(this.d, indiaTopupDeclaration.d);
        }

        public final int hashCode() {
            int iC = p.a.c(v7.c(this.f91051a.hashCode() * 31, 31, this.f91052b), 31, this.f91053c.f297794a);
            McyTopUpMethod mcyTopUpMethod = this.d;
            return iC + (mcyTopUpMethod == null ? 0 : mcyTopUpMethod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91051a);
            dest.writeSerializable(this.f91052b);
            dest.writeSerializable(this.f91053c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$IndiaTopupSelectCountry;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaTopupSelectCountry extends McyTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IndiaTopupSelectCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f91054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final McyTopUpMethod f91056c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaTopupSelectCountry((xi0.b) parcel.readSerializable(), (d) parcel.readSerializable(), (McyTopUpMethod) parcel.readParcelable(IndiaTopupSelectCountry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaTopupSelectCountry[i];
            }
        }

        public IndiaTopupSelectCountry(xi0.b baseCurrency, d enteredAmount, McyTopUpMethod mcyTopUpMethod) {
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
            this.f91054a = baseCurrency;
            this.f91055b = enteredAmount;
            this.f91056c = mcyTopUpMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IndiaTopupSelectCountry)) {
                return false;
            }
            IndiaTopupSelectCountry indiaTopupSelectCountry = (IndiaTopupSelectCountry) obj2;
            return Intrinsics.f(this.f91054a, indiaTopupSelectCountry.f91054a) && Intrinsics.f(this.f91055b, indiaTopupSelectCountry.f91055b) && Intrinsics.f(this.f91056c, indiaTopupSelectCountry.f91056c);
        }

        public final int hashCode() {
            int iC = v7.c(this.f91054a.hashCode() * 31, 31, this.f91055b);
            McyTopUpMethod mcyTopUpMethod = this.f91056c;
            return iC + (mcyTopUpMethod == null ? 0 : mcyTopUpMethod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91054a);
            dest.writeSerializable(this.f91055b);
            dest.writeParcelable(this.f91056c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyAccountVerification;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyAccountVerification extends McyTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<McyAccountVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopupMethodType f91059c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyAccountVerification(parcel.readString(), (d) parcel.readSerializable(), TopupMethodType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyAccountVerification[i];
            }
        }

        public McyAccountVerification(String str, d amount, TopupMethodType topUpMethodType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodType, "topUpMethodType");
            this.f91057a = str;
            this.f91058b = amount;
            this.f91059c = topUpMethodType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof McyAccountVerification)) {
                return false;
            }
            McyAccountVerification mcyAccountVerification = (McyAccountVerification) obj2;
            return Intrinsics.f(this.f91057a, mcyAccountVerification.f91057a) && Intrinsics.f(this.f91058b, mcyAccountVerification.f91058b) && this.f91059c == mcyAccountVerification.f91059c;
        }

        public final int hashCode() {
            String str = this.f91057a;
            return this.f91059c.hashCode() + v7.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f91058b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91057a);
            dest.writeSerializable(this.f91058b);
            dest.writeString(this.f91059c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyExchangeRate;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyExchangeRate extends McyTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<McyExchangeRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f91060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91062c;
        public final wi0.b d;
        public final McyTopUpMethod e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyExchangeRate((xi0.b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (wi0.b) parcel.readSerializable(), (McyTopUpMethod) parcel.readParcelable(McyExchangeRate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyExchangeRate[i];
            }
        }

        public McyExchangeRate(xi0.b baseCurrency, d enteredAmount, boolean z, wi0.b countryCode, McyTopUpMethod mcyTopUpMethod) {
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f91060a = baseCurrency;
            this.f91061b = enteredAmount;
            this.f91062c = z;
            this.d = countryCode;
            this.e = mcyTopUpMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof McyExchangeRate)) {
                return false;
            }
            McyExchangeRate mcyExchangeRate = (McyExchangeRate) obj2;
            return Intrinsics.f(this.f91060a, mcyExchangeRate.f91060a) && Intrinsics.f(this.f91061b, mcyExchangeRate.f91061b) && this.f91062c == mcyExchangeRate.f91062c && Intrinsics.f(this.d, mcyExchangeRate.d) && Intrinsics.f(this.e, mcyExchangeRate.e);
        }

        public final int hashCode() {
            int iC = p.a.c(j6.a.c(v7.c(this.f91060a.hashCode() * 31, 31, this.f91061b), 31, this.f91062c), 31, this.d.f297794a);
            McyTopUpMethod mcyTopUpMethod = this.e;
            return iC + (mcyTopUpMethod == null ? 0 : mcyTopUpMethod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91060a);
            dest.writeSerializable(this.f91061b);
            dest.writeInt(this.f91062c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step$McyProductArticle;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class McyProductArticle extends McyTopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final McyProductArticle f91063a = new McyProductArticle();

        @NotNull
        public static final Parcelable.Creator<McyProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return McyProductArticle.f91063a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyProductArticle[i];
            }
        }

        private McyProductArticle() {
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

    private McyTopupFlowContract$Step() {
    }
}
