package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details;

import cli.j;
import cli.n;
import cli.o;
import iii.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox2.d;
import pb2.v;
import pdg.k0;
import pdg.m;
import pdg.z;
import rdg.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f93987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rdg.a f93988b;

    public b(f itemMapper, rdg.a sleepsSectionMapper, pdg.b menuItemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(sleepsSectionMapper, "sleepsSectionMapper");
        Intrinsics.checkNotNullParameter(menuItemMapper, "menuItemMapper");
        this.f93987a = itemMapper;
        this.f93988b = sleepsSectionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (z) c.f(domainState.f235202b, new v(8, domainState, this), new p5f.c(this, 13), new d(this, domainState, 9));
    }
}
