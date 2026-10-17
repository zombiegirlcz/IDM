package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AttributesScreenContract$InputData f239156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f239157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f239158c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(g0 g0Var, AttributesScreenContract$InputData attributesScreenContract$InputData) {
        this.f239156a = attributesScreenContract$InputData;
        int i = 18;
        this.f239157b = e4m.b.b(new ppd.i0(g0Var, this, 1, i));
        this.f239158c = e4m.b.b(new ppd.i0(g0Var, this, 3, i));
        this.d = e4m.b.b(new ppd.i0(g0Var, this, 4, i));
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 2, i));
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 0, i));
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
