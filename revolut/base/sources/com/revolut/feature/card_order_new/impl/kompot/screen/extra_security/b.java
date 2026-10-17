package com.revolut.feature.card_order_new.impl.kompot.screen.extra_security;

import ce9.m;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import e7l.g;
import e93.d;
import e93.x;
import g7b.q;
import hx7.e;
import ik3.c;
import j33.i;
import j33.m;
import j33.o;
import j33.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import w4l.j;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements j33.h {

    @NotNull
    public static final o Companion = new o();
    public final z43.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f65198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f65199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f65200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65201s;

    public b(n stateMapper, CardExtraSecurityControllerContract$InputData inputData, z43.a cardPersonalisationInteractor, fk3.a configurationInteractor, f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardPersonalisationInteractor, "cardPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.o = cardPersonalisationInteractor;
        this.f65198p = configurationInteractor;
        this.f65199q = revolutCardsInteractor;
        d dVar = inputData.f65194a;
        c93.h.Companion.getClass();
        String str = null;
        Boolean bool = m.r(dVar, c93.h.f22285t) ? Boolean.FALSE : null;
        Data data = new Data(null, null, true, 3, null);
        x xVar = dVar.f123830j;
        if (xVar != null) {
            String str2 = (String) ((n53.b) cardPersonalisationInteractor).f212540a.f222308b.get("SELECTED_CARD_HOLDER_NAME_KEY");
            str = str2 == null ? xVar.d : str2;
        }
        this.f65200r = mra.d.b(this, new i(dVar, null, bool, true, false, data, str), stateMapper, null, false, 12);
        this.f65201s = e.a(this, new j2c.n(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(((c) this.f65198p).l(g.b.f123407a, j.f294644c)), null, null, new iug.j(this, continuation, 16), 3);
        l2(new p(this, continuation, 1), new yi5.b(26));
        l2(new p(this, continuation, 2), new yi5.b(26));
    }

    public final void I2(j33.m event) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j33.n;
        Continuation continuation = null;
        y yVar = this.f65200r;
        if (z) {
            if (!Intrinsics.f(((j33.n) event).f170951a, "NUMBERLESS_CARD_WIDGET_LIST_ID") || (bool = ((i) ((j2) yVar.f22677a).getValue()).f170942c) == null) {
                return;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (((i) ((j2) yVar.f22677a).getValue()).e) {
                H2(yVar, new q(zBooleanValue, 27));
                return;
            } else {
                l2(new af3.f(this, zBooleanValue, continuation, 22), new yi5.b(26));
                return;
            }
        }
        if (event instanceof j33.l) {
            if (Intrinsics.f(((j33.l) event).f170947a, "CARD_HOLDER_NAME_LIST_ID")) {
                l2(new p(this, continuation, 0), new yi5.b(26));
            }
        } else if (event instanceof m.b) {
            H2(yVar, new j1.e(16));
        } else if (event instanceof m.c) {
            C2(new j33.j(((i) ((j2) yVar.f22677a).getValue()).f170943g, ((i) ((j2) yVar.f22677a).getValue()).f170942c));
        } else {
            if (!(event instanceof m.a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65201s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f65200r;
    }
}
