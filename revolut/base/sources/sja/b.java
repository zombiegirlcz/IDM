package sja;

import com.google.common.collect.ImmutableSet;
import e4m.e;
import java.util.Set;
import oai.h;
import oai.r;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c, aog.b, tng.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f263701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f263702b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f263703c;
    public final e d;

    public b(a aVar) {
        this.f263701a = aVar;
        int i = 19;
        this.f263703c = e4m.b.b(new ryc.d(aVar, this, 0, i));
        this.d = e4m.b.b(new ryc.d(aVar, this, 1, i));
    }

    @Override // aog.b
    public final aog.a b() {
        return new r(this.f263701a, this.f263702b, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f263703c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tng.b
    public final tng.a q() {
        return new h(this.f263701a, this.f263702b, 1);
    }
}
