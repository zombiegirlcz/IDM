package ne0;

import efm.c0;
import efm.r;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f214390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f214391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f214392c;

    public k(Function1 load, c0 c0Var) {
        Intrinsics.checkNotNullParameter(load, "load");
        this.f214390a = load;
        this.f214391b = c0Var;
        this.f214392c = new HashMap();
    }

    public final r a(Object obj2) {
        r rVarDefer = r.defer(new t(this, obj2, 8));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Function1 load) {
        this(load, hhm.f.f152431c);
        Intrinsics.checkNotNullParameter(load, "load");
    }
}
