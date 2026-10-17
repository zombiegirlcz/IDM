package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk7.p;
import org.jetbrains.annotations.NotNull;
import q5g.c0;
import q5g.m0;
import q5g.s;
import s5g.d;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    @NotNull
    private static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5g.c f93318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93319b;

    public c(s5g.c itemMapper, d paymentButtonMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(paymentButtonMapper, "paymentButtonMapper");
        this.f93318a = itemMapper;
        this.f93319b = paymentButtonMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        s domainState = (s) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "<this>");
        Data data = domainState.f;
        Data data2 = domainState.f242388c;
        if (data.getError() != null && data2.getContent() != null && !data2.getLoading()) {
            data2 = new Data(null, domainState.f.getError(), false, 5, null);
        }
        List listL = v.l(domainState.f242389g.getContent());
        return (c0) iii.c.f(data2, new q2j.j(5, this, listL), new er9.a(listL, 3), new p(domainState, 20, this, listL));
    }
}
