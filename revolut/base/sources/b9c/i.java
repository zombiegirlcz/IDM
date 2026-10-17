package b9c;

import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f13708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f13709b;

    public i(w80.b amountFormatter, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f13708a = amountFormatter;
        this.f13709b = languageProvider;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.e, new b96.a(this, 2), new b6d.a(this), new b1c.p(this, domainState, 6));
    }
}
