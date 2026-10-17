package com.revolut.feature.transaction_list.impl.ui.list.screen.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.unified_transactions.api.navigation.UnifiedPagerInput;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DetailsPager", "Lcom/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreenContract$ModalStep$DetailsPager;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreenContract$ModalStep$DetailsPager;", "Lcom/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailsPager implements TransactionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DetailsPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedPagerInput f91932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91933b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailsPager((UnifiedPagerInput) parcel.readParcelable(DetailsPager.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsPager[i];
            }
        }

        public DetailsPager(UnifiedPagerInput input, String searchQuery) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.f91932a = input;
            this.f91933b = searchQuery;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailsPager)) {
                return false;
            }
            DetailsPager detailsPager = (DetailsPager) obj2;
            return Intrinsics.f(this.f91932a, detailsPager.f91932a) && Intrinsics.f(this.f91933b, detailsPager.f91933b);
        }

        public final int hashCode() {
            return this.f91933b.hashCode() + (this.f91932a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91932a, i);
            dest.writeString(this.f91933b);
        }
    }
}
