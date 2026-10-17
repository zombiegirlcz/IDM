package nv1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f219442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f219444c;
    public final e4m.e d;

    public r(g gVar, p pVar, MutableStateFlow mutableStateFlow) {
        this.f219443b = gVar;
        this.f219442a = mutableStateFlow;
        int i = 26;
        this.f219444c = e4m.b.b(new nk7.k(gVar, this, 1, i));
        this.d = e4m.b.b(new nk7.k(gVar, this, 0, i));
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
