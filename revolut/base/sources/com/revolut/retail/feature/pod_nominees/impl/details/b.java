package com.revolut.retail.feature.pod_nominees.impl.details;

import cli.j;
import cli.n;
import cli.o;
import i6j.q;
import ieg.y;
import iek.e;
import iii.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (iek.j) c.f(domainState.f160753a, new id8.a(24), new y(3), new q(this, 7));
    }
}
