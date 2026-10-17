package com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/new_collection/NewCollectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SaveScreener", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/new_collection/NewCollectionScreenContract$ModalStep$SaveScreener;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NewCollectionScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/new_collection/NewCollectionScreenContract$ModalStep$SaveScreener;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/new_collection/NewCollectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaveScreener implements NewCollectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SaveScreener> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f96252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScreenerSortingOptions f96254c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SaveScreener.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(z.valueOf(parcel.readString()));
                }
                return new SaveScreener(arrayList, arrayList2, (ScreenerSortingOptions) parcel.readParcelable(SaveScreener.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaveScreener[i];
            }
        }

        public SaveScreener(List filters, List instrumentTypes, ScreenerSortingOptions screenerSortingOptions) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
            this.f96252a = filters;
            this.f96253b = instrumentTypes;
            this.f96254c = screenerSortingOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SaveScreener)) {
                return false;
            }
            SaveScreener saveScreener = (SaveScreener) obj2;
            return Intrinsics.f(this.f96252a, saveScreener.f96252a) && Intrinsics.f(this.f96253b, saveScreener.f96253b) && Intrinsics.f(this.f96254c, saveScreener.f96254c);
        }

        public final int hashCode() {
            int iD = p.a.d(this.f96252a.hashCode() * 31, 31, this.f96253b);
            ScreenerSortingOptions screenerSortingOptions = this.f96254c;
            return iD + (screenerSortingOptions == null ? 0 : screenerSortingOptions.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f96252a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f96253b, dest);
            while (itV2.hasNext()) {
                dest.writeString(((z) itV2.next()).name());
            }
            dest.writeParcelable(this.f96254c, i);
        }
    }
}
