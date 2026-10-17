package com.revolut.feature.tab.accounts.api.total_wealth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/total_wealth/TotalWealthCategoryListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalWealthCategoryListDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TotalWealthCategoryListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f89580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f89581b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalWealthCategoryListDestination((TotalWealthCategoryKey) parcel.readParcelable(TotalWealthCategoryListDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(TotalWealthCategoryListDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalWealthCategoryListDestination[i];
        }
    }

    public TotalWealthCategoryListDestination(TotalWealthCategoryKey categoryKey, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        this.f89580a = categoryKey;
        this.f89581b = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF89581b() {
        return this.f89581b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalWealthCategoryListDestination)) {
            return false;
        }
        TotalWealthCategoryListDestination totalWealthCategoryListDestination = (TotalWealthCategoryListDestination) obj2;
        return Intrinsics.f(this.f89580a, totalWealthCategoryListDestination.f89580a) && Intrinsics.f(this.f89581b, totalWealthCategoryListDestination.f89581b);
    }

    public final int hashCode() {
        int iHashCode = this.f89580a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f89581b;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89580a, i);
        dest.writeParcelable(this.f89581b, i);
    }
}
