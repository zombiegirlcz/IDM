package com.revolut.feature.hidden_accounts.impl.ui.flow;

import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$Step;
import cp5.d;
import db7.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final HiddenAccountsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final za7.b f74667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f74668q;

    public a(HiddenAccountsFlowContract$InputData inputData, za7.b hiddenAccountsDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        this.o = inputData;
        this.f74667p = hiddenAccountsDialogProvider;
        cwj.h hVar = new cwj.h(this, 19);
        this.f74668q = d.a(this, HiddenAccountsFlowContract$Step.Authentication.f74663a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74668q;
    }
}
