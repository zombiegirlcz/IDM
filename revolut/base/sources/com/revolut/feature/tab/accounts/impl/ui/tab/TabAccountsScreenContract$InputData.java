package com.revolut.feature.tab.accounts.impl.ui.tab;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabAccountsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TabAccountsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f89676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabAccountsInitialPayload f89677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TabAccountsMode f89678c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TabAccountsScreenContract$InputData((ProductAccountDescriptor$Value) parcel.readParcelable(TabAccountsScreenContract$InputData.class.getClassLoader()), (TabAccountsInitialPayload) parcel.readParcelable(TabAccountsScreenContract$InputData.class.getClassLoader()), (TabAccountsMode) parcel.readParcelable(TabAccountsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabAccountsScreenContract$InputData[i];
        }
    }

    public TabAccountsScreenContract$InputData(ProductAccountDescriptor$Value productAccountDescriptor$Value, TabAccountsInitialPayload tabAccountsInitialPayload, TabAccountsMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f89676a = productAccountDescriptor$Value;
        this.f89677b = tabAccountsInitialPayload;
        this.f89678c = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabAccountsScreenContract$InputData)) {
            return false;
        }
        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = (TabAccountsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89676a, tabAccountsScreenContract$InputData.f89676a) && Intrinsics.f(this.f89677b, tabAccountsScreenContract$InputData.f89677b) && Intrinsics.f(this.f89678c, tabAccountsScreenContract$InputData.f89678c);
    }

    public final int hashCode() {
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f89676a;
        int iHashCode = (productAccountDescriptor$Value == null ? 0 : productAccountDescriptor$Value.hashCode()) * 31;
        TabAccountsInitialPayload tabAccountsInitialPayload = this.f89677b;
        return this.f89678c.hashCode() + ((iHashCode + (tabAccountsInitialPayload != null ? tabAccountsInitialPayload.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89676a, i);
        dest.writeParcelable(this.f89677b, i);
        dest.writeParcelable(this.f89678c, i);
    }
}
