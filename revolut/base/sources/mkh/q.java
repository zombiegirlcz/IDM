package mkh;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206396c;

    public q(s sVar, List list) {
        this.f206394a = list;
        int i = 12;
        this.f206395b = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.f206396c = e4m.b.b(new mjl.b(sVar, this, 0, i));
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
