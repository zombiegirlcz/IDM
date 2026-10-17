package pf2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f235422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f235423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.g f235424c;
    public final mf2.b d;

    public p(a12.j apmAreaMapper, f upiAreaMoreFromUpiItemsFactory, thf.g transactionsItemMapper, mf2.b upiAreaCounterpartiesBlockMapper) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(upiAreaMoreFromUpiItemsFactory, "upiAreaMoreFromUpiItemsFactory");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(upiAreaCounterpartiesBlockMapper, "upiAreaCounterpartiesBlockMapper");
        this.f235422a = apmAreaMapper;
        this.f235423b = upiAreaMoreFromUpiItemsFactory;
        this.f235424c = transactionsItemMapper;
        this.d = upiAreaCounterpartiesBlockMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(a12.j.a(this.f235422a, v.k(a.Scan, a.Send)));
        eVarB.addAll((List) iii.c.f(domainState.f235408a, new pd4.u(this, 19), new pch.f(11), new p40.n(this, 8)));
        return new e(u.a(eVarB));
    }
}
