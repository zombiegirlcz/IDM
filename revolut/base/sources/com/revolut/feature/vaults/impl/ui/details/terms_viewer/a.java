package com.revolut.feature.vaults.impl.ui.details.terms_viewer;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import jqg.i;
import jqg.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pre.c;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final VaultTermsViewerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f94757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f94758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f94759r;

    public a(VaultTermsViewerScreenContract$InputData inputData, c termsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f94757p = termsInteractor;
        this.f94758q = new vii.b();
        this.f94759r = d.b(this, new i(new Data(null, null, true, 3, null), false, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f94758q, new iw6.l(continuation, this, 24)), null, null, new jij.h(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f94759r;
    }
}
