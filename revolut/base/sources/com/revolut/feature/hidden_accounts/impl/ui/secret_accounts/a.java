package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts;

import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.SecretAccountsFlowContract$Step;
import cp5.d;
import k3k.k;
import kb7.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wa7.m;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final za7.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f74678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f74679q;

    public a(za7.b hiddenAccountsDialogProvider, m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.o = hiddenAccountsDialogProvider;
        this.f74678p = hiddenAccountsInteractor;
        k kVar = new k(this, 15);
        this.f74679q = d.a(this, SecretAccountsFlowContract$Step.Authentication.f74672a, f0.f322471a, kVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74679q;
    }
}
