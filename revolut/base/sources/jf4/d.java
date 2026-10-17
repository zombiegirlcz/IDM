package jf4;

import cli.j;
import cli.n;
import cli.o;
import ff4.i;
import ff4.s;
import ieg.z;
import j7b.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff4.b f173651a;

    public d(ff4.b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f173651a = mapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f, new je5.n(this, 7), new m(this, 29), new z(this, domainState, 25));
    }
}
