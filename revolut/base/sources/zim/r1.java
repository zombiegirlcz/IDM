package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public abstract class r1 extends o1 implements KProperty.Getter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f322691j = {kotlin.jvm.internal.o0.f186429a.j(new kotlin.jvm.internal.h0(r1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f322692h = m70.a.n(null, new q1(this, 0));
    public final Object i = yhm.j.c(yhm.k.PUBLICATION, new q1(this, 1));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u
    public final ajm.i c() {
        return (ajm.i) this.i.getValue();
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof r1) && Intrinsics.f(r(), ((r1) obj2).r());
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return j6.a.u(new StringBuilder("<get-"), r().i, '>');
    }

    public final int hashCode() {
        return r().hashCode();
    }

    @Override // zim.u
    public final CallableMemberDescriptor j() {
        KProperty kProperty = f322691j[0];
        Object objInvoke = this.f322692h.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (PropertyGetterDescriptor) objInvoke;
    }

    @Override // zim.o1
    public final PropertyAccessorDescriptor q() {
        KProperty kProperty = f322691j[0];
        Object objInvoke = this.f322692h.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (PropertyGetterDescriptor) objInvoke;
    }

    public final String toString() {
        return "getter of " + r();
    }
}
