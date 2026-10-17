package com.revolut.feature.junior_allowance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowancesListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAllowancesListDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorAllowancesListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f76821b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAllowancesListDestination(parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAllowancesListDestination[i];
        }
    }

    public JuniorAllowancesListDestination(String juniorId, b bVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f76820a = juniorId;
        this.f76821b = bVar;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final b getF76821b() {
        return this.f76821b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF76820a() {
        return this.f76820a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAllowancesListDestination)) {
            return false;
        }
        JuniorAllowancesListDestination juniorAllowancesListDestination = (JuniorAllowancesListDestination) obj2;
        return Intrinsics.f(this.f76820a, juniorAllowancesListDestination.f76820a) && Intrinsics.f(this.f76821b, juniorAllowancesListDestination.f76821b);
    }

    public final int hashCode() {
        int iHashCode = this.f76820a.hashCode() * 31;
        b bVar = this.f76821b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76820a);
        dest.writeSerializable(this.f76821b);
    }
}
