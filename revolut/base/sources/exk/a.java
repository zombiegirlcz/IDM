package exk;

import com.google.common.collect.ImmutableSet;
import ea2.p;
import java.util.Set;
import kxk.g;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f130452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130454c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(c cVar, g gVar) {
        this.f130452a = gVar;
        int i = 20;
        this.f130453b = e4m.b.b(new p(cVar, this, 2, i));
        this.f130454c = e4m.b.b(new p(cVar, this, 4, i));
        this.d = e4m.b.b(new p(cVar, this, 3, i));
        this.e = e4m.b.b(new p(cVar, this, 1, i));
        this.f = e4m.b.b(new p(cVar, this, 0, i));
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
