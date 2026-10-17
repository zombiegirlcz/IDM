package com.revolut.feature.external_accounts.impl.mandate.create_mandate;

import a0.d;
import bh6.g;
import bh6.h;
import ch6.i;
import ch6.k;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.a;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh6.c f72450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f72451b;

    public c(bh6.c mandateDetailsMapper, h termsAndConditionsMapper) {
        Intrinsics.checkNotNullParameter(mandateDetailsMapper, "mandateDetailsMapper");
        Intrinsics.checkNotNullParameter(termsAndConditionsMapper, "termsAndConditionsMapper");
        this.f72450a = mandateDetailsMapper;
        this.f72451b = termsAndConditionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!(domainState instanceof i)) {
            if (!Intrinsics.f(domainState, a.C0482a.f72441a)) {
                throw new NoWhenBranchMatchedException();
            }
            IntRange intRange = new IntRange(1, 3, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new pb0(d.n("loading_", it8.nextInt())));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return new k(arrayList, true);
        }
        i iVar = (i) domainState;
        List listB = ((bh6.d) this.f72450a).b(iVar.f24129a, iVar.f24130b, iVar.f24131c, iVar.d, iVar.e, true);
        yp0.b.k(listB, 0, 0, 0, 0, 31);
        return new k(d0.F0(((bh6.i) this.f72451b).a(g.CREATE_SCREEN), listB), false);
    }
}
