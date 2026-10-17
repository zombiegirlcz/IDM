package vq7;

import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vo8.t;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f291357a;

    public l(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f291357a = languageProvider;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f291349a, new vq0.g(9), new t(12), new vjh.c(this, 6)));
    }
}
