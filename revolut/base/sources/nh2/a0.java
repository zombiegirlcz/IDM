package nh2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f215271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f215272c;
    public final e4m.e d;

    public a0(o oVar, s sVar) {
        this.f215270a = oVar;
        this.f215271b = sVar;
        this.f215272c = e4m.b.b(new ned.h(oVar, sVar, this, 1, 4));
        this.d = e4m.b.b(new ned.h(oVar, sVar, this, 0, 4));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
