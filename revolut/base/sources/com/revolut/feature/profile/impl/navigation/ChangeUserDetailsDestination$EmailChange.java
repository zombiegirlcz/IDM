package com.revolut.feature.profile.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/navigation/ChangeUserDetailsDestination$EmailChange", "", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ChangeUserDetailsDestination$EmailChange implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ChangeUserDetailsDestination$EmailChange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81350a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeUserDetailsDestination$EmailChange(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangeUserDetailsDestination$EmailChange[i];
        }
    }

    public ChangeUserDetailsDestination$EmailChange(String str) {
        this.f81350a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF81350a() {
        return this.f81350a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ChangeUserDetailsDestination$EmailChange) && Intrinsics.f(this.f81350a, ((ChangeUserDetailsDestination$EmailChange) obj2).f81350a);
    }

    public final int hashCode() {
        String str = this.f81350a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81350a);
    }
}
