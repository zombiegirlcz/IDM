package twl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends iri.a implements c {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f275068b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f275069c = new te0.j();
    public final te0.j d = new te0.j();
    public final te0.j e = new te0.j();

    static {
        h0 h0Var = new h0(q.class, "cardId", "getCardId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(q.class, "skipIntro", "getSkipIntro()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(q.class, "suspiciousTransaction", "getSuspiciousTransaction()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(q.class, "transactionType", "getTransactionType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        w0().g(bundle);
    }

    @Override // iri.a
    public final void u0(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        w0().f(bundle);
    }

    public final te0.e w0() {
        return this.f275068b.getValue(this, f[0]);
    }
}
