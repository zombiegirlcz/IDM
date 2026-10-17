package com.revolut.retail.feature.balance.picker.impl.new_picker.dual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeFiAssetPicker", "HiddenAccounts", "ExcludedLockedBalances", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$DeFiAssetPicker;", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$ExcludedLockedBalances;", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$HiddenAccounts;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DualChooserScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$DeFiAssetPicker;", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeFiAssetPicker implements DualChooserScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeFiAssetPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wk5.a f99526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99527b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeFiAssetPicker(parcel.readString(), wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFiAssetPicker[i];
            }
        }

        public DeFiAssetPicker(String selectedAssetExternalId, wk5.a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(selectedAssetExternalId, "selectedAssetExternalId");
            this.f99526a = chain;
            this.f99527b = selectedAssetExternalId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeFiAssetPicker)) {
                return false;
            }
            DeFiAssetPicker deFiAssetPicker = (DeFiAssetPicker) obj2;
            return this.f99526a == deFiAssetPicker.f99526a && Intrinsics.f(this.f99527b, deFiAssetPicker.f99527b);
        }

        public final int hashCode() {
            return this.f99527b.hashCode() + (this.f99526a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99526a.name());
            dest.writeString(this.f99527b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$ExcludedLockedBalances;", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExcludedLockedBalances implements DualChooserScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExcludedLockedBalances f99528a = new ExcludedLockedBalances();

        @NotNull
        public static final Parcelable.Creator<ExcludedLockedBalances> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExcludedLockedBalances.f99528a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExcludedLockedBalances[i];
            }
        }

        private ExcludedLockedBalances() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ExcludedLockedBalances);
        }

        public final int hashCode() {
            return -1493093244;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step$HiddenAccounts;", "Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HiddenAccounts implements DualChooserScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<HiddenAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99529a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HiddenAccounts(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccounts[i];
            }
        }

        public HiddenAccounts(String selectedCountryProfileId) {
            Intrinsics.checkNotNullParameter(selectedCountryProfileId, "selectedCountryProfileId");
            this.f99529a = selectedCountryProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HiddenAccounts) && Intrinsics.f(this.f99529a, ((HiddenAccounts) obj2).f99529a);
        }

        public final int hashCode() {
            return this.f99529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99529a);
        }
    }
}
