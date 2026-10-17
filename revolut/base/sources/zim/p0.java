package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class p0 extends g1 implements wim.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f322681q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f322681q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.k
    public final wim.d getSetter() {
        return (o0) this.f322681q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.f, wim.k
    public final wim.e getSetter() {
        return (o0) this.f322681q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0 container, String name, String signature, Object obj2) {
        super(container, name, signature, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f322681q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 1));
    }
}
