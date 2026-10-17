package k3c;

import d3c.h0;
import d3c.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends tzl.l {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e3c.a f180684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e3c.a repository) {
        super(0);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f180684g = repository;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        h0 h0Var = (h0) obj3;
        return (h0Var != null ? h0Var.f111031b : null) != null;
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        return new i0(null);
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        h0 h0Var = (h0) obj3;
        if (h0Var != null) {
            return h0Var.f111031b;
        }
        return null;
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        i0 key = (i0) obj2;
        if (key == null) {
            return vkm.i.f290039a;
        }
        p pVar = (p) this.f180684g;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.f180683g.b(new f(key), loadingStrategy);
    }
}
