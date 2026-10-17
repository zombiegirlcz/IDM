package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview;

import cli.j;
import cli.n;
import cli.o;
import je6.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tvh.e;
import ud3.f0;
import uj6.k;
import uj6.l;
import uj6.r;
import uj6.v;
import uj6.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne6.b f72615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f72616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f72617c;

    public c(ne6.b detailsFactory, h institutionLogoMapper, l inputData) {
        Intrinsics.checkNotNullParameter(detailsFactory, "detailsFactory");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f72615a = detailsFactory;
        this.f72616b = institutionLogoMapper;
        this.f72617c = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f280495a, new v(this, 0), new f0(29), new e(this, domainState, 12));
    }
}
