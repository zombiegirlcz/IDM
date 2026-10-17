package com.revolut.feature.shared_separate_favourites.api.alerts.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/AddSharedAlertsConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddSharedAlertsConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddSharedAlertsConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetIdWithSymbol f86762c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AddSharedAlertsConfiguration.class, parcel, arrayList, iE, 1);
            }
            return new AddSharedAlertsConfiguration(arrayList, (b) parcel.readSerializable(), (AssetIdWithSymbol) parcel.readParcelable(AddSharedAlertsConfiguration.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddSharedAlertsConfiguration[i];
        }
    }

    public AddSharedAlertsConfiguration(List assetTypeKeys, b bVar, AssetIdWithSymbol assetIdWithSymbol, boolean z) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f86760a = assetTypeKeys;
        this.f86761b = bVar;
        this.f86762c = assetIdWithSymbol;
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
        if (!(obj2 instanceof AddSharedAlertsConfiguration)) {
            return false;
        }
        AddSharedAlertsConfiguration addSharedAlertsConfiguration = (AddSharedAlertsConfiguration) obj2;
        return Intrinsics.f(this.f86760a, addSharedAlertsConfiguration.f86760a) && Intrinsics.f(this.f86761b, addSharedAlertsConfiguration.f86761b) && Intrinsics.f(this.f86762c, addSharedAlertsConfiguration.f86762c) && this.d == addSharedAlertsConfiguration.d;
    }

    public final int hashCode() {
        int iHashCode = this.f86760a.hashCode() * 31;
        b bVar = this.f86761b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AssetIdWithSymbol assetIdWithSymbol = this.f86762c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (assetIdWithSymbol != null ? assetIdWithSymbol.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f86760a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f86761b);
        dest.writeParcelable(this.f86762c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
