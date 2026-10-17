package kyk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f190946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f190947b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f190948c;
    public final e4m.e d;

    public i(v vVar) {
        this.f190946a = vVar;
        int i = 15;
        this.f190948c = e4m.b.b(new kr9.m(vVar, this, 1, i));
        this.d = e4m.b.b(new kr9.m(vVar, this, 0, i));
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
