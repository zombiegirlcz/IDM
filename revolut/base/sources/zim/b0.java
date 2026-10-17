package zim;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 extends i0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f322590r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f322591c;
    public final h2 d;
    public final h2 e;
    public final h2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h2 f322592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f322593h;
    public final h2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2 f322594j;
    public final h2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h2 f322595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h2 f322596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h2 f322597n;
    public final h2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h2 f322598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h2 f322599q;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(b0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f322590r = new KProperty[]{p0Var.j(h0Var), p.a.y(b0.class, "annotations", "getAnnotations()Ljava/util/List;", 0, p0Var), p.a.y(b0.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, p0Var), p.a.y(b0.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, p0Var), p.a.y(b0.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, p0Var), p.a.y(b0.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, p0Var), p.a.y(b0.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, p0Var), p.a.y(b0.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, p0Var), p.a.y(b0.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, p0Var)};
    }

    public b0(e0 e0Var) {
        super(e0Var);
        yhm.k kVar = yhm.k.PUBLICATION;
        this.f322591c = yhm.j.c(kVar, new y(this, 0));
        this.d = m70.a.n(null, new v(e0Var, 5));
        m70.a.n(null, new v(e0Var, 6));
        this.e = m70.a.n(null, new v(e0Var, this));
        this.f = m70.a.n(null, new v(e0Var, 8));
        this.f322592g = m70.a.n(null, new v(e0Var, 9));
        m70.a.n(null, new z(this, e0Var, 1));
        this.f322593h = yhm.j.c(kVar, new z(this, e0Var, 2));
        this.i = m70.a.n(null, new z(this, e0Var, 3));
        this.f322594j = m70.a.n(null, new z(this, e0Var, 4));
        this.k = m70.a.n(null, new z(e0Var, this));
        this.f322595l = m70.a.n(null, new v(e0Var, 1));
        this.f322596m = m70.a.n(null, new v(e0Var, 2));
        this.f322597n = m70.a.n(null, new v(e0Var, 3));
        this.o = m70.a.n(null, new v(e0Var, 4));
        this.f322598p = m70.a.n(null, new y(this, 1));
        this.f322599q = m70.a.n(null, new y(this, 2));
        m70.a.n(null, new y(this, 3));
        m70.a.n(null, new y(this, 4));
    }

    public final Collection a() {
        KProperty kProperty = f322590r[9];
        Object objInvoke = this.f322595l.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    public final ClassDescriptor b() {
        KProperty kProperty = f322590r[0];
        Object objInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (ClassDescriptor) objInvoke;
    }
}
