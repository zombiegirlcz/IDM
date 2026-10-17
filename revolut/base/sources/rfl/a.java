package rfl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import mfl.i;
import r7d.o;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f253904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f253905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253906c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f253907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f253908h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f253909j;
    public final e4m.e k;

    public a(b bVar, i iVar) {
        this.f253905b = bVar;
        this.f253904a = iVar;
        int i = 8;
        this.f253906c = e4m.b.b(new o(bVar, this, 1, i));
        this.d = new o(bVar, this, 3, i);
        this.e = new o(bVar, this, 4, i);
        this.f = new o(bVar, this, 5, i);
        this.f253907g = e4m.b.b(new o(bVar, this, 2, i));
        this.f253908h = new o(bVar, this, 7, i);
        this.i = new o(bVar, this, 8, i);
        this.f253909j = e4m.b.b(new o(bVar, this, 6, i));
        this.k = e4m.b.b(new o(bVar, this, 0, i));
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
