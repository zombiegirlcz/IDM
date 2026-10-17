package sg8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f262600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f262601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f262602c;

    public a(c cVar) {
        this.f262600a = cVar;
        int i = 13;
        this.f262601b = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.f262602c = e4m.b.b(new ryc.d(cVar, this, 0, i));
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
