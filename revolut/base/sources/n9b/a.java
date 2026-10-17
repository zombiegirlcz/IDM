package n9b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f213616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213618c;

    public a(c cVar) {
        this.f213616a = cVar;
        int i = 9;
        this.f213617b = e4m.b.b(new s(cVar, this, 1, i));
        this.f213618c = e4m.b.b(new s(cVar, this, 0, i));
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
