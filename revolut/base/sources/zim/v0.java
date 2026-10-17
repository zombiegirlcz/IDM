package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class v0 extends x1 implements wim.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f322714p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l0 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f322714p = yhm.j.c(yhm.k.PUBLICATION, new h0(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wim.k
    public final wim.d getSetter() {
        return (u0) this.f322714p.getValue();
    }
}
