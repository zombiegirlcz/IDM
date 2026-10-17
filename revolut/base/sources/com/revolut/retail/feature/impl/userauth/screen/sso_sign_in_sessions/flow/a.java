package com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow;

import akl.t;
import com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.RetailSsoSignInSessionsFlowContract$Step;
import cp5.d;
import dxj.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends h implements b {
    public final nkl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f101731p;

    public a(nkl.b revolutSsoFlowsFactory) {
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        this.o = revolutSsoFlowsFactory;
        this.f101731p = d.b(this, RetailSsoSignInSessionsFlowContract$Step.Entry.f101730a, new t(this, 2));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f101731p;
    }
}
