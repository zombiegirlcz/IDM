package com.revolut.feature.subscriptions.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount;", "Landroid/os/Parcelable;", "<init>", "()V", "Personal", "Joint", "Junior", "Pro", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Joint;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Junior;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Personal;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Pro;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentAccount implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Joint;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends RecurringPaymentAccount {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89317b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String id10, String walletId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f89316a = id10;
            this.f89317b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Joint)) {
                return false;
            }
            Joint joint = (Joint) obj2;
            return Intrinsics.f(this.f89316a, joint.f89316a) && Intrinsics.f(this.f89317b, joint.f89317b);
        }

        public final int hashCode() {
            return this.f89317b.hashCode() + (this.f89316a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89316a);
            dest.writeString(this.f89317b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Junior;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends RecurringPaymentAccount {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89319b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String juniorId, String walletId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f89318a = juniorId;
            this.f89319b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Junior)) {
                return false;
            }
            Junior junior = (Junior) obj2;
            return Intrinsics.f(this.f89318a, junior.f89318a) && Intrinsics.f(this.f89319b, junior.f89319b);
        }

        public final int hashCode() {
            return this.f89319b.hashCode() + (this.f89318a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89318a);
            dest.writeString(this.f89319b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Personal;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount;", "<init>", "()V", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal extends RecurringPaymentAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f89320a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f89320a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount$Pro;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentAccount;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends RecurringPaymentAccount {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89322b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro(String id10, String walletId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f89321a = id10;
            this.f89322b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pro)) {
                return false;
            }
            Pro pro = (Pro) obj2;
            return Intrinsics.f(this.f89321a, pro.f89321a) && Intrinsics.f(this.f89322b, pro.f89322b);
        }

        public final int hashCode() {
            return this.f89322b.hashCode() + (this.f89321a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89321a);
            dest.writeString(this.f89322b);
        }
    }

    private RecurringPaymentAccount() {
    }
}
