package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public class g1 extends u1 implements wim.o {
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f322636p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        yhm.k kVar = yhm.k.PUBLICATION;
        this.o = yhm.j.c(kVar, new e1(this, 0));
        this.f322636p = yhm.j.c(kVar, new e1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.o
    public final Object get() {
        return ((f1) this.o.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.o
    public final Object getDelegate() {
        return this.f322636p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (f1) this.o.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u1
    public final r1 t() {
        return (f1) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final kotlin.reflect.a getGetter() {
        return (f1) this.o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l0 container, String name, String signature, Object obj2) {
        super(container, name, signature, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        yhm.k kVar = yhm.k.PUBLICATION;
        this.o = yhm.j.c(kVar, new e1(this, 0));
        this.f322636p = yhm.j.c(kVar, new e1(this, 1));
    }
}
