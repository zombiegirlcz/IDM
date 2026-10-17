package do8;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        i currentState = (i) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new JuniorAppAccessControllerContract$RetainedState((JuniorBankingProfile) currentState.f116451a.getContent(), (RemoteLoginInvitation) currentState.f116452b.getContent(), (Boolean) currentState.f116453c.getContent());
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        i initialState = (i) obj2;
        JuniorAppAccessControllerContract$RetainedState retainedState = (JuniorAppAccessControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        JuniorBankingProfile juniorBankingProfile = retainedState.f77283a;
        Data profile = juniorBankingProfile != null ? new Data(juniorBankingProfile, null, false, 6, null) : initialState.f116451a;
        RemoteLoginInvitation remoteLoginInvitation = retainedState.f77284b;
        Data remoteLoginInvitation2 = remoteLoginInvitation != null ? new Data(remoteLoginInvitation, null, false, 6, null) : initialState.f116452b;
        Boolean bool = retainedState.f77285c;
        Data activeDevicePresent = bool != null ? new Data(bool, null, false, 6, null) : initialState.f116453c;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(remoteLoginInvitation2, "remoteLoginInvitation");
        Intrinsics.checkNotNullParameter(activeDevicePresent, "activeDevicePresent");
        return new i(profile, remoteLoginInvitation2, activeDevicePresent);
    }
}
