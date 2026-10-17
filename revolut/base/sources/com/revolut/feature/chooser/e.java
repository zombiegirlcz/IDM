package com.revolut.feature.chooser;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import te0.j;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends iri.a implements d {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f65916b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f65917c = new j();
    public final j d = new j();

    static {
        h0 h0Var = new h0(e.class, "configurationType", "getConfigurationType()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(e.class, "chooserList", "getChooserList()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "searchQuery", "getSearchQuery()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        f0().g(bundle);
        a0().g(bundle);
        j().g(bundle);
    }

    @Override // iri.a
    public final void u0(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.u0(bundle);
        f0().f(bundle);
        a0().f(bundle);
        j().f(bundle);
    }

    @Override // com.revolut.feature.chooser.d
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final te0.e a0() {
        return this.f65917c.getValue(this, e[1]);
    }

    @Override // com.revolut.feature.chooser.d
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final te0.e f0() {
        return this.f65916b.getValue(this, e[0]);
    }

    @Override // com.revolut.feature.chooser.d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final te0.e j() {
        return this.d.getValue(this, e[2]);
    }
}
