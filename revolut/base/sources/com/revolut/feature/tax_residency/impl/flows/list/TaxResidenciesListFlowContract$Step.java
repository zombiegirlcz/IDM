package com.revolut.feature.tax_residency.impl.flows.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TaxResidenciesList", "Lcom/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$Step$TaxResidenciesList;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxResidenciesListFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$Step$TaxResidenciesList;", "Lcom/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidenciesList implements TaxResidenciesListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxResidenciesList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f90032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f90033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f90034c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int iC = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iC2 = 0;
                    while (iC2 != i) {
                        iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                    }
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new TaxResidenciesList(arrayList, null, arrayList2, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidenciesList[i];
            }
        }

        public TaxResidenciesList(List list, List list2, List skippableCountries, wi0.b bVar) {
            Intrinsics.checkNotNullParameter(skippableCountries, "skippableCountries");
            this.f90032a = bVar;
            this.f90033b = list;
            this.f90034c = list2;
            this.d = skippableCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidenciesList)) {
                return false;
            }
            TaxResidenciesList taxResidenciesList = (TaxResidenciesList) obj2;
            return Intrinsics.f(this.f90032a, taxResidenciesList.f90032a) && Intrinsics.f(this.f90033b, taxResidenciesList.f90033b) && Intrinsics.f(this.f90034c, taxResidenciesList.f90034c) && Intrinsics.f(this.d, taxResidenciesList.d);
        }

        public final int hashCode() {
            wi0.b bVar = this.f90032a;
            int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
            List list = this.f90033b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.f90034c;
            return this.d.hashCode() + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90032a);
            List list = this.f90033b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }
}
