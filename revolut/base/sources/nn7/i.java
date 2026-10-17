package nn7;

import cli.j;
import cli.n;
import cli.o;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vim.d dVar = domainState.f217473a;
        vim.e eVarB = vim.i.b(ebm.a.D((LocalDate) dVar.getStart()), ebm.a.D((LocalDate) dVar.b()));
        vim.d dVar2 = domainState.f217474b;
        return new g(eVarB, vim.i.b(ebm.a.D((LocalDate) dVar2.getStart()), ebm.a.D((LocalDate) dVar2.b())), ebm.a.D(domainState.f217475c));
    }
}
