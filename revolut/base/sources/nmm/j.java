package nmm;

import ch.qos.logback.core.CoreConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import le.u1;
import mmm.b0;
import mmm.c0;
import mmm.g0;
import mmm.h0;
import mmm.q0;
import mmm.s;
import mmm.s0;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends s {

    @NotNull
    private static final i Companion = new i();
    public static final h0 e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f217409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f217410c;
    public final Lazy d;

    static {
        h0.Companion.getClass();
        e = g0.a("/", false);
    }

    public j(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        c0 systemFileSystem = s.f207307a;
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f217409b = classLoader;
        this.f217410c = systemFileSystem;
        this.d = yhm.j.b(new h(this, 0));
    }

    public static boolean u(l entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return i.a(Companion, entry.f217412a);
    }

    @Override // mmm.s
    public final q0 d(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // mmm.s
    public final void g(h0 source, h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // mmm.s
    public final void i(h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // mmm.s
    public final void j(h0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // mmm.s
    public final List m(h0 child) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(child, "dir");
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String strV = c.b(h0Var, child, true).d(h0Var).f207272a.v();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.d.getValue()) {
            s sVar = (s) pair.f186385a;
            h0 base = (h0) pair.f186386b;
            try {
                List listM = sVar.m(base.e(strV));
                ArrayList<h0> arrayList = new ArrayList();
                for (Object obj2 : listM) {
                    if (i.a(Companion, (h0) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (h0 h0Var2 : arrayList) {
                    Companion.getClass();
                    Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    arrayList2.add(h0Var.e(a0.E(d0.e0(h0Var2.f207272a.v(), base.f207272a.v()), CoreConstants.ESCAPE_CHAR, '/')));
                }
                zhm.a0.x(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return zhm.d0.d1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + child);
    }

    @Override // mmm.s
    public final eoi.e o(h0 child) {
        Intrinsics.checkNotNullParameter(child, "path");
        if (!i.a(Companion, child)) {
            return null;
        }
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String strV = c.b(h0Var, child, true).d(h0Var).f207272a.v();
        for (Pair pair : (List) this.d.getValue()) {
            eoi.e eVarO = ((s) pair.f186385a).o(((h0) pair.f186386b).e(strV));
            if (eVarO != null) {
                return eVarO;
            }
        }
        return null;
    }

    @Override // mmm.s
    public final b0 p(h0 child) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(child, "file");
        if (!i.a(Companion, child)) {
            throw new FileNotFoundException("file not found: " + child);
        }
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String strV = c.b(h0Var, child, true).d(h0Var).f207272a.v();
        for (Pair pair : (List) this.d.getValue()) {
            try {
                return ((s) pair.f186385a).p(((h0) pair.f186386b).e(strV));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + child);
    }

    @Override // mmm.s
    public final b0 q(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // mmm.s
    public final q0 r(h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // mmm.s
    public final s0 t(h0 child) throws IOException {
        Intrinsics.checkNotNullParameter(child, "file");
        if (!i.a(Companion, child)) {
            throw new FileNotFoundException("file not found: " + child);
        }
        h0 h0Var = e;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        URL resource = this.f217409b.getResource(c.b(h0Var, child, false).d(h0Var).f207272a.v());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + child);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return u1.r(inputStream);
    }
}
