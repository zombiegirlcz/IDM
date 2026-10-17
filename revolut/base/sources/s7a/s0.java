package s7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7a.d f260635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f260636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v7a.b f260637c;

    public s0(x7a.d interactor, x inputData, v7a.b errorMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        this.f260635a = interactor;
        this.f260636b = inputData;
        this.f260637c = errorMapper;
    }

    public final boolean a() {
        t tVar = this.f260636b.f260647a;
        if (tVar == null) {
            tVar = null;
        }
        if (tVar != null) {
            return tVar.f260640c;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r32) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7a.s0.c(cli.j):cli.o");
    }
}
