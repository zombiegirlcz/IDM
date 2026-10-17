package qn9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import ql6.s;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements jki.p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f247889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f247890b;

    public o(w80.b amountFormatter, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f247889a = amountFormatter;
        this.f247890b = languageProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.e, new s(this, 26), new qjj.g(this, 13), new z(this, domainState, 11));
    }
}
