package qh8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import qgk.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f246540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f246541b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246542c;
    public final e4m.e d;

    public l(k kVar) {
        this.f246540a = kVar;
        int i = 25;
        this.f246542c = e4m.b.b(new p1(kVar, this, 0, i));
        this.d = e4m.b.b(new p1(kVar, this, 1, i));
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
