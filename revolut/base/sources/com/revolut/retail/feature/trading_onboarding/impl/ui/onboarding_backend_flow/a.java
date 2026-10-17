package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import efm.d0;
import gwe.d;
import h0l.e;
import h0l.g;
import h0l.h;
import java.io.File;
import kl.b0;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;
import te0.s;
import ufm.i;
import wl2.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f104230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f104231b;

    public a(b0 interactor, e state) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f104230a = interactor;
        this.f104231b = state;
    }

    @Override // wl2.f
    public final d0 a(BackendFlow answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        d0 d0VarFirstOrError = ((h) this.f104231b).w0().c(s.f270018a).firstOrError();
        g gVar = new g(new gvi.s(this, answers, 10), 1);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // wl2.f
    public final d0 b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        ufm.c cVarL = d0.l(new NotImplementedError(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }

    @Override // wl2.f
    public final d0 k() {
        d0 d0VarFirstOrError = ((h) this.f104231b).w0().c(s.f270018a).firstOrError();
        g gVar = new g(new d(this, 13), 0);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // wl2.f
    public final efm.b removeFile(String id10, String remoteId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(remoteId, "remoteId");
        n nVarN = efm.b.n(new NotImplementedError(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
        return nVarN;
    }
}
