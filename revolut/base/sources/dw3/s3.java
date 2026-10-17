package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s3 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KontomatikPopupScreenContract$InputData f119745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119747c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119748g;

    public s3(c1 c1Var, r3 r3Var, BaseScreen baseScreen, KontomatikPopupScreenContract$InputData kontomatikPopupScreenContract$InputData) {
        this.f119745a = kontomatikPopupScreenContract$InputData;
        this.f119746b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 28;
        this.f119747c = e4m.b.b(new cbb.b(this, 2, i));
        this.d = e4m.b.b(new cbb.b(this, 1, i));
        this.e = e4m.b.b(new cbb.b(this, 0, i));
        this.f = e4m.b.b(new cbb.b(this, 4, i));
        this.f119748g = e4m.b.b(new cbb.b(this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
