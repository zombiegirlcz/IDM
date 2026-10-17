package ix5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f169376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f169377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169378c;

    public i(d dVar, e eVar) {
        this.f169376a = dVar;
        this.f169377b = e4m.b.b(new il8.d(dVar, eVar, this, 1, 2));
        this.f169378c = e4m.b.b(new il8.d(dVar, eVar, this, 0, 2));
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
