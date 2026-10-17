package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr2.c;
import kr2.d;
import kr2.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BlockMerchant", "BlockedPaymentsList", "BlockedMerchantDetails", "SelectPaymentToBlock", "BlockDisallowed", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockDisallowed;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockMerchant;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockedMerchantDetails;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockedPaymentsList;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$SelectPaymentToBlock;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlockMerchantFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockDisallowed;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockDisallowed extends BlockMerchantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockDisallowed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f64224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64225c;

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
            this.f64223a = merchantName;
            this.f64224b = cVar;
            this.f64225c = z;
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
            return Intrinsics.f(this.f64223a, blockDisallowed.f64223a) && Intrinsics.f(this.f64224b, blockDisallowed.f64224b) && this.f64225c == blockDisallowed.f64225c;
        }

        public final int hashCode() {
            int iHashCode = this.f64223a.hashCode() * 31;
            c cVar = this.f64224b;
            return Boolean.hashCode(this.f64225c) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64223a);
            dest.writeSerializable(this.f64224b);
            dest.writeInt(this.f64225c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockMerchant;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockMerchant extends BlockMerchantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockMerchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64228c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockMerchant((d) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockMerchant[i];
            }
        }

        public BlockMerchant(d intent, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f64226a = intent;
            this.f64227b = z;
            this.f64228c = z3;
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
            return Intrinsics.f(this.f64226a, blockMerchant.f64226a) && this.f64227b == blockMerchant.f64227b && this.f64228c == blockMerchant.f64228c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64228c) + j6.a.c(this.f64226a.f188642a.hashCode() * 31, 31, this.f64227b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64226a);
            dest.writeInt(this.f64227b ? 1 : 0);
            dest.writeInt(this.f64228c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockedMerchantDetails;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockedMerchantDetails extends BlockMerchantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockedMerchantDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f64229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContentUser f64230b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockedMerchantDetails((ContentUser) parcel.readParcelable(BlockedMerchantDetails.class.getClassLoader()), (e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockedMerchantDetails[i];
            }
        }

        public BlockedMerchantDetails(ContentUser contentUser, e blockedMerchant) {
            Intrinsics.checkNotNullParameter(blockedMerchant, "blockedMerchant");
            Intrinsics.checkNotNullParameter(contentUser, "contentUser");
            this.f64229a = blockedMerchant;
            this.f64230b = contentUser;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BlockedMerchantDetails)) {
                return false;
            }
            BlockedMerchantDetails blockedMerchantDetails = (BlockedMerchantDetails) obj2;
            return Intrinsics.f(this.f64229a, blockedMerchantDetails.f64229a) && Intrinsics.f(this.f64230b, blockedMerchantDetails.f64230b);
        }

        public final int hashCode() {
            return this.f64230b.hashCode() + (this.f64229a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64229a);
            dest.writeParcelable(this.f64230b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$BlockedPaymentsList;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockedPaymentsList extends BlockMerchantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockedPaymentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BlockMerchantsTabConfig f64231a;

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
            this.f64231a = tabsConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockedPaymentsList) && Intrinsics.f(this.f64231a, ((BlockedPaymentsList) obj2).f64231a);
        }

        public final int hashCode() {
            return this.f64231a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64231a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step$SelectPaymentToBlock;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPaymentToBlock extends BlockMerchantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectPaymentToBlock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectPaymentToBlockScreenContract$ScreenType f64232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContentUser f64233b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPaymentToBlock((ContentUser) parcel.readParcelable(SelectPaymentToBlock.class.getClassLoader()), (SelectPaymentToBlockScreenContract$ScreenType) parcel.readParcelable(SelectPaymentToBlock.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentToBlock[i];
            }
        }

        public SelectPaymentToBlock(ContentUser contentUser, SelectPaymentToBlockScreenContract$ScreenType screenType) {
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(contentUser, "contentUser");
            this.f64232a = screenType;
            this.f64233b = contentUser;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectPaymentToBlock)) {
                return false;
            }
            SelectPaymentToBlock selectPaymentToBlock = (SelectPaymentToBlock) obj2;
            return Intrinsics.f(this.f64232a, selectPaymentToBlock.f64232a) && Intrinsics.f(this.f64233b, selectPaymentToBlock.f64233b);
        }

        public final int hashCode() {
            return this.f64233b.hashCode() + (this.f64232a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64232a, i);
            dest.writeParcelable(this.f64233b, i);
        }
    }

    private BlockMerchantFlowContract$Step() {
    }
}
