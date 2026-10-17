package com.revolut.feature.junior_remote_login.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/navigation/JuniorInviteCreationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorInviteCreationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorInviteCreationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f77228a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorInviteCreationDestination((JuniorBankingProfile) parcel.readParcelable(JuniorInviteCreationDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorInviteCreationDestination[i];
        }
    }

    public JuniorInviteCreationDestination(JuniorBankingProfile juniorProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f77228a = juniorProfile;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final JuniorBankingProfile getF77228a() {
        return this.f77228a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JuniorInviteCreationDestination) && Intrinsics.f(this.f77228a, ((JuniorInviteCreationDestination) obj2).f77228a);
    }

    public final int hashCode() {
        return this.f77228a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77228a, i);
    }
}
