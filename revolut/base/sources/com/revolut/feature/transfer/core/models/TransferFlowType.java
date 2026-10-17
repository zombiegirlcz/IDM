package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferFlowType;", "Landroid/os/Parcelable;", "Default", "Crypto", "Pro", "JointAccountFlow", "Lcom/revolut/feature/transfer/core/models/TransferFlowType$Crypto;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType$Default;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType$JointAccountFlow;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType$Pro;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferFlowType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f92255a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferFlowType$Crypto;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType;", "<init>", "()V", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Crypto extends TransferFlowType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Crypto f92256b = new Crypto();

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Crypto.f92256b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        private Crypto() {
            super(AccountId.Personal.f51414a);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferFlowType$Default;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType;", "<init>", "()V", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends TransferFlowType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Default f92257b = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f92257b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
            super(AccountId.Personal.f51414a);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferFlowType$JointAccountFlow;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointAccountFlow extends TransferFlowType {

        @NotNull
        public static final Parcelable.Creator<JointAccountFlow> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId.Joint f92258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92259c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointAccountFlow((AccountId.Joint) parcel.readParcelable(JointAccountFlow.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccountFlow[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JointAccountFlow(AccountId.Joint accountId, String str) {
            super(accountId);
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f92258b = accountId;
            this.f92259c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JointAccountFlow)) {
                return false;
            }
            JointAccountFlow jointAccountFlow = (JointAccountFlow) obj2;
            return Intrinsics.f(this.f92258b, jointAccountFlow.f92258b) && Intrinsics.f(this.f92259c, jointAccountFlow.f92259c);
        }

        @Override // com.revolut.feature.transfer.core.models.TransferFlowType
        /* JADX INFO: renamed from: getAccountId */
        public final AccountId getF92255a() {
            return this.f92258b;
        }

        public final int hashCode() {
            int iHashCode = this.f92258b.hashCode() * 31;
            String str = this.f92259c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92258b, i);
            dest.writeString(this.f92259c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferFlowType$Pro;", "Lcom/revolut/feature/transfer/core/models/TransferFlowType;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends TransferFlowType {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pro) && Intrinsics.f(this.f92260b, ((Pro) obj2).f92260b);
        }

        public final int hashCode() {
            String str = this.f92260b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92260b);
        }

        public Pro(String str) {
            super(AccountId.Personal.f51414a);
            this.f92260b = str;
        }
    }

    public TransferFlowType(AccountId accountId) {
        this.f92255a = accountId;
    }

    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public AccountId getF92255a() {
        return this.f92255a;
    }
}
