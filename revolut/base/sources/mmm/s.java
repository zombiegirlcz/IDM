package mmm;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class s implements Closeable {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f207307a;

    static {
        c0 c0Var;
        try {
            Class.forName("java.nio.file.Files");
            c0Var = new d0();
        } catch (ClassNotFoundException unused) {
            c0Var = new c0();
        }
        f207307a = c0Var;
        g0 g0Var = h0.Companion;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        g0.c(g0Var, property);
        ClassLoader classLoader = nmm.j.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new nmm.j(classLoader);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract q0 d(h0 h0Var);

    public final q0 f(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return d(file);
    }

    public abstract void g(h0 h0Var, h0 h0Var2);

    public final void h(h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        while (dir != null && !l(dir)) {
            arrayDeque.addFirst(dir);
            dir = dir.c();
        }
        Iterator<E> it8 = arrayDeque.iterator();
        while (it8.hasNext()) {
            i((h0) it8.next());
        }
    }

    public abstract void i(h0 h0Var);

    public abstract void j(h0 h0Var);

    public final void k(h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        j(path);
    }

    public final boolean l(h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return o(path) != null;
    }

    public abstract List m(h0 h0Var);

    public final eoi.e n(h0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        eoi.e eVarO = o(path);
        if (eVarO != null) {
            return eVarO;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract eoi.e o(h0 h0Var);

    public abstract b0 p(h0 h0Var);

    public abstract b0 q(h0 h0Var);

    public abstract q0 r(h0 h0Var);

    public final q0 s(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return r(file);
    }

    public abstract s0 t(h0 h0Var);
}
