package qh8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f246543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f246544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246545c;

    public m(k kVar, l lVar) {
        this.f246543a = kVar;
        this.f246544b = lVar;
        this.f246545c = e4m.b.b(new qbj.w(kVar, this, 16));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246544b.d.get());
    }
}
