package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 {
    public static final List d;
    public static final g2 e;
    public static final g2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g2 f124803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g2 f124804h;
    public static final g2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g2 f124805j;
    public static final g2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g2 f124806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g2 f124807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k1 f124808n;
    public static final k1 o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f124809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f124811c;

    static {
        TreeMap treeMap = new TreeMap();
        for (e2 e2Var : e2.values()) {
            g2 g2Var = (g2) treeMap.put(Integer.valueOf(e2Var.c()), new g2(e2Var, null, null));
            if (g2Var != null) {
                throw new IllegalStateException("Code value duplication between " + g2Var.f124809a.name() + " & " + e2Var.name());
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        e = e2.OK.b();
        f = e2.CANCELLED.b();
        f124803g = e2.UNKNOWN.b();
        e2.INVALID_ARGUMENT.b();
        f124804h = e2.DEADLINE_EXCEEDED.b();
        e2.NOT_FOUND.b();
        e2.ALREADY_EXISTS.b();
        i = e2.PERMISSION_DENIED.b();
        e2.UNAUTHENTICATED.b();
        f124805j = e2.RESOURCE_EXHAUSTED.b();
        k = e2.FAILED_PRECONDITION.b();
        e2.ABORTED.b();
        e2.OUT_OF_RANGE.b();
        e2.UNIMPLEMENTED.b();
        f124806l = e2.INTERNAL.b();
        f124807m = e2.UNAVAILABLE.b();
        e2.DATA_LOSS.b();
        f124808n = new k1("grpc-status", false, new f2(1));
        o = new k1("grpc-message", false, new f2(0));
    }

    public g2(e2 e2Var, String str, Throwable th10) {
        this.f124809a = (e2) Preconditions.checkNotNull(e2Var, "code");
        this.f124810b = str;
        this.f124811c = th10;
    }

    public static String b(g2 g2Var) {
        String str = g2Var.f124810b;
        e2 e2Var = g2Var.f124809a;
        if (str == null) {
            return e2Var.toString();
        }
        return e2Var + ": " + g2Var.f124810b;
    }

    public static g2 c(int i2) {
        if (i2 >= 0) {
            List list = d;
            if (i2 < list.size()) {
                return (g2) list.get(i2);
            }
        }
        return f124803g.g("Unknown code " + i2);
    }

    public static g2 d(Throwable th10) {
        for (Throwable cause = (Throwable) Preconditions.checkNotNull(th10, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).f162991a;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).f162992a;
            }
        }
        return f124803g.f(th10);
    }

    public final g2 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th10 = this.f124811c;
        e2 e2Var = this.f124809a;
        String str2 = this.f124810b;
        return str2 == null ? new g2(e2Var, str, th10) : new g2(e2Var, com.google.android.gms.internal.mlkit_vision_face.a.o(str2, "\n", str), th10);
    }

    public final boolean e() {
        return e2.OK == this.f124809a;
    }

    public final g2 f(Throwable th10) {
        return Objects.equal(this.f124811c, th10) ? this : new g2(this.f124809a, this.f124810b, th10);
    }

    public final g2 g(String str) {
        return Objects.equal(this.f124810b, str) ? this : new g2(this.f124809a, str, this.f124811c);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("code", this.f124809a.name()).add("description", this.f124810b);
        Throwable th10 = this.f124811c;
        Object stackTraceAsString = th10;
        if (th10 != null) {
            stackTraceAsString = Throwables.getStackTraceAsString(th10);
        }
        return toStringHelperAdd.add("cause", stackTraceAsString).toString();
    }
}
