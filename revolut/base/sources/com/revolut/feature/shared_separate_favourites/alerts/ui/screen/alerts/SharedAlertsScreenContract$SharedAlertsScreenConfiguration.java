package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mgd.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/screen/alerts/SharedAlertsScreenContract$SharedAlertsScreenConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedAlertsScreenContract$SharedAlertsScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SharedAlertsScreenContract$SharedAlertsScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f86725c;
    public final SharedAlertsConfiguration.Action d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(SharedAlertsScreenContract$SharedAlertsScreenConfiguration.class, parcel, linkedHashSet, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = com.revolut.data.database.models.openbanking.d.e(SharedAlertsScreenContract$SharedAlertsScreenConfiguration.class, parcel, linkedHashSet2, iE2, 1);
            }
            return new SharedAlertsScreenContract$SharedAlertsScreenConfiguration(linkedHashSet, linkedHashSet2, d.valueOf(parcel.readString()), (SharedAlertsConfiguration.Action) parcel.readParcelable(SharedAlertsScreenContract$SharedAlertsScreenConfiguration.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAlertsScreenContract$SharedAlertsScreenConfiguration[i];
        }
    }

    public SharedAlertsScreenContract$SharedAlertsScreenConfiguration(Set initialSelectedAssetTypeKeys, Set allAssetTypeKeys, d initialSelectedAlertState, SharedAlertsConfiguration.Action action, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
        Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
        Intrinsics.checkNotNullParameter(initialSelectedAlertState, "initialSelectedAlertState");
        this.f86723a = initialSelectedAssetTypeKeys;
        this.f86724b = allAssetTypeKeys;
        this.f86725c = initialSelectedAlertState;
        this.d = action;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedAlertsScreenContract$SharedAlertsScreenConfiguration)) {
            return false;
        }
        SharedAlertsScreenContract$SharedAlertsScreenConfiguration sharedAlertsScreenContract$SharedAlertsScreenConfiguration = (SharedAlertsScreenContract$SharedAlertsScreenConfiguration) obj2;
        return Intrinsics.f(this.f86723a, sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86723a) && Intrinsics.f(this.f86724b, sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86724b) && this.f86725c == sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86725c && Intrinsics.f(this.d, sharedAlertsScreenContract$SharedAlertsScreenConfiguration.d) && this.e == sharedAlertsScreenContract$SharedAlertsScreenConfiguration.e && this.f == sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f86725c.hashCode() + p.a.f(this.f86723a.hashCode() * 31, 31, this.f86724b)) * 31;
        SharedAlertsConfiguration.Action action = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86723a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f86724b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeString(this.f86725c.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
