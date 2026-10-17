package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sk3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignOtpScreenContract$InputData f244608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f244609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f244610c;
    public final k0 d;
    public final k0 e;
    public final e4m.e f;

    public a(c cVar, d dVar, ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData) {
        this.f244609b = cVar;
        this.f244610c = dVar;
        this.f244608a = eSignOtpScreenContract$InputData;
        int i = 15;
        this.d = new k0(cVar, this, 1, i);
        this.e = new k0(cVar, this, 2, i);
        this.f = e4m.b.b(new k0(cVar, this, 0, i));
    }

    @Override // sk3.a
    public final rk3.j d() {
        return (rk3.j) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f244610c.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
