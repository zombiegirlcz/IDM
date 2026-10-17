package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts;

import bh6.j;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.LinkedAccountsConsentFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vl6.b;
import vl6.c;
import vl6.d;
import xg6.l;
import xg6.r;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f72799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f72800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zca.b f72801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f72802s;

    public a(j uriDestinationProvider, r linkedAccountConsentInteractor, l linkExternalInstitutionsInteractor, zca.b revokeConfirmationDialogProvider) {
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        Intrinsics.checkNotNullParameter(linkedAccountConsentInteractor, "linkedAccountConsentInteractor");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(revokeConfirmationDialogProvider, "revokeConfirmationDialogProvider");
        this.o = uriDestinationProvider;
        this.f72799p = linkedAccountConsentInteractor;
        this.f72800q = linkExternalInstitutionsInteractor;
        this.f72801r = revokeConfirmationDialogProvider;
        this.f72802s = d8l.d.a(this, new c(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f72802s, LinkedAccountsConsentFlowContract$Step.LinkedAccountsConsentScreen.f72794a, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72802s;
    }
}
