package gfj;

import boh.f;
import dej.o3;
import gbi.c;
import gd8.j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nfj.a2;
import nfj.s2;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f143410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.a f143411b;

    public a(a2 esimSubscriptionsRepository, r10.a esimSubscriptionsOrderingInteractor) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsRepository, "esimSubscriptionsRepository");
        Intrinsics.checkNotNullParameter(esimSubscriptionsOrderingInteractor, "esimSubscriptionsOrderingInteractor");
        this.f143410a = esimSubscriptionsRepository;
        this.f143411b = esimSubscriptionsOrderingInteractor;
    }

    public static Flow a(a aVar, o3 orderType, int i) {
        if ((i & 2) != 0) {
            orderType = o3.PRIORITY_RANK;
        }
        aVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return f.e(nim.a.v(((s2) aVar.f143410a).i(loadingStrategy), new j(16)), new c(aVar, orderType, 13));
    }
}
