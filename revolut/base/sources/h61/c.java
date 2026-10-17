package h61;

import cn0.g;
import kotlin.jvm.internal.Intrinsics;
import mm0.e;
import mm0.n;
import mm0.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d31.c f149584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.c f149585b;

    public c(d31.c threeDSRepository, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(threeDSRepository, "threeDSRepository");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f149584a = threeDSRepository;
        this.f149585b = sessionProvider;
    }

    public final e a() {
        o oVarD = ((g) this.f149585b).d();
        if (!(oVarD instanceof n)) {
            return null;
        }
        e eVar = ((n) oVarD).d;
        if (b.f149583a[eVar.ordinal()] == 1) {
            return null;
        }
        return eVar;
    }
}
