package amh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f6396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6397b;

    public e(q1 wealthDisclaimersContractMapper, f input) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersContractMapper, "wealthDisclaimersContractMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f6396a = wealthDisclaimersContractMapper;
        this.f6397b = input;
    }

    public static ybl.n a(String str) throws Throwable {
        if (Intrinsics.f(str, "TAB_ID_PDF")) {
            return ybl.n.PDF;
        }
        if (Intrinsics.f(str, "TAB_ID_EXCEL")) {
            return ybl.n.EXCEL;
        }
        hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown selected tab: ", str)));
        return ybl.n.PDF;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: amh.e.c(cli.j):cli.o");
    }
}
