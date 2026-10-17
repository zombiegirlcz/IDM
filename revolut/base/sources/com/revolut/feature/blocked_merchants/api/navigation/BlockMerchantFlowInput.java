package com.revolut.feature.blocked_merchants.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr2.c;
import kr2.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput;", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "BlockMerchant", "BlockedPaymentsList", "BlockDisallowed", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockDisallowed;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockMerchant;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockedPaymentsList;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlockMerchantFlowInput implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockDisallowed;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockDisallowed extends BlockMerchantFlowInput {

        @NotNull
        public static final Parcelable.Creator<BlockDisallowed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f64211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64212c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockDisallowed(parcel.readString(), (c) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockDisallowed[i];
            }
        }

        public BlockDisallowed(String merchantName, c cVar, boolean z) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f64210a = merchantName;
            this.f64211b = cVar;
            this.f64212c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BlockDisallowed)) {
                return false;
            }
            BlockDisallowed blockDisallowed = (BlockDisallowed) obj2;
            return Intrinsics.f(this.f64210a, blockDisallowed.f64210a) && Intrinsics.f(this.f64211b, blockDisallowed.f64211b) && this.f64212c == blockDisallowed.f64212c;
        }

        public final int hashCode() {
            int iHashCode = this.f64210a.hashCode() * 31;
            c cVar = this.f64211b;
            return Boolean.hashCode(this.f64212c) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64210a);
            dest.writeSerializable(this.f64211b);
            dest.writeInt(this.f64212c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockMerchant;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockMerchant extends BlockMerchantFlowInput {

        @NotNull
        public static final Parcelable.Creator<BlockMerchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64214b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockMerchant((d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockMerchant[i];
            }
        }

        public BlockMerchant(d intent, boolean z) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f64213a = intent;
            this.f64214b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BlockMerchant)) {
                return false;
            }
            BlockMerchant blockMerchant = (BlockMerchant) obj2;
            return Intrinsics.f(this.f64213a, blockMerchant.f64213a) && this.f64214b == blockMerchant.f64214b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64214b) + (this.f64213a.f188642a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64213a);
            dest.writeInt(this.f64214b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput$BlockedPaymentsList;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockedPaymentsList extends BlockMerchantFlowInput {

        @NotNull
        public static final Parcelable.Creator<BlockedPaymentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BlockMerchantsTabConfig f64215a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockedPaymentsList((BlockMerchantsTabConfig) parcel.readParcelable(BlockedPaymentsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockedPaymentsList[i];
            }
        }

        public BlockedPaymentsList(BlockMerchantsTabConfig tabsConfig) {
            Intrinsics.checkNotNullParameter(tabsConfig, "tabsConfig");
            this.f64215a = tabsConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockedPaymentsList) && Intrinsics.f(this.f64215a, ((BlockedPaymentsList) obj2).f64215a);
        }

        public final int hashCode() {
            return this.f64215a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64215a, i);
        }
    }

    private BlockMerchantFlowInput() {
    }
}
