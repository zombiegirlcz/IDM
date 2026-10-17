package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305155a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IbanScreenContract$InputData f305156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f305157c;
    public final e4m.e d;
    public final e4m.e e;

    public x0(t tVar, s sVar, IbanScreenContract$InputData ibanScreenContract$InputData) {
        this.f305157c = tVar;
        this.f305156b = ibanScreenContract$InputData;
        this.d = e4m.b.b(new a1(tVar, this, 1));
        this.e = e4m.b.b(new a1(tVar, this, 0));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f305155a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f305155a) {
        }
        return ImmutableSet.of();
    }

    public x0(t tVar, h0 h0Var, IbanScreenContract$InputData ibanScreenContract$InputData) {
        this.f305157c = tVar;
        this.f305156b = ibanScreenContract$InputData;
        int i = 28;
        this.d = e4m.b.b(new vy9.a(tVar, this, 1, i));
        this.e = e4m.b.b(new vy9.a(tVar, this, 0, i));
    }

    public x0(t tVar, q qVar, IbanScreenContract$InputData ibanScreenContract$InputData) {
        this.f305157c = tVar;
        this.f305156b = ibanScreenContract$InputData;
        int i = 29;
        this.d = e4m.b.b(new vy9.a(tVar, this, 1, i));
        this.e = e4m.b.b(new vy9.a(tVar, this, 0, i));
    }
}
