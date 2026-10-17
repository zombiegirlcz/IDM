package com.revolut.feature.tab.accounts.impl.total_wealth.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/total_wealth/models/TotalWealthCategoryViewInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalWealthCategoryViewInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotalWealthCategoryViewInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f89606b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TotalWealthCategoryViewInfo.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TotalWealthCategoryViewInfo(arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalWealthCategoryViewInfo[i];
        }
    }

    public TotalWealthCategoryViewInfo(List spaces, Set hiddenAccountIds) {
        Intrinsics.checkNotNullParameter(spaces, "spaces");
        Intrinsics.checkNotNullParameter(hiddenAccountIds, "hiddenAccountIds");
        this.f89605a = spaces;
        this.f89606b = hiddenAccountIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalWealthCategoryViewInfo)) {
            return false;
        }
        TotalWealthCategoryViewInfo totalWealthCategoryViewInfo = (TotalWealthCategoryViewInfo) obj2;
        return Intrinsics.f(this.f89605a, totalWealthCategoryViewInfo.f89605a) && Intrinsics.f(this.f89606b, totalWealthCategoryViewInfo.f89606b);
    }

    public final int hashCode() {
        return this.f89606b.hashCode() + (this.f89605a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f89605a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f89606b, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
