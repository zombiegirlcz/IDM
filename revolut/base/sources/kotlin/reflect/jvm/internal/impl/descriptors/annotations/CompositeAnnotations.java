package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import djm.g;
import ejm.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import nkm.i;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186559a;

    public CompositeAnnotations(@NotNull List<? extends Annotations> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f186559a = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo3787findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (AnnotationDescriptor) y.r(y.z(d0.Q(this.f186559a), new g(fqName, 1)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it8 = ((Iterable) d0.Q(this.f186559a).f195577b).iterator();
        while (it8.hasNext()) {
            if (((Annotations) it8.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List list = this.f186559a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (!((Annotations) it8.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return new i(y.s(d0.Q(this.f186559a), a.f126915a));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... delegates) {
        this((List<? extends Annotations>) d.v0(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
