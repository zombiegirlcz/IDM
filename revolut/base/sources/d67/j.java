package d67;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f111460a;

    public j(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f111460a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(zhm.u.c(this.f111460a.getZ()));
    }
}
