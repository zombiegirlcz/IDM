package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118522a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPromptScreenContract$InputData f118523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118524c;
    public final e4m.e d;

    public c8(c1 c1Var, q1 q1Var, CreditPromptScreenContract$InputData creditPromptScreenContract$InputData) {
        this.f118523b = creditPromptScreenContract$InputData;
        int i = 19;
        this.f118524c = e4m.b.b(new s7(c1Var, q1Var, this, 1, i));
        this.d = e4m.b.b(new s7(c1Var, q1Var, this, 0, i));
    }

    public final r74.l b() {
        switch (this.f118522a) {
        }
        return (r74.l) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f118522a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f118522a) {
        }
        return ImmutableSet.of();
    }

    public c8(c1 c1Var, t4 t4Var, CreditPromptScreenContract$InputData creditPromptScreenContract$InputData) {
        this.f118523b = creditPromptScreenContract$InputData;
        int i = 18;
        this.f118524c = e4m.b.b(new s7(c1Var, t4Var, this, 1, i));
        this.d = e4m.b.b(new s7(c1Var, t4Var, this, 0, i));
    }
}
