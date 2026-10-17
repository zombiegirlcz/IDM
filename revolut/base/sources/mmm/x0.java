package mmm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends s {

    @NotNull
    private static final w0 Companion = new w0();
    public static final h0 e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f207315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f207316c;
    public final LinkedHashMap d;

    static {
        h0.Companion.getClass();
        e = g0.a("/", false);
    }

    public x0(h0 zipPath, c0 fileSystem, LinkedHashMap entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f207315b = zipPath;
        this.f207316c = fileSystem;
        this.d = entries;
    }

    @Override // mmm.s
    public final q0 d(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // mmm.s
    public final void g(h0 source, h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // mmm.s
    public final void i(h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // mmm.s
    public final void j(h0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // mmm.s
    public final List m(h0 child) throws IOException {
        Intrinsics.checkNotNullParameter(child, "dir");
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        nmm.l lVar = (nmm.l) this.d.get(nmm.c.b(h0Var, child, true));
        if (lVar != null) {
            List listD1 = zhm.d0.d1(lVar.f217422q);
            Intrinsics.h(listD1);
            return listD1;
        }
        throw new IOException("not a directory: " + child);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    @Override // mmm.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eoi.e o(mmm.h0 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mmm.x0.o(mmm.h0):eoi.e");
    }

    @Override // mmm.s
    public final b0 p(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // mmm.s
    public final b0 q(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // mmm.s
    public final q0 r(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // mmm.s
    public final s0 t(h0 child) throws Throwable {
        Throwable th10;
        l0 l0VarC;
        Intrinsics.checkNotNullParameter(child, "file");
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        nmm.l lVar = (nmm.l) this.d.get(nmm.c.b(h0Var, child, true));
        if (lVar == null) {
            throw new FileNotFoundException("no such file: " + child);
        }
        long j2 = lVar.f;
        b0 b0VarP = this.f207316c.p(this.f207315b);
        try {
            l0VarC = u1.c(b0VarP.f(lVar.f217416h));
            try {
                b0VarP.close();
                th10 = null;
            } catch (Throwable th11) {
                th10 = th11;
            }
        } catch (Throwable th12) {
            if (b0VarP != null) {
                try {
                    b0VarP.close();
                } catch (Throwable th13) {
                    yhm.f.a(th12, th13);
                }
            }
            th10 = th12;
            l0VarC = null;
        }
        if (th10 != null) {
            throw th10;
        }
        Intrinsics.checkNotNullParameter(l0VarC, "<this>");
        nmm.o.h(l0VarC, null);
        return lVar.f217415g == 0 ? new nmm.g(l0VarC, j2, true) : new nmm.g(new a0(new nmm.g(l0VarC, lVar.e, true), new Inflater(true)), j2, false);
    }
}
