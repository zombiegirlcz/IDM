package com.revolut.feature.junior_allowance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAllowanceDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorAllowanceDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorAllowanceLaunchMode f76815c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAllowanceDestination(parcel.readString(), parcel.readString(), (JuniorAllowanceLaunchMode) parcel.readParcelable(JuniorAllowanceDestination.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAllowanceDestination[i];
        }
    }

    public JuniorAllowanceDestination(String juniorId, String str, JuniorAllowanceLaunchMode launchMode, b bVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f76813a = juniorId;
        this.f76814b = str;
        this.f76815c = launchMode;
        this.d = bVar;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final b getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF76814b() {
        return this.f76814b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF76813a() {
        return this.f76813a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JuniorAllowanceLaunchMode getF76815c() {
        return this.f76815c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAllowanceDestination)) {
            return false;
        }
        JuniorAllowanceDestination juniorAllowanceDestination = (JuniorAllowanceDestination) obj2;
        return Intrinsics.f(this.f76813a, juniorAllowanceDestination.f76813a) && Intrinsics.f(this.f76814b, juniorAllowanceDestination.f76814b) && Intrinsics.f(this.f76815c, juniorAllowanceDestination.f76815c) && Intrinsics.f(this.d, juniorAllowanceDestination.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76813a.hashCode() * 31;
        String str = this.f76814b;
        int iHashCode2 = (this.f76815c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        b bVar = this.d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76813a);
        dest.writeString(this.f76814b);
        dest.writeParcelable(this.f76815c, i);
        dest.writeSerializable(this.d);
    }
}
