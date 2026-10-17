package mmm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f207308b;

    public t(s delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f207308b = delegate;
    }

    public static void u(h0 path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // mmm.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f207308b.close();
    }

    @Override // mmm.s
    public q0 d(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        u(file, "appendingSink", "file");
        return this.f207308b.d(file);
    }

    @Override // mmm.s
    public final void g(h0 source, h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        u(source, "atomicMove", "source");
        u(target, "atomicMove", "target");
        this.f207308b.g(source, target);
    }

    @Override // mmm.s
    public final void i(h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        u(dir, "createDirectory", "dir");
        this.f207308b.i(dir);
    }

    @Override // mmm.s
    public final void j(h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        u(path, "delete", "path");
        this.f207308b.j(path);
    }

    @Override // mmm.s
    public final List m(h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        u(dir, "list", "dir");
        List<h0> listM = this.f207308b.m(dir);
        ArrayList arrayList = new ArrayList();
        for (h0 path : listM) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        zhm.z.v(arrayList);
        return arrayList;
    }

    @Override // mmm.s
    public final eoi.e o(h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        u(path, "metadataOrNull", "path");
        eoi.e eVarO = this.f207308b.o(path);
        if (eVarO == null) {
            return null;
        }
        h0 path2 = (h0) eVarO.d;
        if (path2 == null) {
            return eVarO;
        }
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
        boolean z = eVarO.f127931b;
        boolean z3 = eVarO.f127932c;
        Long l2 = (Long) eVarO.e;
        Long l3 = (Long) eVarO.f;
        Long l4 = (Long) eVarO.f127933g;
        Long l5 = (Long) eVarO.f127934h;
        Map extras = (Map) eVarO.i;
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new eoi.e(z, z3, path2, l2, l3, l4, l5, extras);
    }

    @Override // mmm.s
    public final b0 p(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        u(file, "openReadOnly", "file");
        return this.f207308b.p(file);
    }

    @Override // mmm.s
    public final b0 q(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        u(file, "openReadWrite", "file");
        return this.f207308b.q(file);
    }

    @Override // mmm.s
    public q0 r(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        u(file, "sink", "file");
        return this.f207308b.r(file);
    }

    @Override // mmm.s
    public s0 t(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        u(file, "source", "file");
        return this.f207308b.t(file);
    }

    public final String toString() {
        return kotlin.jvm.internal.o0.f186429a.b(getClass()).m() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f207308b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
