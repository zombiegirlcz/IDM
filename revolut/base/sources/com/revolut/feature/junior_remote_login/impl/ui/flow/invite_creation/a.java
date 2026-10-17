package com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ql8.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final JuniorInviteCreationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77191p;

    public a(JuniorInviteCreationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        JuniorBankingProfile juniorBankingProfile = inputData.f77186a;
        this.f77191p = d.a(this, new JuniorInviteCreationFlowContract$Step.InviteCreation(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b), f0.f322471a, new q5g.f0(this, 28));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77191p;
    }
}
