package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n3 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAmountTypeScreenContract$InputData f176218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176220c;

    public n3(a3 a3Var, i0 i0Var, SelectAmountTypeScreenContract$InputData selectAmountTypeScreenContract$InputData) {
        this.f176218a = selectAmountTypeScreenContract$InputData;
        int i = 29;
        this.f176219b = e4m.b.b(new ix5.b(this, 1, i));
        this.f176220c = e4m.b.b(new ix5.b(this, 0, i));
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
