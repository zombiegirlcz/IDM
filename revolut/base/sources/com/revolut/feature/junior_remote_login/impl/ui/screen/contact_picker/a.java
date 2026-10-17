package com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker;

import bm8.b;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import wde.f;
import wl8.g;
import wl8.i;
import wl8.k;
import wl8.m;
import wl8.o;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {

    @NotNull
    public static final k Companion = new k();
    public final JuniorContactPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final am8.a f77218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f77219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f77220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f77221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f77222t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, JuniorContactPickerScreenContract$InputData inputData, am8.a juniorSearchContactsInteractor, b juniorSuggestedContactsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorSearchContactsInteractor, "juniorSearchContactsInteractor");
        Intrinsics.checkNotNullParameter(juniorSuggestedContactsInteractor, "juniorSuggestedContactsInteractor");
        this.o = inputData;
        this.f77218p = juniorSearchContactsInteractor;
        this.f77219q = juniorSuggestedContactsInteractor;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.f77220r = d.b(this, new g("", new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null), stateMapper, new o(), false, 8);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f77221s = q.c("");
        this.f77222t = new vii.b();
        this.u = e.a(this, new f(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(q.Q(this.f77222t, new wl8.l(0, this, continuation)), new wl8.l(1, this, continuation)), null, null, new m(0, this, null), 3);
        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = this.o;
        String juniorFirstName = juniorContactPickerScreenContract$InputData.f77211a;
        String juniorLastName = juniorContactPickerScreenContract$InputData.f77212b;
        b bVar = this.f77219q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(juniorLastName, "juniorLastName");
        am8.a aVar = bVar.f16767a;
        l.a1(this, rd0.e.n(nim.a.v(u0.m(aVar.a(juniorFirstName), aVar.a(juniorLastName)), new avj.o(juniorFirstName, juniorLastName, 2)), h0.f322473a), null, null, new m(1, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77220r;
    }
}
