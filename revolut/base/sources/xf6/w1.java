package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateResultScreenContract$InputData f305131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f305132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305133c;

    public w1(y1 y1Var, MandateResultScreenContract$InputData mandateResultScreenContract$InputData) {
        this.f305131a = mandateResultScreenContract$InputData;
        int i = 2;
        this.f305132b = e4m.b.b(new t1(y1Var, this, 1, i));
        this.f305133c = e4m.b.b(new t1(y1Var, this, 0, i));
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
