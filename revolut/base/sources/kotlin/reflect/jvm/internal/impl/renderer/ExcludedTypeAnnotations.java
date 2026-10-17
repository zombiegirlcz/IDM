package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ExcludedTypeAnnotations {

    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f187558a;

    static {
        FqName[] elements = {new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f187558a = d.y0(elements);
    }

    @NotNull
    public final Set<FqName> getInternalAnnotationsForResolve() {
        return f187558a;
    }
}
