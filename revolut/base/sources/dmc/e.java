package dmc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements knc.b, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmc.b f115933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f115935c = this;

    public e(r rVar, jmc.b bVar) {
        this.f115934b = rVar;
        this.f115933a = bVar;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // knc.b
    public final knc.a j() {
        return new a61.a(this.f115934b, this.f115935c, 10);
    }
}
