package com.revolut.sso.impl.ui.consent.common.select_identity;

import cli.g;
import cli.y;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState;
import dml.i;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import oki.h;
import skm.a2;
import vkm.j2;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements i {
    public a2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f106462p;

    public a(SelectIdentityScreenContract$InputData inputData, e dateProvider, b stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ConsentChallenge.Qr.Delegated delegated = inputData.f106461a;
        ArrayList arrayList = delegated.f105916h.f105920a;
        this.f106462p = d.b(this, new SelectIdentityScreenContract$DomainState(delegated, arrayList.size() == 1 ? new SelectIdentityScreenContract$DomainState.SelectionState.Selected((ConsentChallenge.Qr.Delegated.Selection.Identity) d0.b0(arrayList), arrayList) : new SelectIdentityScreenContract$DomainState.SelectionState.NotSelected(arrayList), delegated.f105913b - System.currentTimeMillis()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        a2 a2Var = this.o;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.o = l.a1(this, ta6.a.J(((SelectIdentityScreenContract$DomainState) ((j2) this.f106462p.f22677a).getValue()).f106457c, TimeUnit.MILLISECONDS), null, null, new dml.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f106462p;
    }
}
