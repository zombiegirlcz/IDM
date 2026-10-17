package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rdh.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$SectionInfoParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDestinationsContract$SectionInfoParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDestinationsContract$SectionInfoParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f87730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f87731b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterDestinationsContract$SectionInfoParcel((Clause) parcel.readParcelable(IncomeSorterDestinationsContract$SectionInfoParcel.class.getClassLoader()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDestinationsContract$SectionInfoParcel[i];
        }
    }

    public IncomeSorterDestinationsContract$SectionInfoParcel(Clause titleClause, b disclaimerScope) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(disclaimerScope, "disclaimerScope");
        this.f87730a = titleClause;
        this.f87731b = disclaimerScope;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterDestinationsContract$SectionInfoParcel)) {
            return false;
        }
        IncomeSorterDestinationsContract$SectionInfoParcel incomeSorterDestinationsContract$SectionInfoParcel = (IncomeSorterDestinationsContract$SectionInfoParcel) obj2;
        return Intrinsics.f(this.f87730a, incomeSorterDestinationsContract$SectionInfoParcel.f87730a) && this.f87731b == incomeSorterDestinationsContract$SectionInfoParcel.f87731b;
    }

    public final int hashCode() {
        return this.f87731b.hashCode() + (this.f87730a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87730a, i);
        dest.writeString(this.f87731b.name());
    }
}
