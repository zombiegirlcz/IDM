package com.revolut.feature.subaccount.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode", "Landroid/os/Parcelable;", "Default", "FiatOnly", "Specific", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$Default;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$FiatOnly;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$Specific;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreateSubaccountFlowProvider$CurrencySelectionMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$Default;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements CreateSubaccountFlowProvider$CurrencySelectionMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f88975a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f88975a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$FiatOnly;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FiatOnly implements CreateSubaccountFlowProvider$CurrencySelectionMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FiatOnly f88976a = new FiatOnly();

        @NotNull
        public static final Parcelable.Creator<FiatOnly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FiatOnly.f88976a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiatOnly[i];
            }
        }

        private FiatOnly() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode$Specific;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CurrencySelectionMode;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Specific implements CreateSubaccountFlowProvider$CurrencySelectionMode {

        @NotNull
        public static final Parcelable.Creator<Specific> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f88977a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Specific((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Specific[i];
            }
        }

        public Specific(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f88977a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Specific) && Intrinsics.f(this.f88977a, ((Specific) obj2).f88977a);
        }

        public final int hashCode() {
            return this.f88977a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88977a);
        }
    }
}
