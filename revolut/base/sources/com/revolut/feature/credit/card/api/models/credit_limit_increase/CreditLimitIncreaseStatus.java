package com.revolut.feature.credit.card.api.models.credit_limit_increase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "Landroid/os/Parcelable;", "Unavailable", "Available", "InProgress", "Waiting", "ActionRequired", "Offer", "Terminated", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$ActionRequired;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Available;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$InProgress;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Offer;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Terminated;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Unavailable;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Waiting;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditLimitIncreaseStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$ActionRequired;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionRequired implements CreditLimitIncreaseStatus {

        @NotNull
        public static final Parcelable.Creator<ActionRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68724a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionRequired(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionRequired[i];
            }
        }

        public ActionRequired(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68724a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActionRequired) && Intrinsics.f(this.f68724a, ((ActionRequired) obj2).f68724a);
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF68730a() {
            return this.f68724a;
        }

        public final int hashCode() {
            return this.f68724a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68724a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Available;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Available implements CreditLimitIncreaseStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Available f68725a = new Available();

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Available.f68725a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        private Available() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription */
        public final String getF68730a() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$InProgress;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InProgress implements CreditLimitIncreaseStatus {

        @NotNull
        public static final Parcelable.Creator<InProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68726a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InProgress(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InProgress[i];
            }
        }

        public InProgress(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68726a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InProgress) && Intrinsics.f(this.f68726a, ((InProgress) obj2).f68726a);
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF68730a() {
            return this.f68726a;
        }

        public final int hashCode() {
            return this.f68726a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68726a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Offer;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Offer implements CreditLimitIncreaseStatus {

        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68727a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Offer(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Offer[i];
            }
        }

        public Offer(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68727a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Offer) && Intrinsics.f(this.f68727a, ((Offer) obj2).f68727a);
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF68730a() {
            return this.f68727a;
        }

        public final int hashCode() {
            return this.f68727a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68727a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Terminated;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terminated implements CreditLimitIncreaseStatus {

        @NotNull
        public static final Parcelable.Creator<Terminated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68728a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terminated(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminated[i];
            }
        }

        public Terminated(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68728a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terminated) && Intrinsics.f(this.f68728a, ((Terminated) obj2).f68728a);
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF68730a() {
            return this.f68728a;
        }

        public final int hashCode() {
            return this.f68728a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68728a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Unavailable;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unavailable implements CreditLimitIncreaseStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unavailable f68729a = new Unavailable();

        @NotNull
        public static final Parcelable.Creator<Unavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unavailable.f68729a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        private Unavailable() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription */
        public final String getF68730a() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus$Waiting;", "Lcom/revolut/feature/credit/card/api/models/credit_limit_increase/CreditLimitIncreaseStatus;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Waiting implements CreditLimitIncreaseStatus {

        @NotNull
        public static final Parcelable.Creator<Waiting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68730a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Waiting(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Waiting[i];
            }
        }

        public Waiting(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68730a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Waiting) && Intrinsics.f(this.f68730a, ((Waiting) obj2).f68730a);
        }

        @Override // com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF68730a() {
            return this.f68730a;
        }

        public final int hashCode() {
            return this.f68730a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68730a);
        }
    }

    /* JADX INFO: renamed from: getDescription */
    String getF68730a();
}
