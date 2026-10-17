package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotations f186560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f186562c;

    public FilteredAnnotations(@NotNull Annotations delegate, boolean z, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f186560a = delegate;
        this.f186561b = z;
        this.f186562c = fqNameFilter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo3787findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f186562c.invoke(fqName)).booleanValue()) {
            return this.f186560a.mo3787findAnnotation(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f186562c.invoke(fqName)).booleanValue()) {
            return this.f186560a.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z;
        Annotations annotations = this.f186560a;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            z = false;
        } else {
            Iterator<AnnotationDescriptor> it8 = annotations.iterator();
            while (it8.hasNext()) {
                FqName fqName = it8.next().getFqName();
                if (fqName != null && ((Boolean) this.f186562c.invoke(fqName)).booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return this.f186561b ? !z : z;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.f186560a) {
            FqName fqName = annotationDescriptor.getFqName();
            if (fqName != null && ((Boolean) this.f186562c.invoke(fqName)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(@NotNull Annotations delegate, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }
}
