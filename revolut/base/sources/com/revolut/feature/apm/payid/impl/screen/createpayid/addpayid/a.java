package com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ma2.e;
import ma2.i;
import ma2.j;
import ma2.k;
import ma2.l;
import ma2.m;
import ma2.p;
import ma2.r;
import ma2.t;
import ma2.u;
import mra.d;
import nii.c0;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vw1.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements ma2.h {

    @NotNull
    public static final r Companion = new r();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f62721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f62722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f62723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62724s;

    public a(b aliasRepository, wj0.a idempotencyKeyHolder, sf0.h serverErrorParser, n stateMapper) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasRepository;
        this.f62721p = idempotencyKeyHolder;
        this.f62722q = serverErrorParser;
        this.f62723r = d.b(this, new e(new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
        this.f62724s = hx7.e.a(this, new m84.e(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        this.f62721p.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
        l2(new t(this, null), new p(this, 0));
    }

    public final void I2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        wj0.a aVar = this.f62721p;
        if (z) {
            Alias alias = (Alias) ((e) ((j2) this.f62723r.f22677a).getValue()).f203923b.getContent();
            if (alias == null) {
                return;
            }
            aVar.a("IDEMPOTENCY_TAG_REGISTER_ALIAS");
            X1(new y0(null, new c0(null, null, null, false, null, false, false, null, 2047), false, 5));
            l2(new u(alias, this, null), new lrk.h(1, this, a.class, "handleRegisterError", "handleRegisterError(Ljava/lang/Throwable;)Z", 0, 17));
            return;
        }
        if (event instanceof i) {
            h.v2(this.f62724s, AddPayIdScreenContract$ModalStep.ChooseAlias.f62720a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (event instanceof k) {
            aVar.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
            l2(new t(this, null), new p(this, 0));
        } else {
            if (!(event instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62724s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f62723r;
    }
}
