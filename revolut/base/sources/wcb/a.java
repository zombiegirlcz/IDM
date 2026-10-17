package wcb;

import com.google.common.collect.ImmutableSet;
import e4m.e;
import java.util.Set;
import vzc.j;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ycb.c f296381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f296382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f296383c = this;
    public final e d;
    public final e e;

    public a(c cVar, ycb.c cVar2) {
        this.f296382b = cVar;
        this.f296381a = cVar2;
        int i = 23;
        this.d = e4m.b.b(new j(cVar, this, 1, i));
        this.e = e4m.b.b(new j(cVar, this, 0, i));
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
