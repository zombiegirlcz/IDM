package com.revolut.sso.impl.ui.consolidation;

import akl.y1;
import i69.p;
import iml.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements d {
    public final uil.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y1 f106485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kol.b f106486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f106487r;

    public b(uil.a accountsManager, y1 pictureFactory, kol.b welcomeMessageFactory) {
        Intrinsics.checkNotNullParameter(accountsManager, "accountsManager");
        Intrinsics.checkNotNullParameter(pictureFactory, "pictureFactory");
        Intrinsics.checkNotNullParameter(welcomeMessageFactory, "welcomeMessageFactory");
        this.o = accountsManager;
        this.f106485p = pictureFactory;
        this.f106486q = welcomeMessageFactory;
        this.f106487r = d8l.d.a(this, new p(this, 29));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106487r;
    }
}
