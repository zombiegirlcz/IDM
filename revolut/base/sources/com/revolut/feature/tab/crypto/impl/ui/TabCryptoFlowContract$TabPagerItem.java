package com.revolut.feature.tab.crypto.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$TabPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabCryptoFlowContract$TabPagerItem implements FixedIdPagerItem {

    @NotNull
    public static final Parcelable.Creator<TabCryptoFlowContract$TabPagerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89793a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TabCryptoFlowContract$TabPagerItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabCryptoFlowContract$TabPagerItem[i];
        }
    }

    public TabCryptoFlowContract$TabPagerItem(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f89793a = id10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TabCryptoFlowContract$TabPagerItem) && Intrinsics.f(this.f89793a, ((TabCryptoFlowContract$TabPagerItem) obj2).f89793a);
    }

    @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF89793a() {
        return this.f89793a;
    }

    public final int hashCode() {
        return this.f89793a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89793a);
    }
}
