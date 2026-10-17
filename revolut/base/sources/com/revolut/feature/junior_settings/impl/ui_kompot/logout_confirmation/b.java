package com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation;

import cli.y;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import kgm.c;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import no8.e;
import no8.f;
import no8.g;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements e {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k18.c f77305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f77306q;

    public b(c juniorDeviceInteractor, k18.c juniorSignInMethodsInteractor, g inputData, a stateMapper) {
        Intrinsics.checkNotNullParameter(juniorDeviceInteractor, "juniorDeviceInteractor");
        Intrinsics.checkNotNullParameter(juniorSignInMethodsInteractor, "juniorSignInMethodsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = juniorDeviceInteractor;
        this.f77305p = juniorSignInMethodsInteractor;
        JuniorBankingProfile juniorBankingProfile = inputData.f217951a;
        String str = juniorBankingProfile.f77103j;
        String str2 = juniorBankingProfile.f77099b;
        String str3 = juniorBankingProfile.f;
        this.f77306q = d.b(this, new f(str, str2, str3 == null ? "" : str3, (str3 == null ? "" : str3).length() == 0 ? LogoutConfirmationControllerContract$PhoneNumberRemovalAction.NotApplicable.f77302a : LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Keep.f77301a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77306q;
    }
}
