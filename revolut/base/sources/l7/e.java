package l7;

import g7.p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f192419b;

    public e(b bVar, b bVar2) {
        this.f192418a = bVar;
        this.f192419b = bVar2;
    }

    @Override // l7.g
    public final g7.e a() {
        return new p(this.f192418a.a(), this.f192419b.a());
    }

    @Override // l7.g
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // l7.g
    public final boolean isStatic() {
        return this.f192418a.isStatic() && this.f192419b.isStatic();
    }
}
