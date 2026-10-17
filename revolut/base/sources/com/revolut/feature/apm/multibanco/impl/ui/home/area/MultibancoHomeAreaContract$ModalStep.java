package com.revolut.feature.apm.multibanco.impl.ui.home.area;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.kompot.navigable.flow.FlowStep;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddNewContact", "RecipientList", "PayFlow", "WithdrawalFlow", "WithdrawalList", "WithdrawalDetails", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$AddNewContact;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$PayFlow;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$RecipientList;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalDetails;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalFlow;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalList;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoHomeAreaContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$AddNewContact;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNewContact implements MultibancoHomeAreaContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNewContact f62596a = new AddNewContact();

        @NotNull
        public static final Parcelable.Creator<AddNewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNewContact.f62596a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewContact[i];
            }
        }

        private AddNewContact() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$PayFlow;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayFlow implements MultibancoHomeAreaContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayFlow f62597a = new PayFlow();

        @NotNull
        public static final Parcelable.Creator<PayFlow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayFlow.f62597a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayFlow[i];
            }
        }

        private PayFlow() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$RecipientList;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecipientList implements MultibancoHomeAreaContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f62598a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecipientList(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientList[i];
            }
        }

        public RecipientList(f direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f62598a = direction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecipientList) && this.f62598a == ((RecipientList) obj2).f62598a;
        }

        public final int hashCode() {
            return this.f62598a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62598a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalDetails;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawalDetails implements MultibancoHomeAreaContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WithdrawalDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoWithdrawalCode f62599a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawalDetails((MultibancoWithdrawalCode) parcel.readParcelable(WithdrawalDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalDetails[i];
            }
        }

        public WithdrawalDetails(MultibancoWithdrawalCode code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f62599a = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithdrawalDetails) && Intrinsics.f(this.f62599a, ((WithdrawalDetails) obj2).f62599a);
        }

        public final int hashCode() {
            return this.f62599a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62599a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalFlow;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WithdrawalFlow implements MultibancoHomeAreaContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WithdrawalFlow f62600a = new WithdrawalFlow();

        @NotNull
        public static final Parcelable.Creator<WithdrawalFlow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithdrawalFlow.f62600a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalFlow[i];
            }
        }

        private WithdrawalFlow() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep$WithdrawalList;", "Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WithdrawalList implements MultibancoHomeAreaContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WithdrawalList f62601a = new WithdrawalList();

        @NotNull
        public static final Parcelable.Creator<WithdrawalList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithdrawalList.f62601a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalList[i];
            }
        }

        private WithdrawalList() {
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
}
