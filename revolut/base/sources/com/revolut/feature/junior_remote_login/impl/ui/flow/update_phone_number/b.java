package com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number;

import com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.JuniorUpdatePhoneNumberFlowContract$Step;
import com.revolut.feature.junior_remote_login.navigation.JuniorUpdatePhoneNumberDestination;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements rl8.b {
    public final JuniorUpdatePhoneNumberDestination.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f77196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f77197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tl8.a f77198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f77199s;

    public b(JuniorUpdatePhoneNumberDestination.InputData inputData, zq.a juniorRemoteLoginInteractor, z80.b phoneToolsProvider, tl8.a invitationSuccessPromptProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(invitationSuccessPromptProvider, "invitationSuccessPromptProvider");
        this.o = inputData;
        this.f77196p = juniorRemoteLoginInteractor;
        this.f77197q = phoneToolsProvider;
        this.f77198r = invitationSuccessPromptProvider;
        this.f77199s = d.a(this, new JuniorUpdatePhoneNumberFlowContract$Step.AddPhoneNumber(inputData.f77230a), f0.f322471a, new rl8.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77199s;
    }
}
