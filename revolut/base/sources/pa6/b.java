package pa6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xki.c, jb6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f234348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f234349b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234350c;
    public final e4m.e d;

    public b(m mVar) {
        this.f234348a = mVar;
        this.f234350c = e4m.b.b(new p8a.m(mVar, this, 1, 27));
        this.d = e4m.b.b(new p8a.m(mVar, this, 0, 27));
    }

    @Override // jb6.a
    public final r b() {
        return new r(this.f234348a, this.f234349b, 1);
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
