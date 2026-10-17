package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f245949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f245950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f245951c;
    public final e4m.e d;

    public f0(i0 i0Var, x xVar) {
        this.f245949a = xVar;
        int i = 9;
        this.f245950b = e4m.b.b(new m(i0Var, this, 2, i));
        this.f245951c = e4m.b.b(new m(i0Var, this, 1, i));
        this.d = e4m.b.b(new m(i0Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f245949a.f246318m.get());
    }
}
