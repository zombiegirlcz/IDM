package com.revolut.retail.feature.payments.payment_links.impl.ui.details;

import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l7k.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r70.c;
import u7k.f0;
import u7k.g;
import u7k.j0;
import u7k.k;
import u7k.l;
import u7k.p;
import u7k.w;
import u7k.x;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements g {

    @NotNull
    public static final x Companion = new x();
    public final w7k.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f102187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f102188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f102189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f102190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f102191t;
    public final j0 u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f102192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f102193x;

    public b(w7k.b cancelExtension, c70.a clipboard, c hapticEngine, d shareDialogProvider, p stateMapper, l paymentLinkDetailsDialogInputDataProvider, k paymentLinkDetailsDelegate, j0 paymentLinkDetailsStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(cancelExtension, "cancelExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(shareDialogProvider, "shareDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsDialogInputDataProvider, "paymentLinkDetailsDialogInputDataProvider");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsDelegate, "paymentLinkDetailsDelegate");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsStatusDialogFactory, "paymentLinkDetailsStatusDialogFactory");
        this.o = cancelExtension;
        this.f102187p = clipboard;
        this.f102188q = hapticEngine;
        this.f102189r = shareDialogProvider;
        this.f102190s = paymentLinkDetailsDialogInputDataProvider;
        this.f102191t = paymentLinkDetailsDelegate;
        this.u = paymentLinkDetailsStatusDialogFactory;
        this.v = mra.d.b(this, new u7k.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f102192w = e.a(this, new w(this, 0));
        this.f102193x = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.f102193x, new tik.b((Continuation) null, this, 25)), null, null, new f0(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f102192w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
