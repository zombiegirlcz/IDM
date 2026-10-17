package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176027a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstalmentDetailsScreenContract$InputData f176028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f176029c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176030g;

    public c4(a3 a3Var, t1 t1Var, InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData) {
        this.f176029c = a3Var;
        this.f176028b = instalmentDetailsScreenContract$InputData;
        int i = 2;
        this.d = e4m.b.b(new z3(a3Var, this, 1, i));
        this.e = e4m.b.b(new z3(a3Var, this, 0, i));
        this.f = e4m.b.b(new z3(a3Var, this, 3, i));
        this.f176030g = e4m.b.b(new z3(a3Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f176027a) {
        }
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f176027a) {
        }
        return ImmutableSet.of();
    }

    public c4(a3 a3Var, InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData) {
        this.f176029c = a3Var;
        this.f176028b = instalmentDetailsScreenContract$InputData;
        int i = 3;
        this.d = e4m.b.b(new z3(a3Var, this, 1, i));
        this.e = e4m.b.b(new z3(a3Var, this, 0, i));
        this.f = e4m.b.b(new z3(a3Var, this, 3, i));
        this.f176030g = e4m.b.b(new z3(a3Var, this, 2, i));
    }
}
