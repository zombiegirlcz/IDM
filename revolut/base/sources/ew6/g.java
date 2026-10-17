package ew6;

import et6.p1;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f130102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f130103q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p1 freelancerInvoiceInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f130102p = freelancerInvoiceInteractor;
        this.f130103q = new d(null, null, false);
    }

    @Override // jki.g
    public final i r2() {
        return this.f130103q;
    }
}
