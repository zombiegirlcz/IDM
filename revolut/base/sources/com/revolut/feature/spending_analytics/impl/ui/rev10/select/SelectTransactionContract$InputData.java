package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectTransactionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectTransactionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategorisationFilter f87882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f87883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectTransactionContract$SelectionMode f87884c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CategorisationFilter categorisationFilter = (CategorisationFilter) j6.a.f(parcel, "parcel", SelectTransactionContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SelectTransactionContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new SelectTransactionContract$InputData(categorisationFilter, arrayList, (SelectTransactionContract$SelectionMode) parcel.readParcelable(SelectTransactionContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(SelectTransactionContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(SelectTransactionContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(SelectTransactionContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectTransactionContract$InputData[i];
        }
    }

    public SelectTransactionContract$InputData(CategorisationFilter categorisationFilter, List analyticsAccounts, SelectTransactionContract$SelectionMode selectionMode, Clause title, Clause clause, Clause searchHint) {
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        this.f87882a = categorisationFilter;
        this.f87883b = analyticsAccounts;
        this.f87884c = selectionMode;
        this.d = title;
        this.e = clause;
        this.f = searchHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectTransactionContract$InputData)) {
            return false;
        }
        SelectTransactionContract$InputData selectTransactionContract$InputData = (SelectTransactionContract$InputData) obj2;
        return Intrinsics.f(this.f87882a, selectTransactionContract$InputData.f87882a) && Intrinsics.f(this.f87883b, selectTransactionContract$InputData.f87883b) && Intrinsics.f(this.f87884c, selectTransactionContract$InputData.f87884c) && Intrinsics.f(this.d, selectTransactionContract$InputData.d) && Intrinsics.f(this.e, selectTransactionContract$InputData.e) && Intrinsics.f(this.f, selectTransactionContract$InputData.f);
    }

    public final int hashCode() {
        int iA = p.a.a((this.f87884c.hashCode() + p.a.d(this.f87882a.hashCode() * 31, 31, this.f87883b)) * 31, 31, this.d);
        Clause clause = this.e;
        return this.f.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87882a, i);
        Iterator itV = p.a.v(this.f87883b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f87884c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ SelectTransactionContract$InputData(CategorisationFilter categorisationFilter, List list, SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i) {
        this(categorisationFilter, list, selectTransactionContract$SelectionMode, (i & 8) != 0 ? new TextLocalisedClause(R$string.analytics_select_transaction_title, null, null, 14) : textLocalisedClause, (i & 16) != 0 ? null : textLocalisedClause2, new TextLocalisedClause(R$string.analytics_select_transaction_search, null, null, 14));
    }
}
