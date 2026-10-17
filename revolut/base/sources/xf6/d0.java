package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements xki.c, ao6.a, co6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f304816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f304817b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304818c;

    public d0(t tVar) {
        this.f304816a = tVar;
        this.f304818c = e4m.b.b(new h(tVar, 1));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // co6.a
    public final d1 j() {
        return new d1(this.f304816a, this.f304817b, 0);
    }

    @Override // ao6.a
    public final b1 q() {
        return new b1(this.f304816a, this.f304817b, 0);
    }
}
