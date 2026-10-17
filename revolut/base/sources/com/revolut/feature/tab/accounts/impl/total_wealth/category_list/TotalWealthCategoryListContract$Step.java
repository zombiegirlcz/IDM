package com.revolut.feature.tab.accounts.impl.total_wealth.category_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "HiddenAccounts", "Lcom/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$Step$HiddenAccounts;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TotalWealthCategoryListContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$Step$HiddenAccounts;", "Lcom/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HiddenAccounts implements TotalWealthCategoryListContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenAccounts f89593a = new HiddenAccounts();

        @NotNull
        public static final Parcelable.Creator<HiddenAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenAccounts.f89593a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccounts[i];
            }
        }

        private HiddenAccounts() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof HiddenAccounts);
        }

        public final int hashCode() {
            return -1740063679;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
