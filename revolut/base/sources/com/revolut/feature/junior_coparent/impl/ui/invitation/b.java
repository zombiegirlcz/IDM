package com.revolut.feature.junior_coparent.impl.ui.invitation;

import a5h.g;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlowContract$Step;
import cp5.d;
import ee8.e;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import oki.h;
import r10.v;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements le8.b {
    public final CoparentInvitationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f76890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f76891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f76892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f76893s;

    public b(CoparentInvitationFlowContract$InputData inputData, g coparentInvitationInteractor, e coparentConfirmationDialogProvider, v coparentInvitationSharingIntentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coparentInvitationInteractor, "coparentInvitationInteractor");
        Intrinsics.checkNotNullParameter(coparentConfirmationDialogProvider, "coparentConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(coparentInvitationSharingIntentProvider, "coparentInvitationSharingIntentProvider");
        this.o = inputData;
        this.f76890p = coparentInvitationInteractor;
        this.f76891q = coparentConfirmationDialogProvider;
        this.f76892r = coparentInvitationSharingIntentProvider;
        c cVar = new c(this, 2);
        this.f76893s = d.a(this, CoparentInvitationFlowContract$Step.ContactChooser.f76886a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76893s;
    }
}
