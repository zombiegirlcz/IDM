package gp9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq9.g f145351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f145352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f145353c;
    public final e4m.e d;

    public c(d dVar, cq9.g gVar) {
        this.f145352b = dVar;
        this.f145351a = gVar;
        this.f145353c = e4m.b.b(new gff.a(dVar, this, 1));
        this.d = e4m.b.b(new gff.a(dVar, this, 0));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f145352b.f145357g.n();
        s.j(languageProvider);
        dq9.b.Companion.getClass();
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
