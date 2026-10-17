package ak5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk5.j f5684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f5685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f5686c;

    public g(i iVar, tk5.j jVar) {
        this.f5684a = jVar;
        int i = 0;
        this.f5685b = e4m.b.b(new f(iVar, this, 1, i));
        this.f5686c = e4m.b.b(new f(iVar, this, 0, i));
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
