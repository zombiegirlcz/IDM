package com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/new_screener/NewScreenerScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewScreenerScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NewScreenerScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerSortingOptions f96262c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NewScreenerScreenContract$Input.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(z.valueOf(parcel.readString()));
            }
            return new NewScreenerScreenContract$Input(arrayList, arrayList3, (ScreenerSortingOptions) parcel.readParcelable(NewScreenerScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewScreenerScreenContract$Input[i];
        }
    }

    public NewScreenerScreenContract$Input(List list, List instrumentTypes, ScreenerSortingOptions screenerSortingOptions) {
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        this.f96260a = list;
        this.f96261b = instrumentTypes;
        this.f96262c = screenerSortingOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NewScreenerScreenContract$Input)) {
            return false;
        }
        NewScreenerScreenContract$Input newScreenerScreenContract$Input = (NewScreenerScreenContract$Input) obj2;
        return Intrinsics.f(this.f96260a, newScreenerScreenContract$Input.f96260a) && Intrinsics.f(this.f96261b, newScreenerScreenContract$Input.f96261b) && Intrinsics.f(this.f96262c, newScreenerScreenContract$Input.f96262c);
    }

    public final int hashCode() {
        List list = this.f96260a;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.f96261b);
        ScreenerSortingOptions screenerSortingOptions = this.f96262c;
        return iD + (screenerSortingOptions != null ? screenerSortingOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f96260a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        Iterator itV = p.a.v(this.f96261b, dest);
        while (itV.hasNext()) {
            dest.writeString(((z) itV.next()).name());
        }
        dest.writeParcelable(this.f96262c, i);
    }
}
