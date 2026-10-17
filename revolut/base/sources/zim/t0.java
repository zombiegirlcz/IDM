package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class t0 extends m1 implements wim.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f322700q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l0 container, String name, String signature) {
        super(container, name, signature);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f322700q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.k
    public final wim.d getSetter() {
        return (s0) this.f322700q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.j, wim.k
    public final wim.i getSetter() {
        return (s0) this.f322700q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f322700q = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 3));
    }
}
