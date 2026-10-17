package com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter;

import android.os.Parcel;
import android.os.Parcelable;
import av5.i;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Filters", "FiltersByType", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step$Filters;", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step$FiltersByType;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionFilterFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step$Filters;", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filters extends TransactionFilterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f71432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71433b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Filters.class, parcel, arrayList, iE, 1);
                }
                return new Filters(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        public Filters(List filters, boolean z) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f71432a = filters;
            this.f71433b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Filters)) {
                return false;
            }
            Filters filters = (Filters) obj2;
            return Intrinsics.f(this.f71432a, filters.f71432a) && this.f71433b == filters.f71433b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71433b) + (this.f71432a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f71432a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f71433b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step$FiltersByType;", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FiltersByType extends TransactionFilterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FiltersByType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f71434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f71435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f71436c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i iVarValueOf = i.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FiltersByType.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = j6.a.e(FiltersByType.class, parcel, arrayList2, iE2, 1);
                }
                return new FiltersByType(iVarValueOf, arrayList, arrayList2, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiltersByType[i];
            }
        }

        public FiltersByType(i type, ArrayList filters, ArrayList allFilters, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(allFilters, "allFilters");
            this.f71434a = type;
            this.f71435b = filters;
            this.f71436c = allFilters;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FiltersByType)) {
                return false;
            }
            FiltersByType filtersByType = (FiltersByType) obj2;
            return this.f71434a == filtersByType.f71434a && this.f71435b.equals(filtersByType.f71435b) && this.f71436c.equals(filtersByType.f71436c) && this.d == filtersByType.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f71436c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f71435b, this.f71434a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71434a.name());
            ArrayList arrayList = this.f71435b;
            dest.writeInt(arrayList.size());
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                dest.writeParcelable((Parcelable) it8.next(), i);
            }
            Iterator itY = j6.a.y(this.f71436c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private TransactionFilterFlowContract$Step() {
    }
}
