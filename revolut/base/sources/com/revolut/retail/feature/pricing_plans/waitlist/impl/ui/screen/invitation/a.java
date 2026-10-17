package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation;

import au0.z5;
import boh.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hd.r;
import java.util.LinkedHashSet;
import java.util.List;
import kl.b0;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q0;
import w4l.i;
import wli.x;
import wm9.k;
import wok.e;
import wok.o;
import x4l.c;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements wok.h {
    public final t1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f103703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WaitlistInvitationScreenContract$InputData f103704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f103705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f103706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f103707t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(o stateMapper, t1 interactor, b0 waitlistErrorParser, WaitlistInvitationScreenContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(waitlistErrorParser, "waitlistErrorParser");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = interactor;
        this.f103703p = waitlistErrorParser;
        this.f103704q = inputData;
        this.f103705r = deeplinkHandler;
        this.f103706s = new LinkedHashSet();
        this.f103707t = d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new k(8));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void P1() {
        H2(this.f103707t, new wnc.x(19));
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.f103706s.clear();
        WaitlistInvitationScreenContract$InputData waitlistInvitationScreenContract$InputData = this.f103704q;
        String str = waitlistInvitationScreenContract$InputData.f103698a;
        List list = waitlistInvitationScreenContract$InputData.f103700c;
        String str2 = waitlistInvitationScreenContract$InputData.f103699b;
        r rVar = (r) this.o.f185240b;
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = ((c) rVar.e).b(new ook.c(str, list, str2), loadingStrategy);
        Continuation continuation = null;
        l.b1(this, f.e(new q0(dVarB, new z5(this, continuation, 2), 1), new wk2.x(this, 21)), null, new wka.e(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f103707t;
    }
}
