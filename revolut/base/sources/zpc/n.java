package zpc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final erc.c f324275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f324276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f324277c;

    public n(k kVar, erc.c cVar) {
        this.f324275a = cVar;
        int i = 0;
        this.f324276b = e4m.b.b(new m(kVar, this, 1, i));
        this.f324277c = e4m.b.b(new m(kVar, this, 0, i));
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
