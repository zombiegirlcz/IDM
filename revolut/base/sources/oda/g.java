package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedAccountDetailsScreenContract$InputData f224358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f224359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224360c;
    public final e4m.e d;
    public final e4m.e e;

    public g(o oVar, l lVar, ViewController viewController, LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData) {
        this.f224359b = oVar;
        this.f224358a = linkedAccountDetailsScreenContract$InputData;
        this.f224360c = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.d = e4m.b.b(new ned.h(oVar, lVar, this, 1, i));
        this.e = e4m.b.b(new ned.h(oVar, lVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
