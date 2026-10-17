package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t1 extends o1 implements wim.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f322701j = {kotlin.jvm.internal.o0.f186429a.j(new kotlin.jvm.internal.h0(t1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f322702h = m70.a.n(null, new s1(this, 0));
    public final Object i = yhm.j.c(yhm.k.PUBLICATION, new s1(this, 1));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u
    public final ajm.i c() {
        return (ajm.i) this.i.getValue();
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof t1) && Intrinsics.f(r(), ((t1) obj2).r());
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return j6.a.u(new StringBuilder("<set-"), r().i, '>');
    }

    public final int hashCode() {
        return r().hashCode();
    }

    @Override // zim.u
    public final CallableMemberDescriptor j() {
        KProperty kProperty = f322701j[0];
        Object objInvoke = this.f322702h.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (PropertySetterDescriptor) objInvoke;
    }

    @Override // zim.o1
    public final PropertyAccessorDescriptor q() {
        KProperty kProperty = f322701j[0];
        Object objInvoke = this.f322702h.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (PropertySetterDescriptor) objInvoke;
    }

    public final String toString() {
        return "setter of " + r();
    }
}
