package com.revolut.feature.shared_separate_favourites.converter.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/converter/ui/screen/SharedConverterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedConverterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedConverterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedConverterDestination.Configuration.Action f86858b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(SharedConverterScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new SharedConverterScreenContract$InputData(linkedHashSet, (SharedConverterDestination.Configuration.Action) parcel.readParcelable(SharedConverterScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedConverterScreenContract$InputData[i];
        }
    }

    public SharedConverterScreenContract$InputData(Set convertibleAssets, SharedConverterDestination.Configuration.Action action) {
        Intrinsics.checkNotNullParameter(convertibleAssets, "convertibleAssets");
        this.f86857a = convertibleAssets;
        this.f86858b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedConverterScreenContract$InputData)) {
            return false;
        }
        SharedConverterScreenContract$InputData sharedConverterScreenContract$InputData = (SharedConverterScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86857a, sharedConverterScreenContract$InputData.f86857a) && Intrinsics.f(this.f86858b, sharedConverterScreenContract$InputData.f86858b);
    }

    public final int hashCode() {
        int iHashCode = this.f86857a.hashCode() * 31;
        SharedConverterDestination.Configuration.Action action = this.f86858b;
        return iHashCode + (action == null ? 0 : action.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86857a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f86858b, i);
    }
}
