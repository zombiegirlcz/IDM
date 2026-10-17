package gfj;

import boh.f;
import dej.o3;
import gbi.c;
import gd8.j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nfj.a2;
import nfj.s2;
import w4l.k;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f143412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.a f143413b;

    public b(a2 esimSubscriptionsRepository, r10.a esimSubscriptionsOrderingInteractor) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsRepository, "esimSubscriptionsRepository");
        Intrinsics.checkNotNullParameter(esimSubscriptionsOrderingInteractor, "esimSubscriptionsOrderingInteractor");
        this.f143412a = esimSubscriptionsRepository;
        this.f143413b = esimSubscriptionsOrderingInteractor;
    }

    public final Flow a(k loadingStrategy, o3 orderType) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return f.e(nim.a.v(((s2) this.f143412a).i(loadingStrategy), new j(17)), new c(this, orderType, 14));
    }
}
