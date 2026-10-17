package u8b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import u45.w0;
import xki.e;
import z8b.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f278151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f278152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f278153c;

    public b(a aVar, h hVar) {
        this.f278151a = hVar;
        int i = 7;
        this.f278152b = e4m.b.b(new w0(aVar, this, 1, i));
        this.f278153c = e4m.b.b(new w0(aVar, this, 0, i));
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
