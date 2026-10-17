package com.revolut.feature.apm.core.code.ui;

import a82.s;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$CodeDescriptor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import skm.a2;
import yji.l;
import z80.b;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements jx1.h {
    public final ApmCodeControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hx1.a f61837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n60.a f61838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f61839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f61840s;

    public a(ApmCodeControllerContract$InputData inputData, hx1.a interactor, n60.a keyboardExtension, b phoneToolsProvider, n stateMapper) {
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f61837p = interactor;
        this.f61838q = keyboardExtension;
        ApmCodeControllerContract$CodeDescriptor apmCodeControllerContract$CodeDescriptor = inputData.f61835b;
        if (apmCodeControllerContract$CodeDescriptor instanceof ApmCodeControllerContract$CodeDescriptor.Phone) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_otp_subtitle, u.c(b.b(phoneToolsProvider, ((ApmCodeControllerContract$CodeDescriptor.Phone) apmCodeControllerContract$CodeDescriptor).f61832a, null, null, 6)), null, 12);
        } else if (apmCodeControllerContract$CodeDescriptor instanceof ApmCodeControllerContract$CodeDescriptor.Email) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_otp_subtitle, u.c(((ApmCodeControllerContract$CodeDescriptor.Email) apmCodeControllerContract$CodeDescriptor).f61831a), null, 12);
        } else {
            if (!(apmCodeControllerContract$CodeDescriptor instanceof ApmCodeControllerContract$CodeDescriptor.Text)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = ((ApmCodeControllerContract$CodeDescriptor.Text) apmCodeControllerContract$CodeDescriptor).f61833a;
        }
        Clause clause = textLocalisedClause;
        m70.a.c(t0.f186434a);
        this.f61840s = d.b(this, new jx1.d(clause, "", 0L, inputData.f), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        if (this.o.e) {
            this.f61839r = l.a1(this, ta6.a.H(120000L, 1000L, TimeUnit.MILLISECONDS), null, null, new s(this, (Continuation) null, 5), 3);
        }
    }

    @Override // yji.l
    public final void K1() {
        a2 a2Var = this.f61839r;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f61840s;
    }
}
