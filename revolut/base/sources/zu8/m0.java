package zu8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325318a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv8.e f325319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f325320c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public m0(c0 c0Var, q qVar, yv8.e eVar) {
        this.f325320c = c0Var;
        this.f325319b = eVar;
        int i = 23;
        this.d = e4m.b.b(new zpc.m(c0Var, this, 0, i));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f = e4m.b.b(new zpc.m(c0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f325318a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f325318a) {
        }
        return ImmutableSet.of();
    }

    public m0(c0 c0Var, s sVar, yv8.e eVar) {
        this.f325320c = c0Var;
        this.f325319b = eVar;
        int i = 22;
        this.d = e4m.b.b(new zpc.m(c0Var, this, 0, i));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f = e4m.b.b(new zpc.m(c0Var, this, 2, i));
    }
}
