package zxb;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f326138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f326139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326140c;

    public e0(e eVar) {
        this.f326138a = eVar;
        int i = 4;
        this.f326139b = e4m.b.b(new s(eVar, this, 1, i));
        this.f326140c = e4m.b.b(new s(eVar, this, 0, i));
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
