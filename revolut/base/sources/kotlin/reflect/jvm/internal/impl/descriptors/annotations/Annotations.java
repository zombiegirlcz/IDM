package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import pim.a;

/* JADX INFO: loaded from: classes13.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, a {

    @NotNull
    public static final Companion Companion = Companion.f186553a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f186553a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Annotations$Companion$EMPTY$1 f186554b = new Annotations$Companion$EMPTY$1();

        @NotNull
        public final Annotations create(@NotNull List<? extends AnnotationDescriptor> annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? f186554b : new AnnotationsImpl(annotations);
        }

        @NotNull
        public final Annotations getEMPTY() {
            return f186554b;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(@NotNull Annotations annotations, @NotNull FqName fqName) {
            AnnotationDescriptor next;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<AnnotationDescriptor> it8 = annotations.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(next.getFqName(), fqName)) {
                    break;
                }
            }
            return next;
        }

        public static boolean hasAnnotation(@NotNull Annotations annotations, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return annotations.mo3787findAnnotation(fqName) != null;
        }
    }

    /* JADX INFO: renamed from: findAnnotation */
    AnnotationDescriptor mo3787findAnnotation(@NotNull FqName fqName);

    boolean hasAnnotation(@NotNull FqName fqName);

    boolean isEmpty();
}
