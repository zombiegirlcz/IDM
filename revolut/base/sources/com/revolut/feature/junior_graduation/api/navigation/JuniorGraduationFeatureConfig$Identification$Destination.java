package com.revolut.feature.junior_graduation.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_graduation/api/navigation/JuniorGraduationFeatureConfig$Identification$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_graduation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorGraduationFeatureConfig$Identification$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorGraduationFeatureConfig$Identification$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76916c;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorGraduationFeatureConfig$Identification$Destination(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorGraduationFeatureConfig$Identification$Destination[i];
        }
    }

    public JuniorGraduationFeatureConfig$Identification$Destination(String juniorFirstName, String phoneNumber, boolean z) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f76914a = juniorFirstName;
        this.f76915b = phoneNumber;
        this.f76916c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorGraduationFeatureConfig$Identification$Destination)) {
            return false;
        }
        JuniorGraduationFeatureConfig$Identification$Destination juniorGraduationFeatureConfig$Identification$Destination = (JuniorGraduationFeatureConfig$Identification$Destination) obj2;
        return Intrinsics.f(this.f76914a, juniorGraduationFeatureConfig$Identification$Destination.f76914a) && Intrinsics.f(this.f76915b, juniorGraduationFeatureConfig$Identification$Destination.f76915b) && this.f76916c == juniorGraduationFeatureConfig$Identification$Destination.f76916c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76916c) + p.a.c(this.f76914a.hashCode() * 31, 31, this.f76915b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76914a);
        dest.writeString(this.f76915b);
        dest.writeInt(this.f76916c ? 1 : 0);
    }
}
