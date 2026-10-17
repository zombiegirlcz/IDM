package com.revolut.feature.transactions.api.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDestination;", "Landroid/os/Parcelable;", "Details", "Troubleshooting", "QuickActions", "Deeplink", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Deeplink;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Details;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$QuickActions;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Troubleshooting;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionDestination extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Deeplink;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements TransactionDestination {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f91983a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink((Uri) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(Uri baseUri) {
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.f91983a = baseUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deeplink) && Intrinsics.f(this.f91983a, ((Deeplink) obj2).f91983a);
        }

        public final int hashCode() {
            return this.f91983a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91983a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Details;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination;", "<init>", "()V", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements TransactionDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f91984a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f91984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$QuickActions;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QuickActions implements TransactionDestination {

        @NotNull
        public static final Parcelable.Creator<QuickActions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91985a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuickActions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuickActions[i];
            }
        }

        public QuickActions(String flow) {
            Intrinsics.checkNotNullParameter(flow, "flow");
            this.f91985a = flow;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QuickActions) && Intrinsics.f(this.f91985a, ((QuickActions) obj2).f91985a);
        }

        public final int hashCode() {
            return this.f91985a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91985a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDestination$Troubleshooting;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDestination;", "<init>", "()V", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Troubleshooting implements TransactionDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Troubleshooting f91986a = new Troubleshooting();

        @NotNull
        public static final Parcelable.Creator<Troubleshooting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Troubleshooting.f91986a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Troubleshooting[i];
            }
        }

        private Troubleshooting() {
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
