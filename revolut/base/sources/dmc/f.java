package dmc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final anc.f f115940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115941b;

    public f(r rVar, anc.f fVar) {
        this.f115941b = rVar;
        this.f115940a = fVar;
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f115941b.f116031h.n();
        vc.s.j(languageProvider);
        bnc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
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
