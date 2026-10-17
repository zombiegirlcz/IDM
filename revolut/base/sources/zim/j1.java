package zim;

import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1$Getter;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public class j1 extends u1 implements wim.p {
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f322650p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l0 container, String name, String signature, Object obj2) {
        super(container, name, signature, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        yhm.k kVar = yhm.k.PUBLICATION;
        this.o = yhm.j.c(kVar, new h1(this, 0));
        this.f322650p = yhm.j.c(kVar, new h1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.p
    public final Object get(Object obj2) {
        return ((i1) this.o.getValue()).call(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.p
    public final Object getDelegate(Object obj2) {
        return r((Member) this.f322650p.getValue(), obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (i1) this.o.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return get(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u1
    public final r1 t() {
        return (i1) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty1$Getter getGetter() {
        return (i1) this.o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        yhm.k kVar = yhm.k.PUBLICATION;
        this.o = yhm.j.c(kVar, new h1(this, 0));
        this.f322650p = yhm.j.c(kVar, new h1(this, 1));
    }
}
