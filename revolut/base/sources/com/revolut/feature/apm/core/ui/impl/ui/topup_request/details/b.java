package com.revolut.feature.apm.core.ui.impl.ui.topup_request.details;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l42.e;
import l42.j;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements e {

    @NotNull
    public static final j Companion = new j();
    public final ApmTopupRequestNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f62413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wz1.f f62414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gx1.e f62415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f62416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62417t;

    public b(ApmTopupRequestNavigation$InputData inputData, f userInteractor, wz1.f repository, gx1.e apmTopupRequestMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apmTopupRequestMapper, "apmTopupRequestMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62413p = userInteractor;
        this.f62414q = repository;
        this.f62415r = apmTopupRequestMapper;
        this.f62416s = d.b(this, new l42.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f62417t = hx7.e.a(this, new v(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b r18, java.lang.String r19, gim.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b.I2(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new l34.a(this, null, 5), new yi5.b(26));
    }

    public final l42.b J2() {
        Object content = ((l42.a) ((j2) this.f62416s.f22677a).getValue()).f192033a.getContent();
        if (content != null) {
            return (l42.b) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62417t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f62416s;
    }
}
