package com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow;

import d8l.d;
import jch.p;
import jdk.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wli.x;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements jdk.c {

    @NotNull
    public static final f Companion = new f();
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jdk.a f102564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gdk.a f102565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f102566r;

    public c(x deeplinkHandler, jdk.a bottomSheetFactory, gdk.a interactor) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(bottomSheetFactory, "bottomSheetFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = deeplinkHandler;
        this.f102564p = bottomSheetFactory;
        this.f102565q = interactor;
        this.f102566r = d.a(this, new p(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new jdk.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102566r;
    }
}
