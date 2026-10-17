package com.revolut.feature.wealth.impl.ui.flows.add_money.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "CreateDeposit", "UpdateRecurringDeposit", "Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input$CreateDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input$UpdateRecurringDeposit;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CompositeAddMoneyFlowContract$Input extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input$CreateDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateDeposit implements CompositeAddMoneyFlowContract$Input {

        @NotNull
        public static final Parcelable.Creator<CreateDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferSubjectId f95540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthAccountType f95541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0h.a f95542c;
        public final long d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateDeposit((TransferSubjectId) parcel.readParcelable(CreateDeposit.class.getClassLoader()), (WealthAccountType) parcel.readParcelable(CreateDeposit.class.getClassLoader()), j0h.a.valueOf(parcel.readString()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateDeposit[i];
            }
        }

        public CreateDeposit(TransferSubjectId transferSubjectId, WealthAccountType product, j0h.a mode, long j2) {
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f95540a = transferSubjectId;
            this.f95541b = product;
            this.f95542c = mode;
            this.d = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateDeposit)) {
                return false;
            }
            CreateDeposit createDeposit = (CreateDeposit) obj2;
            return Intrinsics.f(this.f95540a, createDeposit.f95540a) && this.f95541b == createDeposit.f95541b && this.f95542c == createDeposit.f95542c && this.d == createDeposit.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.f95542c.hashCode() + b.e(this.f95541b, this.f95540a.hashCode() * 31, 31)) * 31);
        }

        @Override // com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input
        /* JADX INFO: renamed from: i2, reason: from getter */
        public final TransferSubjectId getF95540a() {
            return this.f95540a;
        }

        @Override // com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input
        /* JADX INFO: renamed from: l, reason: from getter */
        public final WealthAccountType getF95543a() {
            return this.f95541b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95540a, i);
            dest.writeParcelable(this.f95541b, i);
            dest.writeString(this.f95542c.name());
            dest.writeLong(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input$UpdateRecurringDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateRecurringDeposit implements CompositeAddMoneyFlowContract$Input {

        @NotNull
        public static final Parcelable.Creator<UpdateRecurringDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthAccountType f95543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PortfolioRecurringOrder f95544b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateRecurringDeposit((WealthAccountType) parcel.readParcelable(UpdateRecurringDeposit.class.getClassLoader()), (PortfolioRecurringOrder) parcel.readParcelable(UpdateRecurringDeposit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateRecurringDeposit[i];
            }
        }

        public UpdateRecurringDeposit(WealthAccountType product, PortfolioRecurringOrder recurringOrder) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
            this.f95543a = product;
            this.f95544b = recurringOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdateRecurringDeposit)) {
                return false;
            }
            UpdateRecurringDeposit updateRecurringDeposit = (UpdateRecurringDeposit) obj2;
            return this.f95543a == updateRecurringDeposit.f95543a && Intrinsics.f(this.f95544b, updateRecurringDeposit.f95544b);
        }

        public final int hashCode() {
            return this.f95544b.hashCode() + (this.f95543a.hashCode() * 31);
        }

        @Override // com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input
        /* JADX INFO: renamed from: i2 */
        public final TransferSubjectId getF95540a() {
            return new TransferSubjectId.Portfolio(this.f95544b.f104650b);
        }

        @Override // com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input
        /* JADX INFO: renamed from: l, reason: from getter */
        public final WealthAccountType getF95543a() {
            return this.f95543a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95543a, i);
            dest.writeParcelable(this.f95544b, i);
        }
    }

    /* JADX INFO: renamed from: i2 */
    TransferSubjectId getF95540a();

    /* JADX INFO: renamed from: l */
    WealthAccountType getF95543a();
}
