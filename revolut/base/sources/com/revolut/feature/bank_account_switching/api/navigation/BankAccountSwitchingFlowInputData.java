package com.revolut.feature.bank_account_switching.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mn2.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "RequestList", "NewRequest", "RequestStatus", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$NewRequest;", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$RequestList;", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$RequestStatus;", "feature_bank_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankAccountSwitchingFlowInputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$NewRequest;", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewRequest implements BankAccountSwitchingFlowInputData {

        @NotNull
        public static final Parcelable.Creator<NewRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mn2.a f63884a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewRequest(mn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewRequest[i];
            }
        }

        public NewRequest(mn2.a serviceType) {
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            this.f63884a = serviceType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewRequest) && this.f63884a == ((NewRequest) obj2).f63884a;
        }

        @Override // com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData
        /* JADX INFO: renamed from: f9, reason: from getter */
        public final mn2.a getF63886a() {
            return this.f63884a;
        }

        public final int hashCode() {
            return this.f63884a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63884a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$RequestList;", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestList implements BankAccountSwitchingFlowInputData {

        @NotNull
        public static final Parcelable.Creator<RequestList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mn2.a f63885a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestList(mn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestList[i];
            }
        }

        public RequestList(mn2.a serviceType) {
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            this.f63885a = serviceType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestList) && this.f63885a == ((RequestList) obj2).f63885a;
        }

        @Override // com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData
        /* JADX INFO: renamed from: f9, reason: from getter */
        public final mn2.a getF63886a() {
            return this.f63885a;
        }

        public final int hashCode() {
            return this.f63885a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63885a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestStatus implements BankAccountSwitchingFlowInputData {

        @NotNull
        public static final Parcelable.Creator<RequestStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mn2.a f63886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63887b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestStatus(parcel.readString(), mn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestStatus[i];
            }
        }

        public RequestStatus(String requestId, mn2.a serviceType) {
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f63886a = serviceType;
            this.f63887b = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestStatus)) {
                return false;
            }
            RequestStatus requestStatus = (RequestStatus) obj2;
            return this.f63886a == requestStatus.f63886a && Intrinsics.f(this.f63887b, requestStatus.f63887b);
        }

        @Override // com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData
        /* JADX INFO: renamed from: f9, reason: from getter */
        public final mn2.a getF63886a() {
            return this.f63886a;
        }

        public final int hashCode() {
            return this.f63887b.hashCode() + (this.f63886a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63886a.name());
            dest.writeString(this.f63887b);
        }
    }

    /* JADX INFO: renamed from: f9 */
    a getF63886a();
}
