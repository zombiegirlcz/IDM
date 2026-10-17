package dd9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import dw3.c1;
import dw3.h1;
import dw3.s2;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements sk3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113121a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ESignOtpScreenContract$InputData f113122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f113123c;
    public final Object d;
    public final e4m.e e;
    public final e4m.e f;

    public b(e eVar, f fVar, ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData) {
        this.d = eVar;
        this.f113122b = eSignOtpScreenContract$InputData;
        int i = 1;
        this.e = new db1.f(eVar, this, 1, i);
        this.f = new db1.f(eVar, this, 2, i);
        this.f113123c = e4m.b.b(new db1.f(eVar, this, 0, i));
    }

    @Override // sk3.a
    public final rk3.j d() {
        switch (this.f113121a) {
        }
        return (rk3.j) this.f113123c.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f113121a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f113121a) {
        }
        return ImmutableSet.of();
    }

    public b(c1 c1Var, s2 s2Var, ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData) {
        this.d = c1Var;
        this.f113122b = eSignOtpScreenContract$InputData;
        int i = 19;
        this.e = new h1(c1Var, this, 1, i);
        this.f = new h1(c1Var, this, 2, i);
        this.f113123c = e4m.b.b(new h1(c1Var, this, 0, i));
    }
}
