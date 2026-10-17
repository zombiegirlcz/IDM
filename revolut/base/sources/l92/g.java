package l92;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.ha;
import tof.i7;
import tof.ka;
import tof.q7;
import tof.s5;
import tof.u9;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92.g f193028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f193029b;

    public g(f92.g repository, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f193028a = repository;
        this.f193029b = transactionsContentProvider;
    }

    public static q7 a() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new ka(s5.MULTIBANCO), new ha(), new u9(false)};
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }
}
