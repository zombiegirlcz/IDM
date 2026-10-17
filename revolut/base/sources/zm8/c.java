package zm8;

import com.google.common.collect.ImmutableSet;
import en8.f;
import java.util.Set;
import xki.e;
import z0g.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f323397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f323398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323399c;

    public c(b bVar, f fVar) {
        this.f323397a = fVar;
        int i = 19;
        this.f323398b = e4m.b.b(new k0(bVar, this, 1, i));
        this.f323399c = e4m.b.b(new k0(bVar, this, 0, i));
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
