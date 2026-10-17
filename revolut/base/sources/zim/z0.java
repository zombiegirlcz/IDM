package zim;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class z0 extends i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f322731g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f322732c;
    public final h2 d;
    public final Object e;
    public final Object f;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(z0.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f322731g = new KProperty[]{p0Var.j(h0Var), p.a.y(z0.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, p0Var), p.a.y(z0.class, "members", "getMembers()Ljava/util/Collection;", 0, p0Var)};
    }

    public z0(a1 a1Var) {
        super(a1Var);
        this.f322732c = m70.a.n(null, new w0(a1Var, 1));
        this.d = m70.a.n(null, new x0(this, 0));
        yhm.k kVar = yhm.k.PUBLICATION;
        this.e = yhm.j.c(kVar, new y0(this, a1Var));
        this.f = yhm.j.c(kVar, new x0(this, 1));
        m70.a.n(null, new y0(a1Var, this));
    }
}
