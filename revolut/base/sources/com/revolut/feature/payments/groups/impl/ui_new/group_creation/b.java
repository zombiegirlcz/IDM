package com.revolut.feature.payments.groups.impl.ui_new.group_creation;

import cli.n;
import cli.y;
import e60.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import nk4.o;
import nt9.g;
import nt9.i;
import nt9.l;
import oki.h;
import vkm.j2;
import zhm.v;
import zs9.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements i {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f79482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l2j.a f79483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f01.a f79484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wr9.e f79485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vr9.a f79486t;
    public final n8b.a u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f79487w;

    public b(e interactor, e60.a mediaPickerControllerExtension, l2j.a currencyChooserFlowFactory, f01.a uiKitResources, wr9.e memberDialogMapper, vr9.a groupCreationCommonMapper, n stateMapper, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
        Intrinsics.checkNotNullParameter(groupCreationCommonMapper, "groupCreationCommonMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.o = interactor;
        this.f79482p = mediaPickerControllerExtension;
        this.f79483q = currencyChooserFlowFactory;
        this.f79484r = uiKitResources;
        this.f79485s = memberDialogMapper;
        this.f79486t = groupCreationCommonMapper;
        this.u = countryInteractor;
        this.v = hx7.e.a(this, new o(this, 17));
        m70.a.c(t0.f186434a);
        this.f79487w = d.b(this, new g(null, "", null, v.k(nt9.h.HOLIDAYS, nt9.h.HOME, nt9.h.PARTY, nt9.h.FAMILY), null, st9.b.DUMB, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (((g) ((j2) this.f79487w.f22677a).getValue()).e == null) {
            l2(new nt9.n(this, continuation, 1), new yi5.b(26));
        }
        l2(new l(this, null), new yi5.b(26));
        yji.l.a1(this, rd0.e.b(((s) this.f79482p).f122868g), null, null, new nt9.o(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f79487w;
    }
}
