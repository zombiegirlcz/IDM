package com.revolut.feature.kyc.impl.web_id.web_id_portal;

import cli.y;
import dii.g;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q9c.v;
import qm2.c;
import qwd.o;
import qx8.b;
import qx8.f;
import qx8.i;
import qx8.j;
import qx8.m;
import qx8.n;
import qx8.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements m {
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nx8.a f77896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yx8.a f77897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f77898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f77899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f77900t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(q stateMapper, y80.a permissionProvider, nx8.a uiContentProvider, yx8.a webKycControllerExtension, b redirectMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(uiContentProvider, "uiContentProvider");
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        this.o = permissionProvider;
        this.f77896p = uiContentProvider;
        this.f77897q = webKycControllerExtension;
        this.f77898r = redirectMapper;
        this.f77899s = vkm.q.b(1, 5, null);
        this.f77900t = d.b(this, new f(false, false), stateMapper, null, false, 12);
        this.u = e.a(this, new c(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        yx8.a aVar = this.f77897q;
        l.a1(this, aVar.c3(), null, null, new qg4.d(this, null, 27), 3);
        l.a1(this, aVar.d3(this.f77898r), null, null, new v(2, this, a.class, "onRedirect", "onRedirect(Ljava/lang/String;)V", 4, 5), 3);
    }

    public final void I2(g gVar) {
        if ((gVar instanceof dii.b) || (gVar instanceof dii.c) || (gVar instanceof dii.d)) {
            return;
        }
        if (gVar instanceof dii.e) {
            J2(i.f250038a);
        } else {
            if (!(gVar instanceof dii.f)) {
                throw new NoWhenBranchMatchedException();
            }
            J2(j.f250039a);
        }
    }

    public final void J2(qx8.l lVar) {
        this.f77899s.k(n.f250041a);
        C2(lVar);
        H2(this.f77900t, new o(23));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77900t;
    }
}
