package com.revolut.feature.tab.accounts.impl.total_wealth.category_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import khe.c;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$State", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "SubspaceKey", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalWealthCategoryListContract$State implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<TotalWealthCategoryListContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f89588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f89589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f89590c;
    public final Data d;
    public final Set e;
    public final c f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListContract$State$SubspaceKey;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubspaceKey implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SubspaceKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSpaceIdentifier f89591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89592b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubspaceKey((ProductSpaceIdentifier) parcel.readParcelable(SubspaceKey.class.getClassLoader()), v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubspaceKey[i];
            }
        }

        public SubspaceKey(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier) {
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            this.f89591a = spaceIdentifier;
            this.f89592b = subSpaceIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubspaceKey)) {
                return false;
            }
            SubspaceKey subspaceKey = (SubspaceKey) obj2;
            return Intrinsics.f(this.f89591a, subspaceKey.f89591a) && this.f89592b == subspaceKey.f89592b;
        }

        public final int hashCode() {
            return this.f89592b.hashCode() + (this.f89591a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89591a, i);
            dest.writeString(this.f89592b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TotalWealthCategoryKey totalWealthCategoryKey = (TotalWealthCategoryKey) j6.a.f(parcel, "parcel", TotalWealthCategoryListContract$State.class);
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(SubspaceKey.CREATOR.createFromParcel(parcel));
            }
            return new TotalWealthCategoryListContract$State(totalWealthCategoryKey, linkedHashSet, 46);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalWealthCategoryListContract$State[i];
        }
    }

    public TotalWealthCategoryListContract$State(TotalWealthCategoryKey categoryKey, Data categoryViewInfo, List hiddenAccountsItems, Data legalEntityContext, Set collapsedSubspaces, c cVar) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(categoryViewInfo, "categoryViewInfo");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(collapsedSubspaces, "collapsedSubspaces");
        this.f89588a = categoryKey;
        this.f89589b = categoryViewInfo;
        this.f89590c = hiddenAccountsItems;
        this.d = legalEntityContext;
        this.e = collapsedSubspaces;
        this.f = cVar;
    }

    public static TotalWealthCategoryListContract$State a(TotalWealthCategoryListContract$State totalWealthCategoryListContract$State, Data data, List hiddenAccountsItems, Data legalEntityContext, LinkedHashSet linkedHashSet, c cVar, int i) {
        Data categoryViewInfo = data;
        TotalWealthCategoryKey categoryKey = totalWealthCategoryListContract$State.f89588a;
        if ((i & 2) != 0) {
            categoryViewInfo = totalWealthCategoryListContract$State.f89589b;
        }
        if ((i & 4) != 0) {
            hiddenAccountsItems = totalWealthCategoryListContract$State.f89590c;
        }
        if ((i & 8) != 0) {
            legalEntityContext = totalWealthCategoryListContract$State.d;
        }
        Set collapsedSubspaces = linkedHashSet;
        if ((i & 16) != 0) {
            collapsedSubspaces = totalWealthCategoryListContract$State.e;
        }
        if ((i & 32) != 0) {
            cVar = totalWealthCategoryListContract$State.f;
        }
        c cVar2 = cVar;
        totalWealthCategoryListContract$State.getClass();
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(categoryViewInfo, "categoryViewInfo");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(collapsedSubspaces, "collapsedSubspaces");
        Set set = collapsedSubspaces;
        Data data2 = legalEntityContext;
        return new TotalWealthCategoryListContract$State(categoryKey, categoryViewInfo, hiddenAccountsItems, data2, set, cVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalWealthCategoryListContract$State)) {
            return false;
        }
        TotalWealthCategoryListContract$State totalWealthCategoryListContract$State = (TotalWealthCategoryListContract$State) obj2;
        return Intrinsics.f(this.f89588a, totalWealthCategoryListContract$State.f89588a) && Intrinsics.f(this.f89589b, totalWealthCategoryListContract$State.f89589b) && Intrinsics.f(this.f89590c, totalWealthCategoryListContract$State.f89590c) && Intrinsics.f(this.d, totalWealthCategoryListContract$State.d) && Intrinsics.f(this.e, totalWealthCategoryListContract$State.e) && Intrinsics.f(this.f, totalWealthCategoryListContract$State.f);
    }

    public final int hashCode() {
        int iF = p.a.f(e.c(this.d, p.a.d(e.c(this.f89589b, this.f89588a.hashCode() * 31, 31), 31, this.f89590c), 31), 31, this.e);
        c cVar = this.f;
        return iF + (cVar == null ? 0 : cVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89588a, i);
        Iterator itV = n.v(this.e, dest);
        while (itV.hasNext()) {
            ((SubspaceKey) itV.next()).writeToParcel(dest, i);
        }
    }

    public TotalWealthCategoryListContract$State(TotalWealthCategoryKey totalWealthCategoryKey, LinkedHashSet linkedHashSet, int i) {
        this(totalWealthCategoryKey, new Data(null, null, true, 3, null), f0.f322471a, new Data(null, null, true, 3, null), (i & 16) != 0 ? h0.f322473a : linkedHashSet, null);
    }
}
