package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestCvvScreenContract$InputData f233662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233664c;

    public q(r rVar, RequestCvvScreenContract$InputData requestCvvScreenContract$InputData) {
        this.f233662a = requestCvvScreenContract$InputData;
        int i = 12;
        this.f233663b = e4m.b.b(new p12.s0(this, 1, i));
        this.f233664c = e4m.b.b(new p12.s0(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
