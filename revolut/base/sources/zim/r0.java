package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 extends j1 implements wim.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f322690q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l0 container, String name, String signature, Object obj2) {
        super(container, name, signature, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f322690q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.h
    public final void f(Object obj2, Object obj3) throws IllegalCallableAccessException {
        ((q0) this.f322690q.getValue()).call(obj2, obj3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.k
    public final wim.d getSetter() {
        return (q0) this.f322690q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.h, wim.k
    public final wim.g getSetter() {
        return (q0) this.f322690q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f322690q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 2));
    }
}
