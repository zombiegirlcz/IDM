package lv4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv4.k f200292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he2.b f200293b;

    public d0(sv4.k statementTransactionsMapper, he2.b creditCardSectionMapper, bp4.j creditCardStatementLocalizationProvider) {
        Intrinsics.checkNotNullParameter(statementTransactionsMapper, "statementTransactionsMapper");
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        Intrinsics.checkNotNullParameter(creditCardStatementLocalizationProvider, "creditCardStatementLocalizationProvider");
        this.f200292a = statementTransactionsMapper;
        this.f200293b = creditCardSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f200297a, new lu5.o(this, 8), new lnk.o(this, 18), new koe.y(this, domainState, 25));
    }
}
