package com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number;

import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlowContract$Step;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements ol8.b {
    public final JuniorCreatePhoneNumberDestination.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f77182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f77183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tl8.a f77184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f77185s;

    public b(JuniorCreatePhoneNumberDestination.InputData inputData, zq.a juniorRemoteLoginInteractor, z80.b phoneToolsProvider, tl8.a invitationSuccessPromptProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(invitationSuccessPromptProvider, "invitationSuccessPromptProvider");
        this.o = inputData;
        this.f77182p = juniorRemoteLoginInteractor;
        this.f77183q = phoneToolsProvider;
        this.f77184r = invitationSuccessPromptProvider;
        this.f77185s = d.a(this, new JuniorCreatePhoneNumberFlowContract$Step.AddPhoneNumber(inputData.f77227a), f0.f322471a, new c(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77185s;
    }
}
