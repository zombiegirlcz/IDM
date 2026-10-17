package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "Landroid/os/Parcelable;", "Companion", "FeaturesDontWork", "UnhappyCustomerSupport", "NotInterested", "AnotherPlatform", "TooExpensive", "PoorPerformance", "EeaRemediationOptOut", "Other", "a", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$AnotherPlatform;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$EeaRemediationOptOut;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$FeaturesDontWork;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$NotInterested;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$Other;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$PoorPerformance;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$TooExpensive;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$UnhappyCustomerSupport;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountClosureFeedbackChoice implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94859a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$AnotherPlatform;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnotherPlatform extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnotherPlatform f94860b = new AnotherPlatform();

        @NotNull
        public static final Parcelable.Creator<AnotherPlatform> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnotherPlatform.f94860b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnotherPlatform[i];
            }
        }

        private AnotherPlatform() {
            super("I prefer another trading platform");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$EeaRemediationOptOut;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaRemediationOptOut extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EeaRemediationOptOut f94861b = new EeaRemediationOptOut();

        @NotNull
        public static final Parcelable.Creator<EeaRemediationOptOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaRemediationOptOut.f94861b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaRemediationOptOut[i];
            }
        }

        private EeaRemediationOptOut() {
            super("I don't want my account to be migrated to the European Trading Entity");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$FeaturesDontWork;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeaturesDontWork extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FeaturesDontWork f94862b = new FeaturesDontWork();

        @NotNull
        public static final Parcelable.Creator<FeaturesDontWork> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeaturesDontWork.f94862b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeaturesDontWork[i];
            }
        }

        private FeaturesDontWork() {
            super("Some features don't work");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$NotInterested;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotInterested extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NotInterested f94863b = new NotInterested();

        @NotNull
        public static final Parcelable.Creator<NotInterested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotInterested.f94863b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotInterested[i];
            }
        }

        private NotInterested() {
            super("Stock trading isn’t for me");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$Other;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Other extends AccountClosureFeedbackChoice {

        @NotNull
        public static final Parcelable.Creator<Other> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94864b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Other(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Other[i];
            }
        }

        public Other() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Other) && Intrinsics.f(this.f94864b, ((Other) obj2).f94864b);
        }

        public final int hashCode() {
            return this.f94864b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94864b);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(String explanation) {
            super(explanation);
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.f94864b = explanation;
        }

        public /* synthetic */ Other(int i) {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$PoorPerformance;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PoorPerformance extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PoorPerformance f94865b = new PoorPerformance();

        @NotNull
        public static final Parcelable.Creator<PoorPerformance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PoorPerformance.f94865b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PoorPerformance[i];
            }
        }

        private PoorPerformance() {
            super("Poor performance");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$TooExpensive;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TooExpensive extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TooExpensive f94866b = new TooExpensive();

        @NotNull
        public static final Parcelable.Creator<TooExpensive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TooExpensive.f94866b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TooExpensive[i];
            }
        }

        private TooExpensive() {
            super("It's too expensive for me");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice$UnhappyCustomerSupport;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackChoice;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnhappyCustomerSupport extends AccountClosureFeedbackChoice {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UnhappyCustomerSupport f94867b = new UnhappyCustomerSupport();

        @NotNull
        public static final Parcelable.Creator<UnhappyCustomerSupport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnhappyCustomerSupport.f94867b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnhappyCustomerSupport[i];
            }
        }

        private UnhappyCustomerSupport() {
            super("I'm unhappy with customer support");
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

    public AccountClosureFeedbackChoice(String str) {
        this.f94859a = str;
    }
}
