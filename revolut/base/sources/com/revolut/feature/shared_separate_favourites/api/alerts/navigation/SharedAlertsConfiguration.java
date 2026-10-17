package com.revolut.feature.shared_separate_favourites.api.alerts.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mgd.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/SharedAlertsConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedAlertsConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SharedAlertsConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f86770c;
    public final Action d;
    public final boolean e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/SharedAlertsConfiguration$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "CreateAlert", "Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/SharedAlertsConfiguration$Action$CreateAlert;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/SharedAlertsConfiguration$Action$CreateAlert;", "Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/SharedAlertsConfiguration$Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreateAlert extends Action {

            @NotNull
            public static final Parcelable.Creator<CreateAlert> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AssetIdWithSymbol f86771a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreateAlert((AssetIdWithSymbol) parcel.readParcelable(CreateAlert.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreateAlert[i];
                }
            }

            public CreateAlert(AssetIdWithSymbol assetIdWithSymbol) {
                this.f86771a = assetIdWithSymbol;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreateAlert) && Intrinsics.f(this.f86771a, ((CreateAlert) obj2).f86771a);
            }

            public final int hashCode() {
                AssetIdWithSymbol assetIdWithSymbol = this.f86771a;
                if (assetIdWithSymbol == null) {
                    return 0;
                }
                return assetIdWithSymbol.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86771a, i);
            }
        }

        private Action() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(SharedAlertsConfiguration.class, parcel, linkedHashSet2, iE, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = com.revolut.data.database.models.openbanking.d.e(SharedAlertsConfiguration.class, parcel, linkedHashSet, iE2, 1);
                }
            }
            return new SharedAlertsConfiguration(linkedHashSet2, linkedHashSet, d.valueOf(parcel.readString()), (Action) parcel.readParcelable(SharedAlertsConfiguration.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAlertsConfiguration[i];
        }
    }

    public SharedAlertsConfiguration(Set selectedAssetTypes, Set set, d selectedState, Action action, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        this.f86768a = selectedAssetTypes;
        this.f86769b = set;
        this.f86770c = selectedState;
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
        if (!(obj2 instanceof SharedAlertsConfiguration)) {
            return false;
        }
        SharedAlertsConfiguration sharedAlertsConfiguration = (SharedAlertsConfiguration) obj2;
        return Intrinsics.f(this.f86768a, sharedAlertsConfiguration.f86768a) && Intrinsics.f(this.f86769b, sharedAlertsConfiguration.f86769b) && this.f86770c == sharedAlertsConfiguration.f86770c && Intrinsics.f(this.d, sharedAlertsConfiguration.d) && this.e == sharedAlertsConfiguration.e && this.f == sharedAlertsConfiguration.f;
    }

    public final int hashCode() {
        int iHashCode = this.f86768a.hashCode() * 31;
        Set set = this.f86769b;
        int iHashCode2 = (this.f86770c.hashCode() + ((iHashCode + (set == null ? 0 : set.hashCode())) * 31)) * 31;
        Action action = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode2 + (action != null ? action.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86768a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Set set = this.f86769b;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeString(this.f86770c.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ SharedAlertsConfiguration(Set set, Set set2, d dVar, Action.CreateAlert createAlert, boolean z, int i) {
        this(set, (i & 2) != 0 ? null : set2, (i & 4) != 0 ? d.ACTIVE : dVar, (Action) ((i & 8) != 0 ? null : createAlert), (i & 16) != 0 ? false : z, false);
    }
}
