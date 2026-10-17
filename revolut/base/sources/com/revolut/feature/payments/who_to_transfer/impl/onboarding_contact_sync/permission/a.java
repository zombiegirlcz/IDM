package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission;

import cli.g;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yz4.b;
import z3a.e;
import z3a.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements i {
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cl3.a f80115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f80116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f80117r;

    public a(y80.a permissionProvider, cl3.a contactsInteractor, OnboardingContactSyncPermissionScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = permissionProvider;
        this.f80115p = contactsInteractor;
        this.f80116q = d.b(this, new e(inputData.f80113a), stateMapper, null, false, 12);
        this.f80117r = hx7.e.a(this, new b(this, 11));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f80117r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f80116q;
    }
}
