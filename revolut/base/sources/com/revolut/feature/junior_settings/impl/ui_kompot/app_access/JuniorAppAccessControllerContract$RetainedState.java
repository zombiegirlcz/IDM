package com.revolut.feature.junior_settings.impl.ui_kompot.app_access;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAppAccessControllerContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<JuniorAppAccessControllerContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f77283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteLoginInvitation f77284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f77285c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) parcel.readParcelable(JuniorAppAccessControllerContract$RetainedState.class.getClassLoader());
            RemoteLoginInvitation remoteLoginInvitation = (RemoteLoginInvitation) parcel.readParcelable(JuniorAppAccessControllerContract$RetainedState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new JuniorAppAccessControllerContract$RetainedState(juniorBankingProfile, remoteLoginInvitation, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAppAccessControllerContract$RetainedState[i];
        }
    }

    public JuniorAppAccessControllerContract$RetainedState(JuniorBankingProfile juniorBankingProfile, RemoteLoginInvitation remoteLoginInvitation, Boolean bool) {
        this.f77283a = juniorBankingProfile;
        this.f77284b = remoteLoginInvitation;
        this.f77285c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAppAccessControllerContract$RetainedState)) {
            return false;
        }
        JuniorAppAccessControllerContract$RetainedState juniorAppAccessControllerContract$RetainedState = (JuniorAppAccessControllerContract$RetainedState) obj2;
        return Intrinsics.f(this.f77283a, juniorAppAccessControllerContract$RetainedState.f77283a) && Intrinsics.f(this.f77284b, juniorAppAccessControllerContract$RetainedState.f77284b) && Intrinsics.f(this.f77285c, juniorAppAccessControllerContract$RetainedState.f77285c);
    }

    public final int hashCode() {
        JuniorBankingProfile juniorBankingProfile = this.f77283a;
        int iHashCode = (juniorBankingProfile == null ? 0 : juniorBankingProfile.hashCode()) * 31;
        RemoteLoginInvitation remoteLoginInvitation = this.f77284b;
        int iHashCode2 = (iHashCode + (remoteLoginInvitation == null ? 0 : remoteLoginInvitation.hashCode())) * 31;
        Boolean bool = this.f77285c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77283a, i);
        dest.writeParcelable(this.f77284b, i);
        Boolean bool = this.f77285c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
