package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j7 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingPopupScreenContract$InputData f119050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119052c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119053g;

    public j7(c1 c1Var, BaseScreen baseScreen, WaitingPopupScreenContract$InputData waitingPopupScreenContract$InputData) {
        this.f119050a = waitingPopupScreenContract$InputData;
        this.f119051b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.f119052c = e4m.b.b(new g5(c1Var, this, 2, i));
        this.d = e4m.b.b(new g5(c1Var, this, 1, i));
        this.e = e4m.b.b(new g5(c1Var, this, 0, i));
        this.f = e4m.b.b(new g5(c1Var, this, 4, i));
        this.f119053g = e4m.b.b(new g5(c1Var, this, 3, i));
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
