package com.revolut.sso.impl.ui.revolut_id;

import aj0.o;
import akl.b0;
import apl.f;
import bjl.o0;
import cjl.s;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step;
import d9.e1;
import gim.i;
import hx7.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import rqk.k;
import rqk.m;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements apl.b {
    public final b0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevolutIDFlowContract$InputData f106711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f106712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f106713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f106714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f106715t;
    public final d u;
    public final yki.a v;

    public c(b0 documentsRepository, RevolutIDFlowContract$InputData inputData, zja.a productArticleInteractor, o0 revolutSsoAuthErrorHandler, k revolutSsoDependenciesProvider, m userInfoFromAppProvider) {
        Intrinsics.checkNotNullParameter(documentsRepository, "documentsRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoAuthErrorHandler, "revolutSsoAuthErrorHandler");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        this.o = documentsRepository;
        this.f106711p = inputData;
        this.f106712q = productArticleInteractor;
        this.f106713r = revolutSsoAuthErrorHandler;
        this.f106714s = revolutSsoDependenciesProvider;
        this.f106715t = userInfoFromAppProvider;
        this.u = e.b(this, new RevolutIDFlowContract$State(0));
        anc.b bVar = new anc.b(this, 4);
        this.v = cp5.d.a(this, RevolutIDFlowContract$Step.RevolutIDMain.f106705a, f0.f322471a, bVar);
    }

    public static final Object I2(c cVar, i iVar) {
        Object objF0 = e1.f0(cVar, s.REGIONAL, cVar.f106713r, new f(cVar, null, 3), new a2g.a(cVar, 27), new o(28), iVar);
        return objF0 == fim.a.COROUTINE_SUSPENDED ? objF0 : Unit.f186387a;
    }

    @Override // qki.e
    public final d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
